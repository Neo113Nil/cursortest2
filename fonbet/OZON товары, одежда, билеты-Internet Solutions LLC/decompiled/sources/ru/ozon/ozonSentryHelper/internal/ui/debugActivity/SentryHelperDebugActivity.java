package ru.ozon.ozonSentryHelper.internal.ui.debugActivity;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import android.os.Bundle;
import androidx.activity.t;
import androidx.appcompat.app.g;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import e.C6233h;
import e3.C6285b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziThemeKt;
import wg0.m;
import xe.C10727i;
import xg0.C10773a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/ozonSentryHelper/internal/ui/debugActivity/SentryHelperDebugActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "Lwg0/g;", "state", "ozon-sentry-helper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SentryHelperDebugActivity extends g {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y0 f97614h = new y0(N.b(m.class), new C10773a(this), new b(0), new xg0.b(this));

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                SentryHelperDebugActivity sentryHelperDebugActivity = SentryHelperDebugActivity.this;
                SentryHelperDebugActivity.J(sentryHelperDebugActivity, (wg0.g) C6285b.c(SentryHelperDebugActivity.K(sentryHelperDebugActivity).getUiState(), interfaceC3967k2, 0).getValue(), interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    public static final class b extends AbstractC7737t implements Function0<z0.b> {
        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new d();
        }
    }

    public static final void J(SentryHelperDebugActivity sentryHelperDebugActivity, wg0.g gVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-324595676);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(gVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(sentryHelperDebugActivity) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            OziThemeKt.OziTheme(false, a1.c.c(-1638813525, new ru.ozon.ozonSentryHelper.internal.ui.debugActivity.b(gVar, sentryHelperDebugActivity), u11), u11, 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(sentryHelperDebugActivity, gVar, i11));
        }
    }

    public static final m K(SentryHelperDebugActivity sentryHelperDebugActivity) {
        return (m) sentryHelperDebugActivity.f97614h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t.a(this);
        C10727i.c(K.a(this), null, null, new e(this, null), 3);
        C6233h.a(this, new C4912a(true, 838189367, new a()));
    }
}
