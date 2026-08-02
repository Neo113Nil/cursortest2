package r3;

import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import com.google.common.util.concurrent.q;
import java.io.IOException;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9168a implements InterfaceC4866h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f82873a;

    C9168a(q qVar) {
        this.f82873a = qVar;
    }

    @Override // We.InterfaceC4866h
    public final void onFailure(InterfaceC4865g interfaceC4865g, IOException iOException) {
        this.f82873a.w(iOException);
    }

    @Override // We.InterfaceC4866h
    public final void onResponse(InterfaceC4865g interfaceC4865g, L l11) {
        this.f82873a.v(l11);
    }
}
