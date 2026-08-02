package com.google.ads.interactivemedia.v3.impl;

import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_StreamVideoDisplay_TimedMetadataWithKeys extends a {
    private final String TXXX;

    public AutoValue_StreamVideoDisplay_TimedMetadataWithKeys(String str) {
        if (str != null) {
            this.TXXX = str;
        } else {
            yhk.s("Null TXXX");
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.a
    public String TXXX() {
        return this.TXXX;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.TXXX.equals(((a) obj).TXXX());
        }
        return false;
    }

    public int hashCode() {
        return this.TXXX.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.TXXX;
        return wt3.m("TimedMetadataWithKeys{TXXX=", str, new StringBuilder(String.valueOf(str).length() + 28), "}");
    }
}
