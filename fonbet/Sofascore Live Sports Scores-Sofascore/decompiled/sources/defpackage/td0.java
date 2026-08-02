package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class td0 {
    public final int a;
    public final int b;

    public td0(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td0)) {
            return false;
        }
        td0 td0Var = (td0) obj;
        return this.a == td0Var.a && this.b == td0Var.b;
    }

    public final int hashCode() {
        int C = wt3.C(this.a) * 31;
        int i = this.b;
        return C + (i == 0 ? 0 : wt3.C(i));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionFieldMapping(section=");
        sb.append(bf3.y(this.a));
        sb.append(", field=");
        switch (this.b) {
            case 1:
                str = "ANON_ID";
                break;
            case 2:
                str = "FB_LOGIN_ID";
                break;
            case 3:
                str = "MAD_ID";
                break;
            case 4:
                str = "PAGE_ID";
                break;
            case 5:
                str = "PAGE_SCOPED_USER_ID";
                break;
            case 6:
                str = "USER_DATA";
                break;
            case 7:
                str = "ADV_TE";
                break;
            case 8:
                str = "APP_TE";
                break;
            case 9:
                str = "CONSIDER_VIEWS";
                break;
            case 10:
                str = "DEVICE_TOKEN";
                break;
            case 11:
                str = "EXT_INFO";
                break;
            case 12:
                str = "INCLUDE_DWELL_DATA";
                break;
            case 13:
                str = "INCLUDE_VIDEO_DATA";
                break;
            case 14:
                str = "INSTALL_REFERRER";
                break;
            case 15:
                str = "INSTALLER_PACKAGE";
                break;
            case 16:
                str = "RECEIPT_DATA";
                break;
            case 17:
                str = "URL_SCHEMES";
                break;
            case 18:
                str = "ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP";
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
