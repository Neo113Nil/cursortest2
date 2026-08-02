package ru.ozon.fintech.features.tabber.presentation.rko;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l80.f;
import l80.g;
import org.jetbrains.annotations.NotNull;
import p80.C8871a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/tabber/presentation/rko/RkoActivity;", "Ll80/f;", "<init>", "()V", "a", "tabber_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RkoActivity extends f {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f96340t0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    @NotNull
    private O30.b f96341r0 = O30.b.RKO;

    /* renamed from: s0, reason: collision with root package name */
    @NotNull
    private final y0 f96342s0 = new y0(N.b(C8871a.class), new b(), new B50.b(this, 3), new c());

    public static final class a {
        @NotNull
        public static Intent a(@NotNull Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) RkoActivity.class);
            intent.putExtra("SHOW_BACK", true);
            if (str != null) {
                intent.setData(Uri.parse(str));
            }
            return intent;
        }
    }

    public static final class b extends AbstractC7737t implements Function0<A0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return RkoActivity.this.getViewModelStore();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<AbstractC6409a> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return RkoActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // l80.f
    public final g j0() {
        return (C8871a) this.f96342s0.getValue();
    }

    @Override // l80.f, androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i11 = O30.a.f19934c;
        ((g80.b) O30.a.a(this.f96341r0).a(g80.b.class)).F(this);
        super.onCreate(bundle);
    }

    @Override // l80.i
    @NotNull
    public final R80.b r(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return f0().a(deeplink);
    }

    @Override // O30.d
    @NotNull
    /* renamed from: w, reason: from getter */
    public final O30.b getF96324r0() {
        return this.f96341r0;
    }
}
