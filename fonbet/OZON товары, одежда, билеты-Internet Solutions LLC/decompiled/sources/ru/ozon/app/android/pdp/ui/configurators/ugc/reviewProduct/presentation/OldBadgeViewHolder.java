package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation;

import Dc0.n;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/OldBadgeViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/BadgeViewHolder;", "Landroid/view/ViewGroup;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO$BadgeVO;", "item", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO$BadgeVO;)V", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OldBadgeViewHolder extends BadgeViewHolder {

    @NotNull
    private final ViewGroup containerView;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OldBadgeViewHolder(@NotNull ViewGroup containerView, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.containerView = containerView;
        this.onAction = onAction;
        containerView.setOnClickListener(new n(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(OldBadgeViewHolder oldBadgeViewHolder, View view) {
        BadgeView badgeView = oldBadgeViewHolder.getBadgeView();
        if (badgeView != null) {
            badgeView.performClick();
        }
    }

    private final BadgeView getBadgeView() {
        View view = ViewGroupExtKt.get(this.containerView, 0);
        if (view instanceof BadgeView) {
            return (BadgeView) view;
        }
        return null;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.BadgeViewHolder
    public void bind(@NotNull ReviewProductVO.BadgeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BadgeView badgeView = getBadgeView();
        if (badgeView != null) {
            BadgeViewHolderKt.applyMargins(badgeView, item);
            AtomDTO badge = item.getBadge();
            Intrinsics.g(badge, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.badge.Badge");
            BadgeHolderKt.bind(badgeView, BadgeMapperKt.mapToDsBadge((Badge) badge), this.onAction);
        }
    }
}
