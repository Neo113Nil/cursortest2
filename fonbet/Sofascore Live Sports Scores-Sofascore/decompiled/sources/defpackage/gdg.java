package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gdg {
    public static final gdg a;
    public static final gdg b;
    public static final gdg c;
    public static final gdg d;
    public static final gdg e;
    public static final gdg f;
    public static final gdg g;
    public static final gdg h;
    public static final gdg i;
    public static final /* synthetic */ gdg[] j;

    static {
        gdg gdgVar = new gdg("NO_AD", 0);
        a = gdgVar;
        gdg gdgVar2 = new gdg(Payload.RESPONSE_TIMEOUT, 1);
        b = gdgVar2;
        gdg gdgVar3 = new gdg("AD_CALL_ERROR", 2);
        c = gdgVar3;
        gdg gdgVar4 = new gdg("AD_LOADING_ERROR", 3);
        d = gdgVar4;
        gdg gdgVar5 = new gdg("INVALID_FORMAT_TYPE", 4);
        e = gdgVar5;
        gdg gdgVar6 = new gdg("PENDING_AD_LOADING", 5);
        f = gdgVar6;
        gdg gdgVar7 = new gdg("AD_EXPANDED", 6);
        g = gdgVar7;
        gdg gdgVar8 = new gdg("FAILED_TO_SHOW", 7);
        h = gdgVar8;
        gdg gdgVar9 = new gdg("UNKNOWN_ISSUE", 8);
        i = gdgVar9;
        j = new gdg[]{gdgVar, gdgVar2, gdgVar3, gdgVar4, gdgVar5, gdgVar6, gdgVar7, gdgVar8, gdgVar9};
    }

    public static gdg valueOf(String str) {
        return (gdg) Enum.valueOf(gdg.class, str);
    }

    public static gdg[] values() {
        return (gdg[]) j.clone();
    }
}
