package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_UniversalAdIdData extends UniversalAdIdData {

    @Nullable
    private final String adIdRegistry;

    @Nullable
    private final String adIdValue;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends UniversalAdIdData.Builder {
        private String adIdRegistry;
        private String adIdValue;

        @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData.Builder
        public UniversalAdIdData build() {
            return new AutoValue_UniversalAdIdData(this.adIdValue, this.adIdRegistry, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData.Builder
        public UniversalAdIdData.Builder setAdIdRegistry(String str) {
            this.adIdRegistry = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData.Builder
        public UniversalAdIdData.Builder setAdIdValue(String str) {
            this.adIdValue = str;
            return this;
        }
    }

    private AutoValue_UniversalAdIdData(@Nullable String str, @Nullable String str2) {
        this.adIdValue = str;
        this.adIdRegistry = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData
    @Nullable
    public String adIdRegistry() {
        return this.adIdRegistry;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData
    @Nullable
    public String adIdValue() {
        return this.adIdValue;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UniversalAdIdData) {
            UniversalAdIdData universalAdIdData = (UniversalAdIdData) obj;
            String str = this.adIdValue;
            if (str != null ? str.equals(universalAdIdData.adIdValue()) : universalAdIdData.adIdValue() == null) {
                String str2 = this.adIdRegistry;
                if (str2 != null ? str2.equals(universalAdIdData.adIdRegistry()) : universalAdIdData.adIdRegistry() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.adIdValue;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.adIdRegistry;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.adIdValue;
        int length = String.valueOf(str).length();
        String str2 = this.adIdRegistry;
        StringBuilder sb = new StringBuilder(length + 43 + String.valueOf(str2).length() + 1);
        bf3.v(sb, "UniversalAdIdData{adIdValue=", str, ", adIdRegistry=", str2);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ AutoValue_UniversalAdIdData(String str, String str2, byte[] bArr) {
        this(str, str2);
    }
}
