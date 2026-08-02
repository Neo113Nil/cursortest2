package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdUnit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ใ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0591 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0445 f1956;

    public C0591(C0445 c0445) {
        this.f1956 = c0445;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r4.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("V36moa5wzkBGZa21v2faXFh3pqS7b8k=\n", "Fjr57O8ihRU=\n")) != false) goto L19;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0445 c0445 = this.f1956;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0445.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 556003820) {
            if (hashCode != 556062505) {
                if (hashCode == 1382961856 && str.equals(StringFog.decrypt("risTO5rOdSW/MBgvi9lhJaEkAjmM0g==\n", "729MdtucPnA=\n"))) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals(StringFog.decrypt("3RlmdQpEXR3MAm1hG1NJAdIQZnIYWVg=\n", "nF05OEsWFkg=\n"))) {
                    c = 1;
                }
                c = 65535;
            }
        }
        if (c == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (c == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (c != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }
}
