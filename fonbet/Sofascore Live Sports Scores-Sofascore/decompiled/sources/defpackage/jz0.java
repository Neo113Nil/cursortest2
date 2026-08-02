package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jz0 {
    public static boolean b;
    public static final jz0 a = new jz0();
    public static HashSet c = new HashSet();

    public static final void a(Bundle bundle) {
        if (cw3.a.contains(jz0.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            cw3.a(jz0.class, th);
        }
    }
}
