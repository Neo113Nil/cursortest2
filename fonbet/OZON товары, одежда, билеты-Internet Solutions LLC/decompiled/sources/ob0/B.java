package ob0;

import Fb0.f;
import Sc.InterfaceC4008j;
import T7.Z;
import We.L;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import jc0.AbstractC7345h;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ob0.s;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.sso2.t;
import ub0.C10014b;

/* loaded from: classes3.dex */
public final class B extends AbstractC7345h {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Fb0.f f77872d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f77873e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77874a;

        static {
            int[] iArr = new int[C10014b.a.values().length];
            try {
                iArr[C10014b.a.OnLogin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C10014b.a.OnAuthAppLaunch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f77874a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77876c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f77877d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(1);
            this.f77876c = str;
            this.f77877d = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
        
            if (r0 == null) goto L9;
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> createAction = map;
            Intrinsics.checkNotNullParameter(createAction, "$this$createAction");
            String str = this.f77876c;
            B b11 = B.this;
            B.h(b11, createAction, "custom_dimension3", str);
            String str2 = this.f77877d;
            if (str2 != null) {
                if (kotlin.text.h.K(str2)) {
                    str2 = null;
                }
            }
            str2 = "empty";
            B.h(b11, createAction, "custom_dimension4", str2);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f77879c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f77880d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f77881e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f77882f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f77883g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f77884h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f77885i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Map<String, Object>, Unit> f77886j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, B b11, String str2, Integer num, String str3, String str4, String str5, String str6, Function1<? super Map<String, Object>, Unit> function1) {
            super(1);
            this.f77878b = str;
            this.f77879c = b11;
            this.f77880d = str2;
            this.f77881e = num;
            this.f77882f = str3;
            this.f77883g = str4;
            this.f77884h = str5;
            this.f77885i = str6;
            this.f77886j = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> addPayload = map;
            Intrinsics.checkNotNullParameter(addPayload, "$this$addPayload");
            addPayload.put("widgetName", this.f77878b);
            B b11 = this.f77879c;
            B.h(b11, addPayload, "status", this.f77880d);
            B.h(b11, addPayload, "index", this.f77881e);
            B.h(b11, addPayload, SelectionItemFormDTO.TITLE_FIELD_NAME, this.f77882f);
            B.h(b11, addPayload, "id", this.f77883g);
            B.h(b11, addPayload, ImagesContract.URL, this.f77884h);
            B.h(b11, addPayload, "type", this.f77885i);
            Function1<Map<String, Object>, Unit> function1 = this.f77886j;
            if (function1 != null) {
                function1.invoke(addPayload);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f77888c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s sVar) {
            super(1);
            this.f77888c = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> createAction = map;
            Intrinsics.checkNotNullParameter(createAction, "$this$createAction");
            B.e(B.this, createAction, this.f77888c);
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s.e f77890c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(s.e eVar) {
            super(1);
            this.f77890c = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> createAction = map;
            Intrinsics.checkNotNullParameter(createAction, "$this$createAction");
            B.f(B.this, createAction, this.f77890c);
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f77891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.id.nativeauth.sso2.t f77892c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L f77893d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(L l11, B b11, ru.ozon.id.nativeauth.sso2.t tVar) {
            super(1);
            this.f77891b = b11;
            this.f77892c = tVar;
            this.f77893d = l11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> createAction = map;
            Intrinsics.checkNotNullParameter(createAction, "$this$createAction");
            B b11 = this.f77891b;
            B.h(b11, createAction, "custom_dimension4", B.i(b11, this.f77892c));
            B.h(b11, createAction, "custom_dimension5", B.g(b11, this.f77893d));
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f77894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L f77895c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.id.nativeauth.sso2.t f77896d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(L l11, B b11, ru.ozon.id.nativeauth.sso2.t tVar) {
            super(1);
            this.f77894b = b11;
            this.f77895c = l11;
            this.f77896d = tVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> createAction = map;
            Intrinsics.checkNotNullParameter(createAction, "$this$createAction");
            L l11 = this.f77895c;
            String h11 = l11.L().j().h();
            B b11 = this.f77894b;
            B.h(b11, createAction, "custom_dimension3", h11);
            B.h(b11, createAction, "custom_dimension4", B.i(b11, this.f77896d));
            B.h(b11, createAction, "custom_dimension5", B.g(b11, l11));
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L f77898c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(L l11) {
            super(1);
            this.f77898c = l11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> createAction = map;
            Intrinsics.checkNotNullParameter(createAction, "$this$createAction");
            B.h(B.this, createAction, "custom_dimension3", this.f77898c.L().j().h());
            return Unit.f71690a;
        }
    }

    static final class i extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f77899b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f77900c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B f77901d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Long l11, Long l12, B b11) {
            super(1);
            this.f77899b = l11;
            this.f77900c = l12;
            this.f77901d = b11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> createAction = map;
            Intrinsics.checkNotNullParameter(createAction, "$this$createAction");
            B.h(this.f77901d, createAction, "custom_dimension3", G.g.c(String.valueOf(this.f77899b), ",", String.valueOf(this.f77900c)));
            return Unit.f71690a;
        }
    }

    static final class j extends AbstractC7737t implements Function0<Set<? extends f.a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f77902b = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends f.a> invoke() {
            f.a[] elements = {f.a.BX_APP, f.a.TRAVEL_APP, f.a.FRESH_APP, f.a.SELECT_APP};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(@NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j<Moshi> moshi) {
        super(ozonIdConfig, moshi);
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f77872d = ozonIdConfig;
        this.f77873e = Sc.k.b(j.f77902b);
    }

    public static final void e(B b11, Map map, s sVar) {
        b11.getClass();
        s.e c11 = sVar.c();
        AbstractC7345h.d(map, "custom_dimension4", c11.b().a());
        AbstractC7345h.d(map, "custom_dimension5", String.valueOf(c11.a()));
        s.g d11 = sVar.d();
        AbstractC7345h.d(map, "custom_dimension6", d11.d().a());
        AbstractC7345h.d(map, "custom_dimension3", String.valueOf(d11.b()));
        s.d c12 = d11.c();
        AbstractC7345h.d(map, "custom_dimension7", c12 != null ? c12.c() : null);
        s.d c13 = d11.c();
        AbstractC7345h.d(map, "custom_dimension8", c13 != null ? c13.a() : null);
        s.d c14 = d11.c();
        AbstractC7345h.d(map, "custom_dimension9", c14 != null ? c14.b() : null);
        AbstractC7345h.d(map, "custom_dimension10", sVar.b().a().a());
    }

    public static final void f(B b11, Map map, s.e eVar) {
        b11.getClass();
        AbstractC7345h.d(map, "custom_dimension4", eVar.b().a());
        AbstractC7345h.d(map, "custom_dimension5", String.valueOf(eVar.a()));
    }

    public static final String g(B b11, L l11) {
        b11.getClass();
        String q11 = L.q(l11, "ozon-antibot");
        if (q11 == null) {
            return "empty";
        }
        if (kotlin.text.h.K(q11)) {
            q11 = null;
        }
        return q11 == null ? "empty" : q11;
    }

    public static final /* synthetic */ void h(B b11, Map map, String str, Object obj) {
        b11.getClass();
        AbstractC7345h.d(map, str, obj);
    }

    public static final String i(B b11, ru.ozon.id.nativeauth.sso2.t tVar) {
        b11.getClass();
        if (tVar instanceof t.a) {
            return "LoginOrSwitchUser";
        }
        if (tVar instanceof t.b) {
            return "OnAppStart";
        }
        if (tVar instanceof t.c.a) {
            return "OnRequestNative";
        }
        if (tVar instanceof t.c.d) {
            return "OnWebViewRequest";
        }
        if (tVar instanceof t.c.b) {
            return "OnServerLogoutNative";
        }
        if (tVar instanceof t.c.C2140c) {
            return "OnServerLogoutNonNative";
        }
        throw new Sc.o();
    }

    private final String j(String str, String str2, String str3, String str4, boolean z11) {
        return n(this, "ozonid_goauth_401", this.f77872d.getAppName().a(), null, null, null, str3, str, z11 ? "native" : "nonNative", new b(str2, str4), 28);
    }

    private final String m(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Function1<? super Map<String, Object>, Unit> function1) {
        return b(c(str), new c(str2, this, str4, num, str3, str5, str6, str7, function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String n(B b11, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Function1 function1, int i11) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            num = null;
        }
        if ((i11 & 32) != 0) {
            str5 = null;
        }
        if ((i11 & 64) != 0) {
            str6 = null;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str7 = null;
        }
        if ((i11 & 256) != 0) {
            function1 = null;
        }
        return b11.m(str, str2, str3, str4, num, str5, str6, str7, function1);
    }

    private static String w(We.A a11) {
        return Z.a(a11.u(), "://", a11.h(), a11.c());
    }

    @NotNull
    public final String k(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return j(w(response.L().j()), response.L().j().h(), td0.j.a(response), L.q(response, "x-o3-gdecision"), true);
    }

    @NotNull
    public final String l(@NotNull WebResourceRequest request, @NotNull WebResourceResponse response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Uri url = request.getUrl();
        String a11 = Z.a(url.getScheme(), "://", url.getHost(), url.getPath());
        String host = request.getUrl().getHost();
        Intrinsics.checkNotNullParameter(response, "<this>");
        return j(a11, host, response.getResponseHeaders().get("x-o3-trace-id"), response.getResponseHeaders().get("x-o3-gdecision"), false);
    }

    @NotNull
    public final String o(int i11, String str, @NotNull String id2, @NotNull s antibotFlowResult) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(antibotFlowResult, "antibotFlowResult");
        return m("abt_result", "error.antibot", "antibot", antibotFlowResult.e().a(), Integer.valueOf(i11), id2, str, "error", new d(antibotFlowResult));
    }

    @NotNull
    public final String p(@NotNull C10014b.a type, @NotNull s.e fingerprintChallengeResult) {
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fingerprintChallengeResult, "fingerprintChallengeResult");
        int i11 = a.f77874a[type.ordinal()];
        if (i11 == 1) {
            str = "mf.onLogin";
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            str = "mf.onAuthorizedAppLaunch";
        }
        return n(this, "abt_result", str, "mobileFingerprint", null, null, null, null, null, new e(fingerprintChallengeResult), 248);
    }

    @NotNull
    public final String q(@NotNull L response, @NotNull ru.ozon.id.nativeauth.sso2.t reAuthTrigger) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(reAuthTrigger, "reAuthTrigger");
        return n(this, "sso2_domains_auth_mobile_fail", this.f77872d.getAppName().a(), null, String.valueOf(response.m()), null, td0.j.a(response), null, null, new f(response, this, reAuthTrigger), 212);
    }

    @NotNull
    public final String r(@NotNull L response, boolean z11, @NotNull ru.ozon.id.nativeauth.sso2.t reAuthTrigger) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(reAuthTrigger, "reAuthTrigger");
        return n(this, "sso2_get_product_token_fail", this.f77872d.getAppName().a(), null, String.valueOf(response.m()), null, td0.j.a(response), w(response.L().j()), z11 ? "required" : "nonRequired", new g(response, this, reAuthTrigger), 20);
    }

    @NotNull
    public final String s(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return n(this, "sso2_only_old_auth_cookies_fail", this.f77872d.getAppName().a(), null, null, null, td0.j.a(response), w(response.L().j()), null, new h(response), 156);
    }

    @NotNull
    public final String t(@NotNull L response, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(response, "response");
        return n(this, "sso2_sso_mobile_config_fail", this.f77872d.getAppName().a(), null, String.valueOf(response.m()), null, td0.j.a(response), null, arrayList != null ? C7714v.V(arrayList, null, null, null, null, 63) : null, new C(this, response), 84);
    }

    @NotNull
    public final String u(Long l11, Long l12, boolean z11) {
        return n(this, "sso2_user_id_de_sync_error", this.f77872d.getAppName().a(), null, null, null, null, null, z11 ? "native" : "nonNative", new i(l11, l12, this), 124);
    }

    @NotNull
    public final Set<f.a> v() {
        return (Set) this.f77873e.getValue();
    }
}
