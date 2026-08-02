package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation;

import Ey.ViewOnClickListenerC2975b;
import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.R$layout;
import ru.ozon.app.android.ugc.core.databinding.ViewGalleryPreviewVideoBinding;
import ru.ozon.app.android.ugc.core.databinding.WidgetReviewGalleryPreviewBinding;
import ru.ozon.app.android.ugc.core.widgets.common.StatusableMediaPreviewView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO;", "Lru/ozon/app/android/ugc/core/databinding/WidgetReviewGalleryPreviewBinding;", "binding", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewAdapter;", "reviewGalleryViewAdapter", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/WidgetReviewGalleryPreviewBinding;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewAdapter;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/core/databinding/WidgetReviewGalleryPreviewBinding;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewWidgetVH extends k<ReviewGalleryPreviewVO> {

    @NotNull
    private final WidgetReviewGalleryPreviewBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final ReviewGalleryViewAdapter reviewGalleryViewAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReviewGalleryPreviewWidgetVH(@NotNull WidgetReviewGalleryPreviewBinding binding, @NotNull ReviewGalleryViewAdapter reviewGalleryViewAdapter, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(reviewGalleryViewAdapter, "reviewGalleryViewAdapter");
        Intrinsics.checkNotNullParameter(refs, "refs");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.reviewGalleryViewAdapter = reviewGalleryViewAdapter;
        this.onAction = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(ViewGalleryPreviewVideoBinding viewGalleryPreviewVideoBinding, View view) {
        viewGalleryPreviewVideoBinding.thumbnailPv.performClick();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewGalleryPreviewVO item, @NotNull d info) {
        View view;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.reviewGalleryListFl.removeAllViews();
        TextAtomV2View reviewGalleryPreviewTav = this.binding.reviewGalleryPreviewTav;
        Intrinsics.checkNotNullExpressionValue(reviewGalleryPreviewTav, "reviewGalleryPreviewTav");
        TextHolderKt.bindOrGone$default(reviewGalleryPreviewTav, item.getHeader(), null, 2, null);
        int size = item.getContentList().size();
        for (int i11 = 0; i11 < size && i11 <= 3; i11++) {
            ReviewGalleryPreviewVO.MediaContentVO mediaContentVO = item.getContentList().get(i11);
            if (i11 == 3 && item.getShowMoreButton() != null) {
                view = View.inflate(getContext(), R$layout.view_gallery_preview_show_more, null);
                ReviewGalleryViewAdapter reviewGalleryViewAdapter = this.reviewGalleryViewAdapter;
                Intrinsics.f(view);
                reviewGalleryViewAdapter.bindShowMoreButton(view, mediaContentVO, item.getShowMoreButton(), this.onAction);
            } else if (mediaContentVO instanceof ReviewGalleryPreviewVO.MediaContentVO.VideoVO) {
                ViewGalleryPreviewVideoBinding bind = ViewGalleryPreviewVideoBinding.bind(View.inflate(getContext(), R$layout.view_gallery_preview_video, null));
                Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
                bind.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC2975b(bind, 7));
                bind.thumbnailPv.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ReviewGalleryViewAdapter reviewGalleryViewAdapter2 = this.reviewGalleryViewAdapter;
                StatusableMediaPreviewView thumbnailPv = bind.thumbnailPv;
                Intrinsics.checkNotNullExpressionValue(thumbnailPv, "thumbnailPv");
                ImageView thumbnailIconIv = bind.thumbnailIconIv;
                Intrinsics.checkNotNullExpressionValue(thumbnailIconIv, "thumbnailIconIv");
                reviewGalleryViewAdapter2.bindMediaSource(thumbnailPv, thumbnailIconIv, mediaContentVO, new ReviewGalleryPreviewWidgetVH$bind$view$3(mediaContentVO, this));
                view = bind.getConstraintLayout();
            } else {
                if (!(mediaContentVO instanceof ReviewGalleryPreviewVO.MediaContentVO.ImageVO)) {
                    throw new o();
                }
                StatusableMediaPreviewView statusableMediaPreviewView = new StatusableMediaPreviewView(getContext(), null, 0, 6, null);
                statusableMediaPreviewView.setId(R$id.photoIv);
                this.reviewGalleryViewAdapter.bindImage(statusableMediaPreviewView, mediaContentVO, new ReviewGalleryPreviewWidgetVH$bind$view$4(mediaContentVO, this));
                view = statusableMediaPreviewView;
            }
            view.setLayoutParams(new ViewGroup.LayoutParams(mediaContentVO.getImageSize(), mediaContentVO.getImageSize()));
            this.binding.reviewGalleryListFl.addView(view);
        }
    }
}
