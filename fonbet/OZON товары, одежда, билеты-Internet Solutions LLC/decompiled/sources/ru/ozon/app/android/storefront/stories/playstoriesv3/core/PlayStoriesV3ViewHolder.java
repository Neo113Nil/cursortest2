package ru.ozon.app.android.storefront.stories.playstoriesv3.core;

import androidx.activity.C;
import androidx.fragment.app.G;
import androidx.viewpager2.widget.ViewPager2;
import d20.AbstractC6065b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.PlayStoriesV3VO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Item;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Media;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/core/PlayStoriesV3ViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;", "Ll10/i;", "container", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Ll10/i;Landroidx/viewpager2/widget/ViewPager2;Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;Lru/ozon/app/android/composer/ComposerNavigator;)V", "vo", "", "getSelectedStoryIndex", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;)Ljava/lang/Integer;", "", "setStoryFrame", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;)V", "createBinder", "()V", "onWidgetCreated", "item", "bind", "onWidgetDestroyed", "Ll10/i;", "Landroidx/viewpager2/widget/ViewPager2;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "Lru/ozon/app/android/composer/ComposerNavigator;", "metricView", "getMetricView", "()Landroidx/viewpager2/widget/ViewPager2;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder;", "binder", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesV3ViewHolder extends AbstractC6065b<PlayStoriesV3VO> {
    private DefaultPlayStoriesV3WidgetBinder binder;

    @NotNull
    private final i container;

    @NotNull
    private final ViewPager2 metricView;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final PlayStoriesV3ViewModel viewModel;

    @NotNull
    private final ViewPager2 viewPager;

    public PlayStoriesV3ViewHolder(@NotNull i container, @NotNull ViewPager2 viewPager, @NotNull PlayStoriesV3ViewModel viewModel, @NotNull ComposerNavigator navigator) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.container = container;
        this.viewPager = viewPager;
        this.viewModel = viewModel;
        this.navigator = navigator;
        this.metricView = viewPager;
        createBinder();
    }

    private final void createBinder() {
        if (this.binder != null) {
            return;
        }
        ViewPager2 viewPager2 = this.viewPager;
        G childFragmentManager = this.container.Q().j().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder = new DefaultPlayStoriesV3WidgetBinder(viewPager2, childFragmentManager, this.container.Q().g().getLifecycle(), this.container, this.viewModel, new ShareLinkHandler(this.container), this.navigator, this);
        defaultPlayStoriesV3WidgetBinder.create();
        this.binder = defaultPlayStoriesV3WidgetBinder;
    }

    private final Integer getSelectedStoryIndex(PlayStoriesV3VO vo) {
        Iterator<StoryV3> it = vo.getStories().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            int storyId = it.next().getStoryId();
            Integer pointer = vo.getPointer();
            if (pointer != null && storyId == pointer.intValue()) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    private final void setStoryFrame(PlayStoriesV3VO vo) {
        Object obj;
        List<StoryV3Item> items;
        int intValue;
        Iterator<T> it = vo.getStories().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int storyId = ((StoryV3) obj).getStoryId();
            Integer pointer = vo.getPointer();
            if (pointer != null && storyId == pointer.intValue()) {
                break;
            }
        }
        StoryV3 storyV3 = (StoryV3) obj;
        Object data = storyV3 != null ? storyV3.getData() : null;
        StoryV3Media storyV3Media = data instanceof StoryV3Media ? (StoryV3Media) data : null;
        if (storyV3Media == null || (items = storyV3Media.getItems()) == null) {
            return;
        }
        int size = items.size();
        Integer frame = vo.getFrame();
        if (frame == null || (intValue = frame.intValue()) > size || intValue < 1) {
            return;
        }
        StoryV3Media storyV3Media2 = (StoryV3Media) storyV3.getData();
        if (storyV3Media2.getIsFrameChanged()) {
            return;
        }
        storyV3Media2.setPosition(intValue - 1);
        storyV3Media2.setFrameChanged(true);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.container.Q().i().getOnBackPressedDispatcher().h(this, new C() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.core.PlayStoriesV3ViewHolder$onWidgetCreated$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder;
                ComposerNavigator composerNavigator;
                defaultPlayStoriesV3WidgetBinder = PlayStoriesV3ViewHolder.this.binder;
                if (defaultPlayStoriesV3WidgetBinder != null) {
                    defaultPlayStoriesV3WidgetBinder.trackVideoWatched();
                }
                composerNavigator = PlayStoriesV3ViewHolder.this.navigator;
                composerNavigator.popBackStack();
            }
        });
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder = this.binder;
        if (defaultPlayStoriesV3WidgetBinder != null) {
            defaultPlayStoriesV3WidgetBinder.removeView();
        }
        this.binder = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PlayStoriesV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Integer selectedStoryIndex = getSelectedStoryIndex(item);
        setStoryFrame(item);
        DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder = this.binder;
        if (defaultPlayStoriesV3WidgetBinder != null) {
            defaultPlayStoriesV3WidgetBinder.bind(item, selectedStoryIndex);
        }
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public ViewPager2 getMetricView() {
        return this.metricView;
    }
}
