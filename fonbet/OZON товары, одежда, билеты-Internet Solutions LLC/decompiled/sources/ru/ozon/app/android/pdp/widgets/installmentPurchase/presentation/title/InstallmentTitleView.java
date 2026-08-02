package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.title;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.InstallmentVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a*\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/title/InstallmentTitleView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Title;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Title;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "LSc/j;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeViewLazy", "LSc/j;", "getBadgeViewLazy", "()LSc/j;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView$delegate", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/title/InstallmentTitleView;)Ljava/lang/Object;", "badgeView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class InstallmentTitleView extends LinearLayout {

    @NotNull
    private final InterfaceC4008j<BadgeView> badgeViewLazy;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentTitleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.installmentTitleText);
        textAtomV2View.setTextIsSelectable(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        textAtomV2View.setLayoutParams(layoutParams);
        this.titleView = textAtomV2View;
        this.badgeViewLazy = DelegatesKt.lazyUnsafe(new InstallmentTitleView$special$$inlined$lazyView$1(this, context));
        setId(R$id.installmentTitleContainer);
        setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams2.leftMargin = dimens.getDP_16();
        layoutParams2.rightMargin = dimens.getDP_16();
        layoutParams2.bottomMargin = dimens.getDP_8();
        setLayoutParams(layoutParams2);
        addView(textAtomV2View);
    }

    public final void bind(@NotNull InstallmentVO.Title item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        if (item.getBadge() != null) {
            BadgeHolderKt.bindOrGone(getBadgeView(), item.getBadge(), actionHandler);
        } else if (this.badgeViewLazy.isInitialized()) {
            ViewExtKt.gone(getBadgeView());
        }
    }

    @NotNull
    public final BadgeView getBadgeView() {
        return this.badgeViewLazy.getValue();
    }
}
