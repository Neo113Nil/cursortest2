package ru.ozon.fintech.features.tabber.presentation.apvz;

import android.os.Bundle;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import f3.AbstractC6409a;
import k80.C7607a;
import k80.C7608b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l80.f;
import l80.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/tabber/presentation/apvz/ApvzNewActivity;", "Ll80/f;", "LO30/d;", "<init>", "()V", "tabber_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApvzNewActivity extends f {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f96323t0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    @NotNull
    private final O30.b f96324r0 = O30.b.APVZ;

    /* renamed from: s0, reason: collision with root package name */
    @NotNull
    private final y0 f96325s0 = new y0(N.b(C7608b.class), new a(), new C7607a(this, 0), new b());

    public static final class a extends AbstractC7737t implements Function0<A0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ApvzNewActivity.this.getViewModelStore();
        }
    }

    public static final class b extends AbstractC7737t implements Function0<AbstractC6409a> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return ApvzNewActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // l80.f
    public final g j0() {
        return (C7608b) this.f96325s0.getValue();
    }

    @Override // l80.f, androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i11 = O30.a.f19934c;
        ((g80.b) O30.a.a(this.f96324r0).a(g80.b.class)).V(this);
        super.onCreate(bundle);
    }

    @Override // l80.i
    @NotNull
    public final R80.b r(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return f0().A(deeplink);
    }

    @Override // O30.d
    @NotNull
    /* renamed from: w, reason: from getter */
    public final O30.b getF96324r0() {
        return this.f96324r0;
    }
}
