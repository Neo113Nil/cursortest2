package com.ironsource;

import com.ironsource.Ve;
import xsna.zcl;

/* renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4462ne {
    private final C4623we a;
    private final Se b;
    private final C4278d9 c;

    public C4462ne(C4623we c4623we, Se se, C4278d9 c4278d9) {
        this.a = c4623we;
        this.b = se;
        this.c = c4278d9;
    }

    public final M1 a() {
        return this.a.a().b().d();
    }

    public final F1 b() {
        return this.a.a().b().b();
    }

    public final N5 c() {
        return this.a.b();
    }

    public final Ve d() {
        return this.a.c();
    }

    public final Gb e() {
        return this.a.a().b().f();
    }

    public final C4278d9 f() {
        return this.c;
    }

    public final Ve.a g() {
        return this.a.c().i();
    }

    public final C4623we h() {
        return this.a;
    }

    public final Se i() {
        return this.b;
    }

    public /* synthetic */ C4462ne(C4623we c4623we, Se se, C4278d9 c4278d9, int i, zcl zclVar) {
        this(c4623we, (i & 2) != 0 ? null : se, (i & 4) != 0 ? null : c4278d9);
    }

    public C4462ne(C4462ne c4462ne) {
        this(c4462ne.a, c4462ne.b, c4462ne.c);
    }
}
