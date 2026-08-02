package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class s extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f91105b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f91106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(Context context, C4912a c4912a, int i11) {
        super(2);
        this.f91105b = context;
        this.f91106c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(49);
        C4912a c4912a = this.f91106c;
        t.a(this.f91105b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
