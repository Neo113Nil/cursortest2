package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.h;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f83995b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BadgeDTO f83996c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<a> f83997d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<h.a, Unit> f83998e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f83999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(androidx.compose.ui.e eVar, BadgeDTO badgeDTO, List list, Function1 function1, int i11) {
        super(2);
        this.f83995b = eVar;
        this.f83996c = badgeDTO;
        this.f83997d = list;
        this.f83998e = function1;
        this.f83999f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        d.a(this.f83995b, this.f83996c, this.f83997d, this.f83998e, interfaceC3967k, C2652m.e(this.f83999f | 1));
        return Unit.f71690a;
    }
}
