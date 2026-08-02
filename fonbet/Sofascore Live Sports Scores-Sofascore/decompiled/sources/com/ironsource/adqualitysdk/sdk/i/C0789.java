package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᚆ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0789 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0788 f2536;

    public C0789(C0788 c0788) {
        this.f2536 = c0788;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0845 c0845 = this.f2536.f2535;
        C0918 c0918 = c0845.f2792;
        F f = c0918.f3070;
        if (f == null) {
            f = new F(c0918.f3078.optJSONObject(C0918.f3066));
            c0918.f3070 = f;
        }
        synchronized (c0845) {
            c0845.f2786 = f;
        }
        if (c0845.f2789.mo219()) {
            I.f88 = f;
        }
        c0845.f2792.m540().m566(StringFog.decrypt("J5TWcKkSDOQgkcV8\n", "SfWiGd93TpY=\n"), c0845.f2789);
        Iterator it = c0845.f2792.m539().keySet().iterator();
        while (it.hasNext()) {
            C1183 c1183 = (C1183) c0845.f2792.m539().get((String) it.next());
            if (!c1183.f3756) {
                c0845.f2787.add(new C1102(c0845, c0845.f2790, c0845.f2789, c0845.m515(c1183), c0845.f2792.m540()));
            }
        }
        c0845.m516();
        Iterator it2 = c0845.m514().iterator();
        while (it2.hasNext()) {
            ((C1102) it2.next()).m650();
        }
        C0527 c0527 = this.f2536.f2532.f1833;
        if (c0527 != null) {
            AbstractC1008.m610(new C0536(c0527, this.f2536.f2534, EnumC0546.f1806));
        }
        AbstractC0420.m250(StringFog.decrypt("V60u/ZVJGxdmjyH9kU0KCg==\n", "FMJAk/Aqb3g=\n"), this.f2536.f2535.f2792.f3075 + StringFog.decrypt("6SX6FguZmhimNLULEJ+aCbo18w0JkIBMoCj8DAydlQWzI/E=\n", "yUaVeGX8+Ww=\n"));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo137(Throwable th) {
        try {
            ((JSONObject) C0558.m359(this.f2536.f2532).get(this.f2536.f2535.f2792.f3076)).put(StringFog.decrypt("ZSOsfg==\n", "DE3FCvjYfXA=\n"), false);
        } catch (JSONException e) {
            String decrypt = StringFog.decrypt("hLRJSsVGVSu1lkZKwUJENg==\n", "x9snJKAlIUQ=\n");
            AbstractC0420.m252(decrypt, decrypt, StringFog.decrypt("5nGRMSzAuWnXd4owOcCjYsp3wyoxwKljzW2GPSqPuCzVZpEtN4+kLMlwjDA=\n", "owPjXl7gygw=\n"), e, null, false);
        }
        C0527 c0527 = this.f2536.f2532.f1833;
        if (c0527 != null) {
            AbstractC1008.m610(new C0539(c0527, this.f2536.f2534, EnumC0552.f1817));
        }
        String decrypt2 = StringFog.decrypt("UoX4Kxjbz1Zjp/crHN/eSw==\n", "EeqWRX24uzk=\n");
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("f1uI+W0b/rxTXZP3c1Ltu1RO2g==\n", "Oin6lh87l9I=\n"));
        sb.append(this.f2536.f2535.f2792.f3075);
        AbstractC0356.m205(decrypt2, AbstractC1133.m662("bk0KDAqTjFEhXA==\n", "Ti5lYmT27yU=\n", sb), th, true, true, true);
        AbstractC0420.m245(StringFog.decrypt("8LTPRHWo1J/Ig9p6\n", "sdCeMRTEves=\n"), StringFog.decrypt("3pgVvv5Uabi/mVa4+VR0r/vWQrPlSmPq9phcr+VHaqPln1u8rG9Vi/unQLrgT3Kzv6VxkKw=\n", "n/Y124wmBso=\n") + this.f2536.f2535.f2792.f3075 + StringFog.decrypt("YBSsGAJmKcMvBe0=\n", "QHfDdmwDSrc=\n"));
    }
}
