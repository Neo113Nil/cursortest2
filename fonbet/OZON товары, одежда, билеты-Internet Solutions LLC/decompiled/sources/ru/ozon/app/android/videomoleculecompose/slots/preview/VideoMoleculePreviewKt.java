package ru.ozon.app.android.videomoleculecompose.slots.preview;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import l1.C7807Z;
import l1.y0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "isVisible", "Landroidx/compose/ui/e;", "modifier", "", "VideoMoleculePreview", "(ZLandroidx/compose/ui/e;LS0/k;II)V", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculePreviewKt {
    public static final void VideoMoleculePreview(boolean z11, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j11;
        e b11;
        C3969l u11 = interfaceC3967k.u(-1454066618);
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
                    m02.G(new VideoMoleculePreviewKt$VideoMoleculePreview$1(z11, eVar, i11, i12));
                    return;
                }
                return;
            }
            e d11 = a0.d(eVar);
            j11 = C7807Z.f72248b;
            b11 = androidx.compose.foundation.e.b(d11, j11, y0.a());
            C5185h.a(b11, u11, 0);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new VideoMoleculePreviewKt$VideoMoleculePreview$2(z11, eVar, i11, i12));
        }
    }
}
