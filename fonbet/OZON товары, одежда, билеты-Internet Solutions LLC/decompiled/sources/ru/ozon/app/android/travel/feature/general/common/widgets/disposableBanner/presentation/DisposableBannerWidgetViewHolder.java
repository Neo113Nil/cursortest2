package ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.presentation;

import B3.D;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetDisposableBannerBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerViewModel;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerViewModel;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetDisposableBannerBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetDisposableBannerBinding;", "", "padding", "I", "Landroid/graphics/drawable/GradientDrawable;", "buttonBackground", "Landroid/graphics/drawable/GradientDrawable;", "containerBackground", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisposableBannerWidgetViewHolder extends k<DisposableBannerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDisposableBannerBinding binding;

    @NotNull
    private final GradientDrawable buttonBackground;

    @NotNull
    private final GradientDrawable containerBackground;

    @NotNull
    private final View containerView;
    private final int padding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final DisposableBannerViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableBannerWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull DisposableBannerViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        WidgetDisposableBannerBinding bind = WidgetDisposableBannerBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.padding = ResourceExtKt.toPx(4, getContext());
        GradientDrawable b11 = D.b(1);
        b11.setColor(ThemeExtKt.themeColor(getContext(), R$attr.graphicNeutral));
        this.buttonBackground = b11;
        GradientDrawable b12 = D.b(0);
        b12.setCornerRadius(ResourceExtKt.toPxF(16, getContext()));
        b12.setColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
        this.containerBackground = b12;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new DisposableBannerWidgetViewHolder$actionHandler$1(this)).buildHandler();
        containerView.setClipToOutline(true);
        containerView.setBackground(b12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DisposableBannerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView disposableBannerTitleTAV = this.binding.disposableBannerTitleTAV;
        Intrinsics.checkNotNullExpressionValue(disposableBannerTitleTAV, "disposableBannerTitleTAV");
        TextAtomHolderKt.bind$default(disposableBannerTitleTAV, item.getTitle(), null, 2, null);
        TextAtomView disposableBannerDescriptionTAV = this.binding.disposableBannerDescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(disposableBannerDescriptionTAV, "disposableBannerDescriptionTAV");
        TextAtomHolderKt.bind$default(disposableBannerDescriptionTAV, item.getDescription(), null, 2, null);
        AppCompatImageView disposableBannerImageACIV = this.binding.disposableBannerImageACIV;
        Intrinsics.checkNotNullExpressionValue(disposableBannerImageACIV, "disposableBannerImageACIV");
        ImageViewExtKt.load$default(disposableBannerImageACIV, item.getImageURL(), null, null, null, null, false, null, 126, null);
        SmallIconButtonView disposableBannerButtonSBV = this.binding.disposableBannerButtonSBV;
        Intrinsics.checkNotNullExpressionValue(disposableBannerButtonSBV, "disposableBannerButtonSBV");
        WrappedIconButtonHolderKt.bindOrGone(disposableBannerButtonSBV, item.getIconButton(), this.actionHandler);
        this.binding.disposableBannerButtonSBV.setBackground(this.buttonBackground);
        SmallIconButtonView smallIconButtonView = this.binding.disposableBannerButtonSBV;
        int i11 = this.padding;
        smallIconButtonView.setPadding(i11, i11, i11, i11);
    }
}
