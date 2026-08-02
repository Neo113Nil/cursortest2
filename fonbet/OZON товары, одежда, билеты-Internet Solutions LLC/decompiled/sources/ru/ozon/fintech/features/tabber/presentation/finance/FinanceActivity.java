package ru.ozon.fintech.features.tabber.presentation.finance;

import Q90.n;
import Sc.C4001c;
import V80.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import d80.C6101b;
import f3.AbstractC6409a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import l80.f;
import l80.g;
import m80.C8107a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/features/tabber/presentation/finance/FinanceActivity;", "Ll80/f;", "LO30/d;", "<init>", "()V", "a", "tabber_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FinanceActivity extends f {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f96328u0 = 0;

    /* renamed from: s0, reason: collision with root package name */
    public V80.b f96330s0;

    /* renamed from: r0, reason: collision with root package name */
    @NotNull
    private final O30.b f96329r0 = O30.b.FINANCE;

    /* renamed from: t0, reason: collision with root package name */
    @NotNull
    private final y0 f96331t0 = new y0(N.b(C8107a.class), new b(), new C6101b(this, 2), new c());

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static Intent a(@NotNull Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) FinanceActivity.class);
            intent.putExtra("SHOW_BACK", true);
            intent.putExtra("THEME_ID", (Serializable) null);
            if (str != null) {
                intent.setData(Uri.parse(str));
            }
            return intent;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AbstractC7737t implements Function0<A0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return FinanceActivity.this.getViewModelStore();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AbstractC7737t implements Function0<AbstractC6409a> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return FinanceActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // l80.f
    @NotNull
    public final Intent i0() {
        n nVar = this.f72985N;
        if (nVar == null) {
            Intrinsics.n("ultraManager");
            throw null;
        }
        if (!nVar.h()) {
            return super.i0();
        }
        n nVar2 = this.f72985N;
        if (nVar2 != null) {
            return nVar2.e();
        }
        Intrinsics.n("ultraManager");
        throw null;
    }

    @Override // l80.f
    public final g j0() {
        return (C8107a) this.f96331t0.getValue();
    }

    @Override // l80.f, androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i11 = O30.a.f19934c;
        O30.b bVar = this.f96329r0;
        ((g80.b) O30.a.a(bVar).a(g80.b.class)).i1(this);
        super.onCreate(bundle);
        boolean isStandAloneIntegration = g0().isStandAloneIntegration();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        boolean z11 = W30.a.a(applicationContext, bVar).getBoolean("ultra_state", false);
        for (d dVar : C7714v.b0(new d("deposit", "/links/deposit", R.string.fintech_nav_deposit_short_label, R.string.fintech_nav_deposit_long_label, R.string.fintech_nav_deposit_disabled_message, R.drawable.ic_m_circle_plus_filled, isStandAloneIntegration), new d("payments", "/links/shortcuts/payments", R.string.fintech_nav_payments_short_label, R.string.fintech_nav_payments_long_label, R.string.fintech_nav_payments_disabled_message, R.drawable.ic_m_sbp, isStandAloneIntegration), new d())) {
            if (dVar.f()) {
                V80.b bVar2 = this.f96330s0;
                if (bVar2 == null) {
                    Intrinsics.n("fintechShortcutManager");
                    throw null;
                }
                String c11 = dVar.c();
                int e11 = dVar.e();
                int d11 = dVar.d();
                int a11 = dVar.a();
                int b11 = dVar.b();
                String g10 = dVar.g();
                Uri build = Uri.parse(h.D0(g0().u() ? g0().getBankUrlStage() : g0().getBankUrlRelease(), '/') + g10).buildUpon().appendQueryParameter("from", "android_shortcuts_menu").build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                Intent intent = new Intent("android.intent.action.VIEW", build, this, FinanceActivity.class);
                if (z11) {
                    intent.setComponent(new ComponentName(this, "ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivityUltra"));
                }
                bVar2.b(c11, e11, d11, a11, b11, intent);
            } else {
                try {
                    V80.b bVar3 = this.f96330s0;
                    if (bVar3 == null) {
                        Intrinsics.n("fintechShortcutManager");
                        throw null;
                    }
                    bVar3.a(dVar.c());
                } catch (Exception e12) {
                    L80.a.a("BaseTabActivity", "Error while deleting shortcut with id: " + dVar.c() + "; " + C4001c.b(e12));
                }
            }
        }
    }

    @Override // l80.i
    @NotNull
    public final R80.b r(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return f0().M0(deeplink);
    }

    @Override // O30.d
    @NotNull
    /* renamed from: w, reason: from getter */
    public final O30.b getF96324r0() {
        return this.f96329r0;
    }
}
