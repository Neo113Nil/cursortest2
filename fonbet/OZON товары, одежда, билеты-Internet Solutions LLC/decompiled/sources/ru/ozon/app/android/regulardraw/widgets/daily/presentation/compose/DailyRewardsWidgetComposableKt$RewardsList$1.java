package ru.ozon.app.android.regulardraw.widgets.daily.presentation.compose;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import u0.InterfaceC9904m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/m;", "", "invoke", "(Lu0/m;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class DailyRewardsWidgetComposableKt$RewardsList$1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9904m, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ List<String> $images;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyRewardsWidgetComposableKt$RewardsList$1(List<String> list) {
        super(3);
        this.$images = list;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9904m interfaceC9904m, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9904m, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9904m FlowRow, InterfaceC3967k interfaceC3967k, int i11) {
        long j11;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        for (String str : this.$images) {
            e.a aVar = e.f40358c0;
            j11 = C7807Z.f72255i;
            Ag0.e.a(str, a0.o(PreviewKt.m942previewBackgroundRPmYEkk(aVar, j11, interfaceC3967k, 54), 76, 114), null, null, null, 0.0f, null, interfaceC3967k, 3072, 244);
        }
    }
}
