package ru.ozon.uni.ozi.components.inputs.presets;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.ozi.components.inputs.presets.OziInputStatus;
import ru.ozon.uni.ozi.theme.OziTheme;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;", "Lq1/b;", "systemIcon", "(Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;LS0/k;I)Lq1/b;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziInputStatusKt {
    public static final AbstractC8972b systemIcon(@NotNull OziInputStatus oziInputStatus, InterfaceC3967k interfaceC3967k, int i11) {
        AbstractC8972b abstractC8972b;
        Intrinsics.checkNotNullParameter(oziInputStatus, "<this>");
        interfaceC3967k.o(-1480348857);
        if (Intrinsics.d(oziInputStatus, OziInputStatus.Error.INSTANCE)) {
            interfaceC3967k.o(1037058120);
            OziTheme.INSTANCE.getIcons();
            interfaceC3967k.B(-119644701);
            abstractC8972b = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_danger_filled, "ic_m_danger_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            interfaceC3967k.k();
        } else if (Intrinsics.d(oziInputStatus, OziInputStatus.Warning.INSTANCE)) {
            interfaceC3967k.o(1037060173);
            OziTheme.INSTANCE.getIcons();
            interfaceC3967k.B(365051325);
            abstractC8972b = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_exclamation_filled, "ic_m_exclamation_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            interfaceC3967k.k();
        } else if (Intrinsics.d(oziInputStatus, OziInputStatus.Success.INSTANCE)) {
            interfaceC3967k.o(1037062379);
            OziTheme.INSTANCE.getIcons();
            interfaceC3967k.B(-1238607463);
            abstractC8972b = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_confirmed_filled, "ic_m_confirmed_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(2084195879);
            interfaceC3967k.k();
            abstractC8972b = null;
        }
        interfaceC3967k.k();
        return abstractC8972b;
    }
}
