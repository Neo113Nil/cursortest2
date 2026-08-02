package com.socure.idplus.device.internal;

import android.content.Context;
import com.socure.idplus.device.internal.sigmaDeviceConfig.model.SigmaDeviceConfigResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes8.dex */
public final class e extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f854a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Ref.BooleanRef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, Context context, Ref.BooleanRef booleanRef) {
        super(2);
        this.f854a = jVar;
        this.b = context;
        this.c = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.socure.idplus.device.internal.sigmaDeviceSession.b sessionTokenTuple = (com.socure.idplus.device.internal.sigmaDeviceSession.b) obj;
        SigmaDeviceConfigResponse config = (SigmaDeviceConfigResponse) obj2;
        Intrinsics.checkNotNullParameter(sessionTokenTuple, "sessionTokenTuple");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f854a.h.a(this.b, sessionTokenTuple.b, config.getBehavioral(), this.c.element);
        return Unit.INSTANCE;
    }
}
