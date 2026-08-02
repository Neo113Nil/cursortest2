package com.mbridge.msdk.config.component.load.model;

import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;
import java.net.URL;
import java.util.Map;

/* compiled from: DownloadModel.java */
/* loaded from: classes13.dex */
public class a {
    private String a;
    private String c;
    private int f;
    private String g;
    private float b = 1.0f;
    private int d = 30;
    private int e = 0;
    private String h = "0";

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("116"));
            if (obj != null) {
                this.a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("191"));
            if (obj2 != null) {
                try {
                    float parseFloat = Float.parseFloat(String.valueOf(obj2));
                    if (parseFloat <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || parseFloat > 1.0f) {
                        parseFloat = 1.0f;
                    }
                    this.b = parseFloat;
                } catch (Throwable th) {
                    q0.b("DownloadModel", th.getMessage());
                    this.b = 1.0f;
                }
            }
            Object obj3 = map.get(c.c("100"));
            if (obj3 != null) {
                this.c = String.valueOf(obj3);
            }
            Object obj4 = map.get(c.c("162"));
            if (obj4 != null) {
                try {
                    int parseInt = Integer.parseInt(String.valueOf(obj4));
                    if (parseInt == 0) {
                        parseInt = 30;
                    }
                    this.d = parseInt;
                } catch (Throwable th2) {
                    q0.b("DownloadModel", th2.getMessage());
                    this.d = 30;
                }
            }
            Object obj5 = map.get(c.c("174"));
            if (obj5 != null) {
                try {
                    this.e = Integer.parseInt(String.valueOf(obj5));
                } catch (Throwable th3) {
                    q0.b("DownloadModel", th3.getMessage());
                    this.e = 0;
                }
            }
            Object obj6 = map.get(c.c("192"));
            if (obj6 != null) {
                try {
                    this.f = Integer.parseInt(String.valueOf(obj6));
                } catch (Throwable th4) {
                    q0.b("DownloadModel", th4.getMessage());
                    this.f = 15;
                }
            }
            Object obj7 = map.get(c.c("201"));
            if (obj7 != null) {
                this.g = String.valueOf(obj7);
            } else {
                try {
                    URL url = new URL(f());
                    this.g = url.getProtocol() + "://" + url.getHost() + url.getPath();
                } catch (Throwable th5) {
                    q0.b("DownloadModel", th5.getMessage());
                }
            }
            Object obj8 = map.get(c.c("202"));
            if (obj8 != null) {
                this.h = String.valueOf(obj8);
            }
        }
    }

    public String b() {
        return this.g;
    }

    public String c() {
        return this.c;
    }

    public float d() {
        return this.b;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.a;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.d * 1000;
    }

    public String a() {
        return this.h;
    }
}
