package com.sofascore.results.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.sofascore.model.newNetwork.InfoMessage;
import com.sofascore.model.newNetwork.InfoResponse;
import com.sofascore.results.main.PopUpActivity;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a5f;
import defpackage.a70;
import defpackage.b3a;
import defpackage.be5;
import defpackage.c1c;
import defpackage.c3a;
import defpackage.c64;
import defpackage.dmi;
import defpackage.dv3;
import defpackage.hdb;
import defpackage.ia0;
import defpackage.iii;
import defpackage.jdb;
import defpackage.k13;
import defpackage.ke0;
import defpackage.lnb;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.n9e;
import defpackage.ok3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.tj;
import defpackage.uaa;
import defpackage.uic;
import defpackage.w3a;
import defpackage.waa;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.x2g;
import defpackage.xd5;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.z2a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/sofascore/results/service/InfoWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lz2a;", "infoRepository", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lz2a;Landroid/content/SharedPreferences;)V", "b3a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoWorker extends CoroutineWorker {
    public final z2a a;
    public final SharedPreferences b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull z2a z2aVar, @NotNull SharedPreferences sharedPreferences) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        z2aVar.getClass();
        sharedPreferences.getClass();
        this.a = z2aVar;
        this.b = sharedPreferences;
        this.c = ke0.c;
    }

    public final void a(b3a b3aVar) {
        SharedPreferences d;
        SharedPreferences d2;
        if (b3aVar == null) {
            return;
        }
        InfoResponse infoResponse = b3aVar.b;
        String str = b3aVar.a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        str.getClass();
        if (!str.equals(uaa.c)) {
            uaa.c = str;
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                synchronized (uic.i) {
                    d2 = a5f.d(applicationContext2);
                    uic.j = d2;
                }
                d2.getClass();
                sharedPreferences = d2;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.putString("BASE_URL_v4", str);
            Unit unit = Unit.a;
            edit.apply();
        }
        Context applicationContext3 = getApplicationContext();
        applicationContext3.getClass();
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext4 = applicationContext3.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext4);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences2 = d;
        }
        int i = sharedPreferences2.getInt("LAST_SYSTEM_NOTIFICATION2", 0);
        Calendar calendar = ke0.a;
        ke0.j = infoResponse.getFeedErrorMessage();
        List<String> socketList = infoResponse.getChat().getSocketList();
        ArrayList arrayList = new ArrayList(k13.r(socketList, 10));
        for (String str2 : socketList) {
            str2.getClass();
            if (StringsKt.J("https://" + uaa.c, "api.sofascore1.com/", false)) {
                str2 = c.r(str2, "sofascore.com", "sofascore1.com", false);
            }
            arrayList.add(str2);
        }
        SharedPreferences.Editor edit2 = this.b.edit();
        edit2.getClass();
        edit2.putStringSet("CHAT_WS_1", new HashSet(arrayList));
        edit2.apply();
        for (InfoMessage infoMessage : infoResponse.getNotifications()) {
            Integer notificationId = infoMessage.getNotificationId();
            int intValue = notificationId != null ? notificationId.intValue() : 0;
            if (intValue > i) {
                Intent intent = new Intent(getApplicationContext(), (Class<?>) PopUpActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("POPUP_TYPE", Sdk.SDKError.Reason.MRAID_ERROR_VALUE);
                intent.putExtra("TITLE_POPUP", infoMessage.getTitle());
                intent.putExtra("SUBTITLE_POPUP", infoMessage.getMessage());
                if (infoMessage.getDownloadLink().length() > 0) {
                    intent.putExtra("DOWNLOAD_POPUP", infoMessage.getDownloadLink());
                }
                if (infoMessage.getOkText().length() > 0) {
                    intent.putExtra("OK_POPUP", infoMessage.getOkText());
                }
                if (infoMessage.getCancelText().length() > 0) {
                    intent.putExtra("CANCEL_POPUP", infoMessage.getCancelText());
                }
                intent.putExtra("POPUP_NOTIFICATION_ID", intValue);
                getApplicationContext().startActivity(intent);
            }
        }
        for (InfoMessage infoMessage2 : infoResponse.getMessages()) {
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) PopUpActivity.class);
            intent2.setFlags(268435456);
            intent2.putExtra("POPUP_TYPE", 300);
            intent2.putExtra("TITLE_POPUP", infoMessage2.getTitle());
            intent2.putExtra("SUBTITLE_POPUP", infoMessage2.getMessage());
            intent2.putExtra("DOWNLOAD_POPUP", infoMessage2.getDownloadLink());
            if (infoMessage2.getOkText().length() > 0) {
                intent2.putExtra("OK_POPUP", infoMessage2.getOkText());
            }
            if (infoMessage2.getCancelText().length() > 0) {
                intent2.putExtra("CANCEL_POPUP", infoMessage2.getCancelText());
            }
            getApplicationContext().startActivity(intent2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x021c -> B:10:0x0221). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        c3a c3aVar;
        int i;
        SharedPreferences d;
        SharedPreferences d2;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        int i4;
        SharedPreferences d3;
        if (rq3Var instanceof c3a) {
            c3aVar = (c3a) rq3Var;
            int i5 = c3aVar.z;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c3aVar.z = i5 - Integer.MIN_VALUE;
                Object obj = c3aVar.x;
                lu3 lu3Var = lu3.a;
                i = c3aVar.z;
                int i6 = 6;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    int i7 = this.c;
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext2);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    if (sharedPreferences.getBoolean("PREF_ODDS_FIRST_TIME", true)) {
                        ltb ltbVar = c1c.b;
                        if (ltbVar.containsKey(Integer.valueOf(i7))) {
                            n9e.u(applicationContext, new tj(ltbVar, i7, i6));
                        } else {
                            SharedPreferences sharedPreferences2 = uic.j;
                            if (sharedPreferences2 == null) {
                                Context applicationContext3 = applicationContext.getApplicationContext();
                                synchronized (uic.i) {
                                    sharedPreferences2 = a5f.d(applicationContext3);
                                    uic.j = sharedPreferences2;
                                }
                                sharedPreferences2.getClass();
                            }
                            SharedPreferences.Editor edit = sharedPreferences2.edit();
                            edit.getClass();
                            edit.putString("PREF_ODDS", "DECIMAL");
                            Unit unit = Unit.a;
                            edit.apply();
                        }
                        SharedPreferences sharedPreferences3 = uic.j;
                        if (sharedPreferences3 == null) {
                            Context applicationContext4 = applicationContext.getApplicationContext();
                            synchronized (uic.i) {
                                d3 = a5f.d(applicationContext4);
                                uic.j = d3;
                            }
                            d3.getClass();
                            sharedPreferences3 = d3;
                        }
                        SharedPreferences.Editor i8 = dmi.i(sharedPreferences3, "PREF_ODDS_FIRST_TIME", false);
                        Unit unit2 = Unit.a;
                        i8.apply();
                    }
                    Context applicationContext5 = getApplicationContext();
                    applicationContext5.getClass();
                    if (!waa.D(applicationContext5)) {
                        return new hdb();
                    }
                    ArrayList l = b.l("api.sofascore.com/", "sofavpn.com/", "api.sofascore1.com/");
                    ArrayList arrayList2 = new ArrayList();
                    Calendar calendar = ke0.a;
                    Context applicationContext6 = getApplicationContext();
                    applicationContext6.getClass();
                    String d4 = dv3.d(ke0.a(applicationContext6, true));
                    String str = uaa.c;
                    ia0 ia0Var = ia0.q;
                    if (ok3.p().e().getDevMod()) {
                        arrayList2.add(str);
                    } else {
                        if (d4 != null) {
                            Context applicationContext7 = getApplicationContext();
                            applicationContext7.getClass();
                            if (!w3a.o(applicationContext7)) {
                                arrayList2.add(l.get(0));
                            }
                        }
                        Context applicationContext8 = getApplicationContext();
                        applicationContext8.getClass();
                        SharedPreferences sharedPreferences4 = uic.j;
                        if (sharedPreferences4 == null) {
                            Context applicationContext9 = applicationContext8.getApplicationContext();
                            synchronized (uic.i) {
                                d2 = a5f.d(applicationContext9);
                                uic.j = d2;
                            }
                            d2.getClass();
                            sharedPreferences4 = d2;
                        }
                        long v = yaa.v() - sharedPreferences4.getLong("BASE_URL_TIMESTAMP_v4", 0L);
                        wd5 wd5Var = xd5.b;
                        if (v < xd5.e(wkn.R(7, be5.DAYS))) {
                            l.remove(str);
                            arrayList2.add(str);
                            arrayList2.addAll(l);
                        } else {
                            Context applicationContext10 = getApplicationContext();
                            applicationContext10.getClass();
                            SharedPreferences sharedPreferences5 = uic.j;
                            if (sharedPreferences5 == null) {
                                Context applicationContext11 = applicationContext10.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext11);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences5 = d;
                            }
                            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                            edit2.getClass();
                            edit2.putLong("BASE_URL_TIMESTAMP_v4", yaa.v());
                            Unit unit3 = Unit.a;
                            edit2.apply();
                            arrayList2.addAll(l);
                        }
                    }
                    arrayList = new ArrayList();
                    it = arrayList2.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = c3aVar.w;
                    int i9 = c3aVar.v;
                    int i10 = c3aVar.u;
                    String str2 = c3aVar.t;
                    Iterator it2 = c3aVar.s;
                    Collection collection = c3aVar.r;
                    y6a.M(obj);
                    i4 = i10;
                    it = it2;
                    arrayList = collection;
                    InfoResponse infoResponse = (InfoResponse) yaa.x((x2g) obj);
                    b3a b3aVar = infoResponse == null ? new b3a(str2, infoResponse) : null;
                    if (b3aVar != null) {
                        arrayList.add(b3aVar);
                    }
                    i2 = i9;
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        z2a z2aVar = this.a;
                        String o = lnb.o("https://", str3, "api/v1/app/info");
                        int parseInt = Integer.parseInt(iii.H(6, "260720003"));
                        c3aVar.r = arrayList;
                        c3aVar.s = it;
                        c3aVar.t = str3;
                        c3aVar.u = i4;
                        c3aVar.v = i2;
                        c3aVar.w = i3;
                        c3aVar.z = 1;
                        z2aVar.getClass();
                        Object P = yaa.P(new c64(z2aVar, o, parseInt, rq3Var2, 11), c3aVar);
                        if (P == lu3Var) {
                            return lu3Var;
                        }
                        i9 = i2;
                        obj = P;
                        str2 = str3;
                        InfoResponse infoResponse2 = (InfoResponse) yaa.x((x2g) obj);
                        if (infoResponse2 == null) {
                        }
                        if (b3aVar != null) {
                        }
                        i2 = i9;
                        if (it.hasNext()) {
                            a((b3a) CollectionsKt.firstOrNull(arrayList));
                            return jdb.a();
                        }
                    }
                }
            }
        }
        c3aVar = new c3a(this, (sq3) rq3Var);
        Object obj2 = c3aVar.x;
        lu3 lu3Var2 = lu3.a;
        i = c3aVar.z;
        int i62 = 6;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
    }
}
