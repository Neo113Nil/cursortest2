package ru.ozon.android.messenger.framework.presentation.ai;

import J0.C3326o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes10.dex */
final class M0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ xe.M f89309b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3326o1 f89310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M0(C3326o1 c3326o1, xe.M m11) {
        super(0);
        this.f89309b = m11;
        this.f89310c = c3326o1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C10727i.c(this.f89309b, null, null, new L0(this.f89310c, null), 3);
        return Unit.f71690a;
    }
}
