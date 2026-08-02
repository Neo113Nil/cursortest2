package ru.ozon.android.messenger.framework.presentation.ai;

import J0.C3326o1;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import u0.InterfaceC9895d;

/* loaded from: classes10.dex */
final class N0 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f89311b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AiMessageActionsDTO.SourcesBadge.MenuInfo f89312c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f89313d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f89314e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ xe.M f89315f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3326o1 f89316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    N0(androidx.compose.ui.e eVar, AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo, Function2<? super Map<String, MessengerTrackingInfo>, ? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> function2, Function1<? super Map<String, MessengerTrackingInfo>, Unit> function1, xe.M m11, C3326o1 c3326o1) {
        super(3);
        this.f89311b = eVar;
        this.f89312c = menuInfo;
        this.f89313d = function2;
        this.f89314e = function1;
        this.f89315f = m11;
        this.f89316g = c3326o1;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9895d ModalBottomSheetLayout = interfaceC9895d;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(1377647218);
            xe.M m11 = this.f89315f;
            boolean F11 = interfaceC3967k2.F(m11);
            C3326o1 c3326o1 = this.f89316g;
            boolean F12 = F11 | interfaceC3967k2.F(c3326o1);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new M0(c3326o1, m11);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo = this.f89312c;
            ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo.a.b(this.f89311b, menuInfo, this.f89313d, this.f89314e, (Function0) C11, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
