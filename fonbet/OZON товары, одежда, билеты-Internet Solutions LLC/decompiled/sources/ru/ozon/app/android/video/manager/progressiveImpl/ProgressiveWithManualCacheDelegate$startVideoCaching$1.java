package ru.ozon.app.android.video.manager.progressiveImpl;

import Sc.s;
import Wc.a;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import q3.c;
import q3.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.manager.progressiveImpl.ProgressiveWithManualCacheDelegate$startVideoCaching$1", f = "ProgressiveCacheDelegates.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProgressiveWithManualCacheDelegate$startVideoCaching$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $cacheBytesSize;
    final /* synthetic */ String $urlWithActualDomain;
    int label;
    final /* synthetic */ ProgressiveWithManualCacheDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressiveWithManualCacheDelegate$startVideoCaching$1(ProgressiveWithManualCacheDelegate progressiveWithManualCacheDelegate, String str, long j11, d<? super ProgressiveWithManualCacheDelegate$startVideoCaching$1> dVar) {
        super(2, dVar);
        this.this$0 = progressiveWithManualCacheDelegate;
        this.$urlWithActualDomain = str;
        this.$cacheBytesSize = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProgressiveWithManualCacheDelegate$startVideoCaching$1(this.this$0, this.$urlWithActualDomain, this.$cacheBytesSize, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        c.a aVar;
        ConcurrentHashMap concurrentHashMap3;
        a aVar2 = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        try {
            aVar = this.this$0.cacheDataSourceFactory;
            i iVar = new i(aVar.createDataSource(), new p3.i(Uri.parse(this.$urlWithActualDomain), 0L, this.$cacheBytesSize), null, null);
            concurrentHashMap3 = this.this$0.cacheWriters;
            concurrentHashMap3.put(this.$urlWithActualDomain, iVar);
            iVar.a();
        } catch (InterruptedIOException unused) {
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
            concurrentHashMap = this.this$0.cacheWriters;
            if (concurrentHashMap.containsKey(this.$urlWithActualDomain)) {
                concurrentHashMap2 = this.this$0.cacheWriters;
                concurrentHashMap2.remove(this.$urlWithActualDomain);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProgressiveWithManualCacheDelegate$startVideoCaching$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
