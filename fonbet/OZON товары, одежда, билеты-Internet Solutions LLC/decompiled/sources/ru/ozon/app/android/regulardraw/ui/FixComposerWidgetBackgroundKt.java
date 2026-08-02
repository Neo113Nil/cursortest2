package ru.ozon.app.android.regulardraw.ui;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "FixComposerWidgetBackground", "(LS0/k;I)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FixComposerWidgetBackgroundKt {
    public static final void FixComposerWidgetBackground(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-368715541);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            Object parent = ((View) u11.m(AndroidCompositionLocals_androidKt.h())).getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setBackground(null);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FixComposerWidgetBackgroundKt$FixComposerWidgetBackground$1(i11));
        }
    }
}
