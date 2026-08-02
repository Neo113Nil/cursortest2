package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonTeenView;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroidx/constraintlayout/widget/d;", "", "updateConstrainsForIslandSeparator", "(Landroidx/constraintlayout/widget/d;)V", "updateBadgeConstrains", "()V", "Lru/ozon/uni/core/UniColors;", "bgColorUniColors", "Lru/ozon/uni/core/UniColors;", "getBgColorUniColors", "()Lru/ozon/uni/core/UniColors;", "buttonHorizontalMargin", "I", "getButtonHorizontalMargin", "()I", "buttonVerticalMargin", "getButtonVerticalMargin", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "islandSeparatorView", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelPostingV2StickyButtonTeenView extends CancelPostingV2StickyButtonBaseView {
    public static final int $stable = IslandSeparatorView.$stable;

    @NotNull
    private final UniColors bgColorUniColors;
    private final int buttonHorizontalMargin;
    private final int buttonVerticalMargin;

    @NotNull
    private final IslandSeparatorView islandSeparatorView;

    public /* synthetic */ CancelPostingV2StickyButtonTeenView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void updateConstrainsForIslandSeparator(d dVar) {
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.islandSeparatorView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.islandSeparatorView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.islandSeparatorView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(dVar, this.islandSeparatorView.getId(), getBgView().getId(), 0, 4, null);
    }

    @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView
    @NotNull
    protected UniColors getBgColorUniColors() {
        return this.bgColorUniColors;
    }

    @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView
    protected int getButtonHorizontalMargin() {
        return this.buttonHorizontalMargin;
    }

    @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView
    protected int getButtonVerticalMargin() {
        return this.buttonVerticalMargin;
    }

    @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView
    protected void updateBadgeConstrains() {
        BadgeView badgeView = getBadgeView();
        if (badgeView == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(16, context);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart(dVar, badgeView.getId(), 0, px);
        ConstraintSetExtKt.endToEnd(dVar, badgeView.getId(), 0, px);
        ConstraintSetExtKt.bottomToTop(dVar, badgeView.getId(), getButtonView().getId(), px);
        dVar.f(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelPostingV2StickyButtonTeenView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgColorUniColors = UniColors.BG_DARK_KEY;
        this.buttonHorizontalMargin = UiExtKt.toPx(8, context);
        this.buttonVerticalMargin = UiExtKt.toPx(8, context);
        IslandSeparatorView islandSeparatorView = new IslandSeparatorView(context, null, 0, 6, null);
        islandSeparatorView.setId(View.generateViewId());
        islandSeparatorView.setLayoutParams(new ConstraintLayout.b(0, -2));
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(true, false, 0, getBgColor()));
        addView(islandSeparatorView);
        this.islandSeparatorView = islandSeparatorView;
        getBgView().setBackgroundColor(getBgColor());
        d dVar = new d();
        dVar.p(this);
        updateConstrainsForCommonView(dVar);
        updateConstrainsForIslandSeparator(dVar);
        dVar.f(this);
    }
}
