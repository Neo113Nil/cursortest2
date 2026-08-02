package ru.ozon.uni.android.ds.compose.factory;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/atoms/data/AtomDTO;", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Atom", "(Lru/ozon/uni/atoms/data/AtomDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DSComposeAtomsFactoryKt {
    public static final void Atom(@NotNull AtomDTO atomDTO, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        AtomDTO atomDTO2;
        e eVar2;
        Function1<? super AtomAction, Unit> function12;
        Intrinsics.checkNotNullParameter(atomDTO, "<this>");
        C3969l u11 = interfaceC3967k.u(-1809567901);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(atomDTO) : u11.F(atomDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function12 = function1;
            eVar2 = eVar;
            atomDTO2 = atomDTO;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            if (i15 != 0) {
                u11.o(-617456612);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = DSComposeAtomsFactoryKt$Atom$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            Function1<? super AtomAction, Unit> function13 = function1;
            int i16 = i13 << 3;
            DSComposeAtomsFactory.INSTANCE.CreateAtom(false, atomDTO, eVar3, function13, u11, (i16 & 112) | 24582 | (i16 & 896) | (i16 & 7168), 0);
            atomDTO2 = atomDTO;
            eVar2 = eVar3;
            function12 = function13;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DSComposeAtomsFactoryKt$Atom$2(atomDTO2, eVar2, function12, i11, i12));
        }
    }
}
