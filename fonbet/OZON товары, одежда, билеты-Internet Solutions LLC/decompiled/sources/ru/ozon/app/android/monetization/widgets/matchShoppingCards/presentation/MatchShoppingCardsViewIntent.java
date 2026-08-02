package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Tg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;", "", "SwipeAttempt", "SwipeOutEnd", "SwipeOutStart", "HandleAtomAction", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent$HandleAtomAction;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent$SwipeAttempt;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent$SwipeOutEnd;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent$SwipeOutStart;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MatchShoppingCardsViewIntent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent$HandleAtomAction;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;", "LTg/b;", "action", "<init>", "(LTg/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LTg/b;", "getAction", "()LTg/b;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleAtomAction implements MatchShoppingCardsViewIntent {

        @NotNull
        private final b action;

        public HandleAtomAction(@NotNull b action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleAtomAction) && Intrinsics.d(this.action, ((HandleAtomAction) other).action);
        }

        @NotNull
        public final b getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return "HandleAtomAction(action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent$SwipeAttempt;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwipeAttempt implements MatchShoppingCardsViewIntent {

        @NotNull
        public static final SwipeAttempt INSTANCE = new SwipeAttempt();

        private SwipeAttempt() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SwipeAttempt);
        }

        public int hashCode() {
            return 2134400783;
        }

        @NotNull
        public String toString() {
            return "SwipeAttempt";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent$SwipeOutEnd;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwipeOutEnd implements MatchShoppingCardsViewIntent {

        @NotNull
        public static final SwipeOutEnd INSTANCE = new SwipeOutEnd();

        private SwipeOutEnd() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SwipeOutEnd);
        }

        public int hashCode() {
            return -1053468117;
        }

        @NotNull
        public String toString() {
            return "SwipeOutEnd";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent$SwipeOutStart;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;", "direction", "<init>", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;", "getDirection", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwipeOutStart implements MatchShoppingCardsViewIntent {

        @NotNull
        private final SwipeDirection direction;

        public SwipeOutStart(@NotNull SwipeDirection direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.direction = direction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SwipeOutStart) && this.direction == ((SwipeOutStart) other).direction;
        }

        @NotNull
        public final SwipeDirection getDirection() {
            return this.direction;
        }

        public int hashCode() {
            return this.direction.hashCode();
        }

        @NotNull
        public String toString() {
            return "SwipeOutStart(direction=" + this.direction + ")";
        }
    }
}
