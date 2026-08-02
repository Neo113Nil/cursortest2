package gd0;

import Bc0.l;
import Bc0.m;
import Jb0.s;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgd0/e;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f64273a;

    public static final class a extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f64275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f64275c = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new d(e.this, this.f64275c);
        }
    }

    public e() {
        super(R.layout.fragment_ozon_id_restore_account);
        a aVar = new a(this);
        InterfaceC4008j a11 = k.a(n.NONE, new l(new Bc0.k(this)));
        this.f64273a = b0.b(this, N.b(h.class), new m(a11), new Bc0.n(a11), aVar);
    }

    public static final h t(e eVar) {
        return (h) eVar.f64273a.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        s a11 = s.a(view);
        h hVar = (h) this.f64273a.getValue();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new b(viewLifecycleOwner, null, hVar, this, a11), 3);
    }
}
