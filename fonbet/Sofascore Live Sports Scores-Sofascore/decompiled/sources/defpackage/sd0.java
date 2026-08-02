package defpackage;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sd0 {
    public final int a;
    public final int b;

    public sd0(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd0)) {
            return false;
        }
        sd0 sd0Var = (sd0) obj;
        return this.a == sd0Var.a && this.b == sd0Var.b;
    }

    public final int hashCode() {
        int i = this.a;
        return wt3.C(this.b) + ((i == 0 ? 0 : wt3.C(i)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionCustomEventFieldMapping(section=");
        sb.append(bf3.y(this.a));
        sb.append(", field=");
        switch (this.b) {
            case 1:
                str = "VALUE_TO_SUM";
                break;
            case 2:
                str = "EVENT_TIME";
                break;
            case 3:
                str = "EVENT_NAME";
                break;
            case 4:
                str = "CONTENT_IDS";
                break;
            case 5:
                str = "CONTENTS";
                break;
            case 6:
                str = "CONTENT_TYPE";
                break;
            case 7:
                str = NativeAdContent.ViewTag.AD_DESCRIPTION;
                break;
            case 8:
                str = "LEVEL";
                break;
            case 9:
                str = "MAX_RATING_VALUE";
                break;
            case 10:
                str = "NUM_ITEMS";
                break;
            case 11:
                str = "PAYMENT_INFO_AVAILABLE";
                break;
            case 12:
                str = "REGISTRATION_METHOD";
                break;
            case 13:
                str = "SEARCH_STRING";
                break;
            case 14:
                str = "SUCCESS";
                break;
            case 15:
                str = "ORDER_ID";
                break;
            case 16:
                str = "AD_TYPE";
                break;
            case 17:
                str = "CURRENCY";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
