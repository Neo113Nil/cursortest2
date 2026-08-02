package ru.ozon.app.android.ui.switchingbutton.delegates;

import WZ.t;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ResponseRedirectAction;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonAction;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonUtilsKt;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SwitchingButtonComposerActionWithRedirectDelegate$processAction$1 extends AbstractC7737t implements Function1 {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ t $manualTokenizedEvent;
    final /* synthetic */ SwitchingButtonAction $switchingButtonAction;
    final /* synthetic */ SwitchingButtonComposerActionWithRedirectDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchingButtonComposerActionWithRedirectDelegate$processAction$1(SwitchingButtonComposerActionWithRedirectDelegate switchingButtonComposerActionWithRedirectDelegate, SwitchingButtonAction switchingButtonAction, t tVar, C4911f c4911f) {
        super(1);
        this.this$0 = switchingButtonComposerActionWithRedirectDelegate;
        this.$switchingButtonAction = switchingButtonAction;
        this.$manualTokenizedEvent = tVar;
        this.$container = c4911f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ActionV2Response<ResponseRedirectAction>) obj);
        return Unit.f71690a;
    }

    public final void invoke(ActionV2Response<ResponseRedirectAction> actionV2Response) {
        SwitchingButtonStateStorage switchingButtonStateStorage;
        switchingButtonStateStorage = this.this$0.switchingButtonStateStorage;
        switchingButtonStateStorage.addState(SwitchingButtonUtilsKt.toggleState(this.$switchingButtonAction));
        ResponseRedirectAction data = actionV2Response.getData();
        if (data != null) {
            SwitchingButtonComposerActionWithRedirectDelegate switchingButtonComposerActionWithRedirectDelegate = this.this$0;
            switchingButtonComposerActionWithRedirectDelegate.showRestriction(this.$container, data.getMessage());
            switchingButtonComposerActionWithRedirectDelegate.redirect(switchingButtonComposerActionWithRedirectDelegate.getRefs().getNavigator(), data.getRedirectLink());
        }
        t tVar = this.$manualTokenizedEvent;
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.this$0.getRefs().getTokenizedAnalytics(), tVar, null, 2, null);
        }
    }
}
