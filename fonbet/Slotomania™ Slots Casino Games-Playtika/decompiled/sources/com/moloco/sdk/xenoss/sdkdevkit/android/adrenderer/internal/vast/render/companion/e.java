package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class e implements d {
    public final int a;
    public final D b;
    public final StateFlow<d.a> c;

    public static final class a implements Flow<d.a> {
        public final /* synthetic */ Flow a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a, reason: collision with other inner class name */
        public static final class C0354a<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector a;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionGoNextActionImpl$special$$inlined$map$1$2", f = "CompanionGoNextAction.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a$a, reason: collision with other inner class name */
            public static final class C0355a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;
                public Object c;

                public C0355a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0354a.this.emit(null, this);
                }
            }

            public C0354a(FlowCollector flowCollector) {
                this.a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0355a c0355a;
                int i;
                d.a b;
                if (continuation instanceof C0355a) {
                    c0355a = (C0355a) continuation;
                    int i2 = c0355a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0355a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0355a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0355a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.a;
                            b = f.b(((UInt) obj).getData());
                            c0355a.b = 1;
                            if (flowCollector.emit(b, c0355a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0355a = new C0355a(continuation);
                Object obj22 = c0355a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0355a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public a(Flow flow) {
            this.a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super d.a> flowCollector, Continuation continuation) {
            Object collect = this.a.collect(new C0354a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, coroutineScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow<d.a> l() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.b.a(this.a);
    }

    public e(int i, CoroutineScope scope) {
        d.a b;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = i;
        D d = new D(i, scope, null);
        this.b = d;
        a aVar = new a(d.a());
        SharingStarted WhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null);
        b = f.b(i);
        this.c = FlowKt.stateIn(aVar, scope, WhileSubscribed$default, b);
    }
}
