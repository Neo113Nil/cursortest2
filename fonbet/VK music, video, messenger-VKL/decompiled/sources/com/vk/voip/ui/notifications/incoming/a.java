package com.vk.voip.ui.notifications.incoming;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.log.L;
import com.vk.voip.ui.notifications.incoming.IncomingNotificationTypeChooser;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dhr0;
import xsna.drm0;
import xsna.gz80;
import xsna.gzs;
import xsna.j1a0;
import xsna.t5m;
import xsna.zhy0;

/* compiled from: IncomingCallNotificationCreator.kt */
/* loaded from: classes7.dex */
public final class a {
    public final Context a;
    public final InterfaceC2068a b;
    public final b c;
    public final IncomingNotificationTypeChooser d;

    /* compiled from: IncomingCallNotificationCreator.kt */
    /* renamed from: com.vk.voip.ui.notifications.incoming.a$a, reason: collision with other inner class name */
    public interface InterfaceC2068a {
        PendingIntent a();

        NotificationCompat.a b();

        NotificationCompat.a c();
    }

    /* compiled from: IncomingCallNotificationCreator.kt */
    public static final class b {
        public final gzs<CharSequence> a;
        public final gzs<CharSequence> b;
        public final gzs<IconCompat> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(gzs<? extends CharSequence> gzsVar, gzs<? extends CharSequence> gzsVar2, gzs<? extends IconCompat> gzsVar3) {
            this.a = gzsVar;
            this.b = gzsVar2;
            this.c = gzsVar3;
        }
    }

    /* compiled from: IncomingCallNotificationCreator.kt */
    public static final class c {
        public final NotificationCompat.h a;
        public final NotificationCompat.a b;
        public final NotificationCompat.a c;

        public c(NotificationCompat.h hVar, NotificationCompat.a aVar, NotificationCompat.a aVar2) {
            this.a = hVar;
            this.b = aVar;
            this.c = aVar2;
        }
    }

    /* compiled from: IncomingCallNotificationCreator.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IncomingNotificationTypeChooser.Type.values().length];
            try {
                iArr[IncomingNotificationTypeChooser.Type.CUSTOM_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IncomingNotificationTypeChooser.Type.SYSTEM_DECORATED_CUSTOM_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IncomingNotificationTypeChooser.Type.INCOMING_CALL_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(Context context, InterfaceC2068a interfaceC2068a, b bVar) {
        this.a = context;
        this.b = interfaceC2068a;
        this.c = bVar;
        this.d = new IncomingNotificationTypeChooser(context);
    }

    public final Notification a(String str, boolean z) {
        NotificationCompat.a c2;
        c cVar;
        IncomingNotificationTypeChooser.Type type;
        PendingIntent pendingIntent;
        String str2 = str;
        com.vk.voip.ui.c.b.getClass();
        boolean a = com.vk.voip.ui.c.W().a();
        b bVar = this.c;
        Context context = this.a;
        CharSequence string = a ? context.getString(R.string.voip_contact_call_notification_title) : z ? bVar.b.invoke() : bVar.a.invoke();
        InterfaceC2068a interfaceC2068a = this.b;
        NotificationCompat.a b2 = interfaceC2068a.b();
        if (b2 == null || (c2 = interfaceC2068a.c()) == null) {
            cVar = null;
        } else {
            NotificationCompat.h hVar = new NotificationCompat.h(context, "incoming_calls");
            hVar.I.icon = z ? R.drawable.vk_icon_videocam_24 : R.drawable.vk_icon_phone_24;
            hVar.e = NotificationCompat.h.d(string);
            hVar.f = NotificationCompat.h.d(str2);
            hVar.k = 2;
            hVar.n(2, true);
            hVar.n(16, true);
            hVar.h = interfaceC2068a.a();
            hVar.n(128, true);
            hVar.l = false;
            hVar.u = NotificationCompat.CATEGORY_CALL;
            cVar = new c(hVar, b2, c2);
        }
        if (cVar == null) {
            return null;
        }
        NotificationCompat.a aVar = cVar.c;
        NotificationCompat.a aVar2 = cVar.b;
        NotificationCompat.h hVar2 = cVar.a;
        if (Build.VERSION.SDK_INT >= 34) {
            type = IncomingNotificationTypeChooser.Type.INCOMING_CALL_VIEW;
        } else {
            boolean a2 = gz80.a(31);
            boolean z2 = this.d.a.getApplicationInfo().targetSdkVersion >= 31;
            boolean z3 = z2 && a2;
            L.e("IncomingNotificationType", zhy0.a("isDecoratedType ", z3));
            L.e("IncomingNotificationType", "isApiAtLeastS " + a2 + " isTargetAtLeastS " + z2);
            type = z3 ? IncomingNotificationTypeChooser.Type.SYSTEM_DECORATED_CUSTOM_VIEW : IncomingNotificationTypeChooser.Type.CUSTOM_VIEW;
        }
        int i = d.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.remote_notification_call_view);
            remoteViews.setTextViewText(R.id.name, str2);
            remoteViews.setTextViewText(R.id.title, string);
            remoteViews.setOnClickPendingIntent(R.id.answer_btn, aVar2.j);
            remoteViews.setOnClickPendingIntent(R.id.decline_btn, aVar.j);
            if (dhr0.M()) {
                remoteViews.setTextColor(R.id.name, context.getColor(R.color.voip_notification_name_text_color));
                remoteViews.setInt(R.id.main_container, "setBackgroundColor", context.getColor(R.color.voip_notification_bg_color));
                remoteViews.setInt(R.id.separator_t, "setBackgroundColor", context.getColor(R.color.vk_gray_600));
            } else {
                remoteViews.setTextColor(R.id.name, context.getColor(R.color.vk_black));
                remoteViews.setInt(R.id.main_container, "setBackgroundColor", context.getColor(R.color.vk_white));
                remoteViews.setInt(R.id.separator_t, "setBackgroundColor", context.getColor(R.color.vk_gray_A150));
            }
            hVar2.A = remoteViews;
            hVar2.B = remoteViews;
            hVar2.b(aVar2);
            hVar2.b(aVar);
        } else if (i == 2) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.remote_notification_call_view_collapsed);
            remoteViews2.setTextViewText(R.id.name, str2);
            remoteViews2.setTextViewText(R.id.title, string);
            remoteViews2.setOnClickPendingIntent(R.id.answer_btn, aVar2.j);
            remoteViews2.setInt(R.id.answer_btn, "setColorFilter", -1);
            remoteViews2.setOnClickPendingIntent(R.id.decline_btn, aVar.j);
            remoteViews2.setInt(R.id.decline_btn, "setColorFilter", -1);
            hVar2.z = remoteViews2;
            if (!t5m.b()) {
                hVar2.B = remoteViews2;
            }
            hVar2.B(new NotificationCompat.j());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            PendingIntent pendingIntent2 = aVar2.j;
            if (pendingIntent2 != null && (pendingIntent = aVar.j) != null) {
                IconCompat invoke = bVar.c.invoke();
                if (drm0.N(str2)) {
                    str2 = !drm0.N(string) ? string : "-";
                }
                j1a0 j1a0Var = new j1a0();
                j1a0Var.a = str2;
                j1a0Var.b = invoke;
                j1a0Var.c = null;
                j1a0Var.d = null;
                j1a0Var.e = false;
                j1a0Var.f = true;
                hVar2.B(new NotificationCompat.i(1, j1a0Var, null, pendingIntent, pendingIntent2));
                hVar2.j(string);
            }
        }
        return hVar2.c();
    }
}
