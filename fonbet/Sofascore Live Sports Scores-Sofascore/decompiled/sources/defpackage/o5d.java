package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class o5d {
    public final /* synthetic */ k8f a;

    public final void a(g5d g5dVar) {
        JSONObject jSONObject;
        byte[] bArr = g5dVar.c;
        bArr.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        try {
            jSONObject = new JSONObject(new String(bArr, charset));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        ((j8f) this.a).d(jSONObject);
    }
}
