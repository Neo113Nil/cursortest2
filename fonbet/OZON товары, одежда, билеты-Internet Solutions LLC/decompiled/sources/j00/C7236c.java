package j00;

import Jb.e;
import k00.C7451d;
import n00.C8406a;

/* renamed from: j00.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7236c implements e<C7235b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<n00.c> f68717a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C8406a> f68718b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<C7451d> f68719c;

    public C7236c(Pc.a<n00.c> aVar, Pc.a<C8406a> aVar2, Pc.a<C7451d> aVar3) {
        this.f68717a = aVar;
        this.f68718b = aVar2;
        this.f68719c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new C7235b(this.f68717a.get(), this.f68718b.get(), this.f68719c.get());
    }
}
