package ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation;

import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlin.ranges.h;
import l1.C7807Z;
import m3.C8060b;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.ContextQuestionItemVO;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import u0.E;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class UsersGradesComposableKt$UsersGradesComposable$4$1$1$1$measurables$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ List<ContextQuestionItemVO.ContextAnswerItem> $contextAnswers;
    final /* synthetic */ float $maxTitleTextWidth;
    final /* synthetic */ J $maxValueTextWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsersGradesComposableKt$UsersGradesComposable$4$1$1$1$measurables$1(List<ContextQuestionItemVO.ContextAnswerItem> list, float f7, J j11) {
        super(2);
        this.$contextAnswers = list;
        this.$maxTitleTextWidth = f7;
        this.$maxValueTextWidth = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        int i12 = 2;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        List<ContextQuestionItemVO.ContextAnswerItem> list = this.$contextAnswers;
        float f7 = this.$maxTitleTextWidth;
        J j11 = this.$maxValueTextWidth;
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            ContextQuestionItemVO.ContextAnswerItem contextAnswerItem = list.get(i13);
            d.b i14 = InterfaceC6250b.a.i();
            e.a aVar = e.f40358c0;
            Y b11 = X.b(C5179b.f(), i14, interfaceC3967k, 48);
            int I11 = interfaceC3967k.I();
            A0 d11 = interfaceC3967k.d();
            e f11 = c.f(interfaceC3967k, aVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a11);
            } else {
                interfaceC3967k.e();
            }
            Function2 f12 = C3173b.f(interfaceC3967k, b11, interfaceC3967k, d11);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                a.d(f12, I11, interfaceC3967k, I11);
            }
            F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(contextAnswerItem.getTitle(), a0.r(aVar, f7), interfaceC3967k, 0, 0);
            float d12 = h.d(contextAnswerItem.getValue(), 0.0f, 100.0f) / 100.0f;
            C7807Z parseColorToken = TokenParserKt.parseColorToken(contextAnswerItem.getProgressColor(), interfaceC3967k, 0);
            float f13 = 1.0f;
            long w11 = parseColorToken != null ? parseColorToken.w() : C7807Z.f72259m;
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            }
            float f14 = 6;
            RoundStartProgressBarKt.m1535RoundStartProgressBareaDK9VM(d12, T.h(a0.f(new LayoutWeightElement(f13, true), f14), f14, 0.0f, i12), w11, 0L, interfaceC3967k, 0, 8);
            DsTextAtomKt.DsTextAtom(TextDTO.copy$default(contextAnswerItem.getTextValue(), null, TextDTO.TextAlignment.TRAILING, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null), a0.r(aVar, j11.f71784a), interfaceC3967k, 0, 0);
            interfaceC3967k.f();
            E.a(interfaceC3967k, a0.f(aVar, 8));
            i13++;
            i12 = 2;
        }
    }
}
