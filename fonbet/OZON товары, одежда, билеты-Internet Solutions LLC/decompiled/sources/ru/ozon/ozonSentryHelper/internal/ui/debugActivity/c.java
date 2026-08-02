package ru.ozon.ozonSentryHelper.internal.ui.debugActivity;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import wg0.g;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SentryHelperDebugActivity f97618b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f97619c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f97620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(SentryHelperDebugActivity sentryHelperDebugActivity, g gVar, int i11) {
        super(2);
        this.f97618b = sentryHelperDebugActivity;
        this.f97619c = gVar;
        this.f97620d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f97620d | 1);
        SentryHelperDebugActivity.J(this.f97618b, this.f97619c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
