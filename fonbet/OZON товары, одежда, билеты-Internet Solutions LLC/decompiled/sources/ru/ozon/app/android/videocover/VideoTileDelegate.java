package ru.ozon.app.android.videocover;

import BY.a;
import BY.b;
import BY.c;
import BY.h;
import BY.i;
import WZ.e;
import WZ.g;
import WZ.t;
import a00.C4911f;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.p;
import io.reactivex.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import jk0.l;
import jk0.o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import sc.C9656b;
import vc.C10299d;
import vc.q;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 p2\u00020\u0001:\u0001pB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\n2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010'\u001a\u00020\n*\u00020\u000e2\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\f\u0012\n\u0018\u00010!j\u0004\u0018\u0001`\"0\u001f2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010*J\u000f\u00100\u001a\u00020\nH\u0002¢\u0006\u0004\b0\u0010*J%\u00104\u001a\u00020\n2\u0006\u00101\u001a\u00020$2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\n02H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u0010*J\u0017\u00109\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010*J\u0013\u0010=\u001a\u00020<*\u00020\u000eH\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\nH\u0002¢\u0006\u0004\b?\u0010*J\u0017\u0010@\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u001bH\u0002¢\u0006\u0004\b@\u0010AJ?\u0010I\u001a\u00020\n2\u0006\u00108\u001a\u0002072\u0006\u0010C\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010D2\f\u0010G\u001a\b\u0012\u0004\u0012\u0002070F2\u0006\u0010H\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ\u0019\u0010H\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bH\u0010KJ\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0002¢\u0006\u0004\bM\u0010NJ\u0013\u0010O\u001a\u00020D*\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u00020\n*\b\u0012\u0004\u0012\u0002070\u001bH\u0002¢\u0006\u0004\bQ\u0010\u001eJ\u000f\u0010R\u001a\u00020\nH\u0002¢\u0006\u0004\bR\u0010*J\u0015\u0010S\u001a\u0004\u0018\u000107*\u00020\u0016H\u0002¢\u0006\u0004\bS\u0010TJ!\u0010W\u001a\u00020\u00122\b\u0010U\u001a\u0004\u0018\u0001072\u0006\u0010V\u001a\u000207H\u0002¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010YR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010Z\u001a\u0004\b[\u0010\\R \u0010^\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002070]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010U\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010`R\"\u0010c\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020b0a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006q"}, d2 = {"Lru/ozon/app/android/videocover/VideoTileDelegate;", "", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/videocover/ContinuousScrollStateListener;", "widgetsScrollStateListener", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lru/ozon/app/android/videocover/ContinuousScrollStateListener;)V", "Lru/ozon/app/android/videocover/VideoTileWidgetHolder;", "videoTileWidgetHolder", "", "onWidgetHolderScrolledOutOfVisibleBounds", "(Lru/ozon/app/android/videocover/VideoTileWidgetHolder;)V", "onWidgetHolderScrolledInVisibleBounds", "Lru/ozon/app/android/videocover/VideoTileHolder;", "videoTileHolder", "onVideoTileInVisibleBounds", "(Lru/ozon/app/android/videocover/VideoTileHolder;)V", "", "shouldNeedRunNewTask", "onVideoTileOutOfVisibleBounds", "(Lru/ozon/app/android/videocover/VideoTileHolder;Z)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "onGalleryItemSwipeStart", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "onGalleryItemSwipeEnd", "", "items", "onVideoTileClicked", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lru/ozon/app/android/videocover/VideoTileItem;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "eventGetter", "", "customKey", "customValue", "trackWithCustom", "(Lru/ozon/app/android/videocover/VideoTileHolder;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V", "onVideoFinish", "()V", "onReplay", "isSmooth", "stopPlayingItemWithGallerySwipe", "(Z)V", "stopWithPlayerReset", "trackVideoInterruptedEvent", "taskKey", "Lkotlin/Function0;", "block", "runAfterDelay", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "playNextVideo", "Lru/ozon/app/android/videocover/SafeVideoTile;", "safeVideoTile", "playVideoOn", "(Lru/ozon/app/android/videocover/SafeVideoTile;)V", "releasePlayer", "", "getFullPosition", "(Lru/ozon/app/android/videocover/VideoTileHolder;)J", "checkGalleriesVisibility", "findChangedItems", "()Ljava/util/List;", "", "galleryItemPositionOnScreen", "Lkotlin/ranges/IntRange;", "composerRvHorizontalBoundaries", "", "changedItems", "isInVerticalBoundaries", "checkHorizontalBoundsOfItem", "(Lru/ozon/app/android/videocover/SafeVideoTile;[ILkotlin/ranges/IntRange;Ljava/util/List;Z)V", "(Lru/ozon/app/android/videocover/VideoTileHolder;)Z", "Landroid/view/View;", "getComposerView", "()Landroid/view/View;", "getHorizontalBoundaries", "(Landroid/view/View;)Lkotlin/ranges/IntRange;", "handleChangedItems", "clearDisposableTasks", "findInVideoQueue", "(Landroidx/recyclerview/widget/RecyclerView$C;)Lru/ozon/app/android/videocover/SafeVideoTile;", "playingItem", "pendingItem", "getEarlierItem", "(Lru/ozon/app/android/videocover/SafeVideoTile;Lru/ozon/app/android/videocover/SafeVideoTile;)Z", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lru/ozon/app/android/videocover/ContinuousScrollStateListener;", "getWidgetsScrollStateListener", "()Lru/ozon/app/android/videocover/ContinuousScrollStateListener;", "Ljava/util/concurrent/ConcurrentSkipListMap;", "videoQueue", "Ljava/util/concurrent/ConcurrentSkipListMap;", "Lru/ozon/app/android/videocover/SafeVideoTile;", "", "Lnc/b;", "disposableTasks", "Ljava/util/Map;", "Landroid/graphics/Rect;", "viewVisibleRect", "Landroid/graphics/Rect;", "positionOnScreen", "[I", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "Companion", "videocover_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoTileDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private Map<String, InterfaceC8487b> disposableTasks;
    private SingleInstancePlayerController playerController;

    @NotNull
    private final PlayerListenersContainer playerListener;
    private SafeVideoTile playingItem;

    @NotNull
    private final int[] positionOnScreen;

    @NotNull
    private final VideoController videoController;

    @NotNull
    private final ConcurrentSkipListMap<Long, SafeVideoTile> videoQueue;

    @NotNull
    private final Rect viewVisibleRect;

    @NotNull
    private final ContinuousScrollStateListener widgetsScrollStateListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/videocover/VideoTileDelegate$Companion;", "", "<init>", "()V", "TASK_DELAY", "", "PLAY_VIDEO_TASK_KEY", "", "CHECK_VISIBILITY_TASK_KEY", "SCROLL_STATE_LISTENER_TASK_KEY", "STARTED_VIDEO_CUSTOM_KEY", "INTERRUPTED_VIDEO_CUSTOM_KEY", "INTERRUPTED_VIDEO_SWIPE_VALUE", "INTERRUPTED_VIDEO_CLICK_VALUE", "INTERRUPTED_VIDEO_PAGE_SCROLL_VALUE", "VISIBLE_PART_OF_VIEW_FOR_AUTO_PLAY", "", "videocover_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VideoTileDelegate(@NotNull VideoController videoController, @NotNull ContinuousScrollStateListener widgetsScrollStateListener) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(widgetsScrollStateListener, "widgetsScrollStateListener");
        this.videoController = videoController;
        this.widgetsScrollStateListener = widgetsScrollStateListener;
        this.videoQueue = new ConcurrentSkipListMap<>();
        this.disposableTasks = new ConcurrentHashMap();
        this.viewVisibleRect = new Rect();
        this.positionOnScreen = new int[2];
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onRenderedFirstFrame(new a(this));
        builder.onError(new b(this));
        builder.onFinish(new c(this));
        this.playerListener = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkGalleriesVisibility() {
        List<SafeVideoTile> findChangedItems = findChangedItems();
        if (findChangedItems != null) {
            handleChangedItems(findChangedItems);
        }
        SafeVideoTile safeVideoTile = this.playingItem;
        if (safeVideoTile != null && !safeVideoTile.getIsAtLeastHalfVisible()) {
            stopPlayingItemWithGallerySwipe(true);
        }
        if (this.playingItem == null) {
            runAfterDelay("playVideoTaskKey", new VideoTileDelegate$checkGalleriesVisibility$1(this));
        }
    }

    private final void checkHorizontalBoundsOfItem(SafeVideoTile safeVideoTile, int[] galleryItemPositionOnScreen, IntRange composerRvHorizontalBoundaries, List<SafeVideoTile> changedItems, boolean isInVerticalBoundaries) {
        Integer E11;
        VideoTileHolder videoTileHolder = safeVideoTile.getVideoTileHolder();
        if (videoTileHolder == null || composerRvHorizontalBoundaries == null || (E11 = C7705l.E(galleryItemPositionOnScreen)) == null) {
            return;
        }
        boolean z11 = composerRvHorizontalBoundaries.n((((videoTileHolder.getGalleryItemView().getWidth() - videoTileHolder.getGalleryItemView().getPaddingLeft()) - videoTileHolder.getGalleryItemView().getPaddingRight()) / 2) + E11.intValue()) && isInVerticalBoundaries;
        if (safeVideoTile.getIsAtLeastHalfVisible() && !z11) {
            safeVideoTile.setAtLeastHalfVisible(false);
            changedItems.add(safeVideoTile);
        } else {
            if (safeVideoTile.getIsAtLeastHalfVisible() || !z11) {
                return;
            }
            safeVideoTile.setAtLeastHalfVisible(true);
            changedItems.add(safeVideoTile);
        }
    }

    private final void clearDisposableTasks() {
        Map<String, InterfaceC8487b> map = this.disposableTasks;
        Iterator<T> it = map.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC8487b) it.next()).dispose();
        }
        map.clear();
    }

    private final List<SafeVideoTile> findChangedItems() {
        View galleryItemView;
        View composerView;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, SafeVideoTile>> it = this.videoQueue.entrySet().iterator();
        RecyclerView recyclerView = null;
        IntRange intRange = null;
        while (it.hasNext()) {
            SafeVideoTile value = it.next().getValue();
            VideoTileHolder videoTileHolder = value.getVideoTileHolder();
            if (videoTileHolder != null) {
                boolean isHorizontalItem = videoTileHolder.getIsHorizontalItem();
                boolean isInVerticalBoundaries = isInVerticalBoundaries(value.getVideoTileHolder());
                if (isHorizontalItem) {
                    if (recyclerView == null && ((composerView = getComposerView()) == null || (recyclerView = ComposerViewExtensionKt.composerRecyclerViewOrNull(composerView)) == null)) {
                        return null;
                    }
                    RecyclerView recyclerView2 = recyclerView;
                    if (intRange == null) {
                        intRange = getHorizontalBoundaries(recyclerView2);
                    }
                    IntRange intRange2 = intRange;
                    VideoTileHolder videoTileHolder2 = value.getVideoTileHolder();
                    if (videoTileHolder2 != null && (galleryItemView = videoTileHolder2.getGalleryItemView()) != null) {
                        galleryItemView.getLocationOnScreen(this.positionOnScreen);
                        checkHorizontalBoundsOfItem(value, this.positionOnScreen, intRange2, arrayList, isInVerticalBoundaries);
                    }
                    intRange = intRange2;
                    recyclerView = recyclerView2;
                } else if (value.getIsAtLeastHalfVisible() && !isInVerticalBoundaries) {
                    value.setAtLeastHalfVisible(false);
                    arrayList.add(value);
                } else if (!value.getIsAtLeastHalfVisible() && isInVerticalBoundaries) {
                    value.setAtLeastHalfVisible(true);
                    arrayList.add(value);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SafeVideoTile findInVideoQueue(RecyclerView.C c11) {
        VideoTileHolder videoTileHolder = c11 instanceof VideoTileHolder ? (VideoTileHolder) c11 : null;
        if (videoTileHolder != null) {
            return this.videoQueue.get(Long.valueOf(getFullPosition(videoTileHolder)));
        }
        return null;
    }

    private final View getComposerView() {
        SafeVideoTile value;
        VideoTileHolder videoTileHolder;
        ComposerReferences composerReferences;
        C4911f container;
        ComponentCallbacksC5392m c11;
        Map.Entry<Long, SafeVideoTile> firstEntry = this.videoQueue.firstEntry();
        if (firstEntry == null || (value = firstEntry.getValue()) == null || (videoTileHolder = value.getVideoTileHolder()) == null || (composerReferences = videoTileHolder.getComposerReferences()) == null || (container = composerReferences.getContainer()) == null || (c11 = container.c()) == null) {
            return null;
        }
        return c11.getView();
    }

    private final boolean getEarlierItem(SafeVideoTile playingItem, SafeVideoTile pendingItem) {
        if (pendingItem.getWidgetHolderPosition() < (playingItem != null ? playingItem.getWidgetHolderPosition() : -1)) {
            return true;
        }
        if (pendingItem.getWidgetHolderPosition() > (playingItem != null ? playingItem.getWidgetHolderPosition() : -1)) {
            return false;
        }
        if (pendingItem.getWidgetHolderPosition() == (playingItem != null ? playingItem.getWidgetHolderPosition() : -1)) {
            if (pendingItem.getVideoPositionInGallery() < (playingItem != null ? playingItem.getVideoPositionInGallery() : -1)) {
                return true;
            }
        }
        return false;
    }

    private final long getFullPosition(VideoTileHolder videoTileHolder) {
        return (videoTileHolder.getWidgetHolderPosition() << 32) | (videoTileHolder.getPositionInGallery() & 4294967295L);
    }

    private final IntRange getHorizontalBoundaries(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        return new IntRange(i11, view.getWidth() + i11, 1);
    }

    private final void handleChangedItems(List<SafeVideoTile> list) {
        for (SafeVideoTile safeVideoTile : list) {
            boolean earlierItem = getEarlierItem(this.playingItem, safeVideoTile);
            VideoTileHolder videoTileHolder = safeVideoTile.getVideoTileHolder();
            SafeVideoTile safeVideoTile2 = this.playingItem;
            boolean d11 = Intrinsics.d(videoTileHolder, safeVideoTile2 != null ? safeVideoTile2.getVideoTileHolder() : null);
            if ((earlierItem && safeVideoTile.getIsAtLeastHalfVisible()) || (d11 && !safeVideoTile.getIsAtLeastHalfVisible())) {
                stopPlayingItemWithGallerySwipe(true);
            }
        }
    }

    private final boolean isInVerticalBoundaries(VideoTileHolder videoTileHolder) {
        l overlapContainersPositionInfo;
        return (videoTileHolder == null || (overlapContainersPositionInfo = videoTileHolder.getOverlapContainersPositionInfo()) == null || o.b(overlapContainersPositionInfo, videoTileHolder.getGalleryItemView(), this.viewVisibleRect, false) < 0.5f) ? false : true;
    }

    private final void onReplay() {
        BasePlayerPositionController positionController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (positionController = singleInstancePlayerController.positionController()) == null) {
            return;
        }
        positionController.seekToStartAndReplay();
    }

    private final void onVideoFinish() {
        stopPlayingItemWithGallerySwipe(true);
        if (this.widgetsScrollStateListener.getIsScrolling()) {
            releasePlayer();
        } else {
            runAfterDelay("playVideoTaskKey", new VideoTileDelegate$onVideoFinish$1(this));
        }
    }

    public static /* synthetic */ void onVideoTileOutOfVisibleBounds$default(VideoTileDelegate videoTileDelegate, VideoTileHolder videoTileHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        videoTileDelegate.onVideoTileOutOfVisibleBounds(videoTileHolder, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playNextVideo() {
        for (Map.Entry<Long, SafeVideoTile> entry : this.videoQueue.entrySet()) {
            if (entry.getValue().isAlive()) {
                SafeVideoTile value = entry.getValue();
                if (!value.getIsPlayed() && value.getIsAtLeastHalfVisible()) {
                    playVideoOn(entry.getValue());
                    return;
                }
            } else {
                this.videoQueue.remove(entry.getKey());
            }
        }
        releasePlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playVideoOn(SafeVideoTile safeVideoTile) {
        VideoTileItem videoItem;
        String videoUrl;
        VideoTileHolder videoTileHolder = safeVideoTile.getVideoTileHolder();
        if (videoTileHolder == null || (videoItem = videoTileHolder.getVideoItem()) == null || (videoUrl = videoItem.getVideoUrl()) == null) {
            return;
        }
        safeVideoTile.setPlayed(true);
        this.playingItem = safeVideoTile;
        if (this.playerController == null) {
            this.playerController = VideoController.DefaultImpls.getSingleInstancePlayerController$default(this.videoController, null, 1, null);
        }
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null) {
            videoTileHolder.onVideoStart();
            BasePlayerViewController.DefaultImpls.bindPlayerView$default(singleInstancePlayerController.playerViewController(), videoTileHolder.getPlayerView(), null, 2, null);
            singleInstancePlayerController.mediaPlayController().prepareMediaToPlay(videoUrl, this.videoController.getProgressiveExoManager(), true, false, true, this.playerListener, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$8$lambda$1(VideoTileDelegate videoTileDelegate) {
        VideoTileHolder videoTileHolder;
        VideoTileHolder videoTileHolder2;
        SafeVideoTile safeVideoTile;
        SingleInstancePlayerController singleInstancePlayerController;
        SingleInstanceMediaPlayController mediaPlayController;
        SafeVideoTile safeVideoTile2 = videoTileDelegate.playingItem;
        if (safeVideoTile2 != null && safeVideoTile2.getIsSwiping() && (singleInstancePlayerController = videoTileDelegate.playerController) != null && (mediaPlayController = singleInstancePlayerController.mediaPlayController()) != null) {
            mediaPlayController.pause();
        }
        SafeVideoTile safeVideoTile3 = videoTileDelegate.playingItem;
        if (safeVideoTile3 == null || (videoTileHolder = safeVideoTile3.getVideoTileHolder()) == null) {
            return;
        }
        videoTileHolder.hidePreview();
        SafeVideoTile safeVideoTile4 = videoTileDelegate.playingItem;
        if (safeVideoTile4 == null || (videoTileHolder2 = safeVideoTile4.getVideoTileHolder()) == null || !videoTileHolder2.getShouldReplay() || (safeVideoTile = videoTileDelegate.playingItem) == null || !safeVideoTile.getRunAtLeastOnce()) {
            SafeVideoTile safeVideoTile5 = videoTileDelegate.playingItem;
            if (safeVideoTile5 != null) {
                safeVideoTile5.setRunAtLeastOnce(true);
            }
            VideoTileDelegate$playerListener$1$1$1$1 videoTileDelegate$playerListener$1$1$1$1 = new E() { // from class: ru.ozon.app.android.videocover.VideoTileDelegate$playerListener$1$1$1$1
                @Override // kotlin.jvm.internal.E, kotlin.reflect.o
                public Object get(Object obj) {
                    return ((VideoTileItem) obj).getStartedTokenizedEvent();
                }
            };
            SafeVideoTile safeVideoTile6 = videoTileDelegate.playingItem;
            videoTileDelegate.trackWithCustom(videoTileHolder, videoTileDelegate$playerListener$1$1$1$1, "autoPlay", Boolean.valueOf(true ^ (safeVideoTile6 != null ? safeVideoTile6.getIsManualStarted() : false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$8$lambda$4(VideoTileDelegate videoTileDelegate, String str, Exception exc, Boolean bool) {
        VideoTileItem videoItem;
        t interruptedTokenizedEvent;
        VideoTileHolder videoTileHolder;
        ComposerReferences composerReferences;
        WZ.l tokenizedAnalytics;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        SafeVideoTile safeVideoTile = videoTileDelegate.playingItem;
        if (safeVideoTile != null) {
            safeVideoTile.setVideoStoppedTracked(true);
            VideoTileHolder videoTileHolder2 = safeVideoTile.getVideoTileHolder();
            if (videoTileHolder2 != null && (videoItem = videoTileHolder2.getVideoItem()) != null && (interruptedTokenizedEvent = videoItem.getInterruptedTokenizedEvent()) != null && (videoTileHolder = safeVideoTile.getVideoTileHolder()) != null && (composerReferences = videoTileHolder.getComposerReferences()) != null && (tokenizedAnalytics = composerReferences.getTokenizedAnalytics()) != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(tokenizedAnalytics, interruptedTokenizedEvent, null, 2, null);
            }
        }
        videoTileDelegate.onVideoFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$8$lambda$7(VideoTileDelegate videoTileDelegate) {
        VideoTileItem videoItem;
        t finishedTokenizedEvent;
        VideoTileHolder videoTileHolder;
        ComposerReferences composerReferences;
        WZ.l tokenizedAnalytics;
        VideoTileHolder videoTileHolder2;
        SafeVideoTile safeVideoTile = videoTileDelegate.playingItem;
        if (safeVideoTile != null && (videoTileHolder2 = safeVideoTile.getVideoTileHolder()) != null && videoTileHolder2.getShouldReplay()) {
            videoTileDelegate.onReplay();
            return;
        }
        SafeVideoTile safeVideoTile2 = videoTileDelegate.playingItem;
        if (safeVideoTile2 != null) {
            safeVideoTile2.setVideoStoppedTracked(true);
            VideoTileHolder videoTileHolder3 = safeVideoTile2.getVideoTileHolder();
            if (videoTileHolder3 != null && (videoItem = videoTileHolder3.getVideoItem()) != null && (finishedTokenizedEvent = videoItem.getFinishedTokenizedEvent()) != null && (videoTileHolder = safeVideoTile2.getVideoTileHolder()) != null && (composerReferences = videoTileHolder.getComposerReferences()) != null && (tokenizedAnalytics = composerReferences.getTokenizedAnalytics()) != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(tokenizedAnalytics, finishedTokenizedEvent, null, 2, null);
            }
        }
        videoTileDelegate.onVideoFinish();
    }

    private final void releasePlayer() {
        SingleInstanceMediaPlayController mediaPlayController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (mediaPlayController = singleInstancePlayerController.mediaPlayController()) != null) {
            mediaPlayController.release(VideoTileDelegate$releasePlayer$1.INSTANCE);
        }
        this.playerController = null;
    }

    private final void runAfterDelay(final String taskKey, final Function0<Unit> block) {
        InterfaceC8487b remove = this.disposableTasks.remove(taskKey);
        if (remove != null) {
            remove.dispose();
        }
        Map<String, InterfaceC8487b> map = this.disposableTasks;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x a11 = Mc.a.a();
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(a11, "scheduler is null");
        map.put(taskKey, new C10299d(new vc.l(new q(150L, timeUnit, a11), C8125a.a()).d(new InterfaceC9019a() { // from class: BY.e
            @Override // qc.InterfaceC9019a
            public final void run() {
                Function0.this.invoke();
            }
        }), new InterfaceC9019a() { // from class: BY.f
            @Override // qc.InterfaceC9019a
            public final void run() {
                VideoTileDelegate.runAfterDelay$lambda$22(VideoTileDelegate.this, taskKey);
            }
        }).i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runAfterDelay$lambda$22(VideoTileDelegate videoTileDelegate, String str) {
        videoTileDelegate.disposableTasks.remove(str);
    }

    private final void stopPlayingItemWithGallerySwipe(boolean isSmooth) {
        VideoTileHolder videoTileHolder;
        SafeVideoTile safeVideoTile = this.playingItem;
        stopWithPlayerReset();
        if (safeVideoTile == null || (videoTileHolder = safeVideoTile.getVideoTileHolder()) == null) {
            return;
        }
        videoTileHolder.swipeGalleryToFirstImage(isSmooth);
    }

    private final void stopWithPlayerReset() {
        VideoTileHolder videoTileHolder;
        SingleInstanceMediaPlayController mediaPlayController;
        trackVideoInterruptedEvent();
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (mediaPlayController = singleInstancePlayerController.mediaPlayController()) != null) {
            mediaPlayController.pause();
        }
        SafeVideoTile safeVideoTile = this.playingItem;
        if (safeVideoTile != null && (videoTileHolder = safeVideoTile.getVideoTileHolder()) != null) {
            videoTileHolder.onVideoStop();
            videoTileHolder.showPreview();
            videoTileHolder.getPlayerView().B(null);
        }
        this.playingItem = null;
    }

    private final void trackVideoInterruptedEvent() {
        String str;
        VideoTileHolder videoTileHolder;
        SafeVideoTile safeVideoTile = this.playingItem;
        if (safeVideoTile == null || !safeVideoTile.getIsVideoStoppedTracked()) {
            SafeVideoTile safeVideoTile2 = this.playingItem;
            if (safeVideoTile2 == null || !safeVideoTile2.getIsPaused()) {
                SafeVideoTile safeVideoTile3 = this.playingItem;
                if (safeVideoTile3 == null || !safeVideoTile3.getIsPlayed()) {
                    return;
                } else {
                    str = null;
                }
            } else {
                str = "onSwipe";
            }
            SafeVideoTile safeVideoTile4 = this.playingItem;
            if (safeVideoTile4 == null || (videoTileHolder = safeVideoTile4.getVideoTileHolder()) == null) {
                return;
            }
            trackWithCustom(videoTileHolder, new E() { // from class: ru.ozon.app.android.videocover.VideoTileDelegate$trackVideoInterruptedEvent$1$1
                @Override // kotlin.jvm.internal.E, kotlin.reflect.o
                public Object get(Object obj) {
                    return ((VideoTileItem) obj).getInterruptedTokenizedEvent();
                }
            }, str != null ? "reason" : null, str);
        }
    }

    private final void trackWithCustom(VideoTileHolder videoTileHolder, Function1<? super VideoTileItem, t> function1, String str, Object obj) {
        t invoke;
        WZ.l tokenizedAnalytics;
        VideoTileItem videoItem = videoTileHolder.getVideoItem();
        if (videoItem == null || (invoke = function1.invoke(videoItem)) == null) {
            return;
        }
        final Map i11 = (str == null || obj == null) ? null : U.i(new Pair(str, obj));
        ComposerReferences composerReferences = videoTileHolder.getComposerReferences();
        if (composerReferences == null || (tokenizedAnalytics = composerReferences.getTokenizedAnalytics()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents(tokenizedAnalytics, invoke, new e() { // from class: BY.d
            @Override // WZ.e
            public final WZ.g modifyParams(UZ.a aVar, WZ.g gVar) {
                WZ.g trackWithCustom$lambda$17;
                trackWithCustom$lambda$17 = VideoTileDelegate.trackWithCustom$lambda$17(i11, (UZ.d) aVar, gVar);
                return trackWithCustom$lambda$17;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g trackWithCustom$lambda$17(Map map, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    @NotNull
    public final ContinuousScrollStateListener getWidgetsScrollStateListener() {
        return this.widgetsScrollStateListener;
    }

    public final void onGalleryItemSwipeEnd(RecyclerView.C viewHolder) {
        SafeVideoTile safeVideoTile;
        SingleInstancePlayerController singleInstancePlayerController;
        SingleInstanceMediaPlayController mediaPlayController;
        SingleInstanceMediaPlayController mediaPlayController2;
        if (viewHolder == null || (safeVideoTile = findInVideoQueue(viewHolder)) == null) {
            safeVideoTile = null;
        } else {
            safeVideoTile.setSwiping(false);
        }
        if (viewHolder != null) {
            if (!Intrinsics.d(safeVideoTile, this.playingItem) || (singleInstancePlayerController = this.playerController) == null || (mediaPlayController = singleInstancePlayerController.mediaPlayController()) == null || !mediaPlayController.isReadyToPlayAndPaused()) {
                if (safeVideoTile == null || Intrinsics.d(this.playingItem, safeVideoTile)) {
                    return;
                }
                safeVideoTile.setManualStarted(true);
                stopPlayingItemWithGallerySwipe(true);
                runAfterDelay("playVideoTaskKey", new VideoTileDelegate$onGalleryItemSwipeEnd$1(this, safeVideoTile));
                return;
            }
            SafeVideoTile safeVideoTile2 = this.playingItem;
            if (safeVideoTile2 != null) {
                safeVideoTile2.setPaused(false);
            }
            SingleInstancePlayerController singleInstancePlayerController2 = this.playerController;
            if (singleInstancePlayerController2 == null || (mediaPlayController2 = singleInstancePlayerController2.mediaPlayController()) == null) {
                return;
            }
            mediaPlayController2.resume();
        }
    }

    public final void onGalleryItemSwipeStart(RecyclerView.C viewHolder) {
        SingleInstancePlayerController singleInstancePlayerController;
        SingleInstanceMediaPlayController mediaPlayController;
        SingleInstanceMediaPlayController mediaPlayController2;
        SafeVideoTile findInVideoQueue;
        if (viewHolder != null && (findInVideoQueue = findInVideoQueue(viewHolder)) != null) {
            findInVideoQueue.setSwiping(true);
        }
        SafeVideoTile safeVideoTile = this.playingItem;
        if (!Intrinsics.d(viewHolder, safeVideoTile != null ? safeVideoTile.getVideoTileHolder() : null) || (singleInstancePlayerController = this.playerController) == null || (mediaPlayController = singleInstancePlayerController.mediaPlayController()) == null || !mediaPlayController.isPlaying()) {
            return;
        }
        SafeVideoTile safeVideoTile2 = this.playingItem;
        if (safeVideoTile2 != null) {
            safeVideoTile2.setPaused(true);
        }
        SingleInstancePlayerController singleInstancePlayerController2 = this.playerController;
        if (singleInstancePlayerController2 == null || (mediaPlayController2 = singleInstancePlayerController2.mediaPlayController()) == null) {
            return;
        }
        mediaPlayController2.pause();
    }

    public final void onVideoTileClicked(@NotNull List<? extends Object> items) {
        Object obj;
        Object obj2;
        VideoTileHolder videoTileHolder;
        Intrinsics.checkNotNullParameter(items, "items");
        Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof VideoTileItem) {
                    break;
                }
            }
        }
        VideoTileItem videoTileItem = obj instanceof VideoTileItem ? (VideoTileItem) obj : null;
        if (videoTileItem == null) {
            return;
        }
        Collection<SafeVideoTile> values = this.videoQueue.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it2 = values.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            VideoTileHolder videoTileHolder2 = ((SafeVideoTile) obj2).getVideoTileHolder();
            if (Intrinsics.d(videoTileHolder2 != null ? videoTileHolder2.getVideoItem() : null, videoTileItem)) {
                break;
            }
        }
        SafeVideoTile safeVideoTile = (SafeVideoTile) obj2;
        if (safeVideoTile == null || (videoTileHolder = safeVideoTile.getVideoTileHolder()) == null) {
            return;
        }
        clearDisposableTasks();
        SafeVideoTile safeVideoTile2 = this.playingItem;
        if (Intrinsics.d(safeVideoTile2 != null ? safeVideoTile2.getVideoTileHolder() : null, videoTileHolder)) {
            SafeVideoTile safeVideoTile3 = this.playingItem;
            if (safeVideoTile3 != null) {
                safeVideoTile3.setVideoStoppedTracked(true);
            }
            trackWithCustom(videoTileHolder, new E() { // from class: ru.ozon.app.android.videocover.VideoTileDelegate$onVideoTileClicked$1
                @Override // kotlin.jvm.internal.E, kotlin.reflect.o
                public Object get(Object obj3) {
                    return ((VideoTileItem) obj3).getInterruptedTokenizedEvent();
                }
            }, "reason", "onClick");
        }
        stopPlayingItemWithGallerySwipe(false);
        releasePlayer();
    }

    public final void onVideoTileInVisibleBounds(@NotNull VideoTileHolder videoTileHolder) {
        Intrinsics.checkNotNullParameter(videoTileHolder, "videoTileHolder");
        VideoTileItem videoItem = videoTileHolder.getVideoItem();
        if (!(videoItem != null ? videoItem.getShouldShowBlurredPreview() : false)) {
            this.videoQueue.put(Long.valueOf(getFullPosition(videoTileHolder)), new SafeVideoTile(videoTileHolder));
        }
        if (this.disposableTasks.get("checkVisibilityTaskKey") == null) {
            runAfterDelay("checkVisibilityTaskKey", new VideoTileDelegate$onVideoTileInVisibleBounds$1(this));
        }
        if (this.disposableTasks.get("scrollStateListenerTaskKey") == null) {
            this.disposableTasks.put("scrollStateListenerTaskKey", this.widgetsScrollStateListener.getScrollingState().observeOn(C8125a.a()).subscribe(new i(new VideoTileDelegate$onVideoTileInVisibleBounds$2(this), 0)));
        }
    }

    public final void onVideoTileOutOfVisibleBounds(@NotNull VideoTileHolder videoTileHolder, boolean shouldNeedRunNewTask) {
        Intrinsics.checkNotNullParameter(videoTileHolder, "videoTileHolder");
        this.videoQueue.remove(Long.valueOf(getFullPosition(videoTileHolder)));
        if (this.videoQueue.isEmpty()) {
            clearDisposableTasks();
            stopWithPlayerReset();
            releasePlayer();
            return;
        }
        SafeVideoTile safeVideoTile = this.playingItem;
        if (Intrinsics.d(videoTileHolder, safeVideoTile != null ? safeVideoTile.getVideoTileHolder() : null)) {
            stopWithPlayerReset();
            if (this.widgetsScrollStateListener.getIsScrolling() || !shouldNeedRunNewTask) {
                releasePlayer();
            } else {
                runAfterDelay("playVideoTaskKey", new VideoTileDelegate$onVideoTileOutOfVisibleBounds$1(this));
            }
        }
    }

    public final void onWidgetHolderScrolledInVisibleBounds(@NotNull VideoTileWidgetHolder videoTileWidgetHolder) {
        p<Boolean> subscribeOnHorizontalScroll;
        p<Boolean> observeOn;
        Intrinsics.checkNotNullParameter(videoTileWidgetHolder, "videoTileWidgetHolder");
        HorizontalScrollDelegate horizontalDelegate = videoTileWidgetHolder.getHorizontalDelegate();
        if (horizontalDelegate != null) {
            HorizontalScrollDelegate horizontalDelegate2 = videoTileWidgetHolder.getHorizontalDelegate();
            horizontalDelegate.setDisposable((horizontalDelegate2 == null || (subscribeOnHorizontalScroll = horizontalDelegate2.subscribeOnHorizontalScroll()) == null || (observeOn = subscribeOnHorizontalScroll.observeOn(C8125a.a())) == null) ? null : observeOn.subscribe(new BY.g(new VideoTileDelegate$onWidgetHolderScrolledInVisibleBounds$1(this), 0), new h(new VideoTileDelegate$onWidgetHolderScrolledInVisibleBounds$2(Lm0.a.f17149a), 0)));
        }
    }

    public final void onWidgetHolderScrolledOutOfVisibleBounds(@NotNull VideoTileWidgetHolder videoTileWidgetHolder) {
        VideoTileHolder videoTileHolder;
        SafeVideoTile safeVideoTile;
        Intrinsics.checkNotNullParameter(videoTileWidgetHolder, "videoTileWidgetHolder");
        SafeVideoTile safeVideoTile2 = this.playingItem;
        if (safeVideoTile2 != null && (videoTileHolder = safeVideoTile2.getVideoTileHolder()) != null && videoTileHolder.getWidgetHolderPosition() == videoTileWidgetHolder.getPosition() && (safeVideoTile = this.playingItem) != null) {
            safeVideoTile.setVideoStoppedTracked(true);
            VideoTileHolder videoTileHolder2 = safeVideoTile.getVideoTileHolder();
            if (videoTileHolder2 != null) {
                trackWithCustom(videoTileHolder2, new E() { // from class: ru.ozon.app.android.videocover.VideoTileDelegate$onWidgetHolderScrolledOutOfVisibleBounds$1$1
                    @Override // kotlin.jvm.internal.E, kotlin.reflect.o
                    public Object get(Object obj) {
                        return ((VideoTileItem) obj).getInterruptedTokenizedEvent();
                    }
                }, "reason", "onPageScroll");
            }
        }
        videoTileWidgetHolder.swipeGalleryToFirstVideo();
        HorizontalScrollDelegate horizontalDelegate = videoTileWidgetHolder.getHorizontalDelegate();
        if (horizontalDelegate != null) {
            horizontalDelegate.dispose();
        }
    }
}
