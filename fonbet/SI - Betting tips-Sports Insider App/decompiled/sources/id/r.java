package id;

import com.sports.insider.data.entity.prediction.Game;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ve.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f11209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(List list, Continuation continuation, int i5) {
        super(2, continuation);
        this.f11208b = i5;
        this.f11209c = list;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f11208b) {
            case 0:
                return new r(this.f11209c, continuation, 0);
            case 1:
                return new r(this.f11209c, continuation, 1);
            case 2:
                return new r(this.f11209c, continuation, 2);
            case 3:
                return new r(this.f11209c, continuation, 3);
            case 4:
                return new r(this.f11209c, continuation, 4);
            case 5:
                return new r(this.f11209c, continuation, 5);
            case 6:
                return new r(this.f11209c, continuation, 6);
            case 7:
                return new r(this.f11209c, continuation, 7);
            default:
                return new r(this.f11209c, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f11208b) {
        }
        return ((r) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023 A[SYNTHETIC] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i5;
        int indexOf;
        int i10;
        int i11;
        Integer score;
        String name;
        Integer score2;
        String name2;
        c0 c0Var;
        int i12 = this.f11208b;
        int i13 = 0;
        List<Game> list = this.f11209c;
        switch (i12) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                    } else if (!((ja.c) it.next()).a()) {
                        i13++;
                    }
                }
                if (i13 <= -1) {
                    return list;
                }
                ArrayList X = CollectionsKt.X(list);
                X.add(i13, new hc.a());
                return CollectionsKt.W(X);
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                if (x.f11224a) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        hc.f fVar = (hc.f) obj2;
                        if (fVar instanceof ja.c) {
                            ja.c cVar = (ja.c) fVar;
                            if (cVar.f18391d == 1 && !Intrinsics.areEqual(cVar.b(), "unknown")) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    List<hc.f> S = CollectionsKt.S(3, arrayList);
                    if (S == null || !S.isEmpty()) {
                        i5 = 0;
                        for (hc.f fVar2 : S) {
                            if ((fVar2 instanceof ja.c) && Intrinsics.areEqual(((ja.c) fVar2).f18392e, "success") && (i5 = i5 + 1) < 0) {
                                kotlin.collections.u.i();
                                throw null;
                            }
                        }
                    } else {
                        i5 = 0;
                    }
                    if (i5 == 3) {
                        ArrayList X2 = CollectionsKt.X(list);
                        X2.add(0, new hc.i());
                        return CollectionsKt.W(X2);
                    }
                }
                if (da.r.e()) {
                    return list;
                }
                ArrayList X3 = CollectionsKt.X(list);
                X3.add(0, new hc.e());
                return CollectionsKt.W(X3);
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    hc.f fVar3 = (hc.f) obj3;
                    if (fVar3 instanceof ja.c) {
                        ja.c cVar2 = (ja.c) fVar3;
                        if (cVar2.f18391d == 1 && !cVar2.a()) {
                            arrayList2.add(obj3);
                        }
                    }
                }
                hc.f fVar4 = (hc.f) CollectionsKt.L(CollectionsKt.S(3, arrayList2));
                if (fVar4 == null || (indexOf = list.indexOf(fVar4)) <= -1) {
                    return list;
                }
                ArrayList X4 = CollectionsKt.X(list);
                X4.add(indexOf + 1, new hc.d(z.a()));
                return CollectionsKt.W(X4);
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                ArrayList X5 = CollectionsKt.X(list);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    hc.f fVar5 = (hc.f) obj4;
                    if ((fVar5 instanceof ja.c) && ((ja.c) fVar5).a()) {
                        arrayList3.add(obj4);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    LocalDateTime truncatedTo = LocalDateTime.ofEpochSecond(((ja.c) next).f18389b, 0, ZoneOffset.UTC).truncatedTo(ChronoUnit.DAYS);
                    Object obj5 = linkedHashMap.get(truncatedTo);
                    if (obj5 == null) {
                        obj5 = new ArrayList();
                        linkedHashMap.put(truncatedTo, obj5);
                    }
                    ((List) obj5).add(next);
                }
                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((Iterable) ((Map.Entry) it3.next()).getValue()).iterator();
                    if (!it4.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next2 = it4.next();
                    if (it4.hasNext()) {
                        int i14 = ((ja.c) next2).f18389b;
                        do {
                            Object next3 = it4.next();
                            int i15 = ((ja.c) next3).f18389b;
                            if (i14 < i15) {
                                next2 = next3;
                                i14 = i15;
                            }
                        } while (it4.hasNext());
                    }
                    arrayList4.add((ja.c) next2);
                }
                if (arrayList4.isEmpty()) {
                    return list;
                }
                int a7 = z.a();
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    int indexOf2 = X5.indexOf((ja.c) it5.next());
                    if (indexOf2 > -1) {
                        X5.add(indexOf2 + 1, new hc.d(a7));
                    }
                }
                return CollectionsKt.W(X5);
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                if (list == null || !list.isEmpty()) {
                    Iterator it6 = list.iterator();
                    i10 = 0;
                    while (it6.hasNext()) {
                        if ((((hc.f) it6.next()) instanceof ja.c) && (i10 = i10 + 1) < 0) {
                            kotlin.collections.u.i();
                            throw null;
                        }
                    }
                } else {
                    i10 = 0;
                }
                if (i10 < 3) {
                    return list;
                }
                ArrayList X6 = CollectionsKt.X(list);
                Iterator it7 = list.iterator();
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (it7.hasNext()) {
                    int i19 = i16 + 1;
                    if ((((hc.f) it7.next()) instanceof ja.c) && (i17 = i17 + 1) == 3) {
                        X6.add(i16 + i18 + 1, new hc.g());
                        i18++;
                        i16 = i19;
                        i17 = 0;
                    } else {
                        i16 = i19;
                    }
                }
                return CollectionsKt.W(X6);
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list) {
                    ja.c cVar3 = (ja.c) obj6;
                    if (!cVar3.a() && !io.sentry.config.a.C(new Integer(cVar3.j)) && Intrinsics.areEqual(cVar3.b(), "unknown") && cVar3.f18391d == 2) {
                        arrayList5.add(obj6);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj7 : list) {
                    ja.c cVar4 = (ja.c) obj7;
                    if (!cVar4.a() && !io.sentry.config.a.C(new Integer(cVar4.j)) && Intrinsics.areEqual(cVar4.b(), "unknown") && cVar4.f18391d == 3) {
                        arrayList6.add(obj7);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : list) {
                    ja.c cVar5 = (ja.c) obj8;
                    if (cVar5.a() || io.sentry.config.a.C(new Integer(cVar5.j)) || !Intrinsics.areEqual(cVar5.b(), "unknown") || ((i11 = cVar5.f18391d) != 2 && i11 != 3)) {
                        arrayList7.add(obj8);
                    }
                }
                return CollectionsKt.N(CollectionsKt.N(arrayList6, arrayList5), arrayList7);
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                Iterator it8 = CollectionsKt.D(list).iterator();
                while (it8.hasNext()) {
                    String str = (String) it8.next();
                    if (str.length() > 0) {
                        try {
                            File file = new File(StringsKt.M(str, "file:/"));
                            if (file.exists()) {
                                file.delete();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                return Unit.f19194a;
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                if (list == null) {
                    return null;
                }
                Iterator it9 = CollectionsKt.D(list).iterator();
                while (it9.hasNext()) {
                    String str2 = (String) it9.next();
                    if (str2.length() > 0) {
                        try {
                            File file2 = new File(StringsKt.M(str2, "file:/"));
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
                return Unit.f19194a;
            default:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList8 = new ArrayList();
                for (Game game : list) {
                    if (game != null) {
                        try {
                            score = game.m94getHomeTeam().getScore();
                            name = game.m94getHomeTeam().getName();
                            score2 = game.m93getGuestTeam().getScore();
                            name2 = game.m93getGuestTeam().getName();
                        } catch (Exception unused3) {
                        }
                        if (score != null && name != null && score2 != null && name2 != null) {
                            c0Var = new c0(name, String.valueOf(score.intValue()), game.m94getHomeTeam().getFlag(), name2, String.valueOf(score2.intValue()), game.m93getGuestTeam().getFlag(), score2.intValue() < score.intValue() ? 1 : score2.intValue() > score.intValue() ? 2 : 0);
                            if (c0Var == null) {
                                arrayList8.add(c0Var);
                            }
                        }
                    }
                    c0Var = null;
                    if (c0Var == null) {
                    }
                }
                return arrayList8;
        }
    }
}
