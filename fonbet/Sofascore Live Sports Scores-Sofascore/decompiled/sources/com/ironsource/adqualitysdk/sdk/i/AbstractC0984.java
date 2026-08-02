package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ト, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0984 implements InterfaceC0881 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f3215 = StringFog.decrypt("eN4eZ8pwAvRL6iRp3G0=\n", "ObpWBqQUbpE=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0986 f3216 = new C0986();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public InterfaceC0881 f3217;

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﻐ */
    public final void mo94(JSONObject jSONObject, View view, Object obj) {
        JSONObject m598 = m598(jSONObject, obj);
        m599(StringFog.decrypt("BfuCBa4hhl0w658F+w==\n", "Ro7xccFMpjg=\n"), m598);
        InterfaceC0881 interfaceC0881 = this.f3217;
        if (interfaceC0881 == null) {
            interfaceC0881 = this.f3216;
        }
        interfaceC0881.mo94(m598, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﻛ */
    public void mo96(JSONObject jSONObject, View view, Object obj) {
        JSONObject m598 = m598(jSONObject, obj);
        m599(StringFog.decrypt("UuDYV19PrSty/Z1XFlmlM2Hlwg==\n", "E4T4MzY83Uc=\n"), m598);
        InterfaceC0881 interfaceC0881 = this.f3217;
        if (interfaceC0881 == null) {
            interfaceC0881 = this.f3216;
        }
        interfaceC0881.mo96(m598, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ｋ */
    public void mo98(JSONObject jSONObject, View view, Object obj) {
        JSONObject m598 = m598(jSONObject, obj);
        m599(StringFog.decrypt("5yYPUSJfLZbHO0pRcQ==\n", "pkIvNUssXfo=\n"), m598);
        InterfaceC0881 interfaceC0881 = this.f3217;
        if (interfaceC0881 == null) {
            interfaceC0881 = this.f3216;
        }
        interfaceC0881.mo98(m598, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﾇ */
    public final void mo100(JSONObject jSONObject, View view, D d, Object obj) {
        JSONObject m598 = m598(jSONObject, obj);
        m599(StringFog.decrypt("LGL7Q7s0AqAIYuE=\n", "bQbbINddYcs=\n"), m598);
        InterfaceC0881 interfaceC0881 = this.f3217;
        if (interfaceC0881 == null) {
            interfaceC0881 = this.f3216;
        }
        interfaceC0881.mo100(m598, view, d, obj);
    }

    /* renamed from: ﾒ */
    public abstract String mo79(Object obj);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m598(JSONObject jSONObject, Object obj) {
        try {
            String str = AbstractC0615.f2035;
            if (!jSONObject.has(str)) {
                jSONObject.put(str, mo79(obj));
            }
            String str2 = AbstractC0615.f2034;
            if (!jSONObject.has(str2)) {
                String str3 = AbstractC0370.f1112;
                jSONObject.put(str2, Calendar.getInstance().getTimeInMillis());
            }
            return jSONObject;
        } catch (JSONException e) {
            String str4 = f3215;
            AbstractC0420.m252(str4, str4, StringFog.decrypt("LZgU2LnAeg4NixLepYc5GR6PCMPrimoTBg==\n", "aOpmt8vgGXw=\n"), e, null, false);
            return jSONObject;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﾇ */
    public final void mo101(JSONObject jSONObject, View view, Object obj) {
        JSONObject m598 = m598(jSONObject, obj);
        m599(StringFog.decrypt("/NlYqliG9hzZ\n", "vb14yTTphXk=\n"), m598);
        InterfaceC0881 interfaceC0881 = this.f3217;
        if (interfaceC0881 == null) {
            interfaceC0881 = this.f3216;
        }
        interfaceC0881.mo101(m598, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﾒ */
    public final void mo104(JSONObject jSONObject, View view, D d, Object obj) {
        JSONObject m598 = m598(jSONObject, obj);
        m599(StringFog.decrypt("+fRSnYxMFDrd9FKYkkoacdLjSA==\n", "uJBy/uAld1E=\n"), m598);
        InterfaceC0881 interfaceC0881 = this.f3217;
        if (interfaceC0881 == null) {
            interfaceC0881 = this.f3216;
        }
        interfaceC0881.mo104(m598, view, d, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﾒ */
    public final void mo106(JSONObject jSONObject, View view, Object obj) {
        JSONObject m598 = m598(jSONObject, obj);
        m599(StringFog.decrypt("etpUzJpimdlt0Fne3jk=\n", "DLMxu7oD7a0=\n"), m598);
        InterfaceC0881 interfaceC0881 = this.f3217;
        if (interfaceC0881 == null) {
            interfaceC0881 = this.f3216;
        }
        interfaceC0881.mo106(m598, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﾒ */
    public final void mo105(JSONObject jSONObject, View view, C3986y c3986y, Object obj) {
        JSONObject m598 = m598(jSONObject, obj);
        m599(StringFog.decrypt("u0AIx/uTCqqYGQ==\n", "7CNr557lb8Q=\n"), m598);
        InterfaceC0881 interfaceC0881 = this.f3217;
        if (interfaceC0881 == null) {
            interfaceC0881 = this.f3216;
        }
        interfaceC0881.mo105(m598, view, c3986y, obj);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m599(String str, JSONObject jSONObject) {
        String str2 = f3215;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        AbstractC0420.m251(str2, str2, AbstractC0424.m255("yMjx\n", "6OXRgNKWolk=\n", sb, str), jSONObject, false);
    }
}
