package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.fn0;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_SizeData extends SizeData {
    private final Integer height;
    private final Integer width;

    public AutoValue_SizeData(Integer num, Integer num2) {
        if (num == null) {
            yhk.s("Null width");
            throw null;
        }
        this.width = num;
        if (num2 != null) {
            this.height = num2;
        } else {
            yhk.s("Null height");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SizeData) {
            SizeData sizeData = (SizeData) obj;
            if (this.width.equals(sizeData.width()) && this.height.equals(sizeData.height())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.width.hashCode() ^ 1000003;
        return this.height.hashCode() ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SizeData
    public Integer height() {
        return this.height;
    }

    public String toString() {
        Integer num = this.width;
        int length = String.valueOf(num).length();
        Integer num2 = this.height;
        StringBuilder sb = new StringBuilder(length + 24 + String.valueOf(num2).length() + 1);
        fn0.w(num, num2, "SizeData{width=", ", height=", sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SizeData
    public Integer width() {
        return this.width;
    }
}
