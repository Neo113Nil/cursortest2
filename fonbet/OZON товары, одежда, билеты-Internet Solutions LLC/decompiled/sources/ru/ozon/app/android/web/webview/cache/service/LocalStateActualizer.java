package ru.ozon.app.android.web.webview.cache.service;

import Ac.C2378a;
import Ac.b;
import Ac.c;
import Ac.d;
import B90.C2601c;
import B90.a0;
import Bc.C2625A;
import Bc.i;
import Bc.o;
import Bc.r;
import Dp.C2877a;
import Pc.a;
import T7.E;
import ed.InterfaceC6346b;
import io.reactivex.C;
import io.reactivex.h;
import io.reactivex.x;
import io.reactivex.y;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.web.webview.cache.models.ResourcesDiff;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;
import sc.C9653a;
import sc.C9656b;
import wc.C10477F;
import wc.C10498t;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00180\u00180\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer;", "", "Lru/ozon/app/android/web/webview/cache/service/ResourcesLoader;", "resourceLoader", "Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "helper", "LPc/a;", "Lio/reactivex/x;", "schedulerProvider", "<init>", "(Lru/ozon/app/android/web/webview/cache/service/ResourcesLoader;Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;LPc/a;)V", "", "", "relativeResourcePaths", "Lio/reactivex/y;", "", "kotlin.jvm.PlatformType", "removeResources", "(Ljava/util/List;)Lio/reactivex/y;", "", "loadBatchSize", "parallelism", "urls", "scheduler", "Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;", "loadResources", "(IILjava/util/List;Lio/reactivex/x;)Lio/reactivex/y;", "Lru/ozon/app/android/web/webview/cache/models/ResourcesDiff;", "diff", "actualizeLocalState", "(IILru/ozon/app/android/web/webview/cache/models/ResourcesDiff;)Lio/reactivex/y;", "Lru/ozon/app/android/web/webview/cache/service/ResourcesLoader;", "Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "LPc/a;", "ActualizingResult", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocalStateActualizer {

    @NotNull
    private final LocalCacheHelper helper;

    @NotNull
    private final ResourcesLoader resourceLoader;

    @NotNull
    private final a<x> schedulerProvider;

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;", "", "", "errorCount", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getErrorCount", "()I", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActualizingResult {
        private final int errorCount;

        private /* synthetic */ ActualizingResult(int i11) {
            this.errorCount = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ActualizingResult m1578boximpl(int i11) {
            return new ActualizingResult(i11);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m1579constructorimpl(int i11) {
            return i11;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1580equalsimpl(int i11, Object obj) {
            return (obj instanceof ActualizingResult) && i11 == ((ActualizingResult) obj).getErrorCount();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1581hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1582toStringimpl(int i11) {
            return E.a(i11, "ActualizingResult(errorCount=", ")");
        }

        public boolean equals(Object obj) {
            return m1580equalsimpl(this.errorCount, obj);
        }

        public int hashCode() {
            return m1581hashCodeimpl(this.errorCount);
        }

        public String toString() {
            return m1582toStringimpl(this.errorCount);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getErrorCount() {
            return this.errorCount;
        }
    }

    public LocalStateActualizer(@NotNull ResourcesLoader resourceLoader, @NotNull LocalCacheHelper helper, @NotNull a<x> schedulerProvider) {
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.resourceLoader = resourceLoader;
        this.helper = helper;
        this.schedulerProvider = schedulerProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActualizingResult actualizeLocalState$lambda$0(Function2 function2, Object p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (ActualizingResult) function2.invoke(p02, p12);
    }

    private final y<ActualizingResult> loadResources(int loadBatchSize, int parallelism, List<String> urls, x scheduler) {
        List<String> list = urls;
        int i11 = h.f66520b;
        C9656b.c(list, "source is null");
        C10498t c10498t = new C10498t(list);
        C9656b.d(parallelism, "parallelism");
        C9656b.d(loadBatchSize, "prefetch");
        C9656b.d(parallelism, "parallelism");
        C9656b.d(loadBatchSize, "prefetch");
        C2378a c2378a = new C2378a(c10498t, parallelism, loadBatchSize);
        int c11 = h.c();
        C9656b.c(scheduler, "scheduler");
        C9656b.d(c11, "prefetch");
        c cVar = new c(new d(c2378a, scheduler, c11), new C2877a(new LocalStateActualizer$loadResources$1(this.resourceLoader), 2));
        int c12 = h.c();
        C9656b.d(c12, "prefetch");
        r rVar = new r(new C10477F(new b(cVar, c12), new C2601c(LocalStateActualizer$loadResources$2.INSTANCE)), new AF.a(LocalStateActualizer$loadResources$3.INSTANCE, 3));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean loadResources$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer loadResources$lambda$4(Function2 function2, Integer p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Integer) function2.invoke(p02, p12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActualizingResult loadResources$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ActualizingResult) function1.invoke(p02);
    }

    private final y<Unit> removeResources(final List<String> relativeResourcePaths) {
        o oVar = new o(new Callable() { // from class: LY.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit removeResources$lambda$2;
                removeResources$lambda$2 = LocalStateActualizer.removeResources$lambda$2(relativeResourcePaths, this);
                return removeResources$lambda$2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeResources$lambda$2(List list, LocalStateActualizer localStateActualizer) {
        LocalCacheHelper localCacheHelper = localStateActualizer.helper;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            localCacheHelper.removeLocalResource((String) it.next());
        }
        return Unit.f71690a;
    }

    @NotNull
    public final y<ActualizingResult> actualizeLocalState(int loadBatchSize, int parallelism, @NotNull ResourcesDiff diff) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        x xVar = this.schedulerProvider.get();
        y<Unit> removeResources = removeResources(diff.getOutDatedResources());
        List<String> newResourcesUrls = diff.getNewResourcesUrls();
        Intrinsics.f(xVar);
        y<ActualizingResult> loadResources = loadResources(loadBatchSize, parallelism, newResourcesUrls, xVar);
        a0 a0Var = new a0(LocalStateActualizer$actualizeLocalState$1.INSTANCE, 2);
        C9656b.c(removeResources, "source1 is null");
        C9656b.c(loadResources, "source2 is null");
        i iVar = new i(new C2625A(new C[]{removeResources, loadResources}, C9653a.w(a0Var)).j(xVar), new BT.c(new LocalStateActualizer$actualizeLocalState$2(diff), 1));
        Intrinsics.checkNotNullExpressionValue(iVar, "doOnSubscribe(...)");
        return iVar;
    }
}
