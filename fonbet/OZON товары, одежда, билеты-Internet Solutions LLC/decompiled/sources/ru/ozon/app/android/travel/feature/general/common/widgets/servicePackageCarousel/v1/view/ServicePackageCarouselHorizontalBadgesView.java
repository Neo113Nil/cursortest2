package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view;

import android.content.Context;
import android.widget.LinearLayout;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u000eH\u0002¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselHorizontalBadgesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "firstBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "secondBadge", "bind", "", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "secondOrNull", "T", "(Ljava/util/List;)Ljava/lang/Object;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselHorizontalBadgesView extends LinearLayout {
    public static final int $stable = BadgeView.$stable;
    private final int dp8;

    @NotNull
    private final BadgeView firstBadge;

    @NotNull
    private final BadgeView secondBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackageCarouselHorizontalBadgesView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        q qVar = q.f64554a;
        BadgeView badgeView = (BadgeView) qVar.i(N.b(BadgeView.class), context);
        if (badgeView == null) {
            context2 = context;
            badgeView = new BadgeView(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.setMarginEnd(px);
        badgeView.setLayoutParams(layoutParams);
        addView(badgeView);
        this.firstBadge = badgeView;
        BadgeView badgeView2 = (BadgeView) qVar.i(N.b(BadgeView.class), context2);
        badgeView2 = badgeView2 == null ? new BadgeView(context2, null, 0, 0, 14, null) : badgeView2;
        badgeView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(badgeView2);
        this.secondBadge = badgeView2;
        setOrientation(0);
    }

    private final <T> T secondOrNull(List<? extends T> list) {
        if (list.size() > 1) {
            return list.get(1);
        }
        return null;
    }

    public final void bind(@NotNull List<BadgeDTO> badges) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        BadgeHolderKt.bindOrGone$default(this.firstBadge, (BadgeDTO) C7714v.M(badges), (Function1) null, 2, (Object) null);
        BadgeHolderKt.bindOrGone$default(this.secondBadge, (BadgeDTO) secondOrNull(badges), (Function1) null, 2, (Object) null);
    }
}
