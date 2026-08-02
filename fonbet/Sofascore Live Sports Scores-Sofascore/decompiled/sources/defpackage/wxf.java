package defpackage;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.internal.l;
import com.facebook.w;
import com.google.android.gms.internal.cast.zzyd;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.service.WidgetFavoriteWorker;
import com.sofascore.results.widget.SofaWidgetReceiver;
import com.unity3d.services.UnityAdsConstants;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wxf implements f, ec3, pla, lx2, zzqp, zzyh, dfp, lg0, pjd, ya, xy2, gml {
    public static Boolean c;
    public final /* synthetic */ int a;
    public static final wxf b = new wxf(0);
    public static final wxf d = new wxf(1);
    public static final /* synthetic */ wxf e = new wxf(2);
    public static final wxf f = new wxf(3);
    public static final wxf g = new wxf(4);
    public static final wxf h = new wxf(6);
    public static final wxf i = new wxf(7);
    public static final wxf j = new wxf(8);
    public static final wxf k = new wxf(9);
    public static final wxf l = new wxf(10);
    public static final wxf m = new wxf(11);
    public static final wxf n = new wxf(12);
    public static final wxf o = new wxf(13);
    public static final wxf p = new wxf(14);
    public static final wxf q = new wxf(15);

    public wxf() {
        this.a = 21;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static void B(Context context, int i2, rd6 rd6Var, Integer num, Integer num2, Integer num3, int i3) {
        wxf wxfVar = EventActivity.h0;
        rd6 rd6Var2 = (i3 & 4) != 0 ? null : rd6Var;
        Integer num4 = (i3 & 16) != 0 ? null : num;
        Integer num5 = (i3 & 32) != 0 ? null : num2;
        Integer num6 = (i3 & 64) != 0 ? null : num3;
        context.getClass();
        context.startActivity(o(wxfVar, context, i2, rd6Var2, num4, num5, num6, null, false, 128));
    }

    public static v7b D(Pair[] pairArr, float f2, float f3) {
        return w((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
    }

    public static v7b E(List list, float f2, float f3, int i2) {
        return new v7b(list, null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits((i2 & 2) != 0 ? 0.0f : f2) & 4294967295L), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits((i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f3) & 4294967295L));
    }

    public static void d(Context context, String str, long j2, boolean z) {
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putString("PREF_NOTIFICATION_STATUS", str);
        edit.putLong("PREF_DISABLE_NOTIFICATION_TIME", j2);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
        mha.F(context);
        Pair[] pairArr = {new Pair("ACTION", "UPDATE_WIDGET_NOTIFICATION_STATUS")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l2 = hpoVar.l();
        ktd A = mha.A(new ktd(WidgetFavoriteWorker.class));
        A.f(l2);
        if (Build.VERSION.SDK_INT >= 31) {
            pwd pwdVar = pwd.a;
            A.e();
        }
        vxd.h(context).b("WidgetFavoriteWorker-".concat(mha.o(l2)), nf6.a, (ltd) A.a());
    }

    public static void f(int i2, Context context) {
        boolean z = (i2 & 2) == 0;
        boolean z2 = (i2 & 4) == 0;
        context.getClass();
        d(context, "NOTIFICATION_ENABLED", 0L, z2);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager != null) {
            alarmManager.cancel(m(context));
        }
        if (z) {
            Calendar calendar = ke0.a;
            ke0.f(R.string.notifications_enabled, context);
        }
    }

    public static sd7 g(String str) {
        Object obj;
        Iterator<E> it = sd7.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sd7) obj).a.equals(str)) {
                break;
            }
        }
        return (sd7) obj;
    }

    public static LinkedHashMap i(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        List<NotificationChannel> notificationChannels = notificationManager != null ? notificationManager.getNotificationChannels() : null;
        if (notificationChannels == null) {
            notificationChannels = km5.a;
        }
        int c2 = sub.c(k13.r(notificationChannels, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        for (NotificationChannel notificationChannel : notificationChannels) {
            linkedHashMap.put(notificationChannel.getId(), Boolean.valueOf(notificationChannel.getImportance() != 0));
        }
        return linkedHashMap;
    }

    public static PendingIntent m(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.sofascore.results.ENABLE_NOTIFICATIONS");
        intent.setComponent(new ComponentName(context, (Class<?>) SofaWidgetReceiver.class));
        if (Build.VERSION.SDK_INT >= 31) {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 192321, intent, 167772160);
            broadcast.getClass();
            return broadcast;
        }
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 192321, intent, 134217728);
        broadcast2.getClass();
        return broadcast2;
    }

    public static Intent o(wxf wxfVar, Context context, int i2, rd6 rd6Var, Integer num, Integer num2, Integer num3, Intent intent, boolean z, int i3) {
        if ((i3 & 4) != 0) {
            rd6Var = null;
        }
        if ((i3 & 8) != 0) {
            num = null;
        }
        if ((i3 & 16) != 0) {
            num2 = null;
        }
        if ((i3 & 32) != 0) {
            num3 = null;
        }
        if ((i3 & 64) != 0) {
            intent = null;
        }
        if ((i3 & 128) != 0) {
            z = false;
        }
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) EventActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("eventId", i2);
        if (rd6Var != null) {
            intent2.putExtra("initialTab", rd6Var);
        }
        if (num != null) {
            intent2.putExtra("eventPlayerId", num.intValue());
        }
        if (num2 != null) {
            intent2.putExtra("eventPlayerTeamId", num2.intValue());
        }
        if (num3 != null) {
            intent2.putExtra("fromUniqueTournamentId", num3.intValue());
        }
        if (z) {
            intent2.putExtra("playerOfTheMatchVote", true);
        }
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static Bitmap p(Context context, Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            return null;
        }
        int s = ao2.s(64, context);
        Bitmap createBitmap = Bitmap.createBitmap(s, s, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        if (z) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setColor(context.getColor(R.color.sb_15));
            float f2 = s / 2.0f;
            canvas.drawCircle(f2, f2, f2, paint);
        }
        canvas.drawBitmap(bitmap, (s - bitmap.getWidth()) / 2.0f, (s - bitmap.getHeight()) / 2.0f, (Paint) null);
        return createBitmap;
    }

    public static String q(ContextWrapper contextWrapper) {
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = contextWrapper.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        String string = sharedPreferences.getString("PREF_NOTIFICATION_STATUS", "NOTIFICATION_ENABLED");
        String str = string != null ? string : "NOTIFICATION_ENABLED";
        return new fgd(contextWrapper).b.areNotificationsEnabled() ? str.equals("NOTIFICATION_DISABLED") ? "NOTIFICATION_ENABLED" : str : "NOTIFICATION_DISABLED";
    }

    public static v7b s(List list, float f2, float f3, int i2) {
        return new v7b(list, null, (Float.floatToRawIntBits((i2 & 2) != 0 ? 0.0f : f2) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits((i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f3) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L));
    }

    public static v7b t(Pair[] pairArr, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.POSITIVE_INFINITY;
        }
        return w((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L));
    }

    public static Intent v(Context context, Bundle bundle, int i2) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) LoginScreenActivity.class);
        intent.addFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public static v7b w(Pair[] pairArr, long j2, long j3) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            r13 r13Var = (r13) pair.b;
            long j4 = r13Var.a;
            arrayList.add(r13Var);
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.a).floatValue()));
        }
        return new v7b(arrayList, arrayList2, j2, j3);
    }

    public static l94 x(Context context, View view, String str, int i2, int i3, String str2, int i4, n37 n37Var, int i5) {
        int i6 = l94.C;
        if ((i5 & 8) != 0) {
            i2 = context.getColor(R.color.surface_1);
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = context.getColor(R.color.primary_default);
        }
        n94 n94Var = new n94(context, str, i7, i3, (i5 & 64) != 0 ? null : str2, (i5 & 128) == 0);
        if ((i5 & 1024) != 0) {
            n37Var = null;
        }
        context.getClass();
        view.getClass();
        str.getClass();
        ViewGroup a0 = td4.a0(view);
        if (a0 == null) {
            a70.p("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        l94 l94Var = new l94(a0.getContext(), a0, n94Var, n94Var);
        m71 m71Var = l94Var.i;
        m71Var.setBackgroundColor(m71Var.getContext().getColor(android.R.color.transparent));
        m71Var.setPadding(0, 0, 0, 0);
        l94Var.k = i4;
        if (n37Var != null) {
            k94 k94Var = new k94(n37Var);
            ArrayList arrayList = l94Var.u;
            if (arrayList == null) {
                arrayList = new ArrayList();
                l94Var.u = arrayList;
            }
            arrayList.add(k94Var);
        }
        return l94Var;
    }

    public static void y(long j2, Context context) {
        context.getClass();
        LocalDateTime plusHours = LocalDateTime.now(ZoneId.systemDefault()).plusHours(j2);
        long epochMilli = plusHours.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        d(context, "NOTIFICATION_BLOCKED", epochMilli / 1000, false);
        Calendar calendar = ke0.a;
        ke0.g(context, context.getResources().getString(R.string.notifications_muted_until, new DateTimeFormatterBuilder().appendLocalized(null, FormatStyle.SHORT).toFormatter(Locale.getDefault()).format(plusHours)), 0);
        PendingIntent m2 = m(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager != null) {
            alarmManager.set(0, epochMilli, m2);
        }
    }

    public static void z(Context context, boolean z, boolean z2) {
        context.getClass();
        LocalDateTime withNano = LocalDateTime.now(ZoneId.systemDefault()).withHour(8).withMinute(0).withSecond(0).withNano(0);
        long epochMilli = (LocalDateTime.now(ZoneId.systemDefault()).compareTo((ChronoLocalDateTime<?>) withNano) == -1 ? withNano : withNano.plusDays(1L)).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        d(context, "NOTIFICATION_BLOCKED", epochMilli / 1000, z2);
        if (z) {
            Calendar calendar = ke0.a;
            Resources resources = context.getResources();
            withNano.getClass();
            ke0.g(context, resources.getString(R.string.notifications_muted_until, new DateTimeFormatterBuilder().appendLocalized(null, FormatStyle.SHORT).toFormatter(Locale.getDefault()).format(withNano)), 0);
        }
        PendingIntent m2 = m(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager != null) {
            alarmManager.set(0, epochMilli, m2);
        }
    }

    public int A(int i2, String str, List list) {
        if (cw3.a.contains(this)) {
            return 0;
        }
        try {
            Context a = w.a();
            Intent r = r(a);
            int i3 = 2;
            if (r == null) {
                return 2;
            }
            vxf vxfVar = new vxf();
            try {
                if (!a.bindService(r, vxfVar, 1)) {
                    return 3;
                }
                try {
                    try {
                        vxfVar.a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = vxfVar.b;
                        if (iBinder != null) {
                            ym9 J = xm9.J(iBinder);
                            Bundle y = uxf.y(i2, str, list);
                            if (y != null) {
                                ((wm9) J).J(y);
                                y.toString();
                            }
                            i3 = 1;
                        }
                        a.unbindService(vxfVar);
                        return i3;
                    } catch (InterruptedException unused) {
                        w wVar = w.a;
                        a.unbindService(vxfVar);
                        return 3;
                    }
                } catch (RemoteException unused2) {
                    w wVar2 = w.a;
                    a.unbindService(vxfVar);
                    return 3;
                }
            } catch (Throwable th) {
                a.unbindService(vxfVar);
                w wVar3 = w.a;
                throw th;
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
            return 0;
        }
    }

    public void C(Context context, int i2, int i3) {
        context.getClass();
        context.startActivity(o(this, context, i2, null, Integer.valueOf(i3), null, null, null, false, 244));
    }

    @Override // defpackage.dfp
    public boolean a(Class cls) {
        return zzyd.class.isAssignableFrom(cls);
    }

    @Override // defpackage.dfp
    public zfp b(Class cls) {
        if (!zzyd.class.isAssignableFrom(cls)) {
            a70.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zfp) zzyd.f(cls.asSubclass(zzyd.class)).i(3, null);
        } catch (Exception e2) {
            vp2.e("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.pla
    public Object c(n29 n29Var, rq3 rq3Var) {
        long j2 = n29Var.u;
        Bitmap createBitmap = Bitmap.createBitmap((int) (j2 >> 32), (int) (j2 & 4294967295L), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Canvas canvas2 = xx.a;
        wx wxVar = new wx();
        wxVar.a = canvas;
        n29Var.c(wxVar, null);
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lx2
    public void h(vh9 vh9Var, hoi hoiVar) {
        rq3 rq3Var = null;
        switch (this.a) {
            case 6:
                ct8 ct8Var = (ct8) hoiVar;
                int i2 = 0;
                ihe iheVar = new ihe("BeforeReceive", i2);
                rj9 rj9Var = vh9Var.f;
                ihe iheVar2 = rj9.n;
                rj9Var.getClass();
                iheVar2.getClass();
                if (!rj9Var.e(iheVar)) {
                    int c2 = rj9Var.c(iheVar2);
                    if (c2 == -1) {
                        throw new v3("Phase " + iheVar2 + " was not registered for this pipeline", 3);
                    }
                    rj9Var.a.add(c2, new ufe(iheVar, new khe()));
                }
                rj9Var.f(iheVar, new vpf(ct8Var, rq3Var, i2));
                return;
            default:
                vh9Var.f.f(rj9.p, new tl((ft8) hoiVar, rq3Var, 23));
                return;
        }
    }

    @Override // defpackage.lg0
    public void j(kx4 kx4Var, int i2, int[] iArr, ema emaVar, int[] iArr2) {
        int i3 = 0;
        if (emaVar == ema.a) {
            int length = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int i6 = iArr[i3];
                iArr2[i4] = i5;
                i5 += i6;
                i3++;
                i4++;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            i7 += iArr[i3];
            i3++;
        }
        int i8 = i2 - i7;
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i9 = iArr[length3];
            iArr2[length3] = i8;
            i8 += i9;
        }
    }

    @Override // defpackage.gml
    public lw1 k(String str, int i2, EnumMap enumMap) {
        gml q1fVar;
        int i3 = 1;
        int i4 = 2;
        int i5 = 0;
        switch (wt3.C(i2)) {
            case 0:
                q1fVar = new q1f(16);
                break;
            case 1:
                q1fVar = new sz2();
                break;
            case 2:
                q1fVar = new dn9(i4);
                break;
            case 3:
                q1fVar = new dn9(3);
                break;
            case 4:
                q1fVar = new dn9(i3);
                break;
            case 5:
                q1fVar = new rik(20);
                break;
            case 6:
                q1fVar = new sf5(i3);
                break;
            case 7:
                q1fVar = new sf5(i5);
                break;
            case 8:
                q1fVar = new dn9(i5);
                break;
            case 9:
            case 12:
            case 13:
            default:
                a70.p("No encoder available for format ".concat(fn0.C(i2)));
                return null;
            case 10:
                q1fVar = new p4h(29);
                break;
            case 11:
                q1fVar = new kif(i5);
                break;
            case 14:
                q1fVar = new bka(25);
                break;
            case 15:
                q1fVar = new sf5(i4);
                break;
        }
        return q1fVar.k(str, i2, enumMap);
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        Object h2 = vngVar.h(new oif(by0.class, Executor.class));
        h2.getClass();
        return fz8.P((Executor) h2);
    }

    @Override // defpackage.pjd
    public Object n() {
        return new ConcurrentHashMap();
    }

    public Intent r(Context context) {
        if (!cw3.a.contains(this)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    Intent intent = new Intent("ReceiverService");
                    intent.setPackage(FbValidationUtils.FB_PACKAGE);
                    if (packageManager.resolveService(intent, 0) != null && l.a(context, FbValidationUtils.FB_PACKAGE)) {
                        return intent;
                    }
                    Intent intent2 = new Intent("ReceiverService");
                    intent2.setPackage(FbValidationUtils.DEBUG_FB_PACKAGE);
                    if (packageManager.resolveService(intent2, 0) != null) {
                        if (l.a(context, FbValidationUtils.DEBUG_FB_PACKAGE)) {
                            return intent2;
                        }
                    }
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "SingleLineCodepointTransformation";
            case 16:
                return "Arrangement#Start";
            case 24:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xy2
    public o5a u() {
        o5a o5aVar = o5a.c;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis / 1000;
        if ((currentTimeMillis ^ 1000) < 0 && j2 * 1000 != currentTimeMillis) {
            j2--;
        }
        long j3 = currentTimeMillis % 1000;
        return j2 < -31557014167219200L ? o5a.c : j2 > 31556889864403199L ? o5a.d : uic.l((int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000), j2);
    }

    public /* synthetic */ wxf(int i2) {
        this.a = i2;
    }

    @Override // defpackage.ya
    public void run() {
    }
}
