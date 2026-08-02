package jd0;

import N3.C3660k;
import Sc.InterfaceC4008j;
import Vb0.b;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import jd0.AbstractC7348a;
import jd0.C7352e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jd0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7351d extends AbstractC7348a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f69743d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69744e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69745f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f69746g;

    /* renamed from: jd0.d$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C7351d.p0(C7351d.this);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7351d(@NotNull String screenId, @NotNull InterfaceC4008j<Nc0.f> mainScreenContainer, @NotNull InterfaceC4008j<Pc0.c> authRouter, @NotNull yc0.c headersProvider) {
        super(headersProvider);
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        this.f69743d = screenId;
        this.f69744e = mainScreenContainer;
        this.f69745f = authRouter;
        a aVar = new a();
        this.f69746g = aVar;
        Nc0.f value = mainScreenContainer.getValue();
        value.h();
        value.b(aVar);
        g0(authRouter.getValue().o(screenId).b());
    }

    public static final void p0(C7351d c7351d) {
        c7351d.g0(((Pc0.c) c7351d.f69745f.getValue()).o(c7351d.f69743d).b());
    }

    private static void q0(Vb0.c cVar, C7352e.a aVar) {
        b.a aVar2 = Vb0.b.f28514a;
        String a11 = cVar.a();
        Map j11 = U.j(new Pair("data", aVar.b()), new Pair(ImagesContract.URL, aVar.c()), new Pair("error_code", aVar.a()), new Pair("trace_id", aVar.d()), new Pair("webview_type", Vb0.d.OZON_ID_AUTH));
        aVar2.getClass();
        b.a.a(a11, j11);
    }

    @Override // jd0.AbstractC7348a
    public final void h0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ((Pc0.c) this.f69745f.getValue()).v(url);
    }

    @Override // jd0.AbstractC7348a
    public final void i0() {
        ((Nc0.f) this.f69744e.getValue()).j();
    }

    @Override // jd0.AbstractC7348a
    public final void j0(@NotNull C7352e.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        q0(Vb0.c.NETWORK_ERROR, error);
        String a11 = error.a();
        String b11 = error.b();
        String c11 = error.c();
        StringBuilder d11 = C3660k.d("Error code = ", a11, ", description = ", b11, ", url = ");
        d11.append(c11);
        ((Nc0.f) this.f69744e.getValue()).v(new AbstractC7348a.b(Nk.a.b("webView error: ", d11.toString())));
    }

    @Override // jd0.AbstractC7348a
    public final void k0(String str) {
        ((Nc0.f) this.f69744e.getValue()).q(str);
    }

    @Override // jd0.AbstractC7348a
    public final void m0(@NotNull C7352e.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        q0(Vb0.c.RENDER_ERROR, error);
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        Nc0.f fVar = (Nc0.f) this.f69744e.getValue();
        fVar.q(null);
        fVar.d(this.f69746g);
    }
}
