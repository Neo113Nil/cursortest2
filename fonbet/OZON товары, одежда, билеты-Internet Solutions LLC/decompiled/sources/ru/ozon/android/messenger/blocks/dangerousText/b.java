package ru.ozon.android.messenger.blocks.dangerousText;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f84986b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IconDTO f84987c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextDTO f84988d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f84989e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<Tg.b, Unit> f84990f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f84991g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(boolean z11, IconDTO iconDTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO, Function1 function1, int i11) {
        super(2);
        this.f84986b = z11;
        this.f84987c = iconDTO;
        this.f84988d = textDTO;
        this.f84989e = buttonV3DTO;
        this.f84990f = function1;
        this.f84991g = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84991g | 1);
        IconDTO iconDTO = this.f84987c;
        TextDTO textDTO = this.f84988d;
        c.b(this.f84986b, iconDTO, textDTO, this.f84989e, this.f84990f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
