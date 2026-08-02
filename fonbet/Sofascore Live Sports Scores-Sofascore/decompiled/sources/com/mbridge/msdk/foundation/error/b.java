package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import defpackage.mz1;
import defpackage.wv8;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b implements Serializable {
    private int a;
    private int b;
    private String c;
    private Throwable d;
    private CampaignEx e;
    private MBridgeIds f;
    private String g;
    private String h;
    private boolean i;
    private int j = -1;
    private String k;
    private HashMap<Object, Object> l;
    private int m;
    private String n;
    private String o;
    private String p;

    public b(int i, String str) {
        this.a = i;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.c = str;
        this.b = a.b(i);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.l.get(obj);
        }
        return null;
    }

    public void b(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.c = str;
    }

    public CampaignEx d() {
        return this.e;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }

    public String i() {
        return this.p;
    }

    public MBridgeIds j() {
        MBridgeIds mBridgeIds = this.f;
        if (mBridgeIds != null) {
            return mBridgeIds;
        }
        MBridgeIds mBridgeIds2 = new MBridgeIds();
        this.f = mBridgeIds2;
        return mBridgeIds2;
    }

    public String k() {
        return this.h;
    }

    public String l() {
        int i;
        String str = !TextUtils.isEmpty(this.c) ? this.c : "";
        if (TextUtils.isEmpty(str) && (i = this.a) != -1) {
            str = a.a(i);
        }
        Throwable th = this.d;
        if (th != null) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                return wv8.i(str, " # ", message);
            }
        }
        return str;
    }

    public String m() {
        return this.k;
    }

    public int n() {
        return this.j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MBFailureReason{errorCode=");
        sb.append(this.a);
        sb.append(", errorSubType=");
        sb.append(this.b);
        sb.append(", message='");
        sb.append(this.c);
        sb.append("', cause=");
        sb.append(this.d);
        sb.append(", campaign=");
        sb.append(this.e);
        sb.append(", ids=");
        sb.append(this.f);
        sb.append(", requestId='");
        sb.append(this.g);
        sb.append("', localRequestId='");
        sb.append(this.h);
        sb.append("', isHeaderBidding=");
        sb.append(this.i);
        sb.append(", typeD=");
        sb.append(this.j);
        sb.append(", reasonD='");
        sb.append(this.k);
        sb.append("', extraMap=");
        sb.append(this.l);
        sb.append(", serverErrorCode=");
        sb.append(this.m);
        sb.append(", errorUrl='");
        sb.append(this.n);
        sb.append("', serverErrorResponse='");
        return mz1.o(sb, this.o, "'}");
    }

    public void d(String str) {
        this.k = str;
    }

    public void a(CampaignEx campaignEx) {
        this.e = campaignEx;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f = mBridgeIds;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void a(Object obj, Object obj2) {
        HashMap<Object, Object> hashMap = this.l;
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.l = hashMap;
        }
        hashMap.put(obj, obj2);
    }

    public void a(Throwable th) {
        this.d = th;
    }

    public void a(int i) {
        this.j = i;
    }

    public b(int i) {
        this.a = i;
        this.b = a.b(i);
    }

    public void a(String str) {
        this.p = str;
    }
}
