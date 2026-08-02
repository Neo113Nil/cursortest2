package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzqp;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33427a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f33428b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f33429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L2 f33430d;

    public H2(L2 l22, String str, Bundle bundle) {
        Objects.requireNonNull(l22);
        this.f33430d = l22;
        AbstractC3191o.g(str);
        this.f33427a = str;
        this.f33428b = new Bundle();
    }

    public final Bundle a() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        if (this.f33429c == null) {
            L2 l22 = this.f33430d;
            String string3 = l22.p().getString(this.f33427a, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i10);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            this.f33430d.f33578a.a().o().a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            zzqp.zza();
                                            if (l22.f33578a.w().H(null, AbstractC3209a2.f33835R0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i11 = 0; i11 < length; i11++) {
                                                    jArr[i11] = jSONArray2.optLong(i11);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        zzqp.zza();
                                        if (l22.f33578a.w().H(null, AbstractC3209a2.f33835R0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i12 = 0; i12 < length2; i12++) {
                                                iArr[i12] = jSONArray3.optInt(i12);
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
                        } else if (string2.equals(W9.d.f13160a)) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        l22.f33578a.a().o().b("Unrecognized persisted bundle type. Type", string2);
                    }
                    this.f33429c = bundle;
                } catch (JSONException unused2) {
                    this.f33430d.f33578a.a().o().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f33429c == null) {
                this.f33429c = this.f33428b;
            }
        }
        return new Bundle((Bundle) AbstractC3191o.m(this.f33429c));
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        L2 l22 = this.f33430d;
        SharedPreferences.Editor edit = l22.p().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.f33427a);
        } else {
            String str = this.f33427a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzqp.zza();
                        C3298l3 c3298l3 = l22.f33578a;
                        if (!c3298l3.w().H(null, AbstractC3209a2.f33835R0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", W9.d.f13160a);
                            } else {
                                c3298l3.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
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
                            jSONObject.put("t", W9.d.f13160a);
                        } else {
                            c3298l3.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.f33430d.f33578a.a().o().b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f33429c = bundle2;
    }
}
