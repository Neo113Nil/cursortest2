package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics", f = "LinkWorkflowAnalytics.kt", i = {0, 1, 1, 2}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m = "sendAllAnalyticsEventsToServer", n = {"this", "this", "it", "this"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* renamed from: com.plaid.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3760u3 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C3787x3 f41112a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f41113b;

    /* renamed from: c, reason: collision with root package name */
    public Workflow$LinkWorkflowEventRequest f41114c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f41115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3787x3 f41116e;

    /* renamed from: f, reason: collision with root package name */
    public int f41117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3760u3(C3787x3 c3787x3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41116e = c3787x3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41115d = obj;
        this.f41117f |= Integer.MIN_VALUE;
        return C3787x3.a(this.f41116e, this);
    }
}
