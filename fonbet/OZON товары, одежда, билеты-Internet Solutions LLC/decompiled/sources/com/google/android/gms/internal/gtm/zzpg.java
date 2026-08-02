package com.google.android.gms.internal.gtm;

import C.o0;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class zzpg {
    public static zzjs zza(Object obj) throws JSONException {
        String string;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            jSONArray2 = jSONObject.getJSONArray("params");
            jSONArray = jSONObject.getJSONArray("instructions");
        } else {
            if (!(obj instanceof JSONArray)) {
                throw new IllegalArgumentException("invalid JSON in runtime section");
            }
            JSONArray jSONArray3 = (JSONArray) obj;
            Preconditions.checkArgument(jSONArray3.length() >= 3);
            string = jSONArray3.getString(1);
            JSONArray jSONArray4 = jSONArray3.getJSONArray(2);
            JSONArray jSONArray5 = new JSONArray();
            for (int i11 = 1; i11 < jSONArray4.length(); i11++) {
                Preconditions.checkArgument(jSONArray4.get(i11) instanceof String);
                jSONArray5.put(jSONArray4.get(i11));
            }
            JSONArray jSONArray6 = new JSONArray();
            for (int i12 = 3; i12 < jSONArray3.length(); i12++) {
                jSONArray6.put(jSONArray3.get(i12));
            }
            jSONArray = jSONArray6;
            jSONArray2 = jSONArray5;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
            arrayList.add(jSONArray2.getString(i13));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            JSONArray jSONArray7 = jSONArray.getJSONArray(i14);
            if (jSONArray7.length() != 0) {
                arrayList2.add(zze(jSONArray7));
            }
        }
        return new zzjs(null, string, arrayList, arrayList2);
    }

    @VisibleForTesting
    static zzqm zzb(JSONArray jSONArray, List<zzqj> list, List<zzqj> list2) throws zzpf, JSONException {
        zzqk zzqkVar = new zzqk();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
            int i12 = 1;
            if (jSONArray2.getString(0).equals("if")) {
                while (i12 < jSONArray2.length()) {
                    zzqkVar.zzc(list2.get(jSONArray2.getInt(i12)));
                    i12++;
                }
            } else if (jSONArray2.getString(0).equals("unless")) {
                while (i12 < jSONArray2.length()) {
                    zzqkVar.zzb(list2.get(jSONArray2.getInt(i12)));
                    i12++;
                }
            } else if (jSONArray2.getString(0).equals(ProductAction.ACTION_ADD)) {
                while (i12 < jSONArray2.length()) {
                    zzqkVar.zza(list.get(jSONArray2.getInt(i12)));
                    i12++;
                }
            } else if (jSONArray2.getString(0).equals("block")) {
                while (i12 < jSONArray2.length()) {
                    zzqkVar.zzd(list.get(jSONArray2.getInt(i12)));
                    i12++;
                }
            } else {
                String valueOf = String.valueOf(jSONArray2.getString(0));
                zzf(valueOf.length() != 0 ? "Unknown Rule property: ".concat(valueOf) : new String("Unknown Rule property: "));
            }
        }
        return zzqkVar.zze();
    }

    @VisibleForTesting
    static zzqq zzc(Object obj, List<String> list) throws zzpf, JSONException {
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof Boolean) {
                return new zzqq(8, obj);
            }
            if (obj instanceof Integer) {
                return new zzqq(6, obj);
            }
            if (obj instanceof String) {
                return new zzqq(1, obj);
            }
            String valueOf = String.valueOf(obj);
            zzf(o0.c(new StringBuilder(valueOf.length() + 20), "Invalid value type: ", valueOf));
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        String string = jSONArray.getString(0);
        if (string.equals("escape")) {
            zzqq zzc = zzc(jSONArray.get(1), list);
            for (int i11 = 2; i11 < jSONArray.length(); i11++) {
                zzc.zza(jSONArray.getInt(i11));
            }
            return zzc;
        }
        if (string.equals("list")) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 1; i12 < jSONArray.length(); i12++) {
                arrayList.add(zzc(jSONArray.get(i12), list).zzc());
            }
            zzqq zzqqVar = new zzqq(2, arrayList);
            zzqqVar.zzb(true);
            return zzqqVar;
        }
        if (string.equals("map")) {
            HashMap hashMap = new HashMap();
            for (int i13 = 1; i13 < jSONArray.length(); i13 += 2) {
                hashMap.put(zzc(jSONArray.get(i13), list).zzc(), zzc(jSONArray.get(i13 + 1), list).zzc());
            }
            zzqq zzqqVar2 = new zzqq(3, hashMap);
            zzqqVar2.zzb(true);
            return zzqqVar2;
        }
        if (string.equals("macro")) {
            zzqq zzqqVar3 = new zzqq(4, list.get(jSONArray.getInt(1)));
            zzqqVar3.zzb(true);
            return zzqqVar3;
        }
        if (!string.equals("template")) {
            String valueOf2 = String.valueOf(obj);
            zzf(o0.c(new StringBuilder(valueOf2.length() + 20), "Invalid value type: ", valueOf2));
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 1; i14 < jSONArray.length(); i14++) {
            arrayList2.add(zzc(jSONArray.get(i14), list).zzc());
        }
        zzqq zzqqVar4 = new zzqq(7, arrayList2);
        zzqqVar4.zzb(true);
        return zzqqVar4;
    }

    @VisibleForTesting
    static List<zzqj> zzd(JSONArray jSONArray, List<String> list) throws JSONException, zzpf {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            zzqh zzqhVar = new zzqh();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzqs zzc = zzc(jSONObject.get(next), list).zzc();
                if ("push_after_evaluate".equals(next)) {
                    zzqhVar.zzb(zzc);
                } else {
                    zzqhVar.zza(next, zzc);
                }
            }
            arrayList.add(zzqhVar.zzc());
        }
        return arrayList;
    }

    private static zzrf zze(JSONArray jSONArray) throws JSONException {
        Preconditions.checkArgument(jSONArray.length() > 0);
        String string = jSONArray.getString(0);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < jSONArray.length(); i11++) {
            Object obj = jSONArray.get(i11);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() != 0) {
                    arrayList.add(zze(jSONArray2));
                }
            } else if (obj == JSONObject.NULL) {
                arrayList.add(zzra.zzd);
            } else {
                arrayList.add(zzri.zzb(obj));
            }
        }
        return new zzrf(string, arrayList);
    }

    private static void zzf(String str) throws zzpf {
        zzhl.zza(str);
        throw new zzpf(str);
    }
}
