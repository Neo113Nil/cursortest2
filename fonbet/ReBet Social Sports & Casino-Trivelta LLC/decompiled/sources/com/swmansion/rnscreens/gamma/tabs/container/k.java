package com.swmansion.rnscreens.gamma.tabs.container;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f41900c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final k f41901d = new k("", Integer.MIN_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final String f41902a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41903b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f41901d;
        }

        public a() {
        }
    }

    public k(String selectedScreenKey, int i10) {
        Intrinsics.checkNotNullParameter(selectedScreenKey, "selectedScreenKey");
        this.f41902a = selectedScreenKey;
        this.f41903b = i10;
    }

    public final int b() {
        return this.f41903b;
    }

    public final String c() {
        return this.f41902a;
    }

    public final boolean d() {
        return this == f41901d;
    }

    public final boolean e() {
        return !d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f41902a, kVar.f41902a) && this.f41903b == kVar.f41903b;
    }

    public int hashCode() {
        return (this.f41902a.hashCode() * 31) + Integer.hashCode(this.f41903b);
    }

    public String toString() {
        return "TabsNavigationState(selectedScreenKey=" + this.f41902a + ", provenance=" + this.f41903b + ")";
    }
}
