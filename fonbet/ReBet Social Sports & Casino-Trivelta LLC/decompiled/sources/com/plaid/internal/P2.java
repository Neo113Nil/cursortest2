package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 147, EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m = "callWorkflowStart", n = {"this", "workflowId", "linkOpenId", "oauthNonce"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
public final class P2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Y2 f39499a;

    /* renamed from: b, reason: collision with root package name */
    public String f39500b;

    /* renamed from: c, reason: collision with root package name */
    public String f39501c;

    /* renamed from: d, reason: collision with root package name */
    public String f39502d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2 f39504f;

    /* renamed from: g, reason: collision with root package name */
    public int f39505g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(Y2 y22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39504f = y22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39503e = obj;
        this.f39505g |= Integer.MIN_VALUE;
        return this.f39504f.a((Workflow$LinkWorkflowStartRequest) null, (String) null, (String) null, (String) null, this);
    }
}
