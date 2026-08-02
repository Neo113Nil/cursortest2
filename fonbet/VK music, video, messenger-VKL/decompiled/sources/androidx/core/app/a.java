package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import xsna.c000;
import xsna.j1a0;
import xsna.kvf0;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes11.dex */
public final class a {
    public final Context a;
    public final Notification.Builder b;
    public final NotificationCompat.h c;
    public final Bundle d = new Bundle();
    public final int e;

    /* compiled from: NotificationCompatBuilder.java */
    /* renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    public static class C0023a {
        public static void a(Notification.Builder builder, boolean z) {
            builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static void b(Notification.Builder builder) {
            builder.setBubbleMetadata(null);
        }

        public static void c(Notification.Action.Builder builder, boolean z) {
            builder.setContextual(z);
        }

        public static void d(Notification.Builder builder, Object obj) {
            builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class b {
        public static void a(Notification.Action.Builder builder, boolean z) {
            builder.setAuthenticationRequired(z);
        }

        public static void b(Notification.Builder builder, int i) {
            builder.setForegroundServiceBehavior(i);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static final class c {
        public static void a(Notification.Builder builder) {
            builder.setShortCriticalText(null);
        }
    }

    public a(NotificationCompat.h hVar) {
        int i;
        Bundle[] bundleArr;
        ArrayList<NotificationCompat.a> arrayList;
        int i2;
        this.c = hVar;
        Context context = hVar.a;
        ArrayList<NotificationCompat.a> arrayList2 = hVar.d;
        this.a = context;
        Notification.Builder builder = new Notification.Builder(context, hVar.C);
        this.b = builder;
        Notification notification = hVar.I;
        Bundle[] bundleArr2 = null;
        int i3 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(hVar.e).setContentText(hVar.f).setContentInfo(null).setContentIntent(hVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(hVar.h, (notification.flags & 128) != 0).setNumber(hVar.j).setProgress(hVar.o, hVar.p, hVar.q);
        IconCompat iconCompat = hVar.i;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.l(context));
        builder.setSubText(hVar.n).setUsesChronometer(false).setPriority(hVar.k);
        NotificationCompat.m mVar = hVar.m;
        if (mVar instanceof NotificationCompat.i) {
            NotificationCompat.i iVar = (NotificationCompat.i) mVar;
            PendingIntent pendingIntent = iVar.h;
            NotificationCompat.a e = pendingIntent == null ? iVar.e(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, R.color.call_notification_decline_color, iVar.i) : iVar.e(R.drawable.ic_call_decline, R.string.call_notification_decline_action, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = iVar.g;
            NotificationCompat.a e2 = pendingIntent2 == null ? null : iVar.e(R.drawable.ic_call_answer, R.string.call_notification_answer_action, R.color.call_notification_answer_color, pendingIntent2);
            ArrayList arrayList3 = new ArrayList(3);
            arrayList3.add(e);
            ArrayList<NotificationCompat.a> arrayList4 = iVar.a.b;
            if (arrayList4 != null) {
                Iterator<NotificationCompat.a> it = arrayList4.iterator();
                i2 = 2;
                while (it.hasNext()) {
                    NotificationCompat.a next = it.next();
                    if (next.g) {
                        arrayList3.add(next);
                    } else if (!next.a.getBoolean("key_action_priority")) {
                        arrayList3.add(next);
                        i2--;
                    }
                    if (e2 != null && i2 == 1) {
                        arrayList3.add(e2);
                        i2--;
                    }
                }
            } else {
                i2 = 2;
            }
            if (e2 != null && i2 >= 1) {
                arrayList3.add(e2);
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                a((NotificationCompat.a) it2.next());
            }
        } else {
            Iterator<NotificationCompat.a> it3 = hVar.b.iterator();
            while (it3.hasNext()) {
                a(it3.next());
            }
        }
        Bundle bundle = hVar.v;
        if (bundle != null) {
            this.d.putAll(bundle);
        }
        this.b.setShowWhen(hVar.l);
        this.b.setLocalOnly(hVar.t);
        this.b.setGroup(hVar.r);
        this.b.setSortKey(null);
        this.b.setGroupSummary(hVar.s);
        this.e = hVar.F;
        this.b.setCategory(hVar.u);
        this.b.setColor(hVar.w);
        this.b.setVisibility(hVar.x);
        this.b.setPublicVersion(hVar.y);
        this.b.setSound(notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList5 = hVar.K;
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Iterator<String> it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                this.b.addPerson(it4.next());
            }
        }
        if (arrayList2.size() > 0) {
            if (hVar.v == null) {
                hVar.v = new Bundle();
            }
            Bundle bundle2 = hVar.v.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                String num = Integer.toString(i4);
                NotificationCompat.a aVar = arrayList2.get(i4);
                Bundle bundle5 = new Bundle();
                IconCompat a = aVar.a();
                Bundle bundle6 = aVar.a;
                bundle5.putInt("icon", a != null ? a.f() : i3);
                bundle5.putCharSequence("title", aVar.i);
                bundle5.putParcelable("actionIntent", aVar.j);
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", aVar.d);
                bundle5.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle7);
                kvf0[] kvf0VarArr = aVar.c;
                if (kvf0VarArr == null) {
                    arrayList = arrayList2;
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[kvf0VarArr.length];
                    arrayList = arrayList2;
                    int i5 = 0;
                    while (i5 < kvf0VarArr.length) {
                        kvf0 kvf0Var = kvf0VarArr[i5];
                        int i6 = i5;
                        Bundle bundle8 = new Bundle();
                        kvf0[] kvf0VarArr2 = kvf0VarArr;
                        Bundle[] bundleArr3 = bundleArr;
                        bundle8.putString("resultKey", kvf0Var.a);
                        bundle8.putCharSequence("label", kvf0Var.b);
                        bundle8.putCharSequenceArray("choices", kvf0Var.c);
                        bundle8.putBoolean("allowFreeFormInput", kvf0Var.d);
                        bundle8.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, kvf0Var.f);
                        Set<String> set = kvf0Var.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList6 = new ArrayList<>(set.size());
                            Iterator<String> it5 = set.iterator();
                            while (it5.hasNext()) {
                                arrayList6.add(it5.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList6);
                        }
                        bundleArr3[i6] = bundle8;
                        i5 = i6 + 1;
                        kvf0VarArr = kvf0VarArr2;
                        bundleArr = bundleArr3;
                    }
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", aVar.e);
                bundle5.putInt("semanticAction", aVar.f);
                bundle4.putBundle(num, bundle5);
                i4++;
                arrayList2 = arrayList;
                bundleArr2 = null;
                i3 = 0;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (hVar.v == null) {
                hVar.v = new Bundle();
            }
            hVar.v.putBundle("android.car.EXTENSIONS", bundle2);
            this.d.putBundle("android.car.EXTENSIONS", bundle3);
        }
        this.b.setExtras(hVar.v);
        this.b.setRemoteInputHistory(null);
        RemoteViews remoteViews = hVar.z;
        if (remoteViews != null) {
            this.b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = hVar.A;
        if (remoteViews2 != null) {
            this.b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = hVar.B;
        if (remoteViews3 != null) {
            this.b.setCustomHeadsUpContentView(remoteViews3);
        }
        this.b.setBadgeIconType(0);
        this.b.setSettingsText(null);
        this.b.setShortcutId(hVar.D);
        this.b.setTimeoutAfter(0L);
        this.b.setGroupAlertBehavior(hVar.F);
        if (!TextUtils.isEmpty(hVar.C)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator<j1a0> it6 = hVar.c.iterator();
        while (it6.hasNext()) {
            this.b.addPerson(it6.next().b());
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            C0023a.a(this.b, hVar.H);
            C0023a.b(this.b);
            c000 c000Var = hVar.E;
            if (c000Var != null) {
                C0023a.d(this.b, c000Var.b);
            }
        }
        if (i7 >= 31 && (i = hVar.G) != 0) {
            b.b(this.b, i);
        }
        if (i7 >= 36) {
            c.a(this.b);
        }
        if (hVar.J) {
            if (this.c.s) {
                this.e = 2;
            } else {
                this.e = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i8 = notification.defaults & (-4);
            notification.defaults = i8;
            this.b.setDefaults(i8);
            if (TextUtils.isEmpty(this.c.r)) {
                this.b.setGroup(NotificationCompat.GROUP_KEY_SILENT);
            }
            this.b.setGroupAlertBehavior(this.e);
        }
    }

    public final void a(NotificationCompat.a aVar) {
        IconCompat a = aVar.a();
        int i = aVar.f;
        boolean z = aVar.d;
        Bundle bundle = aVar.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(a != null ? a.l(null) : null, aVar.i, aVar.j);
        kvf0[] kvf0VarArr = aVar.c;
        if (kvf0VarArr != null) {
            for (RemoteInput remoteInput : kvf0.a(kvf0VarArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i2 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", i);
        builder.setSemanticAction(i);
        if (i2 >= 29) {
            C0023a.c(builder, aVar.g);
        }
        if (i2 >= 31) {
            b.a(builder, aVar.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", aVar.e);
        builder.addExtras(bundle2);
        this.b.addAction(builder.build());
    }
}
