package ob0;

import Hb0.f;
import Kb0.K;
import Sc.InterfaceC4008j;
import Vb0.b;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Map;
import jc0.C7346i;
import jd0.C7355h;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import ob0.s;
import org.jetbrains.annotations.NotNull;
import pb0.C8893a;
import qb0.InterfaceC9018a;
import sb0.C9649b;
import sb0.C9651d;
import sb0.InterfaceC9652e;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;

/* renamed from: ob0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8685A {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8893a> f77868a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9649b> f77869b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f77870c;

    /* renamed from: d, reason: collision with root package name */
    private G f77871d;

    /* JADX WARN: Multi-variable type inference failed */
    public C8685A(@NotNull InterfaceC4008j<C8893a> antibotCallback, @NotNull InterfaceC4008j<C9649b> antibotCaptchaChallengeManager, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(antibotCallback, "antibotCallback");
        Intrinsics.checkNotNullParameter(antibotCaptchaChallengeManager, "antibotCaptchaChallengeManager");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f77868a = antibotCallback;
        this.f77869b = antibotCaptchaChallengeManager;
        this.f77870c = featureFlagsStore;
    }

    private static void c(boolean z11) {
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.l().l().getValue().k(z11);
    }

    public static void f() {
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        if (r13 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        x xVar;
        int i11;
        C8685A c8685a;
        InterfaceC9018a interfaceC9018a;
        ViewGroup view;
        G g10;
        try {
            if (cVar instanceof x) {
                xVar = (x) cVar;
                int i12 = xVar.f78017i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    xVar.f78017i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = xVar.f78015g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = xVar.f78017i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        C8893a value = this.f77868a.getValue();
                        xVar.f78012d = this;
                        xVar.f78013e = componentCallbacksC5392m;
                        xVar.f78014f = z11;
                        xVar.f78017i = 1;
                        obj = value.d(xVar);
                        if (obj != aVar) {
                            c8685a = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Boolean.TRUE;
                    }
                    z11 = xVar.f78014f;
                    componentCallbacksC5392m = xVar.f78013e;
                    C8685A c8685a2 = xVar.f78012d;
                    Sc.s.b(obj);
                    c8685a = c8685a2;
                    ComponentCallbacksC5392m componentCallbacksC5392m2 = componentCallbacksC5392m;
                    boolean z12 = z11;
                    interfaceC9018a = (InterfaceC9018a) obj;
                    if (interfaceC9018a != null || (view = interfaceC9018a.getView()) == null) {
                        return Boolean.FALSE;
                    }
                    c8685a.getClass();
                    try {
                        g10 = i0.a(view).getChildFragmentManager();
                    } catch (IllegalStateException unused) {
                        g10 = null;
                    }
                    if (g10 == null) {
                        Context context = view.getContext();
                        androidx.fragment.app.r rVar = context instanceof androidx.fragment.app.r ? (androidx.fragment.app.r) context : null;
                        g10 = rVar != null ? rVar.getSupportFragmentManager() : null;
                        if (g10 == null) {
                            g10 = null;
                        }
                    }
                    if (g10 == null) {
                        return Boolean.FALSE;
                    }
                    c8685a.f77871d = g10;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    y yVar = new y(c8685a, view, componentCallbacksC5392m2, z12, null);
                    xVar.f78012d = null;
                    xVar.f78013e = null;
                    xVar.f78017i = 2;
                    obj = C10727i.f(l02, yVar, xVar);
                }
            }
            if (i11 != 0) {
            }
            ComponentCallbacksC5392m componentCallbacksC5392m22 = componentCallbacksC5392m;
            boolean z122 = z11;
            interfaceC9018a = (InterfaceC9018a) obj;
            if (interfaceC9018a != null) {
            }
            return Boolean.FALSE;
        } catch (IllegalStateException e11) {
            b.a.c(Vb0.b.f28514a, e11);
            return Boolean.FALSE;
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.f78015g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = xVar.f78017i;
    }

    public final void d() {
        List<ComponentCallbacksC5392m> r02;
        G g10 = this.f77871d;
        if (((g10 == null || (r02 = g10.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02)) instanceof C9651d) {
            this.f77869b.getValue().e(new s.b(s.c.CaptchaChallengeWebViewClosed, null));
        } else {
            c(false);
        }
    }

    public final void e() {
        c(((Boolean) this.f77870c.getValue().b(f.i.f10806a)).booleanValue());
    }

    public final Object g(@NotNull String captchaUrl, @NotNull Map<String, String> additionalHttpHeaders, @NotNull InterfaceC9652e listener, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(captchaUrl, "captchaUrl");
        Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
        C9651d c9651d = new C9651d();
        C9651d.f98513d = listener;
        c9651d.setArguments(androidx.core.os.d.b(new Pair(ImagesContract.URL, captchaUrl), new Pair("headers", additionalHttpHeaders)));
        Object i11 = i(c9651d, false, (kotlin.coroutines.jvm.internal.c) dVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    public final Object h(@NotNull String incidentId, String str, boolean z11, String str2, String str3, Boolean bool, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        boolean e11 = k11.k().getValue().e();
        boolean z12 = (Intrinsics.d(bool, Boolean.TRUE) || (kotlin.text.h.e0(incidentId, "fab_vpn_", false) || kotlin.text.h.e0(incidentId, "bal_vpn_", false)) || ((Boolean) this.f77870c.getValue().b(f.i.f10806a)).booleanValue()) ? false : true;
        Intrinsics.checkNotNullParameter(incidentId, "incidentId");
        q qVar = new q();
        qVar.setArguments(androidx.core.os.d.b(new Pair("incident_id", incidentId), new Pair("support_url", str), new Pair("show_close_button", Boolean.valueOf(z12)), new Pair("is_network_fail", Boolean.valueOf(z11)), new Pair("antibot_flow_result_code", str2), new Pair("error_text", str3), new Pair("is_from_auth_flow", Boolean.valueOf(e11))));
        return i(qVar, false, (kotlin.coroutines.jvm.internal.c) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object obj;
        if (CookieManager.getInstance() != null) {
            if (C7346i.a(str)) {
                C7355h.f69763g = new z(this);
                obj = i(C7355h.a.a(jd0.p.Antibot, null, str, 2), true, (kotlin.coroutines.jvm.internal.c) dVar);
                if (obj != Wc.a.COROUTINE_SUSPENDED) {
                    obj = Unit.f71690a;
                }
            } else {
                obj = Unit.f71690a;
            }
            return obj != Wc.a.COROUTINE_SUSPENDED ? obj : Unit.f71690a;
        }
        b.a aVar = Vb0.b.f28514a;
        String a11 = Vb0.c.NOT_FOUND.a();
        Map j11 = U.j(new Pair(ImagesContract.URL, str), new Pair("webview_type", Vb0.d.ANTIBOT));
        aVar.getClass();
        b.a.a(a11, j11);
        obj = Unit.f71690a;
        if (obj != Wc.a.COROUTINE_SUSPENDED) {
        }
    }

    public final void k() {
        try {
            G g10 = this.f77871d;
            if (g10 != null) {
                g10.P0();
            }
        } catch (IllegalStateException e11) {
            b.a.c(Vb0.b.f28514a, e11);
        }
    }

    public final void l() {
        this.f77868a.getValue().e();
        this.f77871d = null;
    }
}
