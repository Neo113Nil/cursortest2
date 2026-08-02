package ru.ozon.app.android.actionHandlers.ugc.dismissAndOpenGallery;

import NZ.d;
import Tg.b;
import Vg.f;
import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/dismissAndOpenGallery/DismissAndOpenGalleryActionHandler;", "LVg/f;", "<init>", "()V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lk20/g;", "widgetComponentStorage", "", "processDismiss", "(La00/f;Lk20/g;)V", "setOpenGalleryResult", "(La00/f;)V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DismissAndOpenGalleryActionHandler extends f {

    @NotNull
    private final String actionId = "dismissAndOpenGallery";

    private final void processDismiss(C4911f container, C7475g widgetComponentStorage) {
        ComponentCallbacksC5392m c11 = container.c();
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        if (parentFragment instanceof C9011c) {
            ((C9011c) parentFragment).close();
            return;
        }
        if (parentFragment instanceof DialogInterfaceOnCancelListenerC5390k) {
            ((DialogInterfaceOnCancelListenerC5390k) parentFragment).dismiss();
            return;
        }
        if (!(parentFragment instanceof d)) {
            ((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerNavigator().popBackStack();
            return;
        }
        d dVar = (d) parentFragment;
        if (dVar.canHandleBackStack()) {
            dVar.getChildFragmentManager().P0();
        } else {
            dVar.getParentFragmentManager().P0();
        }
    }

    private final void setOpenGalleryResult(C4911f container) {
        G supportFragmentManager;
        r a11 = container.a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.m1(androidx.core.os.d.a(), "open_gallery_key");
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        C4911f a11 = widgetInfo.a();
        setOpenGalleryResult(a11);
        processDismiss(a11, widgetComponentStorage);
    }
}
