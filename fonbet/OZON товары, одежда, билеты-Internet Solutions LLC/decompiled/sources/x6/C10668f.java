package x6;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import u6.C9975a;
import w6.C10442a;

/* renamed from: x6.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10668f {

    /* renamed from: a, reason: collision with root package name */
    private static final C10664b f105041a = new C10664b();

    /* renamed from: b, reason: collision with root package name */
    private static final C10663a f105042b = new C10663a();

    public static List<C9975a> a(String str) throws w6.c {
        return (List) f105041a.a(str);
    }

    public static String b(C10442a c10442a) throws w6.c {
        f105042b.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("encryptedCardData", c10442a.a());
            return jSONObject.toString();
        } catch (JSONException e11) {
            throw new w6.c("Failed to serialize CardRequest", e11);
        }
    }

    public static String c(K9.b bVar) throws w6.c {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bankId", bVar.d());
            jSONObject.put("versionMajor", bVar.f());
            jSONObject.put("versionMinor", bVar.g());
            return jSONObject.toString();
        } catch (JSONException e11) {
            throw new w6.c("Failed to serialize ClientInfoRequest", e11);
        }
    }
}
