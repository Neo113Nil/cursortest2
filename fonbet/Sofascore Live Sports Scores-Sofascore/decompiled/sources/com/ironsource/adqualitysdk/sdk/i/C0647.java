package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒌ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0647 implements InterfaceC0818 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0637 f2189;

    public C0647(C0637 c0637) {
        this.f2189 = c0637;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0818
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo394() {
        HashMap hashMap;
        this.f2189.f2168.f1834 = AbstractC0274.m142().mo152();
        AbstractC0420.m250(StringFog.decrypt("HHkBPWr2jV8tWw49bvKcQg==\n", "XxZvUw+V+TA=\n"), StringFog.decrypt("KvtyuDGtQF4Jsmi3OrVAUQL7e7w34UpfAPxkuieuW0M=\n", "bpIB2VPBKTA=\n"));
        C0558 c0558 = this.f2189.f2168;
        c0558.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = (c0558.f1840 != null ? new ArrayList(c0558.f1840) : new ArrayList()).iterator();
        while (it.hasNext()) {
            C0845 c0845 = (C0845) it.next();
            if (c0558.m374(c0845.f2792.f3076)) {
                arrayList.add(c0845);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0845 c08452 = (C0845) it2.next();
            String str = C0558.f1828;
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("WgmyBlKBuZF5QA==\n", "HmDBZzDt0P8=\n"));
            sb.append(c08452.f2792.f3075);
            AbstractC0420.m253(str, str, AbstractC1133.m662("DWvPkQieg1lCeg==\n", "LQig/2b74C0=\n", sb), true);
            String str2 = c08452.f2792.f3076;
            synchronized (c0558) {
                hashMap = c0558.f1838;
            }
            c0558.m373(str2, (JSONObject) hashMap.get(str2));
            AbstractC1008.m614(new C0689(c08452));
            ((ArrayList) c0558.m366()).remove(c08452);
        }
    }
}
