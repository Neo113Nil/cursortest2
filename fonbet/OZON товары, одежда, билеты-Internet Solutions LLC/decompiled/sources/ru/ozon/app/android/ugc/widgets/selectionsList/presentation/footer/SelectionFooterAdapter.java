package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.footer;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/footer/SelectionFooterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "<init>", "()V", "", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "list", "submit", "(Ljava/util/List;)V", "", "items", "Ljava/util/List;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFooterAdapter extends RecyclerView.g<RecyclerView.C> {

    @NotNull
    private final List<SelectionsListVI.TileFooterContent> items = new ArrayList();

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/footer/SelectionFooterAdapter$Companion;", "", "<init>", "()V", "TYPE_SELECTION_INFO", "", "TYPE_SELECTION_ITEM_FOOTER", "TYPE_REVIEW", "TYPE_PRICE", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        SelectionsListVI.TileFooterContent tileFooterContent = this.items.get(position);
        if (tileFooterContent instanceof SelectionsListVI.TileFooterContent.SelectionInfo) {
            return 0;
        }
        if (tileFooterContent instanceof SelectionsListVI.TileFooterContent.SelectionItemFooter) {
            return 1;
        }
        if (tileFooterContent instanceof SelectionsListVI.TileFooterContent.ReviewPreviewTitleRating) {
            return 2;
        }
        if (tileFooterContent instanceof SelectionsListVI.TileFooterContent.PriceWrapper) {
            return 3;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof SelectionInfoViewHolder) {
            SelectionsListVI.TileFooterContent tileFooterContent = this.items.get(position);
            Intrinsics.g(tileFooterContent, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI.TileFooterContent.SelectionInfo");
            ((SelectionInfoViewHolder) holder).bind((SelectionsListVI.TileFooterContent.SelectionInfo) tileFooterContent);
            return;
        }
        if (holder instanceof SelectionItemFooterViewHolder) {
            SelectionsListVI.TileFooterContent tileFooterContent2 = this.items.get(position);
            Intrinsics.g(tileFooterContent2, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI.TileFooterContent.SelectionItemFooter");
            ((SelectionItemFooterViewHolder) holder).bind((SelectionsListVI.TileFooterContent.SelectionItemFooter) tileFooterContent2);
            return;
        }
        if (holder instanceof ReviewPreviewTitleRatingViewHolder) {
            SelectionsListVI.TileFooterContent tileFooterContent3 = this.items.get(position);
            Intrinsics.g(tileFooterContent3, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI.TileFooterContent.ReviewPreviewTitleRating");
            ((ReviewPreviewTitleRatingViewHolder) holder).bind((SelectionsListVI.TileFooterContent.ReviewPreviewTitleRating) tileFooterContent3);
            return;
        }
        if (holder instanceof ReviewPreviewPriceViewHolder) {
            SelectionsListVI.TileFooterContent tileFooterContent4 = this.items.get(position);
            Intrinsics.g(tileFooterContent4, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI.TileFooterContent.PriceWrapper");
            ((ReviewPreviewPriceViewHolder) holder).bind((SelectionsListVI.TileFooterContent.PriceWrapper) tileFooterContent4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            LinearLayout linearLayout = new LinearLayout(parent.getContext());
            linearLayout.setOrientation(0);
            RecyclerView.p pVar = new RecyclerView.p(-1, -2);
            Dimens dimens = Dimens.INSTANCE;
            pVar.setMargins(dimens.getDP_10(), 0, dimens.getDP_8(), 0);
            linearLayout.setGravity(16);
            linearLayout.setLayoutParams(pVar);
            return new SelectionInfoViewHolder(linearLayout);
        }
        if (viewType == 1) {
            LinearLayout linearLayout2 = new LinearLayout(parent.getContext());
            linearLayout2.setOrientation(0);
            RecyclerView.p pVar2 = new RecyclerView.p(-1, -2);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            Dimens dimens2 = Dimens.INSTANCE;
            pVar2.setMargins(dimens2.getDP_10(), dimens2.getDP_6(), dimens2.getDP_8(), 0);
            linearLayout2.setClickable(false);
            linearLayout2.setLongClickable(false);
            linearLayout2.setLayoutParams(pVar2);
            return new SelectionItemFooterViewHolder(linearLayout2);
        }
        if (viewType == 2) {
            LinearLayout linearLayout3 = new LinearLayout(parent.getContext());
            linearLayout3.setOrientation(1);
            RecyclerView.p pVar3 = new RecyclerView.p(-1, -2);
            Dimens dimens3 = Dimens.INSTANCE;
            pVar3.setMargins(dimens3.getDP_8(), 0, dimens3.getDP_8(), 0);
            linearLayout3.setLayoutParams(pVar3);
            return new ReviewPreviewTitleRatingViewHolder(linearLayout3);
        }
        if (viewType != 3) {
            throw new IllegalStateException(("Unknown viewType: " + viewType).toString());
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        RecyclerView.p pVar4 = new RecyclerView.p(-1, -2);
        Dimens dimens4 = Dimens.INSTANCE;
        pVar4.setMargins(dimens4.getDP_10(), 0, dimens4.getDP_8(), 0);
        priceAtomView.setLayoutParams(pVar4);
        return new ReviewPreviewPriceViewHolder(priceAtomView);
    }

    public final void submit(@NotNull List<? extends SelectionsListVI.TileFooterContent> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }
}
