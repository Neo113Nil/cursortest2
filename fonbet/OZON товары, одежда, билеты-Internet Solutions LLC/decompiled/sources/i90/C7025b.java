package i90;

import Sc.o;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.l;
import androidx.core.app.n;
import androidx.core.graphics.drawable.IconCompat;
import k90.AbstractC7611a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.notifications.domains.receivers.CopyBroadcastReceiver;

/* renamed from: i90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7025b implements InterfaceC7024a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66156a;

    public C7025b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66156a = context;
    }

    private final NotificationChannel e() {
        if ("ozonBankId = 1".length() > 0) {
            Object systemService = this.f66156a.getSystemService("notification");
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            if (notificationManager != null) {
                return notificationManager.getNotificationChannel("ozonBankId = 1");
            }
        }
        return null;
    }

    @Override // i90.InterfaceC7024a
    public final boolean a() {
        try {
            return n.e(this.f66156a).a();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // i90.InterfaceC7024a
    public final void b(@NotNull AbstractC7611a notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Context context = this.f66156a;
        l.d dVar = new l.d(context, "ozonBankId = 1");
        dVar.j(notification.f());
        Integer b11 = notification.b();
        if (b11 != null) {
            dVar.C(b11.intValue());
        }
        dVar.y(2);
        dVar.d(true);
        dVar.i(notification.a());
        l.c cVar = new l.c();
        cVar.d(notification.a());
        dVar.F(cVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "setStyle(...)");
        if (notification instanceof AbstractC7611a.b) {
            AbstractC7611a.b bVar = (AbstractC7611a.b) notification;
            if (bVar.g().length() > 0) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(bVar.g()));
                intent.addFlags(67108864);
                dVar.h(PendingIntent.getActivity(context, bVar.e(), intent, 67108864));
            }
            if (bVar.h() != null && bVar.i() != null) {
                dVar.f41967b.add(new l.a((IconCompat) null, bVar.h(), CopyBroadcastReceiver.INSTANCE.getPendingIntent(context, bVar.i())));
            }
        } else {
            if (!(notification instanceof AbstractC7611a.c) && !(notification instanceof AbstractC7611a.C1161a)) {
                throw new o();
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(notification.g()));
            intent2.addFlags(67108864);
            dVar.h(PendingIntent.getActivity(context, notification.e(), intent2, 67108864));
        }
        Notification b12 = dVar.b();
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.notify(c.INSTANCE.d(), b12);
        }
    }

    @Override // i90.InterfaceC7024a
    public final boolean c() {
        try {
            NotificationChannel e11 = e();
            if (e11 != null) {
                return e11.getImportance() != 0;
            }
            Object systemService = this.f66156a.getSystemService("notification");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel("ozonBankId = 1", "Все уведомления", 4));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // i90.InterfaceC7024a
    public final boolean d() {
        NotificationChannel e11 = e();
        return e11 == null || e11.getImportance() != 0;
    }
}
