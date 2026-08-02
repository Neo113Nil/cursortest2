package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05777s {
    public static final C05777s A01 = new C05777s(false);
    public final boolean A00;

    public C05777s(boolean z) {
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((C05777s) obj).A00;
    }

    public final int hashCode() {
        return !this.A00 ? 1 : 0;
    }
}
