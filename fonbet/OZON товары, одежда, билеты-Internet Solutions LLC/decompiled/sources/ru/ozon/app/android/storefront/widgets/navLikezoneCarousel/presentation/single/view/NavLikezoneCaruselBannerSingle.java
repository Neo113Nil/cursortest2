package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.single.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.Dimens;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/view/NavLikezoneCaruselBannerSingle;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "updateTopBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "View", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NavLikezoneCaruselBannerSingle extends NavLikezoneCaruselBanner {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/view/NavLikezoneCaruselBannerSingle$View;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$View;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/view/NavLikezoneCaruselBannerSingle;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "topBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "updateTopBadge", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "attachActionHandler", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class View extends NavLikezoneCaruselBanner.View implements NavLikezoneCaruselBannerSingle {
        private Function1<? super AtomAction, Unit> actionHandler;

        @NotNull
        private final BadgeView topBadgeView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
            ConstraintLayout.b a11 = a.a(badgeView, R$id.navLikezoneCarusel_TopBadge, -2, -2);
            a11.f41636i = 0;
            a11.f41656t = 0;
            a11.f41658v = 0;
            ((ViewGroup.MarginLayoutParams) a11).topMargin = Dimens.INSTANCE.getDp8();
            a11.f41616W = true;
            badgeView.setLayoutParams(a11);
            addView(badgeView);
            this.topBadgeView = badgeView;
        }

        public void attachActionHandler(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.actionHandler = actionHandler;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.single.view.NavLikezoneCaruselBannerSingle
        public void updateTopBadge(BadgeDTO badge) {
            BadgeHolderKt.bindOrGone(this.topBadgeView, badge, this.actionHandler);
        }
    }

    void updateTopBadge(BadgeDTO badge);
}
