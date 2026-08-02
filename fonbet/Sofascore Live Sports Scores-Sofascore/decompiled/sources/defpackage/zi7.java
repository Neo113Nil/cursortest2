package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import android.view.InputEvent;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasySquadResponse;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.LeagueDraftPickItem;
import com.sofascore.model.newNetwork.UniqueTournamentDraftPicksResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.league.service.LeagueWorker;
import com.sofascore.results.main.matches.redesign.MatchesRootFragment;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zi7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi7(o4b o4bVar, int i, Integer num, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 20;
        this.t = o4bVar;
        this.s = i;
        this.u = num;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new zi7((gv9) this.t, (ksa) this.u, (ho7) obj2, rq3Var, 0);
            case 1:
                return new zi7((vp7) obj2, rq3Var, 1);
            case 2:
                u6b u6bVar = (u6b) this.t;
                e6b e6bVar = e6b.a;
                return new zi7(u6bVar, (b1d) this.u, rq3Var, (FeaturedTournamentFragment) obj2);
            case 3:
                return new zi7((PersonalizedMediaPost) this.t, (qx7) this.u, (Set) obj2, rq3Var, 3);
            case 4:
                return new zi7((b1d) this.t, rq3Var, (ku3) obj2, (ksa) this.u);
            case 5:
                zi7 zi7Var = new zi7((File) obj2, rq3Var, 5);
                zi7Var.u = obj;
                return zi7Var;
            case 6:
                zi7 zi7Var2 = new zi7((wzc) this.u, (l88) obj2, rq3Var, 6);
                zi7Var2.t = obj;
                return zi7Var2;
            case 7:
                zi7 zi7Var3 = new zi7((q98) this.u, (b98) obj2, rq3Var, 7);
                zi7Var3.t = obj;
                return zi7Var3;
            case 8:
                return new zi7((CoroutineContext) this.t, (z88) this.u, (i8f) obj2, rq3Var, 8);
            case 9:
                zi7 zi7Var4 = new zi7((ct8) this.u, (f10) obj2, rq3Var, 9);
                zi7Var4.t = obj;
                return zi7Var4;
            case 10:
                return new zi7((wzc) this.t, (i7a) this.u, (q55) obj2, rq3Var, 10);
            case 11:
                return new zi7((g62) obj2, rq3Var, 11);
            case 12:
                return new zi7((Long) this.t, (yj9) this.u, (smi) obj2, rq3Var, 12);
            case 13:
                return new zi7((Context) this.t, (Uri) this.u, (Size) obj2, rq3Var, 13);
            case 14:
                return new zi7((AppCompatActivity) this.t, (ImageView) this.u, (Context) obj2, rq3Var, 14);
            case 15:
                return new zi7((jda) this.t, (e5f) this.u, this.v, rq3Var, 15);
            case 16:
                return new zi7((jda) this.t, (e5f) this.u, (Long) obj2, rq3Var, 16);
            case 17:
                return new zi7((lqa) this.t, (j38) this.u, (n29) obj2, rq3Var, 17);
            case 18:
                return new zi7((yva) this.t, (fwa) this.u, (rva) obj2, rq3Var, 18);
            case 19:
                return new zi7((b1d) this.t, (LeagueEventsFragment) this.u, rq3Var, (LeagueEventsFragment) obj2, 19);
            case 20:
                return new zi7((o4b) this.t, this.s, (Integer) this.u, (String) obj2, rq3Var);
            case 21:
                return new zi7((LeagueWorker) this.t, (UniqueTournament) this.u, (wu) obj2, rq3Var, 21);
            case 22:
                zi7 zi7Var5 = new zi7((Map) this.u, (LeagueWorker) obj2, rq3Var, 22);
                zi7Var5.t = obj;
                return zi7Var5;
            case 23:
                zi7 zi7Var6 = new zi7((Function2) this.u, (uh2) obj2, rq3Var, 23);
                zi7Var6.t = obj;
                return zi7Var6;
            case 24:
                return new zi7((b1d) this.t, (ManagerEventsFragment) this.u, rq3Var, (ManagerEventsFragment) obj2, 24);
            case 25:
                zi7 zi7Var7 = new zi7((gvb) obj2, rq3Var, 25);
                zi7Var7.u = obj;
                return zi7Var7;
            case 26:
                return new zi7((axb) this.t, (Event) this.u, (String) obj2, rq3Var, 26);
            case 27:
                return new zi7((b1d) this.t, (MatchesRootFragment) this.u, rq3Var, (MatchesRootFragment) obj2, 27);
            case 28:
                return new zi7((r1c) this.t, (Uri) this.u, (InputEvent) obj2, rq3Var, 28);
            default:
                return new zi7((Event) this.u, (u8c) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 4:
                ((zi7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 19:
                ((zi7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 24:
                ((zi7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 27:
                ((zi7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((zi7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:65|(1:(1:(1:(1:(2:71|72)(2:73|74))(3:75|76|77))(5:78|79|80|81|82))(1:94))(2:99|(2:101|102)(6:103|(1:105)(1:109)|106|(1:108)|84|85))|95|96|(3:98|84|85)|81|82) */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0565, code lost:
    
        if (r1 == r0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0723, code lost:
    
        if (r1.collect(r2, r28) == r5) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0732, code lost:
    
        if (defpackage.xw3.R(r2, r6, r28) == r5) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x08b6, code lost:
    
        if (r1 == r0) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0895, code lost:
    
        if (r1 == r0) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x08a7, code lost:
    
        if (r1 == r0) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x09fd, code lost:
    
        if (r2.q(r28, r0) == r5) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x094e, code lost:
    
        if (r6 == r5) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0214, code lost:
    
        if (r12.f(r28, r0) != r11) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0657 A[Catch: all -> 0x062b, TryCatch #7 {all -> 0x062b, blocks: (B:322:0x0625, B:324:0x064f, B:326:0x0657, B:327:0x0664, B:334:0x0674, B:336:0x0641, B:340:0x0677, B:344:0x067c, B:345:0x067d, B:346:0x067e, B:352:0x063c, B:329:0x0665, B:331:0x066b), top: B:318:0x0619, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x067e A[Catch: all -> 0x062b, TRY_LEAVE, TryCatch #7 {all -> 0x062b, blocks: (B:322:0x0625, B:324:0x064f, B:326:0x0657, B:327:0x0664, B:334:0x0674, B:336:0x0641, B:340:0x0677, B:344:0x067c, B:345:0x067d, B:346:0x067e, B:352:0x063c, B:329:0x0665, B:331:0x066b), top: B:318:0x0619, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v28, types: [ln2] */
    /* JADX WARN: Type inference failed for: r2v30, types: [g62] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [ln2] */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:295:0x064b -> B:282:0x064f). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Object P;
        x2g x2gVar;
        vp7 vp7Var;
        x2g x2gVar2;
        Object a;
        Object r;
        Object d;
        RandomAccessFile randomAccessFile;
        Object y;
        RandomAccessFile randomAccessFile2;
        Throwable th;
        Throwable th2;
        b62 b62Var;
        Object a2;
        boolean z;
        Object R;
        Object A;
        Object c;
        Object d2;
        Object invoke;
        q50 q50Var;
        c80 c80Var;
        Float f;
        Object a3;
        Integer num;
        Object E;
        int i2 = 10;
        ?? r2 = 16;
        char c2 = 16;
        char c3 = 16;
        final int i3 = 0;
        r8 = false;
        boolean z2 = false;
        final int i4 = 1;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    gv9 gv9Var = (gv9) this.t;
                    ho7 ho7Var = (ho7) this.v;
                    gv9Var.getClass();
                    Iterator it = gv9Var.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            i3 = -1;
                        } else if (((mj7) it.next()).a == ho7Var.a.a) {
                            i = -1;
                        } else {
                            i3++;
                        }
                    }
                    r10 = i3 != i ? Integer.valueOf(i3) : 0;
                    if (r10 != 0) {
                        ksa ksaVar = (ksa) this.u;
                        int intValue = r10.intValue();
                        this.s = 1;
                        if (n9e.o(ksaVar, intValue, this) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                vp7 vp7Var2 = (vp7) this.v;
                g62 g62Var = vp7Var2.j;
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                rq3 rq3Var = null;
                if (i6 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = vp7Var2.e;
                    int i7 = vp7Var2.k().a.c;
                    km5 km5Var = km5.a;
                    this.s = 1;
                    wi7Var.getClass();
                    P = yaa.P(new c64(wi7Var, i7, km5Var, rq3Var, 8), this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            return Unit.a;
                        }
                        vp7Var = (vp7) this.u;
                        x2gVar2 = (x2g) this.t;
                        y6a.M(obj);
                        vp7Var.n();
                        x2gVar = x2gVar2;
                        if (!(x2gVar instanceof t2g)) {
                            Throwable th3 = ((t2g) x2gVar).a;
                            ia0 ia0Var = ia0.q;
                            if (ok3.p().e().getDevMod()) {
                                Calendar calendar = ke0.a;
                                ke0.g(vp7Var2.i(), "Auto-Select: ".concat(yaa.z(th3)), 0);
                            }
                            jp7 jp7Var = jp7.a;
                            this.t = x2gVar;
                            this.u = null;
                            this.s = 3;
                            break;
                        } else if (!(x2gVar instanceof v2g)) {
                            zzl.b();
                            return null;
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                x2gVar = (x2g) P;
                if (!(x2gVar instanceof t2g)) {
                    if (!(x2gVar instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    List<FantasyRoundPlayer> players = ((FantasySquadResponse) ((v2g) x2gVar).a).getSquad().getPlayers();
                    ArrayList arrayList = new ArrayList(k13.r(players, 10));
                    Iterator it2 = players.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(hkg.g0((FantasyRoundPlayer) it2.next(), vp7Var2.i()));
                    }
                    vp7Var2.m(qp7.a(vp7Var2.k(), l6g.W(arrayList), arrayList.size(), false, false, null, null, 423));
                    kp7 kp7Var = kp7.a;
                    this.t = x2gVar;
                    this.u = vp7Var2;
                    this.s = 2;
                    if (g62Var.q(this, kp7Var) != lu3Var2) {
                        vp7Var = vp7Var2;
                        x2gVar2 = x2gVar;
                        vp7Var.n();
                        x2gVar = x2gVar2;
                    }
                    return lu3Var2;
                }
                if (!(x2gVar instanceof t2g)) {
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.t;
                    e6b e6bVar = e6b.c;
                    yp7 yp7Var = new yp7((b1d) this.u, (rq3) null, (FeaturedTournamentFragment) this.v);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, yp7Var, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                Set set = (Set) this.v;
                u8c u8cVar = ((qx7) this.u).b;
                PersonalizedMediaPost personalizedMediaPost = (PersonalizedMediaPost) this.t;
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                rq3 rq3Var2 = null;
                if (i9 == 0) {
                    y6a.M(obj);
                    if (personalizedMediaPost.getType() != MediaType.GroupPost) {
                        int id = personalizedMediaPost.getId();
                        this.s = 2;
                        a = u8cVar.a(id, this);
                        break;
                    } else {
                        this.s = 1;
                        u8cVar.getClass();
                        r = s9a.r(new jk(u8cVar, personalizedMediaPost, set, rq3Var2, 16), this);
                        break;
                    }
                    return lu3Var4;
                }
                if (i9 == 1) {
                    y6a.M(obj);
                    r = obj;
                    return (w31) r;
                }
                if (i9 != 2) {
                    if (i9 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d = obj;
                    return (w31) d;
                }
                y6a.M(obj);
                a = obj;
                MediaPost mediaPost = (MediaPost) a;
                if (mediaPost == null) {
                    return null;
                }
                this.s = 3;
                d = u8c.d(u8cVar, mediaPost, set, this, 6);
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    nk0 nk0Var = new nk0(i2, (ku3) this.v, (ksa) this.u);
                    this.s = 1;
                    if (b1dVar.collect(nk0Var, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    fof fofVar = (fof) this.u;
                    randomAccessFile = new RandomAccessFile((File) this.v, "rw");
                    try {
                        db2 db2Var = fofVar.a;
                        FileChannel channel = randomAccessFile.getChannel();
                        channel.getClass();
                        this.u = randomAccessFile;
                        this.t = randomAccessFile;
                        this.s = 1;
                        y = v9g.y(db2Var, channel, Long.MAX_VALUE, this);
                        if (y == lu3Var6) {
                            return lu3Var6;
                        }
                        randomAccessFile2 = randomAccessFile;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    randomAccessFile2 = (RandomAccessFile) this.t;
                    ?? r1 = (Closeable) this.u;
                    try {
                        y6a.M(obj);
                        randomAccessFile = r1;
                        y = obj;
                    } catch (Throwable th5) {
                        th = th5;
                        randomAccessFile = r1;
                        th2 = th;
                        try {
                            throw th2;
                        } catch (Throwable th6) {
                            n4o.x(randomAccessFile, th2);
                            throw th6;
                        }
                    }
                }
                randomAccessFile2.setLength(((Number) y).longValue());
                Unit unit = Unit.a;
                n4o.x(randomAccessFile, null);
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var = (ku3) this.t;
                    ArrayList arrayList2 = new ArrayList();
                    z88 b = ((wzc) this.u).b();
                    m70 m70Var = new m70(3, arrayList2, ku3Var, (l88) this.v);
                    this.s = 1;
                    if (b.collect(m70Var, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var8 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    q98 q98Var = (q98) this.u;
                    b98 b98Var = (b98) this.v;
                    this.t = null;
                    this.s = 1;
                    if (q98Var.invoke(ku3Var2, b98Var, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                i8f i8fVar = (i8f) this.v;
                z88 z88Var = (z88) this.u;
                CoroutineContext coroutineContext = (CoroutineContext) this.t;
                lu3 lu3Var9 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    if (!Intrinsics.c(coroutineContext, g.a)) {
                        h98 h98Var = new h98(z88Var, i8fVar, r10, i3);
                        this.s = 2;
                        break;
                    } else {
                        g98 g98Var = new g98(i8fVar, 0);
                        this.s = 1;
                        break;
                    }
                } else {
                    if (i14 != 1 && i14 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    Object obj2 = this.t;
                    ct8 ct8Var = (ct8) this.u;
                    f10 f10Var = (f10) this.v;
                    this.s = 1;
                    if (ct8Var.invoke(f10Var, obj2, this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    wzc wzcVar = (wzc) this.t;
                    i7a i7aVar = (i7a) this.u;
                    this.s = 1;
                    if (wzcVar.a(i7aVar, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                q55 q55Var = (q55) this.v;
                if (q55Var != null) {
                    q55Var.d();
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i17 = this.s;
                try {
                    if (i17 == 0) {
                        y6a.M(obj);
                        r2 = (g62) this.v;
                        b62Var = new b62(r2);
                        this.t = r2;
                        this.u = b62Var;
                        this.s = 1;
                        a2 = b62Var.a(this);
                        r2 = r2;
                        if (a2 == lu3Var12) {
                        }
                        if (((Boolean) a2).booleanValue()) {
                        }
                    } else {
                        if (i17 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b62Var = (b62) this.u;
                        ln2 ln2Var = (ln2) this.t;
                        y6a.M(obj);
                        a2 = obj;
                        r2 = ln2Var;
                        if (((Boolean) a2).booleanValue()) {
                            e09.b.set(false);
                            synchronized (snh.c) {
                                y0d y0dVar = snh.j.h;
                                z = y0dVar != null && y0dVar.h();
                            }
                            if (z) {
                                snh.c();
                            }
                            this.t = r2;
                            this.u = b62Var;
                            this.s = 1;
                            a2 = b62Var.a(this);
                            r2 = r2;
                            if (a2 == lu3Var12) {
                                return lu3Var12;
                            }
                            if (((Boolean) a2).booleanValue()) {
                                Unit unit2 = Unit.a;
                                r2.e(null);
                                return Unit.a;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        fz8.K(r2, th7);
                        throw th8;
                    }
                }
                break;
            case 12:
                yj9 yj9Var = (yj9) this.u;
                lu3 lu3Var13 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    long longValue = ((Long) this.t).longValue();
                    this.s = 1;
                    if (n4o.y(longValue, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                yj9Var.getClass();
                m8k m8kVar = yj9Var.a;
                m8kVar.a();
                StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_LOCAL_ONLY);
                s6a.p(m8kVar, sb);
                String sb2 = sb.toString();
                al9 al9Var = al9.a;
                Map map = (Map) yj9Var.f.d(ei9.a);
                bl9 bl9Var = (bl9) (map != null ? map.get(al9Var) : null);
                hk9 hk9Var = new hk9(sb2, bl9Var != null ? bl9Var.a : null, null);
                bjb bjbVar = dl9.a;
                bjbVar.getClass();
                if (bjbVar.i()) {
                    bjbVar.l("Request timeout: " + m8kVar);
                }
                smi smiVar = (smi) this.v;
                String message = hk9Var.getMessage();
                message.getClass();
                bea.o(smiVar, message, hk9Var);
                return Unit.a;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i19 = this.s;
                rq3 rq3Var3 = null;
                if (i19 == 0) {
                    y6a.M(obj);
                    Context context = (Context) this.t;
                    Uri uri = (Uri) this.u;
                    Size size = (Size) this.v;
                    this.s = 1;
                    hs4 hs4Var = z45.a;
                    R = xw3.R(hq4.c, new jr5(context, uri, size, rq3Var3, 5), this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                Bitmap bitmap = (Bitmap) R;
                if (bitmap == null) {
                    return null;
                }
                this.s = 2;
                hs4 hs4Var2 = z45.a;
                Object R2 = xw3.R(hq4.c, new ip1(bitmap, rq3Var3, 23), this);
                if (R2 != lu3Var14) {
                    return R2;
                }
                return lu3Var14;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    g6b lifecycle = ((AppCompatActivity) this.t).getLifecycle();
                    e6b e6bVar2 = e6b.e;
                    qa7 qa7Var = new qa7((ImageView) this.u, (Context) this.v, r10, c2);
                    this.s = 1;
                    if (b6a.z(lifecycle, e6bVar2, qa7Var, this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    z88 data = ((jda) this.t).d.getData();
                    this.s = 1;
                    A = rd0.A(data, this);
                    if (A == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    A = obj;
                }
                p0d p0dVar = (p0d) A;
                return (p0dVar == null || (c = p0dVar.c((e5f) this.u)) == null) ? this.v : c;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i22 = this.s;
                if (i22 != 0) {
                    if (i22 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ye4 ye4Var = ((jda) this.t).d;
                k50 k50Var = new k50((e5f) this.u, (Long) this.v, (rq3) r10, 11);
                this.s = 1;
                Object x = o6a.x(ye4Var, k50Var, this);
                return x == lu3Var17 ? lu3Var17 : x;
            case 17:
                lqa lqaVar = (lqa) this.t;
                e1d e1dVar = lqaVar.j;
                lu3 lu3Var18 = lu3.a;
                int i23 = this.s;
                try {
                    if (i23 == 0) {
                        y6a.M(obj);
                        q50 q50Var2 = lqaVar.p;
                        Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        j38 j38Var = (j38) this.u;
                        kqa kqaVar = new kqa((n29) this.v, lqaVar, i4);
                        this.s = 1;
                        if (q50.a(q50Var2, f2, j38Var, kqaVar, this, 4) == lu3Var18) {
                            return lu3Var18;
                        }
                    } else {
                        if (i23 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    ((eoh) lqaVar.k).setValue(Boolean.TRUE);
                    ((eoh) e1dVar).setValue(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th9) {
                    ((eoh) e1dVar).setValue(Boolean.FALSE);
                    throw th9;
                }
            case 18:
                final fwa fwaVar = (fwa) this.u;
                yva yvaVar = (yva) this.t;
                lu3 lu3Var19 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    String str = yvaVar == yva.PICKS ? fwaVar.q : fwaVar.r;
                    if (str != null) {
                        w3b w3bVar = fwaVar.l;
                        int i25 = fwaVar.n;
                        int i26 = ((nva) ((rva) this.v)).a;
                        this.s = 1;
                        d2 = w3bVar.d(i25, i26, this, str);
                        if (d2 == lu3Var19) {
                            return lu3Var19;
                        }
                    }
                    return Unit.a;
                }
                if (i24 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                d2 = obj;
                final UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse = (UniqueTournamentDraftPicksResponse) d2;
                if ((yvaVar == null ? -1 : ewa.a[yvaVar.ordinal()]) == 1) {
                    fwaVar.n(null, new Function1() { // from class: dwa
                        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
                        
                            if (r0 == null) goto L23;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
                        
                            if (r0 == null) goto L12;
                         */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj3) {
                            gv9 gv9Var2;
                            List<LeagueDraftPickItem> picks;
                            gv9 gv9Var3;
                            List<LeagueDraftPickItem> picks2;
                            int i27 = i3;
                            fwa fwaVar2 = fwaVar;
                            UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse2 = uniqueTournamentDraftPicksResponse;
                            switch (i27) {
                                case 0:
                                    xva xvaVar = (xva) obj3;
                                    if (uniqueTournamentDraftPicksResponse2 != null && (picks = uniqueTournamentDraftPicksResponse2.getPicks()) != null) {
                                        gv9Var2 = vha.C(fwaVar2.i(), fwaVar2.s, picks);
                                        break;
                                    }
                                    gv9Var2 = rlh.b;
                                    return xva.a(xvaVar, null, null, 0, null, gv9Var2, null, null, null, null, null, null, 0, false, 49135);
                                default:
                                    xva xvaVar2 = (xva) obj3;
                                    if (uniqueTournamentDraftPicksResponse2 != null && (picks2 = uniqueTournamentDraftPicksResponse2.getPicks()) != null) {
                                        gv9Var3 = vha.C(fwaVar2.i(), fwaVar2.s, picks2);
                                        break;
                                    }
                                    gv9Var3 = rlh.b;
                                    return xva.a(xvaVar2, null, null, 0, null, null, gv9Var3, null, null, null, null, null, 0, false, 49119);
                            }
                        }
                    });
                } else {
                    fwaVar.n(null, new Function1() { // from class: dwa
                        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
                        
                            if (r0 == null) goto L23;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
                        
                            if (r0 == null) goto L12;
                         */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj3) {
                            gv9 gv9Var2;
                            List<LeagueDraftPickItem> picks;
                            gv9 gv9Var3;
                            List<LeagueDraftPickItem> picks2;
                            int i27 = i4;
                            fwa fwaVar2 = fwaVar;
                            UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse2 = uniqueTournamentDraftPicksResponse;
                            switch (i27) {
                                case 0:
                                    xva xvaVar = (xva) obj3;
                                    if (uniqueTournamentDraftPicksResponse2 != null && (picks = uniqueTournamentDraftPicksResponse2.getPicks()) != null) {
                                        gv9Var2 = vha.C(fwaVar2.i(), fwaVar2.s, picks);
                                        break;
                                    }
                                    gv9Var2 = rlh.b;
                                    return xva.a(xvaVar, null, null, 0, null, gv9Var2, null, null, null, null, null, null, 0, false, 49135);
                                default:
                                    xva xvaVar2 = (xva) obj3;
                                    if (uniqueTournamentDraftPicksResponse2 != null && (picks2 = uniqueTournamentDraftPicksResponse2.getPicks()) != null) {
                                        gv9Var3 = vha.C(fwaVar2.i(), fwaVar2.s, picks2);
                                        break;
                                    }
                                    gv9Var3 = rlh.b;
                                    return xva.a(xvaVar2, null, null, 0, null, null, gv9Var3, null, null, null, null, null, 0, false, 49119);
                            }
                        }
                    });
                }
                return Unit.a;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    b1d b1dVar2 = (b1d) this.t;
                    nk0 nk0Var2 = new nk0(14, (LeagueEventsFragment) this.u, (LeagueEventsFragment) this.v);
                    this.s = 1;
                    if (b1dVar2.collect(nk0Var2, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 20:
                lu3 lu3Var21 = lu3.a;
                y6a.M(obj);
                o4b o4bVar = (o4b) this.t;
                int i28 = this.s;
                Integer num2 = (Integer) this.u;
                xw3.L(un0.z(o4bVar), null, null, new gz6(o4bVar, i28, num2 != null ? num2.intValue() : -1, (String) this.v, (rq3) null, 2), 3);
                return Unit.a;
            case 21:
                UniqueTournament uniqueTournament = (UniqueTournament) this.u;
                LeagueWorker leagueWorker = (LeagueWorker) this.t;
                lu3 lu3Var22 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    Context applicationContext = leagueWorker.getApplicationContext();
                    applicationContext.getClass();
                    nv.y(applicationContext, vu.ADD_FAVORITE, xu.UNIQUE_TOURNAMENT, uniqueTournament.getId(), (wu) this.v);
                    int id2 = uniqueTournament.getId();
                    this.s = 1;
                    if (leagueWorker.h(id2, false, this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var23 = lu3.a;
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
                asf asfVar = new asf();
                Map map2 = (Map) this.u;
                LeagueWorker leagueWorker2 = (LeagueWorker) this.v;
                ArrayList arrayList3 = new ArrayList(map2.size());
                Iterator it3 = map2.entrySet().iterator();
                while (true) {
                    rq3 rq3Var4 = null;
                    if (!it3.hasNext()) {
                        this.t = null;
                        this.s = 1;
                        Object u = m6k.u(arrayList3, this);
                        return u == lu3Var23 ? lu3Var23 : u;
                    }
                    arrayList3.add(xw3.t(ku3Var3, null, new va8(leagueWorker2, (Map.Entry) it3.next(), asfVar, rq3Var4, 10), 3));
                }
            case 23:
                uh2 uh2Var = (uh2) this.v;
                lu3 lu3Var24 = lu3.a;
                int i31 = this.s;
                try {
                    if (i31 == 0) {
                        y6a.M(obj);
                        ku3 ku3Var4 = (ku3) this.t;
                        Function2 function2 = (Function2) this.u;
                        this.s = 1;
                        invoke = function2.invoke(ku3Var4, this);
                        if (invoke == lu3Var24) {
                            return lu3Var24;
                        }
                    } else {
                        if (i31 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        invoke = obj;
                    }
                    uh2Var.a(invoke);
                } catch (CancellationException unused) {
                    uh2Var.b();
                } catch (Throwable th10) {
                    uh2Var.c(th10);
                }
                return Unit.a;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    b1d b1dVar3 = (b1d) this.t;
                    nk0 nk0Var3 = new nk0(c3, (ManagerEventsFragment) this.u, (ManagerEventsFragment) this.v);
                    this.s = 1;
                    if (b1dVar3.collect(nk0Var3, this) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 25:
                gvb gvbVar = (gvb) this.v;
                q50 q50Var3 = gvbVar.z;
                lu3 lu3Var26 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    Float f3 = (Float) this.u;
                    if (f3 == null) {
                        return Unit.a;
                    }
                    int i34 = gvbVar.o;
                    float floatValue = f3.floatValue();
                    int i35 = gvbVar.q;
                    int i36 = gvbVar.p;
                    q50Var = q50Var3;
                    i4k i4kVar = new i4k((int) Math.ceil(floatValue / (Math.abs(c6o.c0(gvbVar).y.H0(gvbVar.r)) / 1000.0f)), i36, jg5.d);
                    long j = ((-i36) + i35) * (-1);
                    c80 P2 = i34 == Integer.MAX_VALUE ? s02.P(i4kVar, null, j, 2) : new ezf(i34, i4kVar, bzf.a, j);
                    Float f4 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.u = f3;
                    this.t = P2;
                    this.s = 1;
                    if (q50Var.f(this, f4) != lu3Var26) {
                        c80Var = P2;
                        f = f3;
                    }
                    return lu3Var26;
                }
                if (i33 == 1) {
                    c80 c80Var2 = (c80) this.t;
                    Float f5 = (Float) this.u;
                    y6a.M(obj);
                    c80Var = c80Var2;
                    f = f5;
                    q50Var = q50Var3;
                } else {
                    if (i33 != 2) {
                        if (i33 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        if (i33 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th11 = (Throwable) this.u;
                        y6a.M(obj);
                        throw th11;
                    }
                    try {
                        y6a.M(obj);
                        a3 = obj;
                        q50Var = q50Var3;
                        Float f6 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.s = 3;
                        break;
                    } catch (Throwable th12) {
                        Throwable th13 = th12;
                        q50Var = q50Var3;
                        Float f7 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.u = th13;
                        this.t = null;
                        this.s = 4;
                        if (q50Var.f(this, f7) != lu3Var26) {
                        }
                        return lu3Var26;
                    }
                }
                q50 q50Var4 = gvbVar.z;
                this.u = null;
                this.t = null;
                this.s = 2;
                a3 = q50.a(q50Var4, f, c80Var, null, this, 12);
                if (a3 == lu3Var26) {
                    return lu3Var26;
                }
                Float f62 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.s = 3;
                break;
            case 26:
                Event event = (Event) this.u;
                lu3 lu3Var27 = lu3.a;
                int i37 = this.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    fyk fykVar = ((axb) this.t).m;
                    int id3 = event.getId();
                    String str2 = (String) this.v;
                    long startTimestamp = event.getStartTimestamp();
                    VoteType voteType = VoteType.WHO_WILL_WIN;
                    this.s = 1;
                    if (fykVar.a(id3, str2, startTimestamp, voteType, null, this) == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    b1d b1dVar4 = (b1d) this.t;
                    nk0 nk0Var4 = new nk0(17, (MatchesRootFragment) this.u, (MatchesRootFragment) this.v);
                    this.s = 1;
                    if (b1dVar4.collect(nk0Var4, this) == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 28:
                lu3 lu3Var29 = lu3.a;
                int i39 = this.s;
                if (i39 == 0) {
                    y6a.M(obj);
                    v7a v7aVar = ((r1c) this.t).a;
                    Uri uri2 = (Uri) this.u;
                    InputEvent inputEvent = (InputEvent) this.v;
                    this.s = 1;
                    if (v7aVar.B(uri2, inputEvent, this) == lu3Var29) {
                        return lu3Var29;
                    }
                } else {
                    if (i39 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                Event event2 = (Event) this.u;
                lu3 lu3Var30 = lu3.a;
                int i40 = this.s;
                if (i40 == 0) {
                    y6a.M(obj);
                    num = new Integer(event2.getId());
                    String statusType = event2.getStatusType();
                    if (Intrinsics.c(statusType, StatusKt.STATUS_FINISHED)) {
                        FootballEvent footballEvent = event2 instanceof FootballEvent ? (FootballEvent) event2 : null;
                        if ((footballEvent != null ? footballEvent.getCorrectAiInsight() : null) != null) {
                            z2 = true;
                        }
                    } else if (b.j(StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_IN_PROGRESS).contains(statusType)) {
                        s96 s96Var = ((u8c) this.v).c;
                        int id4 = event2.getId();
                        String statusType2 = event2.getStatusType();
                        this.t = num;
                        this.s = 1;
                        E = s96Var.E(id4, statusType2, this);
                        if (E == lu3Var30) {
                            return lu3Var30;
                        }
                    }
                    return new Pair(num, Boolean.valueOf(z2));
                }
                if (i40 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Integer num3 = (Integer) this.t;
                y6a.M(obj);
                num = num3;
                E = obj;
                z2 = ((Boolean) E).booleanValue();
                return new Pair(num, Boolean.valueOf(z2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi7(u6b u6bVar, b1d b1dVar, rq3 rq3Var, FeaturedTournamentFragment featuredTournamentFragment) {
        super(2, rq3Var);
        this.r = 2;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = featuredTournamentFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi7(b1d b1dVar, rq3 rq3Var, ku3 ku3Var, ksa ksaVar) {
        super(2, rq3Var);
        this.r = 4;
        this.t = b1dVar;
        this.v = ku3Var;
        this.u = ksaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi7(b1d b1dVar, AbstractFragment abstractFragment, rq3 rq3Var, AbstractFragment abstractFragment2, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = abstractFragment;
        this.v = abstractFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi7(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi7(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi7(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }
}
