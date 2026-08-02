package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack;

import X4.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0010*\u00020\fH\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR-\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackVariantBaseViewHolder;", "LX4/a;", "Binding", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/base/Bind;", "bind", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactPackVariantV2VO;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "subtitleTav", "", "setTexts", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactPackVariantV2VO;Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeV", "setBadge", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactPackVariantV2VO;Lru/ozon/uni/android/atom/badge/BadgeView;)V", "bindSelection", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactPackVariantV2VO;)Lkotlin/Unit;", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "getBind", "()Lkotlin/jvm/functions/Function1;", "", "marginIfHasBadge", "I", "getMarginIfHasBadge", "()I", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AspectsCompactV2PackVariantBaseViewHolder<Binding extends a> extends VariantsViewHolder<AspectsCompactVO$Variant, Binding> {

    @NotNull
    private final Function1<View, Binding> bind;

    @NotNull
    private final View containerView;
    private final int marginIfHasBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AspectsCompactV2PackVariantBaseViewHolder(@NotNull View containerView, @NotNull Function1<? super View, ? extends Binding> bind) {
        super(containerView, bind);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(bind, "bind");
        this.containerView = containerView;
        this.bind = bind;
        this.marginIfHasBadge = ResourceExtKt.toPx(12);
    }

    protected final Unit bindSelection(@NotNull AspectsCompactPackVariantV2VO aspectsCompactPackVariantV2VO) {
        Intrinsics.checkNotNullParameter(aspectsCompactPackVariantV2VO, "<this>");
        View view = this.itemView;
        view.setSelected(aspectsCompactPackVariantV2VO.getIsSelected());
        view.setActivated(aspectsCompactPackVariantV2VO.getIsAvailable());
        View view2 = this.itemView;
        VariantConstraintLayout variantConstraintLayout = view2 instanceof VariantConstraintLayout ? (VariantConstraintLayout) view2 : null;
        if (variantConstraintLayout == null) {
            return null;
        }
        variantConstraintLayout.setProbably(aspectsCompactPackVariantV2VO.isEnabled().booleanValue());
        return Unit.f71690a;
    }

    protected final int getMarginIfHasBadge() {
        return this.marginIfHasBadge;
    }

    protected final void setBadge(@NotNull AspectsCompactPackVariantV2VO aspectsCompactPackVariantV2VO, @NotNull BadgeView badgeV) {
        Intrinsics.checkNotNullParameter(aspectsCompactPackVariantV2VO, "<this>");
        Intrinsics.checkNotNullParameter(badgeV, "badgeV");
        BadgeHolderKt.bindOrGone$default(badgeV, aspectsCompactPackVariantV2VO.getBadge(), (Function1) null, 2, (Object) null);
    }

    protected final void setTexts(@NotNull AspectsCompactPackVariantV2VO aspectsCompactPackVariantV2VO, @NotNull TextAtomV2View titleTav, @NotNull TextAtomV2View subtitleTav) {
        Intrinsics.checkNotNullParameter(aspectsCompactPackVariantV2VO, "<this>");
        Intrinsics.checkNotNullParameter(titleTav, "titleTav");
        Intrinsics.checkNotNullParameter(subtitleTav, "subtitleTav");
        binding(new AspectsCompactV2PackVariantBaseViewHolder$setTexts$1(titleTav, aspectsCompactPackVariantV2VO, subtitleTav));
    }
}
