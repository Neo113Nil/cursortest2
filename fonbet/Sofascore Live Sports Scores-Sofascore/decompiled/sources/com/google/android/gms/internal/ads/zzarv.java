package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.fc6;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzarv {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public zzarv(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? fc6.h(i, "/", new StringBuilder(String.valueOf(i).length() + 1)) : "";
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        int length = String.valueOf(i2).length();
        String str = this.a;
        this.e = me4.g(i2, str, new StringBuilder(str.length() + length));
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        a70.r("generateNewId() must be called before retrieving ids.");
    }
}
