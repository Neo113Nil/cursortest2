package c0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3307a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3311e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3312f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f3313g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f3314h;

    /* renamed from: i, reason: collision with root package name */
    public int f3315i;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public x f3317l;

    /* renamed from: m, reason: collision with root package name */
    public String f3318m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3319n;

    /* renamed from: p, reason: collision with root package name */
    public String f3321p;
    public Bundle q;

    /* renamed from: t, reason: collision with root package name */
    public String f3324t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f3325u;

    /* renamed from: v, reason: collision with root package name */
    public final Notification f3326v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f3327w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3308b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3309c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3310d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f3316k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3320o = false;

    /* renamed from: r, reason: collision with root package name */
    public int f3322r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f3323s = 0;

    public w(Context context, String str) {
        Notification notification = new Notification();
        this.f3326v = notification;
        this.f3307a = context;
        this.f3324t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.f3327w = new ArrayList();
        this.f3325u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        Notification build;
        Bundle bundle;
        int i5;
        ArrayList arrayList;
        int i10;
        com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x();
        new ArrayList();
        xVar.f6185d = new Bundle();
        xVar.f6184c = this;
        Context context = this.f3307a;
        xVar.f6182a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            xVar.f6183b = z.a(context, this.f3324t);
        } else {
            xVar.f6183b = new Notification.Builder(context);
        }
        Notification.Builder builder = (Notification.Builder) xVar.f6183b;
        Notification notification = this.f3326v;
        Context context2 = null;
        int i11 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f3311e).setContentText(this.f3312f).setContentInfo(null).setContentIntent(this.f3313g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.f3315i).setProgress(0, 0, false);
        Notification.Builder builder2 = (Notification.Builder) xVar.f6183b;
        IconCompat iconCompat = this.f3314h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) xVar.f6183b).setSubText(null).setUsesChronometer(false).setPriority(this.j);
        Iterator it = this.f3308b.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            int i12 = Build.VERSION.SDK_INT;
            if (qVar.f3297b == null && (i10 = qVar.f3300e) != 0) {
                qVar.f3297b = IconCompat.b(i10);
            }
            IconCompat iconCompat2 = qVar.f3297b;
            boolean z5 = qVar.f3298c;
            Bundle bundle2 = qVar.f3296a;
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, qVar.f3301f, qVar.f3302g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z5);
            if (i12 >= 24) {
                y.b(builder3, z5);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i12 >= 28) {
                a0.a(builder3);
            }
            if (i12 >= 29) {
                e.d(builder3);
            }
            if (i12 >= 31) {
                b0.a(builder3);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", qVar.f3299d);
            builder3.addExtras(bundle3);
            ((Notification.Builder) xVar.f6183b).addAction(builder3.build());
            context2 = null;
        }
        Bundle bundle4 = this.q;
        if (bundle4 != null) {
            ((Bundle) xVar.f6185d).putAll(bundle4);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) xVar.f6183b).setShowWhen(this.f3316k);
        ((Notification.Builder) xVar.f6183b).setLocalOnly(this.f3320o);
        ((Notification.Builder) xVar.f6183b).setGroup(this.f3318m);
        ((Notification.Builder) xVar.f6183b).setSortKey(null);
        ((Notification.Builder) xVar.f6183b).setGroupSummary(this.f3319n);
        ((Notification.Builder) xVar.f6183b).setCategory(this.f3321p);
        ((Notification.Builder) xVar.f6183b).setColor(this.f3322r);
        ((Notification.Builder) xVar.f6183b).setVisibility(this.f3323s);
        ((Notification.Builder) xVar.f6183b).setPublicVersion(null);
        ((Notification.Builder) xVar.f6183b).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f3327w;
        ArrayList arrayList3 = this.f3309c;
        if (i13 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    s.f fVar = new s.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) xVar.f6183b).addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = this.f3310d;
        if (arrayList4.size() > 0) {
            if (this.q == null) {
                this.q = new Bundle();
            }
            Bundle bundle5 = this.q.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                String num = Integer.toString(i14);
                q qVar2 = (q) arrayList4.get(i14);
                Bundle bundle8 = new Bundle();
                if (qVar2.f3297b == null && (i5 = qVar2.f3300e) != 0) {
                    qVar2.f3297b = IconCompat.b(i5);
                }
                IconCompat iconCompat3 = qVar2.f3297b;
                Bundle bundle9 = qVar2.f3296a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i11);
                bundle8.putCharSequence("title", qVar2.f3301f);
                bundle8.putParcelable("actionIntent", qVar2.f3302g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", qVar2.f3298c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", qVar2.f3299d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i14++;
                i11 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.q == null) {
                this.q = new Bundle();
            }
            this.q.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) xVar.f6185d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 24) {
            ((Notification.Builder) xVar.f6183b).setExtras(this.q);
            y.c((Notification.Builder) xVar.f6183b);
        }
        if (i15 >= 26) {
            z.b((Notification.Builder) xVar.f6183b);
            z.d((Notification.Builder) xVar.f6183b);
            z.e((Notification.Builder) xVar.f6183b);
            z.f((Notification.Builder) xVar.f6183b);
            z.c((Notification.Builder) xVar.f6183b);
            if (!TextUtils.isEmpty(this.f3324t)) {
                ((Notification.Builder) xVar.f6183b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i15 >= 29) {
            e.b((Notification.Builder) xVar.f6183b, this.f3325u);
            e.c((Notification.Builder) xVar.f6183b);
        }
        if (i15 >= 36) {
            c0.a((Notification.Builder) xVar.f6183b);
        }
        w wVar = (w) xVar.f6184c;
        x xVar2 = wVar.f3317l;
        if (xVar2 != null) {
            xVar2.g(xVar);
        }
        Notification.Builder builder4 = (Notification.Builder) xVar.f6183b;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 26) {
            build = builder4.build();
        } else if (i16 >= 24) {
            build = builder4.build();
        } else {
            builder4.setExtras((Bundle) xVar.f6185d);
            build = builder4.build();
        }
        if (xVar2 != null) {
            wVar.f3317l.getClass();
        }
        if (xVar2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", xVar2.h());
        }
        return build;
    }

    public final void c(int i5, boolean z5) {
        Notification notification = this.f3326v;
        if (z5) {
            notification.flags = i5 | notification.flags;
        } else {
            notification.flags = (~i5) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f3307a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f1268k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f1270b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f3314h = iconCompat;
    }

    public final void e(x xVar) {
        if (this.f3317l != xVar) {
            this.f3317l = xVar;
            if (((w) xVar.f3328a) != this) {
                xVar.f3328a = this;
                e(xVar);
            }
        }
    }
}
