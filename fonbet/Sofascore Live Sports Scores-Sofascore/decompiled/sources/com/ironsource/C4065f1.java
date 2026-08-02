package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4065f1 {

    @NotNull
    public static final a b = new a(null);
    private static final int c = -1;

    @NotNull
    private final C4189m0 a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((LevelPlayAdSize) t2).getWidth()).compareTo(Integer.valueOf(((LevelPlayAdSize) t).getWidth()));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f1$c */
    public static final class c<T> implements Comparator {
        final /* synthetic */ Comparator a;

        public c(Comparator comparator) {
            this.a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.a.compare(t, t2);
            return compare != 0 ? compare : Integer.valueOf(((LevelPlayAdSize) t2).getHeight()).compareTo(Integer.valueOf(((LevelPlayAdSize) t).getHeight()));
        }
    }

    public C4065f1(@NotNull C4189m0 c4189m0) {
        c4189m0.getClass();
        this.a = c4189m0;
    }

    @Nullable
    public final LevelPlayAdSize a(@NotNull Context context, @Nullable Integer num) {
        context.getClass();
        if (!this.a.a()) {
            IronLog.API.error(C4189m0.a(this.a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer b2 = this.a.b(context);
        if (b2 == null) {
            IronLog.API.error(C4189m0.a(this.a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
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
            a3 = ((LevelPlayAdSize) CollectionsKt.h0(a4)).getHeight();
            levelPlayAdSize = LevelPlayAdSize.Companion.createCustomSize(a2, a3);
        }
        int i = a3;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        IronLog ironLog = IronLog.INTERNAL;
        C4189m0 c4189m0 = this.a;
        StringBuilder s = lnb.s(a2, i, "Adaptive: ", "x", " Fallback: ");
        s.append(levelPlayAdSize2);
        ironLog.info(C4189m0.a(c4189m0, s.toString(), (String) null, 2, (Object) null));
        return new LevelPlayAdSize(a2, i, com.ironsource.mediationsdk.j.f, true, levelPlayAdSize2);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C4189m0.a(this.a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
            return X4.a.b(context);
        }
        if (num == null) {
            return X4.a.b(context);
        }
        return num.intValue();
    }

    private final List<LevelPlayAdSize> a() {
        return CollectionsKt.H0(this.a.c(), new c(new b()));
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
