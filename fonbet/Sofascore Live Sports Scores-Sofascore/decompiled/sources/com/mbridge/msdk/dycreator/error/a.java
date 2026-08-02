package com.mbridge.msdk.dycreator.error;

import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private int a;
    private String b;

    public a(b bVar) {
        if (bVar != null) {
            this.a = bVar.g();
            this.b = bVar.h();
        }
    }

    public String toString() {
        return wv8.j(new StringBuilder("DyError{errorCode="), this.a, '}');
    }

    public a(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
