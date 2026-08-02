package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.E;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu0/C;", "", "HorizontalFillSpacer", "(Lu0/C;LS0/k;I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FillSpacerKt {
    public static final void HorizontalFillSpacer(@NotNull InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(interfaceC9890C, "<this>");
        C3969l u11 = interfaceC3967k.u(1084536062);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC9890C) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            E.a(u11, interfaceC9890C.a(e.f40358c0, 1.0f, true));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FillSpacerKt$HorizontalFillSpacer$1(interfaceC9890C, i11));
        }
    }
}
