package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2096k0 {

    /* renamed from: androidx.core.view.k0$a */
    public static final class a extends RestrictedSuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f19241n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f19242o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ View f19243p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, Continuation continuation) {
            super(2, continuation);
            this.f19243p = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f19243p, continuation);
            aVar.f19242o = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        
            if (r1.yieldAll(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        
            if (r1.yield(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f19241n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f19242o;
                View view = this.f19243p;
                this.f19242o = sequenceScope;
                this.f19241n = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                sequenceScope = (SequenceScope) this.f19242o;
                ResultKt.throwOnFailure(obj);
            }
            View view2 = this.f19243p;
            if (view2 instanceof ViewGroup) {
                Sequence b10 = AbstractC2094j0.b((ViewGroup) view2);
                this.f19242o = null;
                this.f19241n = 2;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Sequence a(View view) {
        return SequencesKt.sequence(new a(view, null));
    }
}
