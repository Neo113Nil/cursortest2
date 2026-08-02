package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import coil.memory.MemoryCache$Key;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TournamentResponse;
import com.sofascore.model.newNetwork.TournamentSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.profile.UserBadge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ts2 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts2(wb7 wb7Var, ev6 ev6Var, Boolean bool, ArrayList arrayList, String str, Integer num, Integer num2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 8;
        this.u = wb7Var;
        this.v = ev6Var;
        this.t = bool;
        this.w = arrayList;
        this.x = str;
        this.z = num;
        this.y = num2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0190, code lost:
    
        if (r0 == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r5 == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0176, code lost:
    
        if (r3 == r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        av4 t;
        Object w;
        av4 t2;
        zu4 t3;
        Object w2;
        Object T;
        zu4 zu4Var;
        UniqueTournamentResponse uniqueTournamentResponse;
        TournamentSeasonsResponse tournamentSeasonsResponse;
        List<Season> list;
        Object T2;
        UniqueTournamentResponse uniqueTournamentResponse2;
        yta ytaVar;
        Tournament tournament;
        Object N0;
        List<Season> list2;
        Tournament tournament2;
        Tournament tournament3;
        Object T3;
        List<Season> list3;
        yta ytaVar2 = (yta) this.z;
        yzc yzcVar = ytaVar2.u;
        ku3 ku3Var = (ku3) this.y;
        lu3 lu3Var = lu3.a;
        int i = 2;
        int i2 = 4;
        int i3 = 3;
        rq3 rq3Var = null;
        switch (this.s) {
            case 0:
                y6a.M(obj);
                int i4 = 5;
                if (ytaVar2.i <= 0) {
                    av4 t4 = xw3.t(ku3Var, null, new ota(ytaVar2, rq3Var, i), 3);
                    t = xw3.t(ku3Var, null, new ota(ytaVar2, rq3Var, i3), 3);
                    this.y = null;
                    this.u = t;
                    this.s = 5;
                    w = t4.w(this);
                    break;
                } else {
                    av4 t5 = xw3.t(ku3Var, null, new ota(ytaVar2, rq3Var, i2), 3);
                    t2 = xw3.t(ku3Var, null, new ota(ytaVar2, rq3Var, i4), 3);
                    t3 = xw3.t(ku3Var, null, new ota(ytaVar2, rq3Var, 1), 3);
                    this.y = null;
                    this.u = t2;
                    this.t = t3;
                    this.s = 1;
                    w2 = t5.w(this);
                    break;
                }
                return lu3Var;
            case 1:
                t3 = (zu4) this.t;
                av4 av4Var = (av4) this.u;
                y6a.M(obj);
                t2 = av4Var;
                w2 = obj;
                UniqueTournamentResponse uniqueTournamentResponse3 = (UniqueTournamentResponse) w2;
                this.y = null;
                this.u = null;
                this.t = t3;
                this.v = uniqueTournamentResponse3;
                this.s = 2;
                T = t2.T(this);
                if (T != lu3Var) {
                    zu4Var = t3;
                    uniqueTournamentResponse = uniqueTournamentResponse3;
                    tournamentSeasonsResponse = (TournamentSeasonsResponse) T;
                    if (tournamentSeasonsResponse != null || (list = tournamentSeasonsResponse.getSeasons()) == null) {
                        list = km5.a;
                    }
                    this.y = null;
                    this.u = null;
                    this.t = null;
                    this.v = uniqueTournamentResponse;
                    this.w = list;
                    this.x = ytaVar2;
                    this.s = 3;
                    T2 = zu4Var.T(this);
                    if (T2 != lu3Var) {
                        uniqueTournamentResponse2 = uniqueTournamentResponse;
                        ytaVar = ytaVar2;
                        ytaVar.t = (Integer) T2;
                        if (uniqueTournamentResponse2 != null) {
                            UniqueTournament uniqueTournament = uniqueTournamentResponse2.getUniqueTournament();
                            int i5 = ytaVar2.k;
                            uniqueTournament.getClass();
                            String name = uniqueTournament.getName();
                            if (name == null) {
                                name = "";
                            }
                            tournament = new Tournament(i5, name, uniqueTournament.getSlug(), uniqueTournament.getCategory(), uniqueTournament, null, null, null, uniqueTournament.getFieldTranslations(), null, null, null, null, null, null, null);
                            UniqueTournament uniqueTournament2 = tournament.getUniqueTournament();
                            if (uniqueTournament2 != null) {
                                w3b w3bVar = ytaVar2.e;
                                this.y = null;
                                this.u = null;
                                this.t = null;
                                this.v = null;
                                this.w = list;
                                this.x = tournament;
                                this.s = 4;
                                N0 = w3bVar.N0(uniqueTournament2, this);
                                if (N0 != lu3Var) {
                                    list2 = list;
                                    tournament2 = tournament;
                                    ((Boolean) N0).getClass();
                                    tournament = tournament2;
                                    list = list2;
                                }
                            }
                            yzcVar.k(new Pair(tournament, list));
                        }
                        return Unit.a;
                    }
                }
                return lu3Var;
            case 2:
                uniqueTournamentResponse = (UniqueTournamentResponse) this.v;
                zu4Var = (zu4) this.t;
                y6a.M(obj);
                T = obj;
                tournamentSeasonsResponse = (TournamentSeasonsResponse) T;
                if (tournamentSeasonsResponse != null) {
                    break;
                }
                list = km5.a;
                this.y = null;
                this.u = null;
                this.t = null;
                this.v = uniqueTournamentResponse;
                this.w = list;
                this.x = ytaVar2;
                this.s = 3;
                T2 = zu4Var.T(this);
                if (T2 != lu3Var) {
                }
                return lu3Var;
            case 3:
                ytaVar = (yta) this.x;
                List<Season> list4 = (List) this.w;
                UniqueTournamentResponse uniqueTournamentResponse4 = (UniqueTournamentResponse) this.v;
                y6a.M(obj);
                uniqueTournamentResponse2 = uniqueTournamentResponse4;
                list = list4;
                T2 = obj;
                ytaVar.t = (Integer) T2;
                if (uniqueTournamentResponse2 != null) {
                }
                return Unit.a;
            case 4:
                tournament2 = (Tournament) this.x;
                list2 = (List) this.w;
                y6a.M(obj);
                N0 = obj;
                ((Boolean) N0).getClass();
                tournament = tournament2;
                list = list2;
                yzcVar.k(new Pair(tournament, list));
                return Unit.a;
            case 5:
                t = (av4) this.u;
                y6a.M(obj);
                w = obj;
                TournamentResponse tournamentResponse = (TournamentResponse) w;
                tournament3 = tournamentResponse != null ? tournamentResponse.getTournament() : null;
                this.y = null;
                this.u = null;
                this.t = tournament3;
                this.s = 6;
                T3 = t.T(this);
                break;
            case 6:
                Tournament tournament4 = (Tournament) this.t;
                y6a.M(obj);
                tournament3 = tournament4;
                T3 = obj;
                TournamentSeasonsResponse tournamentSeasonsResponse2 = (TournamentSeasonsResponse) T3;
                if (tournamentSeasonsResponse2 == null || (list3 = tournamentSeasonsResponse2.getSeasons()) == null) {
                    list3 = km5.a;
                }
                if (tournament3 != null) {
                    yzcVar.k(new Pair(tournament3, list3));
                }
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        if (r9.e(r8) == r1) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [h2d, java.lang.Object, lu3] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(Object obj) {
        o1d o1dVar;
        j2d j2dVar;
        Function1 function1;
        Throwable th;
        o1d o1dVar2;
        h2d h2dVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        q1d q1dVar = (q1d) this.y;
        ?? r1 = lu3.a;
        int i = this.s;
        try {
            try {
                if (i == 0) {
                    y6a.M(obj);
                    ku3 ku3Var = (ku3) this.w;
                    m1d m1dVar = (m1d) this.x;
                    CoroutineContext.Element element = ku3Var.getCoroutineContext().get(uic.g);
                    element.getClass();
                    o1dVar = new o1d(m1dVar, (yda) element);
                    q1dVar.b(o1dVar);
                    j2dVar = q1dVar.b;
                    function1 = (Function1) this.z;
                    this.w = o1dVar;
                    this.u = j2dVar;
                    this.t = function1;
                    this.v = q1dVar;
                    this.s = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        q1dVar = (q1d) this.t;
                        h2dVar = (h2d) this.u;
                        o1dVar2 = (o1d) this.w;
                        try {
                            y6a.M(obj);
                            atomicReference2 = q1dVar.a;
                            while (!atomicReference2.compareAndSet(o1dVar2, null) && atomicReference2.get() == o1dVar2) {
                            }
                            h2dVar.f(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = q1dVar.a;
                            while (!atomicReference.compareAndSet(o1dVar2, null) && atomicReference.get() == o1dVar2) {
                            }
                            throw th;
                        }
                    }
                    q1dVar = (q1d) this.v;
                    Function1 function12 = (Function1) this.t;
                    ?? r4 = (h2d) this.u;
                    o1d o1dVar3 = (o1d) this.w;
                    y6a.M(obj);
                    function1 = function12;
                    o1dVar = o1dVar3;
                    j2dVar = r4;
                }
                this.w = o1dVar;
                this.u = j2dVar;
                this.t = q1dVar;
                this.v = null;
                this.s = 2;
                Object invoke = function1.invoke(this);
                if (invoke != r1) {
                    h2dVar = j2dVar;
                    obj = invoke;
                    o1dVar2 = o1dVar;
                    atomicReference2 = q1dVar.a;
                    while (!atomicReference2.compareAndSet(o1dVar2, null)) {
                    }
                    h2dVar.f(null);
                    return obj;
                }
                return r1;
            } catch (Throwable th3) {
                th = th3;
                o1dVar2 = o1dVar;
                atomicReference = q1dVar.a;
                while (!atomicReference.compareAndSet(o1dVar2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.f(null);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r3 == r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0078, code lost:
    
        if (r3 == r13) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        av4 t;
        Object w;
        av4 av4Var;
        Boolean bool;
        Object T;
        Boolean bool2;
        bfk bfkVar;
        String str;
        UserBadge userBadge;
        Boolean bool3;
        Boolean bool4;
        UserBadge userBadge2 = (UserBadge) this.y;
        String str2 = (String) this.x;
        f9f f9fVar = (f9f) this.z;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            av4 t2 = str2 != null ? xw3.t(ku3Var, null, new gje(f9fVar, str2, rq3Var, 11), 3) : null;
            t = userBadge2 != null ? xw3.t(ku3Var, null, new gje(userBadge2, f9fVar, rq3Var, 10), 3) : null;
            if (t2 != null) {
                this.t = null;
                this.u = t;
                this.s = 1;
                w = t2.w(this);
            }
            av4Var = t;
            bool = null;
            if (av4Var != null) {
                this.t = null;
                this.u = null;
                this.v = bool;
                this.s = 2;
                T = av4Var.T(this);
            }
            bool2 = null;
            Boolean bool5 = bool;
            bfkVar = f9fVar.e;
            if (str2 == null) {
            }
            if (userBadge2 == null) {
            }
            this.t = null;
            this.u = null;
            this.v = bool5;
            this.w = bool2;
            this.s = 3;
            if (bfk.e(bfkVar, null, null, str, null, null, null, null, userBadge, null, this, 7675) != lu3Var) {
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bool3 = (Boolean) this.w;
                bool4 = (Boolean) this.v;
                y6a.M(obj);
                f9fVar.g.j(new c9f(bool4, bool3));
                r4a.M(f9fVar.k);
                return Unit.a;
            }
            bool = (Boolean) this.v;
            y6a.M(obj);
            T = obj;
            x2g x2gVar = (x2g) T;
            if (x2gVar != null) {
                bool2 = Boolean.valueOf(x2gVar instanceof v2g);
                Boolean bool52 = bool;
                bfkVar = f9fVar.e;
                str = (str2 == null && Intrinsics.c(bool52, Boolean.TRUE)) ? str2 : null;
                userBadge = (userBadge2 == null && Intrinsics.c(bool2, Boolean.TRUE)) ? userBadge2 : null;
                this.t = null;
                this.u = null;
                this.v = bool52;
                this.w = bool2;
                this.s = 3;
                if (bfk.e(bfkVar, null, null, str, null, null, null, null, userBadge, null, this, 7675) != lu3Var) {
                    bool3 = bool2;
                    bool4 = bool52;
                    f9fVar.g.j(new c9f(bool4, bool3));
                    r4a.M(f9fVar.k);
                    return Unit.a;
                }
                return lu3Var;
            }
            bool2 = null;
            Boolean bool522 = bool;
            bfkVar = f9fVar.e;
            if (str2 == null) {
            }
            if (userBadge2 == null) {
            }
            this.t = null;
            this.u = null;
            this.v = bool522;
            this.w = bool2;
            this.s = 3;
            if (bfk.e(bfkVar, null, null, str, null, null, null, null, userBadge, null, this, 7675) != lu3Var) {
            }
            return lu3Var;
        }
        t = (av4) this.u;
        y6a.M(obj);
        w = obj;
        x2g x2gVar2 = (x2g) w;
        if (x2gVar2 != null) {
            Boolean valueOf = Boolean.valueOf(x2gVar2 instanceof v2g);
            av4Var = t;
            bool = valueOf;
            if (av4Var != null) {
            }
            bool2 = null;
            Boolean bool5222 = bool;
            bfkVar = f9fVar.e;
            if (str2 == null) {
            }
            if (userBadge2 == null) {
            }
            this.t = null;
            this.u = null;
            this.v = bool5222;
            this.w = bool2;
            this.s = 3;
            if (bfk.e(bfkVar, null, null, str, null, null, null, null, userBadge, null, this, 7675) != lu3Var) {
            }
            return lu3Var;
        }
        av4Var = t;
        bool = null;
        if (av4Var != null) {
        }
        bool2 = null;
        Boolean bool52222 = bool;
        bfkVar = f9fVar.e;
        if (str2 == null) {
        }
        if (userBadge2 == null) {
        }
        this.t = null;
        this.u = null;
        this.v = bool52222;
        this.w = bool2;
        this.s = 3;
        if (bfk.e(bfkVar, null, null, str, null, null, null, null, userBadge, null, this, 7675) != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (r6.emit(r7, r10) == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x001c, B:9:0x0050, B:15:0x0061, B:17:0x0069, B:25:0x0034, B:27:0x0047), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:8:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(Object obj) {
        b98 b98Var;
        b62 b62Var;
        b98 b98Var2;
        b62 b62Var2;
        Object a;
        p84 p84Var = (p84) this.x;
        ContentResolver contentResolver = (ContentResolver) this.v;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                b98Var = (b98) this.t;
                contentResolver.registerContentObserver((Uri) this.w, false, p84Var);
                b62Var = new b62((g62) this.y);
                this.t = b98Var;
                this.u = b62Var;
                this.s = 1;
                a = b62Var.a(this);
                if (a != lu3Var) {
                }
            } else if (i == 1) {
                b62Var2 = (b62) this.u;
                b98Var2 = (b98) this.t;
                y6a.M(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b62Var2 = (b62) this.u;
                b98Var2 = (b98) this.t;
                y6a.M(obj);
                b98Var = b98Var2;
                b62Var = b62Var2;
                this.t = b98Var;
                this.u = b62Var;
                this.s = 1;
                a = b62Var.a(this);
                if (a != lu3Var) {
                    return lu3Var;
                }
                b62 b62Var3 = b62Var;
                b98Var2 = b98Var;
                obj = a;
                b62Var2 = b62Var3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(p84Var);
                    return Unit.a;
                }
                b62Var2.c();
                Context context = (Context) this.z;
                x0d x0dVar = qal.a;
                Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.t = b98Var2;
                this.u = b62Var2;
                this.s = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(p84Var);
            throw th;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                ts2 ts2Var = new ts2((us2) this.w, (String) this.x, (String) this.y, (Integer) obj2, rq3Var, 0);
                ts2Var.t = obj;
                return ts2Var;
            case 1:
                return new ts2((z88) this.u, (CoroutineContext) this.v, this.t, (j8f) this.w, (b98) this.x, (igm) this.y, (aea) obj2, rq3Var, 1);
            case 2:
                ts2 ts2Var2 = new ts2((z88) this.w, (z88) this.x, (b98) this.y, (igm) obj2, rq3Var, 2);
                ts2Var2.t = obj;
                return ts2Var2;
            case 3:
                return new ts2((w93) this.y, (la3) obj2, (String) this.x, rq3Var);
            case 4:
                return new ts2(this.u, (fsf) this.v, (fsf) this.w, this.x, this.t, (fsf) this.y, obj2, rq3Var, 4);
            case 5:
                return new ts2(this.u, (fsf) this.v, (fsf) this.w, this.x, this.t, (fsf) this.y, obj2, rq3Var, 5);
            case 6:
                return new ts2((eo5) this.u, (nt9) this.v, this.t, (tvd) this.w, (f7a) this.x, (nec) this.y, (i5d) obj2, rq3Var, 6);
            case 7:
                return new ts2((fo5) this.u, (ot9) this.v, this.t, (xvd) this.w, (e26) this.x, (MemoryCache$Key) this.y, (i5d) obj2, rq3Var, 7);
            case 8:
                return new ts2((wb7) this.u, (ev6) this.v, (Boolean) this.t, (ArrayList) this.w, (String) this.x, (Integer) obj2, (Integer) this.y, rq3Var);
            case 9:
                ts2 ts2Var3 = new ts2((m1d) this.x, (j8a) this.y, (Function1) obj2, rq3Var, 9);
                ts2Var3.w = obj;
                return ts2Var3;
            case 10:
                ts2 ts2Var4 = new ts2((yta) obj2, rq3Var);
                ts2Var4.y = obj;
                return ts2Var4;
            case 11:
                ts2 ts2Var5 = new ts2((m1d) this.x, (q1d) this.y, (Function1) obj2, rq3Var, 11);
                ts2Var5.w = obj;
                return ts2Var5;
            case 12:
                ts2 ts2Var6 = new ts2((String) this.x, (UserBadge) this.y, (f9f) obj2, rq3Var, 12);
                ts2Var6.t = obj;
                return ts2Var6;
            case 13:
                ts2 ts2Var7 = new ts2((ContentResolver) this.v, (Uri) this.w, (p84) this.x, (g62) this.y, (Context) obj2, rq3Var);
                ts2Var7.t = obj;
                return ts2Var7;
            default:
                return new ts2((String) this.t, (j) this.w, (String) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ts2) create((Unit) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((ts2) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ts2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.h21
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 2786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts2(w93 w93Var, la3 la3Var, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.y = w93Var;
        this.z = la3Var;
        this.x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts2(yta ytaVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 10;
        this.z = ytaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts2(ContentResolver contentResolver, Uri uri, p84 p84Var, g62 g62Var, Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 13;
        this.v = contentResolver;
        this.w = uri;
        this.x = p84Var;
        this.y = g62Var;
        this.z = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts2(Object obj, fsf fsfVar, fsf fsfVar2, Object obj2, Object obj3, fsf fsfVar3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = fsfVar;
        this.w = fsfVar2;
        this.x = obj2;
        this.t = obj3;
        this.y = fsfVar3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts2(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts2(Object obj, Object obj2, Object obj3, Serializable serializable, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.z = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.t = obj3;
        this.w = obj4;
        this.x = obj5;
        this.y = obj6;
        this.z = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts2(String str, j jVar, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 14;
        this.t = str;
        this.w = jVar;
        this.z = str2;
    }
}
