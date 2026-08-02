package x6;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import u6.C9975a;
import u6.EnumC9976b;

/* renamed from: x6.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10665c {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f105040a;

    static {
        HashMap hashMap = new HashMap();
        f105040a = hashMap;
        EnumC9976b enumC9976b = EnumC9976b.ACTIVE;
        hashMap.put("ACTIVE", enumC9976b);
        EnumC9976b enumC9976b2 = EnumC9976b.DISPOSED;
        hashMap.put("DISPOSED", enumC9976b2);
        EnumC9976b enumC9976b3 = EnumC9976b.PENDING;
        hashMap.put("PENDING", enumC9976b3);
        EnumC9976b enumC9976b4 = EnumC9976b.SUSPENDED;
        hashMap.put("SUSPENDED", enumC9976b4);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(enumC9976b, "ACTIVE");
        hashMap2.put(enumC9976b2, "DISPOSED");
        hashMap2.put(enumC9976b3, "PENDING");
        hashMap2.put(enumC9976b4, "SUSPENDED");
    }

    public final Object a(String str) throws w6.c {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("referenceId");
            String string2 = jSONObject.getString("maskedPan");
            String string3 = jSONObject.getString("expiryDate");
            String string4 = jSONObject.getString("state");
            EnumC9976b enumC9976b = (EnumC9976b) f105040a.get(string4);
            if (enumC9976b != null) {
                return new C9975a(string, string2, string3, enumC9976b);
            }
            throw new w6.c("Unknown card state: " + string4);
        } catch (JSONException e11) {
            throw new w6.c("Failed to deserialize Card", e11);
        }
    }
}
