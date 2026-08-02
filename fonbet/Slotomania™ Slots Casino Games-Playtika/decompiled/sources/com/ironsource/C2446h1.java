package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2446h1 {
    public static final a b = new a(null);
    private static final int c = -1;
    private final C2534m0 a;

    /* renamed from: com.ironsource.h1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.ironsource.h1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((LevelPlayAdSize) t2).getWidth()), Integer.valueOf(((LevelPlayAdSize) t).getWidth()));
        }
    }

    /* renamed from: com.ironsource.h1$c */
    public static final class c<T> implements Comparator {
        final /* synthetic */ Comparator a;

        public c(Comparator comparator) {
            this.a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.a.compare(t, t2);
            return compare != 0 ? compare : ComparisonsKt.compareValues(Integer.valueOf(((LevelPlayAdSize) t2).getHeight()), Integer.valueOf(((LevelPlayAdSize) t).getHeight()));
        }
    }

    public C2446h1(C2534m0 adSizeTools) {
        Intrinsics.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.a = adSizeTools;
    }

    public final LevelPlayAdSize a(Context context, Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.a.d()) {
            IronLog.API.error(C2534m0.a(this.a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer b2 = this.a.b(context);
        if (b2 == null) {
            IronLog.API.error(C2534m0.a(this.a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
            return null;
        }
        int intValue = b2.intValue();
        int a2 = a(num, context);
        int a3 = this.a.a(a2);
        List<LevelPlayAdSize> a4 = a();
        for (LevelPlayAdSize levelPlayAdSize : a(a4, intValue, a2)) {
            if (levelPlayAdSize.getWidth() <= a2 && (levelPlayAdSize.getHeight() <= a3 || a3 == -1)) {
                a3 = Math.max(a3, levelPlayAdSize.getHeight());
                break;
            }
        }
        levelPlayAdSize = null;
        if (levelPlayAdSize == null) {
            a3 = ((LevelPlayAdSize) CollectionsKt.last((List) a4)).getHeight();
            levelPlayAdSize = LevelPlayAdSize.Companion.createCustomSize(a2, a3);
        }
        int i = a3;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        IronLog.INTERNAL.info(C2534m0.a(this.a, "Adaptive: " + a2 + "x" + i + " Fallback: " + levelPlayAdSize2, (String) null, 2, (Object) null));
        return new LevelPlayAdSize(a2, i, "CUSTOM", true, levelPlayAdSize2);
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C2534m0.a(this.a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
            return Z4.a.b(context);
        }
        if (num == null) {
            return Z4.a.b(context);
        }
        return num.intValue();
    }

    private final List<LevelPlayAdSize> a() {
        return CollectionsKt.sortedWith(this.a.b(), new c(new b()));
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i && levelPlayAdSize.getWidth() <= i2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
