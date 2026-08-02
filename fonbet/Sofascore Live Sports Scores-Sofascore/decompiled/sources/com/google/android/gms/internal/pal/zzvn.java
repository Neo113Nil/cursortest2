package com.google.android.gms.internal.pal;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum zzvn implements zzadb {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_KEYMATERIAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    SYMMETRIC(1),
    /* JADX INFO: Fake field, exist only in values array */
    ASYMMETRIC_PRIVATE(2),
    /* JADX INFO: Fake field, exist only in values array */
    ASYMMETRIC_PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE(4),
    UNRECOGNIZED(-1);

    public final int a;

    zzvn(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        if (this != UNRECOGNIZED) {
            return Integer.toString(this.a);
        }
        a70.p("Can't get the number of an unknown enum value.");
        return null;
    }
}
