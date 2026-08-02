package ru.ozon.app.android.network.gnc;

import G.g;
import Kk.C3532b;
import We.B;
import We.C4862d;
import We.C4871m;
import We.C4876s;
import We.E;
import We.v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import pf0.AbstractC8922e;
import pf0.h;
import pf0.i;
import ru.ozon.app.android.network.di.module.NetworkModule;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0015J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0016J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0017J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u001aJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010\u001c2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0000¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/Jp\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020$HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010=R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010>R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010@R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "", "Lpf0/h;", "ozonNetworkBaseApi", "", "isCronetEnabled", "", "Lpf0/e;", "interceptors", "LWe/m;", "connectionPool", "LWe/s;", "dispatcher", "Lkotlin/time/b;", "timeoutSec", "LWe/v$c;", "eventListenerFactory", "LWe/d;", "cache", "<init>", "(Lpf0/h;ZLjava/util/List;LWe/m;LWe/s;Lkotlin/time/b;LWe/v$c;LWe/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Z)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "(LWe/s;)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "(LWe/m;)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "timeoutSec-LRDsOJo", "(J)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "(LWe/v$c;)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "(LWe/d;)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "LWe/B;", "interceptor", "", "index", "addAppInterceptor", "(LWe/B;I)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "addNetworkInterceptor", "()Ljava/util/List;", "", "className", "getInterceptor", "(Ljava/lang/String;)LWe/B;", "", "removeInterceptor", "(Ljava/lang/String;)V", "deepCopy", "()Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "LWe/E;", "build", "()LWe/E;", "copy-AhSEoPs", "(Lpf0/h;ZLjava/util/List;LWe/m;LWe/s;Lkotlin/time/b;LWe/v$c;LWe/d;)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "copy", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lpf0/h;", "Z", "Ljava/util/List;", "LWe/m;", "LWe/s;", "Lkotlin/time/b;", "LWe/v$c;", "LWe/d;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GncOkHttpClientBuilder {
    private C4862d cache;
    private C4871m connectionPool;
    private C4876s dispatcher;
    private v.c eventListenerFactory;

    @NotNull
    private final List<AbstractC8922e> interceptors;
    private boolean isCronetEnabled;

    @NotNull
    private final h ozonNetworkBaseApi;
    private b timeoutSec;

    public /* synthetic */ GncOkHttpClientBuilder(h hVar, boolean z11, List list, C4871m c4871m, C4876s c4876s, b bVar, v.c cVar, C4862d c4862d, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, z11, list, c4871m, c4876s, bVar, cVar, c4862d);
    }

    public static /* synthetic */ GncOkHttpClientBuilder addAppInterceptor$default(GncOkHttpClientBuilder gncOkHttpClientBuilder, B b11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = gncOkHttpClientBuilder.interceptors.size();
        }
        return gncOkHttpClientBuilder.addAppInterceptor(b11, i11);
    }

    public static /* synthetic */ GncOkHttpClientBuilder addNetworkInterceptor$default(GncOkHttpClientBuilder gncOkHttpClientBuilder, B b11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = gncOkHttpClientBuilder.interceptors.size();
        }
        return gncOkHttpClientBuilder.addNetworkInterceptor(b11, i11);
    }

    /* renamed from: copy-AhSEoPs$default, reason: not valid java name */
    public static /* synthetic */ GncOkHttpClientBuilder m844copyAhSEoPs$default(GncOkHttpClientBuilder gncOkHttpClientBuilder, h hVar, boolean z11, List list, C4871m c4871m, C4876s c4876s, b bVar, v.c cVar, C4862d c4862d, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = gncOkHttpClientBuilder.ozonNetworkBaseApi;
        }
        if ((i11 & 2) != 0) {
            z11 = gncOkHttpClientBuilder.isCronetEnabled;
        }
        if ((i11 & 4) != 0) {
            list = gncOkHttpClientBuilder.interceptors;
        }
        if ((i11 & 8) != 0) {
            c4871m = gncOkHttpClientBuilder.connectionPool;
        }
        if ((i11 & 16) != 0) {
            c4876s = gncOkHttpClientBuilder.dispatcher;
        }
        if ((i11 & 32) != 0) {
            bVar = gncOkHttpClientBuilder.timeoutSec;
        }
        if ((i11 & 64) != 0) {
            cVar = gncOkHttpClientBuilder.eventListenerFactory;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            c4862d = gncOkHttpClientBuilder.cache;
        }
        v.c cVar2 = cVar;
        C4862d c4862d2 = c4862d;
        C4876s c4876s2 = c4876s;
        b bVar2 = bVar;
        return gncOkHttpClientBuilder.m845copyAhSEoPs(hVar, z11, list, c4871m, c4876s2, bVar2, cVar2, c4862d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeInterceptor$lambda$9(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @NotNull
    public final GncOkHttpClientBuilder addAppInterceptor(@NotNull B interceptor, int index) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.interceptors.add(index, ExtentionsKt.toAppInterceptor(interceptor));
        return this;
    }

    @NotNull
    public final GncOkHttpClientBuilder addNetworkInterceptor(@NotNull B interceptor, int index) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.interceptors.add(index, ExtentionsKt.toNetworkInterceptor(interceptor));
        return this;
    }

    @NotNull
    public final E build() {
        E y11 = this.ozonNetworkBaseApi.y(new i(this) { // from class: ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder$build$okHttpClient$1
            private final AbstractC8919b.a consumer = AbstractC8919b.a.f80501a;
            private final List<AbstractC8922e> interceptors;
            private boolean isCronetEnabled;

            {
                boolean z11;
                List<AbstractC8922e> list;
                z11 = this.isCronetEnabled;
                this.isCronetEnabled = z11;
                list = this.interceptors;
                this.interceptors = list;
            }

            @Override // pf0.i
            public List<AbstractC8922e> getInterceptors() {
                return this.interceptors;
            }

            @Override // pf0.i
            /* renamed from: isCronetEnabled, reason: from getter */
            public boolean getIsCronetEnabled() {
                return this.isCronetEnabled;
            }

            @Override // pf0.i
            public void setCronetEnabled(boolean z11) {
                this.isCronetEnabled = z11;
            }

            @Override // pf0.i
            public AbstractC8919b.a getConsumer() {
                return this.consumer;
            }
        });
        y11.getClass();
        E.a aVar = new E.a(y11);
        C4871m c4871m = this.connectionPool;
        if (c4871m != null) {
            aVar.g(c4871m);
        }
        b bVar = this.timeoutSec;
        if (bVar != null) {
            NetworkModule.INSTANCE.m843setTimeoutHG0u8IE$network_prodGoogleAllVendorsRelease(aVar, bVar.getF71985a());
        }
        C4876s c4876s = this.dispatcher;
        if (c4876s != null) {
            aVar.i(c4876s);
        }
        C4862d c4862d = this.cache;
        if (c4862d != null) {
            aVar.c(c4862d);
        }
        v.c cVar = this.eventListenerFactory;
        if (cVar != null) {
            aVar.k(cVar);
        }
        return new E(aVar);
    }

    @NotNull
    public final GncOkHttpClientBuilder cache(@NotNull C4862d cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.cache = cache;
        return this;
    }

    @NotNull
    public final GncOkHttpClientBuilder connectionPool(@NotNull C4871m connectionPool) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        this.connectionPool = connectionPool;
        return this;
    }

    @NotNull
    /* renamed from: copy-AhSEoPs, reason: not valid java name */
    public final GncOkHttpClientBuilder m845copyAhSEoPs(@NotNull h ozonNetworkBaseApi, boolean isCronetEnabled, @NotNull List<AbstractC8922e> interceptors, C4871m connectionPool, C4876s dispatcher, b timeoutSec, v.c eventListenerFactory, C4862d cache) {
        Intrinsics.checkNotNullParameter(ozonNetworkBaseApi, "ozonNetworkBaseApi");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        return new GncOkHttpClientBuilder(ozonNetworkBaseApi, isCronetEnabled, interceptors, connectionPool, dispatcher, timeoutSec, eventListenerFactory, cache, null);
    }

    @NotNull
    public final GncOkHttpClientBuilder deepCopy() {
        return m844copyAhSEoPs$default(this, null, false, C7714v.W0(this.interceptors), null, null, null, null, null, 251, null);
    }

    @NotNull
    public final GncOkHttpClientBuilder dispatcher(@NotNull C4876s dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        return this;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GncOkHttpClientBuilder)) {
            return false;
        }
        GncOkHttpClientBuilder gncOkHttpClientBuilder = (GncOkHttpClientBuilder) other;
        return Intrinsics.d(this.ozonNetworkBaseApi, gncOkHttpClientBuilder.ozonNetworkBaseApi) && this.isCronetEnabled == gncOkHttpClientBuilder.isCronetEnabled && Intrinsics.d(this.interceptors, gncOkHttpClientBuilder.interceptors) && Intrinsics.d(this.connectionPool, gncOkHttpClientBuilder.connectionPool) && Intrinsics.d(this.dispatcher, gncOkHttpClientBuilder.dispatcher) && Intrinsics.d(this.timeoutSec, gncOkHttpClientBuilder.timeoutSec) && Intrinsics.d(this.eventListenerFactory, gncOkHttpClientBuilder.eventListenerFactory) && Intrinsics.d(this.cache, gncOkHttpClientBuilder.cache);
    }

    @NotNull
    public final GncOkHttpClientBuilder eventListenerFactory(@NotNull v.c eventListenerFactory) {
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        this.eventListenerFactory = eventListenerFactory;
        return this;
    }

    public final B getInterceptor(@NotNull String className) {
        Object obj;
        Intrinsics.checkNotNullParameter(className, "className");
        Iterator<T> it = this.interceptors.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC8922e) obj).getInterceptor().getClass().getName().equals(className)) {
                break;
            }
        }
        AbstractC8922e abstractC8922e = (AbstractC8922e) obj;
        if (abstractC8922e != null) {
            return abstractC8922e.getInterceptor();
        }
        return null;
    }

    public int hashCode() {
        int b11 = g.b(C3532b.a(this.ozonNetworkBaseApi.hashCode() * 31, 31, this.isCronetEnabled), 31, this.interceptors);
        C4871m c4871m = this.connectionPool;
        int hashCode = (b11 + (c4871m == null ? 0 : c4871m.hashCode())) * 31;
        C4876s c4876s = this.dispatcher;
        int hashCode2 = (hashCode + (c4876s == null ? 0 : c4876s.hashCode())) * 31;
        b bVar = this.timeoutSec;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : Long.hashCode(bVar.getF71985a()))) * 31;
        v.c cVar = this.eventListenerFactory;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C4862d c4862d = this.cache;
        return hashCode4 + (c4862d != null ? c4862d.hashCode() : 0);
    }

    @NotNull
    public final List<AbstractC8922e> interceptors() {
        return this.interceptors;
    }

    @NotNull
    public final GncOkHttpClientBuilder isCronetEnabled(boolean isCronetEnabled) {
        this.isCronetEnabled = isCronetEnabled;
        return this;
    }

    public final void removeInterceptor(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        List<AbstractC8922e> list = this.interceptors;
        final GncOkHttpClientBuilder$removeInterceptor$1 gncOkHttpClientBuilder$removeInterceptor$1 = new GncOkHttpClientBuilder$removeInterceptor$1(className);
        list.removeIf(new Predicate() { // from class: RA.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean removeInterceptor$lambda$9;
                removeInterceptor$lambda$9 = GncOkHttpClientBuilder.removeInterceptor$lambda$9(Function1.this, obj);
                return removeInterceptor$lambda$9;
            }
        });
    }

    @NotNull
    /* renamed from: timeoutSec-LRDsOJo, reason: not valid java name */
    public final GncOkHttpClientBuilder m846timeoutSecLRDsOJo(long timeoutSec) {
        this.timeoutSec = b.e(timeoutSec);
        return this;
    }

    @NotNull
    public String toString() {
        return "GncOkHttpClientBuilder(ozonNetworkBaseApi=" + this.ozonNetworkBaseApi + ", isCronetEnabled=" + this.isCronetEnabled + ", interceptors=" + this.interceptors + ", connectionPool=" + this.connectionPool + ", dispatcher=" + this.dispatcher + ", timeoutSec=" + this.timeoutSec + ", eventListenerFactory=" + this.eventListenerFactory + ", cache=" + this.cache + ")";
    }

    private GncOkHttpClientBuilder(h ozonNetworkBaseApi, boolean z11, List<AbstractC8922e> interceptors, C4871m c4871m, C4876s c4876s, b bVar, v.c cVar, C4862d c4862d) {
        Intrinsics.checkNotNullParameter(ozonNetworkBaseApi, "ozonNetworkBaseApi");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.ozonNetworkBaseApi = ozonNetworkBaseApi;
        this.isCronetEnabled = z11;
        this.interceptors = interceptors;
        this.connectionPool = c4871m;
        this.dispatcher = c4876s;
        this.timeoutSec = bVar;
        this.eventListenerFactory = cVar;
        this.cache = c4862d;
    }

    public /* synthetic */ GncOkHttpClientBuilder(h hVar, boolean z11, List list, C4871m c4871m, C4876s c4876s, b bVar, v.c cVar, C4862d c4862d, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? new ArrayList() : list, (i11 & 8) != 0 ? null : c4871m, (i11 & 16) != 0 ? null : c4876s, (i11 & 32) != 0 ? null : bVar, (i11 & 64) != 0 ? null : cVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : c4862d, null);
    }
}
