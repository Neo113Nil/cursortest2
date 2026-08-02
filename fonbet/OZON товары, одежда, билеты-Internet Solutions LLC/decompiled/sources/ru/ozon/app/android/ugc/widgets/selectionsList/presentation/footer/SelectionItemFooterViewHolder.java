package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.footer;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/footer/SelectionItemFooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/widget/LinearLayout;", "root", "<init>", "(Landroid/widget/LinearLayout;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter$StatusSelectionVO;", "status", "", "isLast", "buildStatusView", "(Landroid/content/Context;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter$StatusSelectionVO;Z)Landroid/widget/LinearLayout;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter;", "item", "", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter;)V", "Landroid/widget/LinearLayout;", "statusesRow", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionItemFooterViewHolder extends RecyclerView.C {

    @NotNull
    private final IconView iconView;

    @NotNull
    private final LinearLayout root;

    @NotNull
    private final LinearLayout statusesRow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionItemFooterViewHolder(@NotNull LinearLayout root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        LinearLayout linearLayout = new LinearLayout(root.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.setGravity(16);
        linearLayout.setClipToPadding(false);
        root.addView(linearLayout);
        this.statusesRow = linearLayout;
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        root.addView(iconView);
        this.iconView = iconView;
    }

    private final LinearLayout buildStatusView(Context context, SelectionsListVI.TileFooterContent.SelectionItemFooter.StatusSelectionVO status, boolean isLast) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (!isLast) {
            layoutParams.setMarginEnd(Dimens.INSTANCE.getDP_4());
        }
        linearLayout.setLayoutParams(layoutParams);
        int i11 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i12 = 0;
        IconView iconView = new IconView(context, null, i12, i11, defaultConstructorMarker);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd(Dimens.INSTANCE.getDP_2());
        layoutParams2.gravity = 16;
        iconView.setLayoutParams(layoutParams2);
        IconHolderKt.bind$default(iconView, status.getIcon(), null, 2, null);
        linearLayout.addView(iconView);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, i12, i11, defaultConstructorMarker);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        textAtomV2View.setLayoutParams(layoutParams3);
        textAtomV2View.setIncludeFontPadding(false);
        TextHolderKt.bind$default(textAtomV2View, status.getText(), null, 2, null);
        linearLayout.addView(textAtomV2View);
        return linearLayout;
    }

    public final void bind(@NotNull SelectionsListVI.TileFooterContent.SelectionItemFooter item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.statusesRow.removeAllViews();
        int i11 = 0;
        for (Object obj : item.getStatusList()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SelectionsListVI.TileFooterContent.SelectionItemFooter.StatusSelectionVO statusSelectionVO = (SelectionsListVI.TileFooterContent.SelectionItemFooter.StatusSelectionVO) obj;
            LinearLayout linearLayout = this.statusesRow;
            Context context = this.root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            linearLayout.addView(buildStatusView(context, statusSelectionVO, i11 == C7714v.P(item.getStatusList())));
            i11 = i12;
        }
        IconHolderKt.bindOrGone$default(this.iconView, item.getIcon(), null, 2, null);
    }
}
