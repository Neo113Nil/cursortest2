package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẏ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0900 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0894 f3018;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3019;

    public C0900(C0894 c0894, JSONObject jSONObject) {
        this.f3018 = c0894;
        this.f3019 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        String m495;
        boolean z;
        JSONObject jSONObject;
        C1031 c1031 = this.f3018.f3004;
        JSONObject jSONObject2 = this.f3019;
        c1031.f3289.f3094.m520(jSONObject2);
        C0926 c0926 = c1031.f3289;
        C0392 c0392 = c0926.f3104;
        C0841 c0841 = c0926.f3106;
        if (((C0346) AbstractC0274.m142()).f849) {
            m495 = c0926.m553().m495();
        } else {
            C0812 m553 = c0926.m553();
            synchronized (m553) {
                jSONObject = m553.f3206;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("undX\n", "zwU7R9Xi5O8=\n"));
            m495 = optJSONObject != null ? optJSONObject.optString(StringFog.decrypt("+Q==\n", "iRR+514U2co=\n"), m553.f2612) : m553.f2612;
        }
        String str = c0841.f2782;
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(StringFog.decrypt("bg==\n", "QVcxtFVfygY=\n"));
        if (m495 == null) {
            m495 = "";
        }
        sb.append(m495);
        String sb2 = sb.toString();
        C0926 c09262 = c1031.f3289;
        C0931 c0931 = c09262.f3102.f1176;
        Context context = c09262.f3096;
        C0346 c0346 = (C0346) AbstractC0274.m142();
        boolean z2 = true;
        if (!c0346.m195() || c0346.f850 == c0346.m197()) {
            z = true;
            z2 = false;
        } else {
            z = true;
        }
        C1033 c1033 = new C1033(c1031);
        c0392.getClass();
        if (TextUtils.isEmpty(sb2)) {
            String str2 = C0392.f1140;
            AbstractC0420.m246(str2, str2, StringFog.decrypt("7fITs0Q4ot3XvAK+Wymiys3vBr5FffDMyekXolx958DM9BejCAjQ5ZjzAPFaOPHZ1/IBtGA87M3U\n+QDxXzjwzJjyHaUILfDGzvUWtEw=\n", "uJxy0Shdgqk=\n"), z);
            return;
        }
        C0451 c0451 = new C0451(jSONObject2, sb2, c0931, context, z2);
        if (c0392.f1141) {
            AbstractC0420.m243(C0392.f1140, StringFog.decrypt("2wX+DWXTyzz8GPoNbp3ac6gD/R5l1stO7RvmDXnJjmvgD/1IRNjaa+cY+CVr08977RizH2vOjm/g\nH+cMZcrA\n", "iGqTaAq9rhw=\n"));
            return;
        }
        C0393 c0393 = new C0393(c0392, c1033, c0451);
        String str3 = AbstractC0370.f1112;
        try {
            Executors.newSingleThreadExecutor().execute(c0393);
        } catch (Throwable th) {
            AbstractC0356.m204(AbstractC0370.f1112, StringFog.decrypt("624OELRd4FDLfwkLrxPiCM9vBRGlXfFJ3Xc=\n", "rhx8f8Z9hSg=\n"), th, false);
        }
    }
}
