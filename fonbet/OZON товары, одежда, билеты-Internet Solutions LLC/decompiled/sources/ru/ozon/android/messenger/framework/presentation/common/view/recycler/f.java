package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9513d f91221b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B f91222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(C9513d c9513d, B b11) {
        super(0);
        this.f91221b = c9513d;
        this.f91222c = b11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9513d.h(this.f91221b, this.f91222c);
        return Unit.f71690a;
    }
}
