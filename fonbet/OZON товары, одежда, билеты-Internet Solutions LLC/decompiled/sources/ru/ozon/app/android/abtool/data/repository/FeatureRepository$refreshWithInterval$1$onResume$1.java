package ru.ozon.app.android.abtool.data.repository;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.data.repository.FeatureRepository$refreshWithInterval$1$onResume$1", f = "FeatureRepository.kt", l = {356, 358, 359}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class FeatureRepository$refreshWithInterval$1$onResume$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Long $intervalMs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FeatureRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureRepository$refreshWithInterval$1$onResume$1(FeatureRepository featureRepository, Long l11, d<? super FeatureRepository$refreshWithInterval$1$onResume$1> dVar) {
        super(2, dVar);
        this.this$0 = featureRepository;
        this.$intervalMs = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FeatureRepository$refreshWithInterval$1$onResume$1 featureRepository$refreshWithInterval$1$onResume$1 = new FeatureRepository$refreshWithInterval$1$onResume$1(this.this$0, this.$intervalMs, dVar);
        featureRepository$refreshWithInterval$1$onResume$1.L$0 = obj;
        return featureRepository$refreshWithInterval$1$onResume$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (xe.Y.b(r4, r10) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        if (r11.fetchAndUpdateCache(r10) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (xe.Y.b(r8, r10) == r0) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x008e -> B:12:0x006d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Long l11;
        Long l12;
        long longValue;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    m11 = (M) this.L$0;
                    s.b(obj);
                    long longValue2 = this.$intervalMs.longValue();
                    this.L$0 = m11;
                    this.label = 3;
                } else if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            m11 = (M) this.L$0;
            s.b(obj);
        } else {
            s.b(obj);
            m11 = (M) this.L$0;
            l11 = this.this$0.lastRemoteRequestTime;
            if (l11 != null) {
                l12 = new Long(Math.max(System.currentTimeMillis() - l11.longValue(), 0L));
            } else {
                l12 = null;
            }
            if (l12 != null) {
                Long l13 = this.$intervalMs;
                longValue = l13.longValue() - l12.longValue();
            } else {
                longValue = this.$intervalMs.longValue();
            }
            this.L$0 = m11;
            this.label = 1;
        }
        if (!N.f(m11)) {
            return Unit.f71690a;
        }
        FeatureRepository featureRepository = this.this$0;
        this.L$0 = m11;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FeatureRepository$refreshWithInterval$1$onResume$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
