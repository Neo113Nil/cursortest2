package com.vk.search.communities.map.impl.ui.map;

import android.util.LruCache;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.group.Group;
import com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter;
import com.vk.search.communities.map.catalog.request.SearchCommunitiesOnMapRequestFactory;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import defpackage.e0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.observable.k;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.an10;
import xsna.bay;
import xsna.bjc;
import xsna.i0q0;
import xsna.izs;
import xsna.lq9;
import xsna.ooh0;
import xsna.poh0;
import xsna.qoh0;
import xsna.roh0;
import xsna.s7s0;
import xsna.swe0;
import xsna.tkt;
import xsna.ui50;
import xsna.upj;
import xsna.uzp0;
import xsna.wi50;

/* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
/* loaded from: classes5.dex */
public final class d implements tkt.a {
    public final String a;
    public final SearchCommunitiesOnMapRequestFactory b;
    public final wi50 c;
    public Object d;
    public final LruCache<Long, Group> e;

    /* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
    public interface a {
        void a(k kVar);
    }

    /* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchCommunitiesOnMapRouter.MapEntrypoint.values().length];
            try {
                iArr[SearchCommunitiesOnMapRouter.MapEntrypoint.GlobalSearch.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchCommunitiesOnMapRouter.MapEntrypoint.SearchInService.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
    public static final class c implements f {
        public final /* synthetic */ izs b;

        public c(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    /* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
    /* renamed from: com.vk.search.communities.map.impl.ui.map.d$d, reason: collision with other inner class name */
    public static final class C1762d implements l {
        public final /* synthetic */ poh0 b;

        public C1762d(poh0 poh0Var) {
            this.b = poh0Var;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    public d(SearchCommunitiesOnMapRouter.MapEntrypoint mapEntrypoint, String str) {
        this.a = str;
        int i = mapEntrypoint == null ? -1 : b.$EnumSwitchMapping$0[mapEntrypoint.ordinal()];
        this.b = new SearchCommunitiesOnMapRequestFactory(i != 1 ? i != 2 ? null : SearchCommunitiesOnMapRequestFactory.SearchCommunitiesOnMapEntrypoint.SearchInService : SearchCommunitiesOnMapRequestFactory.SearchCommunitiesOnMapEntrypoint.GlobalSearchTab, str);
        this.c = bay.a();
        this.e = new LruCache<>(200);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // xsna.tkt.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(double d, double d2, double d3, double d4, float f, float f2, float f3, ContinuationImpl continuationImpl) {
        e eVar;
        int i;
        double d5;
        float f4;
        ui50 ui50Var;
        float f5;
        float f6;
        double d6;
        double d7;
        double d8;
        SearchCommunitiesOnMapRequestFactory searchCommunitiesOnMapRequestFactory = this.b;
        try {
            if (continuationImpl instanceof e) {
                eVar = (e) continuationImpl;
                int i2 = eVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = eVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.MOVE_MAP;
                        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, this.a, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, null, 30, null), 2);
                        UiTracker uiTracker = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(c2, b2, uzp0Var.a).q();
                        wi50 wi50Var = this.c;
                        eVar.L$0 = wi50Var;
                        eVar.D$0 = d;
                        eVar.D$1 = d2;
                        eVar.D$2 = d3;
                        d5 = d4;
                        eVar.D$3 = d5;
                        eVar.F$0 = f;
                        eVar.F$1 = f2;
                        eVar.F$2 = f3;
                        eVar.I$0 = 0;
                        eVar.label = 1;
                        if (wi50Var.b(eVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        f4 = f3;
                        ui50Var = wi50Var;
                        f5 = f2;
                        f6 = f;
                        d6 = d2;
                        d7 = d3;
                        d8 = d;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return obj;
                        }
                        f4 = eVar.F$2;
                        float f7 = eVar.F$1;
                        f6 = eVar.F$0;
                        d5 = eVar.D$3;
                        d7 = eVar.D$2;
                        d6 = eVar.D$1;
                        d8 = eVar.D$0;
                        ui50Var = (ui50) eVar.L$0;
                        kotlin.a.a(obj);
                        f5 = f7;
                    }
                    searchCommunitiesOnMapRequestFactory.f = new Float(f6);
                    searchCommunitiesOnMapRequestFactory.g = new Float(f5);
                    float f8 = f4;
                    float f9 = f5;
                    searchCommunitiesOnMapRequestFactory.h = new Integer(swe0.g(an10.b(f4), 10000, 1000000));
                    q d9 = this.b.d(null, null, null, false, null);
                    ui50Var.c(null);
                    k e = d9.e();
                    i0q0.f(new e0(23, this, e));
                    eVar.L$0 = null;
                    eVar.L$1 = e;
                    eVar.D$0 = d8;
                    eVar.D$1 = d6;
                    eVar.D$2 = d7;
                    eVar.D$3 = d5;
                    eVar.F$0 = f6;
                    eVar.F$1 = f9;
                    eVar.F$2 = f8;
                    eVar.I$0 = 0;
                    eVar.label = 2;
                    lq9 lq9Var = new lq9(1, s7s0.c(eVar));
                    lq9Var.o();
                    lq9Var.r(new ooh0(e.U(new C1762d(new poh0(this, d8, d6, d7, d5))).subscribe(new c(new qoh0(lq9Var, this)), new c(new roh0(1, lq9Var, upj.class, "resumeWithException", "resumeWithException(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", 1)))));
                    Object n = lq9Var.n();
                    return n != coroutineSingletons ? coroutineSingletons : n;
                }
            }
            searchCommunitiesOnMapRequestFactory.f = new Float(f6);
            searchCommunitiesOnMapRequestFactory.g = new Float(f5);
            float f82 = f4;
            float f92 = f5;
            searchCommunitiesOnMapRequestFactory.h = new Integer(swe0.g(an10.b(f4), 10000, 1000000));
            q d92 = this.b.d(null, null, null, false, null);
            ui50Var.c(null);
            k e2 = d92.e();
            i0q0.f(new e0(23, this, e2));
            eVar.L$0 = null;
            eVar.L$1 = e2;
            eVar.D$0 = d8;
            eVar.D$1 = d6;
            eVar.D$2 = d7;
            eVar.D$3 = d5;
            eVar.F$0 = f6;
            eVar.F$1 = f92;
            eVar.F$2 = f82;
            eVar.I$0 = 0;
            eVar.label = 2;
            lq9 lq9Var2 = new lq9(1, s7s0.c(eVar));
            lq9Var2.o();
            lq9Var2.r(new ooh0(e2.U(new C1762d(new poh0(this, d8, d6, d7, d5))).subscribe(new c(new qoh0(lq9Var2, this)), new c(new roh0(1, lq9Var2, upj.class, "resumeWithException", "resumeWithException(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", 1)))));
            Object n2 = lq9Var2.n();
            if (n2 != coroutineSingletons) {
            }
        } catch (Throwable th) {
            ui50Var.c(null);
            throw th;
        }
        eVar = new e(this, continuationImpl);
        Object obj2 = eVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.label;
        if (i != 0) {
        }
    }
}
