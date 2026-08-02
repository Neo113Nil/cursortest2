package ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.dynamicElements;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleToggleHolderKt;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/dynamicElements/CellWithSubtitleToggleVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleToggleView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleToggleView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "item", "bind", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;)V", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleToggleView;", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitleToggleVH extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final CellWithSubtitleToggleView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellWithSubtitleToggleVH(@NotNull CellWithSubtitleToggleView view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        this.onAction = onAction;
    }

    public final void bind(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellWithSubtitleToggleHolderKt.bind(this.view, item, this.onAction);
    }
}
