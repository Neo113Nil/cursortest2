package ru.ozon.uni.android.ds.compose.component.common;

import K1.T;
import P0.p2;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "text", "Ll1/Z;", "color", "LK1/T;", "style", "Landroidx/compose/ui/e;", "modifier", "", "SingleLineText-sW7UJKQ", "(Ljava/lang/String;JLK1/T;Landroidx/compose/ui/e;LS0/k;II)V", "SingleLineText", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleLineTextKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* renamed from: SingleLineText-sW7UJKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1704SingleLineTextsW7UJKQ(@NotNull String text, long j11, @NotNull T style, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        e eVar2;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        C3969l u11 = interfaceC3967k.u(-316444832);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(text) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.s(j11) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.n(style) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                eVar2 = eVar;
                i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
                    c3969l = u11;
                    p2.b(text, eVar4, j11, 0L, 0L, null, 0L, 2, false, 1, 0, style, c3969l, (i13 & 14) | ((i13 >> 6) & 112) | ((i13 << 3) & 896), ((i13 << 12) & 3670016) | 3120, 55288);
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    c3969l = u11;
                    eVar3 = eVar2;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new SingleLineTextKt$SingleLineText$1(text, j11, style, eVar3, i11, i12));
                    return;
                }
                return;
            }
            eVar2 = eVar;
            if ((i13 & 1171) == 1170) {
            }
            e eVar42 = i14 != 0 ? e.f40358c0 : eVar2;
            c3969l = u11;
            p2.b(text, eVar42, j11, 0L, 0L, null, 0L, 2, false, 1, 0, style, c3969l, (i13 & 14) | ((i13 >> 6) & 112) | ((i13 << 3) & 896), ((i13 << 12) & 3670016) | 3120, 55288);
            eVar3 = eVar42;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        if ((i12 & 4) == 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        e eVar422 = i14 != 0 ? e.f40358c0 : eVar2;
        c3969l = u11;
        p2.b(text, eVar422, j11, 0L, 0L, null, 0L, 2, false, 1, 0, style, c3969l, (i13 & 14) | ((i13 >> 6) & 112) | ((i13 << 3) & 896), ((i13 << 12) & 3670016) | 3120, 55288);
        eVar3 = eVar422;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
