package ai.verisoul.sdk.helpers.webview;

import Ph.C0;
import Ph.C1452g0;
import Ph.M0;
import Ph.P;
import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$shutdown$1", f = "VerisoulWebViewImpl.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 274}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class VerisoulWebViewImpl$shutdown$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VerisoulWebViewImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$shutdown$1$1", f = "VerisoulWebViewImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$shutdown$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ VerisoulWebViewImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VerisoulWebViewImpl verisoulWebViewImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = verisoulWebViewImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.actuallyDestroy();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerisoulWebViewImpl$shutdown$1(VerisoulWebViewImpl verisoulWebViewImpl, Continuation<? super VerisoulWebViewImpl$shutdown$1> continuation) {
        super(2, continuation);
        this.this$0 = verisoulWebViewImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new VerisoulWebViewImpl$shutdown$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((VerisoulWebViewImpl$shutdown$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (Ph.AbstractC1455i.g(r6, r1, r5) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (Ph.F0.f(r6, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (Ph.F0.f(r6, r5) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        C0 c02;
        C0 c03;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            c02 = this.this$0.initJob;
            if (c02 != null) {
                this.label = 1;
            }
        } else if (i10 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            M0 c10 = C1452g0.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 3;
        }
        c03 = this.this$0.destroyJob;
        if (c03 != null) {
            this.label = 2;
        }
        M0 c102 = C1452g0.c();
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, null);
        this.label = 3;
    }
}
