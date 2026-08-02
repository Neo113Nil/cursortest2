package rc;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import ic.d0;
import ic.e0;
import ic.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zc.c f22383a = new zc.c();

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ic.a a(com.android.billingclient.api.q qVar) {
        String str;
        String str2;
        String str3;
        Object obj;
        String str4;
        long j;
        Object obj2;
        Object obj3;
        String str5;
        Long l6;
        Iterator it;
        Object obj4;
        String str6;
        String str7;
        String str8;
        long j6;
        Object obj5;
        Object obj6;
        Object obj7;
        com.android.billingclient.api.m mVar;
        ArrayList arrayList;
        com.android.billingclient.api.o oVar;
        String str9;
        com.android.billingclient.api.m mVar2;
        ArrayList arrayList2;
        com.android.billingclient.api.o oVar2;
        Object obj8;
        Object obj9;
        com.android.billingclient.api.m mVar3;
        com.android.billingclient.api.m mVar4;
        if (qVar == null) {
            return null;
        }
        String str10 = qVar.f4069c;
        String str11 = qVar.f4072f;
        String str12 = qVar.f4071e;
        if (!Intrinsics.areEqual(qVar.f4070d, "subs")) {
            if (str12.length() == 0) {
                str12 = str11.length() == 0 ? str10 : str11;
            }
            Intrinsics.checkNotNullExpressionValue(str12, "ifEmpty(...)");
            String str13 = qVar.f4073g;
            Intrinsics.checkNotNullExpressionValue(str13, "getDescription(...)");
            String str14 = qVar.f4069c;
            Intrinsics.checkNotNullExpressionValue(str14, "getProductId(...)");
            com.android.billingclient.api.n a7 = qVar.a();
            String str15 = (a7 == null || (str3 = a7.f4050c) == null) ? "nil" : str3;
            com.android.billingclient.api.n a10 = qVar.a();
            String str16 = (a10 == null || (str2 = a10.f4048a) == null) ? "nil" : str2;
            com.android.billingclient.api.n a11 = qVar.a();
            if (a11 == null || (str = a11.f4048a) == null) {
                str = "";
            }
            String str17 = str;
            com.android.billingclient.api.n a12 = qVar.a();
            long j10 = a12 != null ? a12.f4049b : 0L;
            com.android.billingclient.api.n a13 = qVar.a();
            return new ic.a(0, 0, j10, a13 != null ? a13.f4049b : 0L, 0L, str12, str13, null, str14, null, str15, str16, str17, null, null, null, -1);
        }
        ArrayList<com.android.billingclient.api.p> arrayList3 = qVar.j;
        if (arrayList3 == null) {
            return null;
        }
        for (com.android.billingclient.api.p pVar : arrayList3) {
            if (pVar.f4063b == null) {
                String str18 = pVar.f4062a;
                Intrinsics.checkNotNullExpressionValue(str18, "getBasePlanId(...)");
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    obj = null;
                    if (!it2.hasNext()) {
                        str4 = str10;
                        j = 0;
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    j = 0;
                    com.android.billingclient.api.p pVar2 = (com.android.billingclient.api.p) obj2;
                    str4 = str10;
                    if ((Intrinsics.areEqual(pVar2.f4063b, "freetrial") || Intrinsics.areEqual(pVar2.f4063b, "freetrial-introprice")) && Intrinsics.areEqual(pVar2.f4062a, str18)) {
                        break;
                    }
                    str10 = str4;
                }
                com.android.billingclient.api.p pVar3 = (com.android.billingclient.api.p) obj2;
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    com.android.billingclient.api.p pVar4 = (com.android.billingclient.api.p) obj3;
                    Iterator it4 = it3;
                    if ((Intrinsics.areEqual(pVar4.f4063b, "introprice") || Intrinsics.areEqual(pVar4.f4063b, "freetrial-introprice")) && Intrinsics.areEqual(pVar4.f4062a, str18)) {
                        break;
                    }
                    it3 = it4;
                }
                com.android.billingclient.api.p pVar5 = (com.android.billingclient.api.p) obj3;
                ArrayList arrayList4 = pVar.f4065d.f4046a;
                Intrinsics.checkNotNullExpressionValue(arrayList4, "getPricingPhaseList(...)");
                ArrayList arrayList5 = (pVar3 == null || (mVar4 = pVar3.f4065d) == null) ? null : mVar4.f4046a;
                ArrayList arrayList6 = (pVar5 == null || (mVar3 = pVar5.f4065d) == null) ? null : mVar3.f4046a;
                int i5 = 1;
                if (arrayList3.size() <= 1) {
                    i5 = -1;
                } else if (pVar3 != null || pVar5 != null) {
                    i5 = 0;
                }
                int i10 = i5;
                if (arrayList6 != null) {
                    Iterator it5 = arrayList6.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj9 = null;
                            break;
                        }
                        obj9 = it5.next();
                        if (((com.android.billingclient.api.o) obj9).f4057b > j) {
                            break;
                        }
                    }
                    com.android.billingclient.api.o oVar3 = (com.android.billingclient.api.o) obj9;
                    if (oVar3 != null) {
                        str5 = oVar3.f4056a;
                        if (str5 == null) {
                            str5 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4056a;
                            Intrinsics.checkNotNullExpressionValue(str5, "getFormattedPrice(...)");
                        }
                        String str19 = str5;
                        if (arrayList6 != null) {
                            Iterator it6 = arrayList6.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    obj8 = null;
                                    break;
                                }
                                obj8 = it6.next();
                                if (((com.android.billingclient.api.o) obj8).f4057b > j) {
                                    break;
                                }
                            }
                            com.android.billingclient.api.o oVar4 = (com.android.billingclient.api.o) obj8;
                            if (oVar4 != null) {
                                l6 = Long.valueOf(oVar4.f4057b);
                                long longValue = l6 != null ? l6.longValue() : ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                                if (str12.length() == 0) {
                                    if (str11.length() != 0) {
                                        str4 = str11;
                                    }
                                    str12 = str4;
                                }
                                Intrinsics.checkNotNullExpressionValue(str12, "ifEmpty(...)");
                                String str20 = qVar.f4073g;
                                Intrinsics.checkNotNullExpressionValue(str20, "getDescription(...)");
                                String str21 = qVar.f4069c;
                                Intrinsics.checkNotNullExpressionValue(str21, "getProductId(...)");
                                it = arrayList3.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj4 = null;
                                        break;
                                    }
                                    obj4 = it.next();
                                    if (((com.android.billingclient.api.p) obj4).f4063b == null) {
                                        break;
                                    }
                                }
                                com.android.billingclient.api.p pVar6 = (com.android.billingclient.api.p) obj4;
                                String str22 = (pVar6 != null || (mVar2 = pVar6.f4065d) == null || (arrayList2 = mVar2.f4046a) == null || (oVar2 = (com.android.billingclient.api.o) CollectionsKt.L(arrayList2)) == null) ? null : oVar2.f4059d;
                                com.android.billingclient.api.p pVar7 = (com.android.billingclient.api.p) CollectionsKt.firstOrNull(arrayList3);
                                String str23 = (pVar7 != null || (mVar = pVar7.f4065d) == null || (arrayList = mVar.f4046a) == null || (oVar = (com.android.billingclient.api.o) CollectionsKt.firstOrNull(arrayList)) == null || (str9 = oVar.f4058c) == null) ? "nil" : str9;
                                String str24 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4056a;
                                Intrinsics.checkNotNullExpressionValue(str24, "getFormattedPrice(...)");
                                if (arrayList6 != null) {
                                    Iterator it7 = arrayList6.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            obj7 = null;
                                            break;
                                        }
                                        obj7 = it7.next();
                                        com.android.billingclient.api.o oVar5 = (com.android.billingclient.api.o) obj7;
                                        if (oVar5.f4061f == 2 && oVar5.f4057b > j) {
                                            break;
                                        }
                                    }
                                    com.android.billingclient.api.o oVar6 = (com.android.billingclient.api.o) obj7;
                                    if (oVar6 != null) {
                                        str6 = oVar6.f4056a;
                                        if (arrayList6 != null) {
                                            Iterator it8 = arrayList6.iterator();
                                            while (true) {
                                                if (!it8.hasNext()) {
                                                    obj6 = null;
                                                    break;
                                                }
                                                obj6 = it8.next();
                                                com.android.billingclient.api.o oVar7 = (com.android.billingclient.api.o) obj6;
                                                if (oVar7.f4061f == 2 && oVar7.f4057b > j) {
                                                    break;
                                                }
                                            }
                                            com.android.billingclient.api.o oVar8 = (com.android.billingclient.api.o) obj6;
                                            if (oVar8 != null) {
                                                str7 = oVar8.f4059d;
                                                if (arrayList5 != null) {
                                                    Iterator it9 = arrayList5.iterator();
                                                    while (true) {
                                                        if (!it9.hasNext()) {
                                                            obj5 = null;
                                                            break;
                                                        }
                                                        obj5 = it9.next();
                                                        if (((com.android.billingclient.api.o) obj5).f4057b == j) {
                                                            break;
                                                        }
                                                    }
                                                    com.android.billingclient.api.o oVar9 = (com.android.billingclient.api.o) obj5;
                                                    if (oVar9 != null) {
                                                        str8 = oVar9.f4059d;
                                                        long j11 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                                                        if (arrayList6 != null) {
                                                            Iterator it10 = arrayList6.iterator();
                                                            while (true) {
                                                                if (!it10.hasNext()) {
                                                                    break;
                                                                }
                                                                Object next = it10.next();
                                                                com.android.billingclient.api.o oVar10 = (com.android.billingclient.api.o) next;
                                                                if (oVar10.f4061f == 2 && oVar10.f4057b > j) {
                                                                    obj = next;
                                                                    break;
                                                                }
                                                            }
                                                            com.android.billingclient.api.o oVar11 = (com.android.billingclient.api.o) obj;
                                                            if (oVar11 != null) {
                                                                j6 = oVar11.f4057b;
                                                                return new ic.a(2, 0, longValue, j11, j6, str12, str20, null, str21, str22, str23, str19, str24, str7, str6, str8, i10);
                                                            }
                                                        }
                                                        j6 = j;
                                                        return new ic.a(2, 0, longValue, j11, j6, str12, str20, null, str21, str22, str23, str19, str24, str7, str6, str8, i10);
                                                    }
                                                }
                                                str8 = null;
                                                long j112 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                                                if (arrayList6 != null) {
                                                }
                                                j6 = j;
                                                return new ic.a(2, 0, longValue, j112, j6, str12, str20, null, str21, str22, str23, str19, str24, str7, str6, str8, i10);
                                            }
                                        }
                                        str7 = null;
                                        if (arrayList5 != null) {
                                        }
                                        str8 = null;
                                        long j1122 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                                        if (arrayList6 != null) {
                                        }
                                        j6 = j;
                                        return new ic.a(2, 0, longValue, j1122, j6, str12, str20, null, str21, str22, str23, str19, str24, str7, str6, str8, i10);
                                    }
                                }
                                str6 = null;
                                if (arrayList6 != null) {
                                }
                                str7 = null;
                                if (arrayList5 != null) {
                                }
                                str8 = null;
                                long j11222 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                                if (arrayList6 != null) {
                                }
                                j6 = j;
                                return new ic.a(2, 0, longValue, j11222, j6, str12, str20, null, str21, str22, str23, str19, str24, str7, str6, str8, i10);
                            }
                        }
                        l6 = null;
                        long longValue2 = l6 != null ? l6.longValue() : ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                        if (str12.length() == 0) {
                        }
                        Intrinsics.checkNotNullExpressionValue(str12, "ifEmpty(...)");
                        String str202 = qVar.f4073g;
                        Intrinsics.checkNotNullExpressionValue(str202, "getDescription(...)");
                        String str212 = qVar.f4069c;
                        Intrinsics.checkNotNullExpressionValue(str212, "getProductId(...)");
                        it = arrayList3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        com.android.billingclient.api.p pVar62 = (com.android.billingclient.api.p) obj4;
                        if (pVar62 != null) {
                        }
                        com.android.billingclient.api.p pVar72 = (com.android.billingclient.api.p) CollectionsKt.firstOrNull(arrayList3);
                        if (pVar72 != null) {
                        }
                        String str242 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4056a;
                        Intrinsics.checkNotNullExpressionValue(str242, "getFormattedPrice(...)");
                        if (arrayList6 != null) {
                        }
                        str6 = null;
                        if (arrayList6 != null) {
                        }
                        str7 = null;
                        if (arrayList5 != null) {
                        }
                        str8 = null;
                        long j112222 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                        if (arrayList6 != null) {
                        }
                        j6 = j;
                        return new ic.a(2, 0, longValue2, j112222, j6, str12, str202, null, str212, str22, str23, str19, str242, str7, str6, str8, i10);
                    }
                }
                str5 = null;
                if (str5 == null) {
                }
                String str192 = str5;
                if (arrayList6 != null) {
                }
                l6 = null;
                long longValue22 = l6 != null ? l6.longValue() : ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                if (str12.length() == 0) {
                }
                Intrinsics.checkNotNullExpressionValue(str12, "ifEmpty(...)");
                String str2022 = qVar.f4073g;
                Intrinsics.checkNotNullExpressionValue(str2022, "getDescription(...)");
                String str2122 = qVar.f4069c;
                Intrinsics.checkNotNullExpressionValue(str2122, "getProductId(...)");
                it = arrayList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                com.android.billingclient.api.p pVar622 = (com.android.billingclient.api.p) obj4;
                if (pVar622 != null) {
                }
                com.android.billingclient.api.p pVar722 = (com.android.billingclient.api.p) CollectionsKt.firstOrNull(arrayList3);
                if (pVar722 != null) {
                }
                String str2422 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4056a;
                Intrinsics.checkNotNullExpressionValue(str2422, "getFormattedPrice(...)");
                if (arrayList6 != null) {
                }
                str6 = null;
                if (arrayList6 != null) {
                }
                str7 = null;
                if (arrayList5 != null) {
                }
                str8 = null;
                long j1122222 = ((com.android.billingclient.api.o) CollectionsKt.F(arrayList4)).f4057b;
                if (arrayList6 != null) {
                }
                j6 = j;
                return new ic.a(2, 0, longValue22, j1122222, j6, str12, str2022, null, str2122, str22, str23, str192, str2422, str7, str6, str8, i10);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static ic.a b(SkuDetails skuDetails) {
        if (skuDetails == null) {
            return null;
        }
        JSONObject jSONObject = skuDetails.f3964b;
        if (!Intrinsics.areEqual(skuDetails.g(), "subs")) {
            String optString = jSONObject.optString("title");
            if (optString.length() == 0) {
                optString = skuDetails.f();
            }
            Intrinsics.checkNotNullExpressionValue(optString, "ifEmpty(...)");
            String optString2 = jSONObject.optString("description");
            Intrinsics.checkNotNullExpressionValue(optString2, "getDescription(...)");
            String optString3 = jSONObject.optString("iconUrl");
            String str = optString3.length() == 0 ? null : optString3;
            String f6 = skuDetails.f();
            Intrinsics.checkNotNullExpressionValue(f6, "getSku(...)");
            String e7 = skuDetails.e();
            Intrinsics.checkNotNullExpressionValue(e7, "getPriceCurrencyCode(...)");
            String optString4 = jSONObject.optString("price");
            Intrinsics.checkNotNullExpressionValue(optString4, "getPrice(...)");
            String b10 = skuDetails.b();
            Intrinsics.checkNotNullExpressionValue(b10, "getOriginalPrice(...)");
            return new ic.a(0, 0, skuDetails.d(), skuDetails.c(), 0L, optString, optString2, str, f6, null, e7, optString4, b10, null, null, null, -1);
        }
        int i5 = -1;
        if (jSONObject.optLong("introductoryPriceAmountMicros") != 0) {
            String a7 = skuDetails.a();
            if (a7.length() == 0) {
                a7 = null;
            }
            if (a7 != null) {
                i5 = 0;
            }
        }
        int i10 = i5;
        String optString5 = jSONObject.optString("title");
        if (optString5.length() == 0) {
            optString5 = skuDetails.f();
        }
        Intrinsics.checkNotNullExpressionValue(optString5, "ifEmpty(...)");
        String optString6 = jSONObject.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString6, "getDescription(...)");
        String optString7 = jSONObject.optString("iconUrl");
        String str2 = optString7.length() == 0 ? null : optString7;
        String f10 = skuDetails.f();
        Intrinsics.checkNotNullExpressionValue(f10, "getSku(...)");
        String optString8 = jSONObject.optString("subscriptionPeriod");
        String str3 = optString8.length() == 0 ? null : optString8;
        String e9 = skuDetails.e();
        Intrinsics.checkNotNullExpressionValue(e9, "getPriceCurrencyCode(...)");
        String optString9 = jSONObject.optString("price");
        Intrinsics.checkNotNullExpressionValue(optString9, "getPrice(...)");
        String b11 = skuDetails.b();
        Intrinsics.checkNotNullExpressionValue(b11, "getOriginalPrice(...)");
        String a10 = skuDetails.a();
        String str4 = a10.length() == 0 ? null : a10;
        String optString10 = jSONObject.optString("introductoryPricePeriod");
        String str5 = optString10.length() == 0 ? null : optString10;
        String optString11 = jSONObject.optString("freeTrialPeriod");
        String str6 = optString11.length() == 0 ? null : optString11;
        String a11 = skuDetails.a();
        return new ic.a(2, 0, (a11.length() != 0 ? a11 : null) != null ? jSONObject.optLong("introductoryPriceAmountMicros") : skuDetails.d(), skuDetails.c(), jSONObject.optLong("introductoryPriceAmountMicros"), optString5, optString6, str2, f10, str3, e9, optString9, b11, str5, str4, str6, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ic.d d(a aVar, ic.a aVar2, boolean z5) {
        String a7;
        Long valueOf = Long.valueOf(aVar2.f11056c);
        String str = aVar2.f11064l;
        String str2 = aVar2.f11067o;
        Long valueOf2 = Long.valueOf(aVar2.f11058e);
        String str3 = aVar2.j;
        String str4 = null;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        String str5 = (str2 == null || str2.length() == 0) ? null : str2;
        boolean z7 = aVar2.f11054a != 2;
        String str6 = aVar2.f11068p;
        String str7 = "P3D";
        if (str6 != null) {
            if (str6.length() == 0) {
                str6 = z5 ? "P3D" : null;
            }
            if (str6 != null) {
                str7 = str6;
                Integer i5 = aa.b.i(str7);
                int intValue = i5 != null ? i5.intValue() : 0;
                zc.c cVar = aVar.f22383a;
                if (str2 != null) {
                    if (str2.length() == 0) {
                        str2 = null;
                    }
                    str4 = str2;
                }
                a7 = zc.c.a(str4);
                if (a7 == null) {
                    a7 = zc.c.a(str);
                }
                String a10 = zc.c.a(str);
                ic.d dVar = new ic.d();
                dVar.f11091c = valueOf;
                dVar.f11092d = valueOf2;
                dVar.f11093e = str3;
                dVar.f11094f = str5;
                dVar.f11089a = z7;
                dVar.f11090b = intValue;
                dVar.f11095g = a7;
                dVar.f11096h = a10;
                return dVar;
            }
        }
        if (!z5) {
            str7 = null;
        }
        Integer i52 = aa.b.i(str7);
        if (i52 != null) {
        }
        zc.c cVar2 = aVar.f22383a;
        if (str2 != null) {
        }
        a7 = zc.c.a(str4);
        if (a7 == null) {
        }
        String a102 = zc.c.a(str);
        ic.d dVar2 = new ic.d();
        dVar2.f11091c = valueOf;
        dVar2.f11092d = valueOf2;
        dVar2.f11093e = str3;
        dVar2.f11094f = str5;
        dVar2.f11089a = z7;
        dVar2.f11090b = intValue;
        dVar2.f11095g = a7;
        dVar2.f11096h = a102;
        return dVar2;
    }

    public static e0 e(com.android.billingclient.api.q qVar) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList = null;
        if (qVar == null) {
            return null;
        }
        String str4 = qVar.f4069c;
        String str5 = qVar.f4072f;
        String str6 = qVar.f4071e;
        if (!Intrinsics.areEqual(qVar.f4070d, "subs")) {
            String str7 = str4;
            String str8 = qVar.f4069c;
            Intrinsics.checkNotNullExpressionValue(str8, "getProductId(...)");
            if (str6.length() == 0) {
                if (str5.length() != 0) {
                    str7 = str5;
                }
                str = str7;
            } else {
                str = str6;
            }
            Intrinsics.checkNotNullExpressionValue(str, "ifEmpty(...)");
            String str9 = qVar.f4073g;
            Intrinsics.checkNotNullExpressionValue(str9, "getDescription(...)");
            com.android.billingclient.api.n a7 = qVar.a();
            long j = a7 != null ? a7.f4049b : 0L;
            com.android.billingclient.api.n a10 = qVar.a();
            String str10 = "???";
            if (a10 == null || (str2 = a10.f4050c) == null) {
                str2 = "???";
            }
            com.android.billingclient.api.n a11 = qVar.a();
            if (a11 != null && (str3 = a11.f4048a) != null) {
                str10 = str3;
            }
            return new e0(0, str8, str, str9, null, new ic.x(j, str2, str10), null);
        }
        ArrayList<com.android.billingclient.api.p> arrayList2 = qVar.j;
        if (arrayList2 != null) {
            int i5 = 10;
            arrayList = new ArrayList(kotlin.collections.v.k(arrayList2, 10));
            for (com.android.billingclient.api.p pVar : arrayList2) {
                String str11 = pVar.f4062a;
                Intrinsics.checkNotNullExpressionValue(str11, "getBasePlanId(...)");
                String str12 = pVar.f4063b;
                String str13 = pVar.f4064c;
                Intrinsics.checkNotNullExpressionValue(str13, "getOfferToken(...)");
                ArrayList arrayList3 = pVar.f4066e;
                Intrinsics.checkNotNullExpressionValue(arrayList3, "getOfferTags(...)");
                ArrayList arrayList4 = pVar.f4065d.f4046a;
                Intrinsics.checkNotNullExpressionValue(arrayList4, "getPricingPhaseList(...)");
                String str14 = str4;
                ArrayList arrayList5 = new ArrayList(kotlin.collections.v.k(arrayList4, i5));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    com.android.billingclient.api.o oVar = (com.android.billingclient.api.o) it.next();
                    String str15 = oVar.f4056a;
                    Iterator it2 = it;
                    Intrinsics.checkNotNullExpressionValue(str15, "getFormattedPrice(...)");
                    String str16 = oVar.f4058c;
                    String str17 = str5;
                    Intrinsics.checkNotNullExpressionValue(str16, "getPriceCurrencyCode(...)");
                    String str18 = oVar.f4059d;
                    Intrinsics.checkNotNullExpressionValue(str18, "getBillingPeriod(...)");
                    arrayList5.add(new d0(str15, str16, str18, oVar.f4057b, oVar.f4061f, oVar.f4060e));
                    it = it2;
                    str5 = str17;
                }
                arrayList.add(new ic.a0(str11, str12, str13, arrayList3, arrayList5));
                str4 = str14;
                i5 = 10;
            }
        }
        String str19 = str4;
        String str20 = str5;
        ArrayList arrayList6 = arrayList;
        String str21 = qVar.f4069c;
        Intrinsics.checkNotNullExpressionValue(str21, "getProductId(...)");
        if (str6.length() == 0) {
            str6 = str20.length() == 0 ? str19 : str20;
        }
        Intrinsics.checkNotNullExpressionValue(str6, "ifEmpty(...)");
        String str22 = qVar.f4073g;
        Intrinsics.checkNotNullExpressionValue(str22, "getDescription(...)");
        return new e0(2, str21, str6, str22, null, null, arrayList6);
    }

    public static e0 f(SkuDetails skuDetails) {
        ic.a0 a0Var;
        boolean z5;
        d0 d0Var;
        d0 d0Var2;
        List f6;
        List list;
        ic.a0 a0Var2;
        String str;
        if (skuDetails == null) {
            return null;
        }
        JSONObject jSONObject = skuDetails.f3964b;
        if (!Intrinsics.areEqual(skuDetails.g(), "subs")) {
            String f10 = skuDetails.f();
            Intrinsics.checkNotNullExpressionValue(f10, "getSku(...)");
            String optString = jSONObject.optString("title");
            if (optString.length() == 0) {
                optString = skuDetails.f();
            }
            String str2 = optString;
            Intrinsics.checkNotNullExpressionValue(str2, "ifEmpty(...)");
            String optString2 = jSONObject.optString("description");
            Intrinsics.checkNotNullExpressionValue(optString2, "getDescription(...)");
            String optString3 = jSONObject.optString("iconUrl");
            String str3 = optString3.length() == 0 ? null : optString3;
            long d10 = skuDetails.c() != skuDetails.d() ? skuDetails.d() : skuDetails.c();
            String e7 = skuDetails.e();
            Intrinsics.checkNotNullExpressionValue(e7, "getPriceCurrencyCode(...)");
            String optString4 = !Intrinsics.areEqual(skuDetails.b(), jSONObject.optString("price")) ? jSONObject.optString("price") : skuDetails.b();
            Intrinsics.checkNotNull(optString4);
            return new e0(0, f10, str2, optString2, str3, new ic.x(d10, e7, optString4), null);
        }
        String b10 = skuDetails.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getOriginalPrice(...)");
        String e9 = skuDetails.e();
        Intrinsics.checkNotNullExpressionValue(e9, "getPriceCurrencyCode(...)");
        String optString5 = jSONObject.optString("subscriptionPeriod");
        Intrinsics.checkNotNullExpressionValue(optString5, "getSubscriptionPeriod(...)");
        d0 d0Var3 = new d0(b10, e9, optString5, skuDetails.c(), 1, 0);
        String optString6 = jSONObject.optString("subscriptionPeriod");
        Intrinsics.checkNotNullExpressionValue(optString6, "getSubscriptionPeriod(...)");
        Locale locale = Locale.ROOT;
        String lowerCase = optString6.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
        ic.a0 a0Var3 = new ic.a0(lowerCase, null, "", e0Var, kotlin.collections.t.c(d0Var3));
        String optString7 = jSONObject.optString("freeTrialPeriod");
        if (optString7.length() == 0) {
            optString7 = null;
        }
        String a7 = skuDetails.a();
        if (a7.length() == 0) {
            a7 = null;
        }
        boolean z7 = optString7 != null;
        boolean z10 = a7 != null;
        if (z7) {
            a0Var = a0Var3;
            z5 = z7;
            String str4 = "0 " + skuDetails.e();
            String e10 = skuDetails.e();
            Intrinsics.checkNotNullExpressionValue(e10, "getPriceCurrencyCode(...)");
            String optString8 = jSONObject.optString("freeTrialPeriod");
            Intrinsics.checkNotNullExpressionValue(optString8, "getFreeTrialPeriod(...)");
            d0Var = new d0(str4, e10, optString8, 0L, 2, 1);
        } else {
            a0Var = a0Var3;
            z5 = z7;
            d0Var = null;
        }
        if (z10) {
            String a10 = skuDetails.a();
            Intrinsics.checkNotNullExpressionValue(a10, "getIntroductoryPrice(...)");
            String e11 = skuDetails.e();
            Intrinsics.checkNotNullExpressionValue(e11, "getPriceCurrencyCode(...)");
            String optString9 = jSONObject.optString("introductoryPricePeriod");
            Intrinsics.checkNotNullExpressionValue(optString9, "getIntroductoryPricePeriod(...)");
            d0Var2 = new d0(a10, e11, optString9, jSONObject.optLong("introductoryPriceAmountMicros"), 2, 1);
        } else {
            d0Var2 = null;
        }
        if (z5 && z10) {
            if (d0Var != null && d0Var2 != null) {
                f6 = kotlin.collections.u.f(d0Var, d0Var2, d0Var3);
                list = f6;
            }
            list = null;
        } else if (z5) {
            if (d0Var != null) {
                f6 = kotlin.collections.u.f(d0Var, d0Var3);
                list = f6;
            }
            list = null;
        } else {
            if (z10 && d0Var2 != null) {
                f6 = kotlin.collections.u.f(d0Var2, d0Var3);
                list = f6;
            }
            list = null;
        }
        if (list == null || list.isEmpty()) {
            a0Var2 = null;
        } else {
            String optString10 = jSONObject.optString("subscriptionPeriod");
            Intrinsics.checkNotNullExpressionValue(optString10, "getSubscriptionPeriod(...)");
            String lowerCase2 = optString10.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (z5 && z10) {
                str = "freetrial-introprice";
            } else if (z5 && !z10) {
                str = "freetrial";
            } else {
                if (z5 || !z10) {
                    throw new IllegalArgumentException("not found offer");
                }
                str = "introprice";
            }
            a0Var2 = new ic.a0(lowerCase2, str, "", e0Var, list);
        }
        String f11 = skuDetails.f();
        Intrinsics.checkNotNullExpressionValue(f11, "getSku(...)");
        String optString11 = jSONObject.optString("title");
        if (optString11.length() == 0) {
            optString11 = skuDetails.f();
        }
        Intrinsics.checkNotNullExpressionValue(optString11, "ifEmpty(...)");
        String optString12 = jSONObject.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString12, "getDescription(...)");
        String optString13 = jSONObject.optString("iconUrl");
        return new e0(2, f11, optString11, optString12, optString13.length() == 0 ? null : optString13, null, a0Var2 != null ? kotlin.collections.u.f(a0Var2, a0Var) : kotlin.collections.t.c(a0Var));
    }

    public static h0 g(Purchase data) {
        Intrinsics.checkNotNullParameter(data, "data");
        long b10 = data.b();
        ArrayList a7 = data.a();
        Intrinsics.checkNotNullExpressionValue(a7, "getProducts(...)");
        Object F = CollectionsKt.F(a7);
        Intrinsics.checkNotNullExpressionValue(F, "first(...)");
        String productId = (String) F;
        String optString = data.f3959c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        String purchaseToken = data.c();
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        h0 h0Var = new h0();
        h0Var.f11121a = b10;
        h0Var.f11122b = productId;
        h0Var.f11123c = optString;
        h0Var.f11124d = purchaseToken;
        return h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ic.b c(ic.a aVar, boolean z5) {
        String str;
        int i5;
        Integer i10;
        String str2 = null;
        if (aVar == null) {
            return null;
        }
        String str3 = aVar.f11064l;
        String str4 = aVar.f11067o;
        if (str4 == null || str4.length() == 0) {
            str4 = null;
        }
        String str5 = aVar.f11068p;
        String str6 = "P3D";
        if (str5 != null) {
            if (str5.length() == 0) {
                str5 = z5 ? "P3D" : null;
            }
            if (str5 != null) {
                str6 = str5;
                Long valueOf = Long.valueOf(aVar.f11056c);
                Long valueOf2 = Long.valueOf(aVar.f11058e);
                str = aVar.j;
                if (str != null && str.length() != 0) {
                    str2 = str;
                }
                i5 = 0;
                boolean z7 = aVar.f11054a == 2;
                String a7 = zc.c.a(str4);
                String a10 = zc.c.a(str3);
                if (str6 != null && (i10 = aa.b.i(str6)) != null) {
                    i5 = i10.intValue();
                }
                ic.b bVar = new ic.b();
                bVar.f11075a = valueOf;
                bVar.f11076b = valueOf2;
                bVar.f11077c = str6;
                bVar.f11078d = str2;
                bVar.f11079e = str3;
                bVar.f11080f = str4;
                bVar.f11081g = z7;
                bVar.f11082h = a7;
                bVar.f11083i = a10;
                bVar.j = i5;
                return bVar;
            }
        }
        if (!z5) {
            str6 = null;
        }
        Long valueOf3 = Long.valueOf(aVar.f11056c);
        Long valueOf22 = Long.valueOf(aVar.f11058e);
        str = aVar.j;
        if (str != null) {
            str2 = str;
        }
        i5 = 0;
        if (aVar.f11054a == 2) {
        }
        String a72 = zc.c.a(str4);
        String a102 = zc.c.a(str3);
        if (str6 != null) {
            i5 = i10.intValue();
        }
        ic.b bVar2 = new ic.b();
        bVar2.f11075a = valueOf3;
        bVar2.f11076b = valueOf22;
        bVar2.f11077c = str6;
        bVar2.f11078d = str2;
        bVar2.f11079e = str3;
        bVar2.f11080f = str4;
        bVar2.f11081g = z7;
        bVar2.f11082h = a72;
        bVar2.f11083i = a102;
        bVar2.j = i5;
        return bVar2;
    }
}
