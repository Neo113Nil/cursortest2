package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.util.Size;
import android.widget.ImageView;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.network.post.FeedbackPost;
import com.sofascore.model.newNetwork.DateResponse;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.PowerRanking;
import com.sofascore.model.newNetwork.PowerRankingResponse;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.model.newNetwork.TeamOfTheWeekItem;
import com.sofascore.model.newNetwork.TeamOfTheWeekRound;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekTimespan;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yp7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp7(int i, Context context, znh znhVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 19;
        this.s = i;
        this.t = context;
        this.u = znhVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new yp7((a6e) this.t, (e1d) obj2, rq3Var, 0);
            case 1:
                return new yp7((FeaturedTournamentFragment) this.t, (CupTreesResponse) obj2, rq3Var, 1);
            case 2:
                return new yp7((b1d) this.t, rq3Var, (FeaturedTournamentFragment) obj2);
            case 3:
                return new yp7((nv7) this.t, (String) obj2, rq3Var, 3);
            case 4:
                return new yp7((nv7) obj2, rq3Var, 4);
            case 5:
                yp7 yp7Var = new yp7((nv7) obj2, rq3Var, 5);
                yp7Var.t = obj;
                return yp7Var;
            case 6:
                return new yp7((qy7) this.t, (Uri) obj2, rq3Var, 6);
            case 7:
                return new yp7((qy7) this.t, (FeedbackPost) obj2, rq3Var, 7);
            case 8:
                return new yp7((o58) this.t, (y8h) obj2, rq3Var, 8);
            case 9:
                return new yp7((l88) this.t, (i88) obj2, rq3Var, 9);
            case 10:
                return new yp7((l88) this.t, (i7a) obj2, rq3Var, 10);
            case 11:
                return new yp7((z88) this.t, (k8f) obj2, rq3Var, 11);
            case 12:
                yp7 yp7Var2 = new yp7((Event) obj2, rq3Var, 12);
                yp7Var2.t = obj;
                return yp7Var2;
            case 13:
                return new yp7((Event) this.t, (Context) obj2, rq3Var, 13);
            case 14:
                yp7 yp7Var3 = new yp7((re0) obj2, rq3Var, 14);
                yp7Var3.t = obj;
                return yp7Var3;
            case 15:
                return new yp7((Context) this.t, (sy8) obj2, rq3Var, 15);
            case 16:
                return new yp7((ci9) this.t, (zj9) obj2, rq3Var, 16);
            case 17:
                return new yp7((BaseActivity) this.t, (ImageView) obj2, rq3Var, 17);
            case 18:
                return new yp7((jda) this.t, (Function1) obj2, rq3Var, 18);
            case 19:
                return new yp7(this.s, (Context) this.t, (znh) obj2, rq3Var);
            case 20:
                return new yp7((qze) obj2, (a6e) this.t, rq3Var);
            case 21:
                yp7 yp7Var4 = new yp7((osa) obj2, rq3Var, 21);
                yp7Var4.t = obj;
                return yp7Var4;
            case 22:
                return new yp7((yta) obj2, rq3Var, 22);
            case 23:
                return new yp7((nua) this.t, (cua) obj2, rq3Var, 23);
            case 24:
                return new yp7((eza) this.t, (PowerRankingRound) obj2, rq3Var, 24);
            case 25:
                return new yp7((w3b) this.t, (DateResponse) obj2, rq3Var, 25);
            case 26:
                return new yp7((k5b) this.t, (u1) obj2, rq3Var, 26);
            case 27:
                return new yp7((Function1) this.t, (Function1) obj2, rq3Var, 27);
            case 28:
                return new yp7((u6b) this.t, (geb) obj2, rq3Var, 28);
            default:
                return new yp7((meb) this.t, obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 2:
                ((yp7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 26:
                ((yp7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((yp7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x0482, code lost:
    
        if (r0 == r2) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0471, code lost:
    
        if (r3.o(r0, r24) == r2) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0594, code lost:
    
        if (r3.b(r24) == r4) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x055d, code lost:
    
        if (r7 == r4) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0665, code lost:
    
        if (defpackage.yaa.P(new defpackage.yw(r11, r12, r13, r14, 20), r24) != r1) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x061a, code lost:
    
        if (r2 == r1) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x095a, code lost:
    
        if (defpackage.n4o.z(r2, r24) == r0) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0973, code lost:
    
        if (defpackage.a6e.g(r2, r3, r10, r24, 2) == r0) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [km5] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:458:0x0973 -> B:455:0x094c). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object x;
        yzc yzcVar;
        Object w;
        ?? r1;
        TeamOfTheWeekItem teamOfTheWeekItem;
        TournamentRoundWrapper tournamentRoundWrapper;
        Long startDateTimestamp;
        Object obj2;
        Object R;
        dzc dzcVar;
        Object R2;
        Object b;
        Object m;
        Object r;
        Object x2;
        int i;
        SharedPreferences d;
        Object c;
        zzc zzcVar;
        Object t;
        Object b0;
        List<PowerRanking> powerRankings;
        Object D0;
        List<Event> events;
        Object R3;
        int i2 = 18;
        int i3 = 6;
        int i4 = 2;
        int i5 = 0;
        boolean z = true;
        ?? r8 = 1;
        rq3 rq3Var = null;
        ?? r9 = 0;
        ?? r92 = 0;
        ?? r93 = 0;
        ?? r94 = 0;
        ?? r95 = 0;
        ?? r96 = 0;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    if (((Boolean) ((e1d) this.u).getValue()).booleanValue()) {
                        return Unit.a;
                    }
                } else if (i6 == 1) {
                    y6a.M(obj);
                    a6e a6eVar = (a6e) this.t;
                    int k = (a6eVar.k() + 1) % 3;
                    i4k h0 = s02.h0(250, 0, null, 6);
                    this.s = 2;
                    break;
                } else {
                    if (i6 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                wd5 wd5Var = xd5.b;
                long R4 = wkn.R(3, be5.SECONDS);
                this.s = 1;
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    FeaturedTournamentFragment featuredTournamentFragment = (FeaturedTournamentFragment) this.t;
                    CupTreesResponse cupTreesResponse = (CupTreesResponse) this.u;
                    g6b lifecycle = featuredTournamentFragment.getLifecycle();
                    e6b e6bVar = e6b.e;
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a.f;
                    boolean e0 = r69Var.e0(getContext());
                    if (!e0) {
                        if (lifecycle.b() == e6b.a) {
                            throw new l6b(r9 == true ? 1 : 0, i5);
                        }
                        if (lifecycle.b().compareTo(e6bVar) >= 0) {
                            featuredTournamentFragment.t(featuredTournamentFragment.E(), new j87(i2, cupTreesResponse, featuredTournamentFragment));
                            Unit unit = Unit.a;
                        }
                    }
                    pi piVar = new pi(13, featuredTournamentFragment, cupTreesResponse);
                    this.s = 1;
                    if (yfa.M(lifecycle, e6bVar, e0, r69Var, piVar, this) == lu3Var2) {
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
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    f10 f10Var = new f10((FeaturedTournamentFragment) this.u, 9);
                    this.s = 1;
                    if (b1dVar.collect(f10Var, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                nv7 nv7Var = (nv7) this.t;
                s96 s96Var = nv7Var.e;
                nv7Var.i.getClass();
                String str = (String) this.u;
                this.s = 1;
                Object C = s96Var.C(270, str, this);
                return C == lu3Var4 ? lu3Var4 : C;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    nv7 nv7Var2 = (nv7) this.u;
                    yzc yzcVar2 = nv7Var2.l;
                    s96 s96Var2 = nv7Var2.e;
                    nv7Var2.i.getClass();
                    Calendar calendar = ke0.a;
                    int c2 = ke0.c();
                    this.t = yzcVar2;
                    this.s = 1;
                    x = s96Var2.x(71636, c2, this);
                    if (x == lu3Var5) {
                        return lu3Var5;
                    }
                    yzcVar = yzcVar2;
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzcVar = (yzc) this.t;
                    y6a.M(obj);
                    x = obj;
                }
                yzcVar.j(x);
                return Unit.a;
            case 5:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    av4 t2 = xw3.t(ku3Var, null, new lv7((nv7) this.u, r92 == true ? 1 : 0, i3), 3);
                    this.t = null;
                    this.s = 1;
                    w = t2.w(this);
                    if (w == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    w = obj;
                }
                TeamOfTheWeekRoundsResponse teamOfTheWeekRoundsResponse = (TeamOfTheWeekRoundsResponse) w;
                List<TeamOfTheWeekItem> periods = teamOfTheWeekRoundsResponse != null ? teamOfTheWeekRoundsResponse.getPeriods() : null;
                if (periods != null) {
                    r1 = new ArrayList(k13.r(periods, 10));
                    Iterator it = periods.iterator();
                    while (it.hasNext()) {
                        r1.add(String.valueOf(((TeamOfTheWeekItem) it.next()).getId()));
                    }
                } else {
                    r1 = km5.a;
                }
                HashSet Q0 = CollectionsKt.Q0(r1);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = Q0.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (periods != null) {
                        Iterator it3 = periods.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (Intrinsics.c(String.valueOf(((TeamOfTheWeekItem) obj2).getId()), str2)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        teamOfTheWeekItem = (TeamOfTheWeekItem) obj2;
                    } else {
                        teamOfTheWeekItem = null;
                    }
                    Integer num = teamOfTheWeekItem != null ? new Integer(teamOfTheWeekItem.getId()) : null;
                    String name = teamOfTheWeekItem instanceof TeamOfTheWeekRound ? ((TeamOfTheWeekRound) teamOfTheWeekItem).getRound().getName() : teamOfTheWeekItem instanceof TeamOfTheWeekTimespan ? ((TeamOfTheWeekTimespan) teamOfTheWeekItem).getItemName() : null;
                    if (name == null) {
                        name = String.valueOf(num);
                    }
                    String str3 = name;
                    long j = 0;
                    long createdAtTimestamp = teamOfTheWeekItem != null ? teamOfTheWeekItem.getCreatedAtTimestamp() : 0L;
                    if (teamOfTheWeekItem != null && (startDateTimestamp = teamOfTheWeekItem.getStartDateTimestamp()) != null) {
                        j = startDateTimestamp.longValue();
                    }
                    long j2 = j;
                    if (num != null) {
                        boolean z2 = teamOfTheWeekItem instanceof TeamOfTheWeekTimespan;
                        tournamentRoundWrapper = new TournamentRoundWrapper(num.intValue(), teamOfTheWeekItem.getType(), teamOfTheWeekItem.getPeriodName(), teamOfTheWeekItem.getTournamentId(), str3, str2, true, z2 ? new Long(((TeamOfTheWeekTimespan) teamOfTheWeekItem).getDateFrom()) : null, z2 ? new Long(((TeamOfTheWeekTimespan) teamOfTheWeekItem).getDateTo()) : null, createdAtTimestamp, j2);
                    } else {
                        tournamentRoundWrapper = null;
                    }
                    if (tournamentRoundWrapper != null) {
                        arrayList.add(tournamentRoundWrapper);
                    }
                }
                return CollectionsKt.H0(arrayList, new se7(11));
            case 6:
                qy7 qy7Var = (qy7) this.t;
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    Context i13 = qy7Var.i();
                    Uri uri = (Uri) this.u;
                    this.s = 1;
                    Size size = new Size(600, 600);
                    hs4 hs4Var2 = z45.a;
                    R = xw3.R(hq4.c, new jr5(i13, uri, size, (rq3) null, 5), this);
                    if (R == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                qy7Var.f.j((Bitmap) R);
                return Unit.a;
            case 7:
                qy7 qy7Var2 = (qy7) this.t;
                lu3 lu3Var8 = lu3.a;
                int i14 = this.s;
                rq3 rq3Var2 = null;
                if (i14 == 0) {
                    y6a.M(obj);
                    Bitmap bitmap = (Bitmap) qy7Var2.f.d();
                    if (bitmap == null) {
                        dzcVar = null;
                        dhk dhkVar = qy7Var2.e;
                        FeedbackPost feedbackPost = (FeedbackPost) this.u;
                        this.s = 2;
                        dhkVar.getClass();
                        break;
                    } else {
                        this.s = 1;
                        hs4 hs4Var3 = z45.a;
                        R2 = xw3.R(hq4.c, new ip1(bitmap, rq3Var2, 23), this);
                        break;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R2 = obj;
                }
                byte[] bArr = (byte[]) R2;
                String str4 = System.currentTimeMillis() + ".jpg";
                xzf xzfVar = yzf.Companion;
                bArr.getClass();
                Regex regex = zdc.e;
                dzcVar = sha.p("screenshot", str4, xzf.d(xzfVar, bArr, bea.v("image/jpeg"), 0, 6));
                dhk dhkVar2 = qy7Var2.e;
                FeedbackPost feedbackPost2 = (FeedbackPost) this.u;
                this.s = 2;
                dhkVar2.getClass();
            case 8:
                o58 o58Var = (o58) this.t;
                a9h a9hVar = o58Var.b;
                lu3 lu3Var9 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    v58 v58Var = v58.a;
                    this.s = 1;
                    b = v58Var.b(this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Boolean b2 = a9hVar.a.b();
                        if (b2 != null) {
                            z = b2.booleanValue();
                        } else {
                            Boolean b3 = a9hVar.b.b();
                            if (b3 != null) {
                                z = b3.booleanValue();
                            }
                        }
                        if (z) {
                            r38 r38Var = o58Var.a;
                            hg6 hg6Var = new hg6(18);
                            r38Var.a();
                            r38Var.j.add(hg6Var);
                            Unit unit2 = Unit.a;
                        } else {
                            o02.K(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                    b = obj;
                }
                Collection values = ((Map) b).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it4 = values.iterator();
                    while (it4.hasNext()) {
                        if (((ew3) it4.next()).a.i()) {
                            this.s = 2;
                            break;
                        }
                    }
                }
                o02.K(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    l88 l88Var = (l88) this.t;
                    i88 i88Var = (i88) this.u;
                    float f = i88Var.a;
                    float f2 = i88Var.b;
                    float f3 = i88Var.d;
                    float f4 = i88Var.c;
                    this.s = 1;
                    l88Var.a = f;
                    l88Var.b = f2;
                    l88Var.c = f3;
                    l88Var.d = f4;
                    Object b4 = l88Var.b(this);
                    if (b4 != lu3Var10) {
                        b4 = Unit.a;
                    }
                    if (b4 == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    l88 l88Var2 = (l88) this.t;
                    i7a i7aVar = (i7a) this.u;
                    this.s = 1;
                    if (l88Var2.a(i7aVar, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    z88 z88Var = (z88) this.t;
                    f33 f33Var = new f33((k8f) this.u, 1);
                    this.s = 1;
                    if (z88Var.collect(f33Var, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                Event event = (Event) this.u;
                Application application = (Application) this.t;
                lu3 lu3Var13 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    qa6 qa6Var = su8.a;
                    this.t = application;
                    this.s = 1;
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        m = obj;
                        if (((Boolean) m).booleanValue()) {
                            su8.d(application);
                            su8.c(application);
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                qa6 qa6Var2 = su8.a;
                int id = event.getId();
                this.t = application;
                this.s = 2;
                m = qa6Var2.m(id, this);
                break;
            case 13:
                Context context = (Context) this.u;
                lu3 lu3Var14 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    qa6 qa6Var3 = su8.a;
                    Event event2 = (Event) this.t;
                    this.s = 1;
                    r = qa6Var3.r(event2, this);
                    if (r == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                if (((Boolean) r).booleanValue()) {
                    su8.e(context);
                    su8.c(context);
                }
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    k8h k8hVar = (k8h) this.t;
                    String M = l98.M(((re0) this.u).a);
                    this.s = 1;
                    af0 af0Var = (af0) k8hVar.a.remove(M);
                    if (af0Var != null) {
                        af0Var.c.r(null);
                        af0Var.b.set(false);
                        af0Var.j.e(null);
                    }
                    if (Unit.a == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    Context context2 = (Context) this.t;
                    sy8 sy8Var = (sy8) this.u;
                    ry8 ry8Var = new ry8(context2);
                    t01 a = sy8Var.a();
                    this.s = 1;
                    if (ry8Var.c(sy8Var, a, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        y6a.M(obj);
                    } catch (Throwable unused) {
                    }
                }
                return Unit.a;
            case 16:
                ci9 ci9Var = (ci9) this.t;
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
                yda ydaVar = (yda) ci9Var.getCoroutineContext().get(uic.g);
                if (!(ydaVar != null ? ydaVar.isActive() : false)) {
                    throw new kx2("Client already closed", 0);
                }
                zj9 zj9Var = (zj9) this.u;
                this.s = 1;
                Object e = ci9Var.e(zj9Var, this);
                return e == lu3Var17 ? lu3Var17 : e;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    g6b lifecycle2 = ((BaseActivity) this.t).getLifecycle();
                    e6b e6bVar2 = e6b.e;
                    ip1 ip1Var = new ip1((ImageView) this.u, r93 == true ? 1 : 0, 24);
                    this.s = 1;
                    if (b6a.z(lifecycle2, e6bVar2, ip1Var, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                jda jdaVar = (jda) this.t;
                ThreadLocal threadLocal = jdaVar.c;
                lu3 lu3Var19 = lu3.a;
                int i25 = this.s;
                try {
                    if (i25 == 0) {
                        y6a.M(obj);
                        Object obj3 = threadLocal.get();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.c(obj3, bool)) {
                            a70.r("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                            return null;
                        }
                        threadLocal.set(bool);
                        ye4 ye4Var = jdaVar.d;
                        cb4 cb4Var = new cb4((Function1) this.u, (rq3) (r94 == true ? 1 : 0), i4);
                        this.s = 1;
                        x2 = o6a.x(ye4Var, cb4Var, this);
                        if (x2 == lu3Var19) {
                            return lu3Var19;
                        }
                    } else {
                        if (i25 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        x2 = obj;
                    }
                    return (p0d) x2;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
            case 19:
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                if (this.s != ((znh) this.u).h() && (i = this.s) != 0) {
                    Context context3 = (Context) this.t;
                    context3.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context3.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putInt("KeyboardHeightPref", i);
                    Unit unit3 = Unit.a;
                    edit.apply();
                    ((znh) this.u).i(this.s);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    qze qzeVar = (qze) this.u;
                    qp1 qp1Var = new qp1((a6e) this.t, r95 == true ? 1 : 0, r8 == true ? 1 : 0);
                    this.s = 1;
                    if (oyn.s(qzeVar, qp1Var, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    f6e f6eVar = (f6e) this.t;
                    lk0 lk0Var = ((osa) this.u).c;
                    this.s = 1;
                    Object y = lk0Var.g.y(new cl(lk0Var, f6eVar, r96 == true ? 1 : 0, 19), this);
                    if (y != lu3Var22) {
                        y = Unit.a;
                    }
                    if (y == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    yta ytaVar = (yta) this.u;
                    zzc zzcVar2 = ytaVar.D;
                    sef sefVar = ytaVar.f;
                    int i29 = ytaVar.i;
                    qef qefVar = qef.LEAGUE;
                    this.t = zzcVar2;
                    this.s = 1;
                    c = sefVar.c(i29, qefVar, this);
                    if (c == lu3Var23) {
                        return lu3Var23;
                    }
                    zzcVar = zzcVar2;
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzcVar = (zzc) this.t;
                    y6a.M(obj);
                    c = obj;
                }
                zzcVar.a(c);
                return Unit.a;
            case 23:
                nua nuaVar = (nua) this.t;
                lu3 lu3Var24 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    int i31 = ((bua) ((cua) this.u)).a;
                    this.s = 1;
                    t = nuaVar.t(i31, this);
                    if (t == lu3Var24) {
                        return lu3Var24;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    t = obj;
                }
                gv9 gv9Var = (gv9) t;
                if (gv9Var != null) {
                    nuaVar.n(null, new uo(4, gv9Var));
                }
                return Unit.a;
            case 24:
                PowerRankingRound powerRankingRound = (PowerRankingRound) this.u;
                eza ezaVar = (eza) this.t;
                lu3 lu3Var25 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = ezaVar.l;
                    int i33 = ezaVar.n;
                    int i34 = ezaVar.o;
                    int id2 = powerRankingRound.getId();
                    this.s = 1;
                    b0 = w3bVar.b0(i33, i34, id2, this);
                    if (b0 == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    b0 = obj;
                }
                PowerRankingResponse powerRankingResponse = (PowerRankingResponse) b0;
                if (powerRankingResponse != null && (powerRankings = powerRankingResponse.getPowerRankings()) != null) {
                    ezaVar.n(null, new uf8(25, powerRankingRound, b0a.S(ezaVar.i(), powerRankings)));
                }
                return Unit.a;
            case 25:
                DateResponse dateResponse = (DateResponse) this.u;
                lu3 lu3Var26 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    w3b w3bVar2 = (w3b) this.t;
                    String date = dateResponse.getDate();
                    this.s = 1;
                    D0 = w3bVar2.D0(16, date, this);
                    if (D0 == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    D0 = obj;
                }
                EventListResponse eventListResponse = (EventListResponse) D0;
                if (eventListResponse == null || (events = eventListResponse.getEvents()) == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(k13.r(events, 10));
                Iterator it5 = events.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(new Pair((Event) it5.next(), dateResponse.getDate()));
                }
                return arrayList2;
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i36 = this.s;
                if (i36 != 0) {
                    if (i36 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                k5b k5bVar = (k5b) this.t;
                u1 u1Var = (u1) this.u;
                this.s = 1;
                rje.a(k5bVar, u1Var, this);
                return lu3Var27;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i37 = this.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var4 = z45.a;
                    e7b e7bVar = new e7b((Function1) this.u, rq3Var, i5);
                    this.s = 1;
                    R3 = xw3.R(hs4Var4, e7bVar, this);
                    if (R3 == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R3 = obj;
                }
                ((Function1) this.t).invoke(R3);
                return Unit.a;
            case 28:
                lu3 lu3Var29 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    g6b lifecycle3 = ((u6b) this.t).getLifecycle();
                    e6b e6bVar3 = e6b.e;
                    deb debVar = new deb((geb) this.u, null);
                    this.s = 1;
                    if (b6a.z(lifecycle3, e6bVar3, debVar, this) == lu3Var29) {
                        return lu3Var29;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                meb mebVar = (meb) this.t;
                lu3 lu3Var30 = lu3.a;
                int i39 = this.s;
                if (i39 == 0) {
                    y6a.M(obj);
                    fu3 fu3Var = mebVar.a;
                    this.s = 1;
                    if (fu3Var.m(this) == lu3Var30) {
                        return lu3Var30;
                    }
                } else {
                    if (i39 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                mebVar.a.j(this.u);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp7(b1d b1dVar, rq3 rq3Var, FeaturedTournamentFragment featuredTournamentFragment) {
        super(2, rq3Var);
        this.r = 2;
        this.t = b1dVar;
        this.u = featuredTournamentFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp7(qze qzeVar, a6e a6eVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 20;
        this.u = qzeVar;
        this.t = a6eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp7(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp7(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }
}
