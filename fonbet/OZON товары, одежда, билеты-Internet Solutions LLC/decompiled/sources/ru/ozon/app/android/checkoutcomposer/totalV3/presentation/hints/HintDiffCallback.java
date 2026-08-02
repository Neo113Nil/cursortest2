package ru.ozon.app.android.checkoutcomposer.totalV3.presentation.hints;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3VO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/hints/HintDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;)Z", "areContentsTheSame", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HintDiffCallback extends i.d<TotalV3VO.HintVO> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull TotalV3VO.HintVO oldItem, @NotNull TotalV3VO.HintVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        TextDTO message = oldItem.getMessage();
        OzonSpannableString text = message != null ? message.getText() : null;
        TextDTO message2 = oldItem.getMessage();
        return Intrinsics.d(text, message2 != null ? message2.getText() : null);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull TotalV3VO.HintVO oldItem, @NotNull TotalV3VO.HintVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }
}
