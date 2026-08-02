package ru.ozon.app.android.marketing.widgets.highlightsWrapper.core;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl$loadAsyncData$1", f = "HighlightsWrapperStateManagerImpl.kt", l = {102, 103}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HighlightsWrapperStateManagerImpl$loadAsyncData$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    int label;
    final /* synthetic */ HighlightsWrapperStateManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsWrapperStateManagerImpl$loadAsyncData$1(HighlightsWrapperStateManagerImpl highlightsWrapperStateManagerImpl, String str, d<? super HighlightsWrapperStateManagerImpl$loadAsyncData$1> dVar) {
        super(2, dVar);
        this.this$0 = highlightsWrapperStateManagerImpl;
        this.$asyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HighlightsWrapperStateManagerImpl$loadAsyncData$1(this.this$0, this.$asyncData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m791requestAsyncgIAlus;
        w0 w0Var;
        HighlightsWrapperAsyncState parseAsyncResponse;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            HighlightsWrapperStateManagerImpl highlightsWrapperStateManagerImpl = this.this$0;
            String str = this.$asyncData;
            this.label = 1;
            m791requestAsyncgIAlus = highlightsWrapperStateManagerImpl.m791requestAsyncgIAlus(str, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            m791requestAsyncgIAlus = ((r) obj).getF26106a();
        }
        w0Var = this.this$0.widgetsState;
        parseAsyncResponse = this.this$0.parseAsyncResponse(m791requestAsyncgIAlus);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HighlightsWrapperStateManagerImpl$loadAsyncData$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
