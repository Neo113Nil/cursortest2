package eu;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.ai.C9413c;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalViewHolder;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f62399b;

    public /* synthetic */ a(J j11, int i11) {
        this.f62398a = i11;
        this.f62399b = j11;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J j11, AbstractC5434v.a event) {
        switch (this.f62398a) {
            case 0:
                CheckoutTotalViewHolder.lifecycleObserver$lambda$4((CheckoutTotalViewHolder) this.f62399b, j11, event);
                break;
            default:
                Intrinsics.checkNotNullParameter(j11, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                int i11 = C9413c.i.a.f89465a[event.ordinal()];
                C9413c c9413c = (C9413c) this.f62399b;
                if (i11 == 1) {
                    C9413c.A(c9413c).U0();
                    break;
                } else if (i11 == 2) {
                    C9413c.A(c9413c).V0();
                    break;
                }
                break;
        }
    }
}
