package com.vk.voip.ui.notifications.incoming;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.vk.voip.ui.notifications.incoming.a;
import com.vkontakte.android.R;
import xsna.nsw;
import xsna.t2i0;

/* compiled from: IncomingCallNotifier.kt */
/* loaded from: classes7.dex */
public final class c implements a.InterfaceC2068a {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // com.vk.voip.ui.notifications.incoming.a.InterfaceC2068a
    public final PendingIntent a() {
        b bVar = this.a;
        return t2i0.a(bVar.a, 0, (Intent) bVar.d.c.invoke(), 167772160);
    }

    @Override // com.vk.voip.ui.notifications.incoming.a.InterfaceC2068a
    public final NotificationCompat.a b() {
        b bVar = this.a;
        nsw nswVar = bVar.e;
        Context context = bVar.a;
        PendingIntent b = nswVar.b(context, bVar.i);
        if (b == null) {
            return null;
        }
        return new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, context.getString(R.string.voip_call_notification_accept), b).b();
    }

    @Override // com.vk.voip.ui.notifications.incoming.a.InterfaceC2068a
    public final NotificationCompat.a c() {
        b bVar = this.a;
        nsw nswVar = bVar.e;
        Context context = bVar.a;
        PendingIntent a = nswVar.a(context, bVar.i);
        if (a == null) {
            return null;
        }
        return new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, context.getString(R.string.voip_call_notification_decline), a).b();
    }
}
