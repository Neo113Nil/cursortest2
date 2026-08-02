package ru.ozon.id.nativeauth.main.activity;

import Fb0.b;
import Jb0.C3385c;
import Kb0.K;
import Kb0.X0;
import Pc0.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import Vb0.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.L;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.ImagesContract;
import f3.AbstractC6409a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.ErrorView;
import ru.ozon.id.nativeauth.main.b;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import td0.q;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/id/nativeauth/main/activity/AuthFlowActivity;", "Landroidx/appcompat/app/g;", "LBc0/c;", "<init>", "()V", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthFlowActivity extends androidx.appcompat.app.g implements Bc0.c {

    /* renamed from: s, reason: collision with root package name */
    private static WeakReference<Activity> f97288s;

    /* renamed from: t, reason: collision with root package name */
    private static Ib0.c f97289t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f97290u = 0;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final WeakReference<Activity> f97291h = new WeakReference<>(this);

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f97292i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f97293j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97294k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97295l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97296m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final y0 f97297n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f97298o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f97299p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f97300q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f97301r;

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static Intent a(@NotNull Activity activity, b.a aVar) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Pair pair = new Pair("is_close_button_visible_arg_key", Boolean.TRUE);
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intent putExtras = new Intent(activity, (Class<?>) AuthFlowActivity.class).putExtras(androidx.core.os.d.b(pair, new Pair("extra_page_deeplink", aVar.getUrl()), new Pair("is_auth_flow", Boolean.FALSE)));
            Intrinsics.checkNotNullExpressionValue(putExtras, "putExtras(...)");
            putExtras.addFlags(268435456);
            return putExtras;
        }

        @NotNull
        public static Intent b(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent putExtras = new Intent(activity, (Class<?>) AuthFlowActivity.class).putExtras(androidx.core.os.d.b(new Pair("is_close_button_visible_arg_key", Boolean.TRUE), new Pair("start_deeplink_arg_key", "ozon://ozonIdPageSocialAdditionalOption"), new Pair("is_auth_flow", Boolean.FALSE)));
            Intrinsics.checkNotNullExpressionValue(putExtras, "putExtras(...)");
            putExtras.addFlags(268435456);
            return putExtras;
        }

        private static Intent c(Activity activity, String str, boolean z11, Fb0.b bVar) {
            WeakReference weakReference = AuthFlowActivity.f97288s;
            String str2 = null;
            if ((weakReference != null ? (Activity) weakReference.get() : null) != null) {
                return null;
            }
            Pair pair = new Pair("start_deeplink_arg_key", str);
            Pair pair2 = new Pair("is_close_button_visible_arg_key", Boolean.valueOf(z11));
            if (bVar != null) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                if (!(bVar instanceof b.a)) {
                    throw new o();
                }
                str2 = Uri.parse("ozon://web").buildUpon().appendQueryParameter(ImagesContract.URL, ((b.a) bVar).getUrl()).build().toString();
                Intrinsics.f(str2);
            }
            return new Intent(activity, (Class<?>) AuthFlowActivity.class).putExtras(androidx.core.os.d.b(pair, pair2, new Pair("extra_page_deeplink", str2)));
        }

        public static void d(@NotNull Activity activity, String str, boolean z11, Fb0.b bVar) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent c11 = c(activity, str, z11, bVar);
            if (c11 != null) {
                activity.startActivity(c11);
            }
        }

        public static Intent e(@NotNull Activity activity, String str, boolean z11, Fb0.b bVar) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return c(activity, str, z11, bVar);
        }

        @NotNull
        public static Intent f(@NotNull Activity hostActivity, @NotNull String otpToken, @NotNull Ib0.c onOtpFlowResult) {
            Intrinsics.checkNotNullParameter(hostActivity, "hostActivity");
            Intrinsics.checkNotNullParameter(otpToken, "otpToken");
            Intrinsics.checkNotNullParameter(onOtpFlowResult, "onOtpFlowResult");
            AuthFlowActivity.f97289t = onOtpFlowResult;
            Intent intent = new Intent(hostActivity, (Class<?>) AuthFlowActivity.class);
            intent.putExtra("is_close_button_visible_arg_key", true);
            intent.putExtra("otp_token_arg_key", otpToken);
            intent.putExtra("is_auth_flow", false);
            return intent;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle extras = AuthFlowActivity.this.getIntent().getExtras();
            if (extras != null) {
                return extras.getString("extra_page_deeplink", null);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Bundle extras = AuthFlowActivity.this.getIntent().getExtras();
            return Boolean.valueOf(extras != null ? extras.getBoolean("is_auth_flow", true) : true);
        }
    }

    /* loaded from: classes3.dex */
    static final class d extends AbstractC7737t implements Function0<Boolean> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Bundle extras = AuthFlowActivity.this.getIntent().getExtras();
            if (extras != null) {
                return Boolean.valueOf(extras.getBoolean("is_close_button_visible_arg_key", false));
            }
            throw new IllegalStateException("Open AuthFlowActivity only via AuthFlowActivity.start method");
        }
    }

    /* loaded from: classes3.dex */
    static final class e extends AbstractC7737t implements Function1<C, Unit> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            AuthFlowActivity.this.Y().onBackButtonClicked();
            return Unit.f71690a;
        }
    }

    /* loaded from: classes3.dex */
    static final class f extends AbstractC7737t implements Function0<String> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle extras = AuthFlowActivity.this.getIntent().getExtras();
            if (extras != null) {
                return extras.getString("otp_token_arg_key", null);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends AbstractC7737t implements Function0<A0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return AuthFlowActivity.this.getViewModelStore();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends AbstractC7737t implements Function0<AbstractC6409a> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return AuthFlowActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* loaded from: classes3.dex */
    static final class i extends AbstractC7737t implements Function0<String> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle extras = AuthFlowActivity.this.getIntent().getExtras();
            if (extras != null) {
                return extras.getString("start_deeplink_arg_key", null);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class j extends AbstractC7737t implements Function0<z0.b> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            X0 b02 = k11.b0();
            AuthFlowActivity authFlowActivity = AuthFlowActivity.this;
            return b02.e(authFlowActivity, AuthFlowActivity.P(authFlowActivity), AuthFlowActivity.S(authFlowActivity), AuthFlowActivity.M(authFlowActivity), AuthFlowActivity.R(authFlowActivity), AuthFlowActivity.O(authFlowActivity), AuthFlowActivity.O(authFlowActivity) != null, AuthFlowActivity.f97289t);
        }
    }

    public AuthFlowActivity() {
        n nVar = n.NONE;
        this.f97292i = k.a(nVar, new i());
        this.f97293j = k.a(nVar, new d());
        this.f97294k = k.b(new b());
        this.f97295l = k.b(new c());
        this.f97296m = k.b(new f());
        this.f97297n = new y0(N.b(Lc0.a.class), new g(), new j(), new h());
    }

    public static void J(AuthFlowActivity authFlowActivity) {
        authFlowActivity.Y().l0();
    }

    public static void K(AuthFlowActivity authFlowActivity) {
        authFlowActivity.Y().onBackButtonClicked();
    }

    public static final String M(AuthFlowActivity authFlowActivity) {
        return (String) authFlowActivity.f97294k.getValue();
    }

    public static final String O(AuthFlowActivity authFlowActivity) {
        return (String) authFlowActivity.f97296m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final String P(AuthFlowActivity authFlowActivity) {
        return (String) authFlowActivity.f97292i.getValue();
    }

    public static final boolean R(AuthFlowActivity authFlowActivity) {
        return ((Boolean) authFlowActivity.f97295l.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final boolean S(AuthFlowActivity authFlowActivity) {
        return ((Boolean) authFlowActivity.f97293j.getValue()).booleanValue();
    }

    public static final void T(AuthFlowActivity authFlowActivity, G g10, Pc0.g gVar) {
        if (Intrinsics.d(gVar, g.b.f22202a)) {
            g10.Q0(null);
            return;
        }
        if (Intrinsics.d(gVar, g.a.f22201a)) {
            if (g10.l0() > 0) {
                g10.P0();
                return;
            } else {
                authFlowActivity.finish();
                return;
            }
        }
        if (gVar instanceof g.h) {
            ((g.h) gVar).a().show(g10, (String) null);
            return;
        }
        if (gVar instanceof g.f) {
            Z(g10, ((g.f) gVar).a(), true);
            return;
        }
        if (gVar instanceof g.C0440g) {
            if (g10.l0() <= 0) {
                Z(g10, ((g.C0440g) gVar).a(), false);
                return;
            } else {
                g10.P0();
                Z(g10, ((g.C0440g) gVar).a(), true);
                return;
            }
        }
        if (!(gVar instanceof g.d) && !(gVar instanceof g.e) && !(gVar instanceof g.c)) {
            throw new o();
        }
        View currentFocus = authFlowActivity.getCurrentFocus();
        if (currentFocus != null) {
            ViewExtKt.hideKeyboard(currentFocus);
        }
        authFlowActivity.finish();
    }

    public static final void U(AuthFlowActivity authFlowActivity, C3385c c3385c, boolean z11) {
        if (z11 == authFlowActivity.f97300q) {
            return;
        }
        authFlowActivity.f97300q = z11;
        LoaderView loaderView = c3385c.f14405f;
        if (z11) {
            Intrinsics.checkNotNullExpressionValue(loaderView, "loaderView");
            q.a(loaderView, 2, 300L);
        } else {
            Intrinsics.checkNotNullExpressionValue(loaderView, "loaderView");
            q.b(1, loaderView);
        }
        authFlowActivity.a0(c3385c);
    }

    public static final void W(AuthFlowActivity authFlowActivity, C3385c c3385c, ru.ozon.id.nativeauth.main.b bVar) {
        boolean z11 = bVar instanceof b.C2136b;
        AppCompatImageView appCompatImageView = c3385c.f14402c;
        ErrorView errorView = c3385c.f14404e;
        NestedScrollView contentScrollView = c3385c.f14403d;
        if (z11 && (authFlowActivity.f97298o || authFlowActivity.f97299p)) {
            Intrinsics.checkNotNullExpressionValue(contentScrollView, "contentScrollView");
            q.b(3, contentScrollView);
            Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
            q.b(3, errorView);
            appCompatImageView.setNextFocusDownId(R.id.inputEditText);
        } else if ((bVar instanceof b.a) && (!authFlowActivity.f97298o || authFlowActivity.f97299p)) {
            Intrinsics.checkNotNullExpressionValue(contentScrollView, "contentScrollView");
            q.a(contentScrollView, 3, 0L);
            Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
            q.b(3, errorView);
            appCompatImageView.setNextFocusDownId(R.id.inputEditText);
        } else if (bVar instanceof b.c) {
            Intrinsics.checkNotNullExpressionValue(contentScrollView, "contentScrollView");
            q.b(3, contentScrollView);
            errorView.j((b.c) bVar);
            q.a(errorView, 3, 0L);
            appCompatImageView.setNextFocusDownId(errorView.getId());
        }
        authFlowActivity.f97298o = bVar instanceof b.a;
        authFlowActivity.f97299p = bVar instanceof b.c;
        authFlowActivity.a0(c3385c);
    }

    public static final void X(AuthFlowActivity authFlowActivity, Intent intent) {
        try {
            authFlowActivity.startActivity(Intent.createChooser(intent, authFlowActivity.getString(R.string.ozonid_browser_chooser_title_implict_chooser_android)));
        } catch (Throwable th2) {
            b.a.c(Vb0.b.f28514a, th2);
            authFlowActivity.Y().m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Lc0.a Y() {
        return (Lc0.a) this.f97297n.getValue();
    }

    private static void Z(G g10, ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11) {
        Q p11 = g10.p();
        p11.r(R.id.fragment_container, componentCallbacksC5392m, null);
        if (z11) {
            p11.g(null);
        }
        p11.w();
        p11.x();
        p11.i();
    }

    private final void a0(C3385c c3385c) {
        boolean z11 = this.f97300q && (this.f97298o || this.f97299p);
        if (z11 == this.f97301r) {
            return;
        }
        this.f97301r = z11;
        View shadowLoadingView = c3385c.f14406g;
        if (z11) {
            Intrinsics.checkNotNullExpressionValue(shadowLoadingView, "shadowLoadingView");
            q.a(shadowLoadingView, 2, 100L);
        } else {
            Intrinsics.checkNotNullExpressionValue(shadowLoadingView, "shadowLoadingView");
            q.b(1, shadowLoadingView);
        }
    }

    @Override // androidx.appcompat.app.g, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(@NotNull Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        super.attachBaseContext(k11.I().getValue().a(newBase));
    }

    @Override // Bc0.c
    @NotNull
    public final Bc0.a h() {
        return Y().h0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f97288s = this.f97291h;
        C3385c b11 = C3385c.b(getLayoutInflater());
        setContentView(b11.a());
        NestedScrollView nestedScrollView = b11.f14403d;
        nestedScrollView.setFocusableInTouchMode(false);
        nestedScrollView.setFocusable(false);
        JG.b bVar = new JG.b(this, 2);
        AppCompatImageView appCompatImageView = b11.f14401b;
        appCompatImageView.setOnClickListener(bVar);
        GS.a aVar = new GS.a(this, 1);
        AppCompatImageView appCompatImageView2 = b11.f14402c;
        appCompatImageView2.setOnClickListener(aVar);
        ru.ozon.id.nativeauth.main.activity.a aVar2 = new ru.ozon.id.nativeauth.main.activity.a(Y());
        ErrorView errorView = b11.f14404e;
        errorView.g(aVar2);
        TextAtomV2View toolbarTitle = b11.f14407h;
        Intrinsics.checkNotNullExpressionValue(toolbarTitle, "toolbarTitle");
        toolbarTitle.setVisibility(8);
        for (View view : C7714v.b0(appCompatImageView, appCompatImageView2, nestedScrollView, errorView, b11.f14406g, b11.f14405f)) {
            view.setAlpha(0.0f);
            view.setVisibility(8);
        }
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Mc0.a(this, null, this, b11), 3);
        J onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        L.a(onBackPressedDispatcher, this, new e(), 2);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onDestroy() {
        if (Intrinsics.d(f97288s, this.f97291h)) {
            f97288s = null;
        }
        f97289t = null;
        super.onDestroy();
    }
}
