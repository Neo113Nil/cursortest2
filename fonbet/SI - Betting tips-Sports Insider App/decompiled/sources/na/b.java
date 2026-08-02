package na;

import ci.c;
import gh.r0;
import ha.d;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.collections.v;
import pa.e;
import pa.f;
import r3.e0;
import x3.h;
import x3.i;
import x3.j;
import x3.k;
import x3.l;
import z3.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {
    public static ha.a E0(h hVar) {
        d dVar;
        ha.c cVar;
        v3.a msg4xx;
        String live;
        String express;
        String premium;
        String vip;
        try {
            l user = hVar.getUser();
            if (user != null) {
                String email = user.getEmail();
                String locale = user.getLocale();
                String name = user.getName();
                String surname = user.getSurname();
                String avatar = user.getAvatar();
                String token = user.getToken();
                int premium2 = user.getPremium();
                int express2 = user.getExpress();
                Integer forecastsOrder = user.getForecastsOrder();
                Integer needGoogleAuth = user.getNeedGoogleAuth();
                int intValue = needGoogleAuth != null ? needGoogleAuth.intValue() : 0;
                Integer alternativePayment = user.getAlternativePayment();
                Integer cpb = user.getCpb();
                Integer badSubs = user.getBadSubs();
                k subscriptions = user.getSubscriptions();
                Long H0 = (subscriptions == null || (vip = subscriptions.getVip()) == null) ? null : H0(vip);
                k subscriptions2 = user.getSubscriptions();
                Long H02 = (subscriptions2 == null || (premium = subscriptions2.getPremium()) == null) ? null : H0(premium);
                k subscriptions3 = user.getSubscriptions();
                Long H03 = (subscriptions3 == null || (express = subscriptions3.getExpress()) == null) ? null : H0(express);
                k subscriptions4 = user.getSubscriptions();
                dVar = new d(email, locale, name, surname, avatar, token, premium2, express2, forecastsOrder, intValue, alternativePayment, cpb, badSubs, H0, H03, H02, (subscriptions4 == null || (live = subscriptions4.getLive()) == null) ? null : H0(live), user.getModalDescEnable());
            } else {
                dVar = null;
            }
            j prices = hVar.getPrices();
            if (prices != null) {
                Long valueOf = Long.valueOf(Instant.now().getEpochSecond());
                i diamond = prices.getDiamond();
                ha.b F0 = diamond != null ? F0(diamond) : null;
                i expressItem = prices.getExpressItem();
                ha.b F02 = expressItem != null ? F0(expressItem) : null;
                i expressSubs = prices.getExpressSubs();
                ha.b F03 = expressSubs != null ? F0(expressSubs) : null;
                i premiumItem = prices.getPremiumItem();
                ha.b F04 = premiumItem != null ? F0(premiumItem) : null;
                i premiumSubs = prices.getPremiumSubs();
                ha.b F05 = premiumSubs != null ? F0(premiumSubs) : null;
                i liveWeek = prices.getLiveWeek();
                ha.b F06 = liveWeek != null ? F0(liveWeek) : null;
                i liveMonth = prices.getLiveMonth();
                cVar = new ha.c(valueOf, F0, F02, F03, F04, F05, F06, liveMonth != null ? F0(liveMonth) : null);
            } else {
                cVar = null;
            }
            int statusCode = hVar.getStatusCode();
            v3.b httpException = hVar.getHttpException();
            return new ha.a(statusCode, (httpException == null || (msg4xx = httpException.getMsg4xx()) == null) ? null : msg4xx.toJsonString(), dVar, cVar);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final ha.b F0(i iVar) {
        return new ha.b(iVar.getType(), iVar.getCurrentPrice(), iVar.getStandardPrice(), iVar.getCurrentPlanId(), iVar.getStandardPlanId(), iVar.getCurrentOfferId(), iVar.getStandardOfferId(), iVar.getEndtime());
    }

    public static final ha.b G0(i iVar) {
        return new ha.b(iVar.getType(), iVar.getCurrentPrice(), iVar.getStandardPrice(), iVar.getCurrentPlanId(), iVar.getStandardPlanId(), iVar.getCurrentOfferId(), iVar.getStandardOfferId(), iVar.getEndtime());
    }

    public static final Long H0(String str) {
        return Long.valueOf(ZonedDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond());
    }

    public static final Long I0(String str) {
        return Long.valueOf(ZonedDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A0(String str, int i5, String str2, String str3, mf.c cVar) {
        ta.a aVar;
        int i10;
        if (cVar instanceof ta.a) {
            aVar = (ta.a) cVar;
            int i11 = aVar.f23803e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f23803e = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f23801c;
                Object obj2 = lf.a.f20034a;
                i10 = aVar.f23803e;
                if (i10 != 0) {
                    h8.b.B(obj);
                    aVar.f23799a = str;
                    aVar.f23800b = i5;
                    aVar.f23803e = 1;
                    obj = d(str2, str3, aVar);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    i5 = aVar.f23800b;
                    str = aVar.f23799a;
                    h8.b.B(obj);
                }
                aVar.f23799a = null;
                aVar.f23800b = i5;
                aVar.f23803e = 2;
                Object m6 = ((e0) obj).m(i5, str, aVar);
                return m6 != obj2 ? obj2 : m6;
            }
        }
        aVar = new ta.a(this, cVar);
        Object obj3 = aVar.f23801c;
        Object obj22 = lf.a.f20034a;
        i10 = aVar.f23803e;
        if (i10 != 0) {
        }
        aVar.f23799a = null;
        aVar.f23800b = i5;
        aVar.f23803e = 2;
        Object m62 = ((e0) obj3).m(i5, str, aVar);
        if (m62 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r12 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B0(String str, String str2, String str3, String str4, String str5, Integer num, mf.c cVar) {
        ta.b bVar;
        int i5;
        if (cVar instanceof ta.b) {
            bVar = (ta.b) cVar;
            int i10 = bVar.f23810g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f23810g = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f23808e;
                Object obj2 = lf.a.f20034a;
                i5 = bVar.f23810g;
                if (i5 != 0) {
                    h8.b.B(obj);
                    bVar.f23804a = str;
                    bVar.f23805b = str2;
                    bVar.f23806c = str3;
                    bVar.f23807d = num;
                    bVar.f23810g = 1;
                    obj = d(str4, str5, bVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    num = bVar.f23807d;
                    str3 = bVar.f23806c;
                    str2 = bVar.f23805b;
                    str = bVar.f23804a;
                    h8.b.B(obj);
                }
                String str6 = str2;
                String str7 = str3;
                Integer num2 = num;
                String str8 = str;
                bVar.f23804a = null;
                bVar.f23805b = null;
                bVar.f23806c = null;
                bVar.f23807d = null;
                bVar.f23810g = 2;
                Object n9 = ((e0) obj).n(num2, str8, str6, str7, bVar);
                return n9 != obj2 ? obj2 : n9;
            }
        }
        bVar = new ta.b(this, cVar);
        Object obj3 = bVar.f23808e;
        Object obj22 = lf.a.f20034a;
        i5 = bVar.f23810g;
        if (i5 != 0) {
        }
        String str62 = str2;
        String str72 = str3;
        Integer num22 = num;
        String str82 = str;
        bVar.f23804a = null;
        bVar.f23805b = null;
        bVar.f23806c = null;
        bVar.f23807d = null;
        bVar.f23810g = 2;
        Object n92 = ((e0) obj3).n(num22, str82, str62, str72, bVar);
        if (n92 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r10 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[LOOP:0: B:18:0x005d->B:20:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C0(List list, String str, String str2, String str3, mf.c cVar) {
        e eVar;
        int i5;
        Iterator it;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f21585e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f21585e = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f21583c;
                Object obj2 = lf.a.f20034a;
                i5 = eVar.f21585e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    eVar.f21581a = list;
                    eVar.f21582b = str3;
                    eVar.f21585e = 1;
                    obj = d(str, str2, eVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return new Integer(((v3.e) obj).getStatusCode());
                    }
                    str3 = eVar.f21582b;
                    list = (List) eVar.f21581a;
                    h8.b.B(obj);
                }
                e0 e0Var = (e0) obj;
                ArrayList arrayList = new ArrayList(v.k(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new pa.c((hb.i) it.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(arrayList);
                eVar.f21581a = null;
                eVar.f21582b = null;
                eVar.f21585e = 2;
                obj = e0Var.C(str3, arrayList2, eVar);
            }
        }
        eVar = new e(this, cVar);
        Object obj3 = eVar.f21583c;
        Object obj22 = lf.a.f20034a;
        i5 = eVar.f21585e;
        if (i5 != 0) {
        }
        e0 e0Var2 = (e0) obj3;
        ArrayList arrayList3 = new ArrayList(v.k(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        arrayList22.addAll(arrayList3);
        eVar.f21581a = null;
        eVar.f21582b = null;
        eVar.f21585e = 2;
        obj3 = e0Var2.C(str3, arrayList22, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:13:0x0096, B:15:0x009c, B:17:0x00c6, B:19:0x00cf, B:21:0x00e1, B:23:0x00e7, B:24:0x00f0, B:26:0x00f6, B:28:0x00fc, B:29:0x0105, B:31:0x010b, B:33:0x0111, B:34:0x011a, B:36:0x0120, B:38:0x0126, B:39:0x012f, B:40:0x013a, B:42:0x0140, B:44:0x0154, B:45:0x015b, B:47:0x0161, B:48:0x0168, B:50:0x016e, B:51:0x0175, B:53:0x017b, B:54:0x0182, B:56:0x0188, B:57:0x018f, B:59:0x0195, B:60:0x019e, B:62:0x01a4, B:63:0x01ad, B:64:0x01b2, B:66:0x01be, B:68:0x01c4, B:69:0x01ca), top: B:12:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:13:0x0096, B:15:0x009c, B:17:0x00c6, B:19:0x00cf, B:21:0x00e1, B:23:0x00e7, B:24:0x00f0, B:26:0x00f6, B:28:0x00fc, B:29:0x0105, B:31:0x010b, B:33:0x0111, B:34:0x011a, B:36:0x0120, B:38:0x0126, B:39:0x012f, B:40:0x013a, B:42:0x0140, B:44:0x0154, B:45:0x015b, B:47:0x0161, B:48:0x0168, B:50:0x016e, B:51:0x0175, B:53:0x017b, B:54:0x0182, B:56:0x0188, B:57:0x018f, B:59:0x0195, B:60:0x019e, B:62:0x01a4, B:63:0x01ad, B:64:0x01b2, B:66:0x01be, B:68:0x01c4, B:69:0x01ca), top: B:12:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D0(String str, String str2, String str3, String str4, String str5, String str6, mf.c cVar) {
        xa.a aVar;
        Object obj;
        lf.a aVar2;
        int i5;
        String str7;
        String str8;
        String str9;
        String str10;
        b bVar;
        b bVar2;
        l user;
        d dVar;
        j prices;
        ha.c cVar2;
        v3.a msg4xx;
        String live;
        String express;
        String premium;
        String vip;
        if (cVar instanceof xa.a) {
            aVar = (xa.a) cVar;
            int i10 = aVar.f25454h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f25454h = i10 - Integer.MIN_VALUE;
                obj = aVar.f25452f;
                aVar2 = lf.a.f20034a;
                i5 = aVar.f25454h;
                if (i5 != 0) {
                    h8.b.B(obj);
                    aVar.f25447a = str;
                    aVar.f25448b = str2;
                    str7 = str3;
                    aVar.f25449c = str7;
                    aVar.f25450d = str4;
                    aVar.f25451e = this;
                    aVar.f25454h = 1;
                    Object d10 = d(str5, str6, aVar);
                    if (d10 != aVar2) {
                        str8 = str;
                        obj = d10;
                        str9 = str4;
                        str10 = str2;
                        bVar = this;
                    }
                    return aVar2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = aVar.f25451e;
                    h8.b.B(obj);
                    h hVar = (h) obj;
                    bVar2.getClass();
                    try {
                        user = hVar.getUser();
                        if (user == null) {
                            String email = user.getEmail();
                            String locale = user.getLocale();
                            String name = user.getName();
                            String surname = user.getSurname();
                            String avatar = user.getAvatar();
                            String token = user.getToken();
                            int premium2 = user.getPremium();
                            int express2 = user.getExpress();
                            Integer forecastsOrder = user.getForecastsOrder();
                            Integer needGoogleAuth = user.getNeedGoogleAuth();
                            int intValue = needGoogleAuth != null ? needGoogleAuth.intValue() : 0;
                            Integer alternativePayment = user.getAlternativePayment();
                            Integer cpb = user.getCpb();
                            Integer badSubs = user.getBadSubs();
                            k subscriptions = user.getSubscriptions();
                            Long I0 = (subscriptions == null || (vip = subscriptions.getVip()) == null) ? null : I0(vip);
                            k subscriptions2 = user.getSubscriptions();
                            Long I02 = (subscriptions2 == null || (premium = subscriptions2.getPremium()) == null) ? null : I0(premium);
                            k subscriptions3 = user.getSubscriptions();
                            Long I03 = (subscriptions3 == null || (express = subscriptions3.getExpress()) == null) ? null : I0(express);
                            k subscriptions4 = user.getSubscriptions();
                            dVar = new d(email, locale, name, surname, avatar, token, premium2, express2, forecastsOrder, intValue, alternativePayment, cpb, badSubs, I0, I03, I02, (subscriptions4 == null || (live = subscriptions4.getLive()) == null) ? null : I0(live), user.getModalDescEnable());
                        } else {
                            dVar = null;
                        }
                        prices = hVar.getPrices();
                        if (prices == null) {
                            Long valueOf = Long.valueOf(Instant.now().getEpochSecond());
                            i diamond = prices.getDiamond();
                            ha.b G0 = diamond != null ? G0(diamond) : null;
                            i expressItem = prices.getExpressItem();
                            ha.b G02 = expressItem != null ? G0(expressItem) : null;
                            i expressSubs = prices.getExpressSubs();
                            ha.b G03 = expressSubs != null ? G0(expressSubs) : null;
                            i premiumItem = prices.getPremiumItem();
                            ha.b G04 = premiumItem != null ? G0(premiumItem) : null;
                            i premiumSubs = prices.getPremiumSubs();
                            ha.b G05 = premiumSubs != null ? G0(premiumSubs) : null;
                            i liveWeek = prices.getLiveWeek();
                            ha.b G06 = liveWeek != null ? G0(liveWeek) : null;
                            i liveMonth = prices.getLiveMonth();
                            cVar2 = new ha.c(valueOf, G0, G02, G03, G04, G05, G06, liveMonth != null ? G0(liveMonth) : null);
                        } else {
                            cVar2 = null;
                        }
                        int statusCode = hVar.getStatusCode();
                        v3.b httpException = hVar.getHttpException();
                        return new ha.a(statusCode, (httpException != null || (msg4xx = httpException.getMsg4xx()) == null) ? null : msg4xx.toJsonString(), dVar, cVar2);
                    } catch (Exception unused) {
                        return null;
                    }
                }
                bVar = aVar.f25451e;
                str9 = aVar.f25450d;
                str7 = aVar.f25449c;
                str10 = aVar.f25448b;
                str8 = aVar.f25447a;
                h8.b.B(obj);
                aVar.f25447a = null;
                aVar.f25448b = null;
                aVar.f25449c = null;
                aVar.f25450d = null;
                aVar.f25451e = bVar;
                aVar.f25454h = 2;
                obj = ((e0) obj).E(str8, str10, str7, str9, aVar);
                if (obj != aVar2) {
                    bVar2 = bVar;
                    h hVar2 = (h) obj;
                    bVar2.getClass();
                    user = hVar2.getUser();
                    if (user == null) {
                    }
                    prices = hVar2.getPrices();
                    if (prices == null) {
                    }
                    int statusCode2 = hVar2.getStatusCode();
                    v3.b httpException2 = hVar2.getHttpException();
                    return new ha.a(statusCode2, (httpException2 != null || (msg4xx = httpException2.getMsg4xx()) == null) ? null : msg4xx.toJsonString(), dVar, cVar2);
                }
                return aVar2;
            }
        }
        aVar = new xa.a(this, cVar);
        obj = aVar.f25452f;
        aVar2 = lf.a.f20034a;
        i5 = aVar.f25454h;
        if (i5 != 0) {
        }
        aVar.f25447a = null;
        aVar.f25448b = null;
        aVar.f25449c = null;
        aVar.f25450d = null;
        aVar.f25451e = bVar;
        aVar.f25454h = 2;
        obj = ((e0) obj).E(str8, str10, str7, str9, aVar);
        if (obj != aVar2) {
        }
        return aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J0(ArrayList arrayList, String str, String str2, String str3, mf.c cVar) {
        f fVar;
        int i5;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f21590e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f21590e = i10 - Integer.MIN_VALUE;
                Object obj = fVar.f21588c;
                Object obj2 = lf.a.f20034a;
                i5 = fVar.f21590e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    fVar.f21586a = arrayList;
                    fVar.f21587b = str3;
                    fVar.f21590e = 1;
                    obj = d(str, str2, fVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return new Integer(((v3.e) obj).getStatusCode());
                    }
                    str3 = fVar.f21587b;
                    arrayList = fVar.f21586a;
                    h8.b.B(obj);
                }
                fVar.f21586a = null;
                fVar.f21587b = null;
                fVar.f21590e = 2;
                obj = ((e0) obj).G(str3, arrayList, fVar);
            }
        }
        fVar = new f(this, cVar);
        Object obj3 = fVar.f21588c;
        Object obj22 = lf.a.f20034a;
        i5 = fVar.f21590e;
        if (i5 != 0) {
        }
        fVar.f21586a = null;
        fVar.f21587b = null;
        fVar.f21590e = 2;
        obj3 = ((e0) obj3).G(str3, arrayList, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q0(String str, String str2, String str3, String str4, mf.c cVar) {
        pa.a aVar;
        int i5;
        if (cVar instanceof pa.a) {
            aVar = (pa.a) cVar;
            int i10 = aVar.f21569e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f21569e = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f21567c;
                Object obj2 = lf.a.f20034a;
                i5 = aVar.f21569e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    aVar.f21565a = str;
                    aVar.f21566b = str4;
                    aVar.f21569e = 1;
                    obj = d(str2, str3, aVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return new Integer(((v3.e) obj).getStatusCode());
                    }
                    str4 = aVar.f21566b;
                    str = aVar.f21565a;
                    h8.b.B(obj);
                }
                aVar.f21565a = null;
                aVar.f21566b = null;
                aVar.f21569e = 2;
                obj = ((e0) obj).a(str4, str, aVar);
            }
        }
        aVar = new pa.a(this, cVar);
        Object obj3 = aVar.f21567c;
        Object obj22 = lf.a.f20034a;
        i5 = aVar.f21569e;
        if (i5 != 0) {
        }
        aVar.f21565a = null;
        aVar.f21566b = null;
        aVar.f21569e = 2;
        obj3 = ((e0) obj3).a(str4, str, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable r0(String str, int i5, String str2, String str3, mf.c cVar) {
        a aVar;
        int i10;
        r0 a7;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i11 = aVar.f20865e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f20865e = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f20863c;
                lf.a aVar2 = lf.a.f20034a;
                i10 = aVar.f20865e;
                String str4 = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    aVar.f20861a = str;
                    aVar.f20862b = i5;
                    aVar.f20865e = 1;
                    obj = d(str2, str3, aVar);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        v3.h hVar = (v3.h) obj;
                        if (hVar.getStatusCode() == 200 && (a7 = hVar.a()) != null) {
                            str4 = a7.r();
                        }
                        return new Pair(new Integer(hVar.getStatusCode()), str4);
                    }
                    i5 = aVar.f20862b;
                    str = aVar.f20861a;
                    h8.b.B(obj);
                }
                aVar.f20861a = null;
                aVar.f20862b = i5;
                aVar.f20865e = 2;
                obj = ((e0) obj).f(i5, str, aVar);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f20863c;
        lf.a aVar22 = lf.a.f20034a;
        i10 = aVar.f20865e;
        String str42 = null;
        if (i10 != 0) {
        }
        aVar.f20861a = null;
        aVar.f20862b = i5;
        aVar.f20865e = 2;
        obj2 = ((e0) obj2).f(i5, str, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r0 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s0(String str, int i5, String str2, long j, String str3, String str4, String str5, String str6, mf.c cVar) {
        ra.a aVar;
        int i10;
        if (cVar instanceof ra.a) {
            aVar = (ra.a) cVar;
            int i11 = aVar.f22354i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f22354i = i11 - Integer.MIN_VALUE;
                ra.a aVar2 = aVar;
                Object obj = aVar2.f22352g;
                Object obj2 = lf.a.f20034a;
                i10 = aVar2.f22354i;
                if (i10 != 0) {
                    h8.b.B(obj);
                    aVar2.f22346a = str;
                    aVar2.f22347b = str2;
                    aVar2.f22348c = str3;
                    aVar2.f22349d = str4;
                    aVar2.f22350e = i5;
                    aVar2.f22351f = j;
                    aVar2.f22354i = 1;
                    obj = d(str5, str6, aVar2);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    j = aVar2.f22351f;
                    i5 = aVar2.f22350e;
                    str4 = aVar2.f22349d;
                    str3 = aVar2.f22348c;
                    str2 = aVar2.f22347b;
                    str = aVar2.f22346a;
                    h8.b.B(obj);
                }
                String str7 = str3;
                String str8 = str4;
                long j6 = j;
                String str9 = str2;
                int i12 = i5;
                String str10 = str;
                aVar2.f22346a = null;
                aVar2.f22347b = null;
                aVar2.f22348c = null;
                aVar2.f22349d = null;
                aVar2.f22350e = i12;
                aVar2.f22351f = j6;
                aVar2.f22354i = 2;
                Object g10 = ((e0) obj).g(str10, i12, false, str9, j6, str7, str8, aVar2);
                return g10 != obj2 ? obj2 : g10;
            }
        }
        aVar = new ra.a(this, cVar);
        ra.a aVar22 = aVar;
        Object obj3 = aVar22.f22352g;
        Object obj22 = lf.a.f20034a;
        i10 = aVar22.f22354i;
        if (i10 != 0) {
        }
        String str72 = str3;
        String str82 = str4;
        long j62 = j;
        String str92 = str2;
        int i122 = i5;
        String str102 = str;
        aVar22.f22346a = null;
        aVar22.f22347b = null;
        aVar22.f22348c = null;
        aVar22.f22349d = null;
        aVar22.f22350e = i122;
        aVar22.f22351f = j62;
        aVar22.f22354i = 2;
        Object g102 = ((e0) obj3).g(str102, i122, false, str92, j62, str72, str82, aVar22);
        if (g102 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t0(String str, int i5, String str2, String str3, mf.c cVar) {
        qa.a aVar;
        Object obj;
        lf.a aVar2;
        int i10;
        int i11;
        Object obj2;
        b bVar;
        b bVar2;
        z3.d dVar;
        v3.b httpException;
        v3.a msg4xx;
        if (cVar instanceof qa.a) {
            aVar = (qa.a) cVar;
            int i12 = aVar.f22075f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f22075f = i12 - Integer.MIN_VALUE;
                obj = aVar.f22073d;
                aVar2 = lf.a.f20034a;
                i10 = aVar.f22075f;
                String str4 = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    aVar.f22070a = str;
                    aVar.f22071b = this;
                    i11 = i5;
                    aVar.f22072c = i11;
                    aVar.f22075f = 1;
                    Object d10 = d(str2, str3, aVar);
                    if (d10 != aVar2) {
                        obj2 = d10;
                        bVar = this;
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = aVar.f22071b;
                    h8.b.B(obj);
                    dVar = (z3.d) obj;
                    bVar2.getClass();
                    if (dVar == null || dVar.getPostNews() == null) {
                        return null;
                    }
                    z3.c postNews = dVar.getPostNews();
                    int id2 = postNews == null ? postNews.getId() : -1;
                    z3.c postNews2 = dVar.getPostNews();
                    int date = postNews2 == null ? (int) (postNews2.getDate() / 1000) : 0;
                    z3.c postNews3 = dVar.getPostNews();
                    String title = postNews3 == null ? postNews3.getTitle() : null;
                    z3.c postNews4 = dVar.getPostNews();
                    String picture = postNews4 == null ? postNews4.getPicture() : null;
                    z3.c postNews5 = dVar.getPostNews();
                    ia.a aVar3 = new ia.a(id2, date, title, picture, postNews5 == null ? postNews5.getBody() : null);
                    int statusCode = dVar.getStatusCode();
                    List c2 = t.c(aVar3);
                    httpException = dVar.getHttpException();
                    if (httpException != null && (msg4xx = httpException.getMsg4xx()) != null) {
                        str4 = msg4xx.toJsonString();
                    }
                    return new ia.b(str4, c2, statusCode);
                }
                int i13 = aVar.f22072c;
                bVar = aVar.f22071b;
                String str5 = aVar.f22070a;
                h8.b.B(obj);
                i11 = i13;
                str = str5;
                obj2 = obj;
                aVar.f22070a = null;
                aVar.f22071b = bVar;
                aVar.f22072c = i11;
                aVar.f22075f = 2;
                obj = ((e0) obj2).z(i11, str, aVar);
                if (obj != aVar2) {
                    bVar2 = bVar;
                    dVar = (z3.d) obj;
                    bVar2.getClass();
                    if (dVar == null) {
                        z3.c postNews6 = dVar.getPostNews();
                        int id22 = postNews6 == null ? postNews6.getId() : -1;
                        z3.c postNews22 = dVar.getPostNews();
                        int date2 = postNews22 == null ? (int) (postNews22.getDate() / 1000) : 0;
                        z3.c postNews32 = dVar.getPostNews();
                        if (postNews32 == null) {
                        }
                        z3.c postNews42 = dVar.getPostNews();
                        if (postNews42 == null) {
                        }
                        z3.c postNews52 = dVar.getPostNews();
                        ia.a aVar32 = new ia.a(id22, date2, title, picture, postNews52 == null ? postNews52.getBody() : null);
                        int statusCode2 = dVar.getStatusCode();
                        List c22 = t.c(aVar32);
                        httpException = dVar.getHttpException();
                        if (httpException != null) {
                            str4 = msg4xx.toJsonString();
                        }
                        return new ia.b(str4, c22, statusCode2);
                    }
                    return null;
                }
                return aVar2;
            }
        }
        aVar = new qa.a(this, cVar);
        obj = aVar.f22073d;
        aVar2 = lf.a.f20034a;
        i10 = aVar.f22075f;
        String str42 = null;
        if (i10 != 0) {
        }
        aVar.f22070a = null;
        aVar.f22071b = bVar;
        aVar.f22072c = i11;
        aVar.f22075f = 2;
        obj = ((e0) obj2).z(i11, str, aVar);
        if (obj != aVar2) {
        }
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u0(String str, int i5, int i10, String str2, String str3, mf.c cVar) {
        qa.b bVar;
        Object obj;
        lf.a aVar;
        int i11;
        int i12;
        String str4;
        int i13;
        b bVar2;
        b bVar3;
        z3.h hVar;
        ArrayList arrayList;
        v3.a msg4xx;
        if (cVar instanceof qa.b) {
            bVar = (qa.b) cVar;
            int i14 = bVar.f22082g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f22082g = i14 - Integer.MIN_VALUE;
                obj = bVar.f22080e;
                aVar = lf.a.f20034a;
                i11 = bVar.f22082g;
                String str5 = null;
                if (i11 != 0) {
                    h8.b.B(obj);
                    bVar.f22076a = str;
                    bVar.f22077b = this;
                    bVar.f22078c = i5;
                    i12 = i10;
                    bVar.f22079d = i12;
                    bVar.f22082g = 1;
                    Object d10 = d(str2, str3, bVar);
                    if (d10 != aVar) {
                        str4 = str;
                        i13 = i5;
                        obj = d10;
                        bVar2 = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar3 = bVar.f22077b;
                    h8.b.B(obj);
                    hVar = (z3.h) obj;
                    bVar3.getClass();
                    if (hVar != null) {
                        return null;
                    }
                    List<g> postsNews = hVar.getPostsNews();
                    if (postsNews != null) {
                        arrayList = new ArrayList();
                        for (g gVar : postsNews) {
                            ia.a aVar2 = gVar == null ? null : new ia.a(gVar.getId(), (int) (gVar.getDate() / 1000), gVar.getTitle(), gVar.getPicture(), null);
                            if (aVar2 != null) {
                                arrayList.add(aVar2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    int statusCode = hVar.getStatusCode();
                    v3.b httpException = hVar.getHttpException();
                    if (httpException != null && (msg4xx = httpException.getMsg4xx()) != null) {
                        str5 = msg4xx.toJsonString();
                    }
                    return new ia.b(str5, arrayList, statusCode);
                }
                int i15 = bVar.f22079d;
                int i16 = bVar.f22078c;
                b bVar4 = bVar.f22077b;
                str4 = bVar.f22076a;
                h8.b.B(obj);
                i12 = i15;
                i13 = i16;
                bVar2 = bVar4;
                bVar.f22076a = null;
                bVar.f22077b = bVar2;
                bVar.f22078c = i13;
                bVar.f22079d = i12;
                bVar.f22082g = 2;
                obj = ((e0) obj).x(str4, i13, i12, bVar);
                if (obj != aVar) {
                    bVar3 = bVar2;
                    hVar = (z3.h) obj;
                    bVar3.getClass();
                    if (hVar != null) {
                    }
                }
                return aVar;
            }
        }
        bVar = new qa.b(this, cVar);
        obj = bVar.f22080e;
        aVar = lf.a.f20034a;
        i11 = bVar.f22082g;
        String str52 = null;
        if (i11 != 0) {
        }
        bVar.f22076a = null;
        bVar.f22077b = bVar2;
        bVar.f22078c = i13;
        bVar.f22079d = i12;
        bVar.f22082g = 2;
        obj = ((e0) obj).x(str4, i13, i12, bVar);
        if (obj != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v0(String str, String str2, String str3, mf.c cVar) {
        wa.a aVar;
        int i5;
        if (cVar instanceof wa.a) {
            aVar = (wa.a) cVar;
            int i10 = aVar.f25040d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f25040d = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f25038b;
                Object obj2 = lf.a.f20034a;
                i5 = aVar.f25040d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    aVar.f25037a = str3;
                    aVar.f25040d = 1;
                    obj = d(str, str2, aVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return new wa.b((u3.d) obj);
                    }
                    str3 = aVar.f25037a;
                    h8.b.B(obj);
                }
                aVar.f25037a = null;
                aVar.f25040d = 2;
                obj = ((e0) obj).o(str3, aVar);
            }
        }
        aVar = new wa.a(this, cVar);
        Object obj3 = aVar.f25038b;
        Object obj22 = lf.a.f20034a;
        i5 = aVar.f25040d;
        if (i5 != 0) {
        }
        aVar.f25037a = null;
        aVar.f25040d = 2;
        obj3 = ((e0) obj3).o(str3, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w0(String str, String str2, String str3, String str4, mf.c cVar) {
        va.a aVar;
        Object obj;
        lf.a aVar2;
        int i5;
        String str5;
        b bVar;
        b bVar2;
        if (cVar instanceof va.a) {
            aVar = (va.a) cVar;
            int i10 = aVar.f24542f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f24542f = i10 - Integer.MIN_VALUE;
                obj = aVar.f24540d;
                aVar2 = lf.a.f20034a;
                i5 = aVar.f24542f;
                if (i5 != 0) {
                    h8.b.B(obj);
                    aVar.f24537a = str;
                    aVar.f24538b = str2;
                    aVar.f24539c = this;
                    aVar.f24542f = 1;
                    obj = d(str3, str4, aVar);
                    if (obj != aVar2) {
                        str5 = str2;
                        bVar = this;
                    }
                    return aVar2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = aVar.f24539c;
                    h8.b.B(obj);
                    bVar2.getClass();
                    return E0((h) obj);
                }
                b bVar3 = aVar.f24539c;
                String str6 = aVar.f24538b;
                String str7 = aVar.f24537a;
                h8.b.B(obj);
                bVar = bVar3;
                str = str7;
                str5 = str6;
                aVar.f24537a = null;
                aVar.f24538b = null;
                aVar.f24539c = bVar;
                aVar.f24542f = 2;
                obj = ((e0) obj).A(str, str5, aVar);
                if (obj != aVar2) {
                    bVar2 = bVar;
                    bVar2.getClass();
                    return E0((h) obj);
                }
                return aVar2;
            }
        }
        aVar = new va.a(this, cVar);
        obj = aVar.f24540d;
        aVar2 = lf.a.f20034a;
        i5 = aVar.f24542f;
        if (i5 != 0) {
        }
        aVar.f24537a = null;
        aVar.f24538b = null;
        aVar.f24539c = bVar;
        aVar.f24542f = 2;
        obj = ((e0) obj).A(str, str5, aVar);
        if (obj != aVar2) {
        }
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x0(String str, String str2, String str3, mf.c cVar) {
        va.b bVar;
        Object obj;
        lf.a aVar;
        int i5;
        b bVar2;
        b bVar3;
        if (cVar instanceof va.b) {
            bVar = (va.b) cVar;
            int i10 = bVar.f24547e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f24547e = i10 - Integer.MIN_VALUE;
                obj = bVar.f24545c;
                aVar = lf.a.f20034a;
                i5 = bVar.f24547e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    bVar.f24543a = str;
                    bVar.f24544b = this;
                    bVar.f24547e = 1;
                    obj = d(str2, str3, bVar);
                    if (obj != aVar) {
                        bVar2 = this;
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar3 = bVar.f24544b;
                    h8.b.B(obj);
                    bVar3.getClass();
                    return E0((h) obj);
                }
                b bVar4 = bVar.f24544b;
                String str4 = bVar.f24543a;
                h8.b.B(obj);
                bVar2 = bVar4;
                str = str4;
                bVar.f24543a = null;
                bVar.f24544b = bVar2;
                bVar.f24547e = 2;
                obj = ((e0) obj).s(str, bVar);
                if (obj != aVar) {
                    bVar3 = bVar2;
                    bVar3.getClass();
                    return E0((h) obj);
                }
                return aVar;
            }
        }
        bVar = new va.b(this, cVar);
        obj = bVar.f24545c;
        aVar = lf.a.f20034a;
        i5 = bVar.f24547e;
        if (i5 != 0) {
        }
        bVar.f24543a = null;
        bVar.f24544b = bVar2;
        bVar.f24547e = 2;
        obj = ((e0) obj).s(str, bVar);
        if (obj != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r11 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[LOOP:0: B:18:0x005b->B:20:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y0(ArrayList arrayList, String str, String str2, String str3, mf.c cVar) {
        pa.d dVar;
        int i5;
        if (cVar instanceof pa.d) {
            dVar = (pa.d) cVar;
            int i10 = dVar.f21580e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f21580e = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f21578c;
                Object obj2 = lf.a.f20034a;
                i5 = dVar.f21580e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    dVar.f21576a = arrayList;
                    dVar.f21577b = str3;
                    dVar.f21580e = 1;
                    obj = d(str, str2, dVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return new Integer(((v3.e) obj).getStatusCode());
                    }
                    str3 = dVar.f21577b;
                    arrayList = dVar.f21576a;
                    h8.b.B(obj);
                }
                e0 e0Var = (e0) obj;
                ArrayList arrayList2 = new ArrayList(v.k(arrayList, 10));
                for (hb.a aVar : arrayList) {
                    pa.b bVar = new pa.b();
                    bVar.f21570a = aVar.f10468b;
                    bVar.f21571b = aVar.f10469c;
                    bVar.f21572c = aVar.f10470d;
                    arrayList2.add(bVar);
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(arrayList2);
                dVar.f21576a = null;
                dVar.f21577b = null;
                dVar.f21580e = 2;
                obj = e0Var.v(str3, arrayList3, dVar);
            }
        }
        dVar = new pa.d(this, cVar);
        Object obj3 = dVar.f21578c;
        Object obj22 = lf.a.f20034a;
        i5 = dVar.f21580e;
        if (i5 != 0) {
        }
        e0 e0Var2 = (e0) obj3;
        ArrayList arrayList22 = new ArrayList(v.k(arrayList, 10));
        while (r7.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList();
        arrayList32.addAll(arrayList22);
        dVar.f21576a = null;
        dVar.f21577b = null;
        dVar.f21580e = 2;
        obj3 = e0Var2.v(str3, arrayList32, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r0 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z0(String str, int i5, String str2, String str3, mf.c cVar) {
        ra.b bVar;
        int i10;
        if (cVar instanceof ra.b) {
            bVar = (ra.b) cVar;
            int i11 = bVar.f22359e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f22359e = i11 - Integer.MIN_VALUE;
                ra.b bVar2 = bVar;
                Object obj = bVar2.f22357c;
                Object obj2 = lf.a.f20034a;
                i10 = bVar2.f22359e;
                if (i10 != 0) {
                    h8.b.B(obj);
                    bVar2.f22355a = str;
                    bVar2.f22356b = i5;
                    bVar2.f22359e = 1;
                    obj = d(str2, str3, bVar2);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    i5 = bVar2.f22356b;
                    str = bVar2.f22355a;
                    h8.b.B(obj);
                }
                int i12 = i5;
                bVar2.f22355a = null;
                bVar2.f22356b = i12;
                bVar2.f22359e = 2;
                Object g10 = ((e0) obj).g(str, i12, true, "", 0L, "", "", bVar2);
                return g10 != obj2 ? obj2 : g10;
            }
        }
        bVar = new ra.b(this, cVar);
        ra.b bVar22 = bVar;
        Object obj3 = bVar22.f22357c;
        Object obj22 = lf.a.f20034a;
        i10 = bVar22.f22359e;
        if (i10 != 0) {
        }
        int i122 = i5;
        bVar22.f22355a = null;
        bVar22.f22356b = i122;
        bVar22.f22359e = 2;
        Object g102 = ((e0) obj3).g(str, i122, true, "", 0L, "", "", bVar22);
        if (g102 != obj22) {
        }
    }
}
