package ru.ozon.app.android.regulardraw.ui;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5239d1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onScrollDown", "onScrollUp", "ComposerRecyclerScrollEffect", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "currentOnScrollDown", "currentOnScrollUp", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposerRecyclerScrollEffectKt {
    public static final void ComposerRecyclerScrollEffect(@NotNull Function0<Unit> onScrollDown, @NotNull Function0<Unit> onScrollUp, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(onScrollDown, "onScrollDown");
        Intrinsics.checkNotNullParameter(onScrollUp, "onScrollUp");
        C3969l u11 = interfaceC3967k.u(615249223);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(onScrollDown) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onScrollUp) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (((Boolean) u11.m(C5239d1.a())).booleanValue()) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$1(onScrollDown, onScrollUp, i11));
                    return;
                }
                return;
            }
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            u11.o(-357974177);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$composerRecycler$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            ViewGroup findParent = ViewExtKt.findParent(view, (Function1) C11);
            RecyclerView composerRecyclerView = findParent != null ? ComposerViewExtensionKt.composerRecyclerView(findParent) : null;
            InterfaceC3978p0 l11 = n1.l(onScrollDown, u11);
            InterfaceC3978p0 l12 = n1.l(onScrollUp, u11);
            u11.o(-357966659);
            boolean n11 = u11.n(l11) | u11.n(l12) | u11.F(composerRecyclerView);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$2$1(composerRecyclerView, l11, l12);
                u11.x(C12);
            }
            u11.k();
            Q.c(composerRecyclerView, (Function1) C12, u11);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$3(onScrollDown, onScrollUp, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> ComposerRecyclerScrollEffect$lambda$1(A1<? extends Function0<Unit>> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> ComposerRecyclerScrollEffect$lambda$2(A1<? extends Function0<Unit>> a12) {
        return a12.getValue();
    }
}
