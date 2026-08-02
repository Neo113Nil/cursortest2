package ru.ozon.app.android.common.actionHandlers.shareLink;

import G.g;
import Pc.a;
import androidx.core.app.t;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkViewModel;", "viewModelProvider", "<init>", "(LPc/a;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "", "shareLink", "share", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareRequestLink;", "toShareRequestLink", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Lru/ozon/app/android/common/actionHandlers/shareLink/ShareRequestLink;", "processAction", "LPc/a;", "", "isSharing", "Z", "Lxe/M;", "scope", "Lxe/M;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareLinkActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;
    private boolean isSharing;

    @NotNull
    private final M scope;

    @NotNull
    private final a<ShareLinkViewModel> viewModelProvider;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkActionHandler$Companion;", "", "<init>", "()V", "SHARE_DATA_TYPE", "", "KEY_TEXT", "KEY_TITLE", "KEY_ACTION", "KEY_URL", "KEY_SHOULD_MINIFY", "SHARING_UI_DELAY", "", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ShareLinkActionHandler(@NotNull a<ShareLinkViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.viewModelProvider = viewModelProvider;
        this.scope = CoroutineUtilsKt.getSafeScope();
        this.actionId = "shareLink";
    }

    private final void handleAction(AtomAction action, CustomActionHandler.HandlerReferences handlerRefs) {
        boolean z11 = true;
        this.isSharing = true;
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            if (click.getLink() == null) {
                return;
            }
            Map<String, String> params = click.getParams();
            if (params != null && params.containsKey("shouldMinifyLink")) {
                z11 = Boolean.parseBoolean(params.get("shouldMinifyLink"));
            }
            if (z11) {
                ((ShareLinkViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler$handleAction$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        a aVar;
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        aVar = ShareLinkActionHandler.this.viewModelProvider;
                        ShareLinkViewModel shareLinkViewModel = (ShareLinkViewModel) aVar.get();
                        Intrinsics.g(shareLinkViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return shareLinkViewModel;
                    }
                }).a(ShareLinkViewModel.class)).onClickShare(toShareRequestLink(click), new ShareLinkActionHandler$handleAction$2$1(this, action, handlerRefs));
            } else {
                share$default(this, action, handlerRefs, null, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void share(AtomAction action, CustomActionHandler.HandlerReferences handlerRefs, String shareLink) {
        String str;
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            if (click.getLink() == null) {
                return;
            }
            if (shareLink == null) {
                Map<String, String> params = click.getParams();
                String str2 = params != null ? params.get("text") : null;
                if (str2 == null) {
                    str2 = "";
                }
                String link = click.getLink();
                shareLink = h.z0(str2 + " " + (link != null ? link : "")).toString();
            }
            Map<String, String> params2 = click.getParams();
            String str3 = params2 != null ? params2.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null;
            if (str3 == null || (str = g.c(str3, "\n", shareLink)) == null) {
                str = shareLink;
            }
            r a11 = handlerRefs.getRefs().getContainer().a();
            if (a11 == null) {
                return;
            }
            t.a aVar = new t.a(a11);
            aVar.g("text/plain");
            aVar.f(str);
            aVar.d(shareLink);
            aVar.h();
            C10727i.c(this.scope, null, null, new ShareLinkActionHandler$share$1(this, null), 3);
        }
    }

    static /* synthetic */ void share$default(ShareLinkActionHandler shareLinkActionHandler, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        shareLinkActionHandler.share(atomAction, handlerReferences, str);
    }

    private final ShareRequestLink toShareRequestLink(AtomAction.Click click) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> params = click.getParams();
        if (params == null || (str = params.get("action")) == null) {
            str = "minifyURL";
        }
        linkedHashMap.put(ImagesContract.URL, String.valueOf(click.getLink()));
        return new ShareRequestLink(str, linkedHashMap);
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
        if (this.isSharing) {
            return;
        }
        handleAction(action, handlerRefs);
    }
}
