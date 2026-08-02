package ru.ozon.uni.ozi.components.inputs.presets;

import S0.InterfaceC3967k;
import androidx.compose.ui.platform.I0;
import androidx.compose.ui.platform.K0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/presets/OziInputDefaults;", "", "<init>", "()V", "Lkotlin/Function0;", "", "callback", "Lkotlin/Function1;", "", "addToClipboard", "(Lkotlin/jvm/functions/Function0;LS0/k;II)Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziInputDefaults {

    @NotNull
    public static final OziInputDefaults INSTANCE = new OziInputDefaults();

    private OziInputDefaults() {
    }

    @NotNull
    public final Function1<String, Unit> addToClipboard(Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        interfaceC3967k.o(669939597);
        boolean z11 = true;
        if ((i12 & 1) != 0) {
            interfaceC3967k.o(-1059908450);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = OziInputDefaults$addToClipboard$1$1.INSTANCE;
                interfaceC3967k.x(C11);
            }
            function0 = (Function0) C11;
            interfaceC3967k.k();
        }
        I0 i02 = (I0) interfaceC3967k.m(K0.d());
        interfaceC3967k.o(-1059904373);
        boolean F11 = interfaceC3967k.F(i02);
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC3967k.n(function0)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean z12 = F11 | z11;
        Object C12 = interfaceC3967k.C();
        if (z12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new OziInputDefaults$addToClipboard$2$1(i02, function0);
            interfaceC3967k.x(C12);
        }
        Function1<String, Unit> function1 = (Function1) C12;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return function1;
    }
}
