package ru.ozon.app.android.common.actionHandlers;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponentKt;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/PickImageActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "<init>", "(Lru/ozon/app/android/network/version/AppVersionService;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/network/version/AppVersionService;", "LCi/k;", "galleryConfig$delegate", "LSc/j;", "getGalleryConfig", "()LCi/k;", "galleryConfig", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PickImageActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final AppVersionService appVersionService;

    /* renamed from: galleryConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j galleryConfig;

    public PickImageActionHandler(@NotNull AppVersionService appVersionService) {
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        this.appVersionService = appVersionService;
        this.galleryConfig = k.b(new PickImageActionHandler$galleryConfig$2(this));
        this.actionId = "pickImage";
    }

    private final Ci.k getGalleryConfig() {
        return (Ci.k) this.galleryConfig.getValue();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Bi.k galleryLauncher;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.Click) && (galleryLauncher = GalleryLauncherComponentKt.getGalleryLauncher(handlerRefs.getRefs().getComposerWidgetComponentStorage())) != null) {
            galleryLauncher.a(getGalleryConfig());
        }
    }
}
