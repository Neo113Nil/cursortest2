package com.plaid.internal;

import com.plaid.internal.AbstractC3654i4;
import com.plaid.internal.C3556a6;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3708o4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final i8 f40915a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3787x3 f40916b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C3717p4 f40917c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final r8 f40918d;

    /* renamed from: e, reason: collision with root package name */
    public final Workflow$LinkWorkflowPollRequest f40919e;

    public C3708o4(@NotNull i8 workflowApi, @NotNull C3787x3 analytics, @NotNull C3717p4 pollingOptions, @NotNull String oAuthStateId, @NotNull r8 workflowPaneId) {
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(pollingOptions, "pollingOptions");
        Intrinsics.checkNotNullParameter(oAuthStateId, "oAuthStateId");
        Intrinsics.checkNotNullParameter(workflowPaneId, "workflowPaneId");
        this.f40915a = workflowApi;
        this.f40916b = analytics;
        this.f40917c = pollingOptions;
        this.f40918d = workflowPaneId;
        this.f40919e = Workflow$LinkWorkflowPollRequest.newBuilder().a(workflowPaneId.f41037a).a(Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.newBuilder().a(oAuthStateId).build()).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (Ph.AbstractC1440a0.a(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
    
        if (r14 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d2 -> B:11:0x00d5). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        C3699n4 c3699n4;
        int i10;
        long currentTimeMillis;
        C3708o4 c3708o4;
        boolean z10;
        boolean z11;
        if (continuationImpl instanceof C3699n4) {
            c3699n4 = (C3699n4) continuationImpl;
            int i11 = c3699n4.f40852e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3699n4.f40852e = i11 - Integer.MIN_VALUE;
                Object obj = c3699n4.f40850c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3699n4.f40852e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.f40917c.c()) {
                        C3556a6.a.a(C3556a6.f39823a, "Not polling for oAuth result");
                        return Unit.INSTANCE;
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    C3556a6.a.a(C3556a6.f39823a, "Polling for oAuth result - duration: " + this.f40917c.b() + " interval: " + this.f40917c.a());
                    this.f40916b.b(this.f40918d);
                    c3708o4 = this;
                    z10 = false;
                    z11 = false;
                    if (!z10) {
                    }
                } else if (i10 == 1) {
                    currentTimeMillis = c3699n4.f40849b;
                    c3708o4 = c3699n4.f40848a;
                    ResultKt.throwOnFailure(obj);
                    C3556a6.a.a(C3556a6.f39823a, "OAuth polling attempt - " + (System.currentTimeMillis() - currentTimeMillis));
                    i8 i8Var = c3708o4.f40915a;
                    Workflow$LinkWorkflowPollRequest pollRequest = c3708o4.f40919e;
                    Intrinsics.checkNotNullExpressionValue(pollRequest, "pollRequest");
                    c3699n4.f40848a = c3708o4;
                    c3699n4.f40849b = currentTimeMillis;
                    c3699n4.f40852e = 2;
                    obj = i8Var.a(pollRequest, c3699n4);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    currentTimeMillis = c3699n4.f40849b;
                    c3708o4 = c3699n4.f40848a;
                    ResultKt.throwOnFailure(obj);
                    AbstractC3654i4 abstractC3654i4 = (AbstractC3654i4) obj;
                    if (abstractC3654i4 instanceof AbstractC3654i4.c) {
                        Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse = (Workflow$LinkWorkflowPollResponse) ((AbstractC3654i4.c) abstractC3654i4).b();
                        c3708o4.getClass();
                        if (workflow$LinkWorkflowPollResponse.hasOauthRedirectComplete() ? workflow$LinkWorkflowPollResponse.getOauthRedirectComplete().getIsComplete() : false) {
                            z11 = true;
                            if (z11) {
                                C3556a6.a.a(C3556a6.f39823a, "OAuth polling detected OAuth session completion");
                            } else if (System.currentTimeMillis() - currentTimeMillis <= c3708o4.f40917c.b()) {
                                z10 = false;
                                if (!z10) {
                                    c3708o4.f40916b.a(c3708o4.f40918d);
                                    C3556a6.a.a(C3556a6.f39823a, "Stopped polling, session was completed: " + z11);
                                    return Unit.INSTANCE;
                                }
                                long a10 = c3708o4.f40917c.a();
                                c3699n4.f40848a = c3708o4;
                                c3699n4.f40849b = currentTimeMillis;
                                c3699n4.f40852e = 1;
                            }
                            z10 = true;
                            if (!z10) {
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                    z10 = true;
                    if (!z10) {
                    }
                }
            }
        }
        c3699n4 = new C3699n4(this, continuationImpl);
        Object obj2 = c3699n4.f40850c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3699n4.f40852e;
        if (i10 != 0) {
        }
    }
}
