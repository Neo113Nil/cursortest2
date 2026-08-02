package com.vk.pushes.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.maybe.x;
import io.reactivex.rxjava3.internal.operators.single.t;
import xsna.asu0;
import xsna.bza;
import xsna.c0a;
import xsna.epx;
import xsna.gn0;
import xsna.hwg0;
import xsna.itg0;
import xsna.iwg0;
import xsna.jwg0;
import xsna.kwg0;
import xsna.l7x;
import xsna.o25;
import xsna.o970;
import xsna.qa20;
import xsna.s440;
import xsna.to8;
import xsna.ui70;
import xsna.v1b;
import xsna.wmi0;
import xsna.y320;
import xsna.yh70;
import xsna.z4g;

/* compiled from: NotificationDeleteReceiver.kt */
/* loaded from: classes5.dex */
public final class NotificationDeleteReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* compiled from: NotificationDeleteReceiver.kt */
    public static final class a {
        public static Intent a(Context context, String str, String str2, int i, String str3) {
            Intent putExtra = new Intent(context, (Class<?>) NotificationDeleteReceiver.class).putExtra("push_type_key", str).putExtra("notification_id", i).putExtra("notification_tag_id", str3);
            if (str2 != null) {
                putExtra.putExtra("stat_key", str2);
            }
            return putExtra;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("notification_id", Integer.MIN_VALUE);
        String stringExtra = intent.getStringExtra("notification_tag_id");
        Integer valueOf = Integer.valueOf(intExtra);
        yh70.b.d(stringExtra, valueOf);
        o970.b.d(stringExtra, valueOf);
        if (intent.hasExtra("stat_key")) {
            ui70.L(z4g.d(), "clear", intent.getStringExtra("push_type_key"), intent.getStringExtra("stat_key"), null, String.valueOf(o25.a().c().b), null, 104);
        }
        int i = 0;
        if (epx.f(intent.getAction(), "delete_mention_from_cache")) {
            long longExtra = intent.getLongExtra("mention_dialog_id", -1L);
            int intExtra2 = intent.getIntExtra("mention_cnv_msg_id", 0);
            y320 y320Var = y320.b;
            t a2 = y320.a(intExtra2, longExtra);
            asu0.a.getClass();
            x k = a2.k(asu0.i());
            l7x l7xVar = itg0.a;
            int i2 = kwg0.a;
            k.subscribe(new iwg0(), new hwg0());
        }
        long longExtra2 = intent.getLongExtra("peer_id", 0L);
        if (longExtra2 == 0) {
            return;
        }
        long longExtra3 = intent.getLongExtra("owner_id", 0L);
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            int i3 = 10;
            if (hashCode == 346984441) {
                if (!action.equals("delete_push_message_cache") || longExtra3 == 0) {
                    return;
                }
                qa20 qa20Var = qa20.b;
                Long valueOf2 = Long.valueOf(longExtra3);
                c0a c0aVar = qa20Var.a;
                q f = c0aVar.f(longExtra2, valueOf2);
                s440 s440Var = new s440(new bza(longExtra2, c0aVar, valueOf2, 1), i3);
                String str = (String) c0aVar.c;
                int i4 = kwg0.a;
                f.subscribe(s440Var, new jwg0(str));
                return;
            }
            if (hashCode == 463795607) {
                if (action.equals("delete_business_notify_cache")) {
                    q h = wmi0.a.h("push_business_notify_" + longExtra2);
                    gn0 gn0Var = new gn0(new to8(longExtra2, i), 5);
                    int i5 = kwg0.a;
                    h.subscribe(gn0Var, new jwg0("BusinessNotifyNotificationCache"));
                    return;
                }
                return;
            }
            if (hashCode == 1143017906 && action.equals("delete_channel_cache") && longExtra3 != 0) {
                v1b v1bVar = v1b.b;
                Long valueOf3 = Long.valueOf(longExtra3);
                c0a c0aVar2 = v1bVar.a;
                q f2 = c0aVar2.f(longExtra2, valueOf3);
                s440 s440Var2 = new s440(new bza(longExtra2, c0aVar2, valueOf3, 1), i3);
                String str2 = (String) c0aVar2.c;
                int i6 = kwg0.a;
                f2.subscribe(s440Var2, new jwg0(str2));
            }
        }
    }
}
