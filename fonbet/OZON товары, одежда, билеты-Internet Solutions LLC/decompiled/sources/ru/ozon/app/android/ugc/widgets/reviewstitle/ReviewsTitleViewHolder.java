package ru.ozon.app.android.ugc.widgets.reviewstitle;

import IW.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.atoms.atom2.LabelAtom;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.databinding.WidgetReviewsTitleBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleVO;", "Lru/ozon/app/android/ugc/databinding/WidgetReviewsTitleBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetReviewsTitleBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "count", "deeplink", "", "setHeader", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "label", "setLabel", "(Lru/ozon/app/android/atoms/data/deprecated/Label;)V", "subtitle", "setSubtitle", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/deprecated/Button;", "linkButton", "writeReviewButton", "setButtons", "(Lru/ozon/uni/atoms/data/deprecated/Button;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/databinding/WidgetReviewsTitleBinding;", "Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsTitleViewHolder extends k<ReviewsTitleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetReviewsTitleBinding binding;
    private ReviewsTitleVO item;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReviewsTitleViewHolder(@NotNull WidgetReviewsTitleBinding binding, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        binding.linkBtn.setOnAction(buildHandler);
        binding.writeReviewBtn.setOnAction(buildHandler);
        binding.headerFl.setOnClickListener(new a(0, references, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ComposerReferences composerReferences, ReviewsTitleViewHolder reviewsTitleViewHolder, View view) {
        ComposerNavigator navigator = composerReferences.getNavigator();
        ReviewsTitleVO reviewsTitleVO = reviewsTitleViewHolder.item;
        if (reviewsTitleVO != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, String.valueOf(reviewsTitleVO.getDeeplink()), null, 2, null);
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    private final void setButtons(Button linkButton, Button writeReviewButton) {
        WidgetReviewsTitleBinding widgetReviewsTitleBinding = this.binding;
        if (linkButton != null) {
            widgetReviewsTitleBinding.linkBtn.bind(linkButton);
            ButtonAtom linkBtn = widgetReviewsTitleBinding.linkBtn;
            Intrinsics.checkNotNullExpressionValue(linkBtn, "linkBtn");
            ViewExtKt.show(linkBtn);
        } else {
            ButtonAtom linkBtn2 = widgetReviewsTitleBinding.linkBtn;
            Intrinsics.checkNotNullExpressionValue(linkBtn2, "linkBtn");
            ViewExtKt.gone(linkBtn2);
        }
        if (writeReviewButton == null) {
            ButtonAtom writeReviewBtn = widgetReviewsTitleBinding.writeReviewBtn;
            Intrinsics.checkNotNullExpressionValue(writeReviewBtn, "writeReviewBtn");
            ViewExtKt.gone(writeReviewBtn);
        } else {
            widgetReviewsTitleBinding.writeReviewBtn.bind(writeReviewButton);
            ButtonAtom writeReviewBtn2 = widgetReviewsTitleBinding.writeReviewBtn;
            Intrinsics.checkNotNullExpressionValue(writeReviewBtn2, "writeReviewBtn");
            ViewExtKt.show(writeReviewBtn2);
        }
    }

    private final void setHeader(String title, Integer count, String deeplink) {
        WidgetReviewsTitleBinding widgetReviewsTitleBinding = this.binding;
        TextView titleTv = widgetReviewsTitleBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, title);
        TextView countTv = widgetReviewsTitleBinding.countTv;
        Intrinsics.checkNotNullExpressionValue(countTv, "countTv");
        TextViewExtKt.setTextOrGone(countTv, count != null ? count.toString() : null);
        ImageView chevronIv = widgetReviewsTitleBinding.chevronIv;
        Intrinsics.checkNotNullExpressionValue(chevronIv, "chevronIv");
        ViewExtKt.showOrGone(chevronIv, Boolean.valueOf(deeplink != null));
        widgetReviewsTitleBinding.headerFl.setEnabled(deeplink != null);
    }

    private final void setLabel(Label label) {
        WidgetReviewsTitleBinding widgetReviewsTitleBinding = this.binding;
        if (label == null) {
            LabelAtom labelTv = widgetReviewsTitleBinding.labelTv;
            Intrinsics.checkNotNullExpressionValue(labelTv, "labelTv");
            ViewExtKt.gone(labelTv);
        } else {
            widgetReviewsTitleBinding.labelTv.bind(label);
            LabelAtom labelTv2 = widgetReviewsTitleBinding.labelTv;
            Intrinsics.checkNotNullExpressionValue(labelTv2, "labelTv");
            ViewExtKt.show(labelTv2);
        }
    }

    private final void setSubtitle(String subtitle) {
        TextView subtitleTv = this.binding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, subtitle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewsTitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.binding.labelTv.onAction(this.actionHandler);
        setHeader(item.getTitle(), item.getCount(), item.getDeeplink());
        setLabel(item.getLabel());
        setSubtitle(item.getSubtitle());
        setButtons(item.getLinkButton(), item.getWriteReviewButton());
    }
}
