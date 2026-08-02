package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v1/presentation/InputDiffUtilItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;)Z", "areContentsTheSame", "Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "getChangePayload", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;)Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InputDiffUtilItemCallback extends i.d<CommonInputVO> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull CommonInputVO oldItem, @NotNull CommonInputVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull CommonInputVO oldItem, @NotNull CommonInputVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getId() == newItem.getId();
    }

    @Override // androidx.recyclerview.widget.i.d
    public InputPayload getChangePayload(@NotNull CommonInputVO oldItem, @NotNull CommonInputVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        InputPayload inputPayload = !Intrinsics.d(oldItem.getValue(), newItem.getValue()) ? InputPayload.CHANGE_VALUE : null;
        return (Intrinsics.d(oldItem.getError(), newItem.getError()) && oldItem.getIsErrorVisible() == newItem.getIsErrorVisible()) ? inputPayload : inputPayload == null ? InputPayload.ERROR : InputPayload.CHANGE_VALUE_WITH_ERROR;
    }
}
