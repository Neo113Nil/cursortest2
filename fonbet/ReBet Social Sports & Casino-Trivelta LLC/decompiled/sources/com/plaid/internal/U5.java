package com.plaid.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class U5 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P5 f39667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ph.C0 f39668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(P5 p52, Ph.C0 c02) {
        super(1);
        this.f39667a = p52;
        this.f39668b = c02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f39667a.f39514e.remove(this.f39668b);
        return Unit.INSTANCE;
    }
}
