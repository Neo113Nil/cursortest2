package ru.ozon.app.android.bank.push.domain;

import Sc.o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import fh0.AbstractC6567b;
import fh0.C6568c;
import k90.AbstractC7611a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.notifications.domains.receivers.CopyBroadcastReceiver;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/bank/push/domain/NotificationToPushModelMapper;", "", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Lfh0/c;", "source", "Lk90/a;", "notification", "map", "(Lfh0/c;Lk90/a;)Lfh0/c;", "Landroid/content/Context;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationToPushModelMapper {

    @NotNull
    private final Context appContext;

    public NotificationToPushModelMapper(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    @NotNull
    public final C6568c map(@NotNull C6568c source, @NotNull AbstractC7611a notification) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notification, "notification");
        source.getClass();
        C6568c.a aVar = new C6568c.a(source);
        aVar.j(notification.f());
        aVar.i(notification.a());
        Integer b11 = notification.b();
        if (b11 != null) {
            aVar.f(b11.intValue());
        }
        String c11 = notification.c();
        if (c11 != null) {
            aVar.h(new C6568c.b.C1026c(c11));
            aVar.g();
        }
        if (notification instanceof AbstractC7611a.b) {
            AbstractC7611a.b bVar = (AbstractC7611a.b) notification;
            if (bVar.g().length() > 0) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(bVar.g()));
                intent.addFlags(67108864);
                aVar.b(new AbstractC6567b.C1023b(bVar.e(), intent));
            }
            String i11 = bVar.i();
            if (bVar.h() != null && i11 != null) {
                aVar.e(new NotificationToPushModelMapper$map$1(notification, CopyBroadcastReceiver.INSTANCE.getPendingIntent(this.appContext, i11)));
            }
        } else {
            if (!(notification instanceof AbstractC7611a.c) && !(notification instanceof AbstractC7611a.C1161a)) {
                throw new o();
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(notification.g()));
            intent2.addFlags(67108864);
            aVar.b(new AbstractC6567b.C1023b(notification.e(), intent2));
        }
        return aVar.a();
    }
}
