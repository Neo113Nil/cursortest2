package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import DM.e;
import Mc.a;
import Sc.o;
import android.graphics.Bitmap;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Item;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3ItemAsset;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Media;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Type;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3WithImage;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.BaseStoryV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.PlaybackType;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.StoryItemEvent;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.Event;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.views.StoryItemClickableLayoutV3;
import ru.ozon.app.android.storefront.stories.story.cache.StoryImageMemoryCache;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J#\u0010)\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u0004\u0018\u0001032\b\u00102\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u00112\u0006\u00106\u001a\u000203H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010\u0010J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000bH\u0014¢\u0006\u0004\b>\u0010\u0010J\u000f\u0010?\u001a\u00020\u000bH\u0002¢\u0006\u0004\b?\u0010\u0010J\u000f\u0010@\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010C\u001a\u0004\u0018\u00010%8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b&\u0010D\u001a\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010M\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u00168B@BX\u0082\u000e¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010SR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020:0T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0T8\u0006¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0T8\u0006¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010XR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020_0T8\u0006¢\u0006\f\n\u0004\b`\u0010V\u001a\u0004\ba\u0010XR\u0014\u0010;\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010b¨\u0006c"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/StoryV3MediaViewModel;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/BaseStoryV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;", "imageMemoryCache", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "<init>", "(Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;Lru/ozon/app/android/video/player/soundservice/SoundController;)V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/views/StoryItemClickableLayoutV3$AreaType;", "areaType", "", "onClickUp", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/views/StoryItemClickableLayoutV3$AreaType;)V", "onContainerClicked", "onImageLoadSuccessful", "()V", "", "errorMsg", "onLoadFailed", "(Ljava/lang/String;)V", "onTimeLineAnimationComplete", "", "getStorySize", "()Ljava/lang/Integer;", "preloadNextAsset", "startStory", "restartStory", "resetStory", "pauseStory", "closeStory", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "getCurrentItem", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "index", "getItem", "(I)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "story", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Media;", "storyItem", "setup", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Media;)V", "width", "height", "putOverrideParams", "(II)V", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getOverrideParams", "()Lru/ozon/app/android/pikazon/image/ImageSize;", ImagesContract.URL, "Landroid/graphics/Bitmap;", "getBitmapFromCache", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "putStoryImageInCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onBuffer", "", "isSoundMuted", "onSoundStateChanged", "(Z)V", "onCleared", "onNext", "onPrevious", "Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "getStory", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "currentItemIndex", "I", "getCurrentItemIndex", "()I", "setCurrentItemIndex", "(I)V", "storyPosition", "getStoryPosition", "setStoryPosition", "Lnc/b;", "disposable", "Lnc/b;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Media;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "soundMutedState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSoundMutedState", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent;", "storyStateEvent", "getStoryStateEvent", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/PlaybackType;", "storyPlaybackEvent", "getStoryPlaybackEvent", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "storyEvents", "getStoryEvents", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryV3MediaViewModel extends w0 implements BaseStoryV3ViewModel {
    private int currentItemIndex;
    private InterfaceC8487b disposable;

    @NotNull
    private final StoryImageMemoryCache imageMemoryCache;

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final SingleLiveEvent<Boolean> soundMutedState;
    private StoryV3 story;

    @NotNull
    private final SingleLiveEvent<Event> storyEvents;
    private StoryV3Media storyItem;

    @NotNull
    private final SingleLiveEvent<PlaybackType> storyPlaybackEvent;
    private int storyPosition;

    @NotNull
    private final SingleLiveEvent<StoryItemEvent> storyStateEvent;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isSoundMuted", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            StoryV3MediaViewModel.this.getSoundMutedState().postValue(bool);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryItemClickableLayoutV3.AreaType.values().length];
            try {
                iArr[StoryItemClickableLayoutV3.AreaType.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryItemClickableLayoutV3.AreaType.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryItemClickableLayoutV3.AreaType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoryV3MediaViewModel(@NotNull StoryImageMemoryCache imageMemoryCache, @NotNull SoundController soundController) {
        Intrinsics.checkNotNullParameter(imageMemoryCache, "imageMemoryCache");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        this.imageMemoryCache = imageMemoryCache;
        this.soundController = soundController;
        this.soundMutedState = new SingleLiveEvent<>();
        this.storyStateEvent = new SingleLiveEvent<>();
        this.storyPlaybackEvent = new SingleLiveEvent<>();
        this.storyEvents = new SingleLiveEvent<>();
        this.disposable = soundController.getSoundMutedState().subscribeOn(a.b()).subscribe(new e(new AnonymousClass1(), 6));
    }

    private final int getStoryPosition() {
        StoryV3Type data;
        StoryV3 story = getStory();
        if (story == null || (data = story.getData()) == null) {
            return 0;
        }
        return data.getPosition();
    }

    private final void onNext() {
        List<StoryV3Item> items;
        StoryV3Media storyV3Media = this.storyItem;
        if (storyV3Media != null && (items = storyV3Media.getItems()) != null && getCurrentItemIndex() + 1 == items.size()) {
            this.storyEvents.setValue(Event.OnStoryCompleted.INSTANCE);
            return;
        }
        setCurrentItemIndex(getCurrentItemIndex() + 1);
        setStoryPosition(getStoryPosition() + 1);
        StoryV3Item item = getItem(getCurrentItemIndex());
        if (item == null) {
            return;
        }
        this.storyEvents.setValue(new Event.OnNextFrame(item));
    }

    private final void onPrevious() {
        if (getCurrentItemIndex() <= 0) {
            this.storyEvents.setValue(Event.OnPreviousStory.INSTANCE);
            return;
        }
        setCurrentItemIndex(getCurrentItemIndex() - 1);
        setStoryPosition(getStoryPosition() - 1);
        StoryV3Item item = getItem(getCurrentItemIndex());
        if (item == null) {
            return;
        }
        this.storyEvents.setValue(new Event.OnPreviousFrame(item));
    }

    private final void setStoryPosition(int i11) {
        StoryV3Type data;
        StoryV3 story = getStory();
        if (story != null && (data = story.getData()) != null) {
            data.setPosition(i11);
        }
        this.storyPosition = i11;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.BaseStoryV3ViewModel
    public void closeStory() {
        this.storyEvents.setValue(Event.OnCloseStory.INSTANCE);
    }

    public Bitmap getBitmapFromCache(String url) {
        return this.imageMemoryCache.getBitmapFromCache(url);
    }

    public StoryV3Item getCurrentItem() {
        return getItem(getCurrentItemIndex());
    }

    public int getCurrentItemIndex() {
        return this.currentItemIndex;
    }

    public StoryV3Item getItem(int index) {
        List<StoryV3Item> items;
        StoryV3Media storyV3Media = this.storyItem;
        if (storyV3Media == null || (items = storyV3Media.getItems()) == null) {
            return null;
        }
        return (StoryV3Item) C7714v.Q(index, items);
    }

    public ImageSize getOverrideParams() {
        return this.imageMemoryCache.getImageSize();
    }

    @NotNull
    public final SingleLiveEvent<Boolean> getSoundMutedState() {
        return this.soundMutedState;
    }

    public StoryV3 getStory() {
        return this.story;
    }

    @NotNull
    public final SingleLiveEvent<Event> getStoryEvents() {
        return this.storyEvents;
    }

    @NotNull
    public final SingleLiveEvent<PlaybackType> getStoryPlaybackEvent() {
        return this.storyPlaybackEvent;
    }

    public Integer getStorySize() {
        List<StoryV3Item> items;
        StoryV3Media storyV3Media = this.storyItem;
        if (storyV3Media == null || (items = storyV3Media.getItems()) == null) {
            return null;
        }
        return Integer.valueOf(items.size());
    }

    @NotNull
    public final SingleLiveEvent<StoryItemEvent> getStoryStateEvent() {
        return this.storyStateEvent;
    }

    public boolean isSoundMuted() {
        return this.soundController.isMuted();
    }

    public void onBuffer() {
        this.storyStateEvent.setValue(new StoryItemEvent.Buffering(getCurrentItemIndex()));
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.imageMemoryCache.clearCache();
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    public void onClickUp(@NotNull StoryItemClickableLayoutV3.AreaType areaType) {
        Intrinsics.checkNotNullParameter(areaType, "areaType");
        int i11 = WhenMappings.$EnumSwitchMapping$0[areaType.ordinal()];
        if (i11 == 1) {
            onPrevious();
        } else if (i11 == 2) {
            onNext();
        } else if (i11 != 3) {
            throw new o();
        }
    }

    public void onContainerClicked(@NotNull StoryItemClickableLayoutV3.AreaType areaType) {
        Intrinsics.checkNotNullParameter(areaType, "areaType");
        StoryV3Item currentItem = getCurrentItem();
        if (currentItem == null) {
            return;
        }
        if (currentItem.getAction() == null) {
            onClickUp(areaType);
        } else {
            this.storyEvents.setValue(new Event.OnAction(AtomActionMapperKt.toAtomAction(currentItem.getAction(), currentItem.getTrackingInfo())));
        }
    }

    public void onImageLoadSuccessful() {
        this.storyStateEvent.setValue(new StoryItemEvent.ItemLoaded(getCurrentItemIndex()));
    }

    public void onLoadFailed(@NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.storyStateEvent.setValue(new StoryItemEvent.Error(getCurrentItemIndex(), errorMsg));
    }

    public void onSoundStateChanged(boolean isSoundMuted) {
        this.soundController.setSoundMutedState(isSoundMuted);
    }

    public void onTimeLineAnimationComplete() {
        onNext();
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.BaseStoryV3ViewModel
    public void pauseStory() {
        this.storyPlaybackEvent.setValue(PlaybackType.PAUSE);
    }

    public void preloadNextAsset() {
        List<StoryV3Item> items;
        int currentItemIndex = getCurrentItemIndex() + 1;
        StoryV3Media storyV3Media = this.storyItem;
        if (storyV3Media == null || (items = storyV3Media.getItems()) == null || currentItemIndex >= items.size()) {
            return;
        }
        StoryV3Item item = getItem(currentItemIndex);
        StoryV3ItemAsset asset = item != null ? item.getAsset() : null;
        if (!(asset instanceof StoryV3WithImage) || getOverrideParams() == null) {
            return;
        }
        StoryV3WithImage storyV3WithImage = (StoryV3WithImage) asset;
        if (getBitmapFromCache(storyV3WithImage.getImage()) == null) {
            this.storyEvents.setValue(new Event.OnPreloadImage(storyV3WithImage));
        }
    }

    public void putOverrideParams(int width, int height) {
        this.imageMemoryCache.putOverrideParams(width, height);
    }

    public void putStoryImageInCache(String url, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.imageMemoryCache.putMemCache(url, bitmap);
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.BaseStoryV3ViewModel
    public void resetStory() {
        this.storyPlaybackEvent.setValue(PlaybackType.RESET);
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.BaseStoryV3ViewModel
    public void restartStory() {
        this.storyPlaybackEvent.setValue(PlaybackType.REPLAY);
    }

    public void setCurrentItemIndex(int i11) {
        this.currentItemIndex = i11;
    }

    public void setup(StoryV3 story, StoryV3Media storyItem) {
        this.story = story;
        this.storyItem = storyItem;
        setCurrentItemIndex(getStoryPosition());
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.BaseStoryV3ViewModel
    public void startStory() {
        this.storyPlaybackEvent.setValue(PlaybackType.PLAY);
    }
}
