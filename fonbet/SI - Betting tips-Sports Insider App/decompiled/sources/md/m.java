package md;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import eg.c0;
import eg.m0;
import eg.y;
import gf.t;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a0;
import kotlin.collections.e0;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.collections.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import la.j1;
import m2.f0;
import q4.r;
import rc.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static long f20571d;

    /* renamed from: a, reason: collision with root package name */
    public final t f20572a = gf.k.b(new id.a(15));

    /* renamed from: b, reason: collision with root package name */
    public final t f20573b = gf.k.b(new id.a(16));

    /* renamed from: c, reason: collision with root package name */
    public final y f20574c = new y("SupportUseCase");

    public static final Object a(m mVar, je.a aVar) {
        String f6 = mVar.f(R.string.FrequentlyAskedQuestions);
        List f10 = u.f(new lc.b(500, mVar.f(R.string.QuestionHowDoIPlaceABet), "how_place_bet"), new lc.b(501, mVar.f(R.string.QuestionHowDoIOpenAPremiumForecast), "premium_prediction"), new lc.b(502, mVar.f(R.string.QuestionHowDoIOpenAExpressForecast), "express_prediction"), new lc.b(503, mVar.f(R.string.QuestionHowToViewTheLiveForecast), "subs_live_prediction"), new lc.b(504, mVar.f(R.string.QuestionHowDoISubscribe), "how_to_pay"), new lc.b(505, mVar.f(R.string.recommendation_how_to_register_in_bookmaker_office), "how_register_bk"), new lc.b(506, mVar.f(R.string.QuestionWhatStrategyShouldIUse), "Responsible"), new lc.b(507, mVar.f(R.string.how_delete_account), "how_logout_oauth"));
        lg.e eVar = m0.f9201a;
        Object A = c0.A(lg.d.f20063c, new f0(mVar, f6, f10, (Continuation) null, 2), aVar);
        lf.a aVar2 = lf.a.f20034a;
        if (A != aVar2) {
            A = Unit.f19194a;
        }
        return A == aVar2 ? A : Unit.f19194a;
    }

    public static final void b(m mVar, String str) {
        z.a((z) mVar.f20573b.getValue(), str);
    }

    public static final String c(m mVar) {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Tahmin akışını yenileyin ve tekrar deneyin" : "Refresh the forecast feed and try again" : !c2.equals("ru") ? "Refresh the forecast feed and try again" : "Обновите ленту прогнозов и повторите попытку" : !c2.equals("pt") ? "Refresh the forecast feed and try again" : "Atualize o feed de previsões e tente novamente" : !c2.equals("fr") ? "Refresh the forecast feed and try again" : "Actualisez le flux de prévisions et réessayez" : !c2.equals("es") ? "Refresh the forecast feed and try again" : "Actualiza el feed de pronósticos e inténtalo de nuevo" : !c2.equals("de") ? "Refresh the forecast feed and try again" : "Aktualisieren Sie den Prognose-Feed und versuchen Sie es erneut";
    }

    public static final String d(m mVar) {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Push bildirimi testi başarıyla tamamlandı" : "Push notification test was successful" : !c2.equals("ru") ? "Push notification test was successful" : "Тест Push-уведомления прошел успешно" : !c2.equals("pt") ? "Push notification test was successful" : "O teste de notificação push foi bem-sucedido" : !c2.equals("fr") ? "Push notification test was successful" : "Le test de notification push a réussi" : !c2.equals("es") ? "Push notification test was successful" : "La prueba de notificación push se realizó correctamente" : !c2.equals("de") ? "Push notification test was successful" : "Push-Benachrichtigungstest war erfolgreich";
    }

    public static j1 g() {
        return (j1) y3.m(j1.class, null, 6);
    }

    public static List h(List list) {
        if (list == null || list.isEmpty()) {
            return e0.f19204a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = a0.v(list).iterator();
        lc.a aVar = null;
        while (true) {
            ListIterator listIterator = ((s0) it).f19217a;
            if (!listIterator.hasPrevious()) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                return CollectionsKt.W(new r0(arrayList));
            }
            ka.a aVar2 = (ka.a) listIterator.previous();
            String date = LocalDateTime.ofInstant(Instant.ofEpochSecond(aVar2.f18947c), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd MMM yy"));
            Intrinsics.checkNotNullExpressionValue(date, "format(...)");
            Intrinsics.checkNotNullParameter(date, "date");
            lc.a aVar3 = new lc.a();
            aVar3.f19667a = date;
            if (!Intrinsics.areEqual(date, aVar != null ? aVar.f19667a : null)) {
                arrayList.add(aVar3);
                aVar = aVar3;
            }
            arrayList.add(aVar2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, mf.c cVar) {
        g gVar;
        int i5;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f20546c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f20546c = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f20544a;
                lf.a aVar = lf.a.f20034a;
                i5 = gVar.f20546c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    j1 g10 = g();
                    gVar.f20546c = 1;
                    g10.getClass();
                    fb.b bVar = new fb.b();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new qb.a(bVar, str, str2, str3, (Continuation) null), gVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                long j = ((Number) obj).longValue();
                return new Long(j);
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f20544a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = gVar.f20546c;
        if (i5 != 0) {
        }
        long j6 = ((Number) obj2).longValue();
        return new Long(j6);
    }

    public final String f(int i5) {
        ((zc.k) this.f20572a.getValue()).getClass();
        return zc.k.h(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i5, mf.c cVar) {
        h hVar;
        int i10;
        m mVar;
        m mVar2;
        List list;
        try {
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i11 = hVar.f20551e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    hVar.f20551e = i11 - Integer.MIN_VALUE;
                    Object obj = hVar.f20549c;
                    lf.a aVar = lf.a.f20034a;
                    i10 = hVar.f20551e;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        hVar.f20547a = this;
                        hVar.f20548b = this;
                        hVar.f20551e = 1;
                        obj = j(i5, hVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        mVar = this;
                        mVar2 = mVar;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar = hVar.f20548b;
                        mVar2 = hVar.f20547a;
                        h8.b.B(obj);
                    }
                    list = (List) obj;
                    mVar.getClass();
                    if (list != null && !list.isEmpty()) {
                        list = CollectionsKt.X(list);
                        kotlin.collections.y.m(list, new androidx.coordinatorlayout.widget.i(11));
                    }
                    mVar2.getClass();
                    return h(list);
                }
            }
            if (i10 != 0) {
            }
            list = (List) obj;
            mVar.getClass();
            if (list != null) {
                list = CollectionsKt.X(list);
                kotlin.collections.y.m(list, new androidx.coordinatorlayout.widget.i(11));
            }
            mVar2.getClass();
            return h(list);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new r(ex, null, 18), 2);
            return e0.f19204a;
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f20549c;
        lf.a aVar2 = lf.a.f20034a;
        i10 = hVar.f20551e;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(int i5, mf.c cVar) {
        k kVar;
        int i10;
        try {
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i11 = kVar.f20561c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    kVar.f20561c = i11 - Integer.MIN_VALUE;
                    Object obj = kVar.f20559a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = kVar.f20561c;
                    Continuation continuation = null;
                    int i12 = 1;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        j1 g10 = g();
                        kVar.f20561c = 1;
                        g10.getClass();
                        fb.b bVar = new fb.b();
                        lg.e eVar = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new qb.b(bVar, i5, continuation, i12), kVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (List) obj;
                }
            }
            if (i10 != 0) {
            }
            return (List) obj;
        } catch (Exception unused) {
            return null;
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f20559a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = kVar.f20561c;
        Continuation continuation2 = null;
        int i122 = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        if (r0 == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(int i5, String str, String str2, String str3, int i10, String str4, mf.c cVar) {
        l lVar;
        Object obj;
        int i11;
        int i12;
        String str5;
        String str6;
        String str7;
        int i13;
        String str8;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f20570i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f20570i = i14 - Integer.MIN_VALUE;
                obj = lVar.f20568g;
                lf.a aVar = lf.a.f20034a;
                i11 = lVar.f20570i;
                Continuation continuation = null;
                if (i11 != 0) {
                    h8.b.B(obj);
                    m3.f fVar = new m3.f(17);
                    lVar.f20564c = str;
                    lVar.f20565d = str2;
                    lVar.f20566e = str3;
                    lVar.f20567f = str4;
                    i12 = i5;
                    lVar.f20562a = i12;
                    lVar.f20563b = i10;
                    lVar.f20570i = 1;
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new hd.a(str4, fVar, continuation, 0), lVar);
                    if (obj != aVar) {
                        str5 = str4;
                        str6 = str2;
                        str7 = str3;
                        i13 = i10;
                        str8 = str;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                int i15 = lVar.f20563b;
                int i16 = lVar.f20562a;
                String str9 = lVar.f20567f;
                String str10 = lVar.f20566e;
                String str11 = lVar.f20565d;
                String str12 = lVar.f20564c;
                h8.b.B(obj);
                i13 = i15;
                str5 = str9;
                str7 = str10;
                str6 = str11;
                str8 = str12;
                i12 = i16;
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f19194a;
                }
                j1 g10 = g();
                lVar.f20564c = null;
                lVar.f20565d = null;
                lVar.f20566e = null;
                lVar.f20567f = null;
                lVar.f20562a = i12;
                lVar.f20563b = i13;
                lVar.f20570i = 2;
                g10.getClass();
                fb.b bVar = new fb.b();
                lg.e eVar2 = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new la.e(bVar, i12, str8, str6, str7, i13, str5, (Continuation) null), lVar);
                if (A != aVar) {
                    A = Unit.f19194a;
                }
                if (A != aVar) {
                    A = Unit.f19194a;
                }
            }
        }
        lVar = new l(this, cVar);
        obj = lVar.f20568g;
        lf.a aVar2 = lf.a.f20034a;
        i11 = lVar.f20570i;
        Continuation continuation2 = null;
        if (i11 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final boolean l() {
        if (Instant.now().getEpochSecond() <= f20571d + 5) {
            return false;
        }
        f20571d = Instant.now().getEpochSecond();
        c0.t(MyApp.f6830c, this.f20574c, null, new j(this, null), 2);
        return true;
    }
}
