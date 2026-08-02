package com.braze;

import Ph.AbstractC1457j;
import Ph.P;
import bo.app.y0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f29302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Braze f29303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f29304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f29305g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z10, Object obj, boolean z11, boolean z12, Braze braze, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f29299a = z10;
        this.f29300b = obj;
        this.f29301c = z11;
        this.f29302d = z12;
        this.f29303e = braze;
        this.f29304f = function2;
        this.f29305g = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f29299a, this.f29300b, this.f29301c, this.f29302d, this.f29303e, this.f29304f, this.f29305g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b10;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f29299a && Braze.INSTANCE.isDisabled()) {
            return this.f29300b;
        }
        if (this.f29301c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return this.f29300b;
        }
        b10 = AbstractC1457j.b(null, new y0(this.f29302d, this.f29303e, this.f29300b, this.f29304f, this.f29305g, null), 1, null);
        return b10;
    }
}
