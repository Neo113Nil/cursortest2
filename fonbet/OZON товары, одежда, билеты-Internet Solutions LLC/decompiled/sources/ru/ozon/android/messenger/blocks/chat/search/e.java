package ru.ozon.android.messenger.blocks.chat.search;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84604b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextDTO f84605c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextDTO f84606d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f84607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(androidx.compose.ui.e eVar, TextDTO textDTO, TextDTO textDTO2, int i11) {
        super(2);
        this.f84604b = eVar;
        this.f84605c = textDTO;
        this.f84606d = textDTO2;
        this.f84607e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84607e | 1);
        TextDTO textDTO = this.f84606d;
        g.c(this.f84604b, this.f84605c, textDTO, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
