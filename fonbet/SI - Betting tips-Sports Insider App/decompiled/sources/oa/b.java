package oa;

import ci.c;
import ha.d;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import r3.e0;
import x3.h;
import x3.i;
import x3.j;
import x3.k;
import x3.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {
    public static final ha.b r0(i iVar) {
        return new ha.b(iVar.getType(), iVar.getCurrentPrice(), iVar.getStandardPrice(), t0(iVar.getCurrentPrice(), iVar.getCurrentPlanId()), t0(iVar.getStandardPrice(), iVar.getStandardPlanId()), s0(iVar.getCurrentPrice(), iVar.getCurrentOfferId()), s0(iVar.getStandardPrice(), iVar.getStandardOfferId()), iVar.getEndtime());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String s0(String str, String str2) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2034275264:
                    if (str.equals("express_sub_7days")) {
                        return null;
                    }
                    break;
                case -1989594552:
                    if (str.equals("sale_express_sub_7days")) {
                        return "introprice";
                    }
                    break;
                case -1158580633:
                    if (str.equals("premium_sub_7days")) {
                        return "freetrial";
                    }
                    break;
                case -1113899921:
                    if (str.equals("sale_premium_sub_7days")) {
                        return "freetrial-introprice";
                    }
                    break;
                case -1105748230:
                    if (str.equals("express_sub_7days_up")) {
                        return null;
                    }
                    break;
                case -979954026:
                    if (str.equals("diamond_sub_month")) {
                        return null;
                    }
                    break;
                case -918352013:
                    if (str.equals("premium_sub_7days_up")) {
                        return "freetrial";
                    }
                    break;
                case -917582620:
                    if (str.equals("diamond_sub_month_up")) {
                        return null;
                    }
                    break;
                case 147382972:
                    if (str.equals("live_sub_7days")) {
                        return "freetrial";
                    }
                    break;
                case 197593134:
                    if (str.equals("live_sub_month")) {
                        return null;
                    }
                    break;
                case 308919266:
                    if (str.equals("premium_sub_up")) {
                        return null;
                    }
                    break;
                case 1176924933:
                    if (str.equals("trial_live_sub_7days")) {
                        return "freetrial";
                    }
                    break;
            }
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String t0(String str, String str2) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2034275264:
                    if (str.equals("express_sub_7days")) {
                        return "p1w";
                    }
                    break;
                case -1989594552:
                    if (str.equals("sale_express_sub_7days")) {
                        return "p1w";
                    }
                    break;
                case -1158580633:
                    if (str.equals("premium_sub_7days")) {
                        return "p1w";
                    }
                    break;
                case -1113899921:
                    if (str.equals("sale_premium_sub_7days")) {
                        return "p1w";
                    }
                    break;
                case -1105748230:
                    if (str.equals("express_sub_7days_up")) {
                        return "p1w";
                    }
                    break;
                case -979954026:
                    if (str.equals("diamond_sub_month")) {
                        return "p1m";
                    }
                    break;
                case -918352013:
                    if (str.equals("premium_sub_7days_up")) {
                        return "p1w";
                    }
                    break;
                case -917582620:
                    if (str.equals("diamond_sub_month_up")) {
                        return "p1m";
                    }
                    break;
                case 147382972:
                    if (str.equals("live_sub_7days")) {
                        return "p1w";
                    }
                    break;
                case 197593134:
                    if (str.equals("live_sub_month")) {
                        return "p1m";
                    }
                    break;
                case 308919266:
                    if (str.equals("premium_sub_up")) {
                        return "p1w";
                    }
                    break;
                case 1176924933:
                    if (str.equals("trial_live_sub_7days")) {
                        return "p1w";
                    }
                    break;
            }
        }
        return str2;
    }

    public static final ha.c u0(j jVar) {
        Long valueOf = Long.valueOf(Instant.now().getEpochSecond());
        i diamond = jVar.getDiamond();
        ha.b r02 = diamond != null ? r0(diamond) : null;
        i expressItem = jVar.getExpressItem();
        ha.b r03 = expressItem != null ? r0(expressItem) : null;
        i expressSubs = jVar.getExpressSubs();
        ha.b r04 = expressSubs != null ? r0(expressSubs) : null;
        i premiumItem = jVar.getPremiumItem();
        ha.b r05 = premiumItem != null ? r0(premiumItem) : null;
        i premiumSubs = jVar.getPremiumSubs();
        ha.b r06 = premiumSubs != null ? r0(premiumSubs) : null;
        i liveWeek = jVar.getLiveWeek();
        ha.b r07 = liveWeek != null ? r0(liveWeek) : null;
        i liveMonth = jVar.getLiveMonth();
        return new ha.c(valueOf, r02, r03, r04, r05, r06, r07, liveMonth != null ? r0(liveMonth) : null);
    }

    public static final Long v0(String str) {
        return Long.valueOf(ZonedDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond());
    }

    public static final d w0(l lVar) {
        String live;
        String express;
        String premium;
        String vip;
        String email = lVar.getEmail();
        String locale = lVar.getLocale();
        String name = lVar.getName();
        String surname = lVar.getSurname();
        String avatar = lVar.getAvatar();
        String token = lVar.getToken();
        int premium2 = lVar.getPremium();
        int express2 = lVar.getExpress();
        Integer forecastsOrder = lVar.getForecastsOrder();
        Integer needGoogleAuth = lVar.getNeedGoogleAuth();
        if (needGoogleAuth == null) {
            needGoogleAuth = lVar.getNeedHuaweiAuth();
        }
        int intValue = needGoogleAuth != null ? needGoogleAuth.intValue() : 0;
        Integer alternativePayment = lVar.getAlternativePayment();
        Integer badSubs = lVar.getBadSubs();
        Integer cpb = lVar.getCpb();
        k subscriptions = lVar.getSubscriptions();
        Long l6 = null;
        Long v02 = (subscriptions == null || (vip = subscriptions.getVip()) == null) ? null : v0(vip);
        k subscriptions2 = lVar.getSubscriptions();
        Long v03 = (subscriptions2 == null || (premium = subscriptions2.getPremium()) == null) ? null : v0(premium);
        k subscriptions3 = lVar.getSubscriptions();
        Long v04 = (subscriptions3 == null || (express = subscriptions3.getExpress()) == null) ? null : v0(express);
        k subscriptions4 = lVar.getSubscriptions();
        if (subscriptions4 != null && (live = subscriptions4.getLive()) != null) {
            l6 = v0(live);
        }
        return new d(email, locale, name, surname, avatar, token, premium2, express2, forecastsOrder, intValue, alternativePayment, cpb, badSubs, v02, v04, v03, l6, lVar.getModalDescEnable());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1 A[Catch: Exception -> 0x00e7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e7, blocks: (B:13:0x00db, B:15:0x00e1), top: B:12:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f1 A[Catch: Exception -> 0x00f7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f7, blocks: (B:18:0x00eb, B:20:0x00f1), top: B:17:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q0(String str, String str2, String str3, int i5, String str4, String str5, String str6, String str7, String str8, String str9, String str10, mf.c cVar) {
        a aVar;
        Object obj;
        lf.a aVar2;
        int i10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i11;
        String str18;
        b bVar;
        b bVar2;
        h hVar;
        ha.c cVar2;
        d w02;
        v3.b httpException;
        v3.a msg4xx;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f21150m;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f21150m = i12 - Integer.MIN_VALUE;
                obj = aVar.f21148k;
                aVar2 = lf.a.f20034a;
                i10 = aVar.f21150m;
                d dVar = null;
                r7 = null;
                String str19 = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    aVar.f21139a = str;
                    str11 = str2;
                    aVar.f21140b = str11;
                    str12 = str3;
                    aVar.f21141c = str12;
                    str13 = str6;
                    aVar.f21142d = str13;
                    str14 = str7;
                    aVar.f21143e = str14;
                    str15 = str8;
                    aVar.f21144f = str15;
                    str16 = str9;
                    aVar.f21145g = str16;
                    str17 = str10;
                    aVar.f21146h = str17;
                    aVar.f21147i = this;
                    i11 = i5;
                    aVar.j = i11;
                    aVar.f21150m = 1;
                    Object d10 = d(str4, str5, aVar);
                    if (d10 != aVar2) {
                        str18 = str;
                        obj = d10;
                        bVar = this;
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = aVar.f21147i;
                    h8.b.B(obj);
                    hVar = (h) obj;
                    bVar2.getClass();
                    try {
                        l user = hVar.getUser();
                        w02 = user == null ? w0(user) : null;
                        try {
                            j prices = hVar.getPrices();
                            cVar2 = prices == null ? u0(prices) : null;
                        } catch (Exception e7) {
                            e = e7;
                            cVar2 = null;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        cVar2 = null;
                    }
                    try {
                        int statusCode = hVar.getStatusCode();
                        httpException = hVar.getHttpException();
                        if (httpException != null && (msg4xx = httpException.getMsg4xx()) != null) {
                            str19 = msg4xx.toJsonString();
                        }
                        return new ha.a(statusCode, str19, w02, cVar2);
                    } catch (Exception e10) {
                        e = e10;
                        dVar = w02;
                        return new ha.a(hVar.getStatusCode(), e.getMessage(), dVar, cVar2);
                    }
                }
                int i13 = aVar.j;
                bVar = aVar.f21147i;
                String str20 = aVar.f21146h;
                String str21 = aVar.f21145g;
                String str22 = aVar.f21144f;
                String str23 = aVar.f21143e;
                String str24 = aVar.f21142d;
                String str25 = aVar.f21141c;
                String str26 = aVar.f21140b;
                str18 = aVar.f21139a;
                h8.b.B(obj);
                i11 = i13;
                str11 = str26;
                str17 = str20;
                str12 = str25;
                str16 = str21;
                str13 = str24;
                str15 = str22;
                str14 = str23;
                aVar.f21139a = null;
                aVar.f21140b = null;
                aVar.f21141c = null;
                aVar.f21142d = null;
                aVar.f21143e = null;
                aVar.f21144f = null;
                aVar.f21145g = null;
                aVar.f21146h = null;
                aVar.f21147i = bVar;
                aVar.j = i11;
                aVar.f21150m = 2;
                obj = ((e0) obj).q(str17, str18, str12, str11, i11, str13, str14, str15, str16, aVar);
                if (obj != aVar2) {
                    bVar2 = bVar;
                    hVar = (h) obj;
                    bVar2.getClass();
                    l user2 = hVar.getUser();
                    if (user2 == null) {
                    }
                    j prices2 = hVar.getPrices();
                    if (prices2 == null) {
                    }
                    int statusCode2 = hVar.getStatusCode();
                    httpException = hVar.getHttpException();
                    if (httpException != null) {
                        str19 = msg4xx.toJsonString();
                    }
                    return new ha.a(statusCode2, str19, w02, cVar2);
                }
                return aVar2;
            }
        }
        aVar = new a(this, cVar);
        obj = aVar.f21148k;
        aVar2 = lf.a.f20034a;
        i10 = aVar.f21150m;
        d dVar2 = null;
        str19 = null;
        String str192 = null;
        if (i10 != 0) {
        }
        aVar.f21139a = null;
        aVar.f21140b = null;
        aVar.f21141c = null;
        aVar.f21142d = null;
        aVar.f21143e = null;
        aVar.f21144f = null;
        aVar.f21145g = null;
        aVar.f21146h = null;
        aVar.f21147i = bVar;
        aVar.j = i11;
        aVar.f21150m = 2;
        obj = ((e0) obj).q(str17, str18, str12, str11, i11, str13, str14, str15, str16, aVar);
        if (obj != aVar2) {
        }
        return aVar2;
    }
}
