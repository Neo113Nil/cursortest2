package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import v0.InterfaceC10165e;

/* loaded from: classes10.dex */
public final class d extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f84046b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AiMessageActionsDTO.SourcesBadge.MenuInfo f84047c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2 f84048d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1 f84049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo, Function2 function2, Function1 function1) {
        super(4);
        this.f84046b = list;
        this.f84047c = menuInfo;
        this.f84048d = function2;
        this.f84049e = function1;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        int intValue = num.intValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i11 = (interfaceC3967k2.n(interfaceC10165e2) ? 4 : 2) | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i11 |= interfaceC3967k2.r(intValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem menuItem = (AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem) this.f84046b.get(intValue);
            interfaceC3967k2.o(-1712238847);
            a.d(menuItem, Intrinsics.d(C7714v.X(this.f84047c.getMenuItems()), menuItem), this.f84048d, this.f84049e, interfaceC3967k2, 0);
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
