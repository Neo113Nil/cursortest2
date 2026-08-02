package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hdg extends Exception {
    public final gdg a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hdg(gdg gdgVar, String str) {
        super(r4);
        String concat;
        switch (gdgVar.ordinal()) {
            case 0:
                concat = "No ad returned. ".concat(str == null ? "" : str);
                break;
            case 1:
                concat = "Timeout hit before the ad finish to load. ".concat(str == null ? "" : str);
                break;
            case 2:
                concat = "An error occurred during ad call. ".concat(str == null ? "" : str);
                break;
            case 3:
                concat = "An error occurred during ad load. ".concat(str == null ? "" : str);
                break;
            case 4:
                concat = "Invalid format type. ".concat(str == null ? "" : str);
                break;
            case 5:
                concat = "An ad is currently loading. ".concat(str == null ? "" : str);
                break;
            case 6:
                concat = "The ad is currently expanded. ".concat(str == null ? "" : str);
                break;
            case 7:
                concat = "Ad failed to show. ".concat(str == null ? "" : str);
                break;
            case 8:
                concat = "An error occurred. ".concat(str == null ? "" : str);
                break;
            default:
                zzl.b();
                throw null;
        }
        this.a = gdgVar;
    }
}
