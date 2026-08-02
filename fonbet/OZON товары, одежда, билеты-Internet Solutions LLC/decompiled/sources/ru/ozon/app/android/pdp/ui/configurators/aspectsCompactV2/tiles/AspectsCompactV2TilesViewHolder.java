package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.tiles;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2TilesLayoutBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/tiles/AspectsCompactV2TilesViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2TilesLayoutBinding;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/tiles/AspectsCompactTilesVariantV2VO;", "", "setPrice", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/tiles/AspectsCompactTilesVariantV2VO;)V", "setImage", "getParandjaView", "()Landroid/view/View;", "item", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "Landroid/view/View;", "getContainerView", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsCompactV2TilesViewHolder extends VariantsViewHolder<AspectsCompactVO$Variant, WidgetAspectsCompactV2TilesLayoutBinding> {

    @NotNull
    private final View containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.tiles.AspectsCompactV2TilesViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetAspectsCompactV2TilesLayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetAspectsCompactV2TilesLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2TilesLayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetAspectsCompactV2TilesLayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetAspectsCompactV2TilesLayoutBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsCompactV2TilesViewHolder(@NotNull View containerView) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    private final void setImage(AspectsCompactTilesVariantV2VO aspectsCompactTilesVariantV2VO) {
        ShapeableImageView shapeableImageView = getBinding().imageIv;
        Intrinsics.f(shapeableImageView);
        ImageViewExtKt.loadImageOrGone(shapeableImageView, aspectsCompactTilesVariantV2VO.getImageUrl());
        shapeableImageView.setAlpha(aspectsCompactTilesVariantV2VO.getIsAvailable() ? 1.0f : 0.5f);
    }

    private final void setPrice(AspectsCompactTilesVariantV2VO aspectsCompactTilesVariantV2VO) {
        binding(new AspectsCompactV2TilesViewHolder$setPrice$1(aspectsCompactTilesVariantV2VO));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    public void bind(@NotNull AspectsCompactVO$Variant item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AspectsCompactTilesVariantV2VO aspectsCompactTilesVariantV2VO = (AspectsCompactTilesVariantV2VO) item;
        this.itemView.setActivated(aspectsCompactTilesVariantV2VO.getIsAvailable());
        this.itemView.setSelected(aspectsCompactTilesVariantV2VO.getIsSelected());
        View view = this.itemView;
        VariantConstraintLayout variantConstraintLayout = view instanceof VariantConstraintLayout ? (VariantConstraintLayout) view : null;
        if (variantConstraintLayout != null) {
            variantConstraintLayout.setProbably(aspectsCompactTilesVariantV2VO.isEnabled().booleanValue());
        }
        setImage(aspectsCompactTilesVariantV2VO);
        setPrice(aspectsCompactTilesVariantV2VO);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    @NotNull
    public View getParandjaView() {
        FrameLayout infoFl = getBinding().infoFl;
        Intrinsics.checkNotNullExpressionValue(infoFl, "infoFl");
        return infoFl;
    }
}
