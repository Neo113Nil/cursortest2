package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.internal.zzb;
import com.google.android.gms.cast.framework.media.internal.zzt;
import com.google.android.gms.cast.framework.media.zzg;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzr;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.Ua;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class axo {
    public static final Logger v = new Logger("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final NotificationOptions c;
    public final ImagePicker d;
    public final ComponentName e;
    public final ComponentName f;
    public ArrayList g = new ArrayList();
    public int[] h;
    public final long i;
    public final zzb j;
    public final Resources k;
    public nto l;
    public gvo m;
    public wed n;
    public wed o;
    public wed p;
    public wed q;
    public wed r;
    public wed s;
    public wed t;
    public wed u;

    public axo(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        Logger logger = CastContext.l;
        Preconditions.e("Must be called from the main thread.");
        CastContext castContext = CastContext.n;
        Preconditions.i(castContext);
        Preconditions.e("Must be called from the main thread.");
        CastOptions castOptions = castContext.e;
        Preconditions.i(castOptions);
        CastMediaOptions castMediaOptions = castOptions.f;
        Preconditions.i(castMediaOptions);
        NotificationOptions notificationOptions = castMediaOptions.d;
        Preconditions.i(notificationOptions);
        this.c = notificationOptions;
        this.d = castMediaOptions.Y0();
        Resources resources = context.getResources();
        this.k = resources;
        this.e = new ComponentName(context.getApplicationContext(), castMediaOptions.a);
        String str = notificationOptions.d;
        if (TextUtils.isEmpty(str)) {
            this.f = null;
        } else {
            this.f = new ComponentName(context.getApplicationContext(), str);
        }
        this.i = notificationOptions.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(notificationOptions.r);
        this.j = new zzb(context.getApplicationContext(), new ImageHints(1, dimensionPixelSize, dimensionPixelSize));
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        zzr.a(zzpm.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final void a() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        wed b;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.l == null) {
            return;
        }
        gvo gvoVar = this.m;
        if (gvoVar == null || (bitmap = (Bitmap) gvoVar.c) == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = null;
        }
        Context context = this.a;
        efd efdVar = new efd(context, "cast_media_notification");
        efdVar.f(bitmap);
        NotificationOptions notificationOptions = this.c;
        efdVar.v.icon = notificationOptions.e;
        efdVar.e = efd.c(this.l.d);
        efdVar.f = efd.c(this.k.getString(notificationOptions.s, this.l.e));
        efdVar.e(2, true);
        efdVar.k = false;
        efdVar.p = 1;
        ComponentName componentName = this.f;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent w = d7a.w(context, component); w != null; w = d7a.w(context, w.getComponent())) {
                        arrayList.add(size, w);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ilg.k(e);
                    return;
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                a70.r("No intents added to TaskStackBuilder; cannot getPendingIntent");
                return;
            } else {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
            }
        }
        if (activities != null) {
            efdVar.g = activities;
        }
        zzg zzgVar = notificationOptions.F;
        Logger logger = v;
        if (zzgVar != null) {
            logger.a("actionsProvider != null", new Object[0]);
            Logger logger2 = zzt.a;
            try {
                iArr = zzgVar.zzg();
            } catch (RemoteException unused) {
                zzt.a.c("Unable to call %s on %s.", "getCompactViewActionIndices", "zzg");
                iArr = null;
            }
            this.h = iArr == null ? null : (int[]) iArr.clone();
            List<NotificationAction> b2 = zzt.b(zzgVar);
            this.g = new ArrayList();
            if (b2 != null) {
                for (NotificationAction notificationAction : b2) {
                    String str = notificationAction.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        b = b(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.e);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        int i = notificationAction.b;
                        String str2 = notificationAction.c;
                        IconCompat a = i == 0 ? null : IconCompat.a(i, "");
                        Bundle bundle = new Bundle();
                        CharSequence c = efd.c(str2);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (!arrayList2.isEmpty()) {
                        }
                        b = new wed(a, c, broadcast, bundle, arrayList3.isEmpty() ? null : (sxf[]) arrayList3.toArray(new sxf[arrayList3.size()]), true, 0, true, false, 0, 0, false);
                    }
                    if (b != null) {
                        this.g.add(b);
                    }
                }
            }
        } else {
            logger.a("actionsProvider == null", new Object[0]);
            this.g = new ArrayList();
            Iterator it = notificationOptions.a.iterator();
            while (it.hasNext()) {
                wed b3 = b((String) it.next());
                if (b3 != null) {
                    this.g.add(b3);
                }
            }
            int[] iArr2 = notificationOptions.b;
            this.h = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            wed wedVar = (wed) it2.next();
            if (wedVar != null) {
                efdVar.b.add(wedVar);
            }
        }
        hfd hfdVar = new hfd();
        hfdVar.c = null;
        int[] iArr3 = this.h;
        if (iArr3 != null) {
            hfdVar.c = iArr3;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = this.l.a;
        if (mediaSessionCompat$Token != null) {
            hfdVar.d = mediaSessionCompat$Token;
        }
        efdVar.g(hfdVar);
        notificationManager.notify("castMediaNotification", 1, efdVar.b());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final wed b(String str) {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        int i;
        int i2;
        int hashCode = str.hashCode();
        long j = this.i;
        Resources resources = this.k;
        NotificationOptions notificationOptions = this.c;
        Context context = this.a;
        ComponentName componentName = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    wed wedVar = this.s;
                    if (wedVar != null) {
                        return wedVar;
                    }
                    Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent.setComponent(componentName);
                    intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                    Logger logger = zzt.a;
                    int i3 = notificationOptions.n;
                    if (j == Ua.s) {
                        i3 = notificationOptions.o;
                    } else if (j == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                        i3 = notificationOptions.p;
                    }
                    int i4 = notificationOptions.B;
                    if (j == Ua.s) {
                        i4 = notificationOptions.C;
                    } else if (j == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                        i4 = notificationOptions.D;
                    }
                    String string = resources.getString(i4);
                    IconCompat a = i3 == 0 ? null : IconCompat.a(i3, "");
                    Bundle bundle = new Bundle();
                    CharSequence c = efd.c(string);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (!arrayList.isEmpty()) {
                    }
                    wed wedVar2 = new wed(a, c, broadcast, bundle, arrayList2.isEmpty() ? null : (sxf[]) arrayList2.toArray(new sxf[arrayList2.size()]), true, 0, true, false, 0, 0, false);
                    this.s = wedVar2;
                    return wedVar2;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.l.f;
                    wed wedVar3 = this.p;
                    if (wedVar3 != null) {
                        return wedVar3;
                    }
                    if (z) {
                        Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent2.setComponent(componentName);
                        pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                    } else {
                        pendingIntent = null;
                    }
                    int i5 = notificationOptions.i;
                    String string2 = resources.getString(notificationOptions.w);
                    IconCompat a2 = i5 == 0 ? null : IconCompat.a(i5, "");
                    Bundle bundle2 = new Bundle();
                    CharSequence c2 = efd.c(string2);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                    }
                    wed wedVar4 = new wed(a2, c2, pendingIntent, bundle2, arrayList4.isEmpty() ? null : (sxf[]) arrayList4.toArray(new sxf[arrayList4.size()]), true, 0, true, false, 0, 0, false);
                    this.p = wedVar4;
                    return wedVar4;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.l.g;
                    wed wedVar5 = this.q;
                    if (wedVar5 != null) {
                        return wedVar5;
                    }
                    if (z2) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent3.setComponent(componentName);
                        pendingIntent2 = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                    } else {
                        pendingIntent2 = null;
                    }
                    int i6 = notificationOptions.j;
                    String string3 = resources.getString(notificationOptions.x);
                    IconCompat a3 = i6 == 0 ? null : IconCompat.a(i6, "");
                    Bundle bundle3 = new Bundle();
                    CharSequence c3 = efd.c(string3);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (!arrayList5.isEmpty()) {
                    }
                    wed wedVar6 = new wed(a3, c3, pendingIntent2, bundle3, arrayList6.isEmpty() ? null : (sxf[]) arrayList6.toArray(new sxf[arrayList6.size()]), true, 0, true, false, 0, 0, false);
                    this.q = wedVar6;
                    return wedVar6;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    wed wedVar7 = this.u;
                    if (wedVar7 != null) {
                        return wedVar7;
                    }
                    Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent4.setComponent(componentName);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent4, 67108864);
                    int i7 = notificationOptions.q;
                    String string4 = resources.getString(notificationOptions.E);
                    IconCompat a4 = i7 == 0 ? null : IconCompat.a(i7, "");
                    Bundle bundle4 = new Bundle();
                    CharSequence c4 = efd.c(string4);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    if (!arrayList7.isEmpty()) {
                    }
                    wed wedVar8 = new wed(a4, c4, broadcast2, bundle4, arrayList8.isEmpty() ? null : (sxf[]) arrayList8.toArray(new sxf[arrayList8.size()]), true, 0, true, false, 0, 0, false);
                    this.u = wedVar8;
                    return wedVar8;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    wed wedVar9 = this.t;
                    if (wedVar9 != null) {
                        return wedVar9;
                    }
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent5.setComponent(componentName);
                    PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent5, 67108864);
                    int i8 = notificationOptions.q;
                    String string5 = resources.getString(notificationOptions.E, "");
                    IconCompat a5 = i8 == 0 ? null : IconCompat.a(i8, "");
                    Bundle bundle5 = new Bundle();
                    CharSequence c5 = efd.c(string5);
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    if (!arrayList9.isEmpty()) {
                    }
                    wed wedVar10 = new wed(a5, c5, broadcast3, bundle5, arrayList10.isEmpty() ? null : (sxf[]) arrayList10.toArray(new sxf[arrayList10.size()]), true, 0, true, false, 0, 0, false);
                    this.t = wedVar10;
                    return wedVar10;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    nto ntoVar = this.l;
                    int i9 = ntoVar.c;
                    if (!ntoVar.b) {
                        wed wedVar11 = this.n;
                        if (wedVar11 != null) {
                            return wedVar11;
                        }
                        Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent6.setComponent(componentName);
                        PendingIntent broadcast4 = PendingIntent.getBroadcast(context, 0, intent6, 67108864);
                        int i10 = notificationOptions.h;
                        String string6 = resources.getString(notificationOptions.v);
                        IconCompat a6 = i10 == 0 ? null : IconCompat.a(i10, "");
                        Bundle bundle6 = new Bundle();
                        CharSequence c6 = efd.c(string6);
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        if (!arrayList11.isEmpty()) {
                        }
                        wed wedVar12 = new wed(a6, c6, broadcast4, bundle6, arrayList12.isEmpty() ? null : (sxf[]) arrayList12.toArray(new sxf[arrayList12.size()]), true, 0, true, false, 0, 0, false);
                        this.n = wedVar12;
                        return wedVar12;
                    }
                    wed wedVar13 = this.o;
                    if (wedVar13 != null) {
                        return wedVar13;
                    }
                    if (i9 == 2) {
                        i = notificationOptions.f;
                        i2 = notificationOptions.t;
                    } else {
                        i = notificationOptions.g;
                        i2 = notificationOptions.u;
                    }
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent7.setComponent(componentName);
                    PendingIntent broadcast5 = PendingIntent.getBroadcast(context, 0, intent7, 67108864);
                    String string7 = resources.getString(i2);
                    IconCompat a7 = i == 0 ? null : IconCompat.a(i, "");
                    Bundle bundle7 = new Bundle();
                    CharSequence c7 = efd.c(string7);
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    if (!arrayList13.isEmpty()) {
                    }
                    wed wedVar14 = new wed(a7, c7, broadcast5, bundle7, arrayList14.isEmpty() ? null : (sxf[]) arrayList14.toArray(new sxf[arrayList14.size()]), true, 0, true, false, 0, 0, false);
                    this.o = wedVar14;
                    return wedVar14;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    wed wedVar15 = this.r;
                    if (wedVar15 != null) {
                        return wedVar15;
                    }
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent8.setComponent(componentName);
                    intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast6 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                    Logger logger2 = zzt.a;
                    int i11 = notificationOptions.k;
                    if (j == Ua.s) {
                        i11 = notificationOptions.l;
                    } else if (j == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                        i11 = notificationOptions.m;
                    }
                    int i12 = notificationOptions.y;
                    if (j == Ua.s) {
                        i12 = notificationOptions.z;
                    } else if (j == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                        i12 = notificationOptions.A;
                    }
                    String string8 = resources.getString(i12);
                    IconCompat a8 = i11 == 0 ? null : IconCompat.a(i11, "");
                    Bundle bundle8 = new Bundle();
                    CharSequence c8 = efd.c(string8);
                    ArrayList arrayList15 = new ArrayList();
                    ArrayList arrayList16 = new ArrayList();
                    if (!arrayList15.isEmpty()) {
                    }
                    wed wedVar16 = new wed(a8, c8, broadcast6, bundle8, arrayList16.isEmpty() ? null : (sxf[]) arrayList16.toArray(new sxf[arrayList16.size()]), true, 0, true, false, 0, 0, false);
                    this.r = wedVar16;
                    return wedVar16;
                }
                break;
        }
        v.c("Action: %s is not a pre-defined action.", str);
        return null;
    }
}
