package ld0;

import Kb0.K;
import Sc.InterfaceC4008j;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import dc0.C6144H;
import dc0.C6153Q;
import dc0.C6171q;
import gE.ViewOnClickListenerC6686a;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;
import td0.C9864d;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lld0/c;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ld0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7934c extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private Jb0.h f73207a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f73208b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f73209c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Fb0.e f73210d;

    /* renamed from: ld0.c$a */
    static final class a extends AbstractC7737t implements Function1<C6153Q, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f73211b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(C6153Q c6153q) {
            String it = c6153q.b();
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugAppCredentialsFragment$getOtherDomainsCookies$domains$1", f = "OzonIdDebugAppCredentialsFragment.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: ld0.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Set<? extends String>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73212d;

        b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Set<? extends String>> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73212d;
            if (i11 == 0) {
                Sc.s.b(obj);
                K k11 = Tb0.a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                hd0.i value = k11.X().f().getValue();
                this.f73212d = 1;
                obj = value.f(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
            if (sso2MobileConfigResponseDTO != null) {
                return sso2MobileConfigResponseDTO.getAllDomains();
            }
            return null;
        }
    }

    /* renamed from: ld0.c$c, reason: collision with other inner class name */
    static final class C1233c extends AbstractC7737t implements Function1<String, CharSequence> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f73214c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1233c(boolean z11) {
            super(1);
            this.f73214c = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String str) {
            String domain = str;
            Intrinsics.checkNotNullParameter(domain, "domain");
            return V.e.a("<b>", domain, "</b>:<br>", C7934c.w(C7934c.this, this.f73214c, "https://" + domain), "<br><br>");
        }
    }

    /* renamed from: ld0.c$d */
    static final class d extends AbstractC7737t implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C7934c c7934c = C7934c.this;
            Jb0.h hVar = c7934c.f73207a;
            if (hVar != null) {
                c7934c.A(hVar);
            }
            return Unit.f71690a;
        }
    }

    public C7934c() {
        super(R.layout.fragment_ozon_id_debug_app_credentials);
        this.f73208b = new d();
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        this.f73209c = k11.t().j();
        K k12 = Tb0.a.f26975d;
        if (k12 == null) {
            throw new Lb0.a();
        }
        this.f73210d = k12.N().getPrimaryDomain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(Jb0.h hVar) {
        boolean isChecked = hVar.f14435c.isChecked();
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity");
        ((OzonIdDebugActivity) requireActivity).O();
        AppCompatTextView appCompatTextView = hVar.f14439g;
        Fb0.e eVar = this.f73210d;
        appCompatTextView.setText("Основной домен до SSO 2.0: " + eVar.j());
        hVar.f14437e.setText(y(eVar.i(), "\n\n", isChecked));
        hVar.f14440h.setText("Основной домен SS0 2.0: " + eVar.g());
        hVar.f14438f.setText(y(eVar.g(), "\n\n", isChecked));
        hVar.f14441i.setText(z(isChecked));
    }

    public static void t(C7934c c7934c, Jb0.h hVar) {
        boolean isChecked = hVar.f14435c.isChecked();
        Fb0.e eVar = c7934c.f73210d;
        C9864d.a(c7934c, Nk.a.b("Основной домен до SSO 2.0: ", eVar.j()) + "\n" + c7934c.y(eVar.i(), "\n\n", isChecked) + "\n\n" + Nk.a.b("Основной домен SS0 2.0: ", eVar.g()) + "\n" + c7934c.y(eVar.g(), "\n\n", isChecked) + "\n\n" + ((Object) c7934c.z(isChecked)));
    }

    public static void u(C7934c c7934c, Jb0.h hVar) {
        c7934c.A(hVar);
    }

    public static final /* synthetic */ String w(C7934c c7934c, boolean z11, String str) {
        return c7934c.y(str, "<br>", z11);
    }

    private final String y(String str, String str2, boolean z11) {
        ArrayList m11 = C6171q.m(C6144H.h((C6144H) this.f73209c.getValue(), URI.create(str)));
        ArrayList arrayList = new ArrayList();
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (z11 ? true : C6171q.r(((C6153Q) next).b())) {
                arrayList.add(next);
            }
        }
        String V11 = C7714v.V(arrayList, str2, null, null, a.f73211b, 30);
        return kotlin.text.h.K(V11) ? "Ничего нет" : V11;
    }

    private final Spanned z(boolean z11) {
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        List<String> b11 = k11.t().i().getValue().b();
        Set set = (Set) C10727i.d(kotlin.coroutines.g.f71771a, new b(2, null));
        Spanned a11 = androidx.core.text.b.a(C7714v.V(C7714v.p0(set != null ? set : kotlin.collections.K.f71697a, b11), "\n\n", null, null, new C1233c(z11), 30), 63);
        Intrinsics.checkNotNullExpressionValue(a11, "fromHtml(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity");
        ((OzonIdDebugActivity) requireActivity).Q(this.f73208b);
        this.f73207a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity");
        ((OzonIdDebugActivity) requireActivity).N(this.f73208b);
        final Jb0.h a11 = Jb0.h.a(view);
        a11.f14435c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ld0.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                C7934c.u(C7934c.this, a11);
            }
        });
        a11.f14436d.setOnClickListener(new ViewOnClickListenerC6686a(1, this, a11));
        A(a11);
        this.f73207a = a11;
    }
}
