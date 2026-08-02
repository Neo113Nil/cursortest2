package com.logrocket.core;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f6425a;

    /* renamed from: b, reason: collision with root package name */
    public String f6426b = "https://app.logrocket.com";

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6427c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6428d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6429e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6430f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6431g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6432h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6433i;
    public final a0 j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6434k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6435l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6436m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6437n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6438o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6439p;
    public final String q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6440r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6441s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6442t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f6443u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6444v;

    public f() {
        ArrayList arrayList = new ArrayList();
        this.f6427c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f6428d = arrayList2;
        this.f6444v = 2;
        this.f6429e = 60000;
        this.f6430f = true;
        this.f6431g = true;
        this.f6432h = true;
        this.f6433i = true;
        this.j = a0.f6404a;
        this.f6434k = true;
        this.f6435l = true;
        this.f6436m = true;
        this.f6437n = true;
        this.f6438o = "";
        this.f6439p = 256000;
        this.q = "";
        this.f6440r = true;
        this.f6441s = 100;
        this.f6442t = 20;
        this.f6443u = true;
        arrayList.add("lr-hide");
        arrayList2.add("lr-show");
    }

    public final String toString() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f6427c.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f6428d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next().toString());
            }
            jSONObject.put("serverURL", "https://r.lr-intake.com/i");
            jSONObject.put("dashboardURL", this.f6426b);
            jSONObject.put("enableViewScanning", true);
            jSONObject.put("enableUploader", true);
            jSONObject.put("enablePersistence", true);
            jSONObject.put("enableIPCapture", true);
            jSONObject.put("logLevel", "OFF");
            jSONObject.put("uploadIntervalMs", AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            jSONObject.put("viewScanIntervalSeconds", 1);
            jSONObject.put("redactionTags", jSONArray);
            jSONObject.put("allowTags", jSONArray2);
            int i5 = this.f6444v;
            if (i5 == 1) {
                str = "EXCLUDED";
            } else {
                if (i5 != 2) {
                    throw null;
                }
                str = "NONE";
            }
            jSONObject.put("textSanitizer", str);
            jSONObject.put("bufferTimeoutMs", this.f6429e);
            jSONObject.put("enableCaptureDeduplication", this.f6430f);
            jSONObject.put("enableBitmapCapture", this.f6431g);
            jSONObject.put("enableHardwareBitmapCapture", this.f6432h);
            jSONObject.put("enableAppAliveCheck", this.f6433i);
            jSONObject.put("connectionType", this.j.toString());
            jSONObject.put("shouldSendCrashReport", this.f6434k);
            jSONObject.put("shouldDetectExceptions", this.f6435l);
            jSONObject.put("enableJetpackCompose", this.f6436m);
            jSONObject.put("forceCleanStart", false);
            jSONObject.put("captureRedactedViewTouches", this.f6437n);
            jSONObject.put("maxViewCaptureBytes", this.f6439p);
            jSONObject.put("windowCallbackEnabled", this.f6440r);
            jSONObject.put("viewCaptureTimeoutThreshold", this.f6441s);
            jSONObject.put("viewCaptureAdditionalWireframeDuration", this.f6442t);
        } catch (JSONException e7) {
            if (e7.getMessage() != null) {
                return e7.getMessage();
            }
        }
        return jSONObject.toString();
    }
}
