package ru.ozon.android.messenger.blocks.chat.search;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84580b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<BadgeDTO> f84581c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextDTO f84582d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f84583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(androidx.compose.ui.e eVar, List list, TextDTO textDTO, int i11) {
        super(2);
        this.f84580b = eVar;
        this.f84581c = list;
        this.f84582d = textDTO;
        this.f84583e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84583e | 1);
        TextDTO textDTO = this.f84582d;
        g.b(this.f84580b, this.f84581c, textDTO, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
