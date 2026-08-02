package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantFrameLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2ColorLayoutBinding;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/color/AspectsCompactV2ColorViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2ColorLayoutBinding;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/color/AspectsColorVariantV2VO;", "", "setColors", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/color/AspectsColorVariantV2VO;)V", "item", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "getParandjaView", "()Landroid/view/View;", "Landroid/view/View;", "getContainerView", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsCompactV2ColorViewHolder extends VariantsViewHolder<AspectsCompactVO$Variant, WidgetAspectsCompactV2ColorLayoutBinding> {

    @NotNull
    private final View containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color.AspectsCompactV2ColorViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetAspectsCompactV2ColorLayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetAspectsCompactV2ColorLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2ColorLayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetAspectsCompactV2ColorLayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetAspectsCompactV2ColorLayoutBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsCompactV2ColorViewHolder(@NotNull View containerView) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    private final void setColors(AspectsColorVariantV2VO aspectsColorVariantV2VO) {
        binding(new AspectsCompactV2ColorViewHolder$setColors$1(aspectsColorVariantV2VO));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    public void bind(@NotNull AspectsCompactVO$Variant item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AspectsColorVariantV2VO aspectsColorVariantV2VO = (AspectsColorVariantV2VO) item;
        this.itemView.setSelected(aspectsColorVariantV2VO.getIsSelected());
        this.itemView.setActivated(aspectsColorVariantV2VO.getIsAvailable());
        View view = this.itemView;
        VariantFrameLayout variantFrameLayout = view instanceof VariantFrameLayout ? (VariantFrameLayout) view : null;
        if (variantFrameLayout != null) {
            variantFrameLayout.setProbably(aspectsColorVariantV2VO.isEnabled().booleanValue());
        }
        setColors(aspectsColorVariantV2VO);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    @NotNull
    public View getParandjaView() {
        VariantFrameLayout rootFl = getBinding().rootFl;
        Intrinsics.checkNotNullExpressionValue(rootFl, "rootFl");
        return rootFl;
    }
}
