package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.button;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u0014\u0010\u000b\u001a\u00020\fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonCommonView;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonBaseView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bgColorUniColors", "Lru/ozon/uni/core/UniColors;", "getBgColorUniColors", "()Lru/ozon/uni/core/UniColors;", "buttonHorizontalMargin", "getButtonHorizontalMargin", "()I", "buttonVerticalMargin", "getButtonVerticalMargin", "updateBadgeConstrains", "", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CancelPostingV2StickyButtonCommonView extends CancelPostingV2StickyButtonBaseView {

    @NotNull
    private final UniColors bgColorUniColors;
    private final int buttonHorizontalMargin;
    private final int buttonVerticalMargin;

    public /* synthetic */ CancelPostingV2StickyButtonCommonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView
    @NotNull
    protected UniColors getBgColorUniColors() {
        return this.bgColorUniColors;
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView
    protected int getButtonHorizontalMargin() {
        return this.buttonHorizontalMargin;
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView
    protected int getButtonVerticalMargin() {
        return this.buttonVerticalMargin;
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView
    protected void updateBadgeConstrains() {
        BadgeView badgeView = getBadgeView();
        if (badgeView == null) {
            return;
        }
        d dVar = new d();
        dVar.p(this);
        int id2 = badgeView.getId();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ConstraintSetExtKt.startToStart(dVar, id2, 0, UiExtKt.toPx(16, context));
        int id3 = badgeView.getId();
        int id4 = getButtonView().getId();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ConstraintSetExtKt.bottomToTop(dVar, id3, id4, UiExtKt.toPx(12, context2));
        dVar.f(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelPostingV2StickyButtonCommonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgColorUniColors = UniColors.LAYER_FLOOR_1;
        this.buttonHorizontalMargin = UiExtKt.toPx(16, context);
        this.buttonVerticalMargin = UiExtKt.toPx(8, context);
        getBgView().setBackgroundColor(getBgColor());
        d dVar = new d();
        dVar.p(this);
        updateConstrainsForCommonView(dVar);
        dVar.f(this);
    }
}
