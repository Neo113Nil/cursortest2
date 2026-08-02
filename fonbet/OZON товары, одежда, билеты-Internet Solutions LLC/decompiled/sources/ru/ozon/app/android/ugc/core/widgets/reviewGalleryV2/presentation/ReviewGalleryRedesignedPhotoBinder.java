package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.views.touchview.TouchImageView;
import ru.ozon.app.android.pdpvideomolecule.R$drawable;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J-\u0010\u0014\u001a\u0002H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0018H\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryRedesignedPhotoBinder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/RedesignedPhotoBinder;", "container", "Landroid/widget/FrameLayout;", "<init>", "(Landroid/widget/FrameLayout;)V", "bottomGradientView", "Landroid/view/View;", "topGradientView", "photoView", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;", "getPhotoView", "()Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;", "setPhotoVisibility", "", "isVisible", "", "createPhotoView", "createTopGradientView", "createBottomGradientView", "createAndAddOnSecondPosition", "T", "Landroid/view/ViewGroup;", "viewFactory", "Lkotlin/Function0;", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)Landroid/view/View;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryRedesignedPhotoBinder implements RedesignedPhotoBinder {
    private View bottomGradientView;

    @NotNull
    private final FrameLayout container;

    @NotNull
    private final TouchImageView photoView;
    private View topGradientView;
    public static final int $stable = 8;
    private static final int topGradientHeight = UiExtKt.toPx(124);
    private static final int bottomGradientHeight = UiExtKt.toPx(242);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryRedesignedPhotoBinder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<TouchImageView> {
        AnonymousClass1(Object obj) {
            super(0, obj, ReviewGalleryRedesignedPhotoBinder.class, "createPhotoView", "createPhotoView()Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TouchImageView invoke() {
            return ((ReviewGalleryRedesignedPhotoBinder) this.receiver).createPhotoView();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryRedesignedPhotoBinder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function0<View> {
        AnonymousClass2(Object obj) {
            super(0, obj, ReviewGalleryRedesignedPhotoBinder.class, "createBottomGradientView", "createBottomGradientView()Landroid/view/View;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return ((ReviewGalleryRedesignedPhotoBinder) this.receiver).createBottomGradientView();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryRedesignedPhotoBinder$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function0<View> {
        AnonymousClass3(Object obj) {
            super(0, obj, ReviewGalleryRedesignedPhotoBinder.class, "createTopGradientView", "createTopGradientView()Landroid/view/View;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return ((ReviewGalleryRedesignedPhotoBinder) this.receiver).createTopGradientView();
        }
    }

    public ReviewGalleryRedesignedPhotoBinder(@NotNull FrameLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.photoView = (TouchImageView) createAndAddOnSecondPosition(container, new AnonymousClass1(this));
        this.bottomGradientView = createAndAddOnSecondPosition(container, new AnonymousClass2(this));
        this.topGradientView = createAndAddOnSecondPosition(container, new AnonymousClass3(this));
    }

    private final <T extends View> T createAndAddOnSecondPosition(ViewGroup container, Function0<? extends T> viewFactory) {
        T invoke = viewFactory.invoke();
        container.addView(invoke);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createBottomGradientView() {
        View view = new View(this.container.getContext());
        view.setId(R$id.reviewGalleryBottomPhotoGradient);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, bottomGradientHeight);
        layoutParams.gravity = 80;
        view.setLayoutParams(layoutParams);
        ViewExtKt.hide(view);
        view.setBackground(androidx.core.content.a.getDrawable(view.getContext(), R$drawable.pdp_video_molecule_bg_bottom_gradient));
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TouchImageView createPhotoView() {
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TouchImageView touchImageView = new TouchImageView(context, null, 0, 6, null);
        touchImageView.setId(R$id.reviewGalleryPhotoView);
        touchImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        touchImageView.setDoubleTapScale(1.5f);
        ViewExtKt.hide(touchImageView);
        return touchImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createTopGradientView() {
        View view = new View(this.container.getContext());
        view.setId(R$id.reviewGalleryTopPhotoGradient);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, topGradientHeight));
        ViewExtKt.hide(view);
        view.setBackground(androidx.core.content.a.getDrawable(view.getContext(), ru.ozon.app.android.ugc.core.R$drawable.review_gallery_top_gradient));
        return view;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.RedesignedPhotoBinder
    @NotNull
    public TouchImageView getPhotoView() {
        return this.photoView;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.RedesignedPhotoBinder
    public void setPhotoVisibility(boolean isVisible) {
        View view = this.topGradientView;
        if (view != null) {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrInvisible(view, isVisible);
        }
        View view2 = this.bottomGradientView;
        if (view2 != null) {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrInvisible(view2, isVisible);
        }
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrInvisible(getPhotoView(), isVisible);
    }
}
