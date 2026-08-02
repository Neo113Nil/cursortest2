package ru.ozon.app.android.ugc.core.widgets.singlereview.header.singleBadge;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewBadgeView extends FrameLayout {
    public static final int $stable = BadgeView.$stable;

    @NotNull
    private final BadgeView badge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewBadgeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.badge = badgeView;
        addView(badgeView);
        setLayoutParams(new RecyclerView.p(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_16(), dimens.getDP_8(), dimens.getDP_16(), getPaddingBottom());
    }

    public final void bind(@NotNull BadgeDTO badgeDTO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(badgeDTO, "badgeDTO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        BadgeHolderKt.bind(this.badge, badgeDTO, actionHandler);
    }
}
