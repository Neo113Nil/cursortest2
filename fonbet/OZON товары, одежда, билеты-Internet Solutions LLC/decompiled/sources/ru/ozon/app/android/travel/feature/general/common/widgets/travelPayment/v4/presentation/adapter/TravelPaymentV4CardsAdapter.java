package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.adapter;

import Ej.b;
import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view.BankCardView;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view.CustomMethodView;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view.ImageBankCardView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardViewHolder;ILjava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardViewHolder;", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "TravelPaymentV4DiffUtilItemCallback", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPaymentV4CardsAdapter extends i<TravelPaymentV4VO.PaymentMethod, TravelPaymentV4CardViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardsAdapter$TravelPaymentV4DiffUtilItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;)Ljava/lang/Object;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TravelPaymentV4DiffUtilItemCallback extends i.d<TravelPaymentV4VO.PaymentMethod> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull TravelPaymentV4VO.PaymentMethod oldItem, @NotNull TravelPaymentV4VO.PaymentMethod newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull TravelPaymentV4VO.PaymentMethod oldItem, @NotNull TravelPaymentV4VO.PaymentMethod newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }

        @Override // androidx.recyclerview.widget.i.d
        public Object getChangePayload(@NotNull TravelPaymentV4VO.PaymentMethod oldItem, @NotNull TravelPaymentV4VO.PaymentMethod newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (Intrinsics.d(oldItem.getBorderColor(), newItem.getBorderColor())) {
                return null;
            }
            return newItem;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TravelPaymentV4CardsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull J lifecycleOwner) {
        super(new TravelPaymentV4DiffUtilItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TravelPaymentV4VO.PaymentMethod paymentMethod = getCurrentList().get(position);
        if (paymentMethod instanceof TravelPaymentV4VO.BankCardMethodVO) {
            return R$id.travelPaymentV4BankCard;
        }
        if (paymentMethod instanceof TravelPaymentV4VO.BankImageMethodVO) {
            return R$id.travelPaymentV4BankImage;
        }
        if (paymentMethod instanceof TravelPaymentV4VO.CustomMethodVO) {
            return R$id.travelPaymentV4CustomMethod;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((TravelPaymentV4CardViewHolder) c11, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TravelPaymentV4CardViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$id.travelPaymentV4BankCard) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new BankCardViewHolder(new BankCardView(context), this.onAction);
        }
        if (viewType == R$id.travelPaymentV4BankImage) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new BankImageViewHolder(new ImageBankCardView(context2), this.onAction);
        }
        if (viewType != R$id.travelPaymentV4CustomMethod) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return new CustomMethodViewHolder(new CustomMethodView(context3), this.onAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TravelPaymentV4CardViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelPaymentV4VO.PaymentMethod paymentMethod = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(paymentMethod, "get(...)");
        holder.bind(paymentMethod);
    }

    public void onBindViewHolder(@NotNull TravelPaymentV4CardViewHolder holder, int position, @NotNull List<? extends Object> payloads) {
        String borderColor;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Object M11 = C7714v.M(payloads);
        TravelPaymentV4VO.PaymentMethod paymentMethod = M11 instanceof TravelPaymentV4VO.PaymentMethod ? (TravelPaymentV4VO.PaymentMethod) M11 : null;
        if (paymentMethod != null && (borderColor = paymentMethod.getBorderColor()) != null) {
            holder.setBorderColor(borderColor);
        } else {
            super.onBindViewHolder((TravelPaymentV4CardsAdapter) holder, position, (List<Object>) payloads);
        }
    }
}
