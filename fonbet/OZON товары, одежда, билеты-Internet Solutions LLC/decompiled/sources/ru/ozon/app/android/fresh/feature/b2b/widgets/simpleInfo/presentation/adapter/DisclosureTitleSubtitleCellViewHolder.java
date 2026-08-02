package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.adapter;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureTitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/DisclosureTitleSubtitleCellViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "disclosureTitleSubtitleCellView", "Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DisclosureTitleSubtitleCellViewHolder extends ItemViewHolder<DisclosureTitleSubtitleCellDTO> {
    public static final int $stable = DisclosureTitleSubtitleCellView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DisclosureTitleSubtitleCellViewHolder(@NotNull DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(disclosureTitleSubtitleCellView);
        Intrinsics.checkNotNullParameter(disclosureTitleSubtitleCellView, "disclosureTitleSubtitleCellView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.disclosureTitleSubtitleCellView = disclosureTitleSubtitleCellView;
        this.actionHandler = actionHandler;
    }

    public void bind(@NotNull DisclosureTitleSubtitleCellDTO item) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(item, "item");
        DisclosureTitleSubtitleCellHolderKt.bindOrGone(this.disclosureTitleSubtitleCellView, item, this.actionHandler);
        int i11 = 0;
        for (View view : ViewGroupExtKt.children(this.disclosureTitleSubtitleCellView)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view2 = view;
            if (view2 instanceof ImageView) {
                CommonCellSettings common = item.getCommon();
                if (common != null && (action = common.getAction()) != null) {
                    r4 = action.getId();
                }
            } else {
                TestInfo testInfo = item.getTestInfo();
                r4 = (testInfo != null ? testInfo.getAutomatizationId() : null) + i11;
            }
            view2.setContentDescription(r4);
            i11 = i12;
        }
    }
}
