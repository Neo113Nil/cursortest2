package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.request.WebRequestEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˆ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0319 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0322 f715;

    public C0319(C0322 c0322) {
        this.f715 = c0322;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r3.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("SwSzbtHYUss=\n", "CEv+Pp2dBo4=\n")) != false) goto L14;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0322 c0322 = this.f715;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0322.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 183181625) {
            if (hashCode == 2066319421 && str.equals(StringFog.decrypt("ibNq1zN7\n", "z/Ijm3Y/WlE=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return WebRequestEvent.COMPLETE;
        }
        if (c != 1) {
            return null;
        }
        return WebRequestEvent.FAILED;
    }
}
