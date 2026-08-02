package ru.ozon.id.logout.presentation;

import Jb0.C3386d;
import Jb0.z;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import ac0.C4996a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.L;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import bc0.AbstractC5648g;
import bc0.AbstractC5650i;
import bc0.C5643b;
import bc0.EnumC5642a;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.logout.data.ConfirmTrustedDeviceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import wd0.C10540a;
import xe.C10727i;
import yd0.C10886a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/id/logout/presentation/LogoutActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogoutActivity extends androidx.appcompat.app.g {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f97174l = 0;

    /* renamed from: h, reason: collision with root package name */
    private C3386d f97175h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97176i = k.b(new c());

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final y0 f97177j;

    /* renamed from: k, reason: collision with root package name */
    private C10540a f97178k;

    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) LogoutActivity.class));
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97179a;

        static {
            int[] iArr = new int[EnumC5642a.values().length];
            try {
                iArr[EnumC5642a.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5642a.FullScreen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5642a.Dialog.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97179a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function0<C10886a> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10886a invoke() {
            z a11 = z.a(LogoutActivity.J(LogoutActivity.this).a());
            Intrinsics.checkNotNullExpressionValue(a11, "bind(...)");
            return new C10886a(a11, true);
        }
    }

    /* loaded from: classes3.dex */
    static final class d extends AbstractC7737t implements Function1<C, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            LogoutActivity.K(LogoutActivity.this).m0(AbstractC5648g.a.f55919a);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends AbstractC7737t implements Function0<z0.b> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return LogoutActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends AbstractC7737t implements Function0<A0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return LogoutActivity.this.getViewModelStore();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends AbstractC7737t implements Function0<AbstractC6409a> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return LogoutActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* loaded from: classes3.dex */
    static final class h extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f97185b = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            K k11 = Tb0.a.f26975d;
            if (k11 != null) {
                return k11.J().e();
            }
            throw new Lb0.a();
        }
    }

    public LogoutActivity() {
        Function0 function0 = h.f97185b;
        this.f97177j = new y0(N.b(C5643b.class), new f(), function0 == null ? new e() : function0, new g());
    }

    public static final C3386d J(LogoutActivity logoutActivity) {
        C3386d c3386d = logoutActivity.f97175h;
        if (c3386d != null) {
            return c3386d;
        }
        throw new IllegalStateException("`_binding` is not initialized. Use this property between Create and Destroy states");
    }

    public static final C5643b K(LogoutActivity logoutActivity) {
        return (C5643b) logoutActivity.f97177j.getValue();
    }

    public static final void L(LogoutActivity logoutActivity, EnumC5642a enumC5642a) {
        int i11 = b.f97179a[enumC5642a.ordinal()];
        InterfaceC4008j interfaceC4008j = logoutActivity.f97176i;
        if (i11 == 1) {
            ((C10886a) interfaceC4008j.getValue()).b(false);
            C10540a c10540a = logoutActivity.f97178k;
            if (c10540a != null) {
                c10540a.a(false);
                Unit unit = Unit.f71690a;
                return;
            }
            return;
        }
        if (i11 == 2) {
            ((C10886a) interfaceC4008j.getValue()).b(true);
            C10540a c10540a2 = logoutActivity.f97178k;
            if (c10540a2 != null) {
                c10540a2.a(false);
                Unit unit2 = Unit.f71690a;
                return;
            }
            return;
        }
        if (i11 != 3) {
            throw new o();
        }
        ((C10886a) interfaceC4008j.getValue()).b(false);
        C10540a c10540a3 = logoutActivity.f97178k;
        if (c10540a3 != null) {
            c10540a3.a(true);
            Unit unit3 = Unit.f71690a;
        }
    }

    public static final void M(LogoutActivity logoutActivity, AbstractC5650i abstractC5650i) {
        if (Intrinsics.d(abstractC5650i, AbstractC5650i.a.f55926a)) {
            C10540a c10540a = logoutActivity.f97178k;
            if (c10540a != null) {
                c10540a.dismiss();
                return;
            }
            return;
        }
        if (!(abstractC5650i instanceof AbstractC5650i.b)) {
            throw new o();
        }
        ConfirmTrustedDeviceDTO a11 = ((AbstractC5650i.b) abstractC5650i).a();
        wd0.c cVar = new wd0.c(logoutActivity);
        cVar.w(OzonSpannableStringKt.toOzonSpannableString(a11.getTitle()));
        cVar.v(OzonSpannableStringKt.toOzonSpannableString(a11.getSubtitle()));
        cVar.x(TextDTO.TextAlignment.LEADING);
        cVar.u(a11.getSubmitButton().getTitle(), new ru.ozon.id.logout.presentation.a(logoutActivity));
        cVar.o(a11.getCancelButton().getTitle(), new ru.ozon.id.logout.presentation.b(logoutActivity));
        cVar.s(new ru.ozon.id.logout.presentation.c(logoutActivity));
        C10540a z11 = cVar.z();
        z11.b();
        logoutActivity.f97178k = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3386d b11 = C3386d.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(b11, "inflate(...)");
        this.f97175h = b11;
        setContentView(b11.a());
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4996a(this, null, this), 3);
        J onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        L.a(onBackPressedDispatcher, this, new d(), 2);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        this.f97178k = null;
        ((C10886a) this.f97176i.getValue()).a();
        this.f97175h = null;
    }
}
