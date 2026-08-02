package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.GestureSignalData;
import defpackage.a70;
import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_GestureSignalData extends GestureSignalData {
    private final String gestureSignal;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder implements GestureSignalData.Builder {
        private String gestureSignal;

        @Override // com.google.ads.interactivemedia.v3.impl.data.GestureSignalData.Builder
        public GestureSignalData build() {
            String str = this.gestureSignal;
            byte[] bArr = null;
            if (str != null) {
                return new AutoValue_GestureSignalData(str, bArr);
            }
            a70.r("Missing required properties: gestureSignal");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GestureSignalData.Builder
        public GestureSignalData.Builder gestureSignal(String str) {
            if (str != null) {
                this.gestureSignal = str;
                return this;
            }
            yhk.s("Null gestureSignal");
            return null;
        }
    }

    private AutoValue_GestureSignalData(String str) {
        this.gestureSignal = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GestureSignalData) {
            return this.gestureSignal.equals(((GestureSignalData) obj).gestureSignal());
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GestureSignalData
    public String gestureSignal() {
        return this.gestureSignal;
    }

    public int hashCode() {
        return this.gestureSignal.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.gestureSignal;
        return wt3.m("GestureSignalData{gestureSignal=", str, new StringBuilder(String.valueOf(str).length() + 33), "}");
    }

    public /* synthetic */ AutoValue_GestureSignalData(String str, byte[] bArr) {
        this(str);
    }
}
