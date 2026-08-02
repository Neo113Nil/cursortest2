package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.adapter;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsVO;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.v3.holders.controls.chip.ChipHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/controls/chip/ChipView;", "view", "Lkotlin/Function1;", "", "", "onVariantSelected", "<init>", "(Lru/ozon/uni/android/controls/chip/ChipView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;", "item", "bind", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;)V", "select", "()V", "unselect", "Lru/ozon/uni/android/controls/chip/ChipView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "currentState", "Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierTipsVariantViewHolder extends j {
    private ChipState currentState;

    @NotNull
    private final Function1<Integer, Unit> onVariantSelected;

    @NotNull
    private final ChipView view;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.adapter.CourierTipsVariantViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ChipState chipState = CourierTipsVariantViewHolder.this.currentState;
            ChipState chipState2 = ChipState.SELECTED;
            if (chipState != chipState2) {
                CourierTipsVariantViewHolder.this.currentState = chipState2;
                CourierTipsVariantViewHolder.this.onVariantSelected.invoke(Integer.valueOf(CourierTipsVariantViewHolder.this.getAdapterPosition()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CourierTipsVariantViewHolder(@NotNull ChipView view, @NotNull Function1<? super Integer, Unit> onVariantSelected) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onVariantSelected, "onVariantSelected");
        this.view = view;
        this.onVariantSelected = onVariantSelected;
        view.setOnSelect(new AnonymousClass1());
    }

    public final void bind(@NotNull CourierTipsVO.CourierTipsVariant item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentState = item.getChip().getState();
        ChipView chipView = this.view;
        ChipHolderKt.bind$default(chipView, item.getChip(), null, 2, null);
        chipView.setUnselectByClick(false);
    }

    public final void select() {
        ChipState chipState = this.currentState;
        ChipState chipState2 = ChipState.SELECTED;
        if (chipState != chipState2) {
            this.currentState = chipState2;
            this.view.setChipState(chipState2);
        }
    }

    public final void unselect() {
        ChipState chipState = ChipState.ENABLED;
        this.currentState = chipState;
        if (chipState != null) {
            this.view.setChipState(chipState);
        }
    }
}
