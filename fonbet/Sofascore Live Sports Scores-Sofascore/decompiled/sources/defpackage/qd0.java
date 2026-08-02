package defpackage;

import android.content.SharedPreferences;
import com.facebook.FacebookRequestError;
import com.facebook.b;
import com.facebook.g0;
import com.facebook.i0;
import com.facebook.internal.a0;
import com.facebook.internal.k0;
import com.facebook.w;
import com.facebook.z;
import com.ironsource.C4427z5;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class qd0 implements z {
    public final /* synthetic */ int a;

    public /* synthetic */ qd0(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        r9 = new java.net.URL(java.lang.String.valueOf(r8.get(com.ironsource.C4427z5.r)));
        defpackage.xd0.c = new defpackage.vd0(java.lang.String.valueOf(r8.get("dataset_id")), r9.getProtocol() + "://" + r9.getHost(), java.lang.String.valueOf(r8.get("access_key")));
        defpackage.xd0.d = new java.util.ArrayList();
        defpackage.rd0.a = true;
     */
    @Override // com.facebook.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(g0 g0Var) {
        switch (this.a) {
            case 0:
                g0Var.getClass();
                int i = rd0.m;
                i0 i0Var = i0.a;
                FacebookRequestError facebookRequestError = g0Var.c;
                boolean z = false;
                Object obj = null;
                r8 = null;
                r8 = null;
                r8 = null;
                r8 = null;
                r8 = null;
                r8 = null;
                r8 = null;
                r8 = null;
                LinkedHashMap linkedHashMap = null;
                if (facebookRequestError != null) {
                    b bVar = a0.a;
                    facebookRequestError.toString();
                    String.valueOf(facebookRequestError.i);
                    synchronized (w.b) {
                    }
                    if (!cw3.a.contains(rd0.class)) {
                        try {
                            SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                            if (sharedPreferences != null) {
                                String string = sharedPreferences.getString("dataset_id", null);
                                String string2 = sharedPreferences.getString(C4427z5.r, null);
                                String string3 = sharedPreferences.getString("access_key", null);
                                if (string != null && !StringsKt.R(string) && string2 != null && !StringsKt.R(string2) && string3 != null && !StringsKt.R(string3)) {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put(C4427z5.r, string2);
                                    linkedHashMap2.put("dataset_id", string);
                                    linkedHashMap2.put("access_key", string3);
                                    linkedHashMap = linkedHashMap2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } catch (Throwable th) {
                            cw3.a(rd0.class, th);
                            break;
                        }
                    }
                } else {
                    b bVar2 = a0.a;
                    HashSet hashSet = w.b;
                    synchronized (hashSet) {
                    }
                    JSONObject jSONObject = g0Var.b;
                    if (jSONObject != null) {
                        try {
                            obj = jSONObject.get("data");
                        } catch (NullPointerException e) {
                            b bVar3 = a0.a;
                            b.k(i0Var, "rd0", "CloudBridge Settings API response is not a valid json: \n%s ", de6.b(e));
                            return;
                        } catch (JSONException e2) {
                            b bVar4 = a0.a;
                            b.k(i0Var, "rd0", "CloudBridge Settings API response is not a valid json: \n%s ", de6.b(e2));
                            return;
                        }
                    }
                    obj.getClass();
                    HashMap g = k0.g(new JSONObject((String) CollectionsKt.firstOrNull(k0.f((JSONArray) obj))));
                    String str = (String) g.get(C4427z5.r);
                    String str2 = (String) g.get("dataset_id");
                    String str3 = (String) g.get("access_key");
                    if (str == null || str2 == null || str3 == null) {
                        synchronized (hashSet) {
                            break;
                        }
                    } else {
                        try {
                            xd0.c = new vd0(str2, str, str3);
                            xd0.d = new ArrayList();
                            rd0.R(g);
                            if (g.get("is_enabled") != null) {
                                Object obj2 = g.get("is_enabled");
                                obj2.getClass();
                                z = ((Boolean) obj2).booleanValue();
                            }
                            rd0.a = z;
                            break;
                        } catch (MalformedURLException e3) {
                            b bVar5 = a0.a;
                            de6.b(e3);
                            synchronized (w.b) {
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                g0Var.getClass();
                b bVar6 = a0.a;
                atk.a().getClass();
                synchronized (w.b) {
                    break;
                }
        }
    }
}
