package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.adapter;

import G.g;
import PP.a;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view.AbstractCardView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b!\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/AbstractCardView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/AbstractCardView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;)V", "", "borderColor", "setBorderColor", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/TestInfo;", "automatizationId", "locator", "buildContentDescription", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/AbstractCardView;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "setAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TravelPaymentV4CardViewHolder extends j {
    private AtomAction action;

    @NotNull
    private final AbstractCardView view;

    @NotNull
    protected static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardViewHolder$Companion;", "", "<init>", "()V", "LOCATOR_PAYMENT_METHOD_BAND_CARD", "", "LOCATOR_PAYMENT_METHOD_CUSTOM", "LOCATOR_PAYMENT_METHOD_BANK_IMAGE", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPaymentV4CardViewHolder(@NotNull AbstractCardView view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        view.setOnClickListener(new a(0, this, onAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TravelPaymentV4CardViewHolder travelPaymentV4CardViewHolder, Function1 function1, View view) {
        AtomAction atomAction = travelPaymentV4CardViewHolder.action;
        if (atomAction != null) {
            function1.invoke(atomAction);
        }
    }

    public abstract void bind(@NotNull TravelPaymentV4VO.PaymentMethod item);

    @NotNull
    protected final String buildContentDescription(TestInfo automatizationId, @NotNull String locator) {
        String c11;
        Intrinsics.checkNotNullParameter(locator, "locator");
        return (automatizationId == null || (c11 = g.c(locator, ".", automatizationId.getAutomatizationId())) == null) ? locator : c11;
    }

    protected final void setAction(AtomAction atomAction) {
        this.action = atomAction;
    }

    public final void setBorderColor(@NotNull String borderColor) {
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.view.setBorderColor(borderColor);
    }
}
