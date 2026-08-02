package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.CompanionAdData;
import defpackage.bf3;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_CompanionAdData extends CompanionAdData {

    @Nullable
    private final String apiFramework;

    @Nullable
    private final String resourceValue;

    @Nullable
    private final SizeData size;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends CompanionAdData.Builder {
        private String apiFramework;
        private String resourceValue;
        private SizeData size;

        @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData.Builder
        public CompanionAdData build() {
            return new AutoValue_CompanionAdData(this.apiFramework, this.resourceValue, this.size, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData.Builder
        public CompanionAdData.Builder setApiFramework(String str) {
            this.apiFramework = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData.Builder
        public CompanionAdData.Builder setResourceValue(String str) {
            this.resourceValue = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData.Builder
        public CompanionAdData.Builder setSize(SizeData sizeData) {
            this.size = sizeData;
            return this;
        }
    }

    private AutoValue_CompanionAdData(@Nullable String str, @Nullable String str2, @Nullable SizeData sizeData) {
        this.apiFramework = str;
        this.resourceValue = str2;
        this.size = sizeData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData
    @Nullable
    public String apiFramework() {
        return this.apiFramework;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionAdData) {
            CompanionAdData companionAdData = (CompanionAdData) obj;
            String str = this.apiFramework;
            if (str != null ? str.equals(companionAdData.apiFramework()) : companionAdData.apiFramework() == null) {
                String str2 = this.resourceValue;
                if (str2 != null ? str2.equals(companionAdData.resourceValue()) : companionAdData.resourceValue() == null) {
                    SizeData sizeData = this.size;
                    if (sizeData != null ? sizeData.equals(companionAdData.size()) : companionAdData.size() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.apiFramework;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.resourceValue;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        SizeData sizeData = this.size;
        return (((i * 1000003) ^ hashCode2) * 1000003) ^ (sizeData != null ? sizeData.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData
    @Nullable
    public String resourceValue() {
        return this.resourceValue;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData
    @Nullable
    public SizeData size() {
        return this.size;
    }

    public String toString() {
        String valueOf = String.valueOf(this.size);
        String str = this.apiFramework;
        int length = String.valueOf(str).length();
        String str2 = this.resourceValue;
        StringBuilder sb = new StringBuilder(wt3.h(length, 45, String.valueOf(str2).length(), 7, valueOf.length()) + 1);
        bf3.v(sb, "CompanionAdData{apiFramework=", str, ", resourceValue=", str2);
        return wt3.m(", size=", valueOf, sb, "}");
    }

    public /* synthetic */ AutoValue_CompanionAdData(String str, String str2, SizeData sizeData, byte[] bArr) {
        this(str, str2, sizeData);
    }
}
