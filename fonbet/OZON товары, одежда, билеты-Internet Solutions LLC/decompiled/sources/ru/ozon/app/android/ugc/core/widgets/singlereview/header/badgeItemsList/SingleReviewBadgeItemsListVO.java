package ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList;

import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem;", "badgeItems", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBadgeItems", "()Ljava/util/List;", "BadgeItem", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewBadgeItemsListVO implements c {

    @NotNull
    private final List<BadgeItem> badgeItems;
    private final long id;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem;", "", "<init>", "()V", "BadgeContent", "TimerContent", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem$BadgeContent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem$TimerContent;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class BadgeItem {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem$BadgeContent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BadgeContent extends BadgeItem {

            @NotNull
            private final BadgeDTO badge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BadgeContent(@NotNull BadgeDTO badge) {
                super(null);
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.badge = badge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BadgeContent) && Intrinsics.d(this.badge, ((BadgeContent) other).badge);
            }

            @NotNull
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public int hashCode() {
                return this.badge.hashCode();
            }

            @NotNull
            public String toString() {
                return "BadgeContent(badge=" + this.badge + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem$TimerContent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem;", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", DynamicElementDTO.TIMER, "<init>", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "getTimer", "()Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimerContent extends BadgeItem {

            @NotNull
            private final TimerVO timer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimerContent(@NotNull TimerVO timer) {
                super(null);
                Intrinsics.checkNotNullParameter(timer, "timer");
                this.timer = timer;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TimerContent) && Intrinsics.d(this.timer, ((TimerContent) other).timer);
            }

            @NotNull
            public final TimerVO getTimer() {
                return this.timer;
            }

            public int hashCode() {
                return this.timer.hashCode();
            }

            @NotNull
            public String toString() {
                return "TimerContent(timer=" + this.timer + ")";
            }
        }

        public /* synthetic */ BadgeItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BadgeItem() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleReviewBadgeItemsListVO(long j11, @NotNull List<? extends BadgeItem> badgeItems) {
        Intrinsics.checkNotNullParameter(badgeItems, "badgeItems");
        this.id = j11;
        this.badgeItems = badgeItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewBadgeItemsListVO)) {
            return false;
        }
        SingleReviewBadgeItemsListVO singleReviewBadgeItemsListVO = (SingleReviewBadgeItemsListVO) other;
        return this.id == singleReviewBadgeItemsListVO.id && Intrinsics.d(this.badgeItems, singleReviewBadgeItemsListVO.badgeItems);
    }

    @NotNull
    public final List<BadgeItem> getBadgeItems() {
        return this.badgeItems;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.badgeItems.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "SingleReviewBadgeItemsListVO(id=", ", badgeItems=", this.badgeItems);
        b11.append(")");
        return b11.toString();
    }
}
