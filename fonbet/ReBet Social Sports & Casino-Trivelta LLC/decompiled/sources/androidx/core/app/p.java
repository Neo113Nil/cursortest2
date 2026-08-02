package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z.C6901b;

/* loaded from: classes.dex */
public class p implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18965a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f18966b;

    /* renamed from: c, reason: collision with root package name */
    public final o.e f18967c;

    /* renamed from: d, reason: collision with root package name */
    public RemoteViews f18968d;

    /* renamed from: e, reason: collision with root package name */
    public RemoteViews f18969e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18970f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f18971g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public int f18972h;

    /* renamed from: i, reason: collision with root package name */
    public RemoteViews f18973i;

    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static String e(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }
    }

    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    public static final class i {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    public p(o.e eVar) {
        int i10;
        this.f18967c = eVar;
        Context context = eVar.f18927a;
        this.f18965a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f18966b = e.a(context, eVar.f18916K);
        } else {
            this.f18966b = new Notification.Builder(eVar.f18927a);
        }
        Notification notification = eVar.f18923R;
        this.f18966b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f18936j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f18931e).setContentText(eVar.f18932f).setContentInfo(eVar.f18938l).setContentIntent(eVar.f18934h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f18935i, (notification.flags & 128) != 0).setNumber(eVar.f18939m).setProgress(eVar.f18946t, eVar.f18947u, eVar.f18948v);
        Notification.Builder builder = this.f18966b;
        IconCompat iconCompat = eVar.f18937k;
        c.b(builder, iconCompat == null ? null : iconCompat.n(context));
        this.f18966b.setSubText(eVar.f18944r).setUsesChronometer(eVar.f18942p).setPriority(eVar.f18940n);
        Iterator it = eVar.f18928b.iterator();
        while (it.hasNext()) {
            b((o.a) it.next());
        }
        Bundle bundle = eVar.f18909D;
        if (bundle != null) {
            this.f18971g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f18968d = eVar.f18913H;
        this.f18969e = eVar.f18914I;
        this.f18966b.setShowWhen(eVar.f18941o);
        a.h(this.f18966b, eVar.f18952z);
        a.f(this.f18966b, eVar.f18949w);
        a.i(this.f18966b, eVar.f18951y);
        a.g(this.f18966b, eVar.f18950x);
        this.f18972h = eVar.f18920O;
        b.b(this.f18966b, eVar.f18908C);
        b.c(this.f18966b, eVar.f18910E);
        b.f(this.f18966b, eVar.f18911F);
        b.d(this.f18966b, eVar.f18912G);
        b.e(this.f18966b, notification.sound, notification.audioAttributes);
        List e10 = i11 < 28 ? e(g(eVar.f18929c), eVar.f18926U) : eVar.f18926U;
        if (e10 != null && !e10.isEmpty()) {
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                b.a(this.f18966b, (String) it2.next());
            }
        }
        this.f18973i = eVar.f18915J;
        if (eVar.f18930d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f18930d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), q.a((o.a) eVar.f18930d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f18971g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f18925T;
        if (obj != null) {
            c.c(this.f18966b, obj);
        }
        this.f18966b.setExtras(eVar.f18909D);
        d.e(this.f18966b, eVar.mRemoteInputHistory);
        RemoteViews remoteViews = eVar.f18913H;
        if (remoteViews != null) {
            d.c(this.f18966b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f18914I;
        if (remoteViews2 != null) {
            d.b(this.f18966b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f18915J;
        if (remoteViews3 != null) {
            d.d(this.f18966b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f18966b, eVar.f18917L);
            e.e(this.f18966b, eVar.f18945s);
            e.f(this.f18966b, eVar.f18918M);
            e.g(this.f18966b, eVar.f18919N);
            e.d(this.f18966b, eVar.f18920O);
            if (eVar.f18907B) {
                e.c(this.f18966b, eVar.f18906A);
            }
            if (!TextUtils.isEmpty(eVar.f18916K)) {
                this.f18966b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it3 = eVar.f18929c.iterator();
            while (it3.hasNext()) {
                f.a(this.f18966b, ((v) it3.next()).h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f18966b, eVar.f18922Q);
            g.b(this.f18966b, o.d.a(null));
        }
        if (i14 >= 31 && (i10 = eVar.f18921P) != 0) {
            h.b(this.f18966b, i10);
        }
        if (i14 >= 36) {
            i.a(this.f18966b, eVar.f18933g);
        }
        if (eVar.f18924S) {
            if (this.f18967c.f18950x) {
                this.f18972h = 2;
            } else {
                this.f18972h = 1;
            }
            this.f18966b.setVibrate(null);
            this.f18966b.setSound(null);
            int i15 = notification.defaults & (-4);
            notification.defaults = i15;
            this.f18966b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f18967c.f18949w)) {
                    a.f(this.f18966b, "silent");
                }
                e.d(this.f18966b, this.f18972h);
            }
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C6901b c6901b = new C6901b(list.size() + list2.size());
        c6901b.addAll(list);
        c6901b.addAll(list2);
        return new ArrayList(c6901b);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((v) it.next()).g());
        }
        return arrayList;
    }

    @Override // androidx.core.app.k
    public Notification.Builder a() {
        return this.f18966b;
    }

    public final void b(o.a aVar) {
        IconCompat d10 = aVar.d();
        Notification.Action.Builder a10 = c.a(d10 != null ? d10.m() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : x.b(aVar.e())) {
                a.c(a10, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(a10, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(a10, aVar.f());
        }
        if (i10 >= 29) {
            g.c(a10, aVar.j());
        }
        if (i10 >= 31) {
            h.a(a10, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a10, bundle);
        a.a(this.f18966b, a.d(a10));
    }

    public Notification c() {
        Bundle a10;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        o.i iVar = this.f18967c.f18943q;
        if (iVar != null) {
            iVar.apply(this);
        }
        RemoteViews makeContentView = iVar != null ? iVar.makeContentView(this) : null;
        Notification d10 = d();
        if (makeContentView != null) {
            d10.contentView = makeContentView;
        } else {
            RemoteViews remoteViews = this.f18967c.f18913H;
            if (remoteViews != null) {
                d10.contentView = remoteViews;
            }
        }
        if (iVar != null && (makeBigContentView = iVar.makeBigContentView(this)) != null) {
            d10.bigContentView = makeBigContentView;
        }
        if (iVar != null && (makeHeadsUpContentView = this.f18967c.f18943q.makeHeadsUpContentView(this)) != null) {
            d10.headsUpContentView = makeHeadsUpContentView;
        }
        if (iVar != null && (a10 = o.a(d10)) != null) {
            iVar.addCompatExtras(a10);
        }
        return d10;
    }

    public Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f18966b.build();
        }
        Notification build = this.f18966b.build();
        if (this.f18972h != 0) {
            if (a.e(build) != null && (build.flags & 512) != 0 && this.f18972h == 2) {
                h(build);
            }
            if (a.e(build) != null && (build.flags & 512) == 0 && this.f18972h == 1) {
                h(build);
            }
        }
        return build;
    }

    public Context f() {
        return this.f18965a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
