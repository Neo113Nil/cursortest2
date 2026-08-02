package ru.ozon.host.config.debug.menu;

import B90.C2619v;
import S0.B1;
import S0.C3996z;
import S0.H0;
import S0.InterfaceC3967k;
import a1.C4912a;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ActivityC5043j;
import androidx.activity.t;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.Y;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import f3.C6411c;
import hb0.C6905a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/host/config/debug/menu/HostConfigDebugMenuActivity;", "Landroidx/activity/j;", "<init>", "()V", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HostConfigDebugMenuActivity extends ActivityC5043j {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f97127i = 0;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y0 f97128h = new y0(N.b(Ba0.a.class), new b(), new d(), new c());

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                B1 a11 = C6905a.a();
                HostConfigDebugMenuActivity hostConfigDebugMenuActivity = HostConfigDebugMenuActivity.this;
                C3996z.b(new H0[]{a11.c(hostConfigDebugMenuActivity.getOnBackPressedDispatcher()), Ia0.c.a().c(HostConfigDebugMenuActivity.F(hostConfigDebugMenuActivity).getViewModelFactory())}, Ba0.b.f3349b, interfaceC3967k2, 56);
            }
            return Unit.f71690a;
        }
    }

    public static final class b extends AbstractC7737t implements Function0<A0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return HostConfigDebugMenuActivity.this.getViewModelStore();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<AbstractC6409a> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return HostConfigDebugMenuActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    static final class d extends AbstractC7737t implements Function0<z0.b> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            HostConfigDebugMenuActivity hostConfigDebugMenuActivity = HostConfigDebugMenuActivity.this;
            Application application = hostConfigDebugMenuActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            Uri data = hostConfigDebugMenuActivity.getIntent().getData();
            Intrinsics.checkNotNullParameter(application, "application");
            C6411c c6411c = new C6411c();
            c6411c.a(N.b(Ba0.a.class), new ru.ozon.host.config.debug.menu.a(application, data));
            return c6411c.b();
        }
    }

    public static final Ba0.a F(HostConfigDebugMenuActivity hostConfigDebugMenuActivity) {
        return (Ba0.a) hostConfigDebugMenuActivity.f97128h.getValue();
    }

    @Override // androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t.a(this);
        ComposeView composeView = new ComposeView(this, null, 6, 0);
        composeView.a(new C4912a(true, 1745341144, new a()));
        setContentView(composeView);
        Y.J(composeView, new C2619v());
    }
}
