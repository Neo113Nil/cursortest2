package io.seon.androidsdk.service;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.seon.androidsdk.service.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4954j3 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f53372A;

    /* renamed from: a, reason: collision with root package name */
    public String[] f53373a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f53374b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f53375c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f53376d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f53377e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f53378f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f53379g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f53380h;

    /* renamed from: i, reason: collision with root package name */
    public String[] f53381i;

    /* renamed from: j, reason: collision with root package name */
    public String[] f53382j;

    /* renamed from: k, reason: collision with root package name */
    public String[] f53383k;

    /* renamed from: l, reason: collision with root package name */
    public String[] f53384l;

    /* renamed from: m, reason: collision with root package name */
    public String[] f53385m;

    /* renamed from: n, reason: collision with root package name */
    public String[] f53386n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f53387o;

    /* renamed from: p, reason: collision with root package name */
    public String[] f53388p;

    /* renamed from: q, reason: collision with root package name */
    public String[] f53389q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f53390r;

    /* renamed from: s, reason: collision with root package name */
    public String[] f53391s;

    /* renamed from: t, reason: collision with root package name */
    public String[] f53392t;

    /* renamed from: u, reason: collision with root package name */
    public String[] f53393u;

    /* renamed from: v, reason: collision with root package name */
    public String[] f53394v;

    /* renamed from: w, reason: collision with root package name */
    public String[] f53395w;

    /* renamed from: x, reason: collision with root package name */
    public String[] f53396x;

    /* renamed from: y, reason: collision with root package name */
    public String[] f53397y;

    /* renamed from: z, reason: collision with root package name */
    public int f53398z;

    public static Object a(Object obj) {
        if (obj instanceof HashMap) {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = (HashMap) obj;
            for (Object obj2 : hashMap.keySet()) {
                jSONObject.put(obj2.toString(), a(hashMap.get(obj2)));
            }
            return jSONObject;
        }
        if (!(obj instanceof Iterable)) {
            return obj;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put(a(it.next()));
        }
        return jSONArray;
    }

    public static JSONArray b(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        if (objArr == null) {
            jSONArray.put(JSONObject.NULL);
            return jSONArray;
        }
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("processNames", b(this.f53374b));
            jSONObject.put("qemuDrivers", b(this.f53376d));
            jSONObject.put("propertiesWithSeekValues", a(this.f53377e));
            jSONObject.put("packageNames", b(this.f53378f));
            jSONObject.put("ipValues", b(this.f53379g));
            jSONObject.put("ssidValues", b(this.f53380h));
            jSONObject.put("buildFingerprintFilters", b(this.f53381i));
            jSONObject.put("buildModelFilters", b(this.f53382j));
            jSONObject.put("buildDeviceFilters", b(this.f53383k));
            jSONObject.put("buildManufacturerFilters", b(this.f53384l));
            jSONObject.put("buildDisplayFilters", b(this.f53385m));
            jSONObject.put("buildHardwareFilters", b(this.f53386n));
            jSONObject.put("buildProductFilters", b(this.f53387o));
            jSONObject.put("buildBoardFilters", b(this.f53388p));
            jSONObject.put("buildBootloaderFilters", b(this.f53389q));
            jSONObject.put("buildHostFilters", b(this.f53390r));
            jSONObject.put("buildRadioFilters", b(this.f53391s));
            jSONObject.put("buildBrandFilters", b(this.f53392t));
            jSONObject.put("buildFlavorFilters", b(this.f53393u));
            jSONObject.put("cpuTypes", b(this.f53394v));
            jSONObject.put("kernelArchitectures", b(this.f53395w));
            jSONObject.put("kernelVersions", b(this.f53396x));
            jSONObject.put("minPropertiesThreshold", this.f53398z);
            jSONObject.put("checkTelephony", false);
            jSONObject.put("checkPackageNames", this.f53372A);
            jSONObject.put("sensorNames", this.f53397y);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }
}
