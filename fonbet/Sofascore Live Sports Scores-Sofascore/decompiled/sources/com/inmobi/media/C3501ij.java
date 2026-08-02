package com.inmobi.media;

import defpackage.fc6;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ij, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3501ij {
    public final int a;
    public final int b;
    public final int c;

    public C3501ij(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3501ij)) {
            return false;
        }
        C3501ij c3501ij = (C3501ij) obj;
        return this.a == c3501ij.a && this.b == c3501ij.b && this.c == c3501ij.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + Ai.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return fc6.h(this.c, ")", lnb.s(this.a, this.b, "SemVer(major=", ", minor=", ", patch="));
    }
}
