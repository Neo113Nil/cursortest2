package com.mbridge.msdk.foundation.same.net.exception;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a extends Exception {
    public int a;
    public String b;
    public com.mbridge.msdk.foundation.same.net.toolbox.a c;

    public a(int i, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.a = i;
        this.c = aVar;
        this.b = str;
    }

    public a(int i, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.a = i;
        this.c = aVar;
    }
}
