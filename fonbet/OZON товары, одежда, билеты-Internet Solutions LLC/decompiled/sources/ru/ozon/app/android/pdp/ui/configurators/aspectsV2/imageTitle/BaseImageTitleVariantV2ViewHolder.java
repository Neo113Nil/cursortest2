package ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle;

import X4.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantLinearLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b'\u0018\u0000 \u001a*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001aB-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\fH\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R-\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/BaseImageTitleVariantV2ViewHolder;", "LX4/a;", "Binding", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/base/Bind;", "bind", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/AspectsImageTitleVariantV2VO;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "", "setTitle", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/AspectsImageTitleVariantV2VO;Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "bindSelection", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/AspectsImageTitleVariantV2VO;)Lkotlin/Unit;", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "getBind", "()Lkotlin/jvm/functions/Function1;", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseImageTitleVariantV2ViewHolder<Binding extends a> extends VariantsViewHolder<AspectsCompactVO$Variant, Binding> {

    @NotNull
    private final Function1<View, Binding> bind;

    @NotNull
    private final View containerView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/BaseImageTitleVariantV2ViewHolder$Companion;", "", "<init>", "()V", "SELECTED_LOCATOR", "", "UNSELECTED_LOCATOR", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseImageTitleVariantV2ViewHolder(@NotNull View containerView, @NotNull Function1<? super View, ? extends Binding> bind) {
        super(containerView, bind);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(bind, "bind");
        this.containerView = containerView;
        this.bind = bind;
    }

    protected final Unit bindSelection(@NotNull AspectsImageTitleVariantV2VO aspectsImageTitleVariantV2VO) {
        Intrinsics.checkNotNullParameter(aspectsImageTitleVariantV2VO, "<this>");
        View view = this.itemView;
        view.setContentDescription(aspectsImageTitleVariantV2VO.getIsSelected() ? "selectedColorTitleAspect" : "colorTitleAspect");
        view.setSelected(aspectsImageTitleVariantV2VO.getIsSelected());
        view.setActivated(aspectsImageTitleVariantV2VO.getIsAvailable());
        VariantLinearLayout variantLinearLayout = view instanceof VariantLinearLayout ? (VariantLinearLayout) view : null;
        if (variantLinearLayout == null) {
            return null;
        }
        variantLinearLayout.setProbably(aspectsImageTitleVariantV2VO.isEnabled().booleanValue());
        return Unit.f71690a;
    }

    protected final void setTitle(@NotNull AspectsImageTitleVariantV2VO aspectsImageTitleVariantV2VO, @NotNull TextAtomV2View titleTav) {
        Intrinsics.checkNotNullParameter(aspectsImageTitleVariantV2VO, "<this>");
        Intrinsics.checkNotNullParameter(titleTav, "titleTav");
        TextHolderKt.bindOrGone$default(titleTav, aspectsImageTitleVariantV2VO.getText(), null, 2, null);
        if (aspectsImageTitleVariantV2VO.getIsAvailable()) {
            return;
        }
        titleTav.setAlpha(aspectsImageTitleVariantV2VO.isNotAvailableTextAlpha());
    }
}
