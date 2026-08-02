package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Description;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.RaceDetailsResponse;
import com.sofascore.model.newNetwork.StageOddsResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.totr.share.TeamOfTheRoundShareBottomSheet;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.team.TeamWorker;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.tv.TVScheduleActivity;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h4i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4i(TVScheduleActivity tVScheduleActivity, b1d b1dVar, rq3 rq3Var, TVScheduleActivity tVScheduleActivity2) {
        super(2, rq3Var);
        this.r = 9;
        e6b e6bVar = e6b.a;
        this.t = tVScheduleActivity;
        this.u = b1dVar;
        this.v = tVScheduleActivity2;
    }

    private final Object e(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        u8c u8cVar = ((qlj) this.t).e;
        MediaPost mediaPost = (MediaPost) this.u;
        Set set = ((a38) this.v).a.f;
        this.s = 1;
        Object d = u8c.d(u8cVar, mediaPost, set, this, 6);
        return d == lu3Var ? lu3Var : d;
    }

    private final Object f(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        koj kojVar = (koj) this.t;
        boj bojVar = (boj) this.u;
        rnj rnjVar = (rnj) this.v;
        int i2 = rnjVar.a;
        int i3 = rnjVar.b;
        String str = rnjVar.c;
        this.s = 1;
        hs4 hs4Var = z45.a;
        Object R = xw3.R(hq4.c, new foj(bojVar, kojVar, i2, i3, str, null), this);
        return R == lu3Var ? lu3Var : R;
    }

    private final Object g(Object obj) {
        muj mujVar = (muj) this.v;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            ArrayList W = CollectionsKt.W((List) this.u);
            ArrayList arrayList = new ArrayList();
            Iterator it = W.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int intValue = ((Number) next).intValue();
                if (intValue != 241802 && mujVar.t.get(new Integer(intValue)) == null) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(xw3.t(ku3Var, null, new zni(mujVar, ((Number) it2.next()).intValue(), rq3Var, 5), 3));
            }
            this.t = null;
            this.s = 1;
            obj = m6k.u(arrayList2, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Pair pair : (Iterable) obj) {
            int intValue2 = ((Number) pair.a).intValue();
            xtj xtjVar = (xtj) pair.b;
            Pair pair2 = xtjVar != null ? new Pair(new Integer(intValue2), xtjVar) : null;
            if (pair2 != null) {
                arrayList3.add(pair2);
            }
        }
        return arrayList3;
    }

    private final Object h(Object obj) {
        j2d j2dVar;
        t01 t01Var = (t01) this.v;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            o0h o0hVar = (o0h) t01Var;
            a5f a5fVar = o0hVar.i;
            if (a5fVar != null) {
                a5fVar.i(o0hVar, yso.o, o0hVar.h);
            }
            j2d j2dVar2 = o0hVar.l;
            this.t = j2dVar2;
            this.u = t01Var;
            this.s = 1;
            if (j2dVar2.e(this) == lu3Var) {
                return lu3Var;
            }
            j2dVar = j2dVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t01Var = (t01) this.u;
            j2dVar = (j2d) this.t;
            y6a.M(obj);
        }
        try {
            ((o0h) t01Var).e = ((eoh) ((o0h) t01Var).c).getValue();
            lj2 lj2Var = ((o0h) t01Var).k;
            if (lj2Var != null) {
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(((eoh) ((o0h) t01Var).c).getValue());
            }
            ((o0h) t01Var).k = null;
            Unit unit = Unit.a;
            j2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0041, code lost:
    
        if (r6 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        avj avjVar;
        Object b;
        pkd pkdVar;
        ReentrantLock reentrantLock;
        okd[] okdVarArr;
        okd okdVar;
        ReentrantLock reentrantLock2;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        boolean z = true;
        if (i == 0) {
            y6a.M(obj);
            avjVar = (avj) this.u;
            this.u = avjVar;
            this.s = 1;
            b = avjVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                reentrantLock2 = (ReentrantLock) this.t;
                pkdVar = (pkd) this.u;
                try {
                    y6a.M(obj);
                    reentrantLock = reentrantLock2;
                    pkdVar.f = false;
                    Unit unit = Unit.a;
                    reentrantLock.unlock();
                    return Unit.a;
                } catch (Throwable th) {
                    th = th;
                    try {
                        pkdVar.f = false;
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        reentrantLock = reentrantLock2;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
            }
            avjVar = (avj) this.u;
            y6a.M(obj);
            b = obj;
        }
        avj avjVar2 = avjVar;
        if (((Boolean) b).booleanValue()) {
            return Unit.a;
        }
        i1k i1kVar = (i1k) this.v;
        pkdVar = (pkd) i1kVar.h;
        reentrantLock = pkdVar.e;
        reentrantLock.lock();
        try {
            pkdVar.f = true;
            ReentrantLock reentrantLock3 = pkdVar.a;
            reentrantLock3.lock();
            try {
                if (pkdVar.d) {
                    pkdVar.d = false;
                    int length = pkdVar.b.length;
                    okd[] okdVarArr2 = new okd[length];
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 < length) {
                        boolean z3 = pkdVar.b[i2] > 0 ? z : false;
                        boolean[] zArr = pkdVar.c;
                        if (z3 != zArr[i2]) {
                            zArr[i2] = z3;
                            okdVar = z3 ? okd.b : okd.c;
                            z2 = true;
                        } else {
                            okdVar = okd.a;
                        }
                        okdVarArr2[i2] = okdVar;
                        i2++;
                        z = true;
                    }
                    if (z2) {
                        okdVarArr = okdVarArr2;
                        if (okdVarArr != null) {
                            try {
                                if (okdVarArr.length != 0) {
                                    zuj zujVar = zuj.b;
                                    eqe eqeVar = new eqe(okdVarArr, i1kVar, avjVar2, (rq3) null, 4);
                                    this.u = pkdVar;
                                    this.t = reentrantLock;
                                    this.s = 2;
                                    if (avjVar2.a(zujVar, eqeVar, this) != lu3Var) {
                                        reentrantLock2 = reentrantLock;
                                        reentrantLock = reentrantLock2;
                                    }
                                    return lu3Var;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                reentrantLock2 = reentrantLock;
                                pkdVar.f = false;
                                throw th;
                            }
                        }
                        pkdVar.f = false;
                        Unit unit2 = Unit.a;
                        reentrantLock.unlock();
                        return Unit.a;
                    }
                }
                okdVarArr = null;
                if (okdVarArr != null) {
                }
                pkdVar.f = false;
                Unit unit22 = Unit.a;
                reentrantLock.unlock();
                return Unit.a;
            } finally {
                reentrantLock3.unlock();
            }
        } catch (Throwable th4) {
            th = th4;
            reentrantLock.unlock();
            throw th;
        }
    }

    private final Object k(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            b1d b1dVar = (b1d) this.t;
            usf usfVar = new usf(12, (VenueMatchesFragment) this.u, (VenueMatchesFragment) this.v);
            this.s = 1;
            if (b1dVar.collect(usfVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        pvd.x();
        return null;
    }

    private final Object l(Object obj) {
        ale aleVar = (ale) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0 && i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        do {
            ((boh) this.u).i(aleVar.getCurrentPosition());
            boh bohVar = (boh) this.v;
            Long l = new Long(aleVar.getDuration());
            if (l.longValue() <= 0) {
                l = null;
            }
            bohVar.i(l != null ? l.longValue() : 1L);
            this.s = 1;
        } while (n4o.y(150L, this) != lu3Var);
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        r0.e = (int) (java.lang.System.currentTimeMillis() / 1000);
        r14 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r14 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        r14.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        if (defpackage.n4o.y(2000, r13) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0033, code lost:
    
        if (defpackage.n4o.y(500, r13) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e1, code lost:
    
        return r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00df -> B:47:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m(Object obj) {
        LinkedHashSet linkedHashSet;
        boolean z;
        zsk zskVar = (zsk) this.v;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
                Function0 function0 = (Function0) this.u;
                boolean z2 = (function0 == null || ((Boolean) function0.invoke()).booleanValue()) ? false : true;
                boolean z3 = ((int) (System.currentTimeMillis() / 1000)) - zskVar.e >= zskVar.b;
                if (zskVar.a.b().compareTo(e6b.e) >= 0 && !z2 && z3 && ((linkedHashSet = zskVar.f) == null || !linkedHashSet.isEmpty())) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        View view = (View) it.next();
                        if (view.getVisibility() == 0 && view.isAttachedToWindow()) {
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            if (i2 > 0) {
                                if (iArr[1] >= i2) {
                                    z = false;
                                    if (iArr[1] > 0 && z) {
                                        break;
                                    }
                                }
                            } else {
                                s38.a().c(new IllegalArgumentException("Screen height == 0"));
                            }
                            z = true;
                            if (iArr[1] > 0) {
                                break;
                                break;
                            }
                            continue;
                        }
                    }
                }
                this.t = ku3Var;
                this.s = 2;
            } else if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        y6a.M(obj);
        if (!s9a.w(ku3Var)) {
            return Unit.a;
        }
        this.t = ku3Var;
        this.s = 1;
    }

    private final Object n(Object obj) {
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ArrayList arrayList = (ArrayList) this.u;
        Context context = (Context) this.v;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l7l l7lVar = (l7l) it.next();
            hs4 hs4Var = z45.a;
            arrayList2.add(xw3.t(ku3Var, hq4.c, new i3l(context, l7lVar, rq3Var, 4), 2));
        }
        this.t = null;
        this.s = 1;
        Object u = m6k.u(arrayList2, this);
        return u == lu3Var ? lu3Var : u;
    }

    private final Object o(Object obj) {
        e3c e3cVar = (e3c) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            k8f k8fVar = (k8f) this.t;
            vn8 vn8Var = new vn8(k8fVar, 2);
            ((k8l) e3cVar.b).a((Activity) this.v, new hg0(1), vn8Var);
            fej fejVar = new fej(24, e3cVar, vn8Var);
            this.s = 1;
            if (v7a.i(k8fVar, fejVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new h4i((n4i) this.u, (fqg) obj2, rq3Var, 0);
            case 1:
                return new h4i((n4i) this.t, (Stage) this.u, (OddsCountryProvider) obj2, rq3Var, 1);
            case 2:
                return new h4i((p5i) this.u, (Stage) obj2, rq3Var, 2);
            case 3:
                return new h4i((LocalDate) this.u, (h7i) obj2, rq3Var, 3);
            case 4:
                return new h4i((h8i) this.t, (RaceDetailsResponse) this.u, (j5i) obj2, rq3Var, 4);
            case 5:
                return new h4i((o8i) this.t, (Team) this.u, (OddsCountryProvider) obj2, rq3Var, 5);
            case 6:
                return new h4i((rbi) this.u, (ibi) obj2, rq3Var, 6);
            case 7:
                h4i h4iVar = new h4i((LinkedHashSet) this.u, (rbi) obj2, rq3Var, 7);
                h4iVar.t = obj;
                return h4iVar;
            case 8:
                return new h4i((lci) this.t, (Uri) this.u, (pa3) obj2, rq3Var, 8);
            case 9:
                TVScheduleActivity tVScheduleActivity = (TVScheduleActivity) this.t;
                e6b e6bVar = e6b.a;
                return new h4i(tVScheduleActivity, (b1d) this.u, rq3Var, (TVScheduleActivity) obj2);
            case 10:
                h4i h4iVar2 = new h4i((yda) this.u, (Function2) obj2, rq3Var, 10);
                h4iVar2.t = obj;
                return h4iVar2;
            case 11:
                return new h4i((b1d) this.t, (TeamEventsFragment) this.u, rq3Var, (TeamEventsFragment) obj2, 11);
            case 12:
                return new h4i((Context) this.t, (Bitmap) this.u, (TeamOfTheRoundShareBottomSheet) obj2, rq3Var, 12);
            case 13:
                return new h4i((TeamWorker) this.t, (Team) this.u, (wu) obj2, rq3Var, 13);
            case 14:
                h4i h4iVar3 = new h4i((HashSet) this.u, (TeamWorker) obj2, rq3Var, 14);
                h4iVar3.t = obj;
                return h4iVar3;
            case 15:
                h4i h4iVar4 = new h4i((ViewGroup) this.u, (xjd) obj2, rq3Var, 15);
                h4iVar4.t = obj;
                return h4iVar4;
            case 16:
                return new h4i((u8j) this.u, (o8j) obj2, rq3Var, 16);
            case 17:
                return new h4i((lcj) this.t, (qze) this.u, (deh) obj2, rq3Var, 17);
            case 18:
                h4i h4iVar5 = new h4i((Function2) this.u, (ogj) obj2, rq3Var, 18);
                h4iVar5.t = obj;
                return h4iVar5;
            case 19:
                return new h4i((qlj) this.t, (MediaPost) this.u, (a38) obj2, rq3Var, 19);
            case 20:
                return new h4i((koj) this.t, (boj) this.u, (rnj) obj2, rq3Var, 20);
            case 21:
                h4i h4iVar6 = new h4i((List) this.u, (muj) obj2, rq3Var, 21);
                h4iVar6.t = obj;
                return h4iVar6;
            case 22:
                return new h4i((t01) obj2, rq3Var, 22);
            case 23:
                h4i h4iVar7 = new h4i((i1k) obj2, rq3Var, 23);
                h4iVar7.u = obj;
                return h4iVar7;
            case 24:
                return new h4i((b1d) this.t, (VenueMatchesFragment) this.u, rq3Var, (VenueMatchesFragment) obj2, 24);
            case 25:
                return new h4i((ale) this.t, (boh) this.u, (boh) obj2, rq3Var, 25);
            case 26:
                h4i h4iVar8 = new h4i((Function0) this.u, (zsk) obj2, rq3Var, 26);
                h4iVar8.t = obj;
                return h4iVar8;
            case 27:
                h4i h4iVar9 = new h4i((ArrayList) this.u, (Context) obj2, rq3Var, 27);
                h4iVar9.t = obj;
                return h4iVar9;
            case 28:
                h4i h4iVar10 = new h4i((e3c) this.u, (Activity) obj2, rq3Var, 28);
                h4iVar10.t = obj;
                return h4iVar10;
            default:
                return new h4i((zl1) this.t, (lcl) this.u, (ypd) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 12:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((h4i) create((avj) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 24:
                ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 25:
                ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 26:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                return ((h4i) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((h4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d5, code lost:
    
        if (r0.invoke(r38) == r6) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c8, code lost:
    
        if (r0.a(r5, r38) == r6) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03df, code lost:
    
        if (r3.invoke(r2, r38) == r0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03d0, code lost:
    
        if (r3.Z(r38) == r0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x045e, code lost:
    
        if (r1 == r3) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0b84, code lost:
    
        if (r1 == r5) goto L548;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0469 A[Catch: all -> 0x0434, TRY_LEAVE, TryCatch #1 {all -> 0x0434, blocks: (B:246:0x042e, B:248:0x0462, B:250:0x0469, B:269:0x043c, B:271:0x0452, B:274:0x0458, B:280:0x0445), top: B:242:0x0428 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0c10  */
    /* JADX WARN: Type inference failed for: r13v1, types: [rq3] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r2v97, types: [kotlin.jvm.functions.Function1] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Stage stage;
        n4i n4iVar;
        Object U;
        Object k;
        Stage stage2;
        Stage stage3;
        Stage stage4;
        Object r;
        List<ProviderOdds> markets;
        String iso2Alpha;
        Object r2;
        yzc yzcVar;
        Object P;
        Object a;
        Integer position;
        ub5 ub5Var;
        Object r3;
        Object obj2;
        fgf fgfVar;
        Boolean bool;
        n8i n8iVar;
        Boolean bool2;
        Object r4;
        yzc yzcVar2;
        Object u;
        Object o;
        v8d v8dVar;
        Object k2;
        ku3 ku3Var;
        Throwable a2;
        xjd xjdVar;
        Object N;
        Object R;
        Function1 function1;
        Object r5;
        AtomicReference atomicReference;
        int i = 0;
        int i2 = 1;
        Object obj3 = null;
        switch (this.r) {
            case 0:
                n4i n4iVar2 = (n4i) this.u;
                int i3 = n4iVar2.i;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    stage = (Stage) ((fqg) this.v).a("CHAT_INTERFACE_OBJECT");
                    if (stage == null) {
                        qa6 qa6Var = n4iVar2.f;
                        this.t = n4iVar2;
                        this.s = 1;
                        v76 v76Var = qa6Var.a;
                        U = gz8.U(this, v76Var.a, true, false, new i76(i3, v76Var, 1));
                        if (U != lu3Var) {
                            n4iVar = n4iVar2;
                        }
                        return lu3Var;
                    }
                    n4iVar = n4iVar2;
                    n4iVar.k = stage;
                    stage2 = n4iVar2.k;
                    if (stage2 != null) {
                    }
                    stage3 = n4iVar2.k;
                    if (stage3 != null) {
                    }
                    stage4 = n4iVar2.k;
                    if (stage4 != null) {
                    }
                    return Unit.a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n4i n4iVar3 = (n4i) this.t;
                    y6a.M(obj);
                    n4iVar = n4iVar3;
                    k = obj;
                    stage = (Stage) k;
                    n4iVar.k = stage;
                    stage2 = n4iVar2.k;
                    if (stage2 != null) {
                        n4iVar2.l.k(stage2);
                    }
                    stage3 = n4iVar2.k;
                    if (stage3 != null) {
                        if (Intrinsics.c(stage3.getStatusType(), StatusKt.STATUS_CANCELED) || Intrinsics.c(stage3.getStatusType(), StatusKt.STATUS_POSTPONED)) {
                            n4iVar2.n.k(a.c(Stage.copy$default(stage3, null, null, null, ServerType.RACE, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108855, null)));
                        } else {
                            iz2 z = un0.z(n4iVar2);
                            hs4 hs4Var = z45.a;
                            xw3.L(z, hq4.c, null, new big(n4iVar2, stage3, false ? 1 : 0, 20), 2);
                        }
                    }
                    stage4 = n4iVar2.k;
                    if (stage4 != null) {
                        xw3.L(un0.z(n4iVar2), null, null, new l4i(n4iVar2, stage4.getId(), stage4, null), 3);
                    }
                    return Unit.a;
                }
                n4i n4iVar4 = (n4i) this.t;
                y6a.M(obj);
                n4iVar = n4iVar4;
                U = obj;
                stage = (Stage) U;
                if (stage == null || stage.getType() != ServerType.EVENT) {
                    stage = null;
                }
                if (stage == null) {
                    this.t = n4iVar;
                    this.s = 2;
                    k = n4iVar2.k(i3, this);
                    break;
                }
                n4iVar.k = stage;
                stage2 = n4iVar2.k;
                if (stage2 != null) {
                }
                stage3 = n4iVar2.k;
                if (stage3 != null) {
                }
                stage4 = n4iVar2.k;
                if (stage4 != null) {
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                ?? r13 = 0;
                r13 = 0;
                r13 = 0;
                if (i5 == 0) {
                    y6a.M(obj);
                    umd umdVar = ((n4i) this.t).g;
                    Stage stage5 = (Stage) this.u;
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) this.v;
                    this.s = 1;
                    umdVar.getClass();
                    r = s9a.r(new pmd(umdVar, oddsCountryProvider, stage5, r13, 0), this);
                    if (r == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                StageOddsResponse stageOddsResponse = (StageOddsResponse) r;
                if (stageOddsResponse != null && (markets = stageOddsResponse.getMarkets()) != null) {
                    int i6 = ke0.c;
                    if ((zu3.V.hasMcc(Integer.valueOf(i6)) || zu3.d0.hasMcc(Integer.valueOf(i6)) || zu3.z.hasMcc(Integer.valueOf(i6))) && !markets.isEmpty()) {
                        Iterator it = markets.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((ProviderOdds) it.next()).isLive()) {
                                    markets = null;
                                }
                            }
                        }
                    }
                    if (markets != null) {
                        r13 = Boolean.valueOf(!markets.isEmpty());
                    }
                }
                return Boolean.valueOf(Intrinsics.c(r13, Boolean.TRUE));
            case 2:
                p5i p5iVar = (p5i) this.u;
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    ArrayList arrayList = dv3.a;
                    Country b = dv3.b(new Integer(ke0.c));
                    iso2Alpha = b != null ? b.getIso2Alpha() : null;
                    int id = ((Stage) this.v).getId();
                    this.t = iso2Alpha;
                    this.s = 1;
                    r2 = s9a.r(new qu1((Object) p5iVar, id, (rq3) (false ? 1 : 0), 29), this);
                    if (r2 == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = (String) this.t;
                    y6a.M(obj);
                    iso2Alpha = str;
                    r2 = obj;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : (Iterable) r2) {
                    List<String> forCountries = ((Highlight) obj4).getForCountries();
                    if (forCountries == null || CollectionsKt.R(forCountries, iso2Alpha)) {
                        arrayList2.add(obj4);
                    }
                }
                yzc yzcVar3 = p5iVar.f;
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new r5c((Highlight) it2.next(), false, false, 0, (Integer) null, 30));
                }
                yzcVar3.j(CollectionsKt.H0(arrayList3, new o5i(new laf(27), 0)));
                return Unit.a;
            case 3:
                LocalDate localDate = (LocalDate) this.u;
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    String format = localDate.format(hk4.a(bi4.PATTERN_NETWORK_YYMMDD.d()));
                    ZoneOffset offset = ZonedDateTime.of(localDate, LocalTime.MIDNIGHT, ZoneId.systemDefault()).getOffset();
                    hkb hkbVar = new hkb(localDate.atStartOfDay().toEpochSecond(offset), localDate.plusDays(6L).atTime(LocalTime.MAX).toEpochSecond(offset));
                    h7i h7iVar = (h7i) this.v;
                    yzcVar = h7iVar.l;
                    f7i f7iVar = new f7i(h7iVar, format, hkbVar, null);
                    this.t = yzcVar;
                    this.s = 1;
                    P = yaa.P(f7iVar, this);
                    if (P == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzc yzcVar4 = (yzc) this.t;
                    y6a.M(obj);
                    yzcVar = yzcVar4;
                    P = obj;
                }
                yzcVar.k(P);
                return Unit.a;
            case 4:
                RaceDetailsResponse raceDetailsResponse = (RaceDetailsResponse) this.u;
                lu3 lu3Var5 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    s96 s96Var = ((h8i) this.t).f;
                    Stage stage6 = raceDetailsResponse.getStage();
                    this.s = 1;
                    a = s96Var.a(stage6, true, this);
                    if (a == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                Stage stage7 = (Stage) a;
                if (stage7 == null) {
                    return null;
                }
                joa joaVar = l5i.a;
                l5i.l(stage7);
                int ordinal = ((j5i) this.v).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return new q7i(stage7, raceDetailsResponse.getDriverResults());
                    }
                    zzl.b();
                    return null;
                }
                Integer disqualified = raceDetailsResponse.getDisqualified();
                if (disqualified != null && disqualified.intValue() == 1) {
                    ub5Var = rb5.a;
                } else {
                    Integer didNotFinish = raceDetailsResponse.getDidNotFinish();
                    if ((didNotFinish != null && didNotFinish.intValue() == 1) || ((position = raceDetailsResponse.getPosition()) != null && position.intValue() == 0)) {
                        ub5Var = pb5.a;
                    } else {
                        Integer didNotStart = raceDetailsResponse.getDidNotStart();
                        if (didNotStart != null && didNotStart.intValue() == 1) {
                            ub5Var = qb5.a;
                        } else if (raceDetailsResponse.getPosition() != null) {
                            Integer position2 = raceDetailsResponse.getPosition();
                            position2.getClass();
                            ub5Var = new sb5(position2.intValue());
                        } else {
                            ub5Var = tb5.a;
                        }
                    }
                }
                return new r7i(stage7, ub5Var);
            case 5:
                Team team = (Team) this.u;
                OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) this.v;
                o8i o8iVar = (o8i) this.t;
                lu3 lu3Var6 = lu3.a;
                int i10 = this.s;
                rq3 rq3Var = null;
                if (i10 == 0) {
                    y6a.M(obj);
                    umd umdVar2 = o8iVar.e;
                    int id2 = team.getId();
                    this.s = 1;
                    umdVar2.getClass();
                    r3 = s9a.r(new mmd(umdVar2, oddsCountryProvider2, id2, rq3Var, 2), this);
                    if (r3 == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r3 = obj;
                }
                StageOddsResponse stageOddsResponse2 = (StageOddsResponse) r3;
                Stage stage8 = stageOddsResponse2 != null ? stageOddsResponse2.getStage() : null;
                if (stage8 != null) {
                    List<ProviderOdds> markets2 = stageOddsResponse2.getMarkets();
                    if (markets2 == null || !markets2.isEmpty()) {
                        Iterator it3 = markets2.iterator();
                        while (it3.hasNext()) {
                            if (((ProviderOdds) it3.next()).isLive()) {
                                int i11 = ke0.c;
                                if (!zu3.V.hasMcc(Integer.valueOf(i11)) && !zu3.d0.hasMcc(Integer.valueOf(i11)) && !zu3.z.hasMcc(Integer.valueOf(i11))) {
                                }
                            }
                        }
                    }
                    Context i12 = o8iVar.i();
                    List<ProviderOdds> markets3 = stageOddsResponse2.getMarkets();
                    Stage stage9 = stageOddsResponse2.getStage();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : markets3) {
                        ProviderOdds providerOdds = (ProviderOdds) obj5;
                        Stage stage10 = stageOddsResponse2.getStage();
                        if (stage10 != null) {
                            boolean isLive = providerOdds.isLive();
                            DayOfWeek dayOfWeek = hwc.a;
                            if (isLive == hwc.f(stage10)) {
                                if (CollectionsKt.w0(b.j(102, Integer.valueOf(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), 112), b.j(101, Integer.valueOf(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE), 103, 104)).contains(Integer.valueOf(providerOdds.getMarketId()))) {
                                    arrayList4.add(obj5);
                                }
                            }
                        }
                    }
                    Iterator it4 = markets3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            ProviderOdds providerOdds2 = (ProviderOdds) obj2;
                            if (providerOdds2.getMarketId() != 118 && providerOdds2.getMarketId() != 119) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ProviderOdds providerOdds3 = (ProviderOdds) obj2;
                    if (!arrayList4.isEmpty()) {
                        q9k r6 = ug5.r(4, Integer.valueOf(((ProviderOdds) CollectionsKt.Y(markets3)).getMarketId()), (stage9 != null ? stage9.getType() : null) == ServerType.SPRINT);
                        int marketId = ((ProviderOdds) CollectionsKt.Y(markets3)).getMarketId();
                        if (stage9 != null) {
                            DayOfWeek dayOfWeek2 = hwc.a;
                            bool2 = Boolean.valueOf(hwc.f(stage9));
                        } else {
                            bool2 = null;
                        }
                        boolean c = Intrinsics.c(bool2, Boolean.TRUE);
                        ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                        Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            ProviderOdds providerOdds4 = (ProviderOdds) it5.next();
                            OddsChoice oddsChoice = (OddsChoice) CollectionsKt.Y(providerOdds4.getChoices());
                            arrayList5.add(z5i.a(i12, oddsChoice, rld.k(i12, oddsCountryProvider2, providerOdds4, oddsChoice), ug5.q(Integer.valueOf(providerOdds4.getMarketId()), false, false)));
                        }
                        fgfVar = new fgf(-1, r6, marketId, c, l6g.W(arrayList5), (ProviderOdds.Type) null, (String) null, 224);
                    } else if (providerOdds3 != null) {
                        q9k q9kVar = new q9k(R.string.motorsport_odds_championship_winner);
                        int marketId2 = providerOdds3.getMarketId();
                        if (stage9 != null) {
                            DayOfWeek dayOfWeek3 = hwc.a;
                            bool = Boolean.valueOf(hwc.f(stage9));
                        } else {
                            bool = null;
                        }
                        boolean c2 = Intrinsics.c(bool, Boolean.TRUE);
                        List<OddsChoice> choices = providerOdds3.getChoices();
                        ArrayList arrayList6 = new ArrayList(k13.r(choices, 10));
                        for (OddsChoice oddsChoice2 : choices) {
                            arrayList6.add(z5i.a(i12, oddsChoice2, rld.k(i12, oddsCountryProvider2, providerOdds3, oddsChoice2), ug5.q(Integer.valueOf(providerOdds3.getMarketId()), false, false)));
                        }
                        fgfVar = new fgf(-1, q9kVar, marketId2, c2, l6g.W(arrayList6), (ProviderOdds.Type) null, (String) null, 224);
                    } else {
                        fgfVar = null;
                    }
                    yzc yzcVar5 = o8iVar.i;
                    if (fgfVar != null) {
                        Context i13 = o8iVar.i();
                        team.getClass();
                        int id3 = team.getId();
                        String p = tba.p(i13, team);
                        Team parentTeam = team.getParentTeam();
                        zmd A = parentTeam != null ? l4a.A(i13, parentTeam) : null;
                        com.sofascore.model.mvvm.model.Country country = team.getCountry();
                        zmd zmdVar = new zmd(id3, p, A, country != null ? country.getAlpha2() : null, team.getType() == 1 ? ymd.b : ymd.a);
                        OddsProvider provider = oddsCountryProvider2.getProvider();
                        provider.getClass();
                        yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
                        String defaultBetSlipLink = oddsCountryProvider2.getDefaultBetSlipLink();
                        if (defaultBetSlipLink == null) {
                            defaultBetSlipLink = oddsCountryProvider2.getProvider().getDefaultBetSlipLink();
                        }
                        old oldVar = new old(yldVar, defaultBetSlipLink, oddsCountryProvider2.getBranded(), oddsCountryProvider2.getOddsOffset(), oddsCountryProvider2.getOddsMayDiffer(), oddsCountryProvider2.getType(), oddsCountryProvider2.getSignupLink());
                        wmd D = w3a.D(o8iVar.i(), stage8);
                        bgf bgfVar = w5i.b;
                        int i14 = ke0.c;
                        bgfVar.getClass();
                        n8iVar = new n8i(zmdVar, fgfVar, oldVar, D, bgf.a(i14), o8iVar.h ? vmd.DRIVER_INFO : vmd.CONSTRUCTOR_INFO);
                    } else {
                        n8iVar = null;
                    }
                    yzcVar5.k(n8iVar);
                    return Unit.a;
                }
                o8iVar.i.k(null);
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    rbi rbiVar = (rbi) this.u;
                    yzc yzcVar6 = rbiVar.h;
                    ibi ibiVar = (ibi) this.v;
                    StandingsResponse standingsResponse = ibiVar.a;
                    String str2 = ibiVar.b;
                    Integer num = ibiVar.c;
                    Integer num2 = ibiVar.d;
                    Integer num3 = ibiVar.e;
                    boolean z2 = ibiVar.f;
                    this.t = yzcVar6;
                    this.s = 1;
                    r4 = s9a.r(new pj7(standingsResponse, str2, rbiVar, num, num2, z2, num3, null), this);
                    if (r4 == lu3Var7) {
                        return lu3Var7;
                    }
                    yzcVar2 = yzcVar6;
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzcVar2 = (yzc) this.t;
                    y6a.M(obj);
                    r4 = obj;
                }
                yzcVar2.j(r4);
                return Unit.a;
            case 7:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var8 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    LinkedHashSet linkedHashSet = (LinkedHashSet) this.u;
                    rbi rbiVar2 = (rbi) this.v;
                    ArrayList arrayList7 = new ArrayList(k13.r(linkedHashSet, 10));
                    Iterator it6 = linkedHashSet.iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(xw3.t(ku3Var2, null, new big((Description) it6.next(), rbiVar2, false ? 1 : 0, 25), 3));
                    }
                    this.t = null;
                    this.s = 1;
                    u = m6k.u(arrayList7, this);
                    if (u == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u = obj;
                }
                Iterable iterable = (Iterable) u;
                int c3 = sub.c(k13.r(iterable, 10));
                if (c3 < 16) {
                    c3 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c3);
                for (Object obj6 : iterable) {
                    linkedHashMap.put(new Integer(((Description) obj6).getId()), obj6);
                }
                return linkedHashMap;
            case 8:
                pa3 pa3Var = (pa3) this.v;
                lci lciVar = (lci) this.t;
                lu3 lu3Var9 = lu3.a;
                int i17 = this.s;
                try {
                    if (i17 == 0) {
                        y6a.M(obj);
                        Uri uri = (Uri) this.u;
                        this.s = 1;
                        o = lciVar.o(uri, this);
                        if (o == lu3Var9) {
                            return lu3Var9;
                        }
                    } else {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            k2 = obj;
                            v8dVar = (v8d) k2;
                            if (v8dVar == null) {
                                v8dVar = u8d.a;
                            }
                            if (pa3Var != null) {
                                synchronized (dg0.f) {
                                    try {
                                        if (dg0.g == pa3Var) {
                                            dg0.g = null;
                                        }
                                        Unit unit = Unit.a;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            lciVar.i.a(v8dVar);
                            return Unit.a;
                        }
                        y6a.M(obj);
                        o = obj;
                    }
                    v8dVar = (v8d) o;
                    if (v8dVar == null) {
                        if (pa3Var != null) {
                            this.s = 2;
                            k2 = lciVar.k(pa3Var, this);
                            break;
                        } else {
                            v8dVar = null;
                            if (v8dVar == null) {
                            }
                        }
                    }
                    if (pa3Var != null) {
                    }
                    lciVar.i.a(v8dVar);
                    return Unit.a;
                } catch (Throwable th2) {
                    if (pa3Var != null) {
                        synchronized (dg0.f) {
                            try {
                                if (dg0.g == pa3Var) {
                                    dg0.g = null;
                                }
                                Unit unit2 = Unit.a;
                            } finally {
                            }
                        }
                    }
                    throw th2;
                }
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    TVScheduleActivity tVScheduleActivity = (TVScheduleActivity) this.t;
                    e6b e6bVar = e6b.d;
                    vki vkiVar = new vki((b1d) this.u, (rq3) null, (TVScheduleActivity) this.v);
                    this.s = 1;
                    if (b6a.A(tVScheduleActivity, e6bVar, vkiVar, this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    ku3Var = (ku3) this.t;
                    yda ydaVar = (yda) this.u;
                    this.t = ku3Var;
                    this.s = 1;
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ku3Var = (ku3) this.t;
                    y6a.M(obj);
                }
                Function2 function2 = (Function2) this.v;
                this.t = null;
                this.s = 2;
                break;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    usf usfVar = new usf(9, (TeamEventsFragment) this.u, (TeamEventsFragment) this.v);
                    this.s = 1;
                    if (b1dVar.collect(usfVar, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 12:
                Object obj7 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    Context context = (Context) this.t;
                    Bitmap bitmap = (Bitmap) this.u;
                    this.s = 1;
                    hs4 hs4Var2 = z45.a;
                    Object R2 = xw3.R(hq4.c, new rch(context, bitmap, false ? 1 : 0, i2), this);
                    Object obj8 = R2;
                    if (R2 != obj7) {
                        obj8 = Unit.a;
                    }
                    if (obj8 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((TeamOfTheRoundShareBottomSheet) this.v).q();
                return Unit.a;
            case 13:
                TeamWorker teamWorker = (TeamWorker) this.t;
                Team team2 = (Team) this.u;
                lu3 lu3Var13 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    Context applicationContext = teamWorker.getApplicationContext();
                    applicationContext.getClass();
                    nv.y(applicationContext, vu.ADD_FAVORITE, nv.E(team2), team2.getId(), (wu) this.v);
                    int id4 = team2.getId();
                    this.s = 1;
                    if (teamWorker.i(id4, false, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var14 = lu3.a;
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
                asf asfVar = new asf();
                HashSet hashSet = (HashSet) this.u;
                TeamWorker teamWorker2 = (TeamWorker) this.v;
                ArrayList arrayList8 = new ArrayList(k13.r(hashSet, 10));
                Iterator it7 = hashSet.iterator();
                while (true) {
                    rq3 rq3Var2 = null;
                    if (!it7.hasNext()) {
                        this.t = null;
                        this.s = 1;
                        Object u2 = m6k.u(arrayList8, this);
                        return u2 == lu3Var14 ? lu3Var14 : u2;
                    }
                    arrayList8.add(xw3.t(ku3Var3, null, new cce(teamWorker2, (DbMyTeam) it7.next(), asfVar, rq3Var2, 27), 3));
                }
            case 15:
                lu3 lu3Var15 = lu3.a;
                int i24 = this.s;
                try {
                } catch (Throwable th3) {
                    p2g p2gVar = w2g.b;
                    obj3 = new u2g(th3);
                }
                if (i24 == 0) {
                    y6a.M(obj);
                    ViewGroup viewGroup = (ViewGroup) this.u;
                    xjdVar = (xjd) this.v;
                    p2g p2gVar2 = w2g.b;
                    Context context2 = viewGroup.getContext();
                    context2.getClass();
                    this.t = xjdVar;
                    this.s = 1;
                    N = kda.N(context2, this);
                    if (N == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        function1 = (Function1) this.t;
                        y6a.M(obj);
                        R = obj;
                        function1.invoke(new wcd(rv1.a(sv1.Companion, (String) R)));
                        obj3 = Unit.a;
                        p2g p2gVar3 = w2g.b;
                        a2 = w2g.a(obj3);
                        if (a2 != null) {
                            cjb.a("failed when retrieving DAS ad " + a2);
                        }
                        return Unit.a;
                    }
                    ?? r22 = (Function1) this.t;
                    y6a.M(obj);
                    xjdVar = r22;
                    N = obj;
                }
                String str3 = (String) N;
                if (str3 != null) {
                    this.t = xjdVar;
                    this.s = 2;
                    hs4 hs4Var3 = z45.a;
                    R = xw3.R(hq4.c, new e7j(i, str3, false ? 1 : 0), this);
                    if (R != lu3Var15) {
                        function1 = xjdVar;
                        function1.invoke(new wcd(rv1.a(sv1.Companion, (String) R)));
                        obj3 = Unit.a;
                    }
                    return lu3Var15;
                }
                p2g p2gVar32 = w2g.b;
                a2 = w2g.a(obj3);
                if (a2 != null) {
                }
                return Unit.a;
            case 16:
                u8j u8jVar = (u8j) this.u;
                lu3 lu3Var16 = lu3.a;
                int i25 = this.s;
                try {
                } catch (Throwable th4) {
                    Function1 function12 = u8jVar.s;
                    if (function12 == null) {
                        throw th4;
                    }
                    this.t = th4;
                    this.s = 4;
                    if (function12.invoke(this) != lu3Var16) {
                        throw th4;
                    }
                }
                if (i25 == 0) {
                    y6a.M(obj);
                    Function1 function13 = u8jVar.r;
                    if (function13 != null) {
                        this.s = 1;
                        if (function13.invoke(this) == lu3Var16) {
                            return lu3Var16;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            y6a.M(obj);
                            Function1 function14 = u8jVar.s;
                            if (function14 != null) {
                                this.s = 3;
                                break;
                            }
                            return Unit.a;
                        }
                        if (i25 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        if (i25 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th5 = (Throwable) this.t;
                        y6a.M(obj);
                        throw th5;
                    }
                    y6a.M(obj);
                }
                o8j o8jVar = (o8j) this.v;
                this.s = 2;
                break;
            case 17:
                lu3 lu3Var17 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    lcj lcjVar = (lcj) this.t;
                    qze qzeVar = (qze) this.u;
                    deh dehVar = (deh) this.v;
                    this.s = 1;
                    lcjVar.getClass();
                    h68 h68Var = new h68();
                    h68Var.e = lcjVar;
                    h68Var.d = dehVar;
                    h68Var.c = -1;
                    h68Var.b = 9205357640488583168L;
                    h68Var.a = true;
                    Object r7 = kda.r(qzeVar, h68Var, new bcj(lcjVar, dehVar), this);
                    Object obj9 = r7;
                    if (r7 != lu3Var17) {
                        obj9 = Unit.a;
                    }
                    if (obj9 != lu3Var17) {
                        obj9 = Unit.a;
                    }
                    if (obj9 != lu3Var17) {
                        obj9 = Unit.a;
                    }
                    if (obj9 == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                lu3 lu3Var18 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var4 = (ku3) this.t;
                    AtomicReference atomicReference2 = new AtomicReference(null);
                    ajj ajjVar = new ajj((Function2) this.u, (ogj) this.v, ku3Var4, atomicReference2, null, 0);
                    this.t = atomicReference2;
                    this.s = 1;
                    r5 = s9a.r(ajjVar, this);
                    if (r5 == lu3Var18) {
                        return lu3Var18;
                    }
                    atomicReference = atomicReference2;
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atomicReference = (AtomicReference) this.t;
                    y6a.M(obj);
                    r5 = obj;
                }
                yda ydaVar2 = (yda) atomicReference.get();
                if (ydaVar2 != null) {
                    ydaVar2.e(null);
                }
                return r5;
            case 19:
                return e(obj);
            case 20:
                return f(obj);
            case 21:
                return g(obj);
            case 22:
                return h(obj);
            case 23:
                return j(obj);
            case 24:
                return k(obj);
            case 25:
                return l(obj);
            case 26:
                return m(obj);
            case 27:
                return n(obj);
            case 28:
                return o(obj);
            default:
                lcl lclVar = (lcl) this.u;
                lu3 lu3Var19 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    zl1 zl1Var = (zl1) this.t;
                    zl1Var.getClass();
                    ArrayList arrayList9 = zl1Var.b;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it8 = arrayList9.iterator();
                    while (it8.hasNext()) {
                        Object next = it8.next();
                        if (((pl3) next).b(lclVar)) {
                            arrayList10.add(next);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(k13.r(arrayList10, 10));
                    Iterator it9 = arrayList10.iterator();
                    while (it9.hasNext()) {
                        arrayList11.add(((pl3) it9.next()).a(lclVar.j));
                    }
                    z88 H = hkg.H(new jbl((z88[]) CollectionsKt.S0(arrayList11).toArray(new z88[0]), i));
                    usf usfVar2 = new usf(13, (ypd) this.v, lclVar);
                    this.s = 1;
                    if (H.collect(usfVar2, this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4i(b1d b1dVar, AbstractFragment abstractFragment, rq3 rq3Var, AbstractFragment abstractFragment2, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = abstractFragment;
        this.v = abstractFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4i(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4i(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4i(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }
}
