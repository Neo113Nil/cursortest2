package ru.ozon.app.android.favorites.ui.actionhandler;

import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.actionhandler.utils.ActionsUtilsKt;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FamilyActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "doAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FamilyActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId = "familyAction";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FamilyActionHandler$Companion;", "", "<init>", "()V", "FAMILY_ACTION_ID", "", "POST_DATA_KEY", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void doAction(CustomActionHandler.HandlerReferences handlerRefs, AtomAction.ComposerAction action) {
        InterfaceC7851b composerController = ((RetainComposerComponentApi) handlerRefs.getRefs().getComponent(RetainComposerComponentApi.class)).getComposerController();
        JsonParser jsonDeserializer = ((NetworkComponentApi) handlerRefs.getRefs().getComponent(NetworkComponentApi.class)).getJsonDeserializer();
        C10727i.c(K.a(handlerRefs.getRefs().getContainer().e()), C10720e0.a().plus(ActionsUtilsKt.actionExceptionHandler(handlerRefs)), null, new FamilyActionHandler$doAction$1(composerController, action, ((ActionComponentApi) handlerRefs.getRefs().getComponent(ActionComponentApi.class)).getActionRepository(), handlerRefs, ((FavoriteCoreComponentApi) handlerRefs.getRefs().getComponent(FavoriteCoreComponentApi.class)).getFamilyAccountRefresher(), jsonDeserializer, null), 2);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            doAction(handlerRefs, (AtomAction.ComposerAction) action);
        }
    }
}
