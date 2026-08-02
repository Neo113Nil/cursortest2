package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import com.moloco.sdk.acm.db.e;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.ServerBrandingConfigResponse;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.network.response.PickemResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSHighestRatedPlayersResponse;
import com.sofascore.model.newNetwork.PostUserBadge;
import com.sofascore.model.newNetwork.PostUserNickname;
import com.sofascore.model.newNetwork.SuggestedPlayersResponse;
import com.sofascore.model.newNetwork.TennisPowerResponse;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.SortedMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cl extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.u;
        switch (i) {
            case 0:
                return new cl((Context) this.t, (el) obj, rq3Var, 0);
            case 1:
                return new cl((dx) this.t, (ct8) obj, rq3Var, 1);
            case 2:
                return new cl((dx) this.t, (ct8) obj, rq3Var, 2);
            case 3:
                return new cl((t30) this.t, (g8j) obj, rq3Var, 3);
            case 4:
                return new cl((ko1) this.t, (jo1) obj, rq3Var, 4);
            case 5:
                return new cl((c92) this.t, (String) obj, rq3Var, 5);
            case 6:
                return new cl((cs2) this.t, (wzf) obj, rq3Var, 6);
            case 7:
                return new cl((k6g) this.t, (Function1) obj, rq3Var, 7);
            case 8:
                return new cl((qf4) obj, rq3Var, 8);
            case 9:
                return new cl((oi5) this.t, (String) obj, rq3Var, 9);
            case 10:
                return new cl((v76) this.t, (ArrayList) obj, rq3Var, 10);
            case 11:
                return new cl((NetworkCoroutineAPI) this.t, (Stage) obj, rq3Var, 11);
            case 12:
                return new cl((n27) this.t, (String) obj, rq3Var, 12);
            case 13:
                return new cl((ia7) this.t, (String) obj, rq3Var, 13);
            case 14:
                return new cl((k18) obj, rq3Var, 14);
            case 15:
                return new cl((b98) this.t, (fsf) obj, rq3Var, 15);
            case 16:
                return new cl((ue9) this.t, (String) obj, rq3Var, 16);
            case 17:
                return new cl((u8c) this.t, (Event) obj, rq3Var, 17);
            case 18:
                return new cl((a5d) this.t, (String) obj, rq3Var, 18);
            case 19:
                return new cl((lk0) this.t, (f6e) obj, rq3Var, 19);
            case 20:
                return new cl((nge) this.t, (String) obj, rq3Var, 20);
            case 21:
                return new cl((aoe) this.t, (Player) obj, rq3Var, 21);
            case 22:
                return new cl((aoe) this.t, (ArrayList) obj, rq3Var, 22);
            case 23:
                return new cl((zte) this.t, (String) obj, rq3Var, 23);
            case 24:
                return new cl((lue) this.t, (SortedMap) obj, rq3Var, 24);
            case 25:
                return new cl((wve) this.t, (String) obj, rq3Var, 25);
            case 26:
                return new cl((UserBadge) this.t, (f9f) obj, rq3Var, 26);
            case 27:
                return new cl((f9f) this.t, (String) obj, rq3Var, 27);
            case 28:
                return new cl((f9f) this.t, (wzf) obj, rq3Var, 28);
            default:
                return new cl((MetricsDb_Impl) this.t, (e) obj, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((cl) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0332, code lost:
    
        if (r14 == r2) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x081b, code lost:
    
        if (r14 == r0) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0830, code lost:
    
        if (r14 == r0) goto L486;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        SharedPreferences d;
        r30 r30Var;
        Throwable th;
        adi adiVar;
        Throwable th2;
        FileInputStream fileInputStream;
        int i = 4;
        int i2 = 6;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return (ServerBrandingConfigResponse) obj;
                    }
                    if (i6 == 2) {
                        y6a.M(obj);
                        return (ServerBrandingConfigResponse) obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Country e = dv3.e();
                if (e == null || (str = e.getIso2Alpha()) == null) {
                    str = "XX";
                }
                Context context = (Context) this.t;
                context.getClass();
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
                String string = sharedPreferences.getString("REGION_USER_LAST_REGION", null);
                if (e != null && e.getHasRegions()) {
                    i4 = 1;
                }
                if (i4 != 0 && string != null) {
                    NetworkCoroutineAPI networkCoroutineAPI = ((el) this.u).a;
                    this.s = 1;
                    obj = networkCoroutineAPI.brandingProvidersForRegion(str, string, this);
                    break;
                } else {
                    if (i4 != 0) {
                        return null;
                    }
                    NetworkCoroutineAPI networkCoroutineAPI2 = ((el) this.u).a;
                    this.s = 2;
                    obj = networkCoroutineAPI2.brandingProviders(str, this);
                    break;
                }
                return lu3Var;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    dx dxVar = (dx) this.t;
                    int i8 = 3;
                    tw twVar = new tw(dxVar, i8);
                    g2 g2Var = new g2((ct8) this.u, dxVar, z ? 1 : 0, i8);
                    this.s = 1;
                    if (j72.G(twVar, g2Var, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                dx dxVar2 = (dx) this.t;
                lu3 lu3Var3 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    uw uwVar = new uw(dxVar2, i3);
                    g2 g2Var2 = new g2((ct8) this.u, dxVar2, z2 ? 1 : 0, i);
                    this.s = 1;
                    if (zm2.F(uwVar, g2Var2, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                lo4 f = dxVar2.f();
                xnh xnhVar = (xnh) dxVar2.f;
                Object a = f.a(xnhVar.h());
                if (a != null) {
                    if (Math.abs(xnhVar.h() - dxVar2.f().c(a)) < 0.5f && ((Boolean) ((Function1) dxVar2.b).invoke(a)).booleanValue()) {
                        ((eoh) ((e1d) dxVar2.d)).setValue(a);
                        ((eoh) ((e1d) dxVar2.c)).setValue(a);
                    }
                }
                return Unit.a;
            case 3:
                t30 t30Var = (t30) this.t;
                a5f a5fVar = t30Var.e;
                View view = t30Var.a;
                lu3 lu3Var4 = lu3.a;
                int i10 = this.s;
                int i11 = 11;
                try {
                    if (i10 == 0) {
                        y6a.M(obj);
                        s30 s30Var = new s30();
                        g8j g8jVar = (g8j) this.u;
                        r30 r30Var2 = new r30(s30Var, new p30(t30Var, g8jVar, i4), new p30(t30Var, g8jVar, i5), view);
                        Function1 function1 = t30Var.b;
                        if (function1 != null && (r30Var = (r30) function1.invoke(r30Var2)) != null) {
                            r30Var2 = r30Var;
                        }
                        Looper myLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (myLooper != (handler != null ? handler.getLooper() : null)) {
                            p3 p3Var = t30Var.i;
                            if (p3Var == null) {
                                p3Var = new p3(i, t30Var, r30Var2, s30Var);
                                t30Var.i = p3Var;
                            }
                            view.post(p3Var);
                        } else {
                            ActionMode startActionMode = view.startActionMode(new w88(r30Var2), 1);
                            if (startActionMode == null) {
                                return Unit.a;
                            }
                            t30Var.h = startActionMode;
                        }
                        this.s = 1;
                        Object f2 = s30Var.a.f(this);
                        if (f2 != lu3Var4) {
                            f2 = Unit.a;
                        }
                        if (f2 == lu3Var4) {
                            return lu3Var4;
                        }
                    } else {
                        if (i10 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    a5fVar.a();
                    Looper myLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (myLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnable = t30Var.j;
                        if (runnable == null) {
                            runnable = new y2(t30Var, i11);
                            t30Var.j = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = t30Var.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    p3 p3Var2 = t30Var.i;
                    if (p3Var2 != null) {
                        view.removeCallbacks(p3Var2);
                    }
                    t30Var.h = null;
                    return Unit.a;
                } catch (Throwable th3) {
                    a5fVar.a();
                    Looper myLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (myLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable runnable2 = t30Var.j;
                        if (runnable2 == null) {
                            runnable2 = new y2(t30Var, i11);
                            t30Var.j = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = t30Var.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    p3 p3Var3 = t30Var.i;
                    if (p3Var3 != null) {
                        view.removeCallbacks(p3Var3);
                    }
                    t30Var.h = null;
                    throw th3;
                }
            case 4:
                jo1 jo1Var = (jo1) this.u;
                e1d e1dVar = ((ko1) this.t).c;
                lu3 lu3Var5 = lu3.a;
                int i12 = this.s;
                try {
                    if (i12 == 0) {
                        y6a.M(obj);
                        ((eoh) e1dVar).setValue(jo1Var);
                        this.s = 1;
                        Object f3 = jo1Var.b.f(this);
                        if (f3 != lu3Var5) {
                            f3 = Unit.a;
                        }
                        if (f3 == lu3Var5) {
                            return lu3Var5;
                        }
                    } else {
                        if (i12 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    ((eoh) e1dVar).setValue(null);
                    return Unit.a;
                } catch (Throwable th4) {
                    ((eoh) e1dVar).setValue(null);
                    throw th4;
                }
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = ((c92) this.t).a;
                String str2 = (String) this.u;
                this.s = 1;
                Object buzzerTiles = networkCoroutineAPI3.getBuzzerTiles(str2, this);
                return buzzerTiles == lu3Var6 ? lu3Var6 : buzzerTiles;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI4 = ((cs2) this.t).b;
                wzf wzfVar = (wzf) this.u;
                this.s = 1;
                Object uploadChatImage = networkCoroutineAPI4.uploadChatImage(wzfVar, this);
                return uploadChatImage == lu3Var7 ? lu3Var7 : uploadChatImage;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                k6g k6gVar = (k6g) this.t;
                ib4 ib4Var = new ib4(k6gVar, z3 ? 1 : 0, (Function1) this.u, i4);
                this.s = 1;
                Object useConnection = k6gVar.useConnection(false, ib4Var, this);
                return useConnection == lu3Var8 ? lu3Var8 : useConnection;
            case 8:
                qf4 qf4Var = (qf4) this.u;
                lu3 lu3Var9 = lu3.a;
                int i16 = this.s;
                try {
                } catch (Throwable th5) {
                    h7a c = qf4Var.c();
                    this.t = th5;
                    this.s = 2;
                    Object d2 = c.d(this);
                    if (d2 != lu3Var9) {
                        obj = d2;
                        th = th5;
                    }
                }
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = qf4Var.h(true, this);
                    if (obj == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.t;
                        y6a.M(obj);
                        adiVar = new wnf(((Number) obj).intValue(), th);
                        return new Pair(adiVar, Boolean.TRUE);
                    }
                    y6a.M(obj);
                }
                adiVar = (adi) obj;
                return new Pair(adiVar, Boolean.TRUE);
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI5 = ((oi5) this.t).a;
                String str3 = (String) this.u;
                this.s = 1;
                Object editorsEventsCount = networkCoroutineAPI5.getEditorsEventsCount(str3, this);
                return editorsEventsCount == lu3Var10 ? lu3Var10 : editorsEventsCount;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    v76 v76Var = (v76) this.t;
                    ArrayList arrayList = (ArrayList) this.u;
                    this.s = 1;
                    v76Var.getClass();
                    if (v76.k(v76Var, arrayList, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i19 = this.s;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI6 = (NetworkCoroutineAPI) this.t;
                int id = ((Stage) this.u).getId();
                this.s = 1;
                Object stageDetails = networkCoroutineAPI6.stageDetails(id, this);
                return stageDetails == lu3Var12 ? lu3Var12 : stageDetails;
            case 12:
                n27 n27Var = (n27) this.t;
                lu3 lu3Var13 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = n27Var.c;
                    String str4 = (String) this.u;
                    this.s = 1;
                    wi7Var.getClass();
                    obj = yaa.P(new ug7(wi7Var, str4, z4 ? 1 : 0, i2), this);
                    if (obj == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                if (x2gVar instanceof t2g) {
                    Throwable th6 = ((t2g) x2gVar).a;
                    ia0 ia0Var = ia0.q;
                    if (ok3.p().e().getDevMod()) {
                        Calendar calendar = ke0.a;
                        Application application = n27Var.b;
                        application.getClass();
                        ke0.g(application, "Join-Error: ".concat(yaa.z(th6)), 0);
                    }
                } else if (!(x2gVar instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                FantasyUserLeague fantasyUserLeague = (FantasyUserLeague) yaa.x(x2gVar);
                if (fantasyUserLeague != null) {
                    return c6o.Q(fantasyUserLeague, n27Var.e);
                }
                return null;
            case 13:
                ia7 ia7Var = (ia7) this.t;
                lu3 lu3Var14 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = ia7Var.e;
                    String str5 = (String) this.u;
                    this.s = 1;
                    wi7Var2.getClass();
                    obj = yaa.P(new ug7(wi7Var2, str5, z5 ? 1 : 0, i2), this);
                    if (obj == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar2 = (x2g) obj;
                if (x2gVar2 instanceof t2g) {
                    Throwable th7 = ((t2g) x2gVar2).a;
                    ia0 ia0Var2 = ia0.q;
                    if (ok3.p().e().getDevMod()) {
                        Calendar calendar2 = ke0.a;
                        Application application2 = ia7Var.b;
                        application2.getClass();
                        ke0.g(application2, "Join-Error: ".concat(yaa.z(th7)), 0);
                    }
                } else if (!(x2gVar2 instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                return x2gVar2;
            case 14:
                k18 k18Var = (k18) this.u;
                c6h c6hVar = k18Var.b;
                File file = k18Var.a;
                lu3 lu3Var15 = lu3.a;
                ?? r4 = this.s;
                try {
                    try {
                        try {
                        } finally {
                        }
                    } catch (FileNotFoundException unused) {
                        if (!file.exists()) {
                            return c6hVar.getDefaultValue();
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            this.t = fileInputStream2;
                            this.s = 2;
                            Object readFrom = c6hVar.readFrom(fileInputStream2, this);
                            if (readFrom != lu3Var15) {
                                obj = readFrom;
                                fileInputStream = fileInputStream2;
                            }
                            return lu3Var15;
                        } catch (Throwable th8) {
                            th2 = th8;
                            fileInputStream = fileInputStream2;
                            try {
                                throw th2;
                            } catch (Throwable th9) {
                                n4o.x(fileInputStream, th2);
                                throw th9;
                            }
                        }
                    }
                    if (r4 == 0) {
                        y6a.M(obj);
                        FileInputStream fileInputStream3 = new FileInputStream(file);
                        this.t = fileInputStream3;
                        this.s = 1;
                        obj = c6hVar.readFrom(fileInputStream3, this);
                        r4 = fileInputStream3;
                        break;
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileInputStream = (FileInputStream) this.t;
                            try {
                                y6a.M(obj);
                                n4o.x(fileInputStream, null);
                                return obj;
                            } catch (Throwable th10) {
                                th2 = th10;
                                throw th2;
                            }
                        }
                        FileInputStream fileInputStream4 = (FileInputStream) this.t;
                        y6a.M(obj);
                        r4 = fileInputStream4;
                    }
                    n4o.x(r4, null);
                    return obj;
                } catch (Exception e2) {
                    if (e2 instanceof FileNotFoundException) {
                        throw t62.P(file.getParent(), (FileNotFoundException) e2);
                    }
                    throw e2;
                }
            case 15:
                fsf fsfVar = (fsf) this.u;
                lu3 lu3Var16 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    b98 b98Var = (b98) this.t;
                    ih2 ih2Var = rid.a;
                    Object obj2 = fsfVar.a;
                    if (obj2 == ih2Var) {
                        obj2 = null;
                    }
                    this.s = 1;
                    if (b98Var.emit(obj2, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fsfVar.a = null;
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i23 = this.s;
                if (i23 != 0) {
                    if (i23 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI7 = ((ue9) this.t).a;
                String str6 = (String) this.u;
                this.s = 1;
                Object filterScreenConfig = networkCoroutineAPI7.getFilterScreenConfig(str6, this);
                return filterScreenConfig == lu3Var17 ? lu3Var17 : filterScreenConfig;
            case 17:
                Event event = (Event) this.u;
                lu3 lu3Var18 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    s96 s96Var = ((u8c) this.t).c;
                    int id2 = event.getId();
                    this.s = 1;
                    obj = s96Var.a.tennisPower(id2, this);
                    if (obj == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return aba.z((TennisPowerResponse) obj, event);
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    a5d a5dVar = (a5d) this.t;
                    String str7 = (String) this.u;
                    this.s = 1;
                    a5dVar.getClass();
                    if (z4d.a(a5dVar, str7, this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                f6e f6eVar = (f6e) this.u;
                lk0 lk0Var = (lk0) this.t;
                lu3 lu3Var20 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    k9k k9kVar = f6eVar.b;
                    k9k k9kVar2 = lk0Var.c;
                    lk0Var.c = k9kVar;
                    if (k9kVar2 instanceof l6e) {
                        l6e l6eVar = (l6e) k9kVar2;
                        if (l6eVar.a) {
                            k9kVar.c();
                        }
                        if (l6eVar.b) {
                            k9kVar.k();
                        }
                    }
                    z88 z88Var = f6eVar.a;
                    nk0 nk0Var = new nk0(27, lk0Var, f6eVar);
                    this.s = 1;
                    if (z88Var.collect(nk0Var, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI8 = ((nge) this.t).a;
                    String str8 = (String) this.u;
                    this.s = 1;
                    obj = networkCoroutineAPI8.getPickemConfig(str8, this);
                    if (obj == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((PickemResponse) obj).getPickems();
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i28 = this.s;
                if (i28 != 0) {
                    if (i28 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                aoe aoeVar = (aoe) this.t;
                Player player = (Player) this.u;
                this.s = 1;
                Object a2 = aoe.a(aoeVar, player, true, this);
                return a2 == lu3Var22 ? lu3Var22 : a2;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i29 = this.s;
                if (i29 != 0) {
                    if (i29 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                aoe aoeVar2 = (aoe) this.t;
                ArrayList arrayList2 = (ArrayList) this.u;
                this.s = 1;
                Object b = aoe.b(aoeVar2, arrayList2, this);
                return b == lu3Var23 ? lu3Var23 : b;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i30 = this.s;
                if (i30 != 0) {
                    if (i30 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI9 = ((zte) this.t).b;
                String str9 = (String) this.u;
                this.s = 1;
                Object userPlayerOfTheMatchVotes = networkCoroutineAPI9.getUserPlayerOfTheMatchVotes(str9, this);
                return userPlayerOfTheMatchVotes == lu3Var24 ? lu3Var24 : userPlayerOfTheMatchVotes;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI10 = ((lue) this.t).a;
                    SortedMap<String, String> sortedMap = (SortedMap) this.u;
                    this.s = 1;
                    obj = networkCoroutineAPI10.playerOfTheSeasonHighestRatedPlayers(Sports.FOOTBALL, sortedMap, this);
                    if (obj == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((POTSHighestRatedPlayersResponse) obj).getPlayerOfTheSeasons();
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI11 = ((wve) this.t).b;
                    String str10 = (String) this.u;
                    this.s = 1;
                    obj = networkCoroutineAPI11.suggestedPlayers(str10, this);
                    if (obj == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((SuggestedPlayersResponse) obj).getPlayers();
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i33 = this.s;
                if (i33 != 0) {
                    if (i33 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                UserBadge userBadge = (UserBadge) this.t;
                if (userBadge == UserBadge.NO_BADGE) {
                    userBadge = null;
                }
                dhk dhkVar = ((f9f) this.u).f;
                PostUserBadge postUserBadge = new PostUserBadge(userBadge != null ? userBadge.getBadgeName() : null);
                this.s = 1;
                Object changeUserBadge = dhkVar.a.changeUserBadge(postUserBadge, this);
                return changeUserBadge == lu3Var27 ? lu3Var27 : changeUserBadge;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i34 = this.s;
                if (i34 != 0) {
                    if (i34 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dhk dhkVar2 = ((f9f) this.t).f;
                PostUserNickname postUserNickname = new PostUserNickname((String) this.u);
                this.s = 1;
                Object nickname = dhkVar2.a.nickname(postUserNickname, this);
                return nickname == lu3Var28 ? lu3Var28 : nickname;
            case 28:
                lu3 lu3Var29 = lu3.a;
                int i35 = this.s;
                if (i35 != 0) {
                    if (i35 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dhk dhkVar3 = ((f9f) this.t).f;
                wzf wzfVar2 = (wzf) this.u;
                this.s = 1;
                Object uploadProfileImage = dhkVar3.a.uploadProfileImage(wzfVar2, this);
                return uploadProfileImage == lu3Var29 ? lu3Var29 : uploadProfileImage;
            default:
                MetricsDb_Impl metricsDb_Impl = (MetricsDb_Impl) this.t;
                lu3 lu3Var30 = lu3.a;
                int i36 = this.s;
                try {
                    if (i36 == 0) {
                        y6a.M(obj);
                        metricsDb_Impl.beginTransaction();
                        e eVar = (e) this.u;
                        this.s = 1;
                        obj = eVar.invoke(this);
                        if (obj == lu3Var30) {
                            return lu3Var30;
                        }
                    } else {
                        if (i36 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    metricsDb_Impl.setTransactionSuccessful();
                    metricsDb_Impl.endTransaction();
                    return obj;
                } catch (Throwable th11) {
                    metricsDb_Impl.endTransaction();
                    throw th11;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl(Object obj, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.u = obj;
    }
}
