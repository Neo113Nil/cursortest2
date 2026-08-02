package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.internal.Y6;
import com.plaid.internal.link.LinkActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.link.LinkActivity$openOutOfProcessWebview$1", f = "LinkActivity.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class G1 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkActivity f39256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(LinkActivity linkActivity, Continuation<? super G1> continuation) {
        super(2, continuation);
        this.f39256b = linkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new G1(this.f39256b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new G1(this.f39256b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39255a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C3806z4 a10 = LinkActivity.a(this.f39256b);
            this.f39255a = 1;
            obj = a10.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null) {
            Y6.a.a("No uri available in pane storage for Out Of Process WebView");
            LinkActivity.a(this.f39256b).a();
            return Unit.INSTANCE;
        }
        C3556a6.a.a(C3556a6.f39823a, "Opening Custom Tab for " + str);
        this.f39256b.a(str);
        LinkActivity.a(this.f39256b).c();
        LinkActivity.c(this.f39256b);
        return Unit.INSTANCE;
    }
}
