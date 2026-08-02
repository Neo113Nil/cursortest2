package ru.ozon.app.android.ugc.widgets.stickyBubble.presentation;

import Bq.C2668a;
import UZ.a;
import VW.b;
import VW.d;
import Vg.c;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.m;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleVO;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001)\b\u0001\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u0011J\u0013\u0010\"\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleViewHolder;", "Ld20/a;", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;", "Ll10/i;", "container", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "LWZ/l;", "tokenizedAnalytics", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/c;LWZ/l;Ld20/e;)V", "", "showDefaultBubble", "()V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "data", "handleActionAndTrackEvent", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;)V", "bindSelectedBubble", "showSelectedBubble", "hideBubble", "trackBubbleView", "trackBubbleSelectedView", "item", "trackDefaultStateClickEvent", "(Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;)V", "expandBubble", "shrinkBubble", "LWZ/g;", "getDynamicCustomParams", "(LWZ/g;)LWZ/g;", "bind", "onWidgetDestroyed", "Ll10/i;", "LVg/c;", "LWZ/l;", "ru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleViewHolder$scrollListener$1;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/os/Handler;", "stateChangeHandler", "Landroid/os/Handler;", "", "canShow", "Z", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleView;", "getContainerView", "()Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleView;", "containerView", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickyBubbleViewHolder extends AbstractC6064a<StickyBubbleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean canShow;

    @NotNull
    private final i container;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final StickyBubbleViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final Handler stateChangeHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            AtomActionDTO action;
            Intrinsics.checkNotNullParameter(it, "it");
            StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) StickyBubbleViewHolder.this.getBoundData();
            if (stickyBubbleVO != null) {
                StickyBubbleViewHolder stickyBubbleViewHolder = StickyBubbleViewHolder.this;
                if (stickyBubbleVO.getIsSelected() || (action = stickyBubbleVO.getDefaultState().getAction()) == null) {
                    return;
                }
                stickyBubbleViewHolder.handleActionAndTrackEvent(action, stickyBubbleVO);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleViewHolder$Companion;", "", "<init>", "()V", "RESET_ANIMATION_DELAY", "", "ELEMENT_TYPE_KEY", "", "ELEMENT_TYPE_PREVIEW", "ELEMENT_TYPE_FULL", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder$scrollListener$1] */
    public StickyBubbleViewHolder(@NotNull i container, @NotNull c customActionHandlersStore, @NotNull l tokenizedAnalytics, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.customActionHandlersStore = customActionHandlersStore;
        this.tokenizedAnalytics = tokenizedAnalytics;
        ?? r82 = new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0) {
                    StickyBubbleViewHolder.this.shrinkBubble();
                } else if (dy < 0) {
                    StickyBubbleViewHolder.this.expandBubble();
                }
            }
        };
        this.scrollListener = r82;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new C(this) { // from class: ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder$actionHandler$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                c cVar;
                cVar = ((StickyBubbleViewHolder) this.receiver).customActionHandlersStore;
                return cVar;
            }
        }).buildHandler();
        this.stateChangeHandler = new Handler(Looper.getMainLooper());
        ComposerViewExtensionKt.composerRecyclerView(container.Y()).addOnScrollListener(r82);
        container.K().f().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                StickyBubbleViewHolder.this.stateChangeHandler.removeCallbacksAndMessages(null);
                StickyBubbleViewHolder.this.container.K().f().getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                StickyBubbleViewHolder.this.canShow = false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                StickyBubbleVO stickyBubbleVO;
                Intrinsics.checkNotNullParameter(owner, "owner");
                StickyBubbleViewHolder.this.canShow = true;
                StickyBubbleVO stickyBubbleVO2 = (StickyBubbleVO) StickyBubbleViewHolder.this.getBoundData();
                if (stickyBubbleVO2 == null || !stickyBubbleVO2.getShouldShow() || (stickyBubbleVO = (StickyBubbleVO) StickyBubbleViewHolder.this.getBoundData()) == null) {
                    return;
                }
                StickyBubbleViewHolder.this.bind(stickyBubbleVO);
            }
        });
        StickyBubbleView containerView = getContainerView();
        if (containerView != null) {
            ViewExtKt.setOnClickListenerThrottle$default(containerView, 0L, new AnonymousClass2(), 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindSelectedBubble() {
        StickyBubbleView containerView;
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) getBoundData();
        if (stickyBubbleVO != null && (containerView = getContainerView()) != null) {
            containerView.bindInitialState(stickyBubbleVO, true);
        }
        trackBubbleSelectedView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void expandBubble() {
        StickyBubbleVO stickyBubbleVO;
        TextDTO text;
        StickyBubbleView containerView = getContainerView();
        if (containerView != null && (stickyBubbleVO = (StickyBubbleVO) getBoundData()) != null && stickyBubbleVO.getShouldShow() && containerView.getTitleView().getVisibility() == 8) {
            if (stickyBubbleVO.getIsSelected()) {
                StickyBubbleVO.StickyBubbleStateVO selectedState = stickyBubbleVO.getSelectedState();
                text = selectedState != null ? selectedState.getText() : null;
            } else {
                text = stickyBubbleVO.getDefaultState().getText();
            }
            if (text == null) {
                return;
            }
            this.stateChangeHandler.postDelayed(new b(containerView, text, this, 0), 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void expandBubble$lambda$12(StickyBubbleView stickyBubbleView, TextDTO textDTO, StickyBubbleViewHolder stickyBubbleViewHolder) {
        stickyBubbleView.expand(textDTO);
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) stickyBubbleViewHolder.getBoundData();
        if (stickyBubbleVO != null) {
            stickyBubbleVO.setShrunk(false);
        }
    }

    private final StickyBubbleView getContainerView() {
        View view = getView();
        if (view instanceof StickyBubbleView) {
            return (StickyBubbleView) view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final g getDynamicCustomParams(g gVar) {
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) getBoundData();
        return g.a(gVar, U.i(new Pair("elementType", (stickyBubbleVO == null || !stickyBubbleVO.getIsShrunk()) ? "full" : "preview")), null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleActionAndTrackEvent(AtomActionDTO action, StickyBubbleVO data) {
        this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) getBoundData();
        if (stickyBubbleVO != null) {
            stickyBubbleVO.setClicked(true);
        }
        trackDefaultStateClickEvent(data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideBubble() {
        StickyBubbleView containerView = getContainerView();
        if (containerView != null) {
            containerView.shrinkAndHide();
            StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) getBoundData();
            if (stickyBubbleVO != null) {
                stickyBubbleVO.setShrunk(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showDefaultBubble() {
        StickyBubbleView containerView;
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) getBoundData();
        if (stickyBubbleVO != null && (containerView = getContainerView()) != null) {
            containerView.bindInitialState(stickyBubbleVO, false);
        }
        trackBubbleView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSelectedBubble() {
        Integer selectedStateTimeout;
        StickyBubbleView containerView;
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) getBoundData();
        if (stickyBubbleVO != null && (containerView = getContainerView()) != null) {
            containerView.showSelectedBubble(stickyBubbleVO);
        }
        trackBubbleSelectedView();
        Handler handler = this.stateChangeHandler;
        I.g gVar = new I.g(this, 1);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        StickyBubbleVO stickyBubbleVO2 = (StickyBubbleVO) getBoundData();
        handler.postDelayed(gVar, timeUnit.toMillis((stickyBubbleVO2 == null || (selectedStateTimeout = stickyBubbleVO2.getSelectedStateTimeout()) == null) ? 0L : selectedStateTimeout.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showSelectedBubble$lambda$4(StickyBubbleViewHolder stickyBubbleViewHolder) {
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) stickyBubbleViewHolder.getBoundData();
        if (stickyBubbleVO != null) {
            stickyBubbleVO.setShouldShow(false);
        }
        stickyBubbleViewHolder.hideBubble();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void shrinkBubble() {
        StickyBubbleVO stickyBubbleVO;
        StickyBubbleView containerView = getContainerView();
        if (containerView == null || (stickyBubbleVO = (StickyBubbleVO) getBoundData()) == null || !stickyBubbleVO.getShouldShow() || containerView.getTitleView().getVisibility() != 0) {
            return;
        }
        this.stateChangeHandler.postDelayed(new J2.b(3, containerView, this), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void shrinkBubble$lambda$14$lambda$13(StickyBubbleView stickyBubbleView, StickyBubbleViewHolder stickyBubbleViewHolder) {
        stickyBubbleView.shrink();
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) stickyBubbleViewHolder.getBoundData();
        if (stickyBubbleVO != null) {
            stickyBubbleVO.setShrunk(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void trackBubbleSelectedView() {
        StickyBubbleVO.StickyBubbleStateVO selectedState;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) getBoundData();
        if (stickyBubbleVO == null || (selectedState = stickyBubbleVO.getSelectedState()) == null || (trackingInfo = selectedState.getTrackingInfo()) == null) {
            return;
        }
        l lVar = this.tokenizedAnalytics;
        StickyBubbleVO stickyBubbleVO2 = (StickyBubbleVO) getBoundData();
        TokenizedAnalyticsExtensionsKt.processViewEvents(lVar, TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, stickyBubbleVO2 != null ? Long.valueOf(stickyBubbleVO2.getId()) : null, null), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g trackBubbleSelectedView$lambda$9$lambda$8(a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, U.i(new Pair("elementType", "preview")), null, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void trackBubbleView() {
        StickyBubbleVO.StickyBubbleStateVO defaultState;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        StickyBubbleVO stickyBubbleVO = (StickyBubbleVO) getBoundData();
        if (stickyBubbleVO == null || (defaultState = stickyBubbleVO.getDefaultState()) == null || (trackingInfo = defaultState.getTrackingInfo()) == null) {
            return;
        }
        l lVar = this.tokenizedAnalytics;
        StickyBubbleVO stickyBubbleVO2 = (StickyBubbleVO) getBoundData();
        TokenizedAnalyticsExtensionsKt.processViewEvents(lVar, TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, stickyBubbleVO2 != null ? Long.valueOf(stickyBubbleVO2.getId()) : null, null), new e() { // from class: VW.c
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g trackBubbleView$lambda$7$lambda$6;
                trackBubbleView$lambda$7$lambda$6 = StickyBubbleViewHolder.trackBubbleView$lambda$7$lambda$6(StickyBubbleViewHolder.this, (UZ.d) aVar, gVar);
                return trackBubbleView$lambda$7$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g trackBubbleView$lambda$7$lambda$6(StickyBubbleViewHolder stickyBubbleViewHolder, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return stickyBubbleViewHolder.getDynamicCustomParams(params);
    }

    private final void trackDefaultStateClickEvent(StickyBubbleVO item) {
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getDefaultState().getTrackingInfo();
        if (trackingInfo != null) {
            m.a(this.tokenizedAnalytics, TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(item.getId()), null), new C2668a(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g trackDefaultStateClickEvent$lambda$11$lambda$10(StickyBubbleViewHolder stickyBubbleViewHolder, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return stickyBubbleViewHolder.getDynamicCustomParams(params);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        ComposerViewExtensionKt.composerRecyclerView(this.container.Y()).removeOnScrollListener(this.scrollListener);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyBubbleVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.stateChangeHandler.removeCallbacksAndMessages(null);
        if (this.canShow) {
            if (item.getIsSelected() && !item.getIsSubscribed() && item.getShouldShow() && !item.getIsClicked()) {
                StickyBubbleView containerView = getContainerView();
                if (containerView != null) {
                    StickyBubbleVO.StickyBubbleStateVO selectedState = item.getSelectedState();
                    containerView.setBubbleBackground(selectedState != null ? selectedState.getBackgroundColor() : null);
                }
                bindSelectedBubble();
                return;
            }
            StickyBubbleView containerView2 = getContainerView();
            if (containerView2 != null) {
                containerView2.setBubbleBackground(item.getDefaultState().getBackgroundColor());
            }
            if (!item.getIsSelected() && item.getShouldShow()) {
                showDefaultBubble();
            } else if (item.getIsSelected() && item.getShouldShow() && item.getIsClicked()) {
                showSelectedBubble();
            } else {
                hideBubble();
            }
        }
    }
}
