package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import Kk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Item;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3WithImage;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "", "<init>", "()V", "OnStoryCompleted", "OnPreviousStory", "OnCloseStory", "OnNextFrame", "OnPreviousFrame", "OnPreloadImage", "OnAction", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnAction;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnCloseStory;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnNextFrame;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnPreloadImage;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnPreviousFrame;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnPreviousStory;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnStoryCompleted;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Event {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnAction;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnAction extends Event {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnCloseStory;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCloseStory extends Event {

        @NotNull
        public static final OnCloseStory INSTANCE = new OnCloseStory();

        private OnCloseStory() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnNextFrame;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "item", "<init>", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "getItem", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnNextFrame extends Event {

        @NotNull
        private final StoryV3Item item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnNextFrame(@NotNull StoryV3Item item) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnNextFrame) && Intrinsics.d(this.item, ((OnNextFrame) other).item);
        }

        @NotNull
        public final StoryV3Item getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnNextFrame(item=" + this.item + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnPreloadImage;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;", "asset", "<init>", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;", "getAsset", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPreloadImage extends Event {

        @NotNull
        private final StoryV3WithImage asset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPreloadImage(@NotNull StoryV3WithImage asset) {
            super(null);
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnPreloadImage) && Intrinsics.d(this.asset, ((OnPreloadImage) other).asset);
        }

        @NotNull
        public final StoryV3WithImage getAsset() {
            return this.asset;
        }

        public int hashCode() {
            return this.asset.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnPreloadImage(asset=" + this.asset + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnPreviousFrame;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "item", "<init>", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "getItem", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPreviousFrame extends Event {

        @NotNull
        private final StoryV3Item item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPreviousFrame(@NotNull StoryV3Item item) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnPreviousFrame) && Intrinsics.d(this.item, ((OnPreviousFrame) other).item);
        }

        @NotNull
        public final StoryV3Item getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnPreviousFrame(item=" + this.item + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnPreviousStory;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnPreviousStory extends Event {

        @NotNull
        public static final OnPreviousStory INSTANCE = new OnPreviousStory();

        private OnPreviousStory() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event$OnStoryCompleted;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStoryCompleted extends Event {

        @NotNull
        public static final OnStoryCompleted INSTANCE = new OnStoryCompleted();

        private OnStoryCompleted() {
            super(null);
        }
    }

    public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Event() {
    }
}
