package ru.ozon.app.android.checkoutcomposer.totalV3.presentation.hints;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3VO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/hints/HintViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "view", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;", "item", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HintViewHolder extends RecyclerView.C {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HintViewHolder(@NotNull TextAtomV2View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull TotalV3VO.HintVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(this.view, item.getMessage(), null, 2, null);
    }
}
