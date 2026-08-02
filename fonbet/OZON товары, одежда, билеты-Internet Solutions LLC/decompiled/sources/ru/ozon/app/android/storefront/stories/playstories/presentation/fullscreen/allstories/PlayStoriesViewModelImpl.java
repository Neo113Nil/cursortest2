package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import DM.b;
import DM.c;
import K00.i;
import L00.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import UZ.a;
import UZ.d;
import WZ.e;
import WZ.t;
import a00.C4911f;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.di.composer.RetainComposerAnalyticsComponentApi;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesVO;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModelImpl;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;
import ru.ozon.app.android.storefront.stories.story.data.StoryMedia;
import ru.ozon.app.android.storefront.stories.story.data.StoryWithPoll;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;
import sc.C9656b;
import xc.C10699b;
import xc.h;
import xc.j;
import xc.n;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0007\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\rJ\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010#J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020 H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0,H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u0002012\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J!\u00106\u001a\u00020\u000b2\u0010\u00105\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u000504H\u0002¢\u0006\u0004\b6\u00107R\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R,\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020 0;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\"\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR'\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010.R\u0018\u0010Y\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesViewModelImpl;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesViewModel;", "Landroidx/lifecycle/w0;", "LK00/i;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "composerRepository", "Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "composerReferencesFactory", "<init>", "(LK00/i;Lru/ozon/app/android/composer/references/ComposerReferencesFactory;)V", "", "onCleared", "()V", "", "link", "bind", "(Ljava/lang/String;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "initComposerWorkAround", "(Landroidx/lifecycle/J;La00/h;La00/f;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "currentStoryPosition", "onCloseClicked", "(I)V", "closeWithoutTransition", "position", "storyIsViewed", "Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "vo", "selectedStoryIndex", "showStories", "(Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;I)V", "Lkotlin/Function1;", "createActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "handleVideoViewEvent", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/composer/ComposerReferences;)Z", "LP00/k;", "response", "setupAnalytics", "(LP00/k;)V", "LK00/i;", "Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "Landroidx/lifecycle/V;", "Lkotlin/Pair;", "stories", "Landroidx/lifecycle/V;", "getStories", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/ViewedStories;", "closeEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getCloseEvent", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Ljava/lang/Void;", "forceClose", "getForceClose", "Lnc/a;", "disposables", "Lnc/a;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "storiesWithViewedState", "Ljava/util/List;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "actionHandler", "widgetViewItem", "Lru/ozon/composer/ui/widget/l;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesViewModelImpl extends w0 implements PlayStoriesViewModel {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final SingleLiveEvent<ViewedStories> closeEvent;
    private ComposerReferences composerReferences;

    @NotNull
    private final ComposerReferencesFactory composerReferencesFactory;

    @NotNull
    private final i<l> composerRepository;

    @NotNull
    private C8486a disposables;

    @NotNull
    private final SingleLiveEvent<Void> forceClose;

    @NotNull
    private AtomicBoolean isInitialized;

    @NotNull
    private final V<Pair<PlayStoriesVO, Integer>> stories;

    @NotNull
    private List<StoryCommonMolecule> storiesWithViewedState;
    private l widgetViewItem;

    public PlayStoriesViewModelImpl(@NotNull i<l> composerRepository, @NotNull ComposerReferencesFactory composerReferencesFactory) {
        Intrinsics.checkNotNullParameter(composerRepository, "composerRepository");
        Intrinsics.checkNotNullParameter(composerReferencesFactory, "composerReferencesFactory");
        this.composerRepository = composerRepository;
        this.composerReferencesFactory = composerReferencesFactory;
        this.stories = new V<>();
        this.closeEvent = new SingleLiveEvent<>();
        this.forceClose = new SingleLiveEvent<>();
        this.disposables = new C8486a();
        this.isInitialized = new AtomicBoolean(false);
        this.storiesWithViewedState = new ArrayList();
        this.actionHandler = k.b(new PlayStoriesViewModelImpl$actionHandler$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P00.k bind$lambda$0(PlayStoriesViewModelImpl playStoriesViewModelImpl, String str) {
        i<l> iVar = playStoriesViewModelImpl.composerRepository;
        g.a aVar = new g.a();
        aVar.g(UriExtKt.removeSchema(str));
        aVar.b();
        return iVar.c(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayStoriesVO bind$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (PlayStoriesVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> createActionHandler() {
        ComposerReferences composerReferences = this.composerReferences;
        if (composerReferences != null) {
            return new ActionHandler.Builder(composerReferences, PlayStoriesViewModelImpl$createActionHandler$1.INSTANCE, PlayStoriesViewModelImpl$createActionHandler$2.INSTANCE, new PlayStoriesViewModelImpl$createActionHandler$3(this)).customAnalyticHandler(new PlayStoriesViewModelImpl$createActionHandler$4(this, composerReferences)).buildHandler();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleVideoViewEvent(AtomAction atomAction, ComposerReferences refs) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        final Map<String, String> params;
        Map<String, String> params2;
        AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
        if (composerAction == null) {
            return false;
        }
        if (!Intrinsics.d(composerAction.getActionName(), "view") || (params2 = composerAction.getParams()) == null || !params2.containsKey("number")) {
            composerAction = null;
        }
        if (composerAction == null || (trackingInfo = composerAction.getTrackingInfo()) == null) {
            return false;
        }
        l lVar = this.widgetViewItem;
        t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, lVar != null ? Long.valueOf(lVar.f()) : null, null, 2, null);
        if (mapToTokenizedEvent$default == null || (params = composerAction.getParams()) == null) {
            return false;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents(refs.getTokenizedAnalytics(), mapToTokenizedEvent$default, new e() { // from class: dK.c
            @Override // WZ.e
            public final WZ.g modifyParams(UZ.a aVar, WZ.g gVar) {
                WZ.g handleVideoViewEvent$lambda$6;
                handleVideoViewEvent$lambda$6 = PlayStoriesViewModelImpl.handleVideoViewEvent$lambda$6(params, (d) aVar, gVar);
                return handleVideoViewEvent$lambda$6;
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WZ.g handleVideoViewEvent$lambda$6(Map map, a aVar, WZ.g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return WZ.g.a(params, map, null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupAnalytics(P00.k<l> response) {
        Object obj;
        ComposerReferences composerReferences = this.composerReferences;
        if (composerReferences == null) {
            return;
        }
        RZ.a composerAnalytics = ((RetainComposerAnalyticsComponentApi) composerReferences.getComponent(RetainComposerAnalyticsComponentApi.class)).getComposerAnalytics();
        if (response.f().c() != null) {
            composerAnalytics.e().e(response.f(), response.g().i(), false);
        }
        WZ.l f7 = composerAnalytics.f();
        Long l11 = (Long) C7714v.L(response.b().d().keySet());
        Iterator<T> it = response.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long f11 = ((l) obj).f();
            if (l11 != null && f11 == l11.longValue()) {
                break;
            }
        }
        this.widgetViewItem = (l) obj;
        f7.b(response.b().d());
        f7.c(response.b().b());
        Map<String, String> l12 = response.f().l();
        if (l12 != null) {
            f7.e(l12);
        }
        Iterator<T> it2 = response.d().iterator();
        while (it2.hasNext()) {
            t m11 = ((l) it2.next()).m();
            if (m11 != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(f7, m11, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStories(PlayStoriesVO vo, int selectedStoryIndex) {
        if (vo.getStories().isEmpty()) {
            closeWithoutTransition();
        } else {
            getStories().setValue(new Pair<>(vo, Integer.valueOf(selectedStoryIndex)));
            this.storiesWithViewedState = C7714v.W0(vo.getStories());
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModel
    public void bind(@NotNull final String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        C8486a c8486a = this.disposables;
        h hVar = new h(new Callable() { // from class: dK.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                P00.k bind$lambda$0;
                bind$lambda$0 = PlayStoriesViewModelImpl.bind$lambda$0(PlayStoriesViewModelImpl.this, link);
                return bind$lambda$0;
            }
        });
        x b11 = Mc.a.b();
        C9656b.c(b11, "scheduler is null");
        j jVar = new j(new xc.k(new n(hVar, b11), C8125a.a()), new b(new PlayStoriesViewModelImpl$bind$2(this), 5));
        C10699b c10699b = new C10699b(new c(new PlayStoriesViewModelImpl$bind$3(this), 6), new Fw.b(new PlayStoriesViewModelImpl$bind$4(this), 6), C9653a.f98523c);
        jVar.a(c10699b);
        Intrinsics.checkNotNullExpressionValue(c10699b, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, c10699b);
    }

    public void closeWithoutTransition() {
        getForceClose().call();
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModel
    public void handleAction(@NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        getActionHandler().invoke(atomAction);
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModel
    public void initComposerWorkAround(@NotNull J lifecycleOwner, @NotNull a00.h viewModelOwnerProvider, @NotNull C4911f ownerContainer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        this.composerReferences = this.composerReferencesFactory.create(ownerContainer, viewModelOwnerProvider);
        final AbstractC5434v lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            this.composerReferences = null;
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModelImpl$initComposerWorkAround$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.composerReferences = null;
                    AbstractC5434v.this.e(this);
                }
            });
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposables.dispose();
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModel
    public void onCloseClicked(int currentStoryPosition) {
        getCloseEvent().setValue(new ViewedStories(currentStoryPosition, this.storiesWithViewedState));
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModel
    public void storyIsViewed(int position) {
        StoryCommonMolecule copy$default;
        StoryCommonMolecule remove = this.storiesWithViewedState.remove(position);
        ru.ozon.app.android.storefront.stories.story.data.StoryType data = remove.getData();
        if (data instanceof StoryMedia) {
            copy$default = StoryCommonMolecule.copy$default(remove, 0, null, null, null, null, true, 31, null);
        } else {
            if (!(data instanceof StoryWithPoll)) {
                throw new o();
            }
            copy$default = StoryCommonMolecule.copy$default(remove, 0, null, null, null, null, true, 31, null);
        }
        this.storiesWithViewedState.add(position, copy$default);
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModel
    @NotNull
    public SingleLiveEvent<ViewedStories> getCloseEvent() {
        return this.closeEvent;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModel
    @NotNull
    public SingleLiveEvent<Void> getForceClose() {
        return this.forceClose;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModel
    @NotNull
    public V<Pair<PlayStoriesVO, Integer>> getStories() {
        return this.stories;
    }
}
