package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2831k {
    public static final int c = 8;
    public final Integer a;
    public final List<String> b;

    public C2831k(Integer num, List<String> gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.a = num;
        this.b = gradient;
    }

    public final Integer a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public final Integer c() {
        return this.a;
    }

    public final List<String> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2831k)) {
            return false;
        }
        C2831k c2831k = (C2831k) obj;
        return Intrinsics.areEqual(this.a, c2831k.a) && Intrinsics.areEqual(this.b, c2831k.b);
    }

    public int hashCode() {
        Integer num = this.a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "DECBorder(borderWidth=" + this.a + ", gradient=" + this.b + ')';
    }

    public final C2831k a(Integer num, List<String> gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        return new C2831k(num, gradient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2831k a(C2831k c2831k, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c2831k.a;
        }
        if ((i & 2) != 0) {
            list = c2831k.b;
        }
        return c2831k.a(num, list);
    }

    public /* synthetic */ C2831k(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
