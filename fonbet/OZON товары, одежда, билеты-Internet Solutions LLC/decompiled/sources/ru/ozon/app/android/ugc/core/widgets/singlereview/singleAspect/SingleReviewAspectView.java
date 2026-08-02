package ru.ozon.app.android.ugc.core.widgets.singlereview.singleAspect;

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

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/singleAspect/SingleReviewAspectView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "aspect", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bind", "", "badgeDTO", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewAspectView extends FrameLayout {
    public static final int $stable = BadgeView.$stable;

    @NotNull
    private final BadgeView aspect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewAspectView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.aspect = badgeView;
        addView(badgeView);
        setLayoutParams(new RecyclerView.p(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        Dimens dimens = Dimens.INSTANCE;
        int dp_10 = dimens.getDP_10();
        setPadding(dimens.getDP_16(), dp_10, getPaddingRight(), dimens.getDP_10());
    }

    public final void bind(@NotNull BadgeDTO badgeDTO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(badgeDTO, "badgeDTO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        BadgeHolderKt.bind(this.aspect, badgeDTO, actionHandler);
    }
}
