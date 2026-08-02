package kd;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.sqlite.SQLiteConstraintException;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import c1.g;
import c4.p;
import c4.w;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import com.sports.insider.data.entity.prediction.Game;
import com.sports.insider.data.entity.prediction.GamesInfoData;
import com.sports.insider.data.repository.room.metric.EventsTable;
import com.sports.insider.ui.onboarding.BoardSiAcademyFragment;
import com.sports.insider.ui.onboarding.IdentifyFragment;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.views.CustomButton;
import d4.h;
import da.o;
import ec.x;
import eg.c0;
import eg.f0;
import eg.m0;
import f4.l;
import gf.u;
import ic.e0;
import ic.n;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0122e9;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import la.j1;
import la.s0;
import le.d1;
import le.f1;
import le.f2;
import le.j2;
import m2.d0;
import m2.q;
import m3.f;
import m4.r;
import m4.s;
import md.m;
import me.a0;
import me.y;
import mf.i;
import org.json.JSONObject;
import wc.j0;
import wc.v;
import zc.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19017b;

    /* renamed from: c, reason: collision with root package name */
    public int f19018c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19017b = i5;
        this.f19019d = obj;
        this.f19020e = obj2;
    }

    private final Object c(Object obj) {
        String str = (String) this.f19020e;
        d1 d1Var = (d1) this.f19019d;
        v vVar = d1Var.f19730f;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19018c;
        try {
            if (i5 == 0) {
                h8.b.B(obj);
                this.f19018c = 1;
                obj = vVar.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
            }
        } catch (Exception unused) {
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.f19194a;
        }
        ic.a r5 = d1.r(d1Var, str);
        Long l6 = r5 != null ? new Long(vVar.u(r5)) : null;
        int i10 = Intrinsics.areEqual(str, d1Var.f19739p) ? -1 : d1Var.j;
        int i11 = d1Var.f19765b;
        long longValue = l6 != null ? l6.longValue() : 0L;
        o oVar = new o(str);
        if (i10 > 0) {
            oVar.f8340a.put("id", Integer.valueOf(i10));
        }
        if (i11 > 0 && r5 != null) {
            oVar.j(i11);
            oVar.l(longValue);
            oVar.k(r5.f11063k);
        }
        oVar.m("express");
        Intrinsics.checkNotNullExpressionValue(oVar, "also(...)");
        d1Var.j(oVar);
        return Unit.f19194a;
    }

    private final Object e(Object obj) {
        List list = (List) this.f19019d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19018c;
        if (i5 == 0) {
            h8.b.B(obj);
            f2 f2Var = (f2) this.f19020e;
            this.f19019d = null;
            this.f19018c = 1;
            if (f2.o(f2Var, list, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }

    private final Object g(Object obj) {
        String str = (String) this.f19020e;
        f2 f2Var = (f2) this.f19019d;
        j0 j0Var = f2Var.f19769f;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19018c;
        try {
            if (i5 == 0) {
                h8.b.B(obj);
                this.f19018c = 1;
                obj = j0Var.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
            }
        } catch (Exception unused) {
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.f19194a;
        }
        ic.a r5 = f2.r(f2Var, str);
        Long l6 = r5 != null ? new Long(j0Var.t(r5)) : null;
        int i10 = Intrinsics.areEqual(str, f2Var.q) ? -1 : f2Var.j;
        int i11 = f2Var.f19765b;
        long longValue = l6 != null ? l6.longValue() : 0L;
        o oVar = new o(str);
        if (i10 > 0) {
            oVar.f8340a.put("id", Integer.valueOf(i10));
        }
        if (i11 > 0 && r5 != null) {
            oVar.j(i11);
            oVar.l(longValue);
            oVar.k(r5.f11063k);
        }
        oVar.m("premium");
        Intrinsics.checkNotNullExpressionValue(oVar, "also(...)");
        f2Var.j(oVar);
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (eg.c0.i(new le.j2(r0, r4, r7), r8) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (eg.c0.f(r2, r8) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(Object obj) {
        VipAccessFragment vipAccessFragment = (VipAccessFragment) this.f19020e;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19018c;
        int i10 = 0;
        Continuation continuation = null;
        int i11 = 1;
        if (i5 == 0) {
            h8.b.B(obj);
            f0[] f0VarArr = {(f0) this.f19019d};
            this.f19018c = 1;
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f19018c = 3;
                Object i12 = c0.i(new j2(vipAccessFragment, continuation, i10), this);
                return i12 == aVar ? aVar : i12;
            }
            h8.b.B(obj);
        }
        this.f19018c = 2;
    }

    private final Object j(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19018c;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            return obj;
        }
        h8.b.B(obj);
        Function2 function2 = (Function2) this.f19019d;
        d0 d0Var = (d0) this.f19020e;
        this.f19018c = 1;
        Object invoke = function2.invoke(d0Var, this);
        return invoke == aVar ? aVar : invoke;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function2, mf.i] */
    private final Object k(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19018c;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            return obj;
        }
        h8.b.B(obj);
        ?? r42 = (i) this.f19019d;
        q qVar = (q) this.f19020e;
        this.f19018c = 1;
        Object invoke = r42.invoke(qVar, this);
        return invoke == aVar ? aVar : invoke;
    }

    private final Object l(Object obj) {
        m4.o oVar = (m4.o) this.f19020e;
        r rVar = (r) this.f19019d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19018c;
        if (i5 == 0) {
            h8.b.B(obj);
            s sVar = rVar.f20423e;
            if (sVar == null) {
                throw new IllegalStateException("body == null");
            }
            this.f19019d = rVar;
            this.f19018c = 1;
            obj = m4.o.b(oVar, sVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return new l((d4.r) obj, m4.o.f(oVar.f20407a, rVar.f20422d.a()), h.f8131d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object m(Object obj) {
        String M;
        Boolean bool;
        ka.a aVar = (ka.a) this.f19019d;
        md.d dVar = (md.d) this.f19020e;
        lf.a aVar2 = lf.a.f20034a;
        int i5 = this.f19018c;
        Integer num = null;
        Object[] objArr = 0;
        try {
            if (i5 == 0) {
                h8.b.B(obj);
                String str = aVar.f18954k;
                if (str != null && (M = StringsKt.M(str, "file:/")) != null) {
                    try {
                        File file = new File(M);
                        bool = Boolean.valueOf(file.exists() ? file.delete() : false);
                    } catch (Exception unused) {
                        bool = null;
                    }
                    if (bool == null) {
                        dVar.c("ERROR FILE SYSTEM");
                    } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                        dVar.c("FILE NOT FOUND/DELETE");
                    }
                }
                j1 a7 = md.d.a();
                this.f19018c = 1;
                a7.getClass();
                fb.b bVar = new fb.b();
                lg.e eVar = m0.f9201a;
                obj = c0.A(lg.d.f20063c, new y(bVar, aVar, objArr == true ? 1 : 0, 16), this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
            }
            num = (Integer) obj;
        } catch (Exception unused2) {
        }
        dVar.c(num == null ? "Action error" : num.intValue() > 0 ? "DELETE OK" : "NOT FOUND");
        return Unit.f19194a;
    }

    private final Object n(Object obj) {
        Object obj2 = lf.a.f20034a;
        int i5 = this.f19018c;
        if (i5 == 0) {
            h8.b.B(obj);
            ((m) this.f19019d).getClass();
            md.d dVar = new md.d();
            ka.a aVar = (ka.a) this.f19020e;
            this.f19018c = 1;
            lg.e eVar = m0.f9201a;
            Object A = c0.A(lg.d.f20063c, new e(aVar, dVar, (Continuation) null, 24), this);
            if (A != obj2) {
                A = Unit.f19194a;
            }
            if (A == obj2) {
                return obj2;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0101, code lost:
    
        if (r11 == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0103, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        if (r11 == r2) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        me.h hVar = (me.h) this.f19019d;
        kc.b bVar = (kc.b) this.f19020e;
        Object obj2 = lf.a.f20034a;
        int i5 = this.f19018c;
        boolean z5 = false;
        int i10 = 1;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            hVar.f20627k.j(bVar);
            hg.d1 d1Var = hVar.f20628l;
            Pair pair = new Pair(bVar != null ? bVar.getForecast() : null, bVar != null ? bVar.getOdds() : null);
            d1Var.getClass();
            d1Var.k(null, pair);
            String analyticsFull = bVar != null ? bVar.getAnalyticsFull() : null;
            String analyticsShort = bVar != null ? bVar.getAnalyticsShort() : null;
            if (z.j(analyticsFull, analyticsShort, false)) {
                analyticsShort = null;
            }
            hg.d1 d1Var2 = hVar.q;
            Pair pair2 = new Pair(analyticsShort, analyticsFull);
            d1Var2.getClass();
            d1Var2.k(null, pair2);
            hVar.f20636s.j(bVar != null ? bVar.getImageBackground() : null);
            hVar.f20637t.j(bVar != null ? bVar.getStatus() : null);
            String HHmmString = bVar != null ? bVar.HHmmString() : null;
            String ddMMyyyyString = bVar != null ? bVar.ddMMyyyyString() : null;
            hg.d1 d1Var3 = hVar.f20638u;
            Pair pair3 = new Pair(HHmmString, ddMMyyyyString);
            d1Var3.getClass();
            d1Var3.k(null, pair3);
            hVar.P = bVar != null ? bVar.startTimeMillisSecond() : 0L;
            this.f19018c = 1;
            lg.e eVar = m0.f9201a;
            Object A = c0.A(jg.q.f18523a, new a0(hVar, continuation, i10), this);
            if (A != obj2) {
                A = Unit.f19194a;
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                return Unit.f19194a;
            }
            h8.b.B(obj);
        }
        hg.d1 d1Var4 = hVar.f20640w;
        if ((bVar != null ? new Integer(bVar.getStartTime()) : null) != null && !bVar.isMatchStarted()) {
            z5 = true;
        }
        Boolean valueOf = Boolean.valueOf(z5);
        d1Var4.getClass();
        d1Var4.k(null, valueOf);
        this.f19018c = 2;
        lg.e eVar2 = m0.f9201a;
        Object A2 = c0.A(lg.d.f20063c, new me.v(bVar, hVar, null), this);
        if (A2 != obj2) {
            A2 = Unit.f19194a;
        }
    }

    private final Object p(Object obj) {
        PredictionFragment predictionFragment = (PredictionFragment) this.f19019d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19018c;
        if (i5 == 0) {
            h8.b.B(obj);
            List list = (List) this.f19020e;
            this.f19018c = 1;
            obj = PredictionFragment.H(predictionFragment, list, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        List<ve.c0> list2 = (List) obj;
        x xVar = (x) predictionFragment.f22459a;
        if (xVar != null) {
            xVar.f9061x.setGames(list2);
        }
        return Unit.f19194a;
    }

    private final Object q(Object obj) {
        GamesInfoData gamesInfoData = (GamesInfoData) this.f19019d;
        me.c0 c0Var = (me.c0) this.f19020e;
        Object obj2 = lf.a.f20034a;
        int i5 = this.f19018c;
        if (i5 == 0) {
            h8.b.B(obj);
            List<Game> gamesData = gamesInfoData != null ? gamesInfoData.getGamesData() : null;
            nc.c m98getHomeTeamData = gamesInfoData != null ? gamesInfoData.m98getHomeTeamData() : null;
            nc.c m97getGuestTeamData = gamesInfoData != null ? gamesInfoData.m97getGuestTeamData() : null;
            c0Var.R.j(gamesData);
            c0Var.T.j(m98getHomeTeamData);
            c0Var.U.j(m97getGuestTeamData);
            hg.d1 d1Var = c0Var.V;
            u uVar = new u(new Integer(m98getHomeTeamData != null ? m98getHomeTeamData.getWins() : 0), new Integer(m98getHomeTeamData != null ? m98getHomeTeamData.getLoses() : 0), new Integer(m98getHomeTeamData != null ? m98getHomeTeamData.getDraws() : 0));
            d1Var.getClass();
            d1Var.k(null, uVar);
            hg.d1 d1Var2 = c0Var.W;
            u uVar2 = new u(new Integer(m97getGuestTeamData != null ? m97getGuestTeamData.getWins() : 0), new Integer(m97getGuestTeamData != null ? m97getGuestTeamData.getLoses() : 0), new Integer(m97getGuestTeamData != null ? m97getGuestTeamData.getDraws() : 0));
            d1Var2.getClass();
            d1Var2.k(null, uVar2);
            List games = m98getHomeTeamData != null ? m98getHomeTeamData.getGames() : null;
            List games2 = m97getGuestTeamData != null ? m97getGuestTeamData.getGames() : null;
            this.f19018c = 1;
            Object i10 = c0.i(new g(gamesData, games, games2, c0Var, (Continuation) null), this);
            if (i10 != obj2) {
                i10 = Unit.f19194a;
            }
            if (i10 == obj2) {
                return obj2;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19017b) {
            case 0:
                return new e((d) this.f19019d, (JSONObject) this.f19020e, continuation, 0);
            case 1:
                return new e((k) this.f19019d, (BoardSiAcademyFragment) this.f19020e, continuation, 1);
            case 2:
                e eVar = new e((IdentifyFragment) this.f19020e, continuation, 2);
                eVar.f19019d = obj;
                return eVar;
            case 3:
                return new e((la.d) this.f19019d, (String) this.f19020e, this.f19018c, continuation);
            case 4:
                return new e((a4.i) this.f19019d, (la.m0) this.f19020e, continuation, 4);
            case 5:
                return new e((s0) this.f19019d, (Integer) this.f19020e, continuation, 5);
            case 6:
                return new e((le.h) this.f19019d, (Activity) this.f19020e, continuation, 6);
            case 7:
                return new e((le.h) this.f19020e, continuation, 7);
            case 8:
                return new e((List) this.f19019d, (le.h) this.f19020e, continuation, 8);
            case 9:
                e eVar2 = new e((le.h) this.f19020e, continuation, 9);
                eVar2.f19019d = obj;
                return eVar2;
            case 10:
                e eVar3 = new e((LivePayFragment) this.f19020e, continuation, 10);
                eVar3.f19019d = obj;
                return eVar3;
            case 11:
                return new e((f0) this.f19019d, (LivePayFragment) this.f19020e, continuation, 11);
            case 12:
                return new e((le.z) this.f19019d, (Activity) this.f19020e, continuation, 12);
            case 13:
                e eVar4 = new e((le.z) this.f19020e, continuation, 13);
                eVar4.f19019d = obj;
                return eVar4;
            case 14:
                e eVar5 = new e((d1) this.f19020e, continuation, 14);
                eVar5.f19019d = obj;
                return eVar5;
            case 15:
                return new e((d1) this.f19019d, (String) this.f19020e, continuation, 15);
            case 16:
                return new e((Context) this.f19019d, (f1) this.f19020e, continuation, 16);
            case 17:
                return new e((PayPremiumFragment) this.f19019d, (Boolean) this.f19020e, continuation, 17);
            case 18:
                e eVar6 = new e((f2) this.f19020e, continuation, 18);
                eVar6.f19019d = obj;
                return eVar6;
            case 19:
                return new e((f2) this.f19019d, (String) this.f19020e, continuation, 19);
            case 20:
                return new e((f0) this.f19019d, (VipAccessFragment) this.f19020e, continuation, 20);
            case 21:
                return new e((Function2) this.f19019d, (d0) this.f19020e, continuation, 21);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new e((Function2) this.f19019d, (q) this.f19020e, continuation);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                e eVar7 = new e((m4.o) this.f19020e, continuation, 23);
                eVar7.f19019d = obj;
                return eVar7;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new e((ka.a) this.f19019d, (md.d) this.f19020e, continuation, 24);
            case C0122e9.F /* 25 */:
                return new e((m) this.f19019d, (ka.a) this.f19020e, continuation, 25);
            case C0122e9.G /* 26 */:
                return new e((me.h) this.f19019d, (kc.b) this.f19020e, continuation, 26);
            case C0122e9.H /* 27 */:
                return new e((PredictionFragment) this.f19019d, (List) this.f19020e, continuation, 27);
            case 28:
                return new e((GamesInfoData) this.f19019d, (me.c0) this.f19020e, continuation, 28);
            default:
                return new e((oc.a) this.f19019d, (String) this.f19020e, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19017b) {
        }
        return ((e) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x022f, code lost:
    
        if (eg.c0.i(new le.m(r0, r5, r4 ? 1 : 0), r36) == r1) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0221, code lost:
    
        if (eg.c0.i(new le.m(r0, r5, r9), r36) == r1) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0213, code lost:
    
        if (eg.c0.f(r10, r36) == r1) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:482:? A[RETURN, SYNTHETIC] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object A;
        Object A2;
        Typeface typeface;
        Object A3;
        ec.a aVar;
        Typeface typeface2;
        Object d10;
        ic.o oVar;
        Object A4;
        n a7;
        String str;
        ic.o oVar2;
        Object A5;
        n b10;
        n nVar;
        n a10;
        Object A6;
        n nVar2;
        Continuation continuation;
        Object obj2;
        Object obj3;
        n nVar3;
        n a11;
        n nVar4;
        n a12;
        Object A7;
        Object obj4;
        String str2;
        Object A8;
        Object c2;
        Drawable drawable;
        int i5 = 2;
        boolean z5 = false;
        boolean z7 = false;
        boolean z10 = false;
        boolean z11 = false;
        Continuation continuation2 = null;
        DisplayMetrics displayMetrics = null;
        continuation2 = null;
        int i10 = 1;
        switch (this.f19017b) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f19020e;
                Object obj5 = lf.a.f20034a;
                int i11 = this.f19018c;
                try {
                    if (i11 == 0) {
                        h8.b.B(obj);
                        int k6 = d.k(jSONObject);
                        String optString = jSONObject.optString("mime");
                        if (optString == null || optString.length() == 0) {
                            optString = null;
                        }
                        String optString2 = jSONObject.optString(EventsTable.contentColumn);
                        if (optString2 == null || optString2.length() == 0) {
                            optString2 = null;
                        }
                        String optString3 = jSONObject.optString("operator");
                        if (optString3 == null || optString3.length() == 0) {
                            optString3 = "Support";
                        }
                        String optString4 = jSONObject.optString("body");
                        if (optString4 != null && optString4.length() != 0) {
                            continuation2 = optString4;
                        }
                        String optString5 = jSONObject.optString("created_at", "nil");
                        long currentTimeMillis = optString5.equals("nil") ? System.currentTimeMillis() / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : ZonedDateTime.parse(optString5, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
                        this.f19018c = 1;
                        if (new m().k(k6, optString3, optString, optString2, (int) currentTimeMillis, continuation2, this) == obj5) {
                            return obj5;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception e7) {
                    zc.d.b(4, "SupportPush", e7);
                }
                return Unit.f19194a;
            case 1:
                BoardSiAcademyFragment boardSiAcademyFragment = (BoardSiAcademyFragment) this.f19020e;
                k kVar = (k) this.f19019d;
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f19018c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    ke.c cVar = new ke.c(kVar, continuation2, z7 ? 1 : 0);
                    this.f19018c = 1;
                    A = c0.A(dVar, cVar, this);
                    if (A == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            h8.b.B(obj);
                            A2 = obj;
                            typeface = (Typeface) A2;
                            if (typeface != null && (aVar = (ec.a) boardSiAcademyFragment.f22459a) != null) {
                                aVar.f8843c.setTypeface(typeface);
                            }
                            lg.e eVar2 = m0.f9201a;
                            lg.d dVar2 = lg.d.f20063c;
                            ke.c cVar2 = new ke.c(kVar, continuation2, i5);
                            this.f19018c = 3;
                            A3 = c0.A(dVar2, cVar2, this);
                            if (A3 == aVar2) {
                                return aVar2;
                            }
                            typeface2 = (Typeface) A3;
                            if (typeface2 != null) {
                            }
                            return Unit.f19194a;
                        }
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        A3 = obj;
                        typeface2 = (Typeface) A3;
                        if (typeface2 != null) {
                            ec.a aVar3 = (ec.a) boardSiAcademyFragment.f22459a;
                            if (aVar3 != null) {
                                CustomButton customButton = aVar3.f8842b;
                                customButton.f7295m = false;
                                DisplayMetrics displayMetrics2 = customButton.G;
                                if (displayMetrics2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("metrics");
                                    displayMetrics2 = null;
                                }
                                Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
                                int i13 = Build.VERSION.SDK_INT;
                                customButton.f7300s = i13 >= 34 ? TypedValue.applyDimension(2, 20.0f, displayMetrics2) : displayMetrics2.scaledDensity * 20.0f;
                                DisplayMetrics displayMetrics3 = customButton.G;
                                if (displayMetrics3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("metrics");
                                } else {
                                    displayMetrics = displayMetrics3;
                                }
                                Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
                                customButton.f7301t = i13 >= 34 ? TypedValue.applyDimension(2, 13.0f, displayMetrics) : displayMetrics.scaledDensity * 13.0f;
                                customButton.requestLayout();
                                customButton.invalidate();
                            }
                            ec.a aVar4 = (ec.a) boardSiAcademyFragment.f22459a;
                            if (aVar4 != null) {
                                aVar4.f8842b.setButtonTypeface(typeface2);
                            }
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A = obj;
                }
                Typeface typeface3 = (Typeface) A;
                if (typeface3 != null) {
                    ec.a aVar5 = (ec.a) boardSiAcademyFragment.f22459a;
                    if (aVar5 != null) {
                        aVar5.j.setTypeface(typeface3);
                    }
                    ec.a aVar6 = (ec.a) boardSiAcademyFragment.f22459a;
                    if (aVar6 != null) {
                        aVar6.f8849i.setTypeface(typeface3);
                    }
                }
                lg.e eVar3 = m0.f9201a;
                lg.d dVar3 = lg.d.f20063c;
                ke.c cVar3 = new ke.c(kVar, continuation2, i10);
                this.f19018c = 2;
                A2 = c0.A(dVar3, cVar3, this);
                if (A2 == aVar2) {
                    return aVar2;
                }
                typeface = (Typeface) A2;
                if (typeface != null) {
                    aVar.f8843c.setTypeface(typeface);
                }
                lg.e eVar22 = m0.f9201a;
                lg.d dVar22 = lg.d.f20063c;
                ke.c cVar22 = new ke.c(kVar, continuation2, i5);
                this.f19018c = 3;
                A3 = c0.A(dVar22, cVar22, this);
                if (A3 == aVar2) {
                }
                typeface2 = (Typeface) A3;
                if (typeface2 != null) {
                }
                return Unit.f19194a;
            case 2:
                IdentifyFragment identifyFragment = (IdentifyFragment) this.f19020e;
                AtomicBoolean atomicBoolean = identifyFragment.f6937f;
                eg.z zVar = (eg.z) this.f19019d;
                lf.a aVar7 = lf.a.f20034a;
                int i14 = this.f19018c;
                try {
                    try {
                        if (i14 == 0) {
                            h8.b.B(obj);
                            if (atomicBoolean.get()) {
                                return Unit.f19194a;
                            }
                            atomicBoolean.set(true);
                            sc.h hVar = (sc.h) identifyFragment.f6934c.getValue();
                            this.f19019d = zVar;
                            this.f19018c = 1;
                            d10 = hVar.d(this);
                            if (d10 == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            d10 = obj;
                        }
                        Pair pair = (Pair) d10;
                        int intValue = ((Number) pair.f19192a).intValue();
                        if (200 > intValue || intValue >= 400) {
                            identifyFragment.f6936e = (Integer) pair.f19192a;
                            identifyFragment.f6935d = (String) pair.f19193b;
                        }
                    } catch (Exception e9) {
                        w wVar = zc.a.f25907a;
                        eg.y yVar = (eg.y) zVar.C().r(eg.y.f9241c);
                        zc.a.a(yVar != null ? yVar.f9242b : null, e9);
                        identifyFragment.f6936e = new Integer(600);
                        identifyFragment.f6935d = e9.getMessage();
                    }
                    return Unit.f19194a;
                } finally {
                    atomicBoolean.set(false);
                }
            case 3:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                la.d dVar4 = (la.d) this.f19019d;
                la.d.K0(dVar4).d("announcement", (String) this.f19020e);
                fa.a K0 = la.d.K0(dVar4);
                int i15 = this.f19018c;
                K0.getClass();
                Intrinsics.checkNotNullParameter("announcementId", "key");
                SharedPreferences.Editor edit = K0.f9541a.edit();
                edit.putInt("announcementId", i15);
                edit.apply();
                la.d.K0(dVar4).c(i15 <= 0 ? 0L : System.currentTimeMillis(), "announcementIdCreate");
                la.d.K0(dVar4).b("announcementIsRead", false);
                return Unit.f19194a;
            case 4:
                Object obj6 = lf.a.f20034a;
                int i16 = this.f19018c;
                try {
                    if (i16 == 0) {
                        h8.b.B(obj);
                        a4.i iVar = (a4.i) this.f19019d;
                        if (iVar == null) {
                            return null;
                        }
                        List<a4.h> forecasts = iVar.getForecasts();
                        if (forecasts != null) {
                            for (a4.h hVar2 : forecasts) {
                                if (hVar2.getOwn() == 1) {
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        hVar2 = null;
                        if (hVar2 == null) {
                            List forecasts2 = iVar.getForecasts();
                            hVar2 = forecasts2 != null ? (a4.h) CollectionsKt.firstOrNull(forecasts2) : null;
                        }
                        String coefficient = hVar2 != null ? hVar2.getCoefficient() : null;
                        String forecast = hVar2 != null ? hVar2.getForecast() : null;
                        iVar.getForecasts();
                        fb.b bVar = new fb.b();
                        int id2 = iVar.getId();
                        Boolean publication = iVar.getPublication();
                        String leagueName = iVar.getLeagueName();
                        String startTime = iVar.getStartTime();
                        String background = iVar.getBackground();
                        a4.g analytics = iVar.getAnalytics();
                        String full = analytics != null ? analytics.getFull() : null;
                        a4.g analytics2 = iVar.getAnalytics();
                        String str3 = analytics2 != null ? analytics2.getShort() : null;
                        Boolean resultsIsViewed = iVar.getResultsIsViewed();
                        int type = iVar.getType();
                        String status = iVar.getStatus();
                        a4.e homeTeam = iVar.getHomeTeam();
                        Integer num = homeTeam != null ? new Integer(homeTeam.getId()) : null;
                        a4.e homeTeam2 = iVar.getHomeTeam();
                        String name = homeTeam2 != null ? homeTeam2.getName() : null;
                        a4.e homeTeam3 = iVar.getHomeTeam();
                        String flag = homeTeam3 != null ? homeTeam3.getFlag() : null;
                        a4.e homeTeam4 = iVar.getHomeTeam();
                        Integer score = homeTeam4 != null ? homeTeam4.getScore() : null;
                        a4.e homeTeam5 = iVar.getHomeTeam();
                        Integer scoreExtra = homeTeam5 != null ? homeTeam5.getScoreExtra() : null;
                        a4.e guestTeam = iVar.getGuestTeam();
                        Integer num2 = guestTeam != null ? new Integer(guestTeam.getId()) : null;
                        a4.e guestTeam2 = iVar.getGuestTeam();
                        String name2 = guestTeam2 != null ? guestTeam2.getName() : null;
                        a4.e guestTeam3 = iVar.getGuestTeam();
                        String flag2 = guestTeam3 != null ? guestTeam3.getFlag() : null;
                        a4.e guestTeam4 = iVar.getGuestTeam();
                        Integer score2 = guestTeam4 != null ? guestTeam4.getScore() : null;
                        a4.e guestTeam5 = iVar.getGuestTeam();
                        Integer scoreExtra2 = guestTeam5 != null ? guestTeam5.getScoreExtra() : null;
                        Integer[] kindsOfSport = iVar.getKindsOfSport();
                        this.f19018c = 1;
                        lg.e eVar4 = m0.f9201a;
                        Object A9 = c0.A(lg.d.f20063c, new kb.a(bVar, id2, publication, leagueName, startTime, background, full, str3, resultsIsViewed, type, status, coefficient, forecast, num, name, flag, score, scoreExtra, num2, name2, flag2, score2, scoreExtra2, kindsOfSport, null), this);
                        if ((A9 == lf.a.f20034a ? A9 : Unit.f19194a) == obj6) {
                            return obj6;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (SQLiteConstraintException unused) {
                } catch (Exception e10) {
                    zc.d.b(6, null, e10);
                }
                return Unit.f19194a;
            case 5:
                s0 s0Var = (s0) this.f19019d;
                lf.a aVar9 = lf.a.f20034a;
                int i17 = this.f19018c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                String str4 = gc.d.f9945a;
                String c8 = d2.i.c();
                Integer num3 = (Integer) this.f19020e;
                this.f19018c = 1;
                lg.e eVar5 = m0.f9201a;
                Object A10 = c0.A(lg.d.f20063c, new c4.u(s0Var, num3, c8, null, 1), this);
                return A10 == aVar9 ? aVar9 : A10;
            case 6:
                lf.a aVar10 = lf.a.f20034a;
                int i18 = this.f19018c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    le.h hVar3 = (le.h) this.f19019d;
                    Activity activity = (Activity) this.f19020e;
                    this.f19018c = 1;
                    if (hVar3.f(activity, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 7:
                le.h hVar4 = (le.h) this.f19020e;
                wc.e eVar6 = hVar4.f19797f;
                lf.a aVar11 = lf.a.f20034a;
                int i19 = this.f19018c;
                int i20 = 13;
                Continuation continuation3 = null;
                if (i19 == 0) {
                    h8.b.B(obj);
                    this.f19018c = 1;
                    if (le.h.o(hVar4, this) == aVar11) {
                        return aVar11;
                    }
                } else if (i19 == 1) {
                    h8.b.B(obj);
                } else if (i19 == 2) {
                    h8.b.B(obj);
                    A4 = obj;
                    oVar = (ic.o) A4;
                    a7 = (oVar != null || (b10 = ((e0) oVar).b(hVar4.f19807r, hVar4.f19809t)) == null) ? oVar != null ? ((e0) oVar).a(hVar4.f19807r) : null : b10;
                    str = hVar4.q;
                    if (str != null) {
                        this.f19019d = a7;
                        this.f19018c = 3;
                        eVar6.getClass();
                        ((la.h) y3.m(la.h.class, null, 6)).getClass();
                        f fVar = new f(i20);
                        lg.e eVar7 = m0.f9201a;
                        A5 = c0.A(lg.d.f20063c, new eb.g(fVar, str, continuation3, i10), this);
                        if (A5 == aVar11) {
                            return aVar11;
                        }
                        oVar2 = (ic.o) A5;
                        n nVar5 = a7;
                        if (oVar2 != null) {
                        }
                        if (oVar2 == null) {
                        }
                    } else {
                        oVar2 = null;
                        n nVar52 = a7;
                        if (oVar2 != null) {
                        }
                        if (oVar2 == null) {
                        }
                    }
                } else {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar2 = (n) this.f19019d;
                        h8.b.B(obj);
                        if (nVar2 == null) {
                            eVar6.f(2L);
                        }
                        return Unit.f19194a;
                    }
                    n nVar6 = (n) this.f19019d;
                    h8.b.B(obj);
                    a7 = nVar6;
                    A5 = obj;
                    oVar2 = (ic.o) A5;
                    n nVar522 = a7;
                    if (oVar2 != null || (a10 = ((e0) oVar2).b(hVar4.f19808s, hVar4.f19810u)) == null) {
                        if (oVar2 == null) {
                            nVar = null;
                            this.f19019d = nVar522;
                            this.f19018c = 4;
                            lg.e eVar8 = m0.f9201a;
                            A6 = c0.A(lg.d.f20063c, new androidx.lifecycle.o(hVar4, nVar522, nVar, continuation3, 25), this);
                            if (A6 != aVar11) {
                                A6 = Unit.f19194a;
                            }
                            if (A6 != aVar11) {
                                return aVar11;
                            }
                            nVar2 = nVar522;
                            if (nVar2 == null) {
                            }
                            return Unit.f19194a;
                        }
                        a10 = ((e0) oVar2).a(hVar4.f19808s);
                    }
                    nVar = a10;
                    this.f19019d = nVar522;
                    this.f19018c = 4;
                    lg.e eVar82 = m0.f9201a;
                    A6 = c0.A(lg.d.f20063c, new androidx.lifecycle.o(hVar4, nVar522, nVar, continuation3, 25), this);
                    if (A6 != aVar11) {
                    }
                    if (A6 != aVar11) {
                    }
                }
                String str5 = hVar4.f19806p;
                if (str5 != null) {
                    this.f19018c = 2;
                    eVar6.getClass();
                    ((la.h) y3.m(la.h.class, null, 6)).getClass();
                    f fVar2 = new f(i20);
                    lg.e eVar9 = m0.f9201a;
                    A4 = c0.A(lg.d.f20063c, new eb.g(fVar2, str5, continuation3, i10), this);
                    if (A4 == aVar11) {
                        return aVar11;
                    }
                    oVar = (ic.o) A4;
                    if (oVar != null) {
                    }
                    str = hVar4.q;
                    if (str != null) {
                    }
                } else {
                    oVar = null;
                    if (oVar != null) {
                    }
                    str = hVar4.q;
                    if (str != null) {
                    }
                }
            case 8:
                List list = (List) this.f19019d;
                le.h hVar5 = (le.h) this.f19020e;
                Object obj7 = lf.a.f20034a;
                int i21 = this.f19018c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    Iterator it = list.iterator();
                    while (true) {
                        continuation = null;
                        if (it.hasNext()) {
                            obj2 = it.next();
                            ic.o oVar3 = (ic.o) obj2;
                            if (Intrinsics.areEqual(oVar3 != null ? ((e0) oVar3).f11108b : null, hVar5.f19806p)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ic.o oVar4 = (ic.o) obj2;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            ic.o oVar5 = (ic.o) obj3;
                            if (Intrinsics.areEqual(oVar5 != null ? ((e0) oVar5).f11108b : null, hVar5.q)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    ic.o oVar6 = (ic.o) obj3;
                    if (oVar4 == null || (a11 = ((e0) oVar4).b(hVar5.f19807r, hVar5.f19809t)) == null) {
                        if (oVar4 != null) {
                            a11 = ((e0) oVar4).a(hVar5.f19807r);
                        } else {
                            nVar3 = null;
                            if (oVar6 != null || (a12 = ((e0) oVar6).b(hVar5.f19808s, hVar5.f19810u)) == null) {
                                if (oVar6 == null) {
                                    a12 = ((e0) oVar6).a(hVar5.f19808s);
                                } else {
                                    nVar4 = null;
                                    this.f19018c = 1;
                                    lg.e eVar10 = m0.f9201a;
                                    A7 = c0.A(lg.d.f20063c, new androidx.lifecycle.o(hVar5, nVar3, nVar4, continuation, 25), this);
                                    obj4 = A7;
                                    if (A7 != lf.a.f20034a) {
                                        obj4 = Unit.f19194a;
                                    }
                                    if (obj4 == obj7) {
                                        return obj7;
                                    }
                                }
                            }
                            nVar4 = a12;
                            this.f19018c = 1;
                            lg.e eVar102 = m0.f9201a;
                            A7 = c0.A(lg.d.f20063c, new androidx.lifecycle.o(hVar5, nVar3, nVar4, continuation, 25), this);
                            obj4 = A7;
                            if (A7 != lf.a.f20034a) {
                            }
                            if (obj4 == obj7) {
                            }
                        }
                    }
                    nVar3 = a11;
                    if (oVar6 != null) {
                    }
                    if (oVar6 == null) {
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 9:
                List list2 = (List) this.f19019d;
                Object obj8 = lf.a.f20034a;
                int i22 = this.f19018c;
                if (i22 == 0) {
                    h8.b.B(obj);
                    le.h hVar6 = (le.h) this.f19020e;
                    this.f19019d = null;
                    this.f19018c = 1;
                    lg.e eVar11 = m0.f9201a;
                    Object A11 = c0.A(lg.d.f20063c, new e(list2, hVar6, continuation2, 8), this);
                    Object obj9 = A11;
                    if (A11 != obj8) {
                        obj9 = Unit.f19194a;
                    }
                    if (obj9 == obj8) {
                        return obj8;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 10:
                LivePayFragment livePayFragment = (LivePayFragment) this.f19020e;
                eg.z zVar2 = (eg.z) this.f19019d;
                lf.a aVar12 = lf.a.f20034a;
                int i23 = this.f19018c;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                lg.e eVar12 = m0.f9201a;
                lg.d dVar5 = lg.d.f20063c;
                c0.e(zVar2, dVar5, new le.n(livePayFragment, continuation2, (int) (z10 ? 1 : 0)), 2);
                c0.e(zVar2, dVar5, new le.n(livePayFragment, continuation2, i10), 2);
                try {
                    str2 = livePayFragment.getResources().getString(R.string.btn_text_subscribe);
                } catch (Exception unused2) {
                    str2 = "Subscribe";
                }
                String str6 = str2;
                Intrinsics.checkNotNull(str6);
                int parseColor = Color.parseColor("#0957EE");
                int parseColor2 = Color.parseColor("#7B14CC");
                fg.e eVar13 = jg.q.f18523a;
                bd.i iVar2 = new bd.i(livePayFragment, parseColor, parseColor2, str6, null, 12);
                this.f19019d = null;
                this.f19018c = 1;
                Object A12 = c0.A(eVar13, iVar2, this);
                return A12 == aVar12 ? aVar12 : A12;
            case 11:
                LivePayFragment livePayFragment2 = (LivePayFragment) this.f19020e;
                lf.a aVar13 = lf.a.f20034a;
                int i24 = this.f19018c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    f0[] f0VarArr = {(f0) this.f19019d};
                    this.f19018c = 1;
                    break;
                } else if (i24 == 1) {
                    h8.b.B(obj);
                } else {
                    if (i24 != 2) {
                        if (i24 != 3) {
                            if (i24 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return obj;
                        }
                        h8.b.B(obj);
                        this.f19018c = 4;
                        Object i25 = c0.i(new e(livePayFragment2, continuation2, 10), this);
                        if (i25 != aVar13) {
                            return i25;
                        }
                        return aVar13;
                    }
                    h8.b.B(obj);
                    this.f19018c = 3;
                    break;
                }
                this.f19018c = 2;
                break;
            case 12:
                Object obj10 = lf.a.f20034a;
                int i26 = this.f19018c;
                if (i26 == 0) {
                    h8.b.B(obj);
                    le.z zVar3 = (le.z) this.f19019d;
                    Activity activity2 = (Activity) this.f19020e;
                    this.f19018c = 1;
                    lg.e eVar14 = m0.f9201a;
                    Object A13 = c0.A(lg.d.f20063c, new bd.i(zVar3, activity2, continuation2, 14), this);
                    Object obj11 = A13;
                    if (A13 != obj10) {
                        obj11 = Unit.f19194a;
                    }
                    if (obj11 == obj10) {
                        return obj10;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 13:
                List list3 = (List) this.f19019d;
                lf.a aVar14 = lf.a.f20034a;
                int i27 = this.f19018c;
                if (i27 == 0) {
                    h8.b.B(obj);
                    le.z zVar4 = (le.z) this.f19020e;
                    this.f19019d = null;
                    this.f19018c = 1;
                    if (le.z.e(zVar4, list3, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 14:
                List list4 = (List) this.f19019d;
                lf.a aVar15 = lf.a.f20034a;
                int i28 = this.f19018c;
                if (i28 == 0) {
                    h8.b.B(obj);
                    d1 d1Var = (d1) this.f19020e;
                    this.f19019d = null;
                    this.f19018c = 1;
                    if (d1.o(d1Var, list4, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 15:
                return c(obj);
            case 16:
                lf.a aVar16 = lf.a.f20034a;
                int i29 = this.f19018c;
                try {
                    if (i29 == 0) {
                        h8.b.B(obj);
                        sd.b bVar2 = new sd.b((Context) this.f19019d, 2);
                        Bundle g10 = ((f1) this.f19020e).g();
                        this.f19018c = 1;
                        if (bVar2.d(g10, this) == aVar16) {
                            return aVar16;
                        }
                    } else {
                        if (i29 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception e11) {
                    zc.d.b(4, "showHintMessP", e11);
                }
                return Unit.f19194a;
            case 17:
                PayPremiumFragment payPremiumFragment = (PayPremiumFragment) this.f19019d;
                lf.a aVar17 = lf.a.f20034a;
                int i30 = this.f19018c;
                if (i30 == 0) {
                    h8.b.B(obj);
                    lg.e eVar15 = m0.f9201a;
                    lg.d dVar6 = lg.d.f20063c;
                    ab.b bVar3 = new ab.b((Boolean) this.f19020e, payPremiumFragment, continuation2, 23);
                    this.f19018c = 1;
                    A8 = c0.A(dVar6, bVar3, this);
                    if (A8 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A8 = obj;
                }
                String str7 = (String) A8;
                ec.w wVar2 = (ec.w) payPremiumFragment.f22459a;
                if (wVar2 != null) {
                    wVar2.f9031c.setButtonText(str7);
                }
                return Unit.f19194a;
            case 18:
                return e(obj);
            case 19:
                return g(obj);
            case 20:
                return h(obj);
            case 21:
                return j(obj);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return k(obj);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return l(obj);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return m(obj);
            case C0122e9.F /* 25 */:
                return n(obj);
            case C0122e9.G /* 26 */:
                return o(obj);
            case C0122e9.H /* 27 */:
                return p(obj);
            case 28:
                return q(obj);
            default:
                oc.a aVar18 = (oc.a) this.f19019d;
                Context context = aVar18.f21154a;
                lf.a aVar19 = lf.a.f20034a;
                int i31 = this.f19018c;
                try {
                    if (i31 == 0) {
                        h8.b.B(obj);
                        q4.e eVar16 = new q4.e(context);
                        eVar16.f21940c = (String) this.f19020e;
                        q4.b bVar4 = q4.b.f21930c;
                        eVar16.f21946i = bVar4;
                        eVar16.f21945h = bVar4;
                        eVar16.j = bVar4;
                        eVar16.f21950n = new r4.e(ci.c.c(oc.a.a(aVar18), oc.a.a(aVar18)));
                        eVar16.f21951o = r4.g.f22299b;
                        q4.h a13 = eVar16.a();
                        c4.o a14 = c4.y.a(context);
                        this.f19018c = 1;
                        c2 = ((c4.v) a14).c(a13, this);
                        if (c2 == aVar19) {
                            return aVar19;
                        }
                    } else {
                        if (i31 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        c2 = obj;
                    }
                    c4.m image = ((q4.k) c2).getImage();
                    if (image != null) {
                        Resources resources = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        drawable = p.b(image, resources);
                    } else {
                        drawable = null;
                    }
                    if (drawable != null) {
                        return y3.A(drawable, oc.a.a(aVar18), oc.a.a(aVar18), 4);
                    }
                    return null;
                } catch (Exception unused3) {
                    return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19017b = i5;
        this.f19020e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function2 function2, q qVar, Continuation continuation) {
        super(2, continuation);
        this.f19017b = 22;
        this.f19019d = (i) function2;
        this.f19020e = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(la.d dVar, String str, int i5, Continuation continuation) {
        super(2, continuation);
        this.f19017b = 3;
        this.f19019d = dVar;
        this.f19020e = str;
        this.f19018c = i5;
    }
}
