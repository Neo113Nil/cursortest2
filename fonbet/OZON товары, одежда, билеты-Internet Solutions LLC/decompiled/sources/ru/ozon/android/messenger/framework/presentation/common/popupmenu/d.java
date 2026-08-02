package ru.ozon.android.messenger.framework.presentation.common.popupmenu;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f90889b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, Function0<Unit> function0) {
        super(0);
        this.f90889b = fVar;
        this.f90890c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f90889b.d();
        this.f90890c.invoke();
        return Unit.f71690a;
    }
}
