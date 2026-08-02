package com.fyber.inneractive.sdk.player.cache;

import defpackage.bf3;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e {
    public final String a;
    public final long[] b;
    public boolean c;
    public d d;
    public final /* synthetic */ g e;

    public e(g gVar, String str) {
        this.e = gVar;
        this.a = str;
        this.b = new long[gVar.g];
    }

    public final File a(int i) {
        return new File(this.e.a, bf3.h(i, this.a, ".", new StringBuilder()));
    }

    public final File b(int i) {
        return new File(this.e.a, this.a + "." + i + ".tmp");
    }
}
