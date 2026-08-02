package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/BadgesViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/ItemViewHolder;", "view", "Lru/ozon/uni/android/atom/badge/BadgeView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/atom/badge/BadgeView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Item;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgesViewHolder extends ItemViewHolder {
    public static final int $stable = BadgeView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final BadgeView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgesViewHolder(@NotNull BadgeView view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        this.onAction = onAction;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter.ItemViewHolder
    public void bind(@NotNull BadgeListVO.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof BadgeListVO.BadgeWrapper) {
            BadgeHolderKt.bind(this.view, ((BadgeListVO.BadgeWrapper) item).getBadge(), this.onAction);
        }
    }
}
