package ru.ozon.android.messenger.blocks.chat.search;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84594b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextDTO f84595c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextDTO f84596d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ TextDTO f84597e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<BadgeDTO> f84598f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ IconDTO f84599g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ List<Icon> f84600h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ TextDTO f84601i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84602j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f84603k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(androidx.compose.ui.e eVar, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, List list, IconDTO iconDTO, List list2, TextDTO textDTO4, Function0 function0, int i11) {
        super(2);
        this.f84594b = eVar;
        this.f84595c = textDTO;
        this.f84596d = textDTO2;
        this.f84597e = textDTO3;
        this.f84598f = list;
        this.f84599g = iconDTO;
        this.f84600h = list2;
        this.f84601i = textDTO4;
        this.f84602j = function0;
        this.f84603k = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84603k | 1);
        TextDTO textDTO = this.f84597e;
        IconDTO iconDTO = this.f84599g;
        List<Icon> list = this.f84600h;
        g.a(this.f84594b, this.f84595c, this.f84596d, textDTO, this.f84598f, iconDTO, list, this.f84601i, this.f84602j, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
