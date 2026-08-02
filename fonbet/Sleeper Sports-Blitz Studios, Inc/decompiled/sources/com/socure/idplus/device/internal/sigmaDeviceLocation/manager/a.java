package com.socure.idplus.device.internal.sigmaDeviceLocation.manager;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes8.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f875a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Ref.BooleanRef booleanRef, e eVar) {
        super(1);
        this.f875a = booleanRef;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f875a.element = true;
        this.b.a((Location) obj);
        return Unit.INSTANCE;
    }
}
