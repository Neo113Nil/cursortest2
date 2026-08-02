package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonCheckboxInputView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u000b2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v1/presentation/listAdapter/CheckboxInputViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonCheckboxInputView;", "inputView", "<init>", "(Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonCheckboxInputView;)V", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;", "item", "", "payloads", "", "bindWithPayloads", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;Ljava/util/List;)V", "", "bind", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;Ljava/util/List;)V", "Lkotlin/Function2;", "", "", "onCheckboxChanged", "setupCallbacks", "(Lkotlin/jvm/functions/Function2;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonCheckboxInputView;", "Lkotlin/jvm/functions/Function2;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CheckboxInputViewHolder extends BaseViewHolder<CommonInputVO> {

    @NotNull
    private final CommonCheckboxInputView inputView;
    private Function2<? super Long, ? super Boolean, Unit> onCheckboxChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxInputViewHolder(@NotNull CommonCheckboxInputView inputView) {
        super(inputView);
        Intrinsics.checkNotNullParameter(inputView, "inputView");
        this.inputView = inputView;
    }

    private final void bindWithPayloads(CommonInputVO.Checkbox item, List<?> payloads) {
        for (Object obj : payloads) {
            if (obj instanceof List) {
                bindWithPayloads(item, (List) obj);
            } else if (obj == InputPayload.CHANGE_VALUE) {
                this.inputView.updateValue(item);
            } else if (obj == InputPayload.ERROR) {
                this.inputView.bindError(item);
            } else if (obj == InputPayload.CHANGE_VALUE_WITH_ERROR) {
                this.inputView.updateValue(item);
                this.inputView.bindError(item);
            }
        }
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(CommonInputVO commonInputVO, List list) {
        bind2(commonInputVO, (List<? extends Object>) list);
    }

    public final void removeCallbacks() {
        this.onCheckboxChanged = null;
    }

    public final void setupCallbacks(Function2<? super Long, ? super Boolean, Unit> onCheckboxChanged) {
        this.onCheckboxChanged = onCheckboxChanged;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull CommonInputVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (item instanceof CommonInputVO.Checkbox) {
            if (payloads.isEmpty()) {
                this.inputView.bind((CommonInputVO.Checkbox) item, new CheckboxInputViewHolder$bind$1(this));
            } else {
                bindWithPayloads((CommonInputVO.Checkbox) item, payloads);
            }
        }
    }
}
