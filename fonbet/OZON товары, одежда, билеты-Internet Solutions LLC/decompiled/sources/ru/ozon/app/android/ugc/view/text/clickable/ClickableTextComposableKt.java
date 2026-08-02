package ru.ozon.app.android.ugc.view.text.clickable;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.i;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClick", "ClickableTextComposable", "(Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClickableTextComposableKt {
    public static final void ClickableTextComposable(@NotNull ClickableTextVO state, @NotNull Function1<? super AtomAction, Unit> onClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(1849517831);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(state) : u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onClick) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            TextDTO text = state.getText();
            e.a aVar = e.f40358c0;
            u11.o(-1287189315);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            q qVar = (q) C11;
            u11.k();
            u11.o(-1287186676);
            boolean z11 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(state))) | ((i12 & 112) == 32);
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ClickableTextComposableKt$ClickableTextComposable$2$1(state, onClick);
                u11.x(C12);
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(text, i.b(aVar, qVar, null, false, null, null, (Function0) C12, 28), u11, 0, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ClickableTextComposableKt$ClickableTextComposable$3(state, onClick, i11));
        }
    }
}
