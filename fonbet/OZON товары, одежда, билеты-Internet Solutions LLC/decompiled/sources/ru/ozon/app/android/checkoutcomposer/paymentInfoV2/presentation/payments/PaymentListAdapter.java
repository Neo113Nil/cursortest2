package ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments;

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
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.PaymentInfoV2VO;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.BasePaymentViewHolder;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.CardPaymentView;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.CardPaymentViewHolder;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.DefaultPaymentView;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.DefaultPaymentViewHolder;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/PaymentListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/viewHolder/BasePaymentViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/utils/AppType;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/viewHolder/BasePaymentViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/viewHolder/BasePaymentViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/utils/AppType;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentListAdapter extends t<PaymentInfoV2VO.Payment, BasePaymentViewHolder> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppType appType;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/PaymentListAdapter$Companion;", "", "<init>", "()V", "VIEW_TYPE_DEFAULT", "", "VIEW_TYPE_CARD", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int[] iArr = new int[PaymentInfoV2VO.Payment.StyleType.values().length];
            try {
                iArr[PaymentInfoV2VO.Payment.StyleType.STYLE_TYPE_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentInfoV2VO.Payment.StyleType.STYLE_TYPE_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentListAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull AppType appType) {
        super(new i.d<PaymentInfoV2VO.Payment>() { // from class: ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.PaymentListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(PaymentInfoV2VO.Payment oldItem, PaymentInfoV2VO.Payment newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(PaymentInfoV2VO.Payment oldItem, PaymentInfoV2VO.Payment newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.hashCode() == newItem.hashCode();
            }
        });
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.onAction = onAction;
        this.appType = appType;
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
    public void onBindViewHolder(@NotNull BasePaymentViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PaymentInfoV2VO.Payment item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BasePaymentViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            DefaultPaymentView defaultPaymentView = new DefaultPaymentView(context, null, 0, 6, null);
            defaultPaymentView.setId(R$id.paymentFl);
            return new DefaultPaymentViewHolder(defaultPaymentView, this.appType, this.onAction);
        }
        if (viewType != 1) {
            throw new IllegalStateException("undefined viewType for " + this);
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CardPaymentView cardPaymentView = new CardPaymentView(context2, null, 0, 6, null);
        cardPaymentView.setId(R$id.paymentFl);
        return new CardPaymentViewHolder(cardPaymentView, this.appType, this.onAction);
    }
}
