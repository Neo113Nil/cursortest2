package ru.ozon.id.ozonLimb.debug;

import Ae.C2399j;
import B90.C2601c;
import Ib0.e;
import Jb0.C3384b;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.activity.J;
import androidx.activity.L;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import dc0.C6149M;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ld0.C7932a;
import ld0.x;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/id/ozonLimb/debug/OzonIdDebugActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"SetTextI18n"})
/* loaded from: classes3.dex */
public final class OzonIdDebugActivity extends g {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f97514l = 0;

    /* renamed from: h, reason: collision with root package name */
    private C3384b f97515h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97516i = k.b(new d());

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ArrayList f97517j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97518k = k.b(b.f97521b);

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97519a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f97520b;

        static {
            int[] iArr = new int[Gb0.d.values().length];
            try {
                iArr[Gb0.d.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gb0.d.FORCE_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gb0.d.INSTANT_LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gb0.d.CROSS_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f97519a = iArr;
            int[] iArr2 = new int[Gb0.c.values().length];
            try {
                iArr2[Gb0.c.LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Gb0.c.FORCE_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f97520b = iArr2;
        }
    }

    static final class b extends AbstractC7737t implements Function0<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f97521b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            K k11 = Tb0.a.f26975d;
            if (k11 != null) {
                return k11.p().getValue();
            }
            throw new Lb0.a();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity$onCreate$1", f = "OzonIdDebugActivity.kt", l = {81}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97522d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return OzonIdDebugActivity.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97522d;
            if (i11 == 0) {
                s.b(obj);
                this.f97522d = 1;
                if (OzonIdDebugActivity.M(OzonIdDebugActivity.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function0<C6149M> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6149M invoke() {
            C6149M c6149m = new C6149M();
            C3384b c3384b = OzonIdDebugActivity.this.f97515h;
            if (c3384b == null) {
                Intrinsics.n("binding");
                throw null;
            }
            FrameLayout ozonIdDebugNotifierContainer = c3384b.f14397c;
            Intrinsics.checkNotNullExpressionValue(ozonIdDebugNotifierContainer, "ozonIdDebugNotifierContainer");
            c6149m.e(ozonIdDebugNotifierContainer);
            return c6149m;
        }
    }

    public static void J(OzonIdDebugActivity ozonIdDebugActivity) {
        Iterator it = ozonIdDebugActivity.f97517j.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public static final void L(OzonIdDebugActivity ozonIdDebugActivity) {
        Iterator it = ozonIdDebugActivity.f97517j.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public static final Object M(OzonIdDebugActivity ozonIdDebugActivity, kotlin.coroutines.d dVar) {
        InterfaceC4008j interfaceC4008j = ozonIdDebugActivity.f97518k;
        Object collect = C2399j.F(((e) interfaceC4008j.getValue()).a(), ((e) interfaceC4008j.getValue()).c(), ((e) interfaceC4008j.getValue()).d(), ((e) interfaceC4008j.getValue()).b()).collect(new C7932a(new ru.ozon.id.ozonLimb.debug.b(ozonIdDebugActivity)), dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (collect != aVar) {
            collect = Unit.f71690a;
        }
        return collect == aVar ? collect : Unit.f71690a;
    }

    public final void N(@NotNull Function0<Unit> onRefresh) {
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        this.f97517j.add(onRefresh);
    }

    public final void O() {
        C3384b c3384b = this.f97515h;
        if (c3384b != null) {
            c3384b.f14398d.setRefreshing(false);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void P(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        G supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Q p11 = supportFragmentManager.p();
        p11.r(R.id.ozonIdDebugFragmentContainerView, fragment, null);
        p11.g(null);
        p11.w();
        p11.x();
        p11.i();
    }

    public final void Q(@NotNull Function0<Unit> onRefresh) {
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        this.f97517j.remove(onRefresh);
    }

    public final void R(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ((C6149M) this.f97516i.getValue()).f(message);
    }

    public final void S() {
        C3384b c3384b = this.f97515h;
        if (c3384b != null) {
            c3384b.f14398d.setRefreshing(true);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3384b b11 = C3384b.b(getLayoutInflater());
        this.f97515h = b11;
        setContentView(b11.a());
        C3384b c3384b = this.f97515h;
        if (c3384b == null) {
            Intrinsics.n("binding");
            throw null;
        }
        c3384b.f14399e.setText("OzonID SDK 14.8.1");
        SwipeRefreshLayout swipeRefreshLayout = c3384b.f14398d;
        Context context = swipeRefreshLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        swipeRefreshLayout.setColorSchemeColors(ResourceExtKt.color(context, R.color.oz_semantic_accent_primary));
        Context context2 = swipeRefreshLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(ResourceExtKt.color(context2, R.color.oz_semantic_bg_secondary));
        swipeRefreshLayout.setProgressViewOffset(false, ResourceExtKt.toPx(60) + swipeRefreshLayout.getProgressViewStartOffset(), ResourceExtKt.toPx(68));
        swipeRefreshLayout.setOnRefreshListener(new C2601c(this));
        c3384b.f14396b.setOnClickListener(new GS.a(this, 6));
        J onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        L.a(onBackPressedDispatcher, null, new ru.ozon.id.ozonLimb.debug.a(this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new c(null), 3);
        if (bundle == null) {
            G supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            x xVar = new x();
            Q p11 = supportFragmentManager.p();
            p11.r(R.id.ozonIdDebugFragmentContainerView, xVar, null);
            p11.w();
            p11.x();
            p11.i();
        }
    }
}
