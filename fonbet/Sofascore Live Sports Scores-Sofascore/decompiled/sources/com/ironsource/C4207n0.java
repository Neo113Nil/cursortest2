package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4207n0 {
    private IronSource.a a;
    private String b;
    private NetworkSettings c;
    private int d;
    private int e;
    private JSONObject f;
    private String g;
    private int h;
    private String i;

    public C4207n0(IronSource.a aVar, String str, int i, JSONObject jSONObject, String str2, int i2, String str3, NetworkSettings networkSettings, int i3) {
        this.a = aVar;
        this.b = str;
        this.e = i;
        this.f = jSONObject;
        this.g = str2;
        this.h = i2;
        this.i = str3;
        this.c = networkSettings;
        this.d = i3;
    }

    public IronSource.a a() {
        return this.a;
    }

    public String b() {
        return this.i;
    }

    public String c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public JSONObject e() {
        return this.f;
    }

    public int f() {
        return this.d;
    }

    public NetworkSettings g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public String i() {
        return this.b;
    }
}
