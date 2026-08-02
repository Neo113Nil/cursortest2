package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_ResizeAndPositionVideoMsgData extends ResizeAndPositionVideoMsgData {
    private final Integer height;
    private final Integer width;
    private final Integer x;
    private final Integer y;

    public AutoValue_ResizeAndPositionVideoMsgData(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            yhk.s("Null x");
            throw null;
        }
        this.x = num;
        if (num2 == null) {
            yhk.s("Null y");
            throw null;
        }
        this.y = num2;
        if (num3 == null) {
            yhk.s("Null width");
            throw null;
        }
        this.width = num3;
        if (num4 != null) {
            this.height = num4;
        } else {
            yhk.s("Null height");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResizeAndPositionVideoMsgData) {
            ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = (ResizeAndPositionVideoMsgData) obj;
            if (this.x.equals(resizeAndPositionVideoMsgData.x()) && this.y.equals(resizeAndPositionVideoMsgData.y()) && this.width.equals(resizeAndPositionVideoMsgData.width()) && this.height.equals(resizeAndPositionVideoMsgData.height())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.x.hashCode() ^ 1000003) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.width.hashCode();
        return this.height.hashCode() ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
    public Integer height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
    public Integer width() {
        return this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
    public Integer x() {
        return this.x;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
    public Integer y() {
        return this.y;
    }
}
