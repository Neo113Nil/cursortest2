package ru.ozon.app.android.ugc.core.widgets.singlereview.badgeText;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016*\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/badgeText/BadgeTextView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/badgeText/BadgeTextVO;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/badgeText/BadgeTextVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "LSc/j;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleViewDelegate", "LSc/j;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView$delegate", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/badgeText/BadgeTextView;)Ljava/lang/Object;", "titleView", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BadgeTextView extends LinearLayout {

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final InterfaceC4008j<TextAtomV2View> titleViewDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMargins(dimens.getDP_16(), 0, dimens.getDP_8(), 0);
        badgeView.setLayoutParams(layoutParams);
        addView(badgeView);
        this.badgeView = badgeView;
        this.titleViewDelegate = LazyUtilsKt.unsafeLazy(new BadgeTextView$titleViewDelegate$1(context, this));
        setId(R$id.singleReviewBadgeTextView);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    private final TextAtomV2View getTitleView() {
        return this.titleViewDelegate.getValue();
    }

    public final void bind(@NotNull BadgeTextVO data, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        BadgeHolderKt.bind(this.badgeView, data.getBadge(), actionHandler);
        if (data.getTitle() == null && !this.titleViewDelegate.isInitialized()) {
            return;
        }
        TextHolderKt.bindOrGone$default(getTitleView(), data.getTitle(), null, 2, null);
    }
}
