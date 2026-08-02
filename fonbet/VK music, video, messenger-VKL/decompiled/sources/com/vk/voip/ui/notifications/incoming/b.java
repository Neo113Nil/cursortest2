package com.vk.voip.ui.notifications.incoming;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.vk.bridges.CompanionApp;
import com.vk.log.L;
import com.vk.voip.ui.notifications.incoming.a;
import com.vk.voip.ui.notifications.incoming.d;
import com.vk.voip.ui.notifications.incoming.e;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.btw0;
import xsna.dd70;
import xsna.epx;
import xsna.f1j;
import xsna.g5u0;
import xsna.gp;
import xsna.gz80;
import xsna.j6i;
import xsna.kdw0;
import xsna.lj70;
import xsna.m2j;
import xsna.mdw0;
import xsna.n7w;
import xsna.nsw;
import xsna.p4g;
import xsna.pm1;
import xsna.psw;
import xsna.sfg;
import xsna.u370;
import xsna.x870;
import xsna.xsw;
import xsna.yj70;

/* compiled from: IncomingCallNotifier.kt */
/* loaded from: classes7.dex */
public final class b {
    public final Context a;
    public final c b;
    public final yj70 c;
    public final a d;
    public final nsw e;
    public final psw f;
    public final kdw0<mdw0> g;
    public final NotificationManager h;
    public final String i;
    public final lj70 j;
    public final g5u0 k;
    public final com.vk.voip.ui.notifications.incoming.a l;
    public boolean m;
    public final io.reactivex.rxjava3.disposables.b n;

    /* compiled from: IncomingCallNotifier.kt */
    public static final class a {
        public final xsw a;
        public final sfg b;
        public final m2j c;

        public a(xsw xswVar, sfg sfgVar, m2j m2jVar) {
            this.a = xswVar;
            this.b = sfgVar;
            this.c = m2jVar;
        }
    }

    /* compiled from: IncomingCallNotifier.kt */
    /* renamed from: com.vk.voip.ui.notifications.incoming.b$b, reason: collision with other inner class name */
    public final class C2069b implements psw.a {
        public C2069b() {
        }

        @Override // xsna.psw.a
        public final void a() {
            b.this.d.b.invoke();
        }

        @Override // xsna.psw.a
        public final void onAccept() {
            b.this.d.a.invoke();
        }
    }

    /* compiled from: IncomingCallNotifier.kt */
    public static final class c {
        public final int a;
        public final d.b b;
        public final d.c c;
        public final n7w d;

        public c(int i, d.b bVar, d.c cVar, n7w n7wVar) {
            this.a = i;
            this.b = bVar;
            this.c = cVar;
            this.d = n7wVar;
        }
    }

