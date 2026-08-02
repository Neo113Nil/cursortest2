package com.mbridge.msdk.dycreator.error;

import xsna.vu5;

/* compiled from: DyError.java */
/* loaded from: classes13.dex */
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
        return vu5.b(new StringBuilder("DyError{errorCode="), this.a, '}');
    }

    public a(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
