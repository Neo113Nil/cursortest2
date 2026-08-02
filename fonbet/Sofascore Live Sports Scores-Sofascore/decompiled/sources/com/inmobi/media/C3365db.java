package com.inmobi.media;

import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3365db extends AbstractC3416fb {
    public final int a;

    public C3365db(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3365db) && this.a == ((C3365db) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.k(this.a, "InValid(errorCode=", ")");
    }
}
