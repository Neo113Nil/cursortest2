package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H$¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u0018*\u00020\u001eH\u0004¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010$\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\rR$\u0010'\u001a\u0004\u0018\u00010\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u00101\u001a\u00020\u00068DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028$X¤\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00068$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00100R\u0014\u00109\u001a\u00020\u00068$X¤\u0004¢\u0006\u0006\u001a\u0004\b8\u00100¨\u0006:"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonBaseView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "createBgView", "()Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "createButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "createBadgeView", "(Landroid/content/Context;)Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindBadge", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "updateBadgeConstrains", "()V", "Landroidx/constraintlayout/widget/d;", "updateConstrainsForCommonView", "(Landroidx/constraintlayout/widget/d;)V", "buttonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getButtonView", "bgView", "Landroid/view/View;", "getBgView", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "setBadgeView", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "bgColor$delegate", "LSc/j;", "getBgColor", "()I", "bgColor", "Lru/ozon/uni/core/UniColors;", "getBgColorUniColors", "()Lru/ozon/uni/core/UniColors;", "bgColorUniColors", "getButtonHorizontalMargin", "buttonHorizontalMargin", "getButtonVerticalMargin", "buttonVerticalMargin", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CancelPostingV2StickyButtonBaseView extends ConstraintLayout {
    private BadgeView badgeView;

    /* renamed from: bgColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bgColor;

    @NotNull
    private final View bgView;

    @NotNull
    private final LargeButtonView buttonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelPostingV2StickyButtonBaseView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        LargeButtonView createButtonView = createButtonView();
        this.buttonView = createButtonView;
        View createBgView = createBgView();
        this.bgView = createBgView;
        this.bgColor = LazyUtilsKt.unsafeLazy(new CancelPostingV2StickyButtonBaseView$bgColor$2(context, this));
        setId(View.generateViewId());
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        addView(createBgView);
        addView(createButtonView);
    }

    private final BadgeView createBadgeView(Context context) {
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(View.generateViewId());
        badgeView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        return badgeView;
    }

    private final View createBgView() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        return view;
    }

    private final LargeButtonView createButtonView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        largeButtonView.setId(View.generateViewId());
        Context context2 = largeButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        largeButtonView.setLayoutParams(new ConstraintLayout.b(0, ResourceExtKt.toPx(48, context2)));
        return largeButtonView;
    }

    public final void bindBadge(@NotNull Context context, BadgeDTO badgeDTO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (badgeDTO == null) {
            BadgeView badgeView = this.badgeView;
            if (badgeView != null) {
                ViewExtKt.gone(badgeView);
                return;
            }
            return;
        }
        if (this.badgeView == null) {
            BadgeView createBadgeView = createBadgeView(context);
            addView(createBadgeView);
            this.badgeView = createBadgeView;
            updateBadgeConstrains();
        }
        BadgeView badgeView2 = this.badgeView;
        if (badgeView2 != null) {
            BadgeHolderKt.bindOrGone(badgeView2, badgeDTO, actionHandler);
        }
    }

    protected final BadgeView getBadgeView() {
        return this.badgeView;
    }

    protected final int getBgColor() {
        return ((Number) this.bgColor.getValue()).intValue();
    }

    @NotNull
    protected abstract UniColors getBgColorUniColors();

    @NotNull
    protected final View getBgView() {
        return this.bgView;
    }

    protected abstract int getButtonHorizontalMargin();

    protected abstract int getButtonVerticalMargin();

    @NotNull
    public final LargeButtonView getButtonView() {
        return this.buttonView;
    }

    protected abstract void updateBadgeConstrains();

    protected final void updateConstrainsForCommonView(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConstraintSetExtKt.startToStart(dVar, this.buttonView.getId(), 0, getButtonHorizontalMargin());
        ConstraintSetExtKt.endToEnd(dVar, this.buttonView.getId(), 0, getButtonHorizontalMargin());
        ConstraintSetExtKt.bottomToBottom(dVar, this.buttonView.getId(), 0, getButtonVerticalMargin());
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.bgView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.bgView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.bgView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop(dVar, this.bgView.getId(), this.buttonView.getId(), getButtonVerticalMargin() * (-1));
    }
}
