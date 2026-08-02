package bet.prediction.response.vtenth;

import androidx.appcompat.widget.c1;
import bet.prediction.response.vtenth.AdvertApi;
import io.sentry.config.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.b;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;
import x3.c;
import x3.d;
import x3.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0002&'B!\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000eR\u0014\u0010%\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Lbet/prediction/response/vtenth/AdvertApi;", "Lx3/e;", "Lio/sentry/config/a;", "", "", "Lbet/prediction/response/vtenth/AdvertApi$Advert;", "advertsList", "Lv3/b;", "httpException", "<init>", "(Ljava/util/List;Lv3/b;)V", "map", "()Lx3/e;", "component1", "()Ljava/util/List;", "component2", "()Lv3/b;", "copy", "(Ljava/util/List;Lv3/b;)Lbet/prediction/response/vtenth/AdvertApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAdvertsList", "Lv3/b;", "getHttpException", "Lx3/d;", "getAdverts", "adverts", "getStatusCode", "statusCode", "AdvertOption", "Advert", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdvertApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvertApi.kt\nbet/prediction/response/vtenth/AdvertApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1617#2,9:99\n1869#2:108\n1870#2:110\n1626#2:111\n1#3:109\n*S KotlinDebug\n*F\n+ 1 AdvertApi.kt\nbet/prediction/response/vtenth/AdvertApi\n*L\n81#1:99,9\n81#1:108\n81#1:110\n81#1:111\n81#1:109\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class AdvertApi extends a implements e {

    @b("data")
    @Nullable
    private final List<Advert> advertsList;

    @Nullable
    private final v3.b httpException;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$Bw\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0087\u0001\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006%"}, d2 = {"Lbet/prediction/response/vtenth/AdvertApi$Advert;", "", "bottomNavigationBet", "", "Lbet/prediction/response/vtenth/AdvertApi$AdvertOption;", "headerBet", "statusForecastsBet", "bottomForecastsBet", "expressForecastsBet", "liveButtonBet", "afterPaymentCpBet", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBottomNavigationBet", "()Ljava/util/List;", "getHeaderBet", "getStatusForecastsBet", "getBottomForecastsBet", "getExpressForecastsBet", "getLiveButtonBet", "getAfterPaymentCpBet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Advert {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b("after_payment_cp")
        @Nullable
        private final List<AdvertOption> afterPaymentCpBet;

        @b("bottom-forecasts")
        @Nullable
        private final List<AdvertOption> bottomForecastsBet;

        @b("bottom-navigation")
        @Nullable
        private final List<AdvertOption> bottomNavigationBet;

        @b("express-forecasts")
        @Nullable
        private final List<AdvertOption> expressForecastsBet;

        @b("header")
        @Nullable
        private final List<AdvertOption> headerBet;

        @b("live-button")
        @Nullable
        private final List<AdvertOption> liveButtonBet;

        @b("status-forecasts")
        @Nullable
        private final List<AdvertOption> statusForecastsBet;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbet/prediction/response/vtenth/AdvertApi$Advert$Companion;", "", "<init>", "()V", "Lbet/prediction/response/vtenth/AdvertApi$Advert;", "Lx3/d;", "mapper", "(Lbet/prediction/response/vtenth/AdvertApi$Advert;)Lx3/d;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final d mapper(@Nullable final Advert advert) {
                if (advert == null) {
                    return null;
                }
                return new d(advert) { // from class: bet.prediction.response.vtenth.AdvertApi$Advert$Companion$mapper$1
                    private final List<c> afterPaymentCp;
                    private final List<c> bottomForecasts;
                    private final List<c> bottomNavigation;
                    private final List<c> expressForecasts;
                    private final List<c> header;
                    private final List<c> liveButton;
                    private final List<c> statusForecasts;

                    {
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        ArrayList arrayList3;
                        ArrayList arrayList4;
                        ArrayList arrayList5;
                        ArrayList arrayList6;
                        List<AdvertApi.AdvertOption> bottomNavigationBet = advert.getBottomNavigationBet();
                        ArrayList arrayList7 = null;
                        if (bottomNavigationBet != null) {
                            arrayList = new ArrayList();
                            Iterator<T> it = bottomNavigationBet.iterator();
                            while (it.hasNext()) {
                                c mapper = AdvertApi.AdvertOption.INSTANCE.mapper((AdvertApi.AdvertOption) it.next());
                                if (mapper != null) {
                                    arrayList.add(mapper);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        this.bottomNavigation = arrayList;
                        List<AdvertApi.AdvertOption> headerBet = advert.getHeaderBet();
                        if (headerBet != null) {
                            arrayList2 = new ArrayList();
                            Iterator<T> it2 = headerBet.iterator();
                            while (it2.hasNext()) {
                                c mapper2 = AdvertApi.AdvertOption.INSTANCE.mapper((AdvertApi.AdvertOption) it2.next());
                                if (mapper2 != null) {
                                    arrayList2.add(mapper2);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        this.header = arrayList2;
                        List<AdvertApi.AdvertOption> statusForecastsBet = advert.getStatusForecastsBet();
                        if (statusForecastsBet != null) {
                            arrayList3 = new ArrayList();
                            Iterator<T> it3 = statusForecastsBet.iterator();
                            while (it3.hasNext()) {
                                c mapper3 = AdvertApi.AdvertOption.INSTANCE.mapper((AdvertApi.AdvertOption) it3.next());
                                if (mapper3 != null) {
                                    arrayList3.add(mapper3);
                                }
                            }
                        } else {
                            arrayList3 = null;
                        }
                        this.statusForecasts = arrayList3;
                        List<AdvertApi.AdvertOption> bottomForecastsBet = advert.getBottomForecastsBet();
                        if (bottomForecastsBet != null) {
                            arrayList4 = new ArrayList();
                            Iterator<T> it4 = bottomForecastsBet.iterator();
                            while (it4.hasNext()) {
                                c mapper4 = AdvertApi.AdvertOption.INSTANCE.mapper((AdvertApi.AdvertOption) it4.next());
                                if (mapper4 != null) {
                                    arrayList4.add(mapper4);
                                }
                            }
                        } else {
                            arrayList4 = null;
                        }
                        this.bottomForecasts = arrayList4;
                        List<AdvertApi.AdvertOption> expressForecastsBet = advert.getExpressForecastsBet();
                        if (expressForecastsBet != null) {
                            arrayList5 = new ArrayList();
                            Iterator<T> it5 = expressForecastsBet.iterator();
                            while (it5.hasNext()) {
                                c mapper5 = AdvertApi.AdvertOption.INSTANCE.mapper((AdvertApi.AdvertOption) it5.next());
                                if (mapper5 != null) {
                                    arrayList5.add(mapper5);
                                }
                            }
                        } else {
                            arrayList5 = null;
                        }
                        this.expressForecasts = arrayList5;
                        List<AdvertApi.AdvertOption> liveButtonBet = advert.getLiveButtonBet();
                        if (liveButtonBet != null) {
                            arrayList6 = new ArrayList();
                            Iterator<T> it6 = liveButtonBet.iterator();
                            while (it6.hasNext()) {
                                c mapper6 = AdvertApi.AdvertOption.INSTANCE.mapper((AdvertApi.AdvertOption) it6.next());
                                if (mapper6 != null) {
                                    arrayList6.add(mapper6);
                                }
                            }
                        } else {
                            arrayList6 = null;
                        }
                        this.liveButton = arrayList6;
                        List<AdvertApi.AdvertOption> afterPaymentCpBet = advert.getAfterPaymentCpBet();
                        if (afterPaymentCpBet != null) {
                            arrayList7 = new ArrayList();
                            Iterator<T> it7 = afterPaymentCpBet.iterator();
                            while (it7.hasNext()) {
                                c mapper7 = AdvertApi.AdvertOption.INSTANCE.mapper((AdvertApi.AdvertOption) it7.next());
                                if (mapper7 != null) {
                                    arrayList7.add(mapper7);
                                }
                            }
                        }
                        this.afterPaymentCp = arrayList7;
                    }

                    @Override // x3.d
                    public List<c> getAfterPaymentCp() {
                        return this.afterPaymentCp;
                    }

                    @Override // x3.d
                    public List<c> getBottomForecasts() {
                        return this.bottomForecasts;
                    }

                    @Override // x3.d
                    public List<c> getBottomNavigation() {
                        return this.bottomNavigation;
                    }

                    @Override // x3.d
                    public List<c> getExpressForecasts() {
                        return this.expressForecasts;
                    }

                    @Override // x3.d
                    public List<c> getHeader() {
                        return this.header;
                    }

                    @Override // x3.d
                    public List<c> getLiveButton() {
                        return this.liveButton;
                    }

                    @Override // x3.d
                    public List<c> getStatusForecasts() {
                        return this.statusForecasts;
                    }
                };
            }

            private Companion() {
            }
        }

        public Advert(@Nullable List<AdvertOption> list, @Nullable List<AdvertOption> list2, @Nullable List<AdvertOption> list3, @Nullable List<AdvertOption> list4, @Nullable List<AdvertOption> list5, @Nullable List<AdvertOption> list6, @Nullable List<AdvertOption> list7) {
            this.bottomNavigationBet = list;
            this.headerBet = list2;
            this.statusForecastsBet = list3;
            this.bottomForecastsBet = list4;
            this.expressForecastsBet = list5;
            this.liveButtonBet = list6;
            this.afterPaymentCpBet = list7;
        }

        public static /* synthetic */ Advert copy$default(Advert advert, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                list = advert.bottomNavigationBet;
            }
            if ((i5 & 2) != 0) {
                list2 = advert.headerBet;
            }
            if ((i5 & 4) != 0) {
                list3 = advert.statusForecastsBet;
            }
            if ((i5 & 8) != 0) {
                list4 = advert.bottomForecastsBet;
            }
            if ((i5 & 16) != 0) {
                list5 = advert.expressForecastsBet;
            }
            if ((i5 & 32) != 0) {
                list6 = advert.liveButtonBet;
            }
            if ((i5 & 64) != 0) {
                list7 = advert.afterPaymentCpBet;
            }
            List list8 = list6;
            List list9 = list7;
            List list10 = list5;
            List list11 = list3;
            return advert.copy(list, list2, list11, list4, list10, list8, list9);
        }

        @Nullable
        public final List<AdvertOption> component1() {
            return this.bottomNavigationBet;
        }

        @Nullable
        public final List<AdvertOption> component2() {
            return this.headerBet;
        }

        @Nullable
        public final List<AdvertOption> component3() {
            return this.statusForecastsBet;
        }

        @Nullable
        public final List<AdvertOption> component4() {
            return this.bottomForecastsBet;
        }

        @Nullable
        public final List<AdvertOption> component5() {
            return this.expressForecastsBet;
        }

        @Nullable
        public final List<AdvertOption> component6() {
            return this.liveButtonBet;
        }

        @Nullable
        public final List<AdvertOption> component7() {
            return this.afterPaymentCpBet;
        }

        @NotNull
        public final Advert copy(@Nullable List<AdvertOption> bottomNavigationBet, @Nullable List<AdvertOption> headerBet, @Nullable List<AdvertOption> statusForecastsBet, @Nullable List<AdvertOption> bottomForecastsBet, @Nullable List<AdvertOption> expressForecastsBet, @Nullable List<AdvertOption> liveButtonBet, @Nullable List<AdvertOption> afterPaymentCpBet) {
            return new Advert(bottomNavigationBet, headerBet, statusForecastsBet, bottomForecastsBet, expressForecastsBet, liveButtonBet, afterPaymentCpBet);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Advert)) {
                return false;
            }
            Advert advert = (Advert) other;
            return Intrinsics.areEqual(this.bottomNavigationBet, advert.bottomNavigationBet) && Intrinsics.areEqual(this.headerBet, advert.headerBet) && Intrinsics.areEqual(this.statusForecastsBet, advert.statusForecastsBet) && Intrinsics.areEqual(this.bottomForecastsBet, advert.bottomForecastsBet) && Intrinsics.areEqual(this.expressForecastsBet, advert.expressForecastsBet) && Intrinsics.areEqual(this.liveButtonBet, advert.liveButtonBet) && Intrinsics.areEqual(this.afterPaymentCpBet, advert.afterPaymentCpBet);
        }

        @Nullable
        public final List<AdvertOption> getAfterPaymentCpBet() {
            return this.afterPaymentCpBet;
        }

        @Nullable
        public final List<AdvertOption> getBottomForecastsBet() {
            return this.bottomForecastsBet;
        }

        @Nullable
        public final List<AdvertOption> getBottomNavigationBet() {
            return this.bottomNavigationBet;
        }

        @Nullable
        public final List<AdvertOption> getExpressForecastsBet() {
            return this.expressForecastsBet;
        }

        @Nullable
        public final List<AdvertOption> getHeaderBet() {
            return this.headerBet;
        }

        @Nullable
        public final List<AdvertOption> getLiveButtonBet() {
            return this.liveButtonBet;
        }

        @Nullable
        public final List<AdvertOption> getStatusForecastsBet() {
            return this.statusForecastsBet;
        }

        public int hashCode() {
            List<AdvertOption> list = this.bottomNavigationBet;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<AdvertOption> list2 = this.headerBet;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<AdvertOption> list3 = this.statusForecastsBet;
            int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<AdvertOption> list4 = this.bottomForecastsBet;
            int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<AdvertOption> list5 = this.expressForecastsBet;
            int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<AdvertOption> list6 = this.liveButtonBet;
            int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
            List<AdvertOption> list7 = this.afterPaymentCpBet;
            return hashCode6 + (list7 != null ? list7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Advert(bottomNavigationBet=");
            sb2.append(this.bottomNavigationBet);
            sb2.append(", headerBet=");
            sb2.append(this.headerBet);
            sb2.append(", statusForecastsBet=");
            sb2.append(this.statusForecastsBet);
            sb2.append(", bottomForecastsBet=");
            sb2.append(this.bottomForecastsBet);
            sb2.append(", expressForecastsBet=");
            sb2.append(this.expressForecastsBet);
            sb2.append(", liveButtonBet=");
            sb2.append(this.liveButtonBet);
            sb2.append(", afterPaymentCpBet=");
            return c1.p(sb2, this.afterPaymentCpBet, ')');
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lbet/prediction/response/vtenth/AdvertApi$AdvertOption;", "", "idBet", "", "urlBet", "", "imageBet", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getIdBet", "()I", "getUrlBet", "()Ljava/lang/String;", "getImageBet", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdvertOption {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b("id")
        private final int idBet;

        @b("image")
        @NotNull
        private final String imageBet;

        @b("url")
        @NotNull
        private final String urlBet;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbet/prediction/response/vtenth/AdvertApi$AdvertOption$Companion;", "", "<init>", "()V", "Lbet/prediction/response/vtenth/AdvertApi$AdvertOption;", "Lx3/c;", "mapper", "(Lbet/prediction/response/vtenth/AdvertApi$AdvertOption;)Lx3/c;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final c mapper(@Nullable final AdvertOption advertOption) {
                if (advertOption == null) {
                    return null;
                }
                return new c(advertOption) { // from class: bet.prediction.response.vtenth.AdvertApi$AdvertOption$Companion$mapper$1
                    private final int id;
                    private final String image;
                    private final String url;

                    {
                        this.id = advertOption.getIdBet();
                        this.url = advertOption.getUrlBet();
                        this.image = advertOption.getImageBet();
                    }

                    @Override // x3.c
                    public int getId() {
                        return this.id;
                    }

                    @Override // x3.c
                    public String getImage() {
                        return this.image;
                    }

                    @Override // x3.c
                    public String getUrl() {
                        return this.url;
                    }
                };
            }

            private Companion() {
            }
        }

        public AdvertOption(int i5, @NotNull String urlBet, @NotNull String imageBet) {
            Intrinsics.checkNotNullParameter(urlBet, "urlBet");
            Intrinsics.checkNotNullParameter(imageBet, "imageBet");
            this.idBet = i5;
            this.urlBet = urlBet;
            this.imageBet = imageBet;
        }

        public static /* synthetic */ AdvertOption copy$default(AdvertOption advertOption, int i5, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = advertOption.idBet;
            }
            if ((i10 & 2) != 0) {
                str = advertOption.urlBet;
            }
            if ((i10 & 4) != 0) {
                str2 = advertOption.imageBet;
            }
            return advertOption.copy(i5, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIdBet() {
            return this.idBet;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUrlBet() {
            return this.urlBet;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImageBet() {
            return this.imageBet;
        }

        @NotNull
        public final AdvertOption copy(int idBet, @NotNull String urlBet, @NotNull String imageBet) {
            Intrinsics.checkNotNullParameter(urlBet, "urlBet");
            Intrinsics.checkNotNullParameter(imageBet, "imageBet");
            return new AdvertOption(idBet, urlBet, imageBet);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvertOption)) {
                return false;
            }
            AdvertOption advertOption = (AdvertOption) other;
            return this.idBet == advertOption.idBet && Intrinsics.areEqual(this.urlBet, advertOption.urlBet) && Intrinsics.areEqual(this.imageBet, advertOption.imageBet);
        }

        public final int getIdBet() {
            return this.idBet;
        }

        @NotNull
        public final String getImageBet() {
            return this.imageBet;
        }

        @NotNull
        public final String getUrlBet() {
            return this.urlBet;
        }

        public int hashCode() {
            return this.imageBet.hashCode() + k.j(this.idBet * 31, 31, this.urlBet);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertOption(idBet=");
            sb2.append(this.idBet);
            sb2.append(", urlBet=");
            sb2.append(this.urlBet);
            sb2.append(", imageBet=");
            return d9.e.k(sb2, this.imageBet, ')');
        }
    }

    public AdvertApi(@Nullable List<Advert> list, @Nullable v3.b bVar) {
        this.advertsList = list;
        this.httpException = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvertApi copy$default(AdvertApi advertApi, List list, v3.b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = advertApi.advertsList;
        }
        if ((i5 & 2) != 0) {
            bVar = advertApi.httpException;
        }
        return advertApi.copy(list, bVar);
    }

    @Nullable
    public final List<Advert> component1() {
        return this.advertsList;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final v3.b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final AdvertApi copy(@Nullable List<Advert> advertsList, @Nullable v3.b httpException) {
        return new AdvertApi(advertsList, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertApi)) {
            return false;
        }
        AdvertApi advertApi = (AdvertApi) other;
        return Intrinsics.areEqual(this.advertsList, advertApi.advertsList) && Intrinsics.areEqual(this.httpException, advertApi.httpException);
    }

    @Override // x3.e
    @Nullable
    public List<d> getAdverts() {
        d dVar;
        List<Advert> list = this.advertsList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                dVar = Advert.INSTANCE.mapper((Advert) it.next());
            } catch (Exception unused) {
                dVar = null;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    @Nullable
    public final List<Advert> getAdvertsList() {
        return this.advertsList;
    }

    @Override // v3.e
    @Nullable
    public v3.b getHttpException() {
        return this.httpException;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        v3.b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        List<Advert> list = this.advertsList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        v3.b bVar = this.httpException;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdvertApi(advertsList=" + this.advertsList + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    public e map() {
        return new e() { // from class: bet.prediction.response.vtenth.AdvertApi$map$1
            private final List<d> adverts;
            private final v3.b httpException;

            {
                this.adverts = AdvertApi.this.getAdverts();
                this.httpException = AdvertApi.this.getHttpException();
            }

            @Override // x3.e
            public List<d> getAdverts() {
                return this.adverts;
            }

            @Override // v3.e
            public v3.b getHttpException() {
                return this.httpException;
            }

            @Override // v3.e
            public int getStatusCode() {
                return AdvertApi.this.getStatusCode();
            }
        };
    }
}
