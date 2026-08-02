package lb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.zzan;
import eb.C4196f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public Context f55723a;

    /* renamed from: b, reason: collision with root package name */
    public String f55724b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f55725c;

    /* renamed from: d, reason: collision with root package name */
    public G9.a f55726d;

    public Y(Context context, String str) {
        AbstractC3191o.m(context);
        this.f55724b = AbstractC3191o.g(str);
        this.f55723a = context.getApplicationContext();
        this.f55725c = this.f55723a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f55724b), 0);
        this.f55726d = new G9.a("StorageHelpers", new String[0]);
    }

    public final zzahv a(FirebaseUser firebaseUser) {
        AbstractC3191o.m(firebaseUser);
        String d10 = d(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.a()));
        if (d10 == null) {
            return null;
        }
        try {
            return zzahv.zzb(d10);
        } catch (zzaao unused) {
            this.f55726d.e("Failed to restore token data from persistent storage.", new Object[0]);
            return null;
        }
    }

    public final FirebaseUser b() {
        String d10 = d("com.google.firebase.auth.FIREBASE_USER");
        if (TextUtils.isEmpty(d10)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(d10);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return c(jSONObject);
            }
        } catch (Exception unused) {
            this.f55726d.e("Failed to restore user data from persistent storage.", new Object[0]);
        }
        return null;
    }

    public final zzaf c(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        zzah a10;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z10 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(zzab.g(jSONArray3.getString(i10)));
            }
            zzaf zzafVar = new zzaf(C4196f.o(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafVar.o0(zzahv.zzb(string));
            }
            if (!z10) {
                zzafVar.p0();
            }
            zzafVar.u0(str);
            if (jSONObject.has("userMetadata") && (a10 = zzah.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzafVar.v0(a10);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i11));
                    String optString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(optString) ? PhoneMultiFactorInfo.j(jSONObject2) : Objects.equals(optString, "totp") ? TotpMultiFactorInfo.j(jSONObject2) : null);
                }
                zzafVar.s0(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    arrayList3.add(zzan.h(new JSONObject(jSONArray.getString(i12))));
                }
                zzafVar.q0(arrayList3);
            }
            return zzafVar;
        } catch (zzaao e10) {
            e = e10;
            this.f55726d.j(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            this.f55726d.j(e);
            return null;
        } catch (IllegalArgumentException e12) {
            e = e12;
            this.f55726d.j(e);
            return null;
        } catch (JSONException e13) {
            e = e13;
            this.f55726d.j(e);
            return null;
        }
    }

    public final String d(String str) {
        String string = this.f55725c.getString(str, null);
        if (string != null) {
            return string.startsWith("ENCRYPTED:") ? U.b(this.f55723a, this.f55724b).a(string.substring(10)) : string;
        }
        return null;
    }

    public final void e(FirebaseUser firebaseUser, zzahv zzahvVar) {
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(zzahvVar);
        f(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.a()), zzahvVar.zzf());
    }

    public final void f(String str, String str2) {
        String d10 = U.b(this.f55723a, this.f55724b).d(str2);
        if (d10 != null) {
            this.f55725c.edit().putString(str, "ENCRYPTED:" + d10).apply();
        }
    }

    public final void g() {
        i("com.google.firebase.auth.FIREBASE_USER");
    }

    public final void h(FirebaseUser firebaseUser) {
        AbstractC3191o.m(firebaseUser);
        i(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.a()));
    }

    public final void i(String str) {
        this.f55725c.edit().remove(str).apply();
    }

    public final void j(FirebaseUser firebaseUser) {
        AbstractC3191o.m(firebaseUser);
        String k10 = k(firebaseUser);
        if (TextUtils.isEmpty(k10)) {
            return;
        }
        f("com.google.firebase.auth.FIREBASE_USER", k10);
    }

    public final String k(FirebaseUser firebaseUser) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        if (!(firebaseUser instanceof zzaf)) {
            return null;
        }
        zzaf zzafVar = (zzaf) firebaseUser;
        try {
            jSONObject.put("cachedTokenState", zzafVar.zze());
            jSONObject.put("applicationName", zzafVar.n0().p());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (zzafVar.C0() != null) {
                JSONArray jSONArray = new JSONArray();
                List C02 = zzafVar.C0();
                int size = C02.size();
                if (C02.size() > 30) {
                    this.f55726d.h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(C02.size()));
                    size = 30;
                }
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    z10 = true;
                    if (i10 >= size) {
                        break;
                    }
                    zzab zzabVar = (zzab) C02.get(i10);
                    if (zzabVar.n().equals("firebase")) {
                        z11 = true;
                    }
                    if (i10 == size - 1 && !z11) {
                        break;
                    }
                    jSONArray.put(zzabVar.h());
                    i10++;
                }
                if (!z11) {
                    for (int i11 = size - 1; i11 < C02.size() && i11 >= 0; i11++) {
                        zzab zzabVar2 = (zzab) C02.get(i11);
                        if (zzabVar2.n().equals("firebase")) {
                            jSONArray.put(zzabVar2.h());
                            break;
                        }
                        if (i11 == C02.size() - 1) {
                            jSONArray.put(zzabVar2.h());
                        }
                    }
                    z10 = z11;
                    if (!z10) {
                        this.f55726d.h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(C02.size()), Integer.valueOf(size));
                        if (C02.size() < 5) {
                            StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                            Iterator it = C02.iterator();
                            while (it.hasNext()) {
                                sb2.append(String.format("Provider - %s\n", ((zzab) it.next()).n()));
                            }
                            this.f55726d.h(sb2.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", zzafVar.m());
            jSONObject.put("version", "2");
            if (zzafVar.i() != null) {
                jSONObject.put("userMetadata", ((zzah) zzafVar.i()).b());
            }
            List b10 = ((C5430i) zzafVar.j()).b();
            if (b10 != null && !b10.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i12 = 0; i12 < b10.size(); i12++) {
                    jSONArray2.put(((MultiFactorInfo) b10.get(i12)).i());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List t02 = zzafVar.t0();
            if (t02 != null && !t02.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i13 = 0; i13 < t02.size(); i13++) {
                    jSONArray3.put(zzan.i((zzan) t02.get(i13)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            this.f55726d.i("Failed to turn object into JSON", e10, new Object[0]);
            throw new zzaao(e10);
        }
    }
}
