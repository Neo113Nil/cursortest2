package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.UserBadge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bfk {
    public final Application a;
    public volatile UserAccount b;
    public List c;

    public bfk(ku3 ku3Var, Application application) {
        ku3Var.getClass();
        this.a = application;
        this.c = km5.a;
        v98 v98Var = new v98(rf4.a(application).getData(), new pdk(this, null, 2), 3);
        hs4 hs4Var = z45.a;
        fcp.m0(k53.g0(v98Var, hq4.c), ku3Var);
    }

    public static Object e(bfk bfkVar, Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, UserBadge userBadge, Long l, rq3 rq3Var, int i) {
        Boolean bool6 = Boolean.FALSE;
        Boolean bool7 = Boolean.TRUE;
        Object a = rf4.a(bfkVar.a).a(new afk((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : bool5, (i & 512) != 0 ? null : userBadge, (i & 4096) != 0 ? null : l, (i & 1024) != 0 ? null : bool6, (i & a.o) != 0 ? null : bool7, null), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        xek xekVar;
        int i;
        bfk bfkVar;
        SharedPreferences d;
        if (sq3Var instanceof xek) {
            xekVar = (xek) sq3Var;
            int i2 = xekVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xekVar.t = i2 - Integer.MIN_VALUE;
                xek xekVar2 = xekVar;
                Object obj = xekVar2.r;
                lu3 lu3Var = lu3.a;
                i = xekVar2.t;
                if (i != 0) {
                    y6a.M(obj);
                    Application application = this.a;
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = application.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putString("DEV_NAME", str);
                    Unit unit = Unit.a;
                    edit.apply();
                    Boolean bool = Boolean.TRUE;
                    xekVar2.t = 1;
                    bfkVar = this;
                    if (e(bfkVar, null, null, null, null, null, bool, null, null, null, xekVar2, 8127) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    bfkVar = this;
                }
                u0a.C(bfkVar.a);
                return Unit.a;
            }
        }
        xekVar = new xek(this, sq3Var);
        xek xekVar22 = xekVar;
        Object obj2 = xekVar22.r;
        lu3 lu3Var2 = lu3.a;
        i = xekVar22.t;
        if (i != 0) {
        }
        u0a.C(bfkVar.a);
        return Unit.a;
    }

    public final UserAccount b() {
        if (this.b == null) {
            this.b = (UserAccount) td4.t0(g.a, new luj(this, null, 6));
        }
        UserAccount userAccount = this.b;
        userAccount.getClass();
        return userAccount;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(sq3 sq3Var) {
        yek yekVar;
        int i;
        bfk bfkVar;
        UserAccount userAccount;
        if (sq3Var instanceof yek) {
            yekVar = (yek) sq3Var;
            int i2 = yekVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yekVar.u = i2 - Integer.MIN_VALUE;
                Object obj = yekVar.s;
                lu3 lu3Var = lu3.a;
                i = yekVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.b == null) {
                        z88 data = rf4.a(this.a).getData();
                        yekVar.r = this;
                        yekVar.u = 1;
                        obj = rd0.A(data, yekVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        bfkVar = this;
                    }
                    UserAccount userAccount2 = this.b;
                    userAccount2.getClass();
                    return userAccount2;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bfkVar = yekVar.r;
                y6a.M(obj);
                userAccount = (UserAccount) obj;
                if (userAccount == null) {
                    userAccount = dfk.a;
                }
                bfkVar.b = userAccount;
                UserAccount userAccount22 = this.b;
                userAccount22.getClass();
                return userAccount22;
            }
        }
        yekVar = new yek(this, sq3Var);
        Object obj2 = yekVar.s;
        lu3 lu3Var2 = lu3.a;
        i = yekVar.u;
        if (i != 0) {
        }
        userAccount = (UserAccount) obj2;
        if (userAccount == null) {
        }
        bfkVar.b = userAccount;
        UserAccount userAccount222 = this.b;
        userAccount222.getClass();
        return userAccount222;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109 A[LOOP:1: B:49:0x0103->B:51:0x0109, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        zek zekVar;
        int i;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        Iterator it;
        SharedPreferences d;
        SharedPreferences d2;
        if (sq3Var instanceof zek) {
            zekVar = (zek) sq3Var;
            int i2 = zekVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zekVar.t = i2 - Integer.MIN_VALUE;
                Object obj = zekVar.r;
                lu3 lu3Var = lu3.a;
                i = zekVar.t;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    Application application = this.a;
                    String type = b().getType();
                    type.getClass();
                    int i4 = 2;
                    if (type.equals("google")) {
                        f5p.E(application, new i58(i4, rq3Var, i3));
                    } else if (type.equals(Payload.SOURCE_FACEBOOK)) {
                        hs4 hs4Var = z45.a;
                        f5p.D(application, hq4.c, new i40(i4, rq3Var, 5));
                    }
                    ye4 a = rf4.a(this.a);
                    d11 d11Var = new d11(i4, rq3Var, 18);
                    zekVar.t = 1;
                    if (a.a(d11Var, zekVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Set set = aef.a;
                Application application2 = this.a;
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = application2.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences = d2;
                }
                SharedPreferences.Editor i5 = dmi.i(sharedPreferences, "PREF_PROMOTIONS_ENABLE", true);
                Unit unit = Unit.a;
                i5.apply();
                Application application3 = this.a;
                sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = application3.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext2);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences2 = d;
                }
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.getClass();
                Set<String> keySet = sharedPreferences2.getAll().keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : keySet) {
                    String str = (String) obj2;
                    str.getClass();
                    if (c.v(str, "competition", false) && c.n(str, "reveal_timestamp", false)) {
                        arrayList.add(obj2);
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    edit.remove((String) it.next());
                }
                edit.apply();
                return Unit.a;
            }
        }
        zekVar = new zek(this, sq3Var);
        Object obj3 = zekVar.r;
        lu3 lu3Var2 = lu3.a;
        i = zekVar.t;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        Set set2 = aef.a;
        Application application22 = this.a;
        sharedPreferences = uic.j;
        if (sharedPreferences == null) {
        }
        SharedPreferences.Editor i52 = dmi.i(sharedPreferences, "PREF_PROMOTIONS_ENABLE", true);
        Unit unit2 = Unit.a;
        i52.apply();
        Application application32 = this.a;
        sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
        }
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.getClass();
        Set<String> keySet2 = sharedPreferences2.getAll().keySet();
        ArrayList arrayList2 = new ArrayList();
        while (r9.hasNext()) {
        }
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        edit2.apply();
        return Unit.a;
    }
}
