package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class efd {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public r9 l;
    public Bundle n;
    public RemoteViews q;
    public RemoteViews r;
    public String s;
    public long t;
    public final boolean u;
    public final Notification v;
    public boolean w;
    public final ArrayList x;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public efd(Context context, String str) {
        Notification notification = new Notification();
        this.v = notification;
        this.a = context;
        this.s = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.x = new ArrayList();
        this.u = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i, PendingIntent pendingIntent, String str) {
        this.b.add(new wed(i == 0 ? null : IconCompat.a(i, ""), (CharSequence) str, pendingIntent, new Bundle(), (sxf[]) null, true, 0, true, false, 0, 0, false));
    }

    public final Notification b() {
        Bundle extras;
        ujg ujgVar = new ujg(this);
        efd efdVar = (efd) ujgVar.d;
        r9 r9Var = efdVar.l;
        if (r9Var != null) {
            r9Var.c(ujgVar);
        }
        Notification build = ((Notification.Builder) ujgVar.c).build();
        RemoteViews remoteViews = efdVar.q;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (r9Var != null) {
            efdVar.l.getClass();
        }
        if (r9Var != null && (extras = NotificationCompat.getExtras(build)) != null) {
            CharSequence charSequence = (CharSequence) r9Var.b;
            if (charSequence != null) {
                extras.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String i = r9Var.i();
            if (i != null) {
                extras.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, i);
            }
        }
        return build;
    }

    public final void d(String str) {
        this.e = c(str);
    }

    public final void e(int i, boolean z) {
        Notification notification = this.v;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void f(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            Bitmap reduceLargeIconSize = NotificationCompat.reduceLargeIconSize(this.a, bitmap);
            PorterDuff.Mode mode = IconCompat.k;
            reduceLargeIconSize.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = reduceLargeIconSize;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void g(r9 r9Var) {
        if (this.l != r9Var) {
            this.l = r9Var;
            if (((efd) r9Var.a) != this) {
                r9Var.a = this;
                g(r9Var);
            }
        }
    }
}
