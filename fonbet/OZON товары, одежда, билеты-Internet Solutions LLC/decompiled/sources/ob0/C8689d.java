package ob0;

import We.B;
import ob0.s;
import yb0.InterfaceC10879a;

/* renamed from: ob0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8689d extends InterfaceC10879a.AbstractC2296a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f77928a;

    /* renamed from: b, reason: collision with root package name */
    private final B.a f77929b;

    C8689d(s sVar, B.a aVar) {
        this.f77928a = sVar.e() == s.a.BlockAntibot;
        this.f77929b = aVar;
    }

    @Override // yb0.InterfaceC10879a.AbstractC2296a
    public final B.a a() {
        return this.f77929b;
    }

    @Override // yb0.InterfaceC10879a.AbstractC2296a
    public final boolean b() {
        return this.f77928a;
    }
}
