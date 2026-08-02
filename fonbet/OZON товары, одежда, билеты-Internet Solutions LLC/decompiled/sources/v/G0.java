package v;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.c1;

/* loaded from: classes8.dex */
public final class G0 implements androidx.camera.core.impl.c1 {

    /* renamed from: b, reason: collision with root package name */
    final C10081a1 f100933b;

    public G0(@NonNull Context context) {
        this.f100933b = C10081a1.b(context);
    }

    @Override // androidx.camera.core.impl.c1
    @NonNull
    public final androidx.camera.core.impl.T a(@NonNull c1.b bVar, int i11) {
        int i12;
        C5123v0 R11 = C5123v0.R();
        O0.b bVar2 = new O0.b();
        int[] iArr = Q1.f101068a;
        int i13 = iArr[bVar.ordinal()];
        int i14 = 5;
        if (i13 != 1) {
            if (i13 == 2) {
                i12 = 3;
            }
            i12 = 1;
        } else {
            if (i11 == 2) {
                i12 = 5;
            }
            i12 = 1;
        }
        bVar2.v(i12);
        R11.U(androidx.camera.core.impl.b1.f38267v, bVar2.k());
        R11.U(androidx.camera.core.impl.b1.f38269x, F0.f100928a);
        Q.a aVar = new Q.a();
        int i15 = iArr[bVar.ordinal()];
        if (i15 != 1) {
            i14 = i15 != 2 ? 1 : 3;
        } else if (i11 != 2) {
            i14 = 2;
        }
        aVar.s(i14);
        R11.U(androidx.camera.core.impl.b1.f38268w, aVar.h());
        R11.U(androidx.camera.core.impl.b1.f38270y, bVar == c1.b.IMAGE_CAPTURE ? C10134s1.f101370b : T.f101077a);
        c1.b bVar3 = c1.b.PREVIEW;
        C10081a1 c10081a1 = this.f100933b;
        if (bVar == bVar3) {
            R11.U(InterfaceC5102k0.f38348r, c10081a1.e());
        }
        R11.U(InterfaceC5102k0.f38343m, Integer.valueOf(c10081a1.c(true).getRotation()));
        if (bVar == c1.b.VIDEO_CAPTURE || bVar == c1.b.STREAM_SHARING) {
            R11.U(androidx.camera.core.impl.b1.f38262B, Boolean.TRUE);
        }
        return androidx.camera.core.impl.A0.Q(R11);
    }
}
