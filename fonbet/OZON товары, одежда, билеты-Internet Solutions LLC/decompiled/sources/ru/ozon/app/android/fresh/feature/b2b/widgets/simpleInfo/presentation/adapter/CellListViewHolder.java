package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hk0.C6969b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoDTO;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/CellListViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$CellListDTO;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$CellListDTO;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/jvm/functions/Function1;", "Lhk0/b;", "cellsAdapter", "Lhk0/b;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CellListViewHolder extends ItemViewHolder<SimpleInfoDTO.CellListDTO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final C6969b cellsAdapter;

    @NotNull
    private final RecyclerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellListViewHolder(@NotNull RecyclerView view, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.actionHandler = actionHandler;
        C6969b c6969b = new C6969b(new AtomItemViewHolderDelegate(new CellListViewHolder$cellsAdapter$1(this), null, null, 6, null));
        this.cellsAdapter = c6969b;
        view.setAdapter(c6969b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r8 != (r5 != null ? r5.bottomMargin : 0)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull SimpleInfoDTO.CellListDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        RecyclerView recyclerView = this.view;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            Integer leftPadding = item.getLeftPadding();
            marginLayoutParams.setMarginStart(leftPadding != null ? UiExtKt.toPx(leftPadding.intValue()) : Dimens.INSTANCE.getDP_16());
            Integer rightPadding = item.getRightPadding();
            marginLayoutParams.setMarginEnd(rightPadding != null ? UiExtKt.toPx(rightPadding.intValue()) : Dimens.INSTANCE.getDP_16());
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = recyclerView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            recyclerView.setLayoutParams(marginLayoutParams);
        }
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer backgroundCornerRadius = item.getBackgroundCornerRadius();
        float pxF = backgroundCornerRadius != null ? UiExtKt.toPxF(backgroundCornerRadius.intValue()) : Dimens.INSTANCE.getDPF_16();
        CornersConfig cornersConfig = CornersConfig.ALL;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.setBackground(ContextExtKt.createRoundRectShape$default(context, pxF, cornersConfig, 0, styleParser.parseColor(context2, item.getListBackgroundColor(), UniColors.LAYER_FLOOR_0.getResId()), null, 20, null));
        this.cellsAdapter.submitList(item.getCells());
    }
}
