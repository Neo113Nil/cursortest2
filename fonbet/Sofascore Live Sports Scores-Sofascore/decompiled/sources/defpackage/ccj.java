package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.d0;
import com.moloco.sdk.internal.ortb.model.h;
import com.moloco.sdk.internal.ortb.model.q;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.a0;
import com.moloco.sdk.internal.publisher.c0;
import com.moloco.sdk.internal.publisher.h1;
import com.moloco.sdk.internal.publisher.nativead.n;
import com.moloco.sdk.internal.services.e;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.unity3d.services.UnityAdsConstants;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ccj extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ccj(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                ccj ccjVar = new ccj((lcj) obj3, (qze) obj2, rq3Var, 0);
                ccjVar.s = obj;
                return ccjVar;
            case 1:
                return new ccj((Bitmap) this.s, (Bitmap) obj3, (hkj) obj2, rq3Var, 1);
            case 2:
                ccj ccjVar2 = new ccj((rlk) obj3, (String) obj2, rq3Var, 2);
                ccjVar2.s = obj;
                return ccjVar2;
            case 3:
                return new ccj((List) this.s, (qkl) obj3, (Map) obj2, rq3Var, 3);
            case 4:
                return new ccj((a0) this.s, (c0) obj3, (y) obj2, rq3Var, 4);
            case 5:
                return new ccj((h1) this.s, (d0) obj3, (h) obj2, rq3Var, 5);
            case 6:
                return new ccj(this.s, (e) obj3, (String) obj2, rq3Var, 6);
            case 7:
                return new ccj((Context) this.s, (s) obj3, (String) obj2, rq3Var, 7);
            case 8:
                ccj ccjVar3 = new ccj((XmlPullParser) obj3, rq3Var, (fsf) obj2);
                ccjVar3.s = obj;
                return ccjVar3;
            default:
                ccj ccjVar4 = new ccj((m) obj3, (t) obj2, rq3Var, 9);
                ccjVar4.s = obj;
                return ccjVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((ccj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ccj) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        String str;
        RankingRow rankingRow;
        com.moloco.sdk.internal.ortb.model.a0 a0Var;
        Boolean bool;
        String str2;
        String text;
        int i = this.r;
        int i2 = 2;
        int i3 = 1;
        h hVar = 0;
        hVar = 0;
        Object obj2 = this.u;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                ku3 ku3Var = (ku3) this.s;
                nu3 nu3Var = nu3.d;
                lcj lcjVar = (lcj) obj3;
                qze qzeVar = (qze) obj2;
                xw3.L(ku3Var, null, nu3Var, new baj(lcjVar, qzeVar, hVar, i3), 1);
                xw3.L(ku3Var, null, nu3Var, new baj(lcjVar, qzeVar, hVar, i2), 1);
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj3;
                hkj hkjVar = (hkj) obj2;
                Context context = hkjVar.a;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                Bitmap bitmap2 = (Bitmap) this.s;
                if (bitmap2 != null && bitmap != null) {
                    int i4 = hkjVar.c;
                    Bitmap bitmap3 = hkg.c0(context) ? bitmap : bitmap2;
                    if (hkg.c0(context)) {
                        bitmap = bitmap2;
                    }
                    int i5 = hkjVar.b;
                    int i6 = hkjVar.d;
                    Bitmap z = oyn.z(bitmap3, 150);
                    Bitmap z2 = oyn.z(bitmap, 150);
                    double width = z.getWidth();
                    double d = i5;
                    double d2 = width / d;
                    double d3 = (i4 / 2) * d2;
                    double d4 = i6 * d2;
                    double d5 = (d3 + d4) - width;
                    double d6 = d3 - d4;
                    Bitmap createBitmap = Bitmap.createBitmap((int) (i4 * d2), (int) (d * d2), Bitmap.Config.ARGB_8888);
                    createBitmap.getClass();
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    canvas.drawBitmap(z2, (float) d6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                    canvas.drawBitmap(z, (float) d5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                    Bitmap j = kik.j(oyn.z(createBitmap, i4), 10);
                    j.getClass();
                    Bitmap j2 = kik.j(j, 10);
                    j2.getClass();
                    hkjVar.j = j2;
                }
                hkjVar.invalidateSelf();
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var2 = (ku3) this.s;
                rlk rlkVar = (rlk) obj3;
                String str3 = (String) obj2;
                rlkVar.c.getClass();
                str3.getClass();
                try {
                    p2g p2gVar = w2g.b;
                    qe2 createDataSource = ((pe2) plk.b.getValue()).createDataSource();
                    Map map = Collections.EMPTY_MAP;
                    Uri parse = Uri.parse(str3);
                    z1a.y(parse, "The uri must be set.");
                    new jf2(createDataSource, new xe4(parse, 0L, 1, null, map, 0L, -1L, null, 4)).a();
                    u2gVar = Unit.a;
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                Throwable a = w2g.a(u2gVar);
                if (a != null && !(a instanceof InterruptedIOException)) {
                    cjb.a("Unable to preload video");
                }
                if (s9a.w(ku3Var2) && rlkVar.m) {
                    ad2 ad2Var = rlkVar.h;
                    hs4 hs4Var = z45.a;
                    xw3.L(ad2Var, rob.a, null, new hje(rlkVar, hVar, 12), 2);
                }
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                List<StandingsTable> list = (List) this.s;
                qkl qklVar = (qkl) obj3;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                for (StandingsTable standingsTable : list) {
                    arrayList.add(new vt2(standingsTable.getName(), wba.w(standingsTable.getName()).b(qklVar.i()), false, null, null, null, null, 252));
                }
                gv9 W = l6g.W(arrayList);
                Map map2 = (Map) obj2;
                int c = sub.c(k13.r(list, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (StandingsTable standingsTable2 : list) {
                    String name = standingsTable2.getName();
                    List<StandingsTableRow> rows = standingsTable2.getRows();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : rows) {
                        if (hashSet.add(new Integer(((StandingsTableRow) obj4).getTeam().getId()))) {
                            arrayList2.add(obj4);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        StandingsTableRow standingsTableRow = (StandingsTableRow) it.next();
                        int id = standingsTableRow.getTeam().getId();
                        String p = tba.p(qklVar.i(), standingsTableRow.getTeam());
                        Integer num = (map2 == null || (rankingRow = (RankingRow) me4.f(standingsTableRow.getTeam().getId(), map2)) == null) ? null : new Integer(rankingRow.getPosition());
                        Country country = standingsTableRow.getTeam().getCountry();
                        if (country == null || (str = country.getAlpha2()) == null) {
                            str = "";
                        }
                        arrayList3.add(new zil(id, p, str, num));
                    }
                    linkedHashMap.put(name, l6g.W(arrayList3));
                }
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                a0 a0Var2 = (a0) this.s;
                a0Var2.k = true;
                c0 c0Var = (c0) obj3;
                y yVar = (y) obj2;
                MolocoAd createAdInfo = MolocoAdKt.createAdInfo(a0Var2.b, new Float(yVar.b), yVar.e);
                y a2 = a0.a(a0Var2.m);
                if (a2 != null && (a0Var = a2.d) != null) {
                    hVar = a0Var.d;
                }
                c0Var.c(createAdInfo, hVar);
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                ((c0) ((h1) this.s)).a((d0) obj3, (h) obj2);
                break;
            case 6:
                SharedPreferences sharedPreferences = ((e) obj3).a;
                String str4 = (String) obj2;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                Object obj5 = this.s;
                if (obj5 instanceof Integer) {
                    sharedPreferences.edit().putInt(str4, ((Number) obj5).intValue()).apply();
                } else if (obj5 instanceof String) {
                    sharedPreferences.edit().putString(str4, (String) obj5).apply();
                } else if (obj5 instanceof Float) {
                    sharedPreferences.edit().putFloat(str4, ((Number) obj5).floatValue()).apply();
                } else if (obj5 instanceof Boolean) {
                    sharedPreferences.edit().putBoolean(str4, ((Boolean) obj5).booleanValue()).apply();
                } else if (obj5 instanceof Double) {
                    sharedPreferences.edit().putString(str4, String.valueOf(((Number) obj5).doubleValue())).apply();
                } else if (obj5 instanceof Long) {
                    sharedPreferences.edit().putString(str4, String.valueOf(((Number) obj5).longValue())).apply();
                } else {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type: " + obj5 + " for key: " + str4, null, false, 12, null);
                }
                break;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                Context context2 = (Context) this.s;
                Intent intent = new Intent(context2, (Class<?>) VastActivity.class);
                s sVar = (s) obj3;
                String str5 = (String) obj2;
                boolean z3 = sVar.a;
                q qVar = sVar.i;
                com.moloco.sdk.internal.ortb.model.s sVar2 = sVar.j;
                intent.putExtra("START_MUTED", z3);
                intent.putExtra("CLOSE_DELAY_SECONDS", sVar.d);
                intent.putExtra("DEC_DELAY_SECONDS", sVar.e);
                Boolean bool2 = sVar.b;
                if (bool2 != null) {
                    intent.putExtra("SKIP_ENABLED", bool2.booleanValue());
                }
                intent.putExtra("SKIP_DELAY_SECONDS", sVar.c);
                intent.putExtra("AUTO_STORE_ON_SKIP", sVar.f);
                intent.putExtra("AUTO_STORE_ON_COMPLETE", sVar.g);
                if (qVar != null) {
                    intent.putExtra("ANDROID_INLINE_ENABLED", qVar.a);
                }
                if (qVar != null) {
                    String str6 = qVar.b;
                    str6.getClass();
                    intent.putExtra("ANDROID_INLINE_URL", str6);
                }
                if (sVar2 != null) {
                    intent.putExtra("ANDROID_AUTOINLINE_ENABLED", true);
                }
                if (sVar2 != null) {
                    intent.putExtra("ANDROID_AUTOINLINE_SKIP", sVar2.a);
                }
                if (sVar2 != null) {
                    String str7 = sVar2.b;
                    str7.getClass();
                    intent.putExtra("ANDROID_AUTOINLINE_EVENTLINK", str7);
                }
                if (sVar2 != null && (str2 = sVar2.c) != null) {
                    intent.putExtra("ANDROID_AUTOINLINE_CLICKTHROUGH", str2);
                }
                if (sVar2 != null && (bool = sVar2.d) != null) {
                    intent.putExtra("ANDROID_AUTOINLINE_FORCE_FULLSCREEN", bool.booleanValue());
                }
                if (str5 != null) {
                    intent.putExtra("BUNDLE_ID", str5);
                }
                intent.setFlags(268435456);
                context2.startActivity(intent);
                break;
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                s9a.t((ku3) this.s);
                XmlPullParser xmlPullParser = (XmlPullParser) obj3;
                if (d1.B(xmlPullParser)) {
                    xmlPullParser.nextTag();
                }
                if (xmlPullParser.getEventType() == 1) {
                    break;
                } else if (xmlPullParser.getEventType() == 2) {
                    int depth = xmlPullParser.getDepth();
                    while (xmlPullParser.getDepth() >= depth) {
                        int depth2 = xmlPullParser.getDepth() - depth;
                        if (depth2 != 0) {
                            if (depth2 == 1) {
                                d1.C(xmlPullParser);
                            }
                        } else if (xmlPullParser.getEventType() == 2) {
                            continue;
                        } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                            String text2 = xmlPullParser.getText();
                            text2.getClass();
                            ((fsf) obj2).a = StringsKt.l0(text2).toString();
                        } else if (xmlPullParser.getEventType() == 3) {
                            break;
                        }
                        xmlPullParser.next();
                    }
                    break;
                } else {
                    pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    break;
                }
            default:
                m mVar = (m) obj3;
                n nVar = mVar.b;
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e) this.s;
                if (eVar instanceof d) {
                    if (nVar != null) {
                        e0 e0Var = e0.Companion;
                        List list2 = (List) nVar.c;
                        if (list2 != null) {
                            ((f1) nVar.d).a(list2, e0Var, null, null);
                        }
                    }
                    mVar.f(new c(((d) eVar).a));
                } else if (eVar instanceof a) {
                    mVar.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a.a);
                } else if (eVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c) {
                    if (nVar != null) {
                        nVar.g();
                    }
                    mVar.f(b.a);
                } else if (!(eVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b)) {
                    zzl.b();
                    break;
                } else {
                    ((t) obj2).a.destroy();
                    Unit unit = Unit.a;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ccj(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccj(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar) {
        super(2, rq3Var);
        this.r = 8;
        this.t = xmlPullParser;
        this.u = fsfVar;
    }
}
