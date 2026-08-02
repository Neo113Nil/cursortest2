package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation;

import S0.B1;
import S0.G0;
import S0.InterfaceC3967k;
import S0.Q;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C7984d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\" \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/e;", "rememberPinTriggerAnimation", "(LS0/k;I)Landroidx/compose/ui/e;", "LS0/G0;", "LocalPinTriggerAnimation", "LS0/G0;", "getLocalPinTriggerAnimation", "()LS0/G0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocalPinTriggerModifierKt {

    @NotNull
    private static final G0<e> LocalPinTriggerAnimation = new B1(LocalPinTriggerModifierKt$LocalPinTriggerAnimation$1.INSTANCE);

    @NotNull
    public static final G0<e> getLocalPinTriggerAnimation() {
        return LocalPinTriggerAnimation;
    }

    @NotNull
    public static final e rememberPinTriggerAnimation(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(11120782);
        interfaceC3967k.o(-1103792279);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = C7984d.a(1.0f);
            interfaceC3967k.x(C11);
        }
        C7980b c7980b = (C7980b) C11;
        interfaceC3967k.k();
        Unit unit = Unit.f71690a;
        interfaceC3967k.o(-1103790316);
        boolean F11 = interfaceC3967k.F(c7980b);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new LocalPinTriggerModifierKt$rememberPinTriggerAnimation$1$1(c7980b, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, unit, (Function2) C12);
        interfaceC3967k.o(-1103781575);
        Object C13 = interfaceC3967k.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = a.a(e.f40358c0, new LocalPinTriggerModifierKt$rememberPinTriggerAnimation$2$1(c7980b));
            interfaceC3967k.x(C13);
        }
        e eVar = (e) C13;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return eVar;
    }
}
