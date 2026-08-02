package ru.ozon.app.android.storefront.stories.playstoriesv3;

import Kk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;", "", "<init>", "()V", "OnStoryCompleted", "OnPreviousClicked", "OnCloseStories", "OnTrackVideoWatched", "OnAction", "OnShareClicked", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnAction;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnCloseStories;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnPreviousClicked;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnShareClicked;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnStoryCompleted;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnTrackVideoWatched;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Action {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnAction;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnAction extends Action {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final AtomAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAction(@NotNull AtomAction action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnAction) && Intrinsics.d(this.action, ((OnAction) other).action);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return c.e("OnAction(action=", ")", this.action);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnCloseStories;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCloseStories extends Action {

        @NotNull
        public static final OnCloseStories INSTANCE = new OnCloseStories();

        private OnCloseStories() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnPreviousClicked;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnPreviousClicked extends Action {

        @NotNull
        public static final OnPreviousClicked INSTANCE = new OnPreviousClicked();

        private OnPreviousClicked() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnShareClicked;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "shareAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getShareAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnShareClicked extends Action {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final AtomAction shareAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnShareClicked(@NotNull AtomAction shareAction) {
            super(null);
            Intrinsics.checkNotNullParameter(shareAction, "shareAction");
            this.shareAction = shareAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnShareClicked) && Intrinsics.d(this.shareAction, ((OnShareClicked) other).shareAction);
        }

        @NotNull
        public final AtomAction getShareAction() {
            return this.shareAction;
        }

        public int hashCode() {
            return this.shareAction.hashCode();
        }

        @NotNull
        public String toString() {
            return c.e("OnShareClicked(shareAction=", ")", this.shareAction);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnStoryCompleted;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStoryCompleted extends Action {

        @NotNull
        public static final OnStoryCompleted INSTANCE = new OnStoryCompleted();

        private OnStoryCompleted() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/Action$OnTrackVideoWatched;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTrackVideoWatched extends Action {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final AtomAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTrackVideoWatched(@NotNull AtomAction action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnTrackVideoWatched) && Intrinsics.d(this.action, ((OnTrackVideoWatched) other).action);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return c.e("OnTrackVideoWatched(action=", ")", this.action);
        }
    }

    public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Action() {
    }
}
