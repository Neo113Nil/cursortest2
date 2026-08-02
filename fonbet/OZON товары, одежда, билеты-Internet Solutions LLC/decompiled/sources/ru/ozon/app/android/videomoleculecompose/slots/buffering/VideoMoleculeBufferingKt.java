package ru.ozon.app.android.videomoleculecompose.slots.buffering;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.I1;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "isBuffering", "Landroidx/compose/ui/e;", "modifier", "", "VideoMoleculeBuffering", "(ZLandroidx/compose/ui/e;LS0/k;II)V", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeBufferingKt {
    public static final void VideoMoleculeBuffering(boolean z11, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j11;
        C3969l u11 = interfaceC3967k.u(2044948332);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            if (!z11) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new VideoMoleculeBufferingKt$VideoMoleculeBuffering$1(z11, eVar, i11, i12));
                    return;
                }
                return;
            }
            e d11 = a0.d(eVar);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, d11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            e n11 = a0.n(e.f40358c0, 48);
            j11 = C7807Z.f72251e;
            I1.a(n11, j11, 4, 0L, 0, u11, 438, 24);
            u11.f();
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new VideoMoleculeBufferingKt$VideoMoleculeBuffering$3(z11, eVar, i11, i12));
        }
    }
}
