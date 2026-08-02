package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.textIcon;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2TextIconLayoutBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/textIcon/AspectsV2TextIconViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2TextIconLayoutBinding;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/textIcon/AspectsTextIconVariantV2VO;", "item", "", "bindSelection", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/textIcon/AspectsTextIconVariantV2VO;)Lkotlin/Unit;", "bindIcon", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/textIcon/AspectsTextIconVariantV2VO;)V", "bindText", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV2TextIconViewHolder extends VariantsViewHolder<AspectsCompactVO$Variant, WidgetAspectsCompactV2TextIconLayoutBinding> {

    @NotNull
    private final View containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.textIcon.AspectsV2TextIconViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetAspectsCompactV2TextIconLayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetAspectsCompactV2TextIconLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2TextIconLayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetAspectsCompactV2TextIconLayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetAspectsCompactV2TextIconLayoutBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV2TextIconViewHolder(@NotNull View containerView) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        getBinding().titleTav.setTextIsSelectable(false);
    }

    private final void bindIcon(AspectsTextIconVariantV2VO item) {
        ImageView imageView = getBinding().icon;
        Intrinsics.f(imageView);
        Icon icon = item.getIcon();
        ImageViewExtKt.loadImageOrGone(imageView, icon != null ? icon.getImage() : null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Icon icon2 = item.getIcon();
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null));
        imageView.setAlpha(item.getIsAvailable() ? 1.0f : 0.5f);
    }

    private final Unit bindSelection(AspectsTextIconVariantV2VO item) {
        View view = this.itemView;
        view.setSelected(item.getIsSelected());
        view.setActivated(item.getIsAvailable());
        View view2 = this.itemView;
        VariantConstraintLayout variantConstraintLayout = view2 instanceof VariantConstraintLayout ? (VariantConstraintLayout) view2 : null;
        if (variantConstraintLayout == null) {
            return null;
        }
        variantConstraintLayout.setProbably(item.isEnabled().booleanValue());
        return Unit.f71690a;
    }

    private final void bindText(AspectsTextIconVariantV2VO item) {
        TextAtomV2View textAtomV2View = getBinding().titleTav;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bindOrGone$default(textAtomV2View, item.getText(), null, 2, null);
        if (item.getIsAvailable()) {
            return;
        }
        textAtomV2View.setAlpha(item.isNotAvailableTextAlpha());
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    public void bind(@NotNull AspectsCompactVO$Variant item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AspectsTextIconVariantV2VO aspectsTextIconVariantV2VO = (AspectsTextIconVariantV2VO) item;
        bindIcon(aspectsTextIconVariantV2VO);
        bindText(aspectsTextIconVariantV2VO);
        bindSelection(aspectsTextIconVariantV2VO);
    }
}
