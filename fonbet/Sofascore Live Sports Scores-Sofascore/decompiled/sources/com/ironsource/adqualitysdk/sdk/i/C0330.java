package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˑ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0330 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0322 f810;

    public C0330(C0322 c0322) {
        this.f810 = c0322;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0322 c0322 = this.f810;
        String str = (String) arrayList.get(0);
        c0322.getClass();
        switch (str.hashCode()) {
            case -1810696374:
                if (str.equals(StringFog.decrypt("xT4vGoPxXWTM\n", "iXdpX8CoHig=\n"))) {
                    return WebViewEventCategory.LIFECYCLE;
                }
                return null;
            case -1166291365:
                if (str.equals(StringFog.decrypt("lEkXeDoo9w==\n", "xx1YKntvshs=\n"))) {
                    return WebViewEventCategory.STORAGE;
                }
                return null;
            case -276710660:
                if (str.equals(StringFog.decrypt("oC+nmszJPMavI7E=\n", "9mbj34OZcIc=\n"))) {
                    return WebViewEventCategory.VIDEOPLAYER;
                }
                return null;
            case -54373961:
                if (str.equals(StringFog.decrypt("pjATmRjPCM+zNgmO\n", "5X9d112MXIY=\n"))) {
                    return WebViewEventCategory.CONNECTIVITY;
                }
                return null;
            case 63879010:
                if (str.equals(StringFog.decrypt("NfWRjZY=\n", "drTSxdO9fHE=\n"))) {
                    return WebViewEventCategory.CACHE;
                }
                return null;
            case 1167718561:
                if (str.equals(StringFog.decrypt("VDlA1xnKbF5C\n", "FmsPll2JLQ0=\n"))) {
                    return WebViewEventCategory.BROADCAST;
                }
                return null;
            case 1813675631:
                if (str.equals(StringFog.decrypt("hJGeMVbHEQ==\n", "1tTPZBOURQM=\n"))) {
                    return WebViewEventCategory.REQUEST;
                }
                return null;
            case 1815350732:
                if (str.equals(StringFog.decrypt("gkA9thA/cQ==\n", "0AVu+VxpNPA=\n"))) {
                    return WebViewEventCategory.RESOLVE;
                }
                return null;
            case 1926303783:
                if (str.equals(StringFog.decrypt("rba9ZM5w\n", "7PLoKockwwU=\n"))) {
                    return WebViewEventCategory.ADUNIT;
                }
                return null;
            default:
                return null;
        }
    }
}
