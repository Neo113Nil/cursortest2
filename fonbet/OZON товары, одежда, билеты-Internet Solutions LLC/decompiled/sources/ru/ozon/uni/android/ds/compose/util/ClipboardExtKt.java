package ru.ozon.uni.android.ds.compose.util;

import S0.InterfaceC3967k;
import androidx.compose.ui.platform.I0;
import androidx.compose.ui.platform.K0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "", "", "addToClipboard", "(LS0/k;I)Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClipboardExtKt {
    @NotNull
    public static final Function1<String, Unit> addToClipboard(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-108228701);
        I0 i02 = (I0) interfaceC3967k.m(K0.d());
        interfaceC3967k.o(248777610);
        boolean F11 = interfaceC3967k.F(i02);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ClipboardExtKt$addToClipboard$1$1(i02);
            interfaceC3967k.x(C11);
        }
        Function1<String, Unit> function1 = (Function1) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return function1;
    }
}
