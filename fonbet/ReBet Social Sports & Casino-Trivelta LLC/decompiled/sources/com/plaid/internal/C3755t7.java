package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.plaid.internal.AbstractC3654i4;
import com.plaid.internal.C3556a6;
import com.plaid.internal.F6;
import com.plaid.internal.InterfaceC3728q6;
import com.plaid.internal.Y6;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.t7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3755t7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3773v7 f41098a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC3639g7 f41099b;

    public C3755t7(@NotNull InterfaceC3773v7 twilioVerifySna, @NotNull InterfaceC3639g7 snaApi) {
        Intrinsics.checkNotNullParameter(twilioVerifySna, "twilioVerifySna");
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        this.f41098a = twilioVerifySna;
        this.f41099b = snaApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull C3764u7 c3764u7, @NotNull ContinuationImpl continuationImpl) {
        C3737r7 c3737r7;
        int i10;
        C3755t7 c3755t7;
        InterfaceC3728q6 interfaceC3728q6;
        if (continuationImpl instanceof C3737r7) {
            c3737r7 = (C3737r7) continuationImpl;
            int i11 = c3737r7.f41035e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3737r7.f41035e = i11 - Integer.MIN_VALUE;
                Object obj = c3737r7.f41033c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3737r7.f41035e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C3556a6.a.a(C3556a6.f39823a, "Twilio redirect uri: " + c3764u7.a());
                    F6.a.b(MapsKt.emptyMap(), "TwilioSNA - start processUrl");
                    Ph.L b10 = C1452g0.b();
                    C3746s7 c3746s7 = new C3746s7(this, c3764u7, null);
                    c3737r7.f41031a = this;
                    c3737r7.f41032b = c3764u7;
                    c3737r7.f41035e = 1;
                    obj = AbstractC1455i.g(b10, c3746s7, c3737r7);
                    if (obj != coroutine_suspended) {
                        c3755t7 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AbstractC3654i4 abstractC3654i4 = (AbstractC3654i4) obj;
                    if (abstractC3654i4 instanceof AbstractC3654i4.c) {
                        C3556a6.a.a(C3556a6.f39823a, "/twilio/finish response Success: " + ((AbstractC3654i4.c) abstractC3654i4).b());
                    } else if (abstractC3654i4 instanceof AbstractC3654i4.b) {
                        AbstractC3654i4.b bVar = (AbstractC3654i4.b) abstractC3654i4;
                        F6.a.a(MapsKt.mapOf(TuplesKt.to("Exception", bVar.b().toString())), "TwilioSNA - /twilio/finish failure NetworkError");
                        Y6.a.a("/twilio/finish response NetworkError: " + bVar.b());
                    } else if (abstractC3654i4 instanceof AbstractC3654i4.a) {
                        AbstractC3654i4.a aVar = (AbstractC3654i4.a) abstractC3654i4;
                        F6.a.a(MapsKt.mapOf(TuplesKt.to("Exception", String.valueOf(aVar.b()))), "TwilioSNA - /twilio/finish failure HttpError");
                        Y6.a.a("/twilio/finish response HttpError: " + aVar.b());
                    } else if (abstractC3654i4 instanceof AbstractC3654i4.d) {
                        AbstractC3654i4.d dVar = (AbstractC3654i4.d) abstractC3654i4;
                        F6.a.a(MapsKt.mapOf(TuplesKt.to("Exception", String.valueOf(dVar.b()))), "TwilioSNA - /twilio/finish failure UnknownError");
                        Y6.a.a("/twilio/finish response UnknownError: " + dVar.b());
                    }
                    return Unit.INSTANCE;
                }
                c3764u7 = c3737r7.f41032b;
                c3755t7 = c3737r7.f41031a;
                ResultKt.throwOnFailure(obj);
                interfaceC3728q6 = (InterfaceC3728q6) obj;
                if (!(interfaceC3728q6 instanceof InterfaceC3728q6.a)) {
                    F6.a.a();
                    Y6.a.a("Error processing Twilio redirect uri: " + ((InterfaceC3728q6.a) interfaceC3728q6).a());
                    return Unit.INSTANCE;
                }
                if (interfaceC3728q6 instanceof InterfaceC3728q6.b) {
                    C3556a6.a aVar2 = C3556a6.f39823a;
                    C3556a6.a.a(aVar2, "processUrl success: " + ((InterfaceC3728q6.b) interfaceC3728q6).a());
                    F6.a.b(MapsKt.emptyMap(), "TwilioSNA - processUrl success, sending twilioFinishRequest");
                    SilentNetworkAuth$LinkSNATwilioFinishRequest build = SilentNetworkAuth$LinkSNATwilioFinishRequest.newBuilder().a(c3764u7.b()).build();
                    C3556a6.a.a(aVar2, "sending twilioFinishRequest: " + build);
                    InterfaceC3639g7 interfaceC3639g7 = c3755t7.f41099b;
                    Intrinsics.checkNotNull(build);
                    c3737r7.f41031a = null;
                    c3737r7.f41032b = null;
                    c3737r7.f41035e = 2;
                    obj = interfaceC3639g7.a(build, c3737r7);
                }
                return Unit.INSTANCE;
            }
        }
        c3737r7 = new C3737r7(this, continuationImpl);
        Object obj2 = c3737r7.f41033c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3737r7.f41035e;
        if (i10 != 0) {
        }
        interfaceC3728q6 = (InterfaceC3728q6) obj2;
        if (!(interfaceC3728q6 instanceof InterfaceC3728q6.a)) {
        }
    }
}
