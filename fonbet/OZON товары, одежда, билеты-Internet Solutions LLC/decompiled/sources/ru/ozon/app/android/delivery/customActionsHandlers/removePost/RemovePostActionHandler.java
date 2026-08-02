package ru.ozon.app.android.delivery.customActionsHandlers.removePost;

import Pc.a;
import Wg0.b;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.DialogActionInfoDTO;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.RemovePostActionHandler;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0001*B#\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010$\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/removePost/RemovePostActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/delivery/customActionsHandlers/removePost/RemovePostViewModel;", "viewModelProvider", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(LPc/a;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "showDialog", "(Landroid/content/Context;Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/delivery/customActionsHandlers/removePost/DialogActionInfoDTO$NotificationInfoDTO;", "successInfo", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "showSuccessNotification", "(Lru/ozon/app/android/delivery/customActionsHandlers/removePost/DialogActionInfoDTO$NotificationInfoDTO;Lru/ozon/app/android/composer/ComposerReferences;)V", "showErrorNotification", "", "link", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "navigateTo", "(Ljava/lang/String;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "viewModel", "Lru/ozon/app/android/delivery/customActionsHandlers/removePost/RemovePostViewModel;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemovePostActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final RemovePostViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/removePost/RemovePostActionHandler$Companion;", "", "<init>", "()V", "KEY_POST_INFO", "", "KEY_DIALOG_INFO", "KEY_SUCCESS_INFO", "KEY_FAILURE_INFO", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RemovePostActionHandler(@NotNull a<RemovePostViewModel> viewModelProvider, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        RemovePostViewModel removePostViewModel = viewModelProvider.get();
        Intrinsics.checkNotNullExpressionValue(removePostViewModel, "get(...)");
        this.viewModel = removePostViewModel;
        this.actionId = "socialPostDelete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateTo(String link, ComposerNavigator navigator) {
        navigator.popBackStack();
        String uri = LinkGenerator.INSTANCE.clearToRootTab(link).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
    }

    private final void showDialog(Context context, AtomAction.Click action) {
        Map<String, String> params;
        String str;
        final String link = action.getLink();
        if (link == null || (params = action.getParams()) == null || (str = params.get("dialogInfo")) == null) {
            return;
        }
        Map<String, String> params2 = action.getParams();
        final String str2 = params2 != null ? params2.get("postInfo") : null;
        DialogInfoDTO dialogInfoDTO = (DialogInfoDTO) this.jsonDeserializer.fromJson(str, DialogInfoDTO.class);
        new f.a(context).setTitle(dialogInfoDTO.getTitle()).m(dialogInfoDTO.getActionText(), new DialogInterface.OnClickListener() { // from class: vs.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                RemovePostActionHandler.showDialog$lambda$1(RemovePostActionHandler.this, link, str2, dialogInterface, i11);
            }
        }).h(dialogInfoDTO.getCancelText(), new b(2)).q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$1(RemovePostActionHandler removePostActionHandler, String str, String str2, DialogInterface dialogInterface, int i11) {
        removePostActionHandler.viewModel.removePost(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(DialogActionInfoDTO.NotificationInfoDTO successInfo, ComposerReferences refs) {
        ViewGroup rootView = ContextExtKt.getRootView(refs.getContainer().a());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            String text = successInfo.getText();
            J viewLifecycleOwner = refs.getContainer().j().getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, text, null, 3000L, null, viewLifecycleOwner, 42, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSuccessNotification(DialogActionInfoDTO.NotificationInfoDTO successInfo, ComposerReferences refs) {
        ViewGroup rootView = ContextExtKt.getRootView(refs.getContainer().a());
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(successInfo.getText()), null, null, null, successInfo.getImage(), null, null, null, null, null, null, 3000L, null, null, refs.getContainer().g(), 57274, null).show();
        }
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
        if (action instanceof AtomAction.Click) {
            this.viewModel.getRemovePostResult().observe(handlerRefs.getRefs().getContainer().g(), new RemovePostActionHandler$sam$androidx_lifecycle_Observer$0(new RemovePostActionHandler$processAction$1$1(action, this, handlerRefs)));
            showDialog(handlerRefs.getRefs().getContainer().i(), (AtomAction.Click) action);
        }
    }
}
