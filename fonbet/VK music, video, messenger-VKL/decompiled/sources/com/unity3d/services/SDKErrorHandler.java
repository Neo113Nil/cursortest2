package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.d;
import xsna.hpj;
import xsna.myc0;
import xsna.ovj;
import xsna.pvj;
import xsna.s3q0;
import xsna.vvj;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: SDKErrorHandler.kt */
/* loaded from: classes14.dex */
public final class SDKErrorHandler implements pvj {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final pvj.a key;
    private final yvj scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: SDKErrorHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SDKErrorHandler(ovj ovjVar, SendDiagnosticEvent sendDiagnosticEvent) {
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        hpj g = zvj.g(zvj.a(ovjVar), new vvj("SDKErrorHandler"));
        pvj.a aVar = pvj.a.b;
        this.scope = zvj.g(g, new SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(aVar));
        this.key = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String retrieveCoroutineName(d dVar) {
        String str;
        vvj vvjVar = (vvj) dVar.get(vvj.c);
        return (vvjVar == null || (str = vvjVar.b) == null) ? "unknown" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteString retrieveOpportunityId(d dVar) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) dVar.get(CoroutineOpportunity.Key);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDiagnostic(String str, String str2, String str3, String str4, ByteString byteString) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("reason", str2);
        mapBuilder.put("reason_debug", str4);
        mapBuilder.put("coroutine_name", str3);
        if (byteString != null) {
            mapBuilder.put("impressionOpportunityId", ProtobufExtensionsKt.toUUID(byteString).toString());
        }
        s3q0 s3q0Var = s3q0.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (Double) null, mapBuilder.h(), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // xsna.pvj
    public void handleException(d dVar, Throwable th) {
        myc0.h(this.scope, null, null, new SDKErrorHandler$handleException$1(this, dVar, th, null), 3);
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.a.a(this, dVar);
    }

    @Override // kotlin.coroutines.d.b
    public pvj.a getKey() {
        return this.key;
    }
}
