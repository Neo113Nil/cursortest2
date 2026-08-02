package com.facebook;

import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o extends q {
    public final int b;
    public final String c;

    public o(String str, int i, String str2) {
        super(str);
        this.b = i;
        this.c = str2;
    }

    @Override // com.facebook.q, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb.append(this.b);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        return mz1.o(sb, this.c, "}");
    }
}
