package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f87103b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.analytics.i f87104c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f87105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(o oVar, ru.ozon.android.messenger.framework.analytics.i iVar, p pVar, int i11) {
        super(2);
        this.f87103b = oVar;
        this.f87104c = iVar;
        this.f87105d = pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        p pVar = this.f87105d;
        m.a(this.f87103b, this.f87104c, pVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
