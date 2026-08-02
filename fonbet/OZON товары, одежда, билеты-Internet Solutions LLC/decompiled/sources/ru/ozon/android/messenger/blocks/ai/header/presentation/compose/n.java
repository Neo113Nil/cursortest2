package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.header.AiHeaderDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84175b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AiHeaderDTO.TitleSubtitle f84176c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<AtomActionDTO, Unit> f84177d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f84178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(androidx.compose.ui.e eVar, AiHeaderDTO.TitleSubtitle titleSubtitle, Function1 function1, int i11) {
        super(2);
        this.f84175b = eVar;
        this.f84176c = titleSubtitle;
        this.f84177d = function1;
        this.f84178e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84178e | 1);
        AiHeaderDTO.TitleSubtitle titleSubtitle = this.f84176c;
        Function1<AtomActionDTO, Unit> function1 = this.f84177d;
        o.d(this.f84175b, titleSubtitle, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
