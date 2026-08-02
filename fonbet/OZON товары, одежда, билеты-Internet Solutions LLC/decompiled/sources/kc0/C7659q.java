package kc0;

import kc0.InterfaceC7643a;
import kotlin.jvm.internal.Intrinsics;
import r.o;

/* renamed from: kc0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7659q extends o.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7645c f71372a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC7643a.c f71373b;

    C7659q(C7645c c7645c, InterfaceC7643a.c cVar) {
        this.f71372a = c7645c;
        this.f71373b = cVar;
    }

    @Override // r.o.a
    public final void onAuthenticationError(int i11, CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        this.f71372a.C().z1(i11);
    }

    @Override // r.o.a
    public final void onAuthenticationSucceeded(o.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C7629C C11 = this.f71372a.C();
        InterfaceC7643a.c cVar = this.f71373b;
        C11.A1(cVar.a(), cVar.b());
    }
}
