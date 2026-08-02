package ru.ozon.app.android.checkoutcomposer.common.paymentButton.presentation.sticky;

import Ih.a;
import android.view.ViewGroup;
import c20.r;
import d20.AbstractC6065b;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.paymentButton.models.PaymentButtonDTO;
import ru.ozon.app.android.checkoutcomposer.common.paymentButton.models.PaymentButtonVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/paymentButton/presentation/sticky/PaymentButtonViewStickyNoUIMapper;", "Lc20/r;", "Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonDTO;", "Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonVO;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentButtonViewStickyNoUIMapper extends r<PaymentButtonDTO, PaymentButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final PaymentButtonVO toVO(PaymentButtonDTO paymentButtonDTO, String str) {
        if ((paymentButtonDTO.isSticky() ? paymentButtonDTO : null) != null) {
            return new PaymentButtonVO(a.a("PaymentButtonWidget", str), paymentButtonDTO.getButton());
        }
        return null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<PaymentButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        h.a<l> q11 = container.J().q();
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        return new PaymentButtonStickyViewHolder(Z11, (ComposerReferences) V11, q11);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PaymentButtonVO> map(@NotNull PaymentButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        PaymentButtonVO vo = toVO(state, info.d());
        List<PaymentButtonVO> a02 = vo != null ? C7714v.a0(vo) : null;
        return a02 == null ? K.f71697a : a02;
    }
}