    /* compiled from: IncomingCallNotifier.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CompanionApp.State.values().length];
            try {
                iArr[CompanionApp.State.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CompanionApp.State.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(Context context, c cVar, yj70 yj70Var, a aVar, nsw nswVar, psw pswVar, kdw0<mdw0> kdw0Var) {
        this.a = context;
        this.b = cVar;
        this.c = yj70Var;
        this.d = aVar;
        this.e = nswVar;
        this.f = pswVar;
        this.g = kdw0Var;
        this.h = (NotificationManager) context.getSystemService("notification");
        String uuid = UUID.randomUUID().toString();
        this.i = uuid;
        C2069b c2069b = new C2069b();
        this.j = new lj70(context);
        this.k = new g5u0(context);
        this.l = new com.vk.voip.ui.notifications.incoming.a(context, new com.vk.voip.ui.notifications.incoming.c(this), new a.b(cVar.b, cVar.c, cVar.d));
        this.n = new io.reactivex.rxjava3.disposables.b();
        pswVar.b(uuid, c2069b);
        Collection<CompanionApp> values = j6i.a().f().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!epx.f((CompanionApp) obj, j6i.a().e())) {
                arrayList.add(obj);
            }
        }
        q qVar = g0.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q<CompanionApp.State> b = ((CompanionApp) it.next()).b();
            qVar.getClass();
            qVar = q.X(qVar, b);
        }
        this.n.b(qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pm1(new f1j(this, 20), 25)));
    }

    public final void a() {
        this.h.cancel(this.b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e b() {
        Object[] objArr;
        x870 x870Var = x870.a;
        Context context = this.a;
        x870.a(context);
        boolean areNotificationsEnabled = new dd70(context).b.areNotificationsEnabled();
        boolean a2 = gz80.a(29);
        boolean z = false;
        NotificationManager notificationManager = this.h;
        boolean areNotificationsPaused = a2 ? notificationManager.areNotificationsPaused() : false;
        int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
        boolean z2 = (currentInterruptionFilter == 0 || currentInterruptionFilter == 1 || (currentInterruptionFilter != 2 && currentInterruptionFilter != 3 && currentInterruptionFilter != 4)) ? false : true;
        boolean z3 = (!areNotificationsEnabled || areNotificationsPaused || z2) ? false : true;
        StringBuilder c2 = gp.c("Notifications enabled state: ", ", ", ", ", areNotificationsEnabled, areNotificationsPaused);
        c2.append(z2);
        L.e("IncomingCallNotifier", c2.toString());
        Boolean bool = null;
        bool = null;
        if (z3 && gz80.a(26)) {
            boolean e = u370.e(notificationManager, "calls");
            NotificationChannel notificationChannel = gz80.a(26) ? notificationManager.getNotificationChannel("incoming_calls") : null;
            Object[] objArr2 = notificationChannel != null && notificationChannel.getImportance() > 2;
            lj70 lj70Var = this.j;
            lj70Var.getClass();
            try {
                ((NotificationManager) ((bpn0) lj70Var.b).getValue()).getActiveNotifications();
                objArr = true;
            } catch (Throwable unused) {
                objArr = false;
            }
            if (e && objArr2 != false && objArr != false) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            z3 = z;
        }
        if (z3) {
            return e.b.a;
        }
        ArrayList arrayList = new ArrayList();
        p4g.a(VoipNotificationDisabledReason.NOTIFICATIONS_DISABLED, arrayList, !areNotificationsEnabled);
        p4g.a(VoipNotificationDisabledReason.CHANNEL_DISABLED, arrayList, epx.f(bool, Boolean.FALSE));
        p4g.a(VoipNotificationDisabledReason.NOTIFICATIONS_PAUSED, arrayList, areNotificationsPaused);
        p4g.a(VoipNotificationDisabledReason.DO_NOT_DISTURB_MODE, arrayList, z2);
        return new e.a(arrayList);
    }

    public final void c(String str, boolean z, boolean z2) {
        e b = b();
        boolean z3 = b instanceof e.b;
        Context context = this.a;
        if (z3) {
            x870 x870Var = x870.a;
            x870.a(context);
            lj70 lj70Var = this.j;
            try {
                bpn0 bpn0Var = (bpn0) lj70Var.b;
                int length = ((NotificationManager) bpn0Var.getValue()).getActiveNotifications().length;
                if (length >= (gz80.a(29) ? 25 : 50)) {
                    lj70Var.b(this.c);
                }
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.q(th);
            }
            Notification a2 = this.l.a(str, z);
            if (a2 != null) {
                try {
                    L.e("IncomingCallNotifier", "Enqueue incoming call notification");
                    this.h.notify(this.b.a, a2);
                    L.e("IncomingCallNotifier", "Notification successfully displayed as notification remote views");
                    return;
                } catch (Throwable th2) {
                    L.f("IncomingCallNotifier", "Error while enqueue incoming call notification", th2);
                }
            }
        } else {
            if (!(b instanceof e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                this.g.b(new btw0.b.a(((e.a) b).a));
            }
        }
        L.e("IncomingCallNotifier", "We have got a troubles while trying to display incoming call notification, let us try as activity (if possible)");
        if (!this.k.b() && !Settings.canDrawOverlays(context)) {
            L.e("IncomingCallNotifier", "Display notification as activity is not enabled");
            return;
        }
        Intent intent = (Intent) this.d.c.invoke();
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Throwable th3) {
            com.vk.metrics.eventtracking.b.a.q(th3);
        }
    }
}
