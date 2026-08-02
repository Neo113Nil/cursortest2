package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.moloco.sdk.Init;
import com.moloco.sdk.internal.services.InterfaceC2809d;
import com.moloco.sdk.internal.services.J;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes7.dex */
public final class c {
    public static final a c = new a(null);
    public static final int d = 8;
    public static final String e = "IlrdInitializer";
    public final Context a;
    public f b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final f a() {
        return this.b;
    }

    public final Object b(Init.SDKInitResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.b != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(Unit.INSTANCE);
        }
        Init.SDKInitResponse.ILRDConfig a2 = a(response);
        if (a2 == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("No ILRD configuration found")));
        }
        List<Init.SDKInitResponse.SupportedNetworks> supportedNetworksList = a2.getSupportedNetworksList();
        if (!a2.getEnabled()) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("Publisher has not opted into ILRD collection")));
        }
        if (supportedNetworksList.isEmpty()) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("No ILRD supported networks available")));
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        b a3 = a(CoroutineScope, a2, response);
        Intrinsics.checkNotNull(supportedNetworksList);
        a(CoroutineScope, a3, supportedNetworksList);
        Result.Companion companion5 = Result.INSTANCE;
        return Result.m11180constructorimpl(Unit.INSTANCE);
    }

    public final Init.SDKInitResponse.ILRDConfig a(Init.SDKInitResponse sDKInitResponse) {
        if (sDKInitResponse.hasIlrdConfig()) {
            return sDKInitResponse.getIlrdConfig();
        }
        return null;
    }

    public final b a(CoroutineScope coroutineScope, Init.SDKInitResponse.ILRDConfig iLRDConfig, Init.SDKInitResponse sDKInitResponse) {
        String rawImpUrl = iLRDConfig.getRawImpUrl();
        Intrinsics.checkNotNullExpressionValue(rawImpUrl, "getRawImpUrl(...)");
        i c2 = a.i.a.c();
        Duration.Companion companion = Duration.INSTANCE;
        int sessionExp = iLRDConfig.getSessionExp();
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long duration = DurationKt.toDuration(sessionExp, durationUnit);
        int maxBatchSize = iLRDConfig.getMaxBatchSize();
        long duration2 = DurationKt.toDuration(iLRDConfig.getUploadInterval(), durationUnit);
        long duration3 = DurationKt.toDuration(iLRDConfig.getMaxSessionLen(), durationUnit);
        a.h hVar = a.h.a;
        J i = hVar.i();
        Lifecycle lifecycle = ProcessLifecycleOwner.INSTANCE.get().getLifecycle();
        InterfaceC2809d d2 = hVar.d();
        String publisherId = sDKInitResponse.getPublisherId();
        Intrinsics.checkNotNullExpressionValue(publisherId, "getPublisherId(...)");
        String appId = sDKInitResponse.getAppId();
        Intrinsics.checkNotNullExpressionValue(appId, "getAppId(...)");
        return new b(coroutineScope, rawImpUrl, c2, duration, maxBatchSize, duration2, duration3, i, lifecycle, d2, publisherId, appId, a.j.a.b(), null, null, null, 57344, null);
    }

    public final f a(CoroutineScope coroutineScope, b bVar, List<? extends Init.SDKInitResponse.SupportedNetworks> list) {
        f fVar = new f(coroutineScope, this.a, bVar, list);
        this.b = fVar;
        fVar.c();
        return fVar;
    }
}
