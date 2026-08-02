package ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog;

import DG.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.databinding.LayoutOnboardingBannerBinding;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.uni.android.cell.image.ImageTitleSubtitleCellV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.image.ImageTitleSubtitleCellV2HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/composer/databinding/LayoutOnboardingBannerBinding;", "bind", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "item", "onClose", "Lkotlin/Function0;", "", "bindBanner", "banner", "Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "Companion", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingBannerView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int verticalTextPadding = ResourceExtKt.toPx(16);

    @NotNull
    private final LayoutOnboardingBannerBinding binding;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingBannerView$Companion;", "", "<init>", "()V", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingBannerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingModel bind$default(OnboardingBannerView onboardingBannerView, OnboardingModel onboardingModel, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return onboardingBannerView.bind(onboardingModel, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1$lambda$0(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void bindBanner(ImageTitleSubtitleCellDTO banner) {
        final ImageTitleSubtitleCellV2View imageTitleSubtitleCellV2View = this.binding.bannerItscv;
        Intrinsics.f(imageTitleSubtitleCellV2View);
        ImageTitleSubtitleCellV2HolderKt.bind$default(imageTitleSubtitleCellV2View, banner, null, 2, null);
        int i11 = Y.f42258g;
        if (!imageTitleSubtitleCellV2View.isLaidOut() || imageTitleSubtitleCellV2View.isLayoutRequested()) {
            imageTitleSubtitleCellV2View.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingBannerView$bindBanner$lambda$5$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    int height = ImageTitleSubtitleCellV2View.this.getMainView().getAddonView().getHeight() + ImageTitleSubtitleCellV2View.this.getMainView().getMainView().getHeight();
                    if (ImageTitleSubtitleCellV2View.this.getHeight() - height < OnboardingBannerView.verticalTextPadding * 2) {
                        Intrinsics.f(ImageTitleSubtitleCellV2View.this);
                        ImageTitleSubtitleCellV2View imageTitleSubtitleCellV2View2 = ImageTitleSubtitleCellV2View.this;
                        ViewGroup.LayoutParams layoutParams = imageTitleSubtitleCellV2View2.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.height = (OnboardingBannerView.verticalTextPadding * 2) + height;
                        imageTitleSubtitleCellV2View2.setLayoutParams(layoutParams2);
                    }
                }
            });
            return;
        }
        int height = imageTitleSubtitleCellV2View.getMainView().getAddonView().getHeight() + imageTitleSubtitleCellV2View.getMainView().getMainView().getHeight();
        if (imageTitleSubtitleCellV2View.getHeight() - height < verticalTextPadding * 2) {
            ViewGroup.LayoutParams layoutParams = imageTitleSubtitleCellV2View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = (verticalTextPadding * 2) + height;
            imageTitleSubtitleCellV2View.setLayoutParams(layoutParams2);
        }
    }

    @NotNull
    public final OnboardingModel bind(@NotNull OnboardingModel item, Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(item, "item");
        LayoutOnboardingBannerBinding layoutOnboardingBannerBinding = this.binding;
        bindBanner(item.getBanner());
        IconButtonView closeButtonIb = layoutOnboardingBannerBinding.closeButtonIb;
        Intrinsics.checkNotNullExpressionValue(closeButtonIb, "closeButtonIb");
        IconButtonHolderKt.bind$default(closeButtonIb, item.getCloseButton(), null, 2, null);
        layoutOnboardingBannerBinding.closeButtonIb.setOnClickListener(new a(onClose, 7));
        return item;
    }

    public /* synthetic */ OnboardingBannerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBannerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutOnboardingBannerBinding inflate = LayoutOnboardingBannerBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        inflate.getRoot().setClipToOutline(true);
    }
}
