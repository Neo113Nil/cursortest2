package com.mbridge.msdk.mbbid.common;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class c {
    private String a;
    private String b;
    private String c;

    public c(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String getmFloorPrice() {
        return this.c;
    }

    public String getmPlacementId() {
        return this.a;
    }

    public String getmUnitId() {
        return this.b;
    }

    public void setmFloorPrice(String str) {
        this.c = str;
    }

    public void setmPlacementId(String str) {
        this.a = str;
    }

    public void setmUnitId(String str) {
        this.b = str;
    }

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
