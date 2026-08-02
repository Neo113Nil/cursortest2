package com.plaid.internal;

import com.plaid.internal.AbstractC3654i4;
import com.plaid.internal.C3556a6;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import ei.AbstractC4212b;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public final n8 f39495a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public final i8 f39496b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public final AbstractC4212b f39497c;

    public P0(@NotNull InterfaceC3553a3 tokenComponent) {
        Intrinsics.checkNotNullParameter(tokenComponent, "tokenComponent");
        C3704o0 c3704o0 = (C3704o0) tokenComponent;
        C3713p0 c3713p0 = c3704o0.f40882a;
        C3704o0 c3704o02 = c3704o0.f40883b;
        new C3695n0(c3713p0, c3704o02, new I1());
        this.f39495a = c3704o02.f40890i.get();
        E5 retrofitFactory = c3704o02.f40882a.f40943l.get();
        C3691m5 plaidEnvironmentStore = c3704o02.f40882a.f40944m.get();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(plaidEnvironmentStore, "plaidEnvironmentStore");
        EnumC3664j5 env = plaidEnvironmentStore.b();
        Intrinsics.checkNotNullParameter(env, "env");
        int i10 = C3673k5.f40731a[env.ordinal()];
        String str = "https://production.plaid.com/";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "https://development.plaid.com/";
            } else if (i10 == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object create = retrofitFactory.a(str, new G5(null, 3)).create(i8.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        this.f39496b = (i8) Gg.d.d((i8) create);
        this.f39497c = c3713p0.f40936e.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        O0 o02;
        int i10;
        AbstractC3654i4 abstractC3654i4;
        if (continuationImpl instanceof O0) {
            o02 = (O0) continuationImpl;
            int i11 = o02.f39472c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o02.f39472c = i11 - Integer.MIN_VALUE;
                Object obj = o02.f39470a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = o02.f39472c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    n8 n8Var = this.f39495a;
                    i8 i8Var = null;
                    if (n8Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("workflowApiRequestFactory");
                        n8Var = null;
                    }
                    Workflow$LinkWorkflowStartRequest a10 = n8Var.a(str);
                    C3556a6.a.a(C3556a6.f39823a, "embedded view workflow start request is : " + a10);
                    i8 i8Var2 = this.f39496b;
                    if (i8Var2 != null) {
                        i8Var = i8Var2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("workflowApi");
                    }
                    o02.f39472c = 1;
                    obj = i8Var.a(a10, o02);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                abstractC3654i4 = (AbstractC3654i4) obj;
                if (!abstractC3654i4.a()) {
                    C3556a6.a.b(C3556a6.f39823a, "embedded search workflow start request error: " + abstractC3654i4);
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m147constructorimpl(ResultKt.createFailure(new Exception("embedded search workflow start request error: " + abstractC3654i4)));
                }
                Intrinsics.checkNotNull(abstractC3654i4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse>");
                Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (Workflow$LinkWorkflowStartResponse) ((AbstractC3654i4.c) abstractC3654i4).b();
                String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                if (url.length() != 0) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m147constructorimpl(workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl());
                }
                C3556a6.a.b(C3556a6.f39823a, "missing webview fallback url: " + workflow$LinkWorkflowStartResponse);
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m147constructorimpl(ResultKt.createFailure(new Exception("missing webview fallback url: " + workflow$LinkWorkflowStartResponse)));
            }
        }
        o02 = new O0(this, continuationImpl);
        Object obj2 = o02.f39470a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = o02.f39472c;
        if (i10 != 0) {
        }
        abstractC3654i4 = (AbstractC3654i4) obj2;
        if (!abstractC3654i4.a()) {
        }
    }
}
