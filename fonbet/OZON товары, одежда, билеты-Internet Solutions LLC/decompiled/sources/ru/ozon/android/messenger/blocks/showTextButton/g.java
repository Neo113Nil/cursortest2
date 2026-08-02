package ru.ozon.android.messenger.blocks.showTextButton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f86399b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86400c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ButtonV3DTO buttonV3DTO, String str, ru.ozon.android.messenger.framework.core.d dVar, int i11) {
        super(2);
        this.f86399b = buttonV3DTO;
        this.f86400c = str;
        this.f86401d = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        i.b(this.f86399b, this.f86400c, this.f86401d, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
