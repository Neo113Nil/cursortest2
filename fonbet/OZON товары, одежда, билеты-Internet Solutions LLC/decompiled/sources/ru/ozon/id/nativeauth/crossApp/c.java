package ru.ozon.id.nativeauth.crossApp;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CrossAppAuthActivity f97222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(CrossAppAuthActivity crossAppAuthActivity) {
        super(0);
        this.f97222b = crossAppAuthActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CrossAppAuthActivity.K(this.f97222b).t();
        return Unit.f71690a;
    }
}
