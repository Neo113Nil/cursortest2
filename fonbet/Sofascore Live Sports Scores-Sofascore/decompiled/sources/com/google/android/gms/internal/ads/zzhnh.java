package com.google.android.gms.internal.ads;

import defpackage.a70;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhnh implements zzhel {
    static {
        zzhng zzhngVar = new zzhng();
        HashMap hashMap = zzhngVar.a;
        if (hashMap == null) {
            a70.r("cannot call build() twice");
        } else {
            Collections.unmodifiableMap(hashMap);
            zzhngVar.a = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhnh) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
