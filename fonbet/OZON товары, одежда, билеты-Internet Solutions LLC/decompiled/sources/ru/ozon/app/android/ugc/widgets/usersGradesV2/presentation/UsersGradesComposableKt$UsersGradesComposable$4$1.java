package ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation;

import B1.v0;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.ContextQuestionItemVO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/H;", "", "invoke", "(Ll0/H;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class UsersGradesComposableKt$UsersGradesComposable$4$1 extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ List<ContextQuestionItemVO.ContextAnswerItem> $contextAnswers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsersGradesComposableKt$UsersGradesComposable$4$1(List<ContextQuestionItemVO.ContextAnswerItem> list) {
        super(3);
        this.$contextAnswers = list;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(h11, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        e j11 = T.j(Q1.a(e.f40358c0, "containerView"), 0.0f, 8, 0.0f, 0.0f, 13);
        interfaceC3967k.o(690534635);
        boolean F11 = interfaceC3967k.F(this.$contextAnswers);
        List<ContextQuestionItemVO.ContextAnswerItem> list = this.$contextAnswers;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new UsersGradesComposableKt$UsersGradesComposable$4$1$1$1(list);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        v0.b(j11, (Function2) C11, interfaceC3967k, 6, 0);
    }
}
