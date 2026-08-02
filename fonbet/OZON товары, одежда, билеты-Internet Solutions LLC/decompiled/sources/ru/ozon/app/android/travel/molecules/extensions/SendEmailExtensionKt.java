package ru.ozon.app.android.travel.molecules.extensions;

import Lm0.a;
import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.MailTo;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"", "Ll10/i;", "container", "", "mailTo", "(Ljava/lang/String;Ll10/i;)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/m;", "fragment", "Landroidx/lifecycle/J;", "viewOwner", "(Ljava/lang/String;Landroid/content/Context;Landroidx/fragment/app/m;Landroidx/lifecycle/J;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SendEmailExtensionKt {
    public static final void mailTo(@NotNull String str, @NotNull i container) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        mailTo(str, L11, container.K().b(), container.K().f());
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private static final void mailTo(String str, Context context, ComponentCallbacksC5392m componentCallbacksC5392m, J j11) {
        Object a11;
        NotificationLayoutManager asNotificationLayoutManager$default;
        if (MailTo.isMailTo(str)) {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str));
            try {
                r.Companion companion = r.INSTANCE;
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    ViewGroup rootView = ContextExtKt.getRootView(componentCallbacksC5392m);
                    if (rootView != null && (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) != null) {
                        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(StringProvider.getString(R$string.travel_send_email_error_android), null, 0, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 506, null), j11, null, 8, null).show();
                    }
                    return;
                }
                context.startActivity(Intent.createChooser(intent, StringProvider.getString(ru.ozon.app.android.uikit.R$string.browser_choser_title_implict_chooser)));
                a11 = Unit.f71690a;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            a.b bVar = a.f17149a;
            Throwable b11 = r.b(a11);
            if (b11 != null) {
                bVar.e(b11);
            }
        }
    }
}
