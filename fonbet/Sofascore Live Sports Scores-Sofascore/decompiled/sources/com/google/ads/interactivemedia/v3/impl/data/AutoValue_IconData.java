package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.bf3;
import defpackage.fn0;
import defpackage.me4;
import defpackage.wt3;
import defpackage.yhk;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_IconData extends IconData {
    private final String alternateText;
    private final int duration;
    private final List<IconClickFallbackImageMsgData> fallbackImages;
    private final int height;
    private final int id;
    private final String imageUrl;
    private final int offset;
    private final double pixelRatio;
    private final int width;
    private final String xPosition;
    private final String yPosition;

    public AutoValue_IconData(int i, int i2, int i3, double d, String str, String str2, int i4, int i5, String str3, String str4, List<IconClickFallbackImageMsgData> list) {
        this.id = i;
        this.width = i2;
        this.height = i3;
        this.pixelRatio = d;
        if (str == null) {
            yhk.s("Null xPosition");
            throw null;
        }
        this.xPosition = str;
        if (str2 == null) {
            yhk.s("Null yPosition");
            throw null;
        }
        this.yPosition = str2;
        this.offset = i4;
        this.duration = i5;
        if (str3 == null) {
            yhk.s("Null imageUrl");
            throw null;
        }
        this.imageUrl = str3;
        if (str4 == null) {
            yhk.s("Null alternateText");
            throw null;
        }
        this.alternateText = str4;
        if (list != null) {
            this.fallbackImages = list;
        } else {
            yhk.s("Null fallbackImages");
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public String alternateText() {
        return this.alternateText;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public int duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconData) {
            IconData iconData = (IconData) obj;
            if (this.id == iconData.id() && this.width == iconData.width() && this.height == iconData.height() && Double.doubleToLongBits(this.pixelRatio) == Double.doubleToLongBits(iconData.pixelRatio()) && this.xPosition.equals(iconData.xPosition()) && this.yPosition.equals(iconData.yPosition()) && this.offset == iconData.offset() && this.duration == iconData.duration() && this.imageUrl.equals(iconData.imageUrl()) && this.alternateText.equals(iconData.alternateText()) && this.fallbackImages.equals(iconData.fallbackImages())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public List<IconClickFallbackImageMsgData> fallbackImages() {
        return this.fallbackImages;
    }

    public int hashCode() {
        long doubleToLongBits = (Double.doubleToLongBits(this.pixelRatio) >>> 32) ^ Double.doubleToLongBits(this.pixelRatio);
        int i = (int) doubleToLongBits;
        int hashCode = ((((((((((((i ^ ((((((this.id ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003)) * 1000003) ^ this.xPosition.hashCode()) * 1000003) ^ this.yPosition.hashCode()) * 1000003) ^ this.offset) * 1000003) ^ this.duration) * 1000003) ^ this.imageUrl.hashCode()) * 1000003) ^ this.alternateText.hashCode();
        return this.fallbackImages.hashCode() ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public int id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public int offset() {
        return this.offset;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public double pixelRatio() {
        return this.pixelRatio;
    }

    public String toString() {
        String valueOf = String.valueOf(this.fallbackImages);
        int i = this.id;
        int length = String.valueOf(i).length();
        int i2 = this.width;
        int length2 = String.valueOf(i2).length();
        int i3 = this.height;
        int length3 = String.valueOf(i3).length();
        double d = this.pixelRatio;
        int length4 = String.valueOf(d).length();
        String str = this.xPosition;
        int length5 = String.valueOf(str).length();
        String str2 = this.yPosition;
        int length6 = String.valueOf(str2).length();
        int i4 = this.offset;
        int length7 = String.valueOf(i4).length();
        int i5 = this.duration;
        int length8 = String.valueOf(i5).length();
        String str3 = this.imageUrl;
        int length9 = String.valueOf(str3).length();
        String str4 = this.alternateText;
        StringBuilder sb = new StringBuilder(length + 20 + length2 + 9 + length3 + 13 + length4 + 12 + length5 + 12 + length6 + 9 + length7 + 11 + length8 + 11 + length9 + 16 + String.valueOf(str4).length() + 17 + valueOf.length() + 1);
        me4.r(sb, "IconData{id=", i, ", width=", i2);
        wt3.u(i3, ", height=", ", pixelRatio=", sb);
        sb.append(d);
        sb.append(", xPosition=");
        sb.append(str);
        wt3.t(i4, ", yPosition=", str2, ", offset=", sb);
        fn0.s(i5, ", duration=", ", imageUrl=", str3, sb);
        bf3.v(sb, ", alternateText=", str4, ", fallbackImages=", valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public int width() {
        return this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public String xPosition() {
        return this.xPosition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconData
    public String yPosition() {
        return this.yPosition;
    }
}
