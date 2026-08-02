package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.RefereeStatisticsItem;
import com.unity3d.services.UnityAdsConstants;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1f implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b1f(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        r7 = false;
        r7 = false;
        boolean z2 = false;
        z = false;
        switch (this.a) {
            case 0:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 1:
                Context context = (Context) obj;
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
                return Boolean.valueOf(sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true));
            case 2:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 3:
                Context context2 = (Context) obj;
                context2.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = context2.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences2 = a5f.d(applicationContext2);
                        uic.j = sharedPreferences2;
                    }
                    sharedPreferences2.getClass();
                }
                return Boolean.valueOf(sharedPreferences2.getBoolean("IN_APP_PURCHASE_AVAILABLE", true));
            case 4:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 5:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 6:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 7:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 8:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 9:
                ((Context) obj).getClass();
                return Boolean.TRUE;
            case 10:
                SharedPreferences sharedPreferences3 = (SharedPreferences) obj;
                sharedPreferences3.getClass();
                LocalDate now = LocalDate.now();
                int i = sharedPreferences3.getInt("PREFS_WHO_WILL_WIN_VOTE_COUNT", 0);
                int i2 = sharedPreferences3.getInt("PREFS_WHO_WILL_WIN_LOGIN_SHOWN_COUNT", 0);
                String string = sharedPreferences3.getString("PREFS_WHO_WILL_WIN_LOGIN_SHOWN_DATE", null);
                r6 = string != null ? LocalDate.parse(string) : null;
                Object[] objArr = i >= 5 && i2 <= 3;
                boolean c = Intrinsics.c(r6, now);
                if (objArr != false && !c) {
                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                    edit.getClass();
                    edit.putString("PREFS_WHO_WILL_WIN_LOGIN_SHOWN_DATE", now.toString());
                    edit.apply();
                }
                if (objArr != false && !c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                SharedPreferences sharedPreferences4 = (SharedPreferences) obj;
                sharedPreferences4.getClass();
                int i3 = sharedPreferences4.getInt("PREFS_WHO_WILL_WIN_VOTE_COUNT", 0);
                if (i3 < 5) {
                    i3++;
                    SharedPreferences.Editor edit2 = sharedPreferences4.edit();
                    edit2.getClass();
                    edit2.putInt("PREFS_WHO_WILL_WIN_VOTE_COUNT", i3);
                    edit2.apply();
                }
                if (i3 >= 5) {
                    LocalDate now2 = LocalDate.now();
                    String string2 = sharedPreferences4.getString("PREFS_WHO_WILL_WIN_LOGIN_SHOWN_DATE", null);
                    r6 = string2 != null ? LocalDate.parse(string2) : null;
                    if (r6 == null || !r6.equals(now2)) {
                        SharedPreferences.Editor edit3 = sharedPreferences4.edit();
                        edit3.getClass();
                        int i4 = sharedPreferences4.getInt("PREFS_WHO_WILL_WIN_LOGIN_SHOWN_COUNT", 0);
                        if (i4 <= 3) {
                            edit3.putInt("PREFS_WHO_WILL_WIN_LOGIN_SHOWN_COUNT", i4 + 1);
                        }
                        edit3.apply();
                    }
                }
                return Unit.a;
            case 12:
                ((Context) obj).getClass();
                return km5.a;
            case 13:
                ((Event) obj).getClass();
                return Unit.a;
            case 14:
                Context context3 = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context3.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i5);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context3.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context3.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case 15:
                return pi5.a((pi5) obj, null, null, null, null, false, true, 31);
            case 16:
                return pi5.a((pi5) obj, null, null, null, null, false, false, 31);
            case 17:
                sja sjaVar = (sja) obj;
                sjaVar.a = 1332;
                sjaVar.a(0, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).b = ocf.a;
                sjaVar.a(TTAdConstant.STYLE_SIZE_RADIO_2_3, Float.valueOf(290.0f));
                return Unit.a;
            case 18:
                sja sjaVar2 = (sja) obj;
                sjaVar2.a = 1332;
                sjaVar2.a(TTAdConstant.STYLE_SIZE_RADIO_2_3, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).b = ocf.a;
                sjaVar2.a(sjaVar2.a, Float.valueOf(290.0f));
                return Unit.a;
            case 19:
                sja sjaVar3 = (sja) obj;
                sjaVar3.a = 6000;
                Float valueOf = Float.valueOf(90.0f);
                sjaVar3.a(300, valueOf).b = ewc.b;
                sjaVar3.a(TTAdConstant.STYLE_SIZE_RADIO_3_2, valueOf);
                Float valueOf2 = Float.valueOf(180.0f);
                sjaVar3.a(1800, valueOf2);
                sjaVar3.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, valueOf2);
                Float valueOf3 = Float.valueOf(270.0f);
                sjaVar3.a(3300, valueOf3);
                sjaVar3.a(4500, valueOf3);
                Float valueOf4 = Float.valueOf(360.0f);
                sjaVar3.a(4800, valueOf4);
                sjaVar3.a(6000, valueOf4);
                return Unit.a;
            case 20:
                y3h.i((b4h) obj, dcf.c);
                return Unit.a;
            case 21:
                return Unit.a;
            case 22:
                yma ymaVar = (yma) obj;
                sx2 sx2Var = ymaVar.a.b;
                long D = sx2Var.D();
                sx2Var.t().o();
                try {
                    ((hpo) sx2Var.a).q(-3.4028235E38f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    ymaVar.a();
                    mz1.v(sx2Var, D);
                    return Unit.a;
                } finally {
                }
            case 23:
                yma ymaVar2 = (yma) obj;
                sx2 sx2Var2 = ymaVar2.a.b;
                long D2 = sx2Var2.D();
                sx2Var2.t().o();
                try {
                    ((hpo) sx2Var2.a).q(-3.4028235E38f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    ymaVar2.a();
                    mz1.v(sx2Var2, D2);
                    return Unit.a;
                } finally {
                }
            case 24:
                Float f = (Float) obj;
                f.getClass();
                return new xhf(new q50(f, lz.f, r6, 12));
            case 25:
                ((Context) obj).getClass();
                ia0 ia0Var = ia0.q;
                return Boolean.valueOf(ok3.p().e().getDevMod());
            case 26:
                ((Context) obj).getClass();
                ia0 ia0Var2 = ia0.q;
                return Boolean.valueOf(ok3.p().h().n != null);
            case 27:
                Context context4 = (Context) obj;
                context4.getClass();
                if (!xld.e(context4) && xld.g(context4) && rld.t(context4)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 28:
                ((Context) obj).getClass();
                return Boolean.TRUE;
            default:
                ((RefereeStatisticsItem) obj).getClass();
                return Double.valueOf(r10.getYellowCards() / r10.getAppearances());
        }
    }
}
