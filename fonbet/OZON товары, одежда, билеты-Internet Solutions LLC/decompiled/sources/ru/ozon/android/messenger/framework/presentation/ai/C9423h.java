package ru.ozon.android.messenger.framework.presentation.ai;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9423h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89605b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f89606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9423h(C9413c c9413c, int i11) {
        super(2);
        this.f89605b = c9413c;
        this.f89606c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f89606c | 1);
        C9413c.v(this.f89605b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
