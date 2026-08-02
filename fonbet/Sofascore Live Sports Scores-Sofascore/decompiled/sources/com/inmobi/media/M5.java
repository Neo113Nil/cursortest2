package com.inmobi.media;

import defpackage.bf3;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M5 {
    public final String a;
    public final long[] b;
    public boolean c;
    public L5 d;
    public final /* synthetic */ P5 e;

    public M5(P5 p5, String str) {
        this.e = p5;
        this.a = str;
        this.b = new long[p5.h];
    }

    public final File a(int i) {
        return new File(this.e.b, bf3.h(i, this.a, ".", new StringBuilder()));
    }

    public final File b(int i) {
        return new File(this.e.b, this.a + "." + i + ".tmp");
    }
}
