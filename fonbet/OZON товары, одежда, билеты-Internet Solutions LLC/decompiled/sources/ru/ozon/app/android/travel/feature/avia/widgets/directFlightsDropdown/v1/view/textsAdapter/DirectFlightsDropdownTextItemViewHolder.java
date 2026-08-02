package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.textsAdapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/textsAdapter/DirectFlightsDropdownTextItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "data", "", "bind", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownTextItemViewHolder extends RecyclerView.C {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectFlightsDropdownTextItemViewHolder(@NotNull TextAtomV2View textView) {
        super(textView);
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.textView = textView;
    }

    public final void bind(@NotNull TextDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        TextHolderKt.bind$default(this.textView, data, null, 2, null);
    }
}
