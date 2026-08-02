package ru.ozon.app.android.ugc.widgets.usersGradesV2.core;

import S0.InterfaceC3967k;
import WZ.l;
import b00.f;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.ContextQuestionItemVO;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.UsersGradesComposableKt;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.ComposableSingletons$UsersGradesComposeWidgetKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$UsersGradesComposeWidgetKt$lambda1$1 extends AbstractC7737t implements InterfaceC6512o<i<ContextQuestionItemVO>, g.a, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$UsersGradesComposeWidgetKt$lambda1$1 INSTANCE = new ComposableSingletons$UsersGradesComposeWidgetKt$lambda1$1();

    ComposableSingletons$UsersGradesComposeWidgetKt$lambda1$1() {
        super(4);
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(i<ContextQuestionItemVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(iVar, aVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(i<ContextQuestionItemVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(content, "$this$content");
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(content) ? 4 : 2;
        }
        if ((i11 & 131) == 130 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
        l lVar = (l) interfaceC3967k.m(f.e());
        ContextQuestionItemVO b11 = content.b();
        interfaceC3967k.o(1343381162);
        boolean F11 = interfaceC3967k.F(interfaceC7851b) | interfaceC3967k.F(lVar);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ComposableSingletons$UsersGradesComposeWidgetKt$lambda1$1$1$1(interfaceC7851b, lVar);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        UsersGradesComposableKt.UsersGradesComposable(b11, (Function1) C11, interfaceC3967k, 0, 0);
    }
}
