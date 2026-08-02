package ru.ozon.android.messenger.blocks.dangerousText;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextDTO f84982b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f84983c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Tg.b, Unit> f84984d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f84985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(TextDTO textDTO, ButtonV3DTO buttonV3DTO, Function1 function1, int i11) {
        super(2);
        this.f84982b = textDTO;
        this.f84983c = buttonV3DTO;
        this.f84984d = function1;
        this.f84985e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84985e | 1);
        Function1<Tg.b, Unit> function1 = this.f84984d;
        c.a(this.f84982b, this.f84983c, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
