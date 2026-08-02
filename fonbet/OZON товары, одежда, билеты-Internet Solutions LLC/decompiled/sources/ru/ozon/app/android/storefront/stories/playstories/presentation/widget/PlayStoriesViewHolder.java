package ru.ozon.app.android.storefront.stories.playstories.presentation.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.databinding.ActivityStoriesBinding;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesVO;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesBinder;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryCallback;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryMoleculeFragmentFactory;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0004*\u0003)14\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0016\u0010&\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "factory", "Landroidx/fragment/app/G;", "fragmentManager", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesBinder;", "binder", "<init>", "(Landroid/view/View;Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;Landroidx/fragment/app/G;Landroidx/lifecycle/v;Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesBinder;)V", "", "navigateToNextStory", "()V", "navigateToPreviousStory", "", "position", "onViewPagerDragging", "(I)V", "onViewPagerPageSelected", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "getPreviousStoryFragment", "()Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "closeStories", "getCurrentFragment", "Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "item", "selectedStoryIndex", "bind", "(Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;Ljava/lang/Integer;)V", "onCloseClicked", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "Landroidx/fragment/app/G;", "Landroidx/lifecycle/v;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesBinder;", "currentViewPagerPosition", "I", "previousViewPagerPosition", "ru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder$storyCallback$1", "storyCallback", "Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder$storyCallback$1;", "Lru/ozon/app/android/storefront/databinding/ActivityStoriesBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/ActivityStoriesBinding;", "playStoriesVO", "Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "ru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder$viewPagerCallback$1", "viewPagerCallback", "Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder$viewPagerCallback$1;", "ru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder$touchListener$1", "touchListener", "Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder$touchListener$1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesViewHolder {

    @NotNull
    private final PlayStoriesBinder binder;

    @NotNull
    private final ActivityStoriesBinding binding;
    private int currentViewPagerPosition;

    @NotNull
    private final StoryMoleculeFragmentFactory factory;

    @NotNull
    private final G fragmentManager;

    @NotNull
    private final AbstractC5434v lifecycle;
    private PlayStoriesVO playStoriesVO;
    private int previousViewPagerPosition;

    @NotNull
    private final PlayStoriesViewHolder$storyCallback$1 storyCallback;

    @NotNull
    private final PlayStoriesViewHolder$touchListener$1 touchListener;

    @NotNull
    private final PlayStoriesViewHolder$viewPagerCallback$1 viewPagerCallback;

    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder$viewPagerCallback$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder$touchListener$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder$storyCallback$1] */
    public PlayStoriesViewHolder(@NotNull View containerView, @NotNull StoryMoleculeFragmentFactory factory, @NotNull G fragmentManager, @NotNull AbstractC5434v lifecycle, @NotNull PlayStoriesBinder binder) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.factory = factory;
        this.fragmentManager = fragmentManager;
        this.lifecycle = lifecycle;
        this.binder = binder;
        this.previousViewPagerPosition = -1;
        this.storyCallback = new StoryCallback() { // from class: ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder$storyCallback$1
            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryCallback
            public void onAction(AtomAction action) {
                PlayStoriesBinder playStoriesBinder;
                Intrinsics.checkNotNullParameter(action, "action");
                playStoriesBinder = PlayStoriesViewHolder.this.binder;
                playStoriesBinder.handleAction(action);
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryCallback
            public void onNextClicked() {
                PlayStoriesViewHolder.this.navigateToNextStory();
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryCallback
            public void onPreviousClicked() {
                PlayStoriesViewHolder.this.navigateToPreviousStory();
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryCallback
            public void onStoryComplete() {
                PlayStoriesViewHolder.this.navigateToNextStory();
            }
        };
        ActivityStoriesBinding bind = ActivityStoriesBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.viewPagerCallback = new ViewPager2.g() { // from class: ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder$viewPagerCallback$1
            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageScrollStateChanged(int state) {
                ActivityStoriesBinding activityStoriesBinding;
                super.onPageScrollStateChanged(state);
                activityStoriesBinding = PlayStoriesViewHolder.this.binding;
                ViewPager2 viewPager2 = activityStoriesBinding.storiesWidgetVP;
                PlayStoriesViewHolder playStoriesViewHolder = PlayStoriesViewHolder.this;
                if (state == 0) {
                    viewPager2.y(true);
                    playStoriesViewHolder.onViewPagerPageSelected(viewPager2.f());
                } else {
                    if (state != 1) {
                        return;
                    }
                    playStoriesViewHolder.onViewPagerDragging(viewPager2.f());
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int position) {
                BaseStoryFragment previousStoryFragment;
                super.onPageSelected(position);
                previousStoryFragment = PlayStoriesViewHolder.this.getPreviousStoryFragment();
                if (previousStoryFragment != null) {
                    previousStoryFragment.onStorySwiped();
                }
                PlayStoriesViewHolder.this.onViewPagerPageSelected(position);
            }
        };
        this.touchListener = new View.OnTouchListener() { // from class: ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder$touchListener$1
            private Float startX;
            private final int swipeDistance = 10;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View v11, MotionEvent event) {
                ActivityStoriesBinding activityStoriesBinding;
                int i11;
                int i12;
                Intrinsics.checkNotNullParameter(event, "event");
                int action = event.getAction();
                if (action == 1) {
                    this.startX = null;
                    return false;
                }
                if (action != 2) {
                    return false;
                }
                Float f7 = this.startX;
                if (f7 == null) {
                    this.startX = Float.valueOf(event.getX());
                    return false;
                }
                PlayStoriesViewHolder playStoriesViewHolder = PlayStoriesViewHolder.this;
                float floatValue = f7.floatValue();
                if (event.getX() - floatValue >= this.swipeDistance) {
                    i12 = playStoriesViewHolder.currentViewPagerPosition;
                    if (i12 == 0) {
                        playStoriesViewHolder.closeStories();
                    }
                }
                activityStoriesBinding = playStoriesViewHolder.binding;
                RecyclerView.g e11 = activityStoriesBinding.storiesWidgetVP.e();
                Integer valueOf = e11 != null ? Integer.valueOf(e11.getShimmersCount() - 1) : null;
                if (floatValue - event.getX() < this.swipeDistance) {
                    return false;
                }
                i11 = playStoriesViewHolder.currentViewPagerPosition;
                if (valueOf == null || i11 != valueOf.intValue()) {
                    return false;
                }
                playStoriesViewHolder.closeStories();
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeStories() {
        BaseStoryFragment<?> currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            currentFragment.trackVideoWatched();
        }
        BaseStoryFragment<?> currentFragment2 = getCurrentFragment();
        if (currentFragment2 != null) {
            currentFragment2.removeStoryCallback();
        }
        Context context = this.binding.getConstraintLayout().getContext();
        PlayStoriesActivity playStoriesActivity = context instanceof PlayStoriesActivity ? (PlayStoriesActivity) context : null;
        if (playStoriesActivity != null) {
            playStoriesActivity.onBackPressed();
        }
    }

    private final BaseStoryFragment<?> getCurrentFragment() {
        ComponentCallbacksC5392m g02 = this.fragmentManager.g0("f" + this.currentViewPagerPosition);
        if (g02 instanceof BaseStoryFragment) {
            return (BaseStoryFragment) g02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseStoryFragment<?> getPreviousStoryFragment() {
        ComponentCallbacksC5392m g02 = this.fragmentManager.g0("f" + this.previousViewPagerPosition);
        if (g02 instanceof BaseStoryFragment) {
            return (BaseStoryFragment) g02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToNextStory() {
        ViewPager2 viewPager2 = this.binding.storiesWidgetVP;
        viewPager2.y(false);
        PlayStoriesVO playStoriesVO = this.playStoriesVO;
        if (playStoriesVO == null) {
            Intrinsics.n("playStoriesVO");
            throw null;
        }
        int size = playStoriesVO.getStories().size();
        this.previousViewPagerPosition = viewPager2.f();
        int f7 = viewPager2.f() + 1;
        if (size > f7) {
            viewPager2.t(f7, true);
        } else {
            closeStories();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToPreviousStory() {
        ViewPager2 viewPager2 = this.binding.storiesWidgetVP;
        if (viewPager2.f() != 0) {
            viewPager2.y(false);
            this.previousViewPagerPosition = viewPager2.f();
            viewPager2.t(viewPager2.f() - 1, true);
            return;
        }
        ComponentCallbacksC5392m g02 = this.fragmentManager.g0("f" + this.currentViewPagerPosition);
        BaseStoryFragment baseStoryFragment = g02 instanceof BaseStoryFragment ? (BaseStoryFragment) g02 : null;
        if (baseStoryFragment != null) {
            baseStoryFragment.restartStory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewPagerDragging(int position) {
        this.previousViewPagerPosition = position;
        List<ComponentCallbacksC5392m> r02 = this.fragmentManager.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        for (ComponentCallbacksC5392m componentCallbacksC5392m : r02) {
            BaseStoryFragment baseStoryFragment = componentCallbacksC5392m instanceof BaseStoryFragment ? (BaseStoryFragment) componentCallbacksC5392m : null;
            if (baseStoryFragment != null) {
                baseStoryFragment.pauseStory();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewPagerPageSelected(int position) {
        this.binder.onStoryViewed(position);
        this.currentViewPagerPosition = position;
        ComponentCallbacksC5392m g02 = this.fragmentManager.g0("f" + position);
        BaseStoryFragment baseStoryFragment = g02 instanceof BaseStoryFragment ? (BaseStoryFragment) g02 : null;
        BaseStoryFragment<?> previousStoryFragment = getPreviousStoryFragment();
        if (previousStoryFragment != null) {
            previousStoryFragment.removeStoryCallback();
        }
        if (baseStoryFragment != null) {
            baseStoryFragment.setupStoryCallback(this.storyCallback);
            int i11 = this.previousViewPagerPosition;
            if (i11 == -1 || i11 == this.currentViewPagerPosition) {
                baseStoryFragment.startStory();
            } else {
                baseStoryFragment.restartStory();
            }
        }
    }

    public final void bind(@NotNull PlayStoriesVO item, final Integer selectedStoryIndex) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.playStoriesVO = item;
        final ViewPager2 viewPager2 = this.binding.storiesWidgetVP;
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            recyclerView.setOnTouchListener(this.touchListener);
        }
        viewPager2.s(new PlayStoriesViewPagerAdapter(item.getStories(), item.getSpan(), this.factory, this.fragmentManager, this.lifecycle));
        viewPager2.v(1);
        if (selectedStoryIndex != null) {
            viewPager2.t(selectedStoryIndex.intValue(), false);
        }
        viewPager2.x(new CubePageTransformer());
        viewPager2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder$bind$lambda$3$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                PlayStoriesViewHolder$viewPagerCallback$1 playStoriesViewHolder$viewPagerCallback$1;
                ActivityStoriesBinding activityStoriesBinding;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ViewPager2 viewPager22 = ViewPager2.this;
                playStoriesViewHolder$viewPagerCallback$1 = this.viewPagerCallback;
                viewPager22.p(playStoriesViewHolder$viewPagerCallback$1);
                PlayStoriesViewHolder playStoriesViewHolder = this;
                Integer num = selectedStoryIndex;
                playStoriesViewHolder.onViewPagerPageSelected(num != null ? num.intValue() : 0);
                activityStoriesBinding = this.binding;
                ProgressBar loadingPb = activityStoriesBinding.loadingPb;
                Intrinsics.checkNotNullExpressionValue(loadingPb, "loadingPb");
                ViewExtKt.gone(loadingPb);
            }
        });
    }

    public final void onCloseClicked() {
        BaseStoryFragment<?> currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            currentFragment.onCloseStoryScreen();
        }
    }
}
