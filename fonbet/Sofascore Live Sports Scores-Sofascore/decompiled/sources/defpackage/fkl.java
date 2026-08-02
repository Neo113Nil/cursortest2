package defpackage;

import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.wc26.WorldCupRound;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fkl extends hoi implements Function2 {
    public av4 r;
    public String s;
    public String t;
    public Season u;
    public long v;
    public long w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ qkl z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkl(qkl qklVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = qklVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        fkl fklVar = new fkl(this.z, rq3Var);
        fklVar.y = obj;
        return fklVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fkl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015c A[LOOP:1: B:35:0x0156->B:37:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Type inference failed for: r4v1, types: [km5] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        Object w;
        long j;
        String str;
        String str2;
        long j2;
        Object T;
        String str3;
        String str4;
        long j3;
        Season season;
        UniqueTournamentDetails uniqueTournamentDetails;
        String str5;
        ?? r4;
        Iterator it;
        int r;
        List list;
        Category category;
        List<UniqueTournament> linkedUniqueTournaments;
        String y;
        String str6;
        ku3 ku3Var = (ku3) this.y;
        lu3 lu3Var = lu3.a;
        int i = this.x;
        qkl qklVar = this.z;
        if (i == 0) {
            y6a.M(obj);
            yea yeaVar = j58.a;
            List g = j58.g();
            t = xw3.t(ku3Var, null, new njl(qklVar, null, 26), 3);
            av4 t2 = xw3.t(ku3Var, null, new njl(qklVar, null, 27), 3);
            WorldCupRound worldCupRound = (WorldCupRound) CollectionsKt.firstOrNull(g);
            long startTimestamp = worldCupRound != null ? worldCupRound.getStartTimestamp() : 0L;
            WorldCupRound worldCupRound2 = (WorldCupRound) CollectionsKt.j0(g);
            long endTimestamp = worldCupRound2 != null ? worldCupRound2.getEndTimestamp() : 0L;
            bi4 bi4Var = bi4.PATTERN_DMM;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            String i2 = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
            String i3 = fc6.i(endTimestamp, hk4.a(bi4Var.d()));
            this.y = null;
            this.r = t;
            this.s = i2;
            this.t = i3;
            this.v = startTimestamp;
            this.w = endTimestamp;
            this.x = 1;
            w = t2.w(this);
            if (w != lu3Var) {
                j = endTimestamp;
                str = i3;
                str2 = i2;
                j2 = startTimestamp;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = this.v;
            season = this.u;
            String str7 = this.t;
            String str8 = this.s;
            y6a.M(obj);
            str3 = str8;
            j3 = j4;
            str4 = str7;
            T = obj;
            uniqueTournamentDetails = (UniqueTournamentDetails) T;
            if (uniqueTournamentDetails != null || (y = tba.y(uniqueTournamentDetails)) == null) {
                str5 = "";
            } else {
                if (season == null || (str6 = season.getYear()) == null) {
                    str6 = "";
                }
                str5 = lnb.o(y, " ", str6);
            }
            if (uniqueTournamentDetails != null || (linkedUniqueTournaments = uniqueTournamentDetails.getLinkedUniqueTournaments()) == null) {
                r4 = km5.a;
            } else {
                r4 = new ArrayList(k13.r(linkedUniqueTournaments, 10));
                Iterator it2 = linkedUniqueTournaments.iterator();
                while (it2.hasNext()) {
                    w1l.A(r4, ((UniqueTournament) it2.next()).getId());
                }
            }
            qklVar.F = r4;
            String slug = (uniqueTournamentDetails != null || (category = uniqueTournamentDetails.getCategory()) == null) ? null : category.getSlug();
            String str9 = slug != null ? "" : slug;
            String slug2 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getSlug() : null;
            String str10 = slug2 != null ? "" : slug2;
            yea yeaVar2 = j58.a;
            List<WorldCupRound> g2 = j58.g();
            ArrayList arrayList = new ArrayList(k13.r(g2, 10));
            it = g2.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(((WorldCupRound) it.next()).getNormalizedRoundDuration()));
            }
            Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            r = k13.r(arrayList, 9);
            if (r != 0) {
                list = a.c(valueOf);
            } else {
                ArrayList arrayList2 = new ArrayList(r + 1);
                arrayList2.add(valueOf);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    valueOf = Float.valueOf(valueOf.floatValue() + ((Number) it3.next()).floatValue());
                    arrayList2.add(valueOf);
                }
                list = arrayList2;
            }
            gv9 W = l6g.W(list);
            ArrayList arrayList3 = new ArrayList(k13.r(g2, 10));
            for (WorldCupRound worldCupRound3 : g2) {
                float w2 = yaa.w() - worldCupRound3.getStartTimestamp();
                long endTimestamp2 = worldCupRound3.getEndTimestamp() - worldCupRound3.getStartTimestamp();
                if (endTimestamp2 < 1) {
                    endTimestamp2 = 1;
                }
                arrayList3.add(Float.valueOf(llf.b(w2 / endTimestamp2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
            }
            return new iel(16, str5, j3, str3, str4, str9, str10, new ejl(W, l6g.W(arrayList3)));
        }
        long j5 = this.w;
        j2 = this.v;
        String str11 = this.t;
        str2 = this.s;
        t = this.r;
        y6a.M(obj);
        j = j5;
        str = str11;
        w = obj;
        av4 av4Var = t;
        long j6 = j;
        Season season2 = (Season) w;
        this.y = null;
        this.r = null;
        this.s = str2;
        this.t = str;
        this.u = season2;
        this.v = j2;
        this.w = j6;
        this.x = 2;
        T = av4Var.T(this);
        if (T != lu3Var) {
            str3 = str2;
            str4 = str;
            j3 = j2;
            season = season2;
            uniqueTournamentDetails = (UniqueTournamentDetails) T;
            if (uniqueTournamentDetails != null) {
            }
            str5 = "";
            if (uniqueTournamentDetails != null) {
            }
            r4 = km5.a;
            qklVar.F = r4;
            if (uniqueTournamentDetails != null) {
            }
            if (slug != null) {
            }
            if (uniqueTournamentDetails != null) {
            }
            if (slug2 != null) {
            }
            yea yeaVar22 = j58.a;
            List<WorldCupRound> g22 = j58.g();
            ArrayList arrayList4 = new ArrayList(k13.r(g22, 10));
            it = g22.iterator();
            while (it.hasNext()) {
            }
            Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            r = k13.r(arrayList4, 9);
            if (r != 0) {
            }
            gv9 W2 = l6g.W(list);
            ArrayList arrayList32 = new ArrayList(k13.r(g22, 10));
            while (r0.hasNext()) {
            }
            return new iel(16, str5, j3, str3, str4, str9, str10, new ejl(W2, l6g.W(arrayList32)));
        }
        return lu3Var;
    }
}
