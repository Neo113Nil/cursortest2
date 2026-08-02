package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsFieldsAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.view.HotelsBookAdditionsSelectorFieldView;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ!\u0010\u0012\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/adapter/HotelsBookAdditionsSelectorFieldViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "item", "", "payloads", "", "bindWithPayloads", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;Ljava/util/List;)V", "", "bind", "Lkotlin/Function1;", "", "onSelectorClicked", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/view/HotelsBookAdditionsSelectorFieldView;", "fieldView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/view/HotelsBookAdditionsSelectorFieldView;", "boundedData", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "Lkotlin/jvm/functions/Function1;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookAdditionsSelectorFieldViewHolder extends BaseViewHolder<HotelsBookAdditionsVO.FieldVO> {
    private HotelsBookAdditionsVO.FieldVO boundedData;
    private final HotelsBookAdditionsSelectorFieldView fieldView;
    private Function1<? super Long, Unit> onSelectorClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookAdditionsSelectorFieldViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.fieldView = view instanceof HotelsBookAdditionsSelectorFieldView ? (HotelsBookAdditionsSelectorFieldView) view : null;
    }

    private final void bindWithPayloads(HotelsBookAdditionsVO.FieldVO item, List<?> payloads) {
        HotelsBookAdditionsSelectorFieldView hotelsBookAdditionsSelectorFieldView;
        for (Object obj : payloads) {
            if (obj instanceof List) {
                bindWithPayloads(item, (List) obj);
            } else if (obj == HotelsBookAdditionsFieldsAdapter.Payload.SUBTITLE) {
                HotelsBookAdditionsSelectorFieldView hotelsBookAdditionsSelectorFieldView2 = this.fieldView;
                if (hotelsBookAdditionsSelectorFieldView2 != null) {
                    hotelsBookAdditionsSelectorFieldView2.bindSubtitle(item.getSubtitle());
                }
            } else if (obj == InputPayload.CHANGE_VALUE) {
                HotelsBookAdditionsSelectorFieldView hotelsBookAdditionsSelectorFieldView3 = this.fieldView;
                if (hotelsBookAdditionsSelectorFieldView3 != null) {
                    CommonInputVO input = item.getInput();
                    Intrinsics.g(input, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.Selector");
                    hotelsBookAdditionsSelectorFieldView3.updateValue((CommonInputVO.Selector) input);
                }
            } else if (obj == InputPayload.ERROR) {
                HotelsBookAdditionsSelectorFieldView hotelsBookAdditionsSelectorFieldView4 = this.fieldView;
                if (hotelsBookAdditionsSelectorFieldView4 != null) {
                    CommonInputVO input2 = item.getInput();
                    Intrinsics.g(input2, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.Selector");
                    hotelsBookAdditionsSelectorFieldView4.bindError((CommonInputVO.Selector) input2);
                }
            } else if (obj == InputPayload.CHANGE_VALUE_WITH_ERROR && (hotelsBookAdditionsSelectorFieldView = this.fieldView) != null) {
                CommonInputVO input3 = item.getInput();
                Intrinsics.g(input3, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.Selector");
                hotelsBookAdditionsSelectorFieldView.updateValue((CommonInputVO.Selector) item.getInput());
                hotelsBookAdditionsSelectorFieldView.bindError((CommonInputVO.Selector) item.getInput());
            }
        }
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(HotelsBookAdditionsVO.FieldVO fieldVO, List list) {
        bind2(fieldVO, (List<? extends Object>) list);
    }

    public final void removeCallbacks() {
        this.onSelectorClicked = null;
    }

    public final void setupCallbacks(@NotNull Function1<? super Long, Unit> onSelectorClicked) {
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        this.onSelectorClicked = onSelectorClicked;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull HotelsBookAdditionsVO.FieldVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.boundedData = item;
        if (!payloads.isEmpty()) {
            bindWithPayloads(item, payloads);
            return;
        }
        HotelsBookAdditionsSelectorFieldView hotelsBookAdditionsSelectorFieldView = this.fieldView;
        if (hotelsBookAdditionsSelectorFieldView != null) {
            CommonInputVO input = item.getInput();
            Intrinsics.g(input, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.Selector");
            hotelsBookAdditionsSelectorFieldView.bindInput((CommonInputVO.Selector) input, new HotelsBookAdditionsSelectorFieldViewHolder$bind$1$1(this));
            hotelsBookAdditionsSelectorFieldView.bindSubtitle(item.getSubtitle());
        }
    }
}
