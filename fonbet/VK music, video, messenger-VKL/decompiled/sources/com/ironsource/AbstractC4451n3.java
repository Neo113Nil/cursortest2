package com.ironsource;

import xsna.go9;
import xsna.zcl;

/* renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4451n3 {
    private final int a;
    private final String b;
    private final boolean c;
    private final C4354hd d;

    public AbstractC4451n3(int i, String str, boolean z, C4354hd c4354hd) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = c4354hd;
    }

    public final C4354hd a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public String toString() {
        return go9.b("placement name: ", this.b);
    }

    public final boolean a(int i) {
        return this.a == i;
    }

    public /* synthetic */ AbstractC4451n3(int i, String str, boolean z, C4354hd c4354hd, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c4354hd);
    }
}
