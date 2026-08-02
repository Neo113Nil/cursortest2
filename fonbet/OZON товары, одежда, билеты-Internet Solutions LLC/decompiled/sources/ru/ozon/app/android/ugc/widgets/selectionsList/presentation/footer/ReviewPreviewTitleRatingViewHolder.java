package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.footer;

import Sc.InterfaceC4008j;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/footer/ReviewPreviewTitleRatingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/widget/LinearLayout;", "root", "<init>", "(Landroid/widget/LinearLayout;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$ReviewPreviewTitleRating;", "item", "", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$ReviewPreviewTitleRating;)V", "Landroid/widget/LinearLayout;", "ratingRow$delegate", "LSc/j;", "getRatingRow", "()Landroid/widget/LinearLayout;", "ratingRow", "Lru/ozon/uni/android/atom/icon/IconView;", "ratingIcon$delegate", "getRatingIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "ratingIcon", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ratingValue$delegate", "getRatingValue", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ratingValue", "separatorView$delegate", "getSeparatorView", "separatorView", "title$delegate", "getTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewPreviewTitleRatingViewHolder extends RecyclerView.C {

    /* renamed from: ratingIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratingIcon;

    /* renamed from: ratingRow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratingRow;

    /* renamed from: ratingValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratingValue;

    @NotNull
    private final LinearLayout root;

    /* renamed from: separatorView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j separatorView;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewPreviewTitleRatingViewHolder(@NotNull LinearLayout root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        this.ratingRow = LazyUtilsKt.unsafeLazy(new ReviewPreviewTitleRatingViewHolder$ratingRow$2(this));
        this.ratingIcon = LazyUtilsKt.unsafeLazy(new ReviewPreviewTitleRatingViewHolder$ratingIcon$2(this));
        this.ratingValue = LazyUtilsKt.unsafeLazy(new ReviewPreviewTitleRatingViewHolder$ratingValue$2(this));
        this.separatorView = LazyUtilsKt.unsafeLazy(new ReviewPreviewTitleRatingViewHolder$separatorView$2(this));
        this.title = LazyUtilsKt.unsafeLazy(new ReviewPreviewTitleRatingViewHolder$title$2(this));
    }

    private final IconView getRatingIcon() {
        return (IconView) this.ratingIcon.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout getRatingRow() {
        return (LinearLayout) this.ratingRow.getValue();
    }

    private final TextAtomV2View getRatingValue() {
        return (TextAtomV2View) this.ratingValue.getValue();
    }

    private final TextAtomV2View getSeparatorView() {
        return (TextAtomV2View) this.separatorView.getValue();
    }

    private final TextAtomV2View getTitle() {
        return (TextAtomV2View) this.title.getValue();
    }

    public final void bind(@NotNull SelectionsListVI.TileFooterContent.ReviewPreviewTitleRating item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bindOrGone$default(getRatingIcon(), item.getRatingIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(getRatingValue(), item.getRatingValue(), null, 2, null);
        TextHolderKt.bindOrGone$default(getSeparatorView(), item.getSeparator(), null, 2, null);
        TextHolderKt.bindOrGone$default(getTitle(), item.getTitle(), null, 2, null);
    }
}
