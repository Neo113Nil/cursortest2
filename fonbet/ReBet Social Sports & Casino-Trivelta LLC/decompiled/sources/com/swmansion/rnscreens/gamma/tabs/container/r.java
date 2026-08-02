package com.swmansion.rnscreens.gamma.tabs.container;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f41918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41919b;

    /* renamed from: c, reason: collision with root package name */
    public final b f41920c;

    public r(String selectedScreenKey, int i10, b actionOrigin) {
        Intrinsics.checkNotNullParameter(selectedScreenKey, "selectedScreenKey");
        Intrinsics.checkNotNullParameter(actionOrigin, "actionOrigin");
        this.f41918a = selectedScreenKey;
        this.f41919b = i10;
        this.f41920c = actionOrigin;
    }

    public static /* synthetic */ r b(r rVar, String str, int i10, b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rVar.f41918a;
        }
        if ((i11 & 2) != 0) {
            i10 = rVar.f41919b;
        }
        if ((i11 & 4) != 0) {
            bVar = rVar.f41920c;
        }
        return rVar.a(str, i10, bVar);
    }

    public final r a(String selectedScreenKey, int i10, b actionOrigin) {
        Intrinsics.checkNotNullParameter(selectedScreenKey, "selectedScreenKey");
        Intrinsics.checkNotNullParameter(actionOrigin, "actionOrigin");
        return new r(selectedScreenKey, i10, actionOrigin);
    }

    public final b c() {
        return this.f41920c;
    }

    public final int d() {
        return this.f41919b;
    }

    public final String e() {
        return this.f41918a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f41918a, rVar.f41918a) && this.f41919b == rVar.f41919b && this.f41920c == rVar.f41920c;
    }

    public int hashCode() {
        return (((this.f41918a.hashCode() * 31) + Integer.hashCode(this.f41919b)) * 31) + this.f41920c.hashCode();
    }

    public String toString() {
        return "TabsNavigationStateUpdateRequest(selectedScreenKey=" + this.f41918a + ", baseProvenance=" + this.f41919b + ", actionOrigin=" + this.f41920c + ")";
    }
}
