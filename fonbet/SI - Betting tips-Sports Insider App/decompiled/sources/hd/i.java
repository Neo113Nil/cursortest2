package hd;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import c0.x;
import com.sports.insider.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.z;
import md.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends x {

    /* renamed from: b, reason: collision with root package name */
    public final o f10546b = new o(4);

    /* renamed from: c, reason: collision with root package name */
    public final int f10547c = R.string.advanced_analytics_pass_80;

    /* renamed from: d, reason: collision with root package name */
    public final char f10548d = '%';

    /* renamed from: e, reason: collision with root package name */
    public final int f10549e = R.string.do_not_feed_breakfast;

    /* renamed from: f, reason: collision with root package name */
    public final int f10550f = R.string.risk_insurance_premium;

    /* renamed from: g, reason: collision with root package name */
    public final int f10551g = R.string.risk_insurance_express;

    /* renamed from: h, reason: collision with root package name */
    public final int f10552h = R.string.profit_premium;

    /* renamed from: i, reason: collision with root package name */
    public final int f10553i = R.string.profit_express;
    public final int j = R.string.subs_auto_renewed_cancel_it;

    /* renamed from: k, reason: collision with root package name */
    public final int f10554k = R.string.PurchasesTerms;

    /* renamed from: l, reason: collision with root package name */
    public final int f10555l = R.string.lk_store_desc;

    public static String l(double d10) {
        String format;
        if (d10 % ((int) d10) == 0.0d) {
            format = String.valueOf((long) d10);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        }
        return z.l(format.toString(), ',', '.', true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0106, code lost:
    
        if (r3 == r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013d, code lost:
    
        if (r3 == r5) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0342 A[Catch: Exception -> 0x0352, TRY_LEAVE, TryCatch #3 {Exception -> 0x0352, blocks: (B:20:0x033b, B:22:0x0342), top: B:19:0x033b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e A[Catch: Exception -> 0x01ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ae, blocks: (B:52:0x0197, B:54:0x019e), top: B:51:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(int i5, int i10, mf.c cVar) {
        h hVar;
        int i11;
        char c2;
        List arrayList;
        List arrayList2;
        StringBuilder sb2;
        StringBuilder sb3;
        String str;
        List list;
        SpannableString spannableString;
        boolean z5;
        SpannableString spannableString2;
        SpannableString spannableString3;
        int i12;
        int i13;
        List list2;
        SpannableString spannableString4;
        i iVar;
        List list3;
        List list4;
        SpannableString spannableString5;
        SpannableString spannableString6;
        i iVar2;
        int G;
        String l6;
        SpannableString spannableString7;
        List list5;
        String str2;
        SpannableString spannableString8;
        List list6;
        long longValue;
        SpannableString spannableString9;
        String str3;
        int G2;
        int i14 = i5;
        int i15 = i10;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i16 = hVar.f10545k;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                hVar.f10545k = i16 - Integer.MIN_VALUE;
                Object obj = hVar.f10544i;
                lf.a aVar = lf.a.f20034a;
                i11 = hVar.f10545k;
                char c8 = this.f10548d;
                o oVar = this.f10546b;
                switch (i11) {
                    case 0:
                        c2 = 0;
                        h8.b.B(obj);
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        if (i15 == 2) {
                            sb2 = new StringBuilder();
                            hVar.f10538c = arrayList;
                            hVar.f10539d = arrayList2;
                            hVar.f10540e = sb2;
                            hVar.f10536a = i14;
                            hVar.f10537b = i15;
                            hVar.f10545k = 1;
                            oVar.getClass();
                            o.c().getClass();
                            obj = za.h.a("rc_premium_passage", hVar);
                            break;
                        } else if (i15 == 3) {
                            sb3 = new StringBuilder();
                            hVar.f10538c = arrayList;
                            hVar.f10539d = arrayList2;
                            hVar.f10540e = sb3;
                            hVar.f10536a = i14;
                            hVar.f10537b = i15;
                            hVar.f10545k = 2;
                            oVar.getClass();
                            o.c().getClass();
                            obj = za.h.a("rc_express_passage", hVar);
                            break;
                        } else {
                            str = "{$}";
                            list = arrayList;
                            zc.k i17 = i();
                            Object[] objArr = new Object[1];
                            objArr[c2] = str;
                            i17.getClass();
                            String i18 = zc.k.i(this.f10547c, objArr);
                            i().getClass();
                            String h10 = zc.k.h(this.f10549e);
                            list.add(i18);
                            arrayList2.add(i18);
                            list.add(h10);
                            arrayList2.add(h10);
                            zc.k i19 = i();
                            int i20 = i15 == 2 ? this.f10550f : this.f10551g;
                            i19.getClass();
                            spannableString = new SpannableString(zc.k.h(i20));
                            z5 = c2;
                            try {
                                G = StringsKt.G(spannableString, "-", z5 ? 1 : 0, z5, 6);
                                if (G > -1) {
                                    i().getClass();
                                    spannableString.setSpan(zc.k.b(), z5 ? 1 : 0, G, 18);
                                }
                            } catch (Exception unused) {
                            }
                            list.add(spannableString);
                            i().getClass();
                            String h11 = zc.k.h(this.f10554k);
                            spannableString2 = new SpannableString(h11);
                            try {
                                spannableString2.setSpan(new UnderlineSpan(), 0, h11.length(), 18);
                            } catch (Exception unused2) {
                            }
                            i().getClass();
                            String h12 = zc.k.h(this.f10555l);
                            spannableString3 = new SpannableString(h12);
                            try {
                                spannableString3.setSpan(new UnderlineSpan(), 0, h12.length(), 18);
                            } catch (Exception unused3) {
                            }
                            if (i15 == 2) {
                                hVar.f10538c = list;
                                hVar.f10539d = arrayList2;
                                hVar.f10540e = null;
                                hVar.f10541f = spannableString2;
                                hVar.f10542g = spannableString3;
                                hVar.f10543h = this;
                                hVar.f10536a = i14;
                                hVar.f10537b = i15;
                                hVar.f10545k = 3;
                                oVar.getClass();
                                o.c().getClass();
                                obj = za.h.b().c("min_odds_premium", hVar);
                                if (obj != aVar) {
                                    int i21 = i15;
                                    i12 = i14;
                                    i13 = i21;
                                    list3 = list;
                                    list4 = arrayList2;
                                    spannableString5 = spannableString3;
                                    spannableString6 = spannableString2;
                                    iVar2 = this;
                                    double doubleValue = ((Number) obj).doubleValue();
                                    iVar2.getClass();
                                    l6 = l(doubleValue);
                                    spannableString7 = spannableString5;
                                    spannableString4 = spannableString6;
                                    list5 = list4;
                                    list = list3;
                                    if (i13 != 2) {
                                        hVar.f10538c = list;
                                        hVar.f10539d = list5;
                                        hVar.f10540e = null;
                                        hVar.f10541f = spannableString4;
                                        hVar.f10542g = spannableString7;
                                        hVar.f10543h = l6;
                                        hVar.f10536a = i12;
                                        hVar.f10537b = i13;
                                        hVar.f10545k = 5;
                                        oVar.getClass();
                                        o.c().getClass();
                                        Object a7 = za.h.a("rc_premium_min_count_week", hVar);
                                        if (a7 != aVar) {
                                            str2 = l6;
                                            obj = a7;
                                            spannableString8 = spannableString4;
                                            list6 = list;
                                            longValue = ((Number) obj).longValue();
                                            i().getClass();
                                            String d10 = ((za.i) zc.k.e()).d(R.plurals.prediction_plurals, (int) longValue);
                                            zc.k i22 = i();
                                            int i23 = i13 != 2 ? this.f10552h : this.f10553i;
                                            if (i12 <= 0) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(i12);
                                                sb4.append(c8);
                                                str3 = sb4.toString();
                                            } else {
                                                str3 = "";
                                            }
                                            Object[] objArr2 = {str3, str2, String.valueOf(longValue), d10};
                                            i22.getClass();
                                            spannableString9 = new SpannableString(zc.k.i(i23, objArr2));
                                            try {
                                                G2 = StringsKt.G(spannableString9, "-", 0, false, 6);
                                                if (G2 > -1) {
                                                    i().getClass();
                                                    spannableString9.setSpan(zc.k.b(), 0, G2, 18);
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            list5.add(spannableString9);
                                            i().getClass();
                                            String h13 = zc.k.h(this.j);
                                            list6.add(h13);
                                            list5.add(h13);
                                            list6.add(spannableString8);
                                            list5.add(spannableString8);
                                            list6.add(spannableString7);
                                            list5.add(spannableString7);
                                            return new Pair(list6, list5);
                                        }
                                    } else {
                                        hVar.f10538c = list;
                                        hVar.f10539d = list5;
                                        hVar.f10540e = null;
                                        hVar.f10541f = spannableString4;
                                        hVar.f10542g = spannableString7;
                                        hVar.f10543h = l6;
                                        hVar.f10536a = i12;
                                        hVar.f10537b = i13;
                                        hVar.f10545k = 6;
                                        oVar.getClass();
                                        o.c().getClass();
                                        Object a10 = za.h.a("rc_express_min_count_week", hVar);
                                        if (a10 != aVar) {
                                            str2 = l6;
                                            obj = a10;
                                            spannableString8 = spannableString4;
                                            list6 = list;
                                            longValue = ((Number) obj).longValue();
                                            i().getClass();
                                            String d102 = ((za.i) zc.k.e()).d(R.plurals.prediction_plurals, (int) longValue);
                                            zc.k i222 = i();
                                            if (i13 != 2) {
                                            }
                                            if (i12 <= 0) {
                                            }
                                            Object[] objArr22 = {str3, str2, String.valueOf(longValue), d102};
                                            i222.getClass();
                                            spannableString9 = new SpannableString(zc.k.i(i23, objArr22));
                                            G2 = StringsKt.G(spannableString9, "-", 0, false, 6);
                                            if (G2 > -1) {
                                            }
                                            list5.add(spannableString9);
                                            i().getClass();
                                            String h132 = zc.k.h(this.j);
                                            list6.add(h132);
                                            list5.add(h132);
                                            list6.add(spannableString8);
                                            list5.add(spannableString8);
                                            list6.add(spannableString7);
                                            list5.add(spannableString7);
                                            return new Pair(list6, list5);
                                        }
                                    }
                                }
                            } else {
                                hVar.f10538c = list;
                                hVar.f10539d = arrayList2;
                                hVar.f10540e = null;
                                hVar.f10541f = spannableString2;
                                hVar.f10542g = spannableString3;
                                hVar.f10543h = this;
                                hVar.f10536a = i14;
                                hVar.f10537b = i15;
                                hVar.f10545k = 4;
                                oVar.getClass();
                                o.c().getClass();
                                obj = za.h.b().c("min_odds_express", hVar);
                                if (obj != aVar) {
                                    int i24 = i15;
                                    i12 = i14;
                                    i13 = i24;
                                    list2 = arrayList2;
                                    spannableString4 = spannableString2;
                                    iVar = this;
                                    double doubleValue2 = ((Number) obj).doubleValue();
                                    iVar.getClass();
                                    l6 = l(doubleValue2);
                                    spannableString7 = spannableString3;
                                    list5 = list2;
                                    if (i13 != 2) {
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 1:
                        c2 = 0;
                        int i25 = hVar.f10537b;
                        int i26 = hVar.f10536a;
                        sb2 = hVar.f10540e;
                        arrayList2 = hVar.f10539d;
                        arrayList = hVar.f10538c;
                        h8.b.B(obj);
                        i15 = i25;
                        i14 = i26;
                        sb2.append(((Number) obj).longValue());
                        sb2.append(c8);
                        str = sb2.toString();
                        list = arrayList;
                        zc.k i172 = i();
                        Object[] objArr3 = new Object[1];
                        objArr3[c2] = str;
                        i172.getClass();
                        String i182 = zc.k.i(this.f10547c, objArr3);
                        i().getClass();
                        String h102 = zc.k.h(this.f10549e);
                        list.add(i182);
                        arrayList2.add(i182);
                        list.add(h102);
                        arrayList2.add(h102);
                        zc.k i192 = i();
                        if (i15 == 2) {
                        }
                        i192.getClass();
                        spannableString = new SpannableString(zc.k.h(i20));
                        z5 = c2;
                        G = StringsKt.G(spannableString, "-", z5 ? 1 : 0, z5, 6);
                        if (G > -1) {
                        }
                        list.add(spannableString);
                        i().getClass();
                        String h112 = zc.k.h(this.f10554k);
                        spannableString2 = new SpannableString(h112);
                        spannableString2.setSpan(new UnderlineSpan(), 0, h112.length(), 18);
                        i().getClass();
                        String h122 = zc.k.h(this.f10555l);
                        spannableString3 = new SpannableString(h122);
                        spannableString3.setSpan(new UnderlineSpan(), 0, h122.length(), 18);
                        if (i15 == 2) {
                        }
                        return aVar;
                    case 2:
                        c2 = 0;
                        int i27 = hVar.f10537b;
                        int i28 = hVar.f10536a;
                        sb3 = hVar.f10540e;
                        arrayList2 = hVar.f10539d;
                        arrayList = hVar.f10538c;
                        h8.b.B(obj);
                        i15 = i27;
                        i14 = i28;
                        sb3.append(((Number) obj).longValue());
                        sb3.append(c8);
                        str = sb3.toString();
                        list = arrayList;
                        zc.k i1722 = i();
                        Object[] objArr32 = new Object[1];
                        objArr32[c2] = str;
                        i1722.getClass();
                        String i1822 = zc.k.i(this.f10547c, objArr32);
                        i().getClass();
                        String h1022 = zc.k.h(this.f10549e);
                        list.add(i1822);
                        arrayList2.add(i1822);
                        list.add(h1022);
                        arrayList2.add(h1022);
                        zc.k i1922 = i();
                        if (i15 == 2) {
                        }
                        i1922.getClass();
                        spannableString = new SpannableString(zc.k.h(i20));
                        z5 = c2;
                        G = StringsKt.G(spannableString, "-", z5 ? 1 : 0, z5, 6);
                        if (G > -1) {
                        }
                        list.add(spannableString);
                        i().getClass();
                        String h1122 = zc.k.h(this.f10554k);
                        spannableString2 = new SpannableString(h1122);
                        spannableString2.setSpan(new UnderlineSpan(), 0, h1122.length(), 18);
                        i().getClass();
                        String h1222 = zc.k.h(this.f10555l);
                        spannableString3 = new SpannableString(h1222);
                        spannableString3.setSpan(new UnderlineSpan(), 0, h1222.length(), 18);
                        if (i15 == 2) {
                        }
                        return aVar;
                    case 3:
                        i13 = hVar.f10537b;
                        i12 = hVar.f10536a;
                        iVar2 = (i) hVar.f10543h;
                        spannableString5 = hVar.f10542g;
                        spannableString6 = hVar.f10541f;
                        list4 = hVar.f10539d;
                        List list7 = hVar.f10538c;
                        h8.b.B(obj);
                        list3 = list7;
                        double doubleValue3 = ((Number) obj).doubleValue();
                        iVar2.getClass();
                        l6 = l(doubleValue3);
                        spannableString7 = spannableString5;
                        spannableString4 = spannableString6;
                        list5 = list4;
                        list = list3;
                        if (i13 != 2) {
                        }
                        return aVar;
                    case 4:
                        i13 = hVar.f10537b;
                        i12 = hVar.f10536a;
                        iVar = (i) hVar.f10543h;
                        spannableString3 = hVar.f10542g;
                        spannableString4 = hVar.f10541f;
                        List list8 = hVar.f10539d;
                        list = hVar.f10538c;
                        h8.b.B(obj);
                        list2 = list8;
                        double doubleValue22 = ((Number) obj).doubleValue();
                        iVar.getClass();
                        l6 = l(doubleValue22);
                        spannableString7 = spannableString3;
                        list5 = list2;
                        if (i13 != 2) {
                        }
                        return aVar;
                    case 5:
                        i13 = hVar.f10537b;
                        i12 = hVar.f10536a;
                        str2 = (String) hVar.f10543h;
                        spannableString7 = hVar.f10542g;
                        spannableString8 = hVar.f10541f;
                        list5 = hVar.f10539d;
                        list6 = hVar.f10538c;
                        h8.b.B(obj);
                        longValue = ((Number) obj).longValue();
                        i().getClass();
                        String d1022 = ((za.i) zc.k.e()).d(R.plurals.prediction_plurals, (int) longValue);
                        zc.k i2222 = i();
                        if (i13 != 2) {
                        }
                        if (i12 <= 0) {
                        }
                        Object[] objArr222 = {str3, str2, String.valueOf(longValue), d1022};
                        i2222.getClass();
                        spannableString9 = new SpannableString(zc.k.i(i23, objArr222));
                        G2 = StringsKt.G(spannableString9, "-", 0, false, 6);
                        if (G2 > -1) {
                        }
                        list5.add(spannableString9);
                        i().getClass();
                        String h1322 = zc.k.h(this.j);
                        list6.add(h1322);
                        list5.add(h1322);
                        list6.add(spannableString8);
                        list5.add(spannableString8);
                        list6.add(spannableString7);
                        list5.add(spannableString7);
                        return new Pair(list6, list5);
                    case 6:
                        i13 = hVar.f10537b;
                        i12 = hVar.f10536a;
                        str2 = (String) hVar.f10543h;
                        spannableString7 = hVar.f10542g;
                        spannableString8 = hVar.f10541f;
                        list5 = hVar.f10539d;
                        list6 = hVar.f10538c;
                        h8.b.B(obj);
                        longValue = ((Number) obj).longValue();
                        i().getClass();
                        String d10222 = ((za.i) zc.k.e()).d(R.plurals.prediction_plurals, (int) longValue);
                        zc.k i22222 = i();
                        if (i13 != 2) {
                        }
                        if (i12 <= 0) {
                        }
                        Object[] objArr2222 = {str3, str2, String.valueOf(longValue), d10222};
                        i22222.getClass();
                        spannableString9 = new SpannableString(zc.k.i(i23, objArr2222));
                        G2 = StringsKt.G(spannableString9, "-", 0, false, 6);
                        if (G2 > -1) {
                        }
                        list5.add(spannableString9);
                        i().getClass();
                        String h13222 = zc.k.h(this.j);
                        list6.add(h13222);
                        list5.add(h13222);
                        list6.add(spannableString8);
                        list5.add(spannableString8);
                        list6.add(spannableString7);
                        list5.add(spannableString7);
                        return new Pair(list6, list5);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f10544i;
        lf.a aVar2 = lf.a.f20034a;
        i11 = hVar.f10545k;
        char c82 = this.f10548d;
        o oVar2 = this.f10546b;
        switch (i11) {
        }
    }
}
