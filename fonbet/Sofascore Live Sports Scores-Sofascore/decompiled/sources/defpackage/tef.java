package defpackage;

import android.os.Bundle;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tef {
    public static boolean b;
    public static HashSet d;
    public static final tef a = new tef();
    public static final mqi c = ypa.b(zg3.H);

    public static final void b(Bundle bundle) {
        if (cw3.a.contains(tef.class)) {
            return;
        }
        try {
            if (b && bundle != null && !bundle.isEmpty() && d != null) {
                ArrayList<String> arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                keySet.getClass();
                for (String str : keySet) {
                    HashSet hashSet = d;
                    hashSet.getClass();
                    if (!hashSet.contains(str)) {
                        str.getClass();
                        arrayList.add(str);
                    }
                }
                boolean z = false;
                for (String str2 : arrayList) {
                    if (bundle.containsKey(str2)) {
                        bundle.remove(str2);
                        z = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z);
                bundle.putString("pm_metadata", jSONObject.toString());
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            cw3.a(tef.class, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:4:0x0009, B:9:0x0015, B:14:0x0048, B:22:0x005c, B:23:0x0060, B:38:0x0042, B:28:0x0022, B:31:0x0029, B:33:0x0034, B:18:0x0051), top: B:3:0x0009, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        HashSet hashSet;
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            u k = x.k(w.b(), false);
            if (k == null) {
                return;
            }
            JSONArray jSONArray = k.m;
            HashSet hashSet2 = null;
            if (!set.contains(this) && jSONArray != null) {
                try {
                } catch (Throwable th) {
                    cw3.a(this, th);
                }
                if (jSONArray.length() != 0) {
                    hashSet = new HashSet();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        string.getClass();
                        hashSet.add(string);
                    }
                    if (hashSet == null) {
                        if (!cw3.a.contains(this)) {
                            try {
                                hashSet2 = (HashSet) c.getValue();
                            } catch (Throwable th2) {
                                cw3.a(this, th2);
                            }
                        }
                        hashSet = hashSet2;
                    }
                    d = hashSet;
                }
            }
            hashSet = null;
            if (hashSet == null) {
            }
            d = hashSet;
        } catch (Throwable th3) {
            cw3.a(this, th3);
        }
    }

    public final boolean c(Bundle bundle) {
        if (cw3.a.contains(this) || bundle == null) {
            return false;
        }
        try {
            if (bundle.containsKey("pm")) {
                if (Intrinsics.c(bundle.get("pm"), "1")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            cw3.a(this, th);
            return false;
        }
    }
}
