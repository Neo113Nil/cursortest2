package ru.ozon.uni.android.ds.compose.component.loader;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "size", "", "DsLoader-3IgeMak", "(Landroidx/compose/ui/e;JLru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;LS0/k;II)V", "DsLoader", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsLoaderKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* renamed from: DsLoader-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1753DsLoader3IgeMak(e eVar, long j11, DsLoaderSize dsLoaderSize, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j12;
        DsLoaderSize dsLoaderSize2;
        DsLoaderSize dsLoaderSize3;
        e eVar2;
        long j13;
        DsLoaderSize dsLoaderSize4;
        e eVar3;
        J0 m02;
        int i14;
        C3969l u11 = interfaceC3967k.u(-1922940202);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                j12 = j11;
                if (u11.s(j12)) {
                    i14 = 32;
                    i13 |= i14;
                }
            } else {
                j12 = j11;
            }
            i14 = 16;
            i13 |= i14;
        } else {
            j12 = j11;
        }
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            dsLoaderSize2 = dsLoaderSize;
            i13 |= u11.n(dsLoaderSize2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    if (i15 != 0) {
                        eVar = e.f40358c0;
                    }
                    if ((i12 & 2) != 0) {
                        j12 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiary();
                        i13 &= -113;
                    }
                    if (i16 != 0) {
                        dsLoaderSize3 = DsLoaderSize.Size500;
                        eVar2 = eVar;
                        j13 = j12;
                        u11.j0();
                        BasicLoaderKt.m1752BasicLoaderFandsMM(eVar2, j13, dsLoaderSize3.getOuterSize(), dsLoaderSize3.getInnerSize(), dsLoaderSize3.getStrokeWidth(), u11, i13 & 126);
                        dsLoaderSize4 = dsLoaderSize3;
                        eVar3 = eVar2;
                        j12 = j13;
                    }
                } else {
                    u11.j();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                }
                j13 = j12;
                dsLoaderSize3 = dsLoaderSize2;
                eVar2 = eVar;
                u11.j0();
                BasicLoaderKt.m1752BasicLoaderFandsMM(eVar2, j13, dsLoaderSize3.getOuterSize(), dsLoaderSize3.getInnerSize(), dsLoaderSize3.getStrokeWidth(), u11, i13 & 126);
                dsLoaderSize4 = dsLoaderSize3;
                eVar3 = eVar2;
                j12 = j13;
            } else {
                u11.j();
                eVar3 = eVar;
                dsLoaderSize4 = dsLoaderSize2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new DsLoaderKt$DsLoader$1(eVar3, j12, dsLoaderSize4, i11, i12));
                return;
            }
            return;
        }
        dsLoaderSize2 = dsLoaderSize;
        if ((i13 & 147) == 146) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if (i16 != 0) {
        }
        j13 = j12;
        dsLoaderSize3 = dsLoaderSize2;
        eVar2 = eVar;
        u11.j0();
        BasicLoaderKt.m1752BasicLoaderFandsMM(eVar2, j13, dsLoaderSize3.getOuterSize(), dsLoaderSize3.getInnerSize(), dsLoaderSize3.getStrokeWidth(), u11, i13 & 126);
        dsLoaderSize4 = dsLoaderSize3;
        eVar3 = eVar2;
        j12 = j13;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
