package ru.ozon.app.android.travel.actionhandler.addPassToWallet;

import Nk.a;
import Tg.b;
import Vg.f;
import a00.C4911f;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.core.app.t;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import java.io.File;
import java.util.Set;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001c\u001a\u00020\f*\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010$\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001a\u0010'\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/addPassToWallet/AddPassToWalletActionHandler;", "LVg/f;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "", "pass", "fileSuffix", "", "openFile", "(La00/f;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "Landroid/content/Context;", "context", "", "canBeHandled", "(Landroid/content/Intent;Landroid/content/Context;)Z", "message", "showError", "(La00/f;Ljava/lang/String;)V", "showAppNotFoundError", "(La00/f;)V", "showErrorAndReturn", "intent", "startActivitySafely", "(Landroid/content/Context;Landroid/content/Intent;La00/f;)V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lxe/B0;", "job", "Lxe/B0;", "", "supportedFileExtensions", "Ljava/util/Set;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddPassToWalletActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 job;

    @NotNull
    private final Set<String> supportedFileExtensions;

    public AddPassToWalletActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.actionId = "addPassToWallet";
        String[] elements = {"pkpass", "pkpasses"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.supportedFileExtensions = C7705l.j0(elements);
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final boolean canBeHandled(Intent intent, Context context) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openFile(C4911f container, String pass, String fileSuffix) {
        r a11 = container.a();
        if (a11 == null) {
            showErrorAndReturn(container);
            return;
        }
        File createFromBase64 = new TempFileDelegate(a11).createFromBase64(pass, fileSuffix);
        if (createFromBase64 == null) {
            showErrorAndReturn(container);
            return;
        }
        Uri d11 = FileProvider.d(a11, a11.getPackageName() + ".fileprovider", createFromBase64);
        String b11 = a.b("application/vnd.apple.", fileSuffix);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(d11, b11);
        intent.addFlags(1);
        t.a aVar = new t.a(a11);
        aVar.g(b11);
        aVar.e(d11);
        aVar.c(R$string.travel_file_share_choose_program_title_android);
        Intent addFlags = aVar.a().addFlags(1);
        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        if (canBeHandled(intent, a11)) {
            startActivitySafely(a11, intent, container);
        } else if (canBeHandled(addFlags, a11)) {
            startActivitySafely(a11, addFlags, container);
        } else {
            showAppNotFoundError(container);
        }
    }

    private final void showAppNotFoundError(C4911f container) {
        showError(container, StringProvider.getString(R$string.error_travel_app_not_found_error_android));
    }

    private final void showError(C4911f container, String message) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(message == null ? StringProvider.getString(ru.ozon.uni.R$string.error_flashbar_universal_network_error) : message, null, null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 510, null), container.g(), null, 8, null).show();
    }

    static /* synthetic */ void showError$default(AddPassToWalletActionHandler addPassToWalletActionHandler, C4911f c4911f, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        addPassToWalletActionHandler.showError(c4911f, str);
    }

    private final void showErrorAndReturn(C4911f container) {
        showError$default(this, container, null, 2, null);
    }

    private final void startActivitySafely(Context context, Intent intent, C4911f c4911f) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e11) {
            Lm0.a.f17149a.e(e11);
            showAppNotFoundError(c4911f);
        }
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
        if (action instanceof AtomAction.ComposerAction) {
            C4911f a11 = widgetInfo.a();
            InterfaceC7851b composerController = ((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerController();
            B0 b02 = this.job;
            if (b02 != null) {
                b02.j(null);
            }
            this.job = C10727i.c(K.a(a11.g()), null, null, new AddPassToWalletActionHandler$processWidgetAction$1(composerController, this, action, a11, null), 3);
        }
    }
}
