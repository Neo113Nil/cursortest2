package com.inmobi.media;

import defpackage.iol;
import defpackage.ku3;
import defpackage.xw3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.z5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3928z5 implements Bj {
    public Sc a;
    public AbstractC3768t1 b;
    public E8 c;

    public C3928z5(E8 e8) {
        this.a = null;
        this.b = null;
        this.c = e8;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        ku3 a;
        InterfaceC3880x9 c;
        E8 e8 = this.c;
        if (e8 != null && (c = e8.c()) != null) {
            ((C3906y9) c).a("AUM-DestroyedState", "Initialize Called");
        }
        E8 e82 = this.c;
        if (e82 == null || (a = e82.a()) == null) {
            return;
        }
        xw3.L(a, null, null, new C3902y5(this, null), 3).n(new iol(this, 20));
    }

    public C3928z5(Sc sc, AbstractC3768t1 abstractC3768t1, E8 e8) {
        this.a = sc;
        this.b = abstractC3768t1;
        this.c = e8;
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    public static final Unit a(C3928z5 c3928z5, Throwable th) {
        InterfaceC3880x9 c;
        E8 e8 = c3928z5.c;
        if (e8 != null && (c = e8.c()) != null) {
            ((C3906y9) c).a();
        }
        E8 e82 = c3928z5.c;
        N3.a(e82 != null ? e82.a() : null);
        c3928z5.b = null;
        c3928z5.c = null;
        c3928z5.a = null;
        return Unit.a;
    }
}
