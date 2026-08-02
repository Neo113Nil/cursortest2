package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import com.appsflyer.sdk_base.referrer.Payload;
import com.sofascore.results.wc26.bottomSheet.WorldCupAddWidgetBottomSheet;
import com.sofascore.results.wc26.widget.WorldCupWidgetReceiver;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kgl {
    public final Context a;
    public final cg4 b;
    public final j0j c;
    public final w3b d;
    public final wve e;
    public final bt7 f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;

    public kgl(Context context, cg4 cg4Var, j0j j0jVar, w3b w3bVar, wve wveVar, bt7 bt7Var) {
        cg4Var.getClass();
        j0jVar.getClass();
        w3bVar.getClass();
        wveVar.getClass();
        this.a = context;
        this.b = cg4Var;
        this.c = j0jVar;
        this.d = w3bVar;
        this.e = wveVar;
        this.f = bt7Var;
    }

    public static void e(Context context) {
        context.getClass();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        rq3 rq3Var = null;
        if (appWidgetManager.isRequestPinAppWidgetSupported()) {
            vel velVar = vel.a;
            String str = Build.MANUFACTURER;
            str.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (!StringsKt.J(lowerCase, Payload.SOURCE_XIAOMI, false)) {
                try {
                    appWidgetManager.requestPinAppWidget(new ComponentName(context, (Class<?>) WorldCupWidgetReceiver.class), null, null);
                    return;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
        WorldCupAddWidgetBottomSheet worldCupAddWidgetBottomSheet = new WorldCupAddWidgetBottomSheet();
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(worldCupAddWidgetBottomSheet, appCompatActivity, rq3Var, 3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r5.g("WC_26_ADD_WIDGET_RETARGET_SHOWN", true, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(egl eglVar, int i, sq3 sq3Var) {
        fgl fglVar;
        Object obj;
        int i2;
        if (sq3Var instanceof fgl) {
            fglVar = (fgl) sq3Var;
            int i3 = fglVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fglVar.u = i3 - Integer.MIN_VALUE;
                obj = fglVar.s;
                Object obj2 = lu3.a;
                i2 = fglVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    fglVar.r = i;
                    fglVar.u = 1;
                    obj = b(eglVar, i, fglVar);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return Boolean.TRUE;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = fglVar.r;
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                this.h = true;
                cg4 cg4Var = this.b;
                fglVar.r = i;
                fglVar.u = 2;
            }
        }
        fglVar = new fgl(this, sq3Var);
        obj = fglVar.s;
        Object obj22 = lu3.a;
        i2 = fglVar.u;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0196, code lost:
    
        if (r14 >= defpackage.xd5.e(defpackage.wkn.R(24, defpackage.be5.HOURS))) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0172, code lost:
    
        if (r1 != r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013a, code lost:
    
        if (r1 == r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        if (r1 == r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fe, code lost:
    
        if (r9 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0092, code lost:
    
        if (r1 == r3) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(egl eglVar, int i, sq3 sq3Var) {
        hgl hglVar;
        egl eglVar2;
        int i2;
        egl eglVar3;
        int i3;
        int ordinal;
        int i4;
        Object a;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (sq3Var instanceof hgl) {
            hglVar = (hgl) sq3Var;
            int i13 = hglVar.z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hglVar.z = i13 - Integer.MIN_VALUE;
                Object obj = hglVar.x;
                lu3 lu3Var = lu3.a;
                rq3 rq3Var = null;
                boolean z = false;
                switch (hglVar.z) {
                    case 0:
                        y6a.M(obj);
                        yea yeaVar = j58.a;
                        if (fn0.B("world_cup_widget_enabled") && !this.h) {
                            cg4 cg4Var = this.b;
                            eglVar2 = eglVar;
                            hglVar.r = eglVar2;
                            i2 = i;
                            hglVar.s = i2;
                            hglVar.z = 1;
                            obj = cg4Var.a("WC_26_ADD_WIDGET_RETARGET_SHOWN", false, hglVar);
                            break;
                        } else {
                            eglVar2 = eglVar;
                            i2 = i;
                            eglVar3 = eglVar2;
                            i3 = 0;
                            ordinal = eglVar3.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    break;
                                } else {
                                    if (ordinal != 2) {
                                        zzl.b();
                                        return null;
                                    }
                                    vel velVar = vel.a;
                                    if (vel.a().containsValue(new Integer(i2))) {
                                        j0j j0jVar = this.c;
                                        hglVar.r = null;
                                        hglVar.s = i2;
                                        hglVar.t = i3;
                                        hglVar.z = 2;
                                        obj = j0jVar.y(i2, hglVar);
                                        break;
                                    }
                                }
                                i4 = 0;
                                cg4 cg4Var2 = this.b;
                                hglVar.r = null;
                                hglVar.s = i2;
                                hglVar.t = i3;
                                hglVar.u = i4;
                                hglVar.z = 3;
                                a = cg4Var2.a("WC_26_TEAM_PICKER_RETARGET_SHOWN", false, hglVar);
                                if (a != lu3Var) {
                                    int i14 = i3;
                                    i5 = i4;
                                    obj = a;
                                    i6 = i2;
                                    i7 = i14;
                                    if (!((Boolean) obj).booleanValue()) {
                                        cg4 cg4Var3 = this.b;
                                        hglVar.r = null;
                                        hglVar.s = i6;
                                        hglVar.t = i7;
                                        hglVar.u = i5;
                                        hglVar.z = 4;
                                        obj = cg4Var3.e("WC_26_MY_TEAM_ALPHA2", "", hglVar);
                                        break;
                                    }
                                    i8 = 1;
                                    i9 = i6;
                                    i10 = i7;
                                    i11 = i5;
                                    i12 = (i8 != 0 || this.g) ? 0 : 1;
                                    cg4 cg4Var4 = this.b;
                                    hglVar.r = null;
                                    hglVar.s = i9;
                                    hglVar.t = i10;
                                    hglVar.u = i11;
                                    hglVar.v = i8;
                                    hglVar.w = i12;
                                    hglVar.z = 5;
                                    obj = cg4Var4.d("WC_26_MY_TEAM_SELECTED_TIMESTAMP", hglVar);
                                    break;
                                }
                            }
                            i4 = 1;
                            cg4 cg4Var22 = this.b;
                            hglVar.r = null;
                            hglVar.s = i2;
                            hglVar.t = i3;
                            hglVar.u = i4;
                            hglVar.z = 3;
                            a = cg4Var22.a("WC_26_TEAM_PICKER_RETARGET_SHOWN", false, hglVar);
                            if (a != lu3Var) {
                            }
                        }
                    case 1:
                        int i15 = hglVar.s;
                        egl eglVar4 = hglVar.r;
                        y6a.M(obj);
                        i2 = i15;
                        eglVar2 = eglVar4;
                        if (!((Boolean) obj).booleanValue()) {
                            Context context = this.a;
                            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) WorldCupWidgetReceiver.class));
                            appWidgetIds.getClass();
                            if (appWidgetIds.length == 0) {
                                eglVar3 = eglVar2;
                                i3 = 1;
                                ordinal = eglVar3.ordinal();
                                if (ordinal != 0) {
                                }
                                i4 = 1;
                                cg4 cg4Var222 = this.b;
                                hglVar.r = null;
                                hglVar.s = i2;
                                hglVar.t = i3;
                                hglVar.u = i4;
                                hglVar.z = 3;
                                a = cg4Var222.a("WC_26_TEAM_PICKER_RETARGET_SHOWN", false, hglVar);
                                if (a != lu3Var) {
                                }
                            }
                        }
                        eglVar3 = eglVar2;
                        i3 = 0;
                        ordinal = eglVar3.ordinal();
                        if (ordinal != 0) {
                        }
                        i4 = 1;
                        cg4 cg4Var2222 = this.b;
                        hglVar.r = null;
                        hglVar.s = i2;
                        hglVar.t = i3;
                        hglVar.u = i4;
                        hglVar.z = 3;
                        a = cg4Var2222.a("WC_26_TEAM_PICKER_RETARGET_SHOWN", false, hglVar);
                        if (a != lu3Var) {
                        }
                    case 2:
                        i3 = hglVar.t;
                        i2 = hglVar.s;
                        y6a.M(obj);
                        break;
                    case 3:
                        i5 = hglVar.u;
                        i7 = hglVar.t;
                        i6 = hglVar.s;
                        y6a.M(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        i8 = 1;
                        i9 = i6;
                        i10 = i7;
                        i11 = i5;
                        if (i8 != 0) {
                            break;
                        }
                        cg4 cg4Var42 = this.b;
                        hglVar.r = null;
                        hglVar.s = i9;
                        hglVar.t = i10;
                        hglVar.u = i11;
                        hglVar.v = i8;
                        hglVar.w = i12;
                        hglVar.z = 5;
                        obj = cg4Var42.d("WC_26_MY_TEAM_SELECTED_TIMESTAMP", hglVar);
                        break;
                    case 4:
                        i5 = hglVar.u;
                        i7 = hglVar.t;
                        i6 = hglVar.s;
                        y6a.M(obj);
                        String str = (String) obj;
                        if ((str != null ? str : "").length() <= 0) {
                            i8 = 0;
                            i9 = i6;
                            i10 = i7;
                            i11 = i5;
                            if (i8 != 0) {
                            }
                            cg4 cg4Var422 = this.b;
                            hglVar.r = null;
                            hglVar.s = i9;
                            hglVar.t = i10;
                            hglVar.u = i11;
                            hglVar.v = i8;
                            hglVar.w = i12;
                            hglVar.z = 5;
                            obj = cg4Var422.d("WC_26_MY_TEAM_SELECTED_TIMESTAMP", hglVar);
                            break;
                        }
                        i8 = 1;
                        i9 = i6;
                        i10 = i7;
                        i11 = i5;
                        if (i8 != 0) {
                        }
                        cg4 cg4Var4222 = this.b;
                        hglVar.r = null;
                        hglVar.s = i9;
                        hglVar.t = i10;
                        hglVar.u = i11;
                        hglVar.v = i8;
                        hglVar.w = i12;
                        hglVar.z = 5;
                        obj = cg4Var4222.d("WC_26_MY_TEAM_SELECTED_TIMESTAMP", hglVar);
                        break;
                    case 5:
                        i12 = hglVar.w;
                        i8 = hglVar.v;
                        i11 = hglVar.u;
                        i10 = hglVar.t;
                        i9 = hglVar.s;
                        y6a.M(obj);
                        long longValue = ((Number) obj).longValue();
                        if (longValue != 0) {
                            long v = yaa.v() - longValue;
                            wd5 wd5Var = xd5.b;
                            break;
                        }
                        z = true;
                        if (i10 == 0 || i11 == 0 || i12 == 0 || !z) {
                            return Boolean.FALSE;
                        }
                        hglVar.r = null;
                        hglVar.s = i9;
                        hglVar.t = i10;
                        hglVar.u = i11;
                        hglVar.v = i8;
                        hglVar.w = i12;
                        hglVar.z = 6;
                        Object r = s9a.r(new kuj(this, rq3Var, 13), hglVar);
                        return r == lu3Var ? lu3Var : r;
                    case 6:
                        y6a.M(obj);
                        return obj;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        hglVar = new hgl(this, sq3Var);
        Object obj2 = hglVar.x;
        lu3 lu3Var2 = lu3.a;
        rq3 rq3Var2 = null;
        boolean z2 = false;
        switch (hglVar.z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0073, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0058, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        igl iglVar;
        Object obj;
        int i;
        SharedPreferences d;
        if (sq3Var instanceof igl) {
            iglVar = (igl) sq3Var;
            int i2 = iglVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iglVar.t = i2 - Integer.MIN_VALUE;
                obj = iglVar.r;
                lu3 lu3Var = lu3.a;
                i = iglVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.h) {
                        return Boolean.FALSE;
                    }
                    cg4 cg4Var = this.b;
                    iglVar.t = 1;
                    obj = cg4Var.a("WC_26_TEAM_PICKER_RETARGET_SHOWN", false, iglVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                y6a.M(obj);
                                return obj;
                            }
                            if (i == 4) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        String str = (String) obj;
                        if (str == null) {
                            str = "";
                        }
                        if (str.length() > 0) {
                            return Boolean.FALSE;
                        }
                        long v = yaa.v();
                        Context context = this.a;
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = context.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        long j = v - sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", v);
                        wd5 wd5Var = xd5.b;
                        if (j >= xd5.e(wkn.R(7, be5.DAYS))) {
                            iglVar.t = 3;
                            Object r = s9a.r(new ajj(this, rq3Var, 10), iglVar);
                            if (r != lu3Var) {
                                return r;
                            }
                        } else {
                            if (j >= xd5.e(wkn.R(24, be5.HOURS))) {
                                return Boolean.TRUE;
                            }
                            iglVar.t = 4;
                            Object r2 = s9a.r(new kuj(this, rq3Var, 14), iglVar);
                            if (r2 != lu3Var) {
                                return r2;
                            }
                        }
                        return lu3Var;
                    }
                    y6a.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                cg4 cg4Var2 = this.b;
                iglVar.t = 2;
                obj = cg4Var2.e("WC_26_MY_TEAM_ALPHA2", "", iglVar);
            }
        }
        iglVar = new igl(this, sq3Var);
        obj = iglVar.r;
        lu3 lu3Var2 = lu3.a;
        i = iglVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fc, code lost:
    
        if (r11.g("WC_26_TOTR_CHAT_RETARGET_SHOWN", true, r0) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0061, code lost:
    
        if (r13 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(xxi xxiVar, sq3 sq3Var) {
        jgl jglVar;
        Object obj;
        int i;
        long j;
        SharedPreferences d;
        long j2;
        if (sq3Var instanceof jgl) {
            jglVar = (jgl) sq3Var;
            int i2 = jglVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jglVar.u = i2 - Integer.MIN_VALUE;
                obj = jglVar.s;
                lu3 lu3Var = lu3.a;
                i = jglVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (xxiVar == null) {
                        return Boolean.FALSE;
                    }
                    if (!this.i) {
                        cg4 cg4Var = this.b;
                        jglVar.u = 1;
                        obj = cg4Var.a("WC_26_TOTR_CHAT_RETARGET_SHOWN", false, jglVar);
                    }
                    return Boolean.FALSE;
                }
                if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i == 2) {
                        j = jglVar.r;
                        y6a.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                            return Boolean.FALSE;
                        }
                        cg4 cg4Var2 = this.b;
                        jglVar.r = j;
                        jglVar.u = 3;
                        obj = cg4Var2.a("WC_26_ADD_WIDGET_RETARGET_SHOWN", false, jglVar);
                        if (obj != lu3Var) {
                            j2 = j;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return lu3Var;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            y6a.M(obj);
                            return Boolean.TRUE;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = jglVar.r;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    this.i = true;
                    cg4 cg4Var3 = this.b;
                    jglVar.r = j2;
                    jglVar.u = 4;
                }
                if (!((Boolean) obj).booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Context context = this.a;
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    long j3 = currentTimeMillis - sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", System.currentTimeMillis());
                    wd5 wd5Var = xd5.b;
                    if (j3 < xd5.e(wkn.R(7, be5.DAYS))) {
                        return Boolean.FALSE;
                    }
                    if (this.g || this.h) {
                        return Boolean.FALSE;
                    }
                    cg4 cg4Var4 = this.b;
                    jglVar.r = j3;
                    jglVar.u = 2;
                    Object a = cg4Var4.a("WC_26_TEAM_PICKER_RETARGET_SHOWN", false, jglVar);
                    if (a != lu3Var) {
                        j = j3;
                        obj = a;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return lu3Var;
                }
                return Boolean.FALSE;
            }
        }
        jglVar = new jgl(this, sq3Var);
        obj = jglVar.s;
        lu3 lu3Var2 = lu3.a;
        i = jglVar.u;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Boolean.FALSE;
    }
}
