package ru.ozon.app.android.storefront.stories.playstoriesv3;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import B0.C2454a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import io.reactivex.p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.stories.playstoriesv3.Action;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.StoryV3UpdateStore;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.SystemElementsSetting;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.ViewedStoryModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3ItemAsset;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3WithVideo;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0010J#\u0010\u001d\u001a\u00020\b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0010J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0010J\u001f\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u0006018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u00106\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/StoryV3UpdateStore;", "updateStore", "<init>", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/StoryV3UpdateStore;)V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;", "action", "", "sendAction", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "onAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "onStoryCompleted", "()V", "onPreviousClicked", "", "statusBarHeight", "bottomNavBarHeight", "onGotSystemElementsHeight", "(II)V", "onShareClicked", "onSwipeDown", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "onTrackView", "(Ljava/util/Map;)V", "storyId", "onStoryViewed", "(I)V", "clearStorage", "onCloseStories", "watchedSeconds", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3ItemAsset;", "asset", "trackVideoWatched", "(Ljava/lang/String;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3ItemAsset;)V", "Lio/reactivex/p;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/ViewedStoryModel;", "subscribeStoryUpdates", "()Lio/reactivex/p;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/StoryV3UpdateStore;", "LAe/w0;", "mutableActions", "LAe/w0;", "LAe/B0;", "actions", "LAe/B0;", "getActions", "()LAe/B0;", "viewPagerPosition", "Ljava/lang/Integer;", "getViewPagerPosition", "()Ljava/lang/Integer;", "setViewPagerPosition", "(Ljava/lang/Integer;)V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/SystemElementsSetting;", "systemElementsSetting", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/SystemElementsSetting;", "getSystemElementsSetting", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/SystemElementsSetting;", "setSystemElementsSetting", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/SystemElementsSetting;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesV3ViewModel extends w0 {

    @NotNull
    private final B0<Action> actions;

    @NotNull
    private final Ae.w0<Action> mutableActions;

    @NotNull
    private SystemElementsSetting systemElementsSetting;

    @NotNull
    private final StoryV3UpdateStore updateStore;
    private Integer viewPagerPosition;

    public PlayStoriesV3ViewModel(@NotNull StoryV3UpdateStore updateStore) {
        Intrinsics.checkNotNullParameter(updateStore, "updateStore");
        this.updateStore = updateStore;
        C0 a11 = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this.mutableActions = a11;
        this.actions = C2399j.a(a11);
        this.systemElementsSetting = new SystemElementsSetting(0, 0);
    }

    private final void sendAction(Action action) {
        C10727i.c(x0.a(this), null, null, new PlayStoriesV3ViewModel$sendAction$1(this, action, null), 3);
    }

    public final void clearStorage() {
        this.updateStore.clearStorage();
    }

    @NotNull
    public final B0<Action> getActions() {
        return this.actions;
    }

    @NotNull
    public final SystemElementsSetting getSystemElementsSetting() {
        return this.systemElementsSetting;
    }

    public final Integer getViewPagerPosition() {
        return this.viewPagerPosition;
    }

    public final void onAction(@NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        sendAction(new Action.OnAction(atomAction));
    }

    public final void onCloseStories() {
        sendAction(Action.OnCloseStories.INSTANCE);
    }

    public final void onGotSystemElementsHeight(int statusBarHeight, int bottomNavBarHeight) {
        this.systemElementsSetting.setStatusBarHeight(statusBarHeight);
        this.systemElementsSetting.setBottomNavBarHeight(bottomNavBarHeight);
    }

    public final void onPreviousClicked() {
        sendAction(Action.OnPreviousClicked.INSTANCE);
    }

    public final void onShareClicked(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        sendAction(new Action.OnShareClicked(action));
    }

    public final void onStoryCompleted() {
        sendAction(Action.OnStoryCompleted.INSTANCE);
    }

    public final void onStoryViewed(int storyId) {
        this.updateStore.sendStoryViewed(storyId);
    }

    public final void onSwipeDown() {
        sendAction(new Action.OnAction(new AtomAction.Dismiss(null, null, null, null, 13, null)));
    }

    public final void onTrackView(Map<String, TokenizedTrackingInfo> trackingInfo) {
        sendAction(new Action.OnAction(new AtomAction.ViewAction(trackingInfo, null, 2, null)));
    }

    public final void setViewPagerPosition(Integer num) {
        this.viewPagerPosition = num;
    }

    @NotNull
    public final p<ViewedStoryModel> subscribeStoryUpdates() {
        return this.updateStore.subscribeOnStoryViewed();
    }

    public final void trackVideoWatched(@NotNull String watchedSeconds, StoryV3ItemAsset asset) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(watchedSeconds, "watchedSeconds");
        StoryV3WithVideo storyV3WithVideo = asset instanceof StoryV3WithVideo ? (StoryV3WithVideo) asset : null;
        if (storyV3WithVideo == null || (trackingInfo = storyV3WithVideo.getTrackingInfo()) == null) {
            return;
        }
        sendAction(new Action.OnTrackVideoWatched(new AtomAction.ComposerAction(null, "view", C2454a.b("number", watchedSeconds), trackingInfo, null, 17, null)));
    }
}
