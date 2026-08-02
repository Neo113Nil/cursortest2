package ru.ozon.app.android.common.actionHandlers;

import Tg.b;
import Vg.f;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import i10.l;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/SaveLocaleActionHandler;", "LVg/f;", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "appLocaleRepository", "<init>", "(Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;)V", "LVg/f$a;", "widgetInfo", "", "showErrorAndClose", "(LVg/f$a;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "commonErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "LTg/b;", "action", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SaveLocaleActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final AppLocaleRepository appLocaleRepository;

    public SaveLocaleActionHandler(@NotNull AppLocaleRepository appLocaleRepository) {
        Intrinsics.checkNotNullParameter(appLocaleRepository, "appLocaleRepository");
        this.appLocaleRepository = appLocaleRepository;
        this.actionId = "saveLocale";
    }

    private final NotificationDTO commonErrorNotification() {
        return new NotificationDTO(StringProvider.getString(R$string.common_something_went_wrong_android), StringProvider.getString(R$string.common_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 508, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorAndClose(f.a widgetInfo) {
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        C4911f a11 = widgetInfo.a();
        ComponentCallbacksC5392m c11 = a11.c();
        if (c11 == null || (rootView = c11.getView()) == null) {
            rootView = ContextExtKt.getRootView(a11.a());
        }
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, commonErrorNotification(), a11.i(), null, 8, null).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (!(action instanceof AtomAction.ComposerAction) || (params = ((AtomAction.ComposerAction) action).getParams()) == null || (str = params.get("locale")) == null) {
            return;
        }
        ComposerReferences create = ((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerReferencesFactory().create(new C4911f(widgetInfo.a().e()), widgetInfo.b());
        create.getController().e(new l.a.C1079a(0L, null, 3));
        C10727i.c(K.a(widgetInfo.a().g()), null, null, new SaveLocaleActionHandler$processWidgetAction$1(this, str, create, widgetInfo, null), 3);
    }
}
