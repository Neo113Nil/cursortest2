package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.ironsource.U3;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ad2;
import defpackage.au3;
import defpackage.bu3;
import defpackage.cu3;
import defpackage.gu3;
import defpackage.ku3;
import defpackage.ltb;
import defpackage.s9a;
import defpackage.xw3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/unity3d/services/SDKErrorHandler;", "Lcu3;", "Lau3;", "defaultDispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lau3;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "", "name", "reason", "scopeName", "stackTrace", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "sendDiagnostic", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "retrieveCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "retrieveOpportunityId", "(Lkotlin/coroutines/CoroutineContext;)Lcom/google/protobuf/ByteString;", "", "exception", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lku3;", "scope", "Lku3;", "Lbu3;", U3.i.W, "Lbu3;", "getKey", "()Lbu3;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SDKErrorHandler implements cu3 {

    @NotNull
    public static final String UNITY_PACKAGE = "com.unity3d";

    @NotNull
    public static final String UNKNOWN_FILE = "unknown";

    @NotNull
    private final bu3 key;

    @NotNull
    private final ku3 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public SDKErrorHandler(@NotNull au3 au3Var, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        au3Var.getClass();
        sendDiagnosticEvent.getClass();
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        ad2 F = s9a.F(s9a.c(au3Var), new gu3("SDKErrorHandler"));
        bu3 bu3Var = bu3.a;
        this.scope = s9a.F(F, new SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(bu3Var));
        this.key = bu3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String retrieveCoroutineName(CoroutineContext context) {
        gu3 gu3Var = (gu3) context.get(gu3.c);
        return gu3Var != null ? gu3Var.b : "unknown";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteString retrieveOpportunityId(CoroutineContext context) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) context.get(CoroutineOpportunity.INSTANCE);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDiagnostic(String name, String reason, String scopeName, String stackTrace, ByteString opportunityId) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        ltb ltbVar = new ltb();
        ltbVar.put("reason", reason);
        ltbVar.put("reason_debug", stackTrace);
        ltbVar.put("coroutine_name", scopeName);
        if (opportunityId != null) {
            String uuid = ProtobufExtensionsKt.toUUID(opportunityId).toString();
            uuid.getClass();
            ltbVar.put("impressionOpportunityId", uuid);
        }
        Unit unit = Unit.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, name, (Double) null, ltbVar.d(), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) e.a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull f fVar) {
        return (E) e.b(this, fVar);
    }

    @Override // defpackage.cu3
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        context.getClass();
        exception.getClass();
        xw3.L(this.scope, null, null, new SDKErrorHandler$handleException$1(this, context, exception, null), 3);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull f fVar) {
        return e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public bu3 getKey() {
        return this.key;
    }
}
