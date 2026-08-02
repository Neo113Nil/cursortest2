package ru.ozon.app.android.storefront.stories.story.presentation.media;

import Mc.a;
import Sc.o;
import android.graphics.Bitmap;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.stories.story.cache.StoryImageMemoryCache;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryViewModel;
import ru.ozon.app.android.storefront.stories.story.presentation.NavigationType;
import ru.ozon.app.android.storefront.stories.story.presentation.PlaybackType;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemEvent;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u00122\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020+048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000209048\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<048\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?048\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u00108R\u0011\u0010,\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/media/StoryMediaViewModel;", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;", "imageMemoryCache", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "<init>", "(Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;Lru/ozon/app/android/video/player/soundservice/SoundController;)V", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$AreaType;", "areaType", "", "onClickUp", "(Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$AreaType;)V", "", "itemIndex", "onImageLoadSuccessful", "(I)V", "", "errorMsg", "onLoadFailed", "(ILjava/lang/String;)V", "onBuffer", "onTimeLineAnimationComplete", "()V", "startStory", "restartStory", "pauseStory", "onCleared", "width", "height", "putOverrideParams", "(II)V", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getOverrideParams", "()Lru/ozon/app/android/pikazon/image/ImageSize;", ImagesContract.URL, "Landroid/graphics/Bitmap;", "getBitmapFromCache", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "putStoryImageInCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", "isSoundMuted", "onSoundStateChanged", "(Z)V", "Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lnc/b;", "disposable", "Lnc/b;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "soundMutedState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSoundMutedState", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/storefront/stories/story/presentation/NavigationType;", "storyNavigationEvent", "getStoryNavigationEvent", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemEvent;", "storyStateEvent", "getStoryStateEvent", "Lru/ozon/app/android/storefront/stories/story/presentation/PlaybackType;", "storyPlaybackEvent", "getStoryPlaybackEvent", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryMediaViewModel extends w0 implements BaseStoryViewModel {
    private InterfaceC8487b disposable;

    @NotNull
    private final StoryImageMemoryCache imageMemoryCache;

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final SingleLiveEvent<Boolean> soundMutedState;

    @NotNull
    private final SingleLiveEvent<NavigationType> storyNavigationEvent;

    @NotNull
    private final SingleLiveEvent<PlaybackType> storyPlaybackEvent;

    @NotNull
    private final SingleLiveEvent<StoryItemEvent> storyStateEvent;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isSoundMuted", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaViewModel$1, reason: invalid class name */
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
            StoryMediaViewModel.this.getSoundMutedState().postValue(bool);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryItemClickableLayout.AreaType.values().length];
            try {
                iArr[StoryItemClickableLayout.AreaType.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryItemClickableLayout.AreaType.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryItemClickableLayout.AreaType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoryMediaViewModel(@NotNull StoryImageMemoryCache imageMemoryCache, @NotNull SoundController soundController) {
        Intrinsics.checkNotNullParameter(imageMemoryCache, "imageMemoryCache");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        this.imageMemoryCache = imageMemoryCache;
        this.soundController = soundController;
        this.soundMutedState = new SingleLiveEvent<>();
        this.storyNavigationEvent = new SingleLiveEvent<>();
        this.storyStateEvent = new SingleLiveEvent<>();
        this.storyPlaybackEvent = new SingleLiveEvent<>();
        this.disposable = soundController.getSoundMutedState().subscribeOn(a.b()).subscribe(new IJ.a(new AnonymousClass1(), 11));
    }

    public final Bitmap getBitmapFromCache(String url) {
        return this.imageMemoryCache.getBitmapFromCache(url);
    }

    public final ImageSize getOverrideParams() {
        return this.imageMemoryCache.getImageSize();
    }

    @NotNull
    public final SingleLiveEvent<Boolean> getSoundMutedState() {
        return this.soundMutedState;
    }

    @NotNull
    public final SingleLiveEvent<NavigationType> getStoryNavigationEvent() {
        return this.storyNavigationEvent;
    }

    @NotNull
    public final SingleLiveEvent<PlaybackType> getStoryPlaybackEvent() {
        return this.storyPlaybackEvent;
    }

    @NotNull
    public final SingleLiveEvent<StoryItemEvent> getStoryStateEvent() {
        return this.storyStateEvent;
    }

    public final boolean isSoundMuted() {
        return this.soundController.isMuted();
    }

    public void onBuffer(int itemIndex) {
        this.storyStateEvent.setValue(new StoryItemEvent.Buffering(itemIndex));
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

    public void onClickUp(@NotNull StoryItemClickableLayout.AreaType areaType) {
        NavigationType navigationType;
        Intrinsics.checkNotNullParameter(areaType, "areaType");
        SingleLiveEvent<NavigationType> singleLiveEvent = this.storyNavigationEvent;
        int i11 = WhenMappings.$EnumSwitchMapping$0[areaType.ordinal()];
        if (i11 == 1) {
            navigationType = NavigationType.PREV;
        } else if (i11 == 2) {
            navigationType = NavigationType.NEXT;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            navigationType = NavigationType.NEXT;
        }
        singleLiveEvent.setValue(navigationType);
    }

    public void onImageLoadSuccessful(int itemIndex) {
        this.storyStateEvent.setValue(new StoryItemEvent.ItemLoaded(itemIndex));
    }

    public void onLoadFailed(int itemIndex, @NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.storyStateEvent.setValue(new StoryItemEvent.Error(itemIndex, errorMsg));
    }

    public final void onSoundStateChanged(boolean isSoundMuted) {
        this.soundController.setSoundMutedState(isSoundMuted);
    }

    public void onTimeLineAnimationComplete() {
        this.storyNavigationEvent.setValue(NavigationType.NEXT);
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryViewModel
    public void pauseStory() {
        this.storyPlaybackEvent.setValue(PlaybackType.PAUSE);
    }

    public final void putOverrideParams(int width, int height) {
        this.imageMemoryCache.putOverrideParams(width, height);
    }

    public final void putStoryImageInCache(String url, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.imageMemoryCache.putMemCache(url, bitmap);
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryViewModel
    public void restartStory() {
        this.storyPlaybackEvent.setValue(PlaybackType.REPLAY);
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryViewModel
    public void startStory() {
        this.storyPlaybackEvent.setValue(PlaybackType.PLAY);
    }
}
