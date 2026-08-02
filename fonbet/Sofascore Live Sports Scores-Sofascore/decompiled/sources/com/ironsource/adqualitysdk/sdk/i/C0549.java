package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdUnit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ধ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0549 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0445 f1811;

    public C0549(C0445 c0445) {
        this.f1811 = c0445;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r4.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("i9EztTkUE6iDwympPwgCuZXAIr0lHgWy\n", "ypVs9mtRUvw=\n")) == false) goto L18;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0445 c0445 = this.f1811;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0445.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -2102692847) {
            if (str.equals(StringFog.decrypt("wchcxiwGfVjJ2kbaKhpsSd/IStYuD31V\n", "gIwDhX5DPAw=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -1357644918) {
            if (hashCode == 235669401) {
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("Y0HuqY2PuGNrU/S1i5Opcn1T+K6ahQ==\n", "IgWx6t/K+Tc=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
        }
        if (c == 1) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
        }
        if (c != 2) {
            return null;
        }
        return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
    }
}
