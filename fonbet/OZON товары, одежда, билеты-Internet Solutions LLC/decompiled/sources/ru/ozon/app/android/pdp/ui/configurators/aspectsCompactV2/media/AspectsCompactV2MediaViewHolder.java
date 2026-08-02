package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.res.g;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$drawable;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2MediaLayoutBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/media/AspectsCompactV2MediaViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2MediaLayoutBinding;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/media/AspectsCompactMediaVariantV2VO;", "", "setPrice", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/media/AspectsCompactMediaVariantV2VO;)V", "setImage", "setText", "item", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "", "dp6", "I", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsCompactV2MediaViewHolder extends VariantsViewHolder<AspectsCompactVO$Variant, WidgetAspectsCompactV2MediaLayoutBinding> {

    @NotNull
    private final View containerView;
    private final int dp6;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.media.AspectsCompactV2MediaViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetAspectsCompactV2MediaLayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetAspectsCompactV2MediaLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2MediaLayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetAspectsCompactV2MediaLayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetAspectsCompactV2MediaLayoutBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2MediaLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.media.AspectsCompactV2MediaViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<WidgetAspectsCompactV2MediaLayoutBinding, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsCompactV2MediaLayoutBinding widgetAspectsCompactV2MediaLayoutBinding) {
            invoke2(widgetAspectsCompactV2MediaLayoutBinding);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetAspectsCompactV2MediaLayoutBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "$this$binding");
            binding.titleTav.setTextIsSelectable(false);
            binding.subtitleTav.setTextIsSelectable(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsCompactV2MediaViewHolder(@NotNull View containerView) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.dp6 = ResourceExtKt.toPx(6);
        binding(AnonymousClass2.INSTANCE);
    }

    private final void setImage(AspectsCompactMediaVariantV2VO aspectsCompactMediaVariantV2VO) {
        ShapeableImageView shapeableImageView = getBinding().imageIv;
        shapeableImageView.setClipToOutline(true);
        if (aspectsCompactMediaVariantV2VO.getImageUrl() != null) {
            shapeableImageView.setAlpha(aspectsCompactMediaVariantV2VO.getIsAvailable() ? 1.0f : 0.5f);
            ImageViewExtKt.load$default(shapeableImageView, aspectsCompactMediaVariantV2VO.getImageUrl(), C7714v.a0(new ImageTransformation.RoundedCorners(this.dp6, null, 2, null)), null, null, null, false, null, 124, null);
        } else {
            Context context = getBinding().imageIv.getContext();
            Drawable d11 = g.d(context.getResources(), R$drawable.ic_gallery_placeholder, context.getTheme());
            shapeableImageView.setAlpha(1.0f);
            shapeableImageView.setImageDrawable(d11);
        }
    }

    private final void setPrice(AspectsCompactMediaVariantV2VO aspectsCompactMediaVariantV2VO) {
        PriceAtomView pricePa = getBinding().pricePa;
        Intrinsics.checkNotNullExpressionValue(pricePa, "pricePa");
        PriceAtomHolderKt.bindOrGone$default(pricePa, aspectsCompactMediaVariantV2VO.getPrice(), null, 2, null);
    }

    private final void setText(AspectsCompactMediaVariantV2VO aspectsCompactMediaVariantV2VO) {
        binding(new AspectsCompactV2MediaViewHolder$setText$1(aspectsCompactMediaVariantV2VO));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    public void bind(@NotNull AspectsCompactVO$Variant item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AspectsCompactMediaVariantV2VO aspectsCompactMediaVariantV2VO = (AspectsCompactMediaVariantV2VO) item;
        this.itemView.setActivated(aspectsCompactMediaVariantV2VO.getIsAvailable());
        this.itemView.setSelected(aspectsCompactMediaVariantV2VO.getIsSelected());
        View view = this.itemView;
        VariantConstraintLayout variantConstraintLayout = view instanceof VariantConstraintLayout ? (VariantConstraintLayout) view : null;
        if (variantConstraintLayout != null) {
            variantConstraintLayout.setProbably(aspectsCompactMediaVariantV2VO.isEnabled().booleanValue());
        }
        setImage(aspectsCompactMediaVariantV2VO);
        setPrice(aspectsCompactMediaVariantV2VO);
        setText(aspectsCompactMediaVariantV2VO);
    }
}
