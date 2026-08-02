package ru.ozon.app.android.favorites.ui.actionhandler;

import G.g;
import androidx.core.app.t;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.data.family.GetLinkResponse;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.actionhandler.utils.ActionsUtilsKt;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u00020\t*\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FamilyGetLinkActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "getLink", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "share", "Lru/ozon/app/android/favorites/data/family/GetLinkResponse;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FamilyGetLinkActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId = "familyGetLink";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FamilyGetLinkActionHandler$Companion;", "", "<init>", "()V", "GET_LINK_ACTION_ID", "", "POST_DATA_KEY", "SHARE_TYPE", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void getLink(CustomActionHandler.HandlerReferences handlerRefs, AtomAction.ComposerAction action) {
        InterfaceC7851b composerController = ((RetainComposerComponentApi) handlerRefs.getRefs().getComponent(RetainComposerComponentApi.class)).getComposerController();
        ActionV2Repository actionRepository = ((ActionComponentApi) handlerRefs.getRefs().getComponent(ActionComponentApi.class)).getActionRepository();
        JsonParser jsonDeserializer = ((NetworkComponentApi) handlerRefs.getRefs().getComponent(NetworkComponentApi.class)).getJsonDeserializer();
        C10727i.c(K.a(handlerRefs.getRefs().getContainer().e()), C10720e0.a().plus(ActionsUtilsKt.actionExceptionHandler(handlerRefs)), null, new FamilyGetLinkActionHandler$getLink$1(composerController, action, actionRepository, handlerRefs, ((FavoriteCoreComponentApi) handlerRefs.getRefs().getComponent(FavoriteCoreComponentApi.class)).getFamilyAccountRefresher(), jsonDeserializer, this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void share(GetLinkResponse getLinkResponse, CustomActionHandler.HandlerReferences handlerReferences) {
        r a11;
        String str;
        String link = getLinkResponse.getLink();
        if (link == null || (a11 = handlerReferences.getRefs().getContainer().a()) == null) {
            return;
        }
        String title = getLinkResponse.getTitle();
        if (title == null || (str = g.c(title, "\n", link)) == null) {
            str = link;
        }
        t.a aVar = new t.a(a11);
        aVar.g("text/plain");
        aVar.f(str);
        aVar.d(link);
        aVar.h();
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
            getLink(handlerRefs, (AtomAction.ComposerAction) action);
        }
    }
}
