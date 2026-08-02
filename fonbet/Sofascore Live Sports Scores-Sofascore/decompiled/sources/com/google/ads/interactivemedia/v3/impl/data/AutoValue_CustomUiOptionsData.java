package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_CustomUiOptionsData extends CustomUiOptionsData {
    private final boolean aboutThisAdSupport;
    private final boolean skippableSupport;

    public AutoValue_CustomUiOptionsData(boolean z, boolean z2) {
        this.skippableSupport = z;
        this.aboutThisAdSupport = z2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CustomUiOptionsData
    public boolean aboutThisAdSupport() {
        return this.aboutThisAdSupport;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CustomUiOptionsData) {
            CustomUiOptionsData customUiOptionsData = (CustomUiOptionsData) obj;
            if (this.skippableSupport == customUiOptionsData.skippableSupport() && this.aboutThisAdSupport == customUiOptionsData.aboutThisAdSupport()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((true != this.skippableSupport ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.aboutThisAdSupport ? 1237 : 1231);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CustomUiOptionsData
    public boolean skippableSupport() {
        return this.skippableSupport;
    }

    public String toString() {
        boolean z = this.skippableSupport;
        int length = String.valueOf(z).length();
        boolean z2 = this.aboutThisAdSupport;
        StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(z2).length() + 1);
        fn0.y("CustomUiOptionsData{skippableSupport=", ", aboutThisAdSupport=", sb, z, z2);
        sb.append("}");
        return sb.toString();
    }
}
