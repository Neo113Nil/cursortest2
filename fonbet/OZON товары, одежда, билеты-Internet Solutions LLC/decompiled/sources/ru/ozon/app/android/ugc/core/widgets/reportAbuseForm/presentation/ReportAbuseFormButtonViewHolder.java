package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation;

import UZ.a;
import Vg.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001a0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormButtonVO;", "Landroid/view/ViewGroup;", "containerView", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/ViewGroup;Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "clickAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Z", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormButtonVO;Ll20/d;)V", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "", "currentReasonActionId", "Ljava/lang/String;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ReportAbuseFormButtonViewHolder extends k<ReportAbuseFormButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ViewGroup containerView;
    private String currentReasonActionId;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ReportAbuseFormViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseFormButtonViewHolder(@NotNull ViewGroup containerView, @NotNull ReportAbuseFormViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor handlersInhibitor, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).customAnalyticHandler(new ReportAbuseFormButtonViewHolder$actionHandler$1(this)).customActionHandlers(new ReportAbuseFormButtonViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean clickAction(AtomAction.Click action) {
        t tVar;
        final String str;
        Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
        if (trackingInfo != null) {
            ReportAbuseFormButtonVO boundedData = getBoundedData();
            if (boundedData != null) {
                tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundedData.getId()), null, 2, null);
            }
            return false;
        }
        tVar = null;
        String id2 = action.getId();
        if (Intrinsics.d(id2, "report")) {
            this.viewModel.onViewIntent(ReportAbuseFormViewModel.ViewIntent.ComplainButtonPressed.INSTANCE);
            l lVar = this.tokenizedAnalytics;
            if (tVar != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tVar, null, 2, null);
                return false;
            }
        } else if (Intrinsics.d(id2, "copyAndDismiss") && (str = this.currentReasonActionId) != null) {
            l lVar2 = this.tokenizedAnalytics;
            if (tVar != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents(lVar2, tVar, new e() { // from class: UU.a
                    @Override // WZ.e
                    public final g modifyParams(UZ.a aVar, g gVar) {
                        g clickAction$lambda$0;
                        clickAction$lambda$0 = ReportAbuseFormButtonViewHolder.clickAction$lambda$0(str, (UZ.d) aVar, gVar);
                        return clickAction$lambda$0;
                    }
                });
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g clickAction$lambda$0(String str, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, U.i(new Pair("reason", str)), null, 2);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C10727i.c(K.a(this), null, null, new ReportAbuseFormButtonViewHolder$onAttachViewModel$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReportAbuseFormButtonVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View view = ViewGroupExtKt.get(this.containerView, 0);
        ButtonView buttonView = view instanceof ButtonView ? (ButtonView) view : null;
        if (buttonView != null) {
            ButtonHolderKt.bind(buttonView, item.getComplainButton(), this.actionHandler);
        }
    }
}
