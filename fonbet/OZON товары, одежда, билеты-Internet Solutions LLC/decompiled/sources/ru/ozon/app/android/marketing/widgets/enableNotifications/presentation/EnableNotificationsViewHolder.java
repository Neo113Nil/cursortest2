package ru.ozon.app.android.marketing.widgets.enableNotifications.presentation;

import Bl.b;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.marketing.databinding.WidgetAllowPushBinding;
import ru.ozon.app.android.marketing.utils.MarketingNotificationHelper;
import ru.ozon.app.android.marketing.widgets.enableNotifications.core.EnableNotificationsViewMapper;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsVO;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.view.EnableNotificationsSuccessView;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.view.EnableNotificationsView;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001C\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0014J!\u0010 \u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J3\u0010.\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\n\u00102\u001a\u000600j\u0002`1H\u0014¢\u0006\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00109R\u001a\u00102\u001a\u000600j\u0002`18\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u0010:R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00120=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00120=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00120=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/marketing/databinding/WidgetAllowPushBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/marketing/databinding/WidgetAllowPushBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModel;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "", "bindSystemState", "(Lru/ozon/app/android/marketing/databinding/WidgetAllowPushBinding;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;)V", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow$ApiState;", "stateToShow", "bindApiState", "(Lru/ozon/app/android/marketing/databinding/WidgetAllowPushBinding;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow$ApiState;)V", "", "message", "showSystemSuccessMsg", "(Ljava/lang/String;)V", "bindApiSuccessState", "", "icon", "showMessage", "(Ljava/lang/String;I)V", "", "isEnabled", "sendAnalytics", "(Z)V", "onAttach", "()V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;Ll20/d;)V", "Lru/ozon/app/android/marketing/databinding/WidgetAllowPushBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModel;", "LWZ/l;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;", "Ll20/d;", "isSystemNotificationSettingsOpened", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "systemActionHandler", "Lkotlin/jvm/functions/Function1;", "apiActionHandler", "closeActionHandler", "ru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewHolder$lifecycleObserver$1;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EnableNotificationsViewHolder extends k<EnableNotificationsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> apiActionHandler;

    @NotNull
    private final WidgetAllowPushBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> closeActionHandler;
    private d info;
    private boolean isSystemNotificationSettingsOpened;
    private EnableNotificationsVO item;

    @NotNull
    private final EnableNotificationsViewHolder$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Function1<AtomAction, Unit> systemActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final EnableNotificationsViewModel viewModel;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x008a, code lost:
    
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.lifecycle.I, ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewHolder$lifecycleObserver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EnableNotificationsViewHolder(@NotNull WidgetAllowPushBinding binding, @NotNull ComposerReferences references, @NotNull EnableNotificationsViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor) {
        super(r0);
        AbstractC5434v abstractC5434v;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.systemActionHandler = new ActionHandler.Builder(references, this).onClick(new EnableNotificationsViewHolder$systemActionHandler$1(this)).buildHandler();
        this.apiActionHandler = new ActionHandler.Builder(references, this).enableClickThrottling(handlersInhibitor).onClick(new EnableNotificationsViewHolder$apiActionHandler$1(this)).buildHandler();
        this.closeActionHandler = new ActionHandler.Builder(references, this).onComposerAction(new EnableNotificationsViewHolder$closeActionHandler$1(this)).buildHandler();
        ?? r32 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                EnableNotificationsVO enableNotificationsVO;
                boolean z11;
                EnableNotificationsVO.StateToShow stateToShow;
                EnableNotificationsVO enableNotificationsVO2;
                ComposerReferences composerReferences;
                EnableNotificationsVO enableNotificationsVO3;
                boolean z12;
                EnableNotificationsVO enableNotificationsVO4;
                Intrinsics.checkNotNullParameter(owner, "owner");
                enableNotificationsVO = EnableNotificationsViewHolder.this.item;
                if (enableNotificationsVO != null) {
                    boolean isSystemNotificationsTurnedOn = MarketingNotificationHelper.INSTANCE.isSystemNotificationsTurnedOn(EnableNotificationsViewHolder.this.getContext());
                    EnableNotificationsViewHolder.this.sendAnalytics(isSystemNotificationsTurnedOn);
                    if (isSystemNotificationsTurnedOn) {
                        z12 = EnableNotificationsViewHolder.this.isSystemNotificationSettingsOpened;
                        if (z12) {
                            EnableNotificationsViewHolder enableNotificationsViewHolder = EnableNotificationsViewHolder.this;
                            enableNotificationsVO4 = enableNotificationsViewHolder.item;
                            if (enableNotificationsVO4 == null) {
                                Intrinsics.n("item");
                                throw null;
                            }
                            enableNotificationsViewHolder.showSystemSuccessMsg(enableNotificationsVO4.getSystemSettingsState().getSuccessState());
                        }
                        stateToShow = new EnableNotificationsVO.StateToShow.ApiState(false);
                    } else {
                        z11 = EnableNotificationsViewHolder.this.isSystemNotificationSettingsOpened;
                        if (z11) {
                            EnableNotificationsViewHolder enableNotificationsViewHolder2 = EnableNotificationsViewHolder.this;
                            enableNotificationsVO2 = enableNotificationsViewHolder2.item;
                            if (enableNotificationsVO2 == null) {
                                Intrinsics.n("item");
                                throw null;
                            }
                            enableNotificationsViewHolder2.showMessage(enableNotificationsVO2.getSystemSettingsState().getErrorMessage(), R$drawable.ic_warning);
                        }
                        stateToShow = EnableNotificationsVO.StateToShow.SystemState.INSTANCE;
                    }
                    EnableNotificationsViewHolder.this.isSystemNotificationSettingsOpened = false;
                    composerReferences = EnableNotificationsViewHolder.this.references;
                    InterfaceC7851b controller = composerReferences.getController();
                    enableNotificationsVO3 = EnableNotificationsViewHolder.this.item;
                    if (enableNotificationsVO3 != null) {
                        controller.update(new EnableNotificationsViewMapper.UpdateAllowPushState(enableNotificationsVO3.getId(), stateToShow));
                    } else {
                        Intrinsics.n("item");
                        throw null;
                    }
                }
            }
        };
        this.lifecycleObserver = r32;
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 != null) {
            AbstractC5434v lifecycle = c11.getLifecycle();
            abstractC5434v = lifecycle;
        }
        r a11 = references.getContainer().a();
        abstractC5434v = a11 != null ? a11.getLifecycle() : 0;
        if (abstractC5434v != 0) {
            abstractC5434v.a(r32);
        }
    }

    private final void bindApiState(WidgetAllowPushBinding widgetAllowPushBinding, EnableNotificationsVO enableNotificationsVO, EnableNotificationsVO.StateToShow.ApiState apiState) {
        EnableNotificationsView enableNotificationsView = widgetAllowPushBinding.allowPushApiView;
        EnableNotificationsVO.State apiSettingsState = enableNotificationsVO.getApiSettingsState();
        if (apiSettingsState == null) {
            FrameLayout constraintLayout = widgetAllowPushBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewExtKt.gone(constraintLayout);
            InterfaceC7851b controller = this.references.getController();
            d dVar = this.info;
            if (dVar != null) {
                controller.p(dVar.d());
                return;
            } else {
                Intrinsics.n("info");
                throw null;
            }
        }
        EnableNotificationsView allowPushSystemView = widgetAllowPushBinding.allowPushSystemView;
        Intrinsics.checkNotNullExpressionValue(allowPushSystemView, "allowPushSystemView");
        ViewExtKt.gone(allowPushSystemView);
        EnableNotificationsSuccessView allowPushSuccessView = widgetAllowPushBinding.allowPushSuccessView;
        Intrinsics.checkNotNullExpressionValue(allowPushSuccessView, "allowPushSuccessView");
        ViewExtKt.gone(allowPushSuccessView);
        enableNotificationsView.setTitle(apiSettingsState.getTitle());
        enableNotificationsView.setSubtitle(apiSettingsState.getSubtitle());
        enableNotificationsView.setButton(apiSettingsState.getButton(), this.apiActionHandler, apiState.getTurnOnAtStart());
        if (apiState.getTurnOnAtStart()) {
            this.references.getController().update(new EnableNotificationsViewMapper.UpdateAllowPushState(enableNotificationsVO.getId(), new EnableNotificationsVO.StateToShow.ApiState(false)));
        }
        enableNotificationsView.setCloseButton(enableNotificationsVO.getCloseButton(), this.closeActionHandler);
        ViewExtKt.show(enableNotificationsView);
    }

    private final void bindApiSuccessState(WidgetAllowPushBinding widgetAllowPushBinding, EnableNotificationsVO enableNotificationsVO) {
        EnableNotificationsView allowPushSystemView = widgetAllowPushBinding.allowPushSystemView;
        Intrinsics.checkNotNullExpressionValue(allowPushSystemView, "allowPushSystemView");
        ViewExtKt.gone(allowPushSystemView);
        EnableNotificationsView allowPushApiView = widgetAllowPushBinding.allowPushApiView;
        Intrinsics.checkNotNullExpressionValue(allowPushApiView, "allowPushApiView");
        ViewExtKt.gone(allowPushApiView);
        EnableNotificationsSuccessView enableNotificationsSuccessView = widgetAllowPushBinding.allowPushSuccessView;
        EnableNotificationsVO.State apiSettingsState = enableNotificationsVO.getApiSettingsState();
        if (apiSettingsState != null) {
            enableNotificationsSuccessView.setTitle(apiSettingsState.getTitle(), apiSettingsState.getSuccessState());
            ViewExtKt.show(enableNotificationsSuccessView);
        } else {
            Intrinsics.f(enableNotificationsSuccessView);
            ViewExtKt.gone(enableNotificationsSuccessView);
        }
    }

    private final void bindSystemState(WidgetAllowPushBinding widgetAllowPushBinding, EnableNotificationsVO enableNotificationsVO) {
        EnableNotificationsView allowPushApiView = widgetAllowPushBinding.allowPushApiView;
        Intrinsics.checkNotNullExpressionValue(allowPushApiView, "allowPushApiView");
        ViewExtKt.gone(allowPushApiView);
        EnableNotificationsSuccessView allowPushSuccessView = widgetAllowPushBinding.allowPushSuccessView;
        Intrinsics.checkNotNullExpressionValue(allowPushSuccessView, "allowPushSuccessView");
        ViewExtKt.gone(allowPushSuccessView);
        EnableNotificationsView enableNotificationsView = widgetAllowPushBinding.allowPushSystemView;
        EnableNotificationsVO.State systemSettingsState = enableNotificationsVO.getSystemSettingsState();
        enableNotificationsView.setTitle(systemSettingsState.getTitle());
        enableNotificationsView.setSubtitle(systemSettingsState.getSubtitle());
        enableNotificationsView.setButton(systemSettingsState.getButton(), this.systemActionHandler, false);
        enableNotificationsView.setCloseButton(enableNotificationsVO.getCloseButton(), this.closeActionHandler);
        ViewExtKt.show(enableNotificationsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalytics(boolean isEnabled) {
        if (this.isSystemNotificationSettingsOpened) {
            if (isEnabled) {
                EnableNotificationsVO enableNotificationsVO = this.item;
                if (enableNotificationsVO == null) {
                    Intrinsics.n("item");
                    throw null;
                }
                t setTrackingInfo = enableNotificationsVO.getSetTrackingInfo();
                if (setTrackingInfo != null) {
                    TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.tokenizedAnalytics, setTrackingInfo, null, 2, null);
                    return;
                }
                return;
            }
            EnableNotificationsVO enableNotificationsVO2 = this.item;
            if (enableNotificationsVO2 == null) {
                Intrinsics.n("item");
                throw null;
            }
            t unsetTrackingInfo = enableNotificationsVO2.getUnsetTrackingInfo();
            if (unsetTrackingInfo != null) {
                TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.tokenizedAnalytics, unsetTrackingInfo, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(String message, int icon) {
        ViewGroup b11 = b.b(this.references);
        if (b11 != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, b11, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(icon), null, null, null, null, null, null, null, 6000L, null, null, this.references.getContainer().g(), 57306, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSystemSuccessMsg(String message) {
        showMessage(message, ru.ozon.uni.R$drawable.ic_m_clock_delivered_green);
        InterfaceC7851b controller = this.references.getController();
        d dVar = this.info;
        if (dVar != null) {
            controller.p(dVar.d());
        } else {
            Intrinsics.n("info");
            throw null;
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getAction().observe(this, new EnableNotificationsViewHolder$sam$androidx_lifecycle_Observer$0(new EnableNotificationsViewHolder$onAttach$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EnableNotificationsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAllowPushBinding widgetAllowPushBinding = this.binding;
        this.item = item;
        this.info = info;
        EnableNotificationsVO.StateToShow stateToShow = item.getStateToShow();
        if (Intrinsics.d(stateToShow, EnableNotificationsVO.StateToShow.SystemState.INSTANCE)) {
            bindSystemState(widgetAllowPushBinding, item);
        } else if (stateToShow instanceof EnableNotificationsVO.StateToShow.ApiState) {
            bindApiState(widgetAllowPushBinding, item, (EnableNotificationsVO.StateToShow.ApiState) item.getStateToShow());
        } else {
            if (!Intrinsics.d(stateToShow, EnableNotificationsVO.StateToShow.ApiSuccessState.INSTANCE)) {
                throw new o();
            }
            bindApiSuccessState(widgetAllowPushBinding, item);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull EnableNotificationsVO item, @NotNull c trackingData, f viewedPond) {
        t trackingInfo;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((EnableNotificationsViewHolder) item, trackingData, viewedPond);
        if ((!(item.getStateToShow() instanceof EnableNotificationsVO.StateToShow.ApiState) || ((EnableNotificationsVO.StateToShow.ApiState) item.getStateToShow()).getTurnOnAtStart()) && (trackingInfo = item.getTrackingInfo()) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}
