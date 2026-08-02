package ru.ozon.app.android.debugmenu.debugwidgets;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/debugmenu/debugwidgets/WidgetsDebugToolsHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/core/app/l$a;", "createEnableWidgetDebugAction", "(Landroid/content/Context;)Landroidx/core/app/l$a;", "createDisableWidgetDebugAction", "Landroid/app/PendingIntent;", "createOpenWidgetsDebugToolsIntent", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "Landroid/content/Intent;", "createOpenIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "createEnableIntent", "createDisableIntent", "intent", "", "requestCode", "createPendingIntent", "(Landroid/content/Context;Landroid/content/Intent;I)Landroid/app/PendingIntent;", "Landroid/app/NotificationChannel;", "createDebugChannel", "()Landroid/app/NotificationChannel;", "Lru/ozon/app/android/debugmenu/debugwidgets/DebugNotification;", "createWidgetsDebugToolsNotification", "(Landroid/content/Context;)Lru/ozon/app/android/debugmenu/debugwidgets/DebugNotification;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetsDebugToolsHelper {

    @NotNull
    public static final WidgetsDebugToolsHelper INSTANCE = new WidgetsDebugToolsHelper();

    private WidgetsDebugToolsHelper() {
    }

    private final Intent createDisableIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) WidgetsDebugToolsActivity.class);
        intent.putExtra("action", "disableWidgetsDebugTools");
        return intent;
    }

    private final l.a createDisableWidgetDebugAction(Context context) {
        return new l.a(R$drawable.ic_m_cross, "Выкл", createPendingIntent(context, createDisableIntent(context), 3));
    }

    private final Intent createEnableIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) WidgetsDebugToolsActivity.class);
        intent.putExtra("action", "enableWidgetsDebugTools");
        return intent;
    }

    private final l.a createEnableWidgetDebugAction(Context context) {
        return new l.a(ru.ozon.app.android.uikit.R$drawable.ic_check_mark, "Вкл", createPendingIntent(context, createEnableIntent(context), 2));
    }

    private final Intent createOpenIntent(Context context) {
        return new Intent(context, (Class<?>) WidgetsDebugToolsActivity.class);
    }

    private final PendingIntent createOpenWidgetsDebugToolsIntent(Context context) {
        return createPendingIntent(context, createOpenIntent(context), 1);
    }

    private final PendingIntent createPendingIntent(Context context, Intent intent, int requestCode) {
        PendingIntent activity = PendingIntent.getActivity(context, requestCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public final NotificationChannel createDebugChannel() {
        return new NotificationChannel("channel-debug", "Widgets Debug Tools", 4);
    }

    @NotNull
    public final DebugNotification createWidgetsDebugToolsNotification(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        l.d dVar = new l.d(context, "channel-debug");
        dVar.d(false);
        dVar.C(ru.ozon.app.android.atoms.R$drawable.ic_debug);
        dVar.j("Widgets Debug Tools");
        dVar.i("Show options");
        l.a createEnableWidgetDebugAction = createEnableWidgetDebugAction(context);
        if (createEnableWidgetDebugAction != null) {
            dVar.f41967b.add(createEnableWidgetDebugAction);
        }
        l.a createDisableWidgetDebugAction = createDisableWidgetDebugAction(context);
        if (createDisableWidgetDebugAction != null) {
            dVar.f41967b.add(createDisableWidgetDebugAction);
        }
        dVar.E(null);
        dVar.h(createOpenWidgetsDebugToolsIntent(context));
        Notification b11 = dVar.b();
        Intrinsics.checkNotNullExpressionValue(b11, "build(...)");
        return new DebugNotification(b11, 0, "tag-widget-debug-tools");
    }
}
