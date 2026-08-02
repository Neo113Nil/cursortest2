package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import B90.C2617t;
import Ql.c;
import Sc.o;
import Sc.s;
import WZ.g;
import WZ.t;
import Wc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.H;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.storefront.stories.playstoriesv3.Action;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.core.StoryV3FragmentFactory;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.PlayStoriesV3VO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.viewpagertransformer.PlayStoriesV3Transformer;
import ru.ozon.app.android.storefront.stories.story.presentation.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0003ADG\b\u0001\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010\u001cJ\u001b\u0010$\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010\"J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010\"J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010\u001cJ\u000f\u0010-\u001a\u00020\u0018H\u0002¢\u0006\u0004\b-\u0010\u001cJ\u0017\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u0010\u001cJ\u000f\u00100\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00101\u001a\u00020\u0018H\u0002¢\u0006\u0004\b1\u0010\u001cJ\u0015\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u000102H\u0002¢\u0006\u0004\b5\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0016\u0010=\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0018\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder;", "", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/fragment/app/G;", "fragmentManager", "Landroidx/lifecycle/v;", "lifecycle", "Ll10/i;", "container", "Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "playStoriesViewModel", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkHandler;", "shareLinkHandler", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Ld20/b;", "viewHolder", "<init>", "(Landroidx/viewpager2/widget/ViewPager2;Landroidx/fragment/app/G;Landroidx/lifecycle/v;Ll10/i;Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkHandler;Lru/ozon/app/android/composer/ComposerNavigator;Ld20/b;)V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;", "vo", "", "selectedStoryIndex", "", "bind", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;Ljava/lang/Integer;)V", "trackVideoWatched", "()V", "create", "removeView", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "handleVideoViewEvent", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "getSystemElementsHeight", "getSelectedIndex", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "action", "handleAction", "handleShareAction", "position", "onViewPagerPageSelected", "(I)V", "resetStories", "navigateToNextStory", "onViewPagerDragging", "pauseStories", "handleCloseStories", "navigateToPreviousStory", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/BaseStoryV3Fragment;", "getPreviousStoryFragment", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/BaseStoryV3Fragment;", "getCurrentFragment", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/fragment/app/G;", "Landroidx/lifecycle/v;", "Ll10/i;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkHandler;", "Lru/ozon/app/android/composer/ComposerNavigator;", "currentViewPagerPosition", "I", "previousViewPagerPosition", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;", "ru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder$viewPagerCallback$1", "viewPagerCallback", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder$viewPagerCallback$1;", "ru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder$touchListener$1", "touchListener", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder$touchListener$1;", "ru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder$fragmentLifecycleCallbacks$1", "fragmentLifecycleCallbacks", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/DefaultPlayStoriesV3WidgetBinder$fragmentLifecycleCallbacks$1;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultPlayStoriesV3WidgetBinder {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;
    private int currentViewPagerPosition;

    @NotNull
    private final DefaultPlayStoriesV3WidgetBinder$fragmentLifecycleCallbacks$1 fragmentLifecycleCallbacks;

    @NotNull
    private final G fragmentManager;

    @NotNull
    private final AbstractC5434v lifecycle;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final PlayStoriesV3ViewModel playStoriesViewModel;
    private int previousViewPagerPosition;

    @NotNull
    private final ShareLinkHandler shareLinkHandler;

    @NotNull
    private final DefaultPlayStoriesV3WidgetBinder$touchListener$1 touchListener;

    @NotNull
    private final ViewPager2 viewPager;

    @NotNull
    private final DefaultPlayStoriesV3WidgetBinder$viewPagerCallback$1 viewPagerCallback;
    private PlayStoriesV3VO vo;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/storefront/stories/playstoriesv3/Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$1", f = "PlayStoriesV3WidgetBinder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Action, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = DefaultPlayStoriesV3WidgetBinder.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Action action = (Action) this.L$0;
            if (action instanceof Action.OnAction) {
                DefaultPlayStoriesV3WidgetBinder.this.handleAction(((Action.OnAction) action).getAction());
            } else if (action instanceof Action.OnStoryCompleted) {
                DefaultPlayStoriesV3WidgetBinder.this.navigateToNextStory();
            } else if (action instanceof Action.OnPreviousClicked) {
                DefaultPlayStoriesV3WidgetBinder.this.navigateToPreviousStory();
            } else if (action instanceof Action.OnShareClicked) {
                DefaultPlayStoriesV3WidgetBinder.this.handleShareAction(((Action.OnShareClicked) action).getShareAction());
            } else if (action instanceof Action.OnTrackVideoWatched) {
                DefaultPlayStoriesV3WidgetBinder.this.handleVideoViewEvent(((Action.OnTrackVideoWatched) action).getAction());
            } else {
                if (!(action instanceof Action.OnCloseStories)) {
                    throw new o();
                }
                DefaultPlayStoriesV3WidgetBinder.this.handleCloseStories();
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Action action, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(action, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$viewPagerCallback$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$touchListener$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$fragmentLifecycleCallbacks$1] */
    public DefaultPlayStoriesV3WidgetBinder(@NotNull ViewPager2 viewPager, @NotNull G fragmentManager, @NotNull AbstractC5434v lifecycle, @NotNull i container, @NotNull PlayStoriesV3ViewModel playStoriesViewModel, @NotNull ShareLinkHandler shareLinkHandler, @NotNull ComposerNavigator navigator, @NotNull AbstractC6065b<?> viewHolder) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(playStoriesViewModel, "playStoriesViewModel");
        Intrinsics.checkNotNullParameter(shareLinkHandler, "shareLinkHandler");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.viewPager = viewPager;
        this.fragmentManager = fragmentManager;
        this.lifecycle = lifecycle;
        this.container = container;
        this.playStoriesViewModel = playStoriesViewModel;
        this.shareLinkHandler = shareLinkHandler;
        this.navigator = navigator;
        this.previousViewPagerPosition = -1;
        this.viewPagerCallback = new ViewPager2.g() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$viewPagerCallback$1
            @Override // androidx.viewpager2.widget.ViewPager2.g
            @SuppressLint({"SwitchIntDef"})
            public void onPageScrollStateChanged(int state) {
                ViewPager2 viewPager2;
                ViewPager2 viewPager22;
                ViewPager2 viewPager23;
                super.onPageScrollStateChanged(state);
                if (state != 0) {
                    if (state != 1) {
                        return;
                    }
                    DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder = DefaultPlayStoriesV3WidgetBinder.this;
                    viewPager23 = defaultPlayStoriesV3WidgetBinder.viewPager;
                    defaultPlayStoriesV3WidgetBinder.onViewPagerDragging(viewPager23.f());
                    return;
                }
                viewPager2 = DefaultPlayStoriesV3WidgetBinder.this.viewPager;
                viewPager2.y(true);
                DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder2 = DefaultPlayStoriesV3WidgetBinder.this;
                viewPager22 = defaultPlayStoriesV3WidgetBinder2.viewPager;
                defaultPlayStoriesV3WidgetBinder2.onViewPagerPageSelected(viewPager22.f());
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int position) {
                BaseStoryV3Fragment previousStoryFragment;
                super.onPageSelected(position);
                previousStoryFragment = DefaultPlayStoriesV3WidgetBinder.this.getPreviousStoryFragment();
                if (previousStoryFragment != null) {
                    previousStoryFragment.trackVideoWatched();
                }
                DefaultPlayStoriesV3WidgetBinder.this.onViewPagerPageSelected(position);
            }
        };
        this.touchListener = new View.OnTouchListener() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$touchListener$1
            private Float startX;
            private final int swipeDistance = 10;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            
                r3 = r0.getCurrentFragment();
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onTouch(View v11, MotionEvent event) {
                int i11;
                BaseStoryV3Fragment currentFragment;
                Intrinsics.checkNotNullParameter(event, "event");
                int action = event.getAction();
                if (action == 1) {
                    if (v11 != null) {
                        v11.performClick();
                    }
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
                DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder = DefaultPlayStoriesV3WidgetBinder.this;
                if (event.getX() - f7.floatValue() < this.swipeDistance) {
                    return false;
                }
                i11 = defaultPlayStoriesV3WidgetBinder.currentViewPagerPosition;
                if (i11 != 0 || currentFragment == null) {
                    return false;
                }
                currentFragment.closeStory();
                return false;
            }
        };
        this.fragmentLifecycleCallbacks = new G.m() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$fragmentLifecycleCallbacks$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentAttached(G fm, ComponentCallbacksC5392m fragment, Context context) {
                PlayStoriesV3ViewModel playStoriesV3ViewModel;
                int i11;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(context, "context");
                super.onFragmentAttached(fm, fragment, context);
                if (fragment instanceof ComposerFragment) {
                    playStoriesV3ViewModel = DefaultPlayStoriesV3WidgetBinder.this.playStoriesViewModel;
                    i11 = DefaultPlayStoriesV3WidgetBinder.this.currentViewPagerPosition;
                    playStoriesV3ViewModel.setViewPagerPosition(Integer.valueOf(i11));
                }
                DefaultPlayStoriesV3WidgetBinder.this.pauseStories();
            }

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
            
                r2 = r1.this$0.getCurrentFragment();
             */
            @Override // androidx.fragment.app.G.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onFragmentDetached(G fm, ComponentCallbacksC5392m fragment) {
                BaseStoryV3Fragment currentFragment;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                super.onFragmentDetached(fm, fragment);
                if (!(fragment instanceof BottomSheetComposerFragment) || currentFragment == null) {
                    return;
                }
                currentFragment.startStory();
            }
        };
        this.actionHandler = new ActionHandler.Builder(container, viewHolder).buildHandler();
        C2399j.C(new C2408n0(playStoriesViewModel.getActions(), new AnonymousClass1(null)), H.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseStoryV3Fragment<?> getCurrentFragment() {
        ComponentCallbacksC5392m g02 = this.fragmentManager.g0("f" + this.currentViewPagerPosition);
        if (g02 instanceof BaseStoryV3Fragment) {
            return (BaseStoryV3Fragment) g02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseStoryV3Fragment<?> getPreviousStoryFragment() {
        ComponentCallbacksC5392m g02 = this.fragmentManager.g0("f" + this.previousViewPagerPosition);
        if (g02 instanceof BaseStoryV3Fragment) {
            return (BaseStoryV3Fragment) g02;
        }
        return null;
    }

    private final Integer getSelectedIndex(Integer selectedStoryIndex) {
        Integer viewPagerPosition = this.playStoriesViewModel.getViewPagerPosition();
        this.playStoriesViewModel.setViewPagerPosition(null);
        return viewPagerPosition == null ? selectedStoryIndex : viewPagerPosition;
    }

    private final void getSystemElementsHeight() {
        ViewGroup rootView = ContextExtKt.getRootView(this.container.Q().a());
        if (rootView != null) {
            Y.J(rootView, new C2617t(this));
        }
        if (rootView != null) {
            ViewExtKt.requestApplyInsetsWhenAttached(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 getSystemElementsHeight$lambda$8$lambda$7(DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder, View view, C5353y0 c5353y0) {
        defaultPlayStoriesV3WidgetBinder.playStoriesViewModel.onGotSystemElementsHeight(c.a(view, "<unused var>", c5353y0, "insets", 1).f42127b, c5353y0.f(2).f42129d);
        return c5353y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomAction action) {
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCloseStories() {
        this.navigator.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleShareAction(AtomAction action) {
        if (action instanceof AtomAction.Click) {
            pauseStories();
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, TokenizedTrackingInfo> trackingInfo = click.getTrackingInfo();
            if (trackingInfo != null) {
                PlayStoriesV3VO playStoriesV3VO = this.vo;
                t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, playStoriesV3VO != null ? Long.valueOf(playStoriesV3VO.getId()) : null, null, 2, null);
                if (mapToTokenizedEvent$default != null) {
                    TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.container.X(), mapToTokenizedEvent$default, null, 2, null);
                }
            }
            this.shareLinkHandler.handle(click, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleVideoViewEvent(AtomAction atomAction) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        final Map<String, String> params;
        Map<String, String> params2;
        AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
        if (composerAction != null) {
            if (!Intrinsics.d(composerAction.getActionName(), "view") || (params2 = composerAction.getParams()) == null || !params2.containsKey("number")) {
                composerAction = null;
            }
            if (composerAction == null || (trackingInfo = composerAction.getTrackingInfo()) == null) {
                return;
            }
            PlayStoriesV3VO playStoriesV3VO = this.vo;
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, playStoriesV3VO != null ? Long.valueOf(playStoriesV3VO.getId()) : null, null, 2, null);
            if (mapToTokenizedEvent$default == null || (params = composerAction.getParams()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents(this.container.X(), mapToTokenizedEvent$default, new WZ.e() { // from class: gK.a
                @Override // WZ.e
                public final g modifyParams(UZ.a aVar, g gVar) {
                    g handleVideoViewEvent$lambda$6;
                    handleVideoViewEvent$lambda$6 = DefaultPlayStoriesV3WidgetBinder.handleVideoViewEvent$lambda$6(params, (UZ.d) aVar, gVar);
                    return handleVideoViewEvent$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g handleVideoViewEvent$lambda$6(Map map, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToNextStory() {
        List<StoryV3> stories;
        this.viewPager.y(false);
        PlayStoriesV3VO playStoriesV3VO = this.vo;
        if (playStoriesV3VO == null || (stories = playStoriesV3VO.getStories()) == null) {
            return;
        }
        int size = stories.size();
        this.previousViewPagerPosition = this.viewPager.f();
        int f7 = this.viewPager.f() + 1;
        if (size > f7) {
            this.viewPager.t(f7, true);
            return;
        }
        BaseStoryV3Fragment<?> currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            currentFragment.closeStory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToPreviousStory() {
        if (this.viewPager.f() == 0) {
            BaseStoryV3Fragment<?> currentFragment = getCurrentFragment();
            if (currentFragment != null) {
                currentFragment.restartStory();
                return;
            }
            return;
        }
        this.viewPager.y(false);
        this.previousViewPagerPosition = this.viewPager.f();
        ViewPager2 viewPager2 = this.viewPager;
        viewPager2.t(viewPager2.f() - 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewPagerDragging(int position) {
        this.previousViewPagerPosition = position;
        pauseStories();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewPagerPageSelected(int position) {
        this.currentViewPagerPosition = position;
        ComponentCallbacksC5392m g02 = this.fragmentManager.g0("f" + position);
        BaseStoryV3Fragment baseStoryV3Fragment = g02 instanceof BaseStoryV3Fragment ? (BaseStoryV3Fragment) g02 : null;
        resetStories();
        if (baseStoryV3Fragment != null) {
            int i11 = this.previousViewPagerPosition;
            if (i11 == -1 || i11 == this.currentViewPagerPosition) {
                baseStoryV3Fragment.startStory();
            } else {
                baseStoryV3Fragment.restartStory();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pauseStories() {
        List<ComponentCallbacksC5392m> r02 = this.fragmentManager.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        for (ComponentCallbacksC5392m componentCallbacksC5392m : r02) {
            BaseStoryV3Fragment baseStoryV3Fragment = componentCallbacksC5392m instanceof BaseStoryV3Fragment ? (BaseStoryV3Fragment) componentCallbacksC5392m : null;
            if (baseStoryV3Fragment != null) {
                baseStoryV3Fragment.pauseStory();
            }
        }
    }

    private final void resetStories() {
        List<ComponentCallbacksC5392m> r02 = this.fragmentManager.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        for (ComponentCallbacksC5392m componentCallbacksC5392m : r02) {
            if (!Intrinsics.d(componentCallbacksC5392m, getCurrentFragment())) {
                BaseStoryV3Fragment baseStoryV3Fragment = componentCallbacksC5392m instanceof BaseStoryV3Fragment ? (BaseStoryV3Fragment) componentCallbacksC5392m : null;
                if (baseStoryV3Fragment != null) {
                    baseStoryV3Fragment.resetStory();
                }
            }
        }
    }

    public void bind(@NotNull PlayStoriesV3VO vo, Integer selectedStoryIndex) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.vo = vo;
        final ViewPager2 viewPager2 = this.viewPager;
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            recyclerView.setOnTouchListener(this.touchListener);
        }
        viewPager2.s(new PlayStoriesV3ViewPagerAdapter(vo.getStories(), vo.getSpan(), new StoryV3FragmentFactory(), this.fragmentManager, this.lifecycle));
        viewPager2.v(1);
        final Integer selectedIndex = getSelectedIndex(selectedStoryIndex);
        if (selectedIndex != null) {
            viewPager2.t(selectedIndex.intValue(), false);
        }
        viewPager2.x(new PlayStoriesV3Transformer());
        viewPager2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.DefaultPlayStoriesV3WidgetBinder$bind$lambda$3$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                DefaultPlayStoriesV3WidgetBinder$viewPagerCallback$1 defaultPlayStoriesV3WidgetBinder$viewPagerCallback$1;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ViewPager2 viewPager22 = ViewPager2.this;
                defaultPlayStoriesV3WidgetBinder$viewPagerCallback$1 = this.viewPagerCallback;
                viewPager22.p(defaultPlayStoriesV3WidgetBinder$viewPagerCallback$1);
                DefaultPlayStoriesV3WidgetBinder defaultPlayStoriesV3WidgetBinder = this;
                Integer num = selectedIndex;
                defaultPlayStoriesV3WidgetBinder.onViewPagerPageSelected(num != null ? num.intValue() : 0);
            }
        });
    }

    public void create() {
        G d11 = this.container.Q().d();
        if (d11 != null) {
            d11.Y0(this.fragmentLifecycleCallbacks, false);
        }
        getSystemElementsHeight();
    }

    public void removeView() {
        this.actionHandler = null;
        G d11 = this.container.Q().d();
        if (d11 != null) {
            d11.t1(this.fragmentLifecycleCallbacks);
        }
        ViewGroup rootView = ContextExtKt.getRootView(this.container.Q().a());
        if (rootView != null) {
            Y.J(rootView, null);
        }
    }

    public void trackVideoWatched() {
        BaseStoryV3Fragment<?> currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            currentFragment.trackVideoWatched();
        }
    }
}
