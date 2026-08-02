package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListVO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListUpdateEvent;", "LA00/a$J$a;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "newState", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;)V", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "getNewState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BadgeListUpdateEvent implements a.J.InterfaceC0007a {
    private final long id;

    @NotNull
    private final BadgeListVO.State newState;

    public BadgeListUpdateEvent(long j11, @NotNull BadgeListVO.State newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.id = j11;
        this.newState = newState;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final BadgeListVO.State getNewState() {
        return this.newState;
    }
}
