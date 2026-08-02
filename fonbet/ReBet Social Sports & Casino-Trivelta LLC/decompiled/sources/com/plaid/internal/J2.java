package com.plaid.internal;

import android.content.Intent;
import com.plaid.internal.C3556a6;
import com.plaid.internal.D6;
import com.plaid.internal.link.LinkActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.redirect.LinkRedirectActivityViewModel$redirectToLink$1", f = "LinkRedirectActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class J2 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkRedirectActivity f39310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D6 f39311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(LinkRedirectActivity linkRedirectActivity, D6 d62, Continuation continuation) {
        super(2, continuation);
        this.f39310a = linkRedirectActivity;
        this.f39311b = d62;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new J2(this.f39310a, this.f39311b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new J2(this.f39310a, this.f39311b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C3556a6.f39823a.getClass();
        C3556a6.a.a("Launching LinkActivity", true);
        LinkRedirectActivity context = this.f39310a;
        int i10 = LinkActivity.f40774e;
        D6 state = this.f39311b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(state, "redirectState");
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(603979776);
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof D6.a) {
            intent.putExtra("link_oauth_redirect", true);
            intent.putExtra("link_oauth_received_redirect_uri", ((D6.a) state).f39206a);
        } else if (state instanceof D6.b) {
            intent.putExtra("link_out_of_process_complete_redirect", true);
            intent.putExtra("link_out_of_process_complete_redirect_uri", ((D6.b) state).f39207a);
        } else if (state instanceof D6.d) {
            intent.putExtra("redirect_error", true);
            intent.putExtra("redirect_error_exception", ((D6.d) state).f39208a);
        } else if (state instanceof D6.e) {
            intent.putExtra("link_resume_redirect", true);
        }
        context.startActivity(intent);
        return Unit.INSTANCE;
    }
}
