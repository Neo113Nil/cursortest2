package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90861b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.f90861b = function0;
        this.f90862c = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f90861b.invoke();
        this.f90862c.invoke();
        return Unit.f71690a;
    }
}
