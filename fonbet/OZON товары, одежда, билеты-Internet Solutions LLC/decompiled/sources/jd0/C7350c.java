package jd0;

import N3.C3660k;
import Nc0.g;
import Sc.InterfaceC4008j;
import Vb0.b;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import jd0.AbstractC7348a;
import jd0.C7352e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: jd0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7350c extends AbstractC7348a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f69735d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Application f69736e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69737f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69738g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f69739h;

    /* renamed from: jd0.c$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f69740a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7350c f69741b;

        public a(@NotNull C7350c c7350c, Context mContext) {
            Intrinsics.checkNotNullParameter(mContext, "mContext");
            this.f69741b = c7350c;
            this.f69740a = mContext;
        }

        @JavascriptInterface
        public final void call(@NotNull String groupName, @NotNull String methodName, @NotNull String data) {
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(data, "data");
            StringBuilder sb2 = new StringBuilder("groupName = ");
            Nh.a.h(sb2, groupName, " methodName=", methodName, " data=");
            sb2.append(data);
            Toast.makeText(this.f69740a, sb2.toString(), 0).show();
            if (Intrinsics.d(groupName, "toolbar") && Intrinsics.d(methodName, "appearance")) {
                try {
                    JSONObject jSONObject = new JSONObject(data);
                    this.f69741b.r0().r(new g.a(jSONObject.getBoolean("backVisible"), jSONObject.getBoolean("closeVisible")));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: jd0.c$b */
    static final class b extends AbstractC7737t implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C7350c.q0(C7350c.this);
            return Unit.f71690a;
        }
    }

    /* renamed from: jd0.c$c, reason: collision with other inner class name */
    /* synthetic */ class C1142c extends C7735q implements Function1<Function1<? super Boolean, ? extends Unit>, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
            Function1<? super Boolean, ? extends Unit> p02 = function1;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C7350c) this.receiver).getClass();
            p02.invoke(Boolean.FALSE);
            return Unit.f71690a;
        }
    }

    /* renamed from: jd0.c$d */
    /* synthetic */ class d extends C7735q implements Function1<Function1<? super Boolean, ? extends Unit>, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
            Function1<? super Boolean, ? extends Unit> p02 = function1;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C7350c) this.receiver).getClass();
            p02.invoke(Boolean.FALSE);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7350c(@NotNull String screenId, @NotNull Application application, @NotNull InterfaceC4008j<Nc0.f> mainScreenContainer, @NotNull InterfaceC4008j<Pc0.c> authRouter, @NotNull yc0.c headersProvider) {
        super(headersProvider);
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        this.f69735d = screenId;
        this.f69736e = application;
        this.f69737f = mainScreenContainer;
        this.f69738g = authRouter;
        b bVar = new b();
        this.f69739h = bVar;
        Nc0.f value = mainScreenContainer.getValue();
        value.h();
        value.b(bVar);
        g0(authRouter.getValue().o(screenId).b());
    }

    public static final void q0(C7350c c7350c) {
        c7350c.g0(((Pc0.c) c7350c.f69738g.getValue()).o(c7350c.f69735d).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Nc0.f r0() {
        return (Nc0.f) this.f69737f.getValue();
    }

    private static void s0(Vb0.c cVar, C7352e.a aVar) {
        b.a aVar2 = Vb0.b.f28514a;
        String a11 = cVar.a();
        Map j11 = U.j(new Pair("data", aVar.b()), new Pair(ImagesContract.URL, aVar.c()), new Pair("error_code", aVar.a()), new Pair("trace_id", aVar.d()), new Pair("webview_type", Vb0.d.FINTECH_RECOVERY));
        aVar2.getClass();
        b.a.a(a11, j11);
    }

    @Override // jd0.AbstractC7348a
    public final void h0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!kotlin.text.h.e0(url, "tel:", false)) {
            ((Pc0.c) this.f69738g.getValue()).v(url);
            return;
        }
        Intent addFlags = new Intent("android.intent.action.DIAL", Uri.parse(url)).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        this.f69736e.startActivity(addFlags);
    }

    @Override // jd0.AbstractC7348a
    public final void i0() {
        r0().j();
    }

    @Override // jd0.AbstractC7348a
    public final void j0(@NotNull C7352e.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        s0(Vb0.c.NETWORK_ERROR, error);
        String a11 = error.a();
        String b11 = error.b();
        String c11 = error.c();
        StringBuilder d11 = C3660k.d("Error code = ", a11, ", description = ", b11, ", url = ");
        d11.append(c11);
        r0().v(new AbstractC7348a.b(Nk.a.b("fintechRecovery error: ", d11.toString())));
    }

    @Override // jd0.AbstractC7348a
    public final void k0(String str) {
        r0().q(str);
    }

    @Override // jd0.AbstractC7348a
    public final void l0() {
        Nc0.f r02 = r0();
        r02.o(new C1142c(1, this, C7350c.class, "onBackClicked", "onBackClicked(Lkotlin/jvm/functions/Function1;)V", 0));
        r02.f(new d(1, this, C7350c.class, "onClosedClicked", "onClosedClicked(Lkotlin/jvm/functions/Function1;)V", 0));
    }

    @Override // jd0.AbstractC7348a
    public final void m0(@NotNull C7352e.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        s0(Vb0.c.RENDER_ERROR, error);
    }

    @Override // jd0.AbstractC7348a
    @NotNull
    public final Map<Object, String> n0() {
        return U.i(new Pair(new a(this, this.f69736e), "native_bridge"));
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        Nc0.f r02 = r0();
        r02.q(null);
        r02.d(this.f69739h);
    }
}
