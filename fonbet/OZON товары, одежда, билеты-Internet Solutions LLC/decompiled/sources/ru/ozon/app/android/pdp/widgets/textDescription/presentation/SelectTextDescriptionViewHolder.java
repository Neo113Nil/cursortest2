package ru.ozon.app.android.pdp.widgets.textDescription.presentation;

import WZ.l;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpSelectWidgetTextDescriptionBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\u001a\u0010\"\u001a\u00020!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001a\u0010)\u001a\u00020(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/presentation/SelectTextDescriptionViewHolder;", "Lru/ozon/app/android/pdp/widgets/textDescription/presentation/BaseTextDescriptionViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "backgroundColorInt", "", "bindGradientBackground", "(I)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpSelectWidgetTextDescriptionBinding;", "binding", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpSelectWidgetTextDescriptionBinding;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "pdpTextDescriptionContentTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getPdpTextDescriptionContentTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "pdpTextDescriptionGradientV", "getPdpTextDescriptionGradientV", "Landroidx/constraintlayout/helper/widget/Layer;", "pdpTextDescriptionExpandLayer", "Landroidx/constraintlayout/helper/widget/Layer;", "getPdpTextDescriptionExpandLayer", "()Landroidx/constraintlayout/helper/widget/Layer;", "pdpTextDescriptionExpandTav", "getPdpTextDescriptionExpandTav", "Landroid/widget/ImageView;", "pdpTextDescriptionExpandIv", "Landroid/widget/ImageView;", "getPdpTextDescriptionExpandIv", "()Landroid/widget/ImageView;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectTextDescriptionViewHolder extends BaseTextDescriptionViewHolder {

    @NotNull
    private final PdpSelectWidgetTextDescriptionBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final TextAtomV2View pdpTextDescriptionContentTav;

    @NotNull
    private final ImageView pdpTextDescriptionExpandIv;

    @NotNull
    private final Layer pdpTextDescriptionExpandLayer;

    @NotNull
    private final TextAtomV2View pdpTextDescriptionExpandTav;

    @NotNull
    private final View pdpTextDescriptionGradientV;

    @NotNull
    private final ConstraintLayout root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectTextDescriptionViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(containerView, refs, tokenizedAnalytics);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        PdpSelectWidgetTextDescriptionBinding bind = PdpSelectWidgetTextDescriptionBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ConstraintLayout constraintLayout = bind.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.root = constraintLayout;
        TextAtomV2View pdpTextDescriptionContentTav = bind.pdpTextDescriptionContentTav;
        Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionContentTav, "pdpTextDescriptionContentTav");
        this.pdpTextDescriptionContentTav = pdpTextDescriptionContentTav;
        View pdpTextDescriptionGradientV = bind.pdpTextDescriptionGradientV;
        Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionGradientV, "pdpTextDescriptionGradientV");
        this.pdpTextDescriptionGradientV = pdpTextDescriptionGradientV;
        Layer pdpTextDescriptionExpandLayer = bind.pdpTextDescriptionExpandLayer;
        Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionExpandLayer, "pdpTextDescriptionExpandLayer");
        this.pdpTextDescriptionExpandLayer = pdpTextDescriptionExpandLayer;
        TextAtomV2View pdpTextDescriptionExpandTav = bind.pdpTextDescriptionExpandTav;
        Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionExpandTav, "pdpTextDescriptionExpandTav");
        this.pdpTextDescriptionExpandTav = pdpTextDescriptionExpandTav;
        ImageView pdpTextDescriptionExpandIv = bind.pdpTextDescriptionExpandIv;
        Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionExpandIv, "pdpTextDescriptionExpandIv");
        this.pdpTextDescriptionExpandIv = pdpTextDescriptionExpandIv;
        initClickListener();
        View pdpTextDescriptionGradientV2 = getPdpTextDescriptionGradientV();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        pdpTextDescriptionGradientV2.setBackground(gradientDrawable);
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder
    public void bindGradientBackground(int backgroundColorInt) {
        Drawable background = getPdpTextDescriptionGradientV().getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(new int[]{0, backgroundColorInt, backgroundColorInt});
        }
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder
    @NotNull
    protected TextAtomV2View getPdpTextDescriptionContentTav() {
        return this.pdpTextDescriptionContentTav;
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder
    @NotNull
    protected ImageView getPdpTextDescriptionExpandIv() {
        return this.pdpTextDescriptionExpandIv;
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder
    @NotNull
    protected Layer getPdpTextDescriptionExpandLayer() {
        return this.pdpTextDescriptionExpandLayer;
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder
    @NotNull
    protected TextAtomV2View getPdpTextDescriptionExpandTav() {
        return this.pdpTextDescriptionExpandTav;
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder
    @NotNull
    protected View getPdpTextDescriptionGradientV() {
        return this.pdpTextDescriptionGradientV;
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder
    @NotNull
    protected ConstraintLayout getRoot() {
        return this.root;
    }
}
