package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.adapter;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsVO;
import ru.ozon.app.android.orderdone.R$id;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002 !B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001cR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "", "onVariantSelected", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "", "list", "submitList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantViewHolder;I)V", "", "", "payload", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantViewHolder;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "selectedVariantPosition", "I", "Companion", "PayloadType", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierTipsVariantsAdapter extends i<CourierTipsVO.CourierTipsVariant, CourierTipsVariantViewHolder> {

    @NotNull
    private final Function1<CourierTipsVO.CourierTipsVariant, Unit> onVariantSelected;
    private int selectedVariantPosition;
    public static final int $stable = 8;
    private static final int MARGIN_HORIZONTAL = UiExtKt.toPx(4);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantsAdapter$PayloadType;", "", "<init>", "(Ljava/lang/String;I)V", "SELECT", "UNSELECT", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PayloadType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PayloadType[] $VALUES;
        public static final PayloadType SELECT = new PayloadType("SELECT", 0);
        public static final PayloadType UNSELECT = new PayloadType("UNSELECT", 1);

        private static final /* synthetic */ PayloadType[] $values() {
            return new PayloadType[]{SELECT, UNSELECT};
        }

        static {
            PayloadType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PayloadType(String str, int i11) {
        }

        public static PayloadType valueOf(String str) {
            return (PayloadType) Enum.valueOf(PayloadType.class, str);
        }

        public static PayloadType[] values() {
            return (PayloadType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CourierTipsVariantsAdapter(@NotNull J containerViewLifecycleOwner, @NotNull Function1<? super CourierTipsVO.CourierTipsVariant, Unit> onVariantSelected) {
        super(new CourierTipsVariantsDiffUtil(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(onVariantSelected, "onVariantSelected");
        this.onVariantSelected = onVariantSelected;
        this.selectedVariantPosition = -1;
    }

    @Override // androidx.recyclerview.widget.t
    public void submitList(List<CourierTipsVO.CourierTipsVariant> list) {
        int i11;
        if (list != null) {
            Iterator<CourierTipsVO.CourierTipsVariant> it = list.iterator();
            i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (it.next().getChip().getState() == ChipState.SELECTED) {
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            i11 = this.selectedVariantPosition;
        }
        this.selectedVariantPosition = i11;
        super.submitList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((CourierTipsVariantViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CourierTipsVariantViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ChipView chipView = new ChipView(context, null, 0, 0, 14, null);
        chipView.setId(R$id.chip);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = MARGIN_HORIZONTAL;
        layoutParams.setMargins(i11, 0, i11, 0);
        chipView.setLayoutParams(layoutParams);
        return new CourierTipsVariantViewHolder(chipView, new CourierTipsVariantsAdapter$onCreateViewHolder$2(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CourierTipsVariantViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CourierTipsVO.CourierTipsVariant courierTipsVariant = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(courierTipsVariant, "get(...)");
        holder.bind(courierTipsVariant);
    }

    public void onBindViewHolder(@NotNull CourierTipsVariantViewHolder holder, int position, @NotNull List<Object> payload) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        View view = holder.itemView;
        TestInfo testInfo = getItem(position).getChip().getTestInfo();
        view.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        Object M11 = C7714v.M(payload);
        if (M11 == PayloadType.SELECT) {
            holder.select();
        } else {
            if (M11 == PayloadType.UNSELECT) {
                holder.unselect();
                return;
            }
            CourierTipsVO.CourierTipsVariant courierTipsVariant = getCurrentList().get(position);
            Intrinsics.checkNotNullExpressionValue(courierTipsVariant, "get(...)");
            holder.bind(courierTipsVariant);
        }
    }
}
