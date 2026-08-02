package mb0;

import Sc.o;
import Tc.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb0.C7333a;
import kb0.EnumC7626a;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.host.config.external.AppId;

/* renamed from: mb0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8124b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f74709a;

    /* renamed from: mb0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74710a;

        static {
            int[] iArr = new int[EnumC7626a.values().length];
            try {
                iArr[EnumC7626a.CnProd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7626a.CnStg.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7626a.Prod.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7626a.Stg.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f74710a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x039b A[SYNTHETIC] */
    static {
        String address;
        String address2;
        String address3;
        String address4;
        String address5;
        String address6;
        String address7;
        String address8;
        String address9;
        String address10;
        String address11;
        String address12;
        Pair pair = new Pair(AppId.BX.INSTANCE, f());
        Pair pair2 = new Pair(AppId.Travel.INSTANCE, f());
        Pair pair3 = new Pair(AppId.Fresh.INSTANCE, f());
        Pair pair4 = new Pair(AppId.Select.INSTANCE, f());
        Pair pair5 = new Pair(AppId.MPX.INSTANCE, f());
        Pair pair6 = new Pair(AppId.Test.INSTANCE, f());
        AppId.SX sx2 = AppId.SX.INSTANCE;
        d builder = new d();
        Iterator<E> it = EnumC7626a.a().iterator();
        while (true) {
            int i11 = 2;
            int i12 = 1;
            if (it.hasNext()) {
                EnumC7626a enumC7626a = (EnumC7626a) it.next();
                int i13 = a.f74710a[enumC7626a.ordinal()];
                if (i13 == 1) {
                    address12 = "api-seller-mobile.ozonru.cn";
                } else if (i13 == 2) {
                    address12 = "api-seller-mobile-cn.stg.ozonru.me";
                } else if (i13 == 3) {
                    address12 = "api-seller-mobile.ozon.ru";
                } else {
                    if (i13 != 4) {
                        throw new o();
                    }
                    address12 = "api-seller-mobile.stg.ozonru.me";
                }
                Intrinsics.checkNotNullParameter(address12, "address");
                builder.put(enumC7626a, C7333a.a(address12));
            } else {
                Intrinsics.checkNotNullParameter(builder, "builder");
                Pair pair7 = new Pair(sx2, builder.u());
                AppId.Wire wire = AppId.Wire.INSTANCE;
                d builder2 = new d();
                Iterator<E> it2 = EnumC7626a.a().iterator();
                while (true) {
                    String str = null;
                    if (!it2.hasNext()) {
                        Intrinsics.checkNotNullParameter(builder2, "builder");
                        Pair pair8 = new Pair(wire, builder2.u());
                        AppId.Hire hire = AppId.Hire.INSTANCE;
                        d builder3 = new d();
                        for (EnumC7626a enumC7626a2 : EnumC7626a.a()) {
                            int i14 = a.f74710a[enumC7626a2.ordinal()];
                            if (i14 == i12 || i14 == 2) {
                                address11 = null;
                            } else if (i14 == 3) {
                                address11 = "ojob.ozon.ru";
                            } else {
                                if (i14 != 4) {
                                    throw new o();
                                }
                                address11 = "ojob.stg.ozonru.me";
                            }
                            if (address11 != null) {
                                Intrinsics.checkNotNullParameter(address11, "address");
                                builder3.put(enumC7626a2, C7333a.a(address11));
                            }
                            i12 = 1;
                        }
                        Intrinsics.checkNotNullParameter(builder3, "builder");
                        Pair pair9 = new Pair(hire, builder3.u());
                        AppId.PVZ pvz = AppId.PVZ.INSTANCE;
                        d builder4 = new d();
                        for (EnumC7626a enumC7626a3 : EnumC7626a.a()) {
                            int i15 = a.f74710a[enumC7626a3.ordinal()];
                            Pair pair10 = pair;
                            if (i15 == 1 || i15 == 2) {
                                address10 = null;
                            } else if (i15 == 3) {
                                address10 = "api-turbo-pvz.ozon.ru";
                            } else {
                                if (i15 != 4) {
                                    throw new o();
                                }
                                address10 = "api-turbo-pvz.stg.ozonru.me";
                            }
                            if (address10 != null) {
                                Intrinsics.checkNotNullParameter(address10, "address");
                                builder4.put(enumC7626a3, C7333a.a(address10));
                            }
                            pair = pair10;
                        }
                        Pair pair11 = pair;
                        Intrinsics.checkNotNullParameter(builder4, "builder");
                        Pair pair12 = pair7;
                        Pair pair13 = new Pair(pvz, builder4.u());
                        AppId.Delivery delivery = AppId.Delivery.INSTANCE;
                        d builder5 = new d();
                        for (EnumC7626a enumC7626a4 : EnumC7626a.a()) {
                            int i16 = a.f74710a[enumC7626a4.ordinal()];
                            Pair pair14 = pair12;
                            if (i16 == 1 || i16 == 2) {
                                address9 = null;
                            } else if (i16 == 3) {
                                address9 = "api-courier.ozon.ru";
                            } else {
                                if (i16 != 4) {
                                    throw new o();
                                }
                                address9 = "api-courier-ozon-delivery-stg.ozonru.me";
                            }
                            if (address9 != null) {
                                Intrinsics.checkNotNullParameter(address9, "address");
                                builder5.put(enumC7626a4, C7333a.a(address9));
                            }
                            pair12 = pair14;
                        }
                        Pair pair15 = pair12;
                        Intrinsics.checkNotNullParameter(builder5, "builder");
                        Pair pair16 = pair9;
                        Pair pair17 = new Pair(delivery, builder5.u());
                        AppId.Flex flex = AppId.Flex.INSTANCE;
                        d builder6 = new d();
                        for (EnumC7626a enumC7626a5 : EnumC7626a.a()) {
                            int i17 = a.f74710a[enumC7626a5.ordinal()];
                            Pair pair18 = pair16;
                            if (i17 == 1 || i17 == 2) {
                                address8 = null;
                            } else if (i17 == 3) {
                                address8 = "flex-courier.ozon.ru";
                            } else {
                                if (i17 != 4) {
                                    throw new o();
                                }
                                address8 = "flex-courier.stg.ozonru.me";
                            }
                            if (address8 != null) {
                                Intrinsics.checkNotNullParameter(address8, "address");
                                builder6.put(enumC7626a5, C7333a.a(address8));
                            }
                            pair16 = pair18;
                        }
                        Pair pair19 = pair16;
                        Intrinsics.checkNotNullParameter(builder6, "builder");
                        Pair pair20 = new Pair(flex, builder6.u());
                        Pair pair21 = new Pair(AppId.OzonBankB2C.INSTANCE, e());
                        Pair pair22 = new Pair(AppId.OzonBankB2B.INSTANCE, e());
                        Pair pair23 = new Pair(AppId.OzonBankPVZ.INSTANCE, e());
                        AppId.Shipping shipping = AppId.Shipping.INSTANCE;
                        d builder7 = new d();
                        for (EnumC7626a enumC7626a6 : EnumC7626a.a()) {
                            Pair pair24 = pair23;
                            Pair pair25 = pair2;
                            int i18 = a.f74710a[enumC7626a6.ordinal()];
                            Pair pair26 = pair3;
                            if (i18 == 1 || i18 == 2) {
                                address7 = null;
                            } else if (i18 == 3) {
                                address7 = "vozi.ozon.ru";
                            } else {
                                if (i18 != 4) {
                                    throw new o();
                                }
                                address7 = "vozi.stg.ozonru.me";
                            }
                            if (address7 != null) {
                                Intrinsics.checkNotNullParameter(address7, "address");
                                builder7.put(enumC7626a6, C7333a.a(address7));
                            }
                            pair3 = pair26;
                            pair23 = pair24;
                            pair2 = pair25;
                        }
                        Pair pair27 = pair23;
                        Pair pair28 = pair2;
                        Pair pair29 = pair3;
                        Intrinsics.checkNotNullParameter(builder7, "builder");
                        Pair pair30 = new Pair(shipping, builder7.u());
                        AppId.Design design = AppId.Design.INSTANCE;
                        d builder8 = new d();
                        Iterator it3 = EnumC7626a.a().iterator();
                        while (it3.hasNext()) {
                            EnumC7626a enumC7626a7 = (EnumC7626a) it3.next();
                            Pair pair31 = pair30;
                            int i19 = a.f74710a[enumC7626a7.ordinal()];
                            Iterator it4 = it3;
                            if (i19 == 1 || i19 == 2) {
                                address6 = null;
                            } else if (i19 == 3) {
                                address6 = "design.ozon.ru";
                            } else {
                                if (i19 != 4) {
                                    throw new o();
                                }
                                address6 = "design.stg.ozonru.me";
                            }
                            if (address6 != null) {
                                Intrinsics.checkNotNullParameter(address6, "address");
                                builder8.put(enumC7626a7, C7333a.a(address6));
                            }
                            it3 = it4;
                            pair30 = pair31;
                        }
                        Pair pair32 = pair30;
                        Intrinsics.checkNotNullParameter(builder8, "builder");
                        Pair pair33 = new Pair(design, builder8.u());
                        AppId.Maple maple = AppId.Maple.INSTANCE;
                        d builder9 = new d();
                        Iterator it5 = EnumC7626a.a().iterator();
                        while (it5.hasNext()) {
                            EnumC7626a enumC7626a8 = (EnumC7626a) it5.next();
                            Pair pair34 = pair33;
                            int i21 = a.f74710a[enumC7626a8.ordinal()];
                            Iterator it6 = it5;
                            if (i21 != 1 && i21 != 2) {
                                if (i21 == 3) {
                                    address5 = "api-fresh-courier.ozon.ru";
                                    if (address5 == null) {
                                        Intrinsics.checkNotNullParameter(address5, "address");
                                        builder9.put(enumC7626a8, C7333a.a(address5));
                                    }
                                    it5 = it6;
                                    pair33 = pair34;
                                } else if (i21 != 4) {
                                    throw new o();
                                }
                            }
                            address5 = null;
                            if (address5 == null) {
                            }
                            it5 = it6;
                            pair33 = pair34;
                        }
                        Pair pair35 = pair33;
                        Intrinsics.checkNotNullParameter(builder9, "builder");
                        Pair pair36 = new Pair(maple, builder9.u());
                        AppId.Netzone netzone = AppId.Netzone.INSTANCE;
                        d builder10 = new d();
                        Iterator it7 = EnumC7626a.a().iterator();
                        while (it7.hasNext()) {
                            EnumC7626a enumC7626a9 = (EnumC7626a) it7.next();
                            Pair pair37 = pair36;
                            int i22 = a.f74710a[enumC7626a9.ordinal()];
                            Iterator it8 = it7;
                            if (i22 == 1 || i22 == 2) {
                                address4 = null;
                            } else if (i22 == 3) {
                                address4 = "sso.o3.ru";
                            } else {
                                if (i22 != 4) {
                                    throw new o();
                                }
                                address4 = "sso-test.o3.ru";
                            }
                            if (address4 != null) {
                                Intrinsics.checkNotNullParameter(address4, "address");
                                builder10.put(enumC7626a9, C7333a.a(address4));
                            }
                            it7 = it8;
                            pair36 = pair37;
                        }
                        Pair pair38 = pair36;
                        Intrinsics.checkNotNullParameter(builder10, "builder");
                        Pair pair39 = new Pair(netzone, builder10.u());
                        AppId.Profit profit = AppId.Profit.INSTANCE;
                        d builder11 = new d();
                        Iterator it9 = EnumC7626a.a().iterator();
                        while (it9.hasNext()) {
                            EnumC7626a enumC7626a10 = (EnumC7626a) it9.next();
                            Pair pair40 = pair39;
                            int i23 = a.f74710a[enumC7626a10.ordinal()];
                            Iterator it10 = it9;
                            if (i23 == 1 || i23 == 2) {
                                address3 = null;
                            } else if (i23 == 3) {
                                address3 = "task.ozon.ru";
                            } else {
                                if (i23 != 4) {
                                    throw new o();
                                }
                                address3 = "task.stg.ozonru.me";
                            }
                            if (address3 != null) {
                                Intrinsics.checkNotNullParameter(address3, "address");
                                builder11.put(enumC7626a10, C7333a.a(address3));
                            }
                            it9 = it10;
                            pair39 = pair40;
                        }
                        Pair pair41 = pair39;
                        Intrinsics.checkNotNullParameter(builder11, "builder");
                        Pair pair42 = new Pair(profit, builder11.u());
                        AppId.TravelExtranetApp travelExtranetApp = AppId.TravelExtranetApp.INSTANCE;
                        d builder12 = new d();
                        Iterator it11 = EnumC7626a.a().iterator();
                        while (it11.hasNext()) {
                            EnumC7626a enumC7626a11 = (EnumC7626a) it11.next();
                            Pair pair43 = pair42;
                            int i24 = a.f74710a[enumC7626a11.ordinal()];
                            Iterator it12 = it11;
                            if (i24 == 1 || i24 == 2) {
                                address2 = null;
                            } else if (i24 == 3) {
                                address2 = "api-extranet.ozon.ru";
                            } else {
                                if (i24 != 4) {
                                    throw new o();
                                }
                                address2 = "api-extranet.stg.ozonru.me";
                            }
                            if (address2 != null) {
                                Intrinsics.checkNotNullParameter(address2, "address");
                                builder12.put(enumC7626a11, C7333a.a(address2));
                            }
                            it11 = it12;
                            pair42 = pair43;
                        }
                        Pair pair44 = pair42;
                        Intrinsics.checkNotNullParameter(builder12, "builder");
                        Pair pair45 = new Pair(travelExtranetApp, builder12.u());
                        AppId.OzonLogista ozonLogista = AppId.OzonLogista.INSTANCE;
                        d builder13 = new d();
                        Iterator it13 = EnumC7626a.a().iterator();
                        while (it13.hasNext()) {
                            EnumC7626a enumC7626a12 = (EnumC7626a) it13.next();
                            Pair pair46 = pair45;
                            int i25 = a.f74710a[enumC7626a12.ordinal()];
                            Iterator it14 = it13;
                            if (i25 == 1) {
                                address = "api-logista-internal.o3t.ru";
                            } else if (i25 == 2) {
                                address = "api-logista-internal.stg.o3t.me";
                            } else if (i25 == 3) {
                                address = "api-logista.o3t.ru";
                            } else {
                                if (i25 != 4) {
                                    throw new o();
                                }
                                address = "api-logista.stg.o3t.me";
                            }
                            Intrinsics.checkNotNullParameter(address, "address");
                            builder13.put(enumC7626a12, C7333a.a(address));
                            it13 = it14;
                            pair45 = pair46;
                        }
                        Intrinsics.checkNotNullParameter(builder13, "builder");
                        f74709a = U.j(pair11, pair28, pair29, pair4, pair5, pair6, pair15, pair8, pair19, pair13, pair17, pair20, pair21, pair22, pair27, pair32, pair35, pair38, pair41, pair44, pair45, new Pair(ozonLogista, builder13.u()));
                        return;
                    }
                    EnumC7626a enumC7626a13 = (EnumC7626a) it2.next();
                    int i26 = a.f74710a[enumC7626a13.ordinal()];
                    if (i26 != 1 && i26 != i11) {
                        if (i26 == 3) {
                            str = "wireapp-api.ozon.ru";
                        } else {
                            if (i26 != 4) {
                                throw new o();
                            }
                            str = "accounts-service-stg.ozonru.me";
                        }
                    }
                    String address13 = str;
                    if (address13 != null) {
                        Intrinsics.checkNotNullParameter(address13, "address");
                        builder2.put(enumC7626a13, C7333a.a(address13));
                    }
                    i11 = 2;
                }
            }
        }
    }

    @NotNull
    public static final List<EnumC7626a> a(@NotNull Aa0.a hostAppId) {
        Intrinsics.checkNotNullParameter(hostAppId, "hostAppId");
        return C7714v.U0(c(hostAppId).keySet());
    }

    @NotNull
    public static final String b(@NotNull Map<EnumC7626a, C7333a> map, @NotNull EnumC7626a env) {
        String b11;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(env, "env");
        int i11 = a.f74710a[env.ordinal()];
        if (i11 == 1) {
            C7333a c7333a = map.get(env);
            b11 = c7333a != null ? c7333a.b() : null;
            return b11 == null ? b(map, EnumC7626a.Prod) : b11;
        }
        if (i11 == 2) {
            C7333a c7333a2 = map.get(env);
            b11 = c7333a2 != null ? c7333a2.b() : null;
            return b11 == null ? b(map, EnumC7626a.Stg) : b11;
        }
        if (i11 != 3 && i11 != 4) {
            throw new o();
        }
        C7333a c7333a3 = map.get(env);
        if (c7333a3 != null) {
            return c7333a3.b();
        }
        throw new IllegalStateException("Для окружений Stg и Prod домен не может быть пустым");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    private static final Map<EnumC7626a, C7333a> c(Aa0.a aVar) {
        Object obj = f74709a.get(aVar);
        if (obj != null) {
            return (Map) obj;
        }
        throw new IllegalStateException(("Host domain info for " + aVar + " is not present").toString());
    }

    @NotNull
    public static final String d(@NotNull AppId hostAppId, @NotNull EnumC7626a env) {
        Intrinsics.checkNotNullParameter(hostAppId, "hostAppId");
        Intrinsics.checkNotNullParameter(env, "env");
        return b(c(hostAppId), env);
    }

    private static final d e() {
        String address;
        d builder = new d();
        for (EnumC7626a enumC7626a : EnumC7626a.a()) {
            int i11 = a.f74710a[enumC7626a.ordinal()];
            if (i11 == 1 || i11 == 2) {
                address = null;
            } else if (i11 == 3) {
                address = "ft-common-ozon-sdk.ozon.ru";
            } else {
                if (i11 != 4) {
                    throw new o();
                }
                address = "ft-common-ozon-sdk.stg.ozonru.me";
            }
            if (address != null) {
                Intrinsics.checkNotNullParameter(address, "address");
                builder.put(enumC7626a, C7333a.a(address));
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    private static final d f() {
        String address;
        d builder = new d();
        for (EnumC7626a enumC7626a : EnumC7626a.a()) {
            int i11 = a.f74710a[enumC7626a.ordinal()];
            if (i11 == 1 || i11 == 2) {
                address = null;
            } else if (i11 == 3) {
                address = "api.ozon.ru";
            } else {
                if (i11 != 4) {
                    throw new o();
                }
                address = "api.stg.ozonru.me";
            }
            if (address != null) {
                Intrinsics.checkNotNullParameter(address, "address");
                builder.put(enumC7626a, C7333a.a(address));
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }
}
