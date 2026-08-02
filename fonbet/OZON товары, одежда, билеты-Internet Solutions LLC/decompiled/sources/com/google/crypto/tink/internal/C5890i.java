package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.a0;
import f8.E;
import f8.G;
import f8.O;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5890i<P> implements S7.f<P> {

    /* renamed from: a, reason: collision with root package name */
    final String f59268a;

    /* renamed from: b, reason: collision with root package name */
    final Class<P> f59269b;

    /* renamed from: c, reason: collision with root package name */
    final E.c f59270c;

    /* renamed from: d, reason: collision with root package name */
    final a0<? extends S> f59271d;

    C5890i(String str, Class<P> cls, E.c cVar, a0<? extends S> a0Var) {
        this.f59271d = a0Var;
        this.f59268a = str;
        this.f59269b = cls;
        this.f59270c = cVar;
    }

    public static C5890i d(String str, Class cls, E.c cVar, a0 a0Var) {
        return new C5890i(str, cls, cVar, a0Var);
    }

    @Override // S7.f
    public final Class<P> a() {
        return this.f59269b;
    }

    @Override // S7.f
    public final f8.E b(AbstractC5903i abstractC5903i) throws GeneralSecurityException {
        G.b L11 = f8.G.L();
        L11.j(this.f59268a);
        L11.k(abstractC5903i);
        L11.i(O.RAW);
        F f7 = (F) u.a().j(p.c().b(u.a().d(G.a(L11.b())), null), S7.e.a());
        E.b L12 = f8.E.L();
        L12.j(f7.f());
        L12.k(f7.g());
        L12.i(f7.c());
        return L12.b();
    }

    @Override // S7.f
    public final P c(AbstractC5903i abstractC5903i) throws GeneralSecurityException {
        return (P) t.b().a(u.a().b(F.a(this.f59268a, abstractC5903i, this.f59270c, O.RAW, null), S7.e.a()), this.f59269b);
    }
}
