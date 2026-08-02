package lb;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import z.C6900a;

/* loaded from: classes3.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final G9.a f55681a = new G9.a("JSONParser", new String[0]);

    public static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        AbstractC3191o.g(str);
        List<String> zza = zzt.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            f55681a.c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map d10 = d(new String(K9.c.b(zza.get(1)), "UTF-8"));
            return d10 == null ? new HashMap() : d10;
        } catch (UnsupportedEncodingException e10) {
            f55681a.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static Map c(JSONObject jSONObject) {
        C6900a c6900a = new C6900a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            c6900a.put(next, obj);
        }
        return c6900a;
    }

    public static Map d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            throw new zzaao(e10);
        }
    }
}
