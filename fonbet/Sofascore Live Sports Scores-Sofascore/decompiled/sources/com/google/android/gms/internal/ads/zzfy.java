package com.google.android.gms.internal.ads;

import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfy implements zzao {
    public final int a;

    public zzfy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfy) && this.a == ((zzfy) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return me4.g(i, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i).length() + 19));
    }
}
