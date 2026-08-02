package ru.ozon.app.android.session.userAdultModalMobileV2.handlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/handlers/ComposerActionWithActionHandlerV2;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionHandler;", "postRefreshHandlerV2", "Lru/ozon/app/android/session/userAdultModalMobileV2/handlers/OneTimePostRefreshHandlerV2;", "appType", "Lru/ozon/app/android/utils/AppType;", "actionV2Repository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/session/userAdultModalMobileV2/handlers/OneTimePostRefreshHandlerV2;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "createActionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerActionWithActionHandlerV2 extends ComposerActionWithActionHandler {

    @NotNull
    private final OneTimePostRefreshHandlerV2 postRefreshHandlerV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerActionWithActionHandlerV2(@NotNull OneTimePostRefreshHandlerV2 postRefreshHandlerV2, @NotNull AppType appType, @NotNull ActionV2Repository actionV2Repository, @NotNull FeatureChecker featureChecker) {
        super(appType, actionV2Repository, featureChecker);
        Intrinsics.checkNotNullParameter(postRefreshHandlerV2, "postRefreshHandlerV2");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.postRefreshHandlerV2 = postRefreshHandlerV2;
    }

    @Override // ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler
    @NotNull
    protected Function1<AtomAction, Unit> createActionHandler(@NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        return new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new ComposerActionWithActionHandlerV2$createActionHandler$1(handlerRefs), new ComposerActionWithActionHandlerV2$createActionHandler$2(handlerRefs)).onPreProcess(new ComposerActionWithActionHandlerV2$createActionHandler$3(this, handlerRefs)).buildHandler();
    }
}
