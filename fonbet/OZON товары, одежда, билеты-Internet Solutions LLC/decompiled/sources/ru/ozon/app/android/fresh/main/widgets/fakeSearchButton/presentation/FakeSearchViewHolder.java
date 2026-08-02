package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation;

import Sc.InterfaceC4008j;
import U7.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 42\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00014B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R'\u0010(\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/widget/FrameLayout;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/widget/FrameLayout;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "setupView", "()V", "setLifecycleObserver", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onViewInVisibleBounds", "onAttach", "Landroid/widget/FrameLayout;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "", "observerInitialized", "Z", "wasFragmentDetached", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchViewController;", "viewController$delegate", "getViewController", "()Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchViewController;", "viewController", "isSticky", "()Z", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeSearchViewHolder extends k<FakeSearchVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final FrameLayout containerView;
    private boolean observerInitialized;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: viewController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewController;
    private boolean wasFragmentDetached;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchViewHolder$Companion;", "", "<init>", "()V", "NON_STICKY", "", "STICKY", "NO_POSITION", "", "FIRST_INDEX", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FakeSearchViewHolder(@NotNull FrameLayout containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.references = references;
        this.actionHandler = Sc.k.b(new FakeSearchViewHolder$actionHandler$2(this));
        this.viewController = Sc.k.b(new FakeSearchViewHolder$viewController$2(this));
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final FakeSearchViewController getViewController() {
        return (FakeSearchViewController) this.viewController.getValue();
    }

    private final boolean isSticky() {
        View view;
        ViewGroup composerStickyContainer;
        View childAt;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        boolean z11 = false;
        if (c11 != null && (view = c11.getView()) != null && (composerStickyContainer = ComposerViewExtensionKt.composerStickyContainer(view)) != null && (childAt = composerStickyContainer.getChildAt(0)) != null) {
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup != null && viewGroup.indexOfChild(this.containerView) == -1) {
                z11 = true;
            }
        }
        return !z11;
    }

    private final void setLifecycleObserver() {
        if (this.observerInitialized) {
            return;
        }
        this.observerInitialized = true;
        d.c(this.references).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewHolder$setLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                FakeSearchViewHolder.this.wasFragmentDetached = true;
                composerReferences = FakeSearchViewHolder.this.references;
                composerReferences.getContainer().g().getLifecycle().e(this);
            }
        });
    }

    private final void setupView() {
        this.wasFragmentDetached = false;
        FakeSearchVO boundData = getBoundData();
        if (boundData != null) {
            getViewController().setup(boundData, isSticky());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        FakeSearchVO boundData;
        super.onAttach();
        boolean isSticky = isSticky();
        getViewController().setLocatorsTags(isSticky);
        if (isSticky) {
            setLifecycleObserver();
            this.containerView.setContentDescription("fakeSearchWidgetSticky");
        } else {
            this.containerView.setContentDescription("fakeSearchWidgetNonSticky");
        }
        if (!isSticky || (((boundData = getBoundData()) != null && boundData.getShouldSkipStickyAnimation()) || this.wasFragmentDetached)) {
            setupView();
            return;
        }
        FakeSearchVO boundData2 = getBoundData();
        if (boundData2 != null) {
            getViewController().animateSetup(boundData2);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        setupView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FakeSearchVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        getViewController().bind(item, getActionHandler());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FakeSearchVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((FakeSearchViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
