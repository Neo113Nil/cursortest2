package ru.ozon.app.android.storefront.stories.story.presentation.poll;

import Sc.o;
import android.graphics.Bitmap;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.cache.StoryImageMemoryCache;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryViewModel;
import ru.ozon.app.android.storefront.stories.story.presentation.NavigationType;
import ru.ozon.app.android.storefront.stories.story.presentation.PlaybackType;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemEvent;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0$8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0$8\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)¨\u00060"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/poll/StoryPollViewModel;", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;", "imageMemoryCache", "<init>", "(Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;)V", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$AreaType;", "areaType", "", "onClickUp", "(Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$AreaType;)V", "", "itemIndex", "onImageLoadSuccessful", "(I)V", "", "errorMsg", "onLoadFailed", "(ILjava/lang/String;)V", "startStory", "()V", "restartStory", "pauseStory", "width", "height", "putOverrideParams", "(II)V", ImagesContract.URL, "Landroid/graphics/Bitmap;", "getBitmapFromCache", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "putStoryImageInCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Lru/ozon/app/android/storefront/stories/story/cache/StoryImageMemoryCache;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/storefront/stories/story/presentation/NavigationType;", "storyNavigationEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getStoryNavigationEvent", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemEvent;", "storyStateEvent", "getStoryStateEvent", "Lru/ozon/app/android/storefront/stories/story/presentation/PlaybackType;", "storyPlaybackEvent", "getStoryPlaybackEvent", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryPollViewModel extends w0 implements BaseStoryViewModel {

    @NotNull
    private final StoryImageMemoryCache imageMemoryCache;

    @NotNull
    private final SingleLiveEvent<NavigationType> storyNavigationEvent;

    @NotNull
    private final SingleLiveEvent<PlaybackType> storyPlaybackEvent;

    @NotNull
    private final SingleLiveEvent<StoryItemEvent> storyStateEvent;

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

    public StoryPollViewModel(@NotNull StoryImageMemoryCache imageMemoryCache) {
        Intrinsics.checkNotNullParameter(imageMemoryCache, "imageMemoryCache");
        this.imageMemoryCache = imageMemoryCache;
        this.storyNavigationEvent = new SingleLiveEvent<>();
        this.storyStateEvent = new SingleLiveEvent<>();
        this.storyPlaybackEvent = new SingleLiveEvent<>();
    }

    public final Bitmap getBitmapFromCache(String url) {
        return this.imageMemoryCache.getBitmapFromCache(url);
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
