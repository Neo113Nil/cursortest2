package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import Q1.K;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f84229b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextDTO f84230c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IconButtonV3DTO f84231d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f84232e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f84233f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    f(K k11, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, String str, boolean z11, Function2<? super Map<String, MessengerTrackingInfo>, ? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> function2) {
        super(3);
        this.f84229b = k11;
        this.f84230c = textDTO;
        this.f84231d = iconButtonV3DTO;
        this.f84232e = str;
        this.f84233f = z11;
        this.f84234g = function2;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> innerTextField = function2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.F(innerTextField) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            TextDTO textDTO = this.f84229b.f().length() == 0 ? this.f84230c : null;
            b.a(textDTO, this.f84231d, this.f84232e, this.f84233f, innerTextField, this.f84234g, interfaceC3967k2, (IconButtonV3DTO.$stable << 3) | ((intValue << 12) & 57344));
        }
        return Unit.f71690a;
    }
}
