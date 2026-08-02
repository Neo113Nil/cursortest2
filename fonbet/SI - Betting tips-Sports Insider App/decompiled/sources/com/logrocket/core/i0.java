package com.logrocket.core;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6596a;

    /* renamed from: b, reason: collision with root package name */
    public double f6597b;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6599d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public aa.i f6600e = null;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6598c = new HashMap();

    public i0(String str) {
        this.f6596a = str;
    }

    public final String a() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f6598c;
        for (String str : hashMap.keySet()) {
            arrayList.add(String.format("%s:%.0f", str, hashMap.get(str)));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            sb2.append((String) it.next());
        }
        while (it.hasNext()) {
            sb2.append(',');
            sb2.append((String) it.next());
        }
        return sb2.toString();
    }

    public final synchronized double b(String str) {
        double min;
        try {
            if (!this.f6599d.containsKey(str)) {
                this.f6599d.put(str, new aa.i(0.0d));
            }
            min = ((aa.i) this.f6599d.get(str)).f105b / Math.min(5, r0.f104a);
            this.f6597b += min;
            this.f6598c.put(str, Double.valueOf((this.f6598c.containsKey(str) ? ((Double) this.f6598c.get(str)).doubleValue() : 0.0d) + min));
        } catch (Throwable th2) {
            throw th2;
        }
        return min;
    }

    public final synchronized void c(String str, double d10, double d11) {
        this.f6597b -= d11;
        HashMap hashMap = this.f6598c;
        hashMap.put(str, Double.valueOf(((Double) hashMap.get(str)).doubleValue() - d11));
        aa.i iVar = (aa.i) this.f6599d.get(str);
        int i5 = iVar.f104a;
        iVar.f104a = i5 + 1;
        int i10 = i5 % 5;
        double d12 = iVar.f105b;
        double[] dArr = iVar.f106c;
        double d13 = d12 - dArr[i10];
        iVar.f105b = d13;
        dArr[i10] = d10;
        iVar.f105b = d13 + d10;
    }

    public final synchronized String toString() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("appID", this.f6596a);
                jSONObject.put("wallBytes", this.f6597b);
                jSONObject.put("wallByteStreams", a());
                jSONObject.put("upload", 0);
                jSONObject.put("bytes", 0);
                jSONObject.put("time", 0L);
                aa.i iVar = this.f6600e;
                if (iVar != null) {
                    jSONObject.put("snapshotTiming", iVar.f105b / Math.min(5, iVar.f104a));
                }
                jSONObject.put("sdkType", ConstantDeviceInfo.APP_PLATFORM);
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject.toString();
    }
}
