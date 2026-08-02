package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.לּ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1024 implements InterfaceC0818 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0898 f3274;

    public C1024(C0898 c0898) {
        this.f3274 = c0898;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0818
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo394() {
        String m387;
        AbstractC0274 m142 = AbstractC0274.m142();
        C0643 c0643 = this.f3274.f3011.f2588;
        C1037 c1037 = ((C0346) m142).f3205;
        c1037.getClass();
        String decrypt = StringFog.decrypt("DCpRiQDBJ20T\n", "eFgw6mWjRg4=\n");
        String decrypt2 = StringFog.decrypt("Ydad\n", "VviteQxHj44=\n");
        C1095 c1095 = new C1095(c1037);
        c0643.getClass();
        C0625 c0625 = new C0625(decrypt, decrypt2);
        if (((C0346) AbstractC0274.m142()).f857.m354()) {
            String m355 = ((C0346) AbstractC0274.m142()).f857.m355(decrypt);
            if (TextUtils.isEmpty(m355)) {
                m387 = null;
                if (TextUtils.isEmpty(m387)) {
                    try {
                        c1037.f3308 = new JSONObject(m387);
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                return;
            }
            c0625 = new C0587(decrypt, decrypt2, m355);
        }
        m387 = c0643.m387(c0625, c1095);
        if (TextUtils.isEmpty(m387)) {
        }
    }
}
