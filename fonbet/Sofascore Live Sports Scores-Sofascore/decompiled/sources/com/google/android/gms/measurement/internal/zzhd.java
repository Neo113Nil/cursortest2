package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaif;
import com.ironsource.C4427z5;
import defpackage.lmo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhd {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ lmo d;

    public zzhd(lmo lmoVar, String str) {
        this.d = lmoVar;
        Preconditions.f(str);
        this.a = str;
        this.b = new Bundle();
    }

    public final Bundle a() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        lmo lmoVar = this.d;
        zzic zzicVar = (zzic) lmoVar.b;
        if (this.c == null) {
            String string3 = lmoVar.U().getString(this.a, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString(C4427z5.q);
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            zzgu zzguVar = zzicVar.f;
                            zzic.m(zzguVar);
                            zzguVar.g.a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            zzaif.a();
                                            if (zzicVar.d.b0(null, zzfy.P0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        zzaif.a();
                                        if (zzicVar.d.b0(null, zzfy.P0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.g.b(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    zzgu zzguVar3 = zzicVar.f;
                    zzic.m(zzguVar3);
                    zzguVar3.g.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        Bundle bundle2 = this.c;
        Preconditions.i(bundle2);
        return new Bundle(bundle2);
    }

    public final void b(Bundle bundle) {
        lmo lmoVar = this.d;
        zzic zzicVar = (zzic) lmoVar.b;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor edit = lmoVar.U().edit();
        int size = bundle2.size();
        String str = this.a;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C4427z5.q, str2);
                        zzaif.a();
                        if (!zzicVar.d.b0(null, zzfy.P0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzgu zzguVar = zzicVar.f;
                                zzic.m(zzguVar);
                                zzguVar.g.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            zzgu zzguVar2 = zzicVar.f;
                            zzic.m(zzguVar2);
                            zzguVar2.g.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        zzgu zzguVar3 = zzicVar.f;
                        zzic.m(zzguVar3);
                        zzguVar3.g.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.c = bundle2;
    }
}
