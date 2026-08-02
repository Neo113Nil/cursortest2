package defpackage;

import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.b0;
import com.blaze.blazesdk.shared.results.c0;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.i;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class cql extends x5m {
    public final yzc c;
    public final lec d;
    public BlazeDataSourceType e;
    public BlazeDataSourceType f;
    public BlazeCachingLevel g;
    public String h;
    public BlazeWidgetLayout i;
    public LinkedHashMap j;
    public String k;
    public boolean l;
    public boolean m;
    public final yzc n;
    public BlazeWidgetDelegate o;
    public Function1 p;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: cql$a$a, reason: collision with other inner class name */
        public static final class C1350a extends a {
            public final BlazeResult.Error a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1350a(@NotNull BlazeResult.Error error) {
                super(null);
                error.getClass();
                this.a = error;
            }

            public static C1350a copy$default(C1350a c1350a, BlazeResult.Error error, int i, Object obj) {
                if ((i & 1) != 0) {
                    error = c1350a.a;
                }
                c1350a.getClass();
                error.getClass();
                return new C1350a(error);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1350a) && Intrinsics.c(this.a, ((C1350a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.a + ')';
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class b extends a {
            public b() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class c extends a {
            public final List a;
            public final List b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull List<ipm> list, @NotNull List<Object> list2) {
                super(null);
                list.getClass();
                list2.getClass();
                this.a = list;
                this.b = list2;
            }

            public static c copy$default(c cVar, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = cVar.a;
                }
                if ((i & 2) != 0) {
                    list2 = cVar.b;
                }
                cVar.getClass();
                list.getClass();
                list2.getClass();
                return new c(list, list2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.c(this.a, cVar.a) && Intrinsics.c(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Loaded(uiItems=");
                sb.append(this.a);
                sb.append(", allItems=");
                return fc6.p(sb, this.b, ')');
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class d extends a {
            public d() {
                super(null);
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public cql() {
        yzc yzcVar = new yzc(new a.b());
        this.c = yzcVar;
        t6j t6jVar = new t6j(25);
        i5k.e(2, t6jVar);
        lec lecVar = new lec();
        asf asfVar = new asf();
        asfVar.a = true;
        if (yzcVar.e != keb.k) {
            lecVar.j(yzcVar.d());
            asfVar.a = false;
        }
        lecVar.l(yzcVar, new cag(new vsc(21, lecVar, asfVar, t6jVar)));
        this.d = lecVar;
        this.m = true;
        this.n = new yzc(null);
    }

    @Override // defpackage.ltk
    public void e() {
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(sq3 sq3Var) {
        f2m f2mVar;
        int i;
        String str;
        a9m a9mVar;
        if (sq3Var instanceof f2m) {
            f2mVar = (f2m) sq3Var;
            int i2 = f2mVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f2mVar.v = i2 - Integer.MIN_VALUE;
                f2m f2mVar2 = f2mVar;
                Object obj = f2mVar2.t;
                lu3 lu3Var = lu3.a;
                i = f2mVar2.v;
                if (i != 0) {
                    y6a.M(obj);
                    str = this.k;
                    if (str != null) {
                        k5m k5mVar = k5m.a;
                        String w = w();
                        BlazeWidgetLayout x = x();
                        BlazeDataSourceType blazeDataSourceType = this.f;
                        if (blazeDataSourceType == null) {
                            Intrinsics.i("originalDataSourceType");
                            throw null;
                        }
                        f2mVar2.r = this;
                        f2mVar2.s = str;
                        f2mVar2.v = 1;
                        obj = k5mVar.d(w, str, x, blazeDataSourceType, f2mVar2);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = f2mVar2.s;
                cql cqlVar = f2mVar2.r;
                y6a.M(obj);
                str = str2;
                this = cqlVar;
                a9mVar = (a9m) obj;
                if (a9mVar instanceof qbm) {
                    xxm xxmVar = (xxm) ((qbm) a9mVar).a;
                    BlazeWidgetLayout blazeWidgetLayout = xxmVar.b.a;
                    this.getClass();
                    blazeWidgetLayout.getClass();
                    this.i = blazeWidgetLayout;
                    BlazeDataSourceType blazeDataSourceType2 = xxmVar.b.b;
                    blazeDataSourceType2.getClass();
                    this.e = blazeDataSourceType2;
                }
                if (a9mVar instanceof a6m) {
                    a6m a6mVar = (a6m) a9mVar;
                    j1m j1mVar = j1m.a;
                    b0 b0Var = new b0();
                    b0Var.f = a6mVar.a();
                    b0Var.g = tub.h(new Pair("widgetId", this.w()), new Pair("widgetRemoteId", str));
                    b0Var.b(a6mVar.b());
                    j1m.a(b0Var);
                    this.c.k(new a.C1350a(b0Var.d()));
                    throw new CancellationException("Remote widget loading failed: " + b0Var);
                }
                return Unit.a;
            }
        }
        f2mVar = new f2m(this, sq3Var);
        f2m f2mVar22 = f2mVar;
        Object obj2 = f2mVar22.t;
        lu3 lu3Var2 = lu3.a;
        i = f2mVar22.v;
        if (i != 0) {
        }
        a9mVar = (a9m) obj2;
        if (a9mVar instanceof qbm) {
        }
        if (a9mVar instanceof a6m) {
        }
        return Unit.a;
    }

    public abstract ArrayList h(List list);

    public final void i(String str, String str2, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, BlazeWidgetDelegate blazeWidgetDelegate, boolean z, Map map, Function1 function1, BlazeWidgetLayout blazeWidgetLayout) {
        str.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        blazeWidgetLayout.getClass();
        try {
            com.blaze.blazesdk.data_source.a.validate$default(blazeDataSourceType, ogm.WIDGET, false, 2, null);
            this.h = str;
            this.k = str2;
            this.e = blazeDataSourceType;
            this.f = blazeDataSourceType;
            this.g = blazeCachingLevel;
            this.o = blazeWidgetDelegate;
            this.m = z;
            this.j = new LinkedHashMap(map);
            this.p = function1;
            this.i = blazeWidgetLayout;
            y();
        } catch (Throwable th) {
            j1m j1mVar = j1m.a;
            c0 c0Var = new c0();
            c0Var.f = th;
            c0Var.g = tub.h(new Pair("widgetId", str), new Pair("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release()));
            j1m.a(c0Var);
            String message = th.getMessage();
            if (message == null) {
                message = c0Var.d;
            }
            throw new RuntimeException(message);
        }
    }

    public final void j(boolean z) {
        if (!z) {
            this.c.k(new a.d());
        }
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(sq3 sq3Var) {
        n5m n5mVar;
        int i;
        g0 c0Var;
        try {
            if (sq3Var instanceof n5m) {
                n5mVar = (n5m) sq3Var;
                int i2 = n5mVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    n5mVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = n5mVar.s;
                    lu3 lu3Var = lu3.a;
                    i = n5mVar.u;
                    if (i != 0) {
                        y6a.M(obj);
                        bwm bwmVar = bwm.a;
                        n5mVar.r = this;
                        n5mVar.u = 1;
                        if (bwmVar.a(n5mVar) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = n5mVar.r;
                        y6a.M(obj);
                    }
                    com.blaze.blazesdk.data_source.a.a(this.v(), ogm.WIDGET, true);
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            com.blaze.blazesdk.data_source.a.a(this.v(), ogm.WIDGET, true);
            return Unit.a;
        } catch (Throwable th) {
            j1m j1mVar = j1m.a;
            if (th instanceof fxl) {
                c0Var = new i();
                c0Var.f = th;
            } else {
                c0Var = new c0();
                c0Var.f = th;
            }
            c0Var.g = tub.h(new Pair("widgetId", this.w()), new Pair("dataSource", this.v().getStringRepresentation$blazesdk_release()));
            j1m.a(c0Var);
            this.c.k(new a.C1350a(c0Var.d()));
            String message = th.getMessage();
            if (message == null) {
                message = c0Var.d;
            }
            throw new RuntimeException(message);
        }
        n5mVar = new n5m(this, sq3Var);
        Object obj2 = n5mVar.s;
        lu3 lu3Var2 = lu3.a;
        i = n5mVar.u;
    }

    public abstract void l();

    public final void m(List list) {
        Integer maxDisplayItemsCount;
        list.getClass();
        try {
            List list2 = km5.a;
            if (!list.isEmpty() && ((maxDisplayItemsCount = x().getMaxDisplayItemsCount()) == null || (list2 = (List) CollectionsKt.Y(CollectionsKt.Q(maxDisplayItemsCount.intValue(), list))) == null)) {
                list2 = list;
            }
            this.c.k(new a.c(h(list2), list));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public abstract void n();

    public final BlazeCachingLevel o() {
        BlazeCachingLevel blazeCachingLevel = this.g;
        if (blazeCachingLevel != null) {
            return blazeCachingLevel;
        }
        Intrinsics.i("cachingLevel");
        throw null;
    }

    public abstract ContentType t();

    public final List u() {
        Object d = this.c.d();
        a.c cVar = d instanceof a.c ? (a.c) d : null;
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    public final BlazeDataSourceType v() {
        BlazeDataSourceType blazeDataSourceType = this.e;
        if (blazeDataSourceType != null) {
            return blazeDataSourceType;
        }
        Intrinsics.i("dataSource");
        throw null;
    }

    public final String w() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        Intrinsics.i("widgetId");
        throw null;
    }

    public final BlazeWidgetLayout x() {
        BlazeWidgetLayout blazeWidgetLayout = this.i;
        if (blazeWidgetLayout != null) {
            return blazeWidgetLayout;
        }
        Intrinsics.i("widgetLayout");
        throw null;
    }

    public abstract void y();

    public final Object z() {
        String str = this.k;
        if (str != null) {
            k5m k5mVar = k5m.a;
            xxm xxmVar = (xxm) k5m.b.get(w());
            if (xxmVar == null) {
                p2g p2gVar = w2g.b;
                return new u2g(new Exception("No widget info saved - This means it hasn't been loaded or has been cleaned."));
            }
            jzm jzmVar = xxmVar.b;
            if (!Intrinsics.c(xxmVar.a, new qym(str, v()))) {
                p2g p2gVar2 = w2g.b;
                return new u2g(new Exception("If the previous request was fetching with different dataSource or widgetRemoteId we don't want to restore it."));
            }
            BlazeWidgetLayout blazeWidgetLayout = jzmVar.a;
            blazeWidgetLayout.getClass();
            this.i = blazeWidgetLayout;
            BlazeDataSourceType blazeDataSourceType = jzmVar.b;
            blazeDataSourceType.getClass();
            this.e = blazeDataSourceType;
        }
        p2g p2gVar3 = w2g.b;
        return Unit.a;
    }
}
