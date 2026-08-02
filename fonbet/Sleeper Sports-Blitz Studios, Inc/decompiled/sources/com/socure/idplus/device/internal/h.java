package com.socure.idplus.device.internal;

import android.content.Context;
import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.internal.input.k;
import com.socure.idplus.device.internal.sigmaDeviceConfig.model.SigmaDeviceConfigResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes8.dex */
public final class h extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionTokenCallback f857a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SessionTokenCallback sessionTokenCallback, j jVar, Context context) {
        super(2);
        this.f857a = sessionTokenCallback;
        this.b = jVar;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.socure.idplus.device.internal.sigmaDeviceSession.b sessionTokenTuple = (com.socure.idplus.device.internal.sigmaDeviceSession.b) obj;
        SigmaDeviceConfigResponse config = (SigmaDeviceConfigResponse) obj2;
        Intrinsics.checkNotNullParameter(sessionTokenTuple, "sessionTokenTuple");
        Intrinsics.checkNotNullParameter(config, "config");
        SessionTokenCallback sessionTokenCallback = this.f857a;
        if (sessionTokenCallback != null) {
            sessionTokenCallback.onComplete(sessionTokenTuple.f882a);
        } else {
            this.b.c.onSessionCreated(sessionTokenTuple.f882a);
        }
        j jVar = this.b;
        Context context = this.c;
        String str = sessionTokenTuple.b;
        jVar.getClass();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        float random = RangesKt.random(new IntRange(0, 100), Random.INSTANCE) / 100.0f;
        if (!config.isBehaviorEnabled() || random > config.getBehavioral().getSampleRate()) {
            k kVar = jVar.d;
            kVar.c = false;
            kVar.f861a.clear();
            booleanRef.element = false;
        }
        com.socure.idplus.device.internal.behavior.manager.f fVar = jVar.h;
        g sessionExpiredCallback = new g(jVar, booleanRef);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(sessionExpiredCallback, "sessionExpiredCallback");
        com.socure.idplus.device.internal.behavior.manager.c cVar = fVar.h;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(sessionExpiredCallback, "sessionExpiredCallback");
        cVar.q = sessionExpiredCallback;
        jVar.h.a(context, str, config.getBehavioral(), booleanRef.element);
        return Unit.INSTANCE;
    }
}
