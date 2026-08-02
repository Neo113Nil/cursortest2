package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.ignite.m;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class e {
    public String B;
    public String C;
    public String D;
    public String F;
    public CreativeType J;
    public long a;
    public long b;
    public long c;
    public String d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public UnitDisplayType n;
    public String o;
    public Map p;
    public String q;
    public ImpressionData r;
    public String u;
    public Exception w;
    public String x;
    public String y;
    public String z;
    public int s = 0;
    public float t = -1.0f;
    public int v = -1;
    public boolean A = false;
    public m E = m.NONE;
    public boolean G = false;
    public long H = 0;
    public boolean I = false;
    public int K = -1;
    public int L = -1;

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar);

    public final boolean a() {
        return (this.E == m.NONE || TextUtils.isEmpty(this.x) || TextUtils.isEmpty(this.D) || TextUtils.isEmpty(this.F)) ? false : true;
    }

    public abstract InneractiveErrorCode b();

    public final void a(String str) {
        long j;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        this.b = j;
        this.a = TimeUnit.MINUTES.toMillis(j) + this.c;
    }
}
