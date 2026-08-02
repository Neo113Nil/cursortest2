package ru.ozon.app.android.checkoutcomposer.prefetch;

import Sc.s;
import Wc.a;
import i10.g;
import i10.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;
import xe.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.prefetch.CheckoutPrefetchControllerImpl$launchPrefetch$1", f = "CheckoutPrefetchControllerImpl.kt", l = {91, 96}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CheckoutPrefetchControllerImpl$launchPrefetch$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $currentPage;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ B0 $previousJob;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CheckoutPrefetchControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutPrefetchControllerImpl$launchPrefetch$1(B0 b02, CheckoutPrefetchControllerImpl checkoutPrefetchControllerImpl, Map<String, String> map, String str, String str2, d<? super CheckoutPrefetchControllerImpl$launchPrefetch$1> dVar) {
        super(2, dVar);
        this.$previousJob = b02;
        this.this$0 = checkoutPrefetchControllerImpl;
        this.$params = map;
        this.$currentPage = str;
        this.$url = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CheckoutPrefetchControllerImpl$launchPrefetch$1(this.$previousJob, this.this$0, this.$params, this.$currentPage, this.$url, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|2|(1:(1:(9:6|7|8|9|(1:11)|28|13|14|(2:16|17)(6:19|(1:21)|22|(1:24)|25|26))(2:31|32))(1:33))(2:43|(1:45))|34|35|36|(7:39|9|(0)|28|13|14|(0)(0))|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r0 = r11;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0034, code lost:
    
        if (xe.E0.c(r11, r10) == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007c A[Catch: Exception -> 0x0018, CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:8:0x0014, B:9:0x0066, B:11:0x007c, B:13:0x0086, B:28:0x0082, B:36:0x0041), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        kotlin.jvm.internal.M m11;
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        ComposerPrefetchService composerPrefetchService;
        ReferrerValueController referrerValueController;
        h.a b11;
        T t2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                B0 b02 = this.$previousJob;
                if (b02 != null) {
                    this.label = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m11 = (kotlin.jvm.internal.M) this.L$1;
                    hashMap = (HashMap) this.L$0;
                    try {
                        s.b(obj);
                        h hVar = (h) obj;
                        hashMap.putAll(hVar.f());
                        hashMap.putAll(hVar.e());
                        b11 = hVar.b();
                        if (b11 != null) {
                            g c11 = b11.c();
                            t2 = c11;
                        }
                        t2 = hVar.g();
                        m11.f71787a = t2;
                    } catch (Exception e11) {
                        Exception e12 = e11;
                        Lm0.a.f17149a.e(e12);
                        if (m11.f71787a == g.GET) {
                        }
                    }
                    if (m11.f71787a == g.GET) {
                        return Unit.f71690a;
                    }
                    Map<String, String> map = this.$params;
                    if (map != null) {
                        hashMap.putAll(map);
                    }
                    if (this.$currentPage != null) {
                        referrerValueController = this.this$0.referrerValueController;
                        referrerValueController.setCurrentPageReferrer(this.$currentPage);
                    }
                    composerPrefetchService = this.this$0.composerPrefetchService;
                    composerPrefetchService.prefetch(this.$url, CheckoutCacheGroup.INSTANCE, hashMap);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            hashMap = new HashMap();
            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
            coroutineDispatcherProvider = this.this$0.dispatcherProvider;
            I io2 = coroutineDispatcherProvider.getIO();
            CheckoutPrefetchControllerImpl$launchPrefetch$1$result$1 checkoutPrefetchControllerImpl$launchPrefetch$1$result$1 = new CheckoutPrefetchControllerImpl$launchPrefetch$1$result$1(this.$params, this.this$0, this.$url, null);
            this.L$0 = hashMap;
            this.L$1 = m12;
            this.label = 2;
            Object f7 = C10727i.f(io2, checkoutPrefetchControllerImpl$launchPrefetch$1$result$1, this);
            if (f7 != aVar) {
                m11 = m12;
                obj = f7;
                h hVar2 = (h) obj;
                hashMap.putAll(hVar2.f());
                hashMap.putAll(hVar2.e());
                b11 = hVar2.b();
                if (b11 != null) {
                }
                t2 = hVar2.g();
                m11.f71787a = t2;
                if (m11.f71787a == g.GET) {
                }
            }
            return aVar;
        } catch (CancellationException unused) {
            return Unit.f71690a;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CheckoutPrefetchControllerImpl$launchPrefetch$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
