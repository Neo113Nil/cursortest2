package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.C6285b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(androidx.compose.ui.e eVar, @NotNull f blockVO, @NotNull h viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(543446827);
        int i12 = (u11.n(eVar) ? 4 : 2) | i11 | (u11.n(blockVO) ? 32 : 16) | (u11.F(viewModel) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            u11.o(54992751);
            boolean F11 = u11.F(viewModel) | u11.F(blockVO);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(viewModel, blockVO, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, blockVO, (Function2) C11);
            Unit unit = Unit.f71690a;
            u11.o(54995622);
            boolean F12 = u11.F(viewModel) | u11.F(view);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new b(viewModel, view, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            InterfaceC3978p0 c11 = C6285b.c(viewModel.getState(), u11, 0);
            BadgeDTO b11 = ((ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.e) c11.getValue()).b();
            List<ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a> a11 = ((ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.e) c11.getValue()).a();
            u11.o(55010024);
            boolean F13 = u11.F(viewModel);
            Object C13 = u11.C();
            if (F13 || C13 == InterfaceC3967k.a.a()) {
                c cVar = new c(1, viewModel, h.class, "onAction", "onAction(Lru/ozon/android/messenger/blocks/ai/aiMessageActions/presentation/AiMessageActionsViewModel$Action;)V", 0);
                u11.x(cVar);
                C13 = cVar;
            }
            u11.k();
            c3969l = u11;
            ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.d.a(eVar, b11, a11, (Function1) ((kotlin.reflect.h) C13), c3969l, i12 & 14);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new d(eVar, blockVO, viewModel, i11));
        }
    }
}
