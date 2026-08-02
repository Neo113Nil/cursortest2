package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.player.EditPlayerDialog;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fa(wo3 wo3Var, idk idkVar, yda ydaVar, qvg qvgVar) {
        this.a = 12;
        this.b = wo3Var;
        this.c = ydaVar;
        this.d = qvgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07fc  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zk9 zk9Var;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        db2 db2Var;
        InputStream inputStream;
        String str;
        float f;
        Integer M;
        Integer M2;
        int i = this.a;
        int i2 = 4;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                u6b u6bVar = (u6b) obj4;
                ga gaVar = new ga((Function1) obj3, i5);
                u6bVar.getLifecycle().a(gaVar);
                return new ha(i5, (Function0) obj2, u6bVar, gaVar);
            case 1:
                vj vjVar = (vj) obj4;
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) obj3;
                gv9 a = sld.a(vjVar.i(), oddsCountryProvider, (List) obj2);
                OddsProvider provider = oddsCountryProvider.getProvider();
                provider.getClass();
                yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
                String defaultBetSlipLink = oddsCountryProvider.getDefaultBetSlipLink();
                if (defaultBetSlipLink == null) {
                    defaultBetSlipLink = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
                }
                return new unb(new uj(a, new old(yldVar, defaultBetSlipLink, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink()), vjVar.m));
            case 2:
                uv uvVar = (uv) obj4;
                String str2 = (String) obj3;
                a7b a7bVar = (a7b) obj;
                a7bVar.getClass();
                uvVar.getClass();
                uvVar.b.add(new rtg(str2, (su) obj2, SystemClock.elapsedRealtime()));
                return new ov(a7bVar, uvVar, str2, i5);
            case 3:
                List list = (List) obj4;
                String str3 = (String) obj3;
                Function0 function0 = (Function0) obj2;
                if (((Boolean) obj).booleanValue() && !list.contains(str3)) {
                    function0.invoke();
                    list.add(str3);
                }
                return Unit.a;
            case 4:
                CoroutineContext coroutineContext = (CoroutineContext) obj4;
                zj9 zj9Var = (zj9) obj3;
                lu8 lu8Var = (lu8) obj2;
                HttpURLConnection httpURLConnection = (HttpURLConnection) obj;
                httpURLConnection.getClass();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                if (responseMessage != null) {
                    zk9Var = new zk9(responseCode, responseMessage);
                } else {
                    zk9 zk9Var2 = (zk9) zk9.p.get(Integer.valueOf(responseCode));
                    if (zk9Var2 == null) {
                        zk9Var2 = new zk9(responseCode, "Unknown Status Code");
                    }
                    zk9Var = zk9Var2;
                }
                zk9 zk9Var3 = zk9Var;
                coroutineContext.getClass();
                if (b.j(Integer.valueOf(zk9.h.a), Integer.valueOf(zk9.d.a)).contains(Integer.valueOf(responseCode))) {
                    db2.a.getClass();
                    db2Var = cb2.b;
                } else {
                    try {
                        inputStream = httpURLConnection.getInputStream();
                    } catch (IOException unused) {
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        if (errorStream != null) {
                            if (errorStream instanceof BufferedInputStream) {
                                bufferedInputStream2 = (BufferedInputStream) errorStream;
                            } else {
                                bufferedInputStream = new BufferedInputStream(errorStream, 8192);
                            }
                        }
                    }
                    if (inputStream != null) {
                        if (inputStream instanceof BufferedInputStream) {
                            bufferedInputStream2 = (BufferedInputStream) inputStream;
                            if (bufferedInputStream2 != null) {
                                fa2.a.getClass();
                                db2Var = new snf(new n4a(bufferedInputStream2), coroutineContext);
                            } else {
                                db2.a.getClass();
                                db2Var = cb2.b;
                            }
                        } else {
                            bufferedInputStream = new BufferedInputStream(inputStream, 8192);
                            bufferedInputStream2 = bufferedInputStream;
                            if (bufferedInputStream2 != null) {
                            }
                        }
                    }
                    bufferedInputStream2 = null;
                    if (bufferedInputStream2 != null) {
                    }
                }
                db2 db2Var2 = db2Var;
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                headerFields.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(headerFields.size()));
                Iterator<T> it = headerFields.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str4 = (String) entry.getKey();
                    if (str4 != null) {
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        str = str4.toLowerCase(locale);
                        str.getClass();
                    } else {
                        str = "";
                    }
                    linkedHashMap.put(str, entry.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!StringsKt.R((CharSequence) entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                w89 w89Var = new w89(linkedHashMap2);
                if (zj9Var.f.d(ak9.a) == null) {
                    return new jk9(zk9Var3, lu8Var, w89Var, qj9.d, db2Var2, coroutineContext);
                }
                pvd.j();
                return null;
            case 5:
                gv9<ol1> gv9Var = (gv9) obj3;
                wb wbVar = (wb) obj2;
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                float f3 = ((tb) obj4).b;
                ((hpo) ha5Var.L0().a).y(f3, f3, f3, f3);
                try {
                    for (ol1 ol1Var : gv9Var) {
                        gv9 gv9Var2 = ol1Var.b;
                        int i6 = ol1Var.c;
                        float f4 = ol1Var.d ? 1.0f : 0.1f;
                        wbVar.getClass();
                        gv9Var2.getClass();
                        Iterator<E> it2 = gv9Var2.iterator();
                        while (it2.hasNext()) {
                            int i7 = i6;
                            wbVar.a(ha5Var, ((dnd) it2.next()).a, i7, f4);
                            i6 = i7;
                        }
                    }
                    float f5 = -f3;
                    ((hpo) ha5Var.L0().a).y(f5, f5, f5, f5);
                    return Unit.a;
                } catch (Throwable th) {
                    float f6 = -f3;
                    ((hpo) ha5Var.L0().a).y(f6, f6, f6, f6);
                    throw th;
                }
            case 6:
                fk1 fk1Var = (fk1) obj4;
                Function1 function1 = (Function1) obj3;
                e1d e1dVar = (e1d) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esa.b(esaVar, "pickerRow", new tc3(-1288842177, new rsh(i4, fk1Var, function1), true), 2);
                vl1 vl1Var = fk1Var.h;
                if (vl1Var != null) {
                    esa.d(esaVar, "chart", null, new tc3(2104796674, new d67(i2, (Object) vl1Var, (Object) e1dVar, function1), true), 2);
                }
                gv9<Pair> gv9Var3 = fk1Var.f;
                if (gv9Var3 != null) {
                    for (Pair pair : gv9Var3) {
                        vj1 vj1Var = (vj1) pair.a;
                        gv9 gv9Var4 = (gv9) pair.b;
                        int i8 = 13;
                        esa.d(esaVar, fk1Var.e + "-" + vj1Var.name(), null, new tc3(1206636578, new kr1(vj1Var, i8), true), 2);
                        esa.e(esaVar, gv9Var4.size(), new s1(i8, fk1Var, gv9Var4), null, new tc3(-291726279, new zj1(i5, gv9Var4), true), 4);
                    }
                }
                return Unit.a;
            case 7:
                return fk1.a((fk1) obj, (gv9) obj4, (am1) obj3, (Season.SubSeasonType) obj2, null, null, null, true, null, 184);
            case 8:
                Function1 function12 = (Function1) obj3;
                e1d e1dVar2 = (e1d) obj2;
                wcj wcjVar = (wcj) obj;
                ((e1d) obj4).setValue(wcjVar);
                boolean c = Intrinsics.c((String) e1dVar2.getValue(), wcjVar.a.b);
                q80 q80Var = wcjVar.a;
                e1dVar2.setValue(q80Var.b);
                if (!c) {
                    function12.invoke(q80Var.b);
                }
                return Unit.a;
            case 9:
                j4 j4Var = new j4(26, (ku3) obj3, (ykj) obj2);
                KProperty[] kPropertyArr = y3h.a;
                ((b4h) obj).a(k3h.c, new m9((String) obj4, j4Var));
                return Unit.a;
            case 10:
                ComparisonSeasonInfo comparisonSeasonInfo = (ComparisonSeasonInfo) obj;
                comparisonSeasonInfo.getClass();
                ((pyg) obj4).z(new kxg((e93) obj3, comparisonSeasonInfo));
                ((Function0) obj2).invoke();
                return Unit.a;
            case 11:
                koh kohVar = (koh) obj2;
                Function1 function13 = (Function1) obj3;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                for (m93 m93Var : (gv9) obj4) {
                    boolean c2 = Intrinsics.c((Boolean) kohVar.get(m93Var.a), Boolean.TRUE);
                    esa.d(esaVar2, "tournament_" + m93Var.a, null, new tc3(-899982893, new a93(m93Var, c2, function13, kohVar, 0), true), 2);
                    if (c2 && !m93Var.d) {
                        gv9 gv9Var5 = m93Var.c;
                        esaVar2.a(gv9Var5.size(), new zi(7, new ox1(m93Var, 22), gv9Var5), new uk1(1, gv9Var5), new tc3(802480018, new d93(gv9Var5, gv9Var5, function13, i5), true));
                    }
                }
                return Unit.a;
            case 12:
                wo3 wo3Var = (wo3) obj4;
                yda ydaVar = (yda) obj3;
                qvg qvgVar = (qvg) obj2;
                float floatValue = ((Float) obj).floatValue();
                f = wo3Var.q ? 1.0f : -1.0f;
                svg svgVar = wo3Var.p;
                long e = svgVar.e(svgVar.h(f * floatValue));
                svg svgVar2 = qvgVar.a;
                float g = svgVar.g(svgVar.e(svgVar2.c(svgVar2.k, e, 1))) * f;
                if (Math.abs(g) < Math.abs(floatValue)) {
                    bea.o(ydaVar, "Scroll animation cancelled because scroll was not consumed (" + g + " < " + floatValue + ')', null);
                }
                return Unit.a;
            case 13:
                q5b q5bVar = (q5b) obj4;
                wcj wcjVar2 = (wcj) obj3;
                nnd nndVar = (nnd) obj2;
                ha5 ha5Var2 = (ha5) obj;
                bej d = q5bVar.d();
                if (d != null) {
                    uj2 t = ha5Var2.L0().t();
                    long j = ((pej) ((eoh) q5bVar.A).getValue()).a;
                    long j2 = ((pej) ((eoh) q5bVar.B).getValue()).a;
                    aej aejVar = d.a;
                    gtj gtjVar = q5bVar.y;
                    long j3 = q5bVar.z;
                    if (!pej.d(j)) {
                        gtjVar.v(j3);
                        int v = nndVar.v(pej.g(j));
                        int v2 = nndVar.v(pej.f(j));
                        if (v != v2) {
                            t.b(aejVar.j(v, v2), gtjVar);
                        }
                    } else if (!pej.d(j2)) {
                        long c3 = aejVar.a.b.c();
                        r13 r13Var = c3 != 16 ? new r13(c3) : null;
                        long j4 = r13Var != null ? r13Var.a : r13.b;
                        gtjVar.v(r13.c(j4, r13.d(j4) * 0.2f));
                        int v3 = nndVar.v(pej.g(j2));
                        int v4 = nndVar.v(pej.f(j2));
                        if (v3 != v4) {
                            t.b(aejVar.j(v3, v4), gtjVar);
                        }
                    } else if (!pej.d(wcjVar2.b)) {
                        gtjVar.v(j3);
                        long j5 = wcjVar2.b;
                        int v5 = nndVar.v(pej.g(j5));
                        int v6 = nndVar.v(pej.f(j5));
                        if (v5 != v6) {
                            t.b(aejVar.j(v5, v6), gtjVar);
                        }
                    }
                    f6a.w(t, aejVar);
                }
                return Unit.a;
            case 14:
                Context context = (Context) obj4;
                ku3 ku3Var = (ku3) obj3;
                String str5 = (String) obj2;
                ((o55) obj).getClass();
                String b = ba4.b(context);
                if (b == null) {
                    return new o20(2);
                }
                ca4 ca4Var = new ca4(ku3Var, str5);
                try {
                    ba4.a(context, b, ca4Var);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused2) {
                }
                return new vx0(i4, context, ca4Var);
            case 15:
                return xw3.t((ku3) obj4, null, new ok0((ai4) obj3, ((Integer) obj).intValue(), (String) obj2, (rq3) null, 5), 3);
            case 16:
                csf csfVar = (csf) obj4;
                b80 b80Var = (b80) obj;
                float floatValue2 = ((Number) ((eoh) b80Var.e).getValue()).floatValue() - csfVar.a;
                float a2 = ((oug) obj3).a(floatValue2);
                csfVar.a = ((Number) ((eoh) b80Var.e).getValue()).floatValue();
                ((csf) obj2).a = ((Number) b80Var.b()).floatValue();
                if (Math.abs(floatValue2 - a2) > 0.5f) {
                    b80Var.a();
                }
                return Unit.a;
            case 17:
                Context context2 = (Context) obj3;
                r8j r8jVar = (r8j) obj2;
                iq3 iq3Var = (iq3) obj;
                List list2 = ((f8j) obj4).a;
                int size = list2.size();
                while (i5 < size) {
                    e8j e8jVar = (e8j) list2.get(i5);
                    if (e8jVar instanceof m8j) {
                        m8j m8jVar = (m8j) e8jVar;
                        iq3.b(iq3Var, new fv2(m8jVar, 8), m8jVar.c == 0 ? null : new tc3(-1930700965, new g31(m8jVar, i3), true), new h84(i2, m8jVar, r8jVar), 6);
                    } else if (e8jVar instanceof s8j) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            tla.i(iq3Var, context2, (s8j) e8jVar);
                        }
                    } else if (e8jVar instanceof q8j) {
                        iq3Var.a.add(lz.d);
                    }
                    i5++;
                }
                return Unit.a;
            case 18:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj4;
                d6d d6dVar = (d6d) obj3;
                snapshotStateList.add(d6dVar);
                return new ha(i3, (y15) obj2, d6dVar, snapshotStateList);
            case 19:
                s95 s95Var = (s95) obj3;
                qhe qheVar = (qhe) obj2;
                phe pheVar = (phe) obj;
                boolean W = ((m1c) obj4).W();
                dx dxVar = s95Var.o;
                float d2 = W ? dxVar.g().d(((ay4) s95Var.o.e).getValue()) : dxVar.k();
                ewd ewdVar = s95Var.q;
                float f7 = ewdVar == ewd.b ? d2 : 0.0f;
                if (ewdVar == ewd.a) {
                    f2 = d2;
                }
                pheVar.a = true;
                pheVar.e(qheVar, wzb.b(f7), wzb.b(f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Unit unit = Unit.a;
                pheVar.a = false;
                return Unit.a;
            case 20:
                t95 t95Var = (t95) obj3;
                qhe qheVar2 = (qhe) obj2;
                phe pheVar2 = (phe) obj;
                boolean W2 = ((m1c) obj4).W();
                dx dxVar2 = t95Var.o;
                float c4 = W2 ? dxVar2.f().c(((ay4) t95Var.o.e).getValue()) : dxVar2.k();
                f = (c6o.c0(t95Var).z == ema.b && t95Var.q == ewd.b) ? -1.0f : 1.0f;
                ewd ewdVar2 = t95Var.q;
                float f8 = ewdVar2 == ewd.b ? f * c4 : 0.0f;
                if (ewdVar2 == ewd.a) {
                    f2 = c4;
                }
                pheVar2.a = true;
                pheVar2.e(qheVar2, wzb.b(f8), wzb.b(f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Unit unit2 = Unit.a;
                pheVar2.a = false;
                return Unit.a;
            case 21:
                Calendar calendar = (Calendar) obj4;
                Long l = (Long) obj;
                l.getClass();
                calendar.setTimeInMillis(l.longValue());
                long timeInMillis = calendar.getTimeInMillis() / 1000;
                ((EditPlayerDialog) obj3).v().q = Long.valueOf(timeInMillis);
                bi4 bi4Var = bi4.PATTERN_DMY;
                Locale d3 = dla.d();
                ZoneId of = ZoneId.of("GMT");
                of.getClass();
                ((j15) obj2).b.setText(fc6.i(timeInMillis, DateTimeFormatter.ofPattern(bi4Var.d(), d3).withZone(of).withDecimalStyle(DecimalStyle.of(d3))));
                return Unit.a;
            case 22:
                Function1 function14 = (Function1) obj3;
                Activity activity = (Activity) obj4;
                xs5 xs5Var = (xs5) obj2;
                sr5 sr5Var = (sr5) obj;
                sr5Var.getClass();
                if (sr5Var instanceof pr5) {
                    function14.invoke(((pr5) sr5Var).a);
                } else if (!(sr5Var instanceof rr5)) {
                    xs5Var.getClass();
                    if (sr5Var instanceof qr5) {
                        ynb.m(xs5Var, new ej(xs5Var, null, 3));
                    }
                } else if (activity != null) {
                    int i9 = UpgradeSofascoreActivity.M;
                    e2f.k(activity, false);
                }
                return Unit.a;
            case 23:
                boh bohVar = (boh) obj3;
                e1d e1dVar3 = (e1d) obj2;
                jm jmVar = (jm) obj;
                jmVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                nv.L((Context) obj4, "ai_insights", currentTimeMillis - bohVar.h(), ((jm) e1dVar3.getValue()).b);
                bohVar.i(currentTimeMillis);
                e1dVar3.setValue(jmVar);
                return Unit.a;
            case 24:
                ov5 ov5Var = (ov5) obj3;
                fv5 fv5Var = (fv5) obj2;
                fv5 fv5Var2 = (fv5) obj;
                fv5Var2.getClass();
                TeamSelection teamSelection = ((jt5) ((lt5) obj4)).a;
                return fv5.a(fv5Var2, teamSelection, false, n4o.Q(ov5Var.u(teamSelection), fv5Var.e, fv5Var.c), n4o.N(teamSelection, ov5Var.p, ov5Var.q), null, 78);
            case 25:
                TypeHeaderView typeHeaderView = (TypeHeaderView) obj3;
                EventCommentaryFragment eventCommentaryFragment = (EventCommentaryFragment) obj2;
                String str6 = (String) obj;
                str6.getClass();
                for (ew5 ew5Var : (List) obj4) {
                    if (ew5Var.getKey().equals(str6)) {
                        Context context3 = typeHeaderView.getContext();
                        context3.getClass();
                        return ew5Var.b(context3, ok3.s(eventCommentaryFragment.E()));
                    }
                }
                ogj.m("Collection contains no element matching the predicate.");
                return null;
            case 26:
                fz9 fz9Var = (fz9) obj4;
                EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) obj3;
                ii6 ii6Var = (ii6) obj2;
                ((View) obj).getClass();
                if (!fz9Var.j && eventDetailsFragment.getContext() != null && (M = z8e.M(ii6Var.i, new kz3(fz9Var, 24))) != null) {
                    eventDetailsFragment.K().setTargetPosition(M.intValue() + ii6Var.g.size());
                    krk krkVar = eventDetailsFragment.l;
                    krkVar.getClass();
                    n layoutManager = ((hy4) krkVar).b.getLayoutManager();
                    layoutManager.getClass();
                    ((LinearLayoutManager) layoutManager).startSmoothScroll(eventDetailsFragment.K());
                }
                return Unit.a;
            case 27:
                aze azeVar = (aze) obj4;
                EventDetailsFragment eventDetailsFragment2 = (EventDetailsFragment) obj3;
                wye wyeVar = (wye) obj2;
                ((View) obj).getClass();
                if (!azeVar.d && eventDetailsFragment2.getContext() != null && (M2 = z8e.M(wyeVar.i, new kz3(azeVar, 25))) != null) {
                    eventDetailsFragment2.K().setTargetPosition(M2.intValue() + wyeVar.g.size());
                    krk krkVar2 = eventDetailsFragment2.l;
                    krkVar2.getClass();
                    n layoutManager2 = ((hy4) krkVar2).b.getLayoutManager();
                    layoutManager2.getClass();
                    ((LinearLayoutManager) layoutManager2).startSmoothScroll(eventDetailsFragment2.K());
                }
                return Unit.a;
            case 28:
                esf esfVar = (esf) obj4;
                a7b a7bVar2 = (a7b) obj;
                a7bVar2.getClass();
                esfVar.a = yaa.v();
                return new e06(a7bVar2, (Context) obj3, esfVar, (bnf) obj2, 0);
            default:
                gv9 gv9Var6 = (gv9) obj4;
                gv9 gv9Var7 = (gv9) obj3;
                OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) obj2;
                oddsCountryProvider2.getClass();
                OddsProvider provider2 = oddsCountryProvider2.getProvider();
                provider2.getClass();
                yld yldVar2 = new yld(provider2.getId(), provider2.getColors(), provider2.getSlug());
                String defaultBetSlipLink2 = oddsCountryProvider2.getDefaultBetSlipLink();
                if (defaultBetSlipLink2 == null) {
                    defaultBetSlipLink2 = oddsCountryProvider2.getProvider().getDefaultBetSlipLink();
                }
                return new unb(new zpf(gv9Var6, gv9Var7, new old(yldVar2, defaultBetSlipLink2, oddsCountryProvider2.getBranded(), oddsCountryProvider2.getOddsOffset(), oddsCountryProvider2.getOddsMayDiffer(), oddsCountryProvider2.getType(), oddsCountryProvider2.getSignupLink())));
        }
    }

    public /* synthetic */ fa(int i, Object obj, Object obj2, Function1 function1) {
        this.a = i;
        this.c = function1;
        this.b = obj;
        this.d = obj2;
    }

    public /* synthetic */ fa(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ fa(gv9 gv9Var, koh kohVar, Function1 function1) {
        this.a = 11;
        this.b = gv9Var;
        this.d = kohVar;
        this.c = function1;
    }

    public /* synthetic */ fa(csf csfVar, oug ougVar, csf csfVar2, jp4 jp4Var) {
        this.a = 16;
        this.b = csfVar;
        this.c = ougVar;
        this.d = csfVar2;
    }

    public /* synthetic */ fa(CoroutineContext coroutineContext, zj9 zj9Var, swd swdVar, lu8 lu8Var) {
        this.a = 4;
        this.b = coroutineContext;
        this.c = zj9Var;
        this.d = lu8Var;
    }
}
