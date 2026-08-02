package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.FreshPaymentInfoVO;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.viewHolder.BaseFreshPaymentViewHolder;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.viewHolder.CardFreshPaymentView;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.viewHolder.CardFreshPaymentViewHolderFresh;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.viewHolder.DefaultFreshPaymentView;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.viewHolder.DefaultFreshPaymentViewHolderFresh;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/FreshPaymentListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO$Payment;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/viewHolder/BaseFreshPaymentViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/viewHolder/BaseFreshPaymentViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/viewHolder/BaseFreshPaymentViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshPaymentListAdapter extends t<FreshPaymentInfoVO.Payment, BaseFreshPaymentViewHolder> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/FreshPaymentListAdapter$Companion;", "", "<init>", "()V", "VIEW_TYPE_DEFAULT", "", "VIEW_TYPE_CARD", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FreshPaymentInfoVO.Payment.StyleType.values().length];
            try {
                iArr[FreshPaymentInfoVO.Payment.StyleType.STYLE_TYPE_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FreshPaymentInfoVO.Payment.StyleType.STYLE_TYPE_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FreshPaymentListAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new i.d<FreshPaymentInfoVO.Payment>() { // from class: ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.FreshPaymentListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(FreshPaymentInfoVO.Payment oldItem, FreshPaymentInfoVO.Payment newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(FreshPaymentInfoVO.Payment oldItem, FreshPaymentInfoVO.Payment newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.hashCode() == newItem.hashCode();
            }
        });
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getItem(position).getType().ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 0;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseFreshPaymentViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FreshPaymentInfoVO.Payment item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseFreshPaymentViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            DefaultFreshPaymentView defaultFreshPaymentView = new DefaultFreshPaymentView(context, null, 0, 6, null);
            defaultFreshPaymentView.setId(R$id.paymentFl);
            return new DefaultFreshPaymentViewHolderFresh(defaultFreshPaymentView, this.onAction);
        }
        if (viewType != 1) {
            throw new IllegalStateException("undefined viewType for " + this);
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CardFreshPaymentView cardFreshPaymentView = new CardFreshPaymentView(context2, null, 0, 6, null);
        cardFreshPaymentView.setId(R$id.paymentFl);
        return new CardFreshPaymentViewHolderFresh(cardFreshPaymentView, this.onAction);
    }
}
