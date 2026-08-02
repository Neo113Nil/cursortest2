package com.plaid.internal;

import Ph.AbstractC1440a0;
import com.plaid.internal.AbstractC3654i4;
import com.plaid.internal.C3556a6;
import com.plaid.internal.F6;
import com.plaid.internal.I2;
import com.plaid.internal.Y6;
import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest;
import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkResult;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nChannelPolling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelPolling.kt\ncom/plaid/internal/workflow/ChannelPolling\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final i8 f39235a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f39236b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39237c;

    public F(@NotNull i8 workflowApi) {
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        this.f39235a = workflowApi;
        this.f39236b = new HashSet<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r12 != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c3 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(F f10, A a10, G g10, ContinuationImpl continuationImpl) {
        E e10;
        int i10;
        String str;
        String str2;
        boolean z10;
        F f11;
        A a11;
        long j10;
        f10.getClass();
        if (continuationImpl instanceof E) {
            e10 = (E) continuationImpl;
            int i11 = e10.f39219h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e10.f39219h = i11 - Integer.MIN_VALUE;
                Object obj = e10.f39217f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = e10.f39219h;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Map metadata = MapsKt.mapOf(TuplesKt.to("channel_id", a10.f39137a));
                    Intrinsics.checkNotNullParameter("Polling started", "eventName");
                    Intrinsics.checkNotNullParameter(metadata, "metadata");
                    F6.a.a("Polling started", metadata, J6.INFO);
                    str = null;
                    boolean z11 = f10.f39237c;
                    j10 = a10.f39139c;
                    e10.f39212a = f10;
                    e10.f39213b = a10;
                    e10.f39214c = g10;
                    e10.f39215d = str;
                    e10.f39216e = z11;
                    e10.f39219h = 1;
                    if (AbstractC1440a0.a(j10, e10) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = e10.f39216e;
                    str2 = e10.f39215d;
                    g10 = e10.f39214c;
                    a11 = e10.f39213b;
                    f11 = e10.f39212a;
                    ResultKt.throwOnFailure(obj);
                    String str3 = str2;
                    boolean z12 = z10;
                    f10 = f11;
                    E e11 = e10;
                    Object obj2 = obj;
                    G g11 = g10;
                    String str4 = str3;
                    AbstractC3654i4 abstractC3654i4 = (AbstractC3654i4) obj2;
                    if (abstractC3654i4 instanceof AbstractC3654i4.b) {
                        C3556a6.a aVar = C3556a6.f39823a;
                        IOException iOException = ((AbstractC3654i4.b) abstractC3654i4).f40675a;
                        aVar.getClass();
                        C3556a6.f39824b.a(iOException, true);
                    } else if (abstractC3654i4 instanceof AbstractC3654i4.a) {
                        if (C3740s1.a((AbstractC3654i4.a) abstractC3654i4)) {
                            C3556a6.a.e(C3556a6.f39823a, "Closing channel due to invalid channel response.");
                            F6.a.b(MapsKt.emptyMap(), "Polling stopped, channel closed.");
                            return Unit.INSTANCE;
                        }
                    } else if (abstractC3654i4 instanceof AbstractC3654i4.d) {
                        C3556a6.a aVar2 = C3556a6.f39823a;
                        Throwable th2 = ((AbstractC3654i4.d) abstractC3654i4).f40677a;
                        aVar2.getClass();
                        C3556a6.f39824b.a(th2, true);
                    } else if (abstractC3654i4 instanceof AbstractC3654i4.c) {
                        AbstractC3654i4.c cVar = (AbstractC3654i4.c) abstractC3654i4;
                        str4 = ((Channel$LinkChannelFetchResponse) cVar.f40676a).getFetchId();
                        LinkResult a12 = f10.a((Channel$LinkChannelFetchResponse) cVar.f40676a, g11);
                        if (a12 != null) {
                            g11.a(a12);
                            F6.a.b(MapsKt.emptyMap(), "Polling stopped, link result received.");
                            return Unit.INSTANCE;
                        }
                    }
                    if (z12) {
                        g11.a();
                        F6.a.b(MapsKt.emptyMap(), "Polling stopped, no results from channel.");
                        return Unit.INSTANCE;
                    }
                    str = str4;
                    g10 = g11;
                    a10 = a11;
                    e10 = e11;
                    boolean z112 = f10.f39237c;
                    j10 = a10.f39139c;
                    e10.f39212a = f10;
                    e10.f39213b = a10;
                    e10.f39214c = g10;
                    e10.f39215d = str;
                    e10.f39216e = z112;
                    e10.f39219h = 1;
                    if (AbstractC1440a0.a(j10, e10) != coroutine_suspended) {
                        f11 = f10;
                        z10 = z112;
                        a11 = a10;
                        str2 = str;
                        i8 i8Var = f11.f39235a;
                        Channel$LinkChannelFetchRequest.a newBuilder = Channel$LinkChannelFetchRequest.newBuilder();
                        newBuilder.a(a11.f39137a);
                        newBuilder.b(a11.f39138b);
                        if (str2 != null) {
                            newBuilder.c(str2);
                        }
                        Channel$LinkChannelFetchRequest build = newBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        e10.f39212a = f11;
                        e10.f39213b = a11;
                        e10.f39214c = g10;
                        e10.f39215d = str2;
                        e10.f39216e = z10;
                        e10.f39219h = 2;
                        obj = i8Var.a(build, e10);
                    }
                    return coroutine_suspended;
                }
                z10 = e10.f39216e;
                str2 = e10.f39215d;
                g10 = e10.f39214c;
                a11 = e10.f39213b;
                f11 = e10.f39212a;
                ResultKt.throwOnFailure(obj);
                i8 i8Var2 = f11.f39235a;
                Channel$LinkChannelFetchRequest.a newBuilder2 = Channel$LinkChannelFetchRequest.newBuilder();
                newBuilder2.a(a11.f39137a);
                newBuilder2.b(a11.f39138b);
                if (str2 != null) {
                }
                Channel$LinkChannelFetchRequest build2 = newBuilder2.build();
                Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                e10.f39212a = f11;
                e10.f39213b = a11;
                e10.f39214c = g10;
                e10.f39215d = str2;
                e10.f39216e = z10;
                e10.f39219h = 2;
                obj = i8Var2.a(build2, e10);
            }
        }
        e10 = new E(f10, continuationImpl);
        Object obj3 = e10.f39217f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = e10.f39219h;
        if (i10 != 0) {
        }
    }

    public final LinkResult a(Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse, G g10) {
        Channel$Message.SDKResult result;
        LinkResult a10;
        Unit unit;
        Channel$Message.SDKEvent event;
        LinkResult linkResult = null;
        for (Channel$Message channel$Message : channel$LinkChannelFetchResponse.getMessagesList()) {
            if (!this.f39236b.contains(channel$Message.getMessageId())) {
                this.f39236b.add(channel$Message.getMessageId());
                if (channel$Message.hasEvent() && (event = channel$Message.getEvent()) != null) {
                    LinkEvent a11 = S6.a(event);
                    if (a11.getEventName().toString().length() != 0) {
                        g10.a(a11, I2.d.f39294a);
                    }
                }
                if (channel$Message.hasInternalEvent() && channel$Message.getInternalEvent().hasRequestSilentNetworkAuth()) {
                    Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth = channel$Message.getInternalEvent().getRequestSilentNetworkAuth();
                    Intrinsics.checkNotNull(requestSilentNetworkAuth);
                    AbstractC3648h7 a12 = Q6.a(requestSilentNetworkAuth);
                    if (a12 != null) {
                        F6.a.b(MapsKt.emptyMap(), "Polling received SNA request");
                        g10.a(a12);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        Y6.a.a("Invalid SNA request: " + requestSilentNetworkAuth);
                    }
                }
                if (channel$Message.hasPreCompletionResult()) {
                    Channel$Message.SDKResult preCompletionResult = channel$Message.getPreCompletionResult();
                    Intrinsics.checkNotNullExpressionValue(preCompletionResult, "getPreCompletionResult(...)");
                    g10.a(preCompletionResult);
                }
                if (channel$Message.hasResult() && (result = channel$Message.getResult()) != null && (a10 = T6.a(result)) != null) {
                    linkResult = a10;
                }
            }
        }
        return linkResult;
    }
}
