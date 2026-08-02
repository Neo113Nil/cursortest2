package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfnx implements zzfnv {
    public final String a;

    public zzfnx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfnx) {
            return this.a.equals(((zzfnx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
