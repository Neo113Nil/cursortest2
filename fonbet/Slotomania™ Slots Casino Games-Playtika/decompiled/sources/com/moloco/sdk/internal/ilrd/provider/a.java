package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.moloco.sdk.IlrdRequest;
import com.moloco.sdk.internal.ilrd.d;
import com.moloco.sdk.internal.ilrd.h;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import io.sentry.TraceContext;
import io.sentry.protocol.Geo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes5.dex */
public final class a implements d {
    public static final C0239a h = new C0239a(null);
    public static final int i = 8;
    public static volatile AppLovinCommunicatorSubscriber j = null;
    public static final String k = "max_revenue_events";
    public static final String l = "ApplovinIlrd";
    public final Context a;
    public final CoroutineScope b;
    public final com.moloco.sdk.internal.ilrd.model.a c;
    public final Lazy d;
    public final Lazy e;
    public final MutableStateFlow<h> f;
    public final MutableSharedFlow<d.a.b> g;

    /* renamed from: com.moloco.sdk.internal.ilrd.provider.a$a, reason: collision with other inner class name */
    public static final class C0239a {
        public /* synthetic */ C0239a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0239a() {
        }
    }

    public static final class b implements AppLovinCommunicatorSubscriber {

        @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.provider.ApplovinIlrd$createCallback$1$onMessageReceived$1", f = "ApplovinIlrd.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.internal.ilrd.provider.a$b$a, reason: collision with other inner class name */
        public static final class C0240a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ a b;
            public final /* synthetic */ d.a.b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0240a(a aVar, d.a.b bVar, Continuation<? super C0240a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0240a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0240a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.b.g;
                    d.a.b bVar = this.c;
                    this.a = 1;
                    if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "Moloco";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (CoroutineScopeKt.isActive(a.this.b) && Intrinsics.areEqual(a.k, message.getTopic())) {
                Bundle messageData = message.getMessageData();
                Intrinsics.checkNotNullExpressionValue(messageData, "getMessageData(...)");
                BuildersKt__Builders_commonKt.launch$default(a.this.b, null, null, new C0240a(a.this, a.this.a(messageData), null), 3, null);
            }
        }
    }

    public a(Context context, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = context;
        this.b = scope;
        this.c = com.moloco.sdk.internal.ilrd.model.a.a;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.d(a.this);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.c(a.this);
            }
        });
        this.f = StateFlowKt.MutableStateFlow(h.c.b);
        this.g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final SharedFlow c(a aVar) {
        return FlowKt.asSharedFlow(aVar.g);
    }

    public static final StateFlow d(a aVar) {
        return FlowKt.asStateFlow(aVar.f);
    }

    public final Object e() {
        Object m11180constructorimpl;
        AppLovinCommunicator appLovinCommunicator;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class.forName("com.applovin.communicator.AppLovinCommunicator");
            Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage");
            try {
                appLovinCommunicator = AppLovinCommunicator.getInstance();
            } catch (Throwable unused) {
                appLovinCommunicator = AppLovinCommunicator.getInstance(this.a);
            }
            m11180constructorimpl = Result.m11180constructorimpl(appLovinCommunicator);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
        }
        b d = d();
        j = d;
        ((AppLovinCommunicator) m11180constructorimpl).subscribe(d, k);
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m11180constructorimpl(Unit.INSTANCE);
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public StateFlow<h> getState() {
        return (StateFlow) this.d.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public synchronized Object b() {
        Object e;
        e = e();
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(e);
        if (m11183exceptionOrNullimpl != null) {
            this.f.setValue(new h.a(m11183exceptionOrNullimpl.toString()));
        }
        if (Result.m11187isSuccessimpl(e)) {
            this.f.setValue(h.b.b);
        }
        return e;
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public SharedFlow<d.a.b> c() {
        return (SharedFlow) this.e.getValue();
    }

    public final b d() {
        return new b();
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.c;
    }

    public final d.a.b a(Bundle bundle) {
        double d = bundle.getDouble("revenue");
        String string = bundle.getString(Geo.JsonKeys.COUNTRY_CODE);
        String string2 = bundle.getString(BrandSafetyEvent.ad);
        String string3 = bundle.getString(BrandSafetyEvent.l);
        String string4 = bundle.getString(BrandSafetyEvent.k);
        String string5 = bundle.getString("ad_format");
        String string6 = bundle.getString(TraceContext.JsonKeys.USER_SEGMENT);
        String string7 = bundle.getString("id");
        IlrdRequest.MaxImpression.Builder newBuilder = IlrdRequest.MaxImpression.newBuilder();
        newBuilder.setRevenue(d);
        if (string != null) {
            newBuilder.setCountryCode(string);
        }
        if (string2 != null) {
            newBuilder.setNetworkName(string2);
        }
        if (string3 != null) {
            newBuilder.setMaxAdUnitId(string3);
        }
        if (string4 != null) {
            newBuilder.setThirdPartyAdPlacementId(string4);
        }
        if (string5 != null) {
            newBuilder.setAdFormat(string5);
        }
        if (string6 != null) {
            newBuilder.setUserSegment(string6);
        }
        if (string7 != null) {
            newBuilder.setId(string7);
        }
        IlrdRequest.MaxImpression build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new d.a.b(build);
    }
}
