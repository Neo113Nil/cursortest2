package com.vk.ecomm.design.compose.productattaches;

import com.vk.dto.common.Image;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.uqi;
import xsna.urd0;
import xsna.vby;
import xsna.zrp;

/* compiled from: ProductVideoAttach.kt */
/* loaded from: classes18.dex */
public final class ProductVideoAttach {
    public final long a;
    public final StatusType b;
    public final Image c;
    public final String d;
    public final a e;
    public final String f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductVideoAttach.kt */
    public static final class StatusType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusType[] $VALUES;
        public static final StatusType Adult;
        public static final StatusType Base;

        static {
            StatusType statusType = new StatusType("Base", 0);
            Base = statusType;
            StatusType statusType2 = new StatusType("Adult", 1);
            Adult = statusType2;
            StatusType[] statusTypeArr = {statusType, statusType2};
            $VALUES = statusTypeArr;
            $ENTRIES = new asp(statusTypeArr);
        }

        public StatusType() {
            throw null;
        }

        public static StatusType valueOf(String str) {
            return (StatusType) Enum.valueOf(StatusType.class, str);
        }

        public static StatusType[] values() {
            return (StatusType[]) $VALUES.clone();
        }
    }

    /* compiled from: ProductVideoAttach.kt */
    @vby
    public static final class a {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return uqi.a("BadgeState(discountRate=", this.a, ')');
        }
    }

    /* compiled from: ProductVideoAttach.kt */
    @vby
    public static final class b {
        public final Image a;

        public static String a(Image image) {
            return "VideoAttachImage(image=" + image + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return a(this.a);
        }
    }

    public ProductVideoAttach(long j, StatusType statusType, Image image, String str, a aVar, String str2) {
        this.a = j;
        this.b = statusType;
        this.c = image;
        this.d = str;
        this.e = aVar;
        this.f = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof ProductVideoAttach) {
                ProductVideoAttach productVideoAttach = (ProductVideoAttach) obj;
                if (this.a == productVideoAttach.a && this.b == productVideoAttach.b) {
                    Image image = productVideoAttach.c;
                    Image image2 = this.c;
                    if (image2 == null) {
                        if (image == null) {
                            equals = true;
                            if (equals && epx.f(this.d, productVideoAttach.d) && epx.f(this.e, productVideoAttach.e) && epx.f(this.f, productVideoAttach.f)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (image != null) {
                            equals = image2.equals(image);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Image image = this.c;
        int a2 = urd0.a((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
        a aVar = this.e;
        return this.f.hashCode() + ((a2 + (aVar != null ? Integer.hashCode(aVar.a) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductVideoAttach(uid=");
        sb.append((Object) ("VideoAttachItemId(goodId=" + this.a + ')'));
        sb.append(", statusType=");
        sb.append(this.b);
        sb.append(", image=");
        Image image = this.c;
        sb.append((Object) (image == null ? "null" : b.a(image)));
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", badge=");
        sb.append(this.e);
        sb.append(", name=");
        return ho8.a(sb, this.f, ')');
    }
}
