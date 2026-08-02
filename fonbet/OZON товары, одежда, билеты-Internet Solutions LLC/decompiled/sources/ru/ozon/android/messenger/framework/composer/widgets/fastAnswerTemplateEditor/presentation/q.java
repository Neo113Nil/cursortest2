package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f86918b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f86919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(t tVar, u uVar, int i11) {
        super(2);
        this.f86918b = tVar;
        this.f86919c = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        r.b(this.f86918b, this.f86919c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
