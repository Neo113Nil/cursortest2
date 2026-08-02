package ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.j;
import i1.C6983c;
import i1.C6984d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.extensions.ComposeColorKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "ShiftedPreviewIconsComposable", "(Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;Landroidx/compose/ui/e;LS0/k;II)V", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShiftedPreviewIconsComposeViewKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShiftedPreviewIconsComposable(@NotNull ShiftedPreviewIconsVO dto, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e eVar3;
        List<IconDTO> icons;
        int i14;
        Throwable th2;
        boolean z11;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1394098983);
        boolean z12 = true;
        int i15 = 2;
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                eVar3 = i16 == 0 ? e.f40358c0 : eVar2;
                icons = dto.getIcons();
                if (!icons.isEmpty()) {
                    J0 m02 = u11.m0();
                    if (m02 != null) {
                        m02.G(new ShiftedPreviewIconsComposeViewKt$ShiftedPreviewIconsComposable$1(dto, eVar3, i11, i12));
                        return;
                    }
                    return;
                }
                int px = Paddings.PADDING_300.getPx();
                boolean z13 = false;
                Throwable th3 = null;
                e v11 = a0.v(T.j(eVar3, 0.0f, 0.0f, icons.size() > 1 ? (icons.size() - 1) * px : 0, 0.0f, 11), null, 3);
                Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, v11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                i.b(u11, f7, 1310144631);
                Iterator it = icons.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        Throwable th4 = th3;
                        C7714v.O0();
                        throw th4;
                    }
                    IconDTO iconDTO = (IconDTO) next;
                    boolean z14 = (i17 != C7714v.P(icons) || dto.getHiddenIconsCount() == null) ? z13 : z12;
                    float size = i17 - icons.size();
                    float m1867getDpD9Ej5fM = i17 > 0 ? -(i17 * px) : Paddings.NONE.m1867getDpD9Ej5fM();
                    e eVar4 = e.f40358c0;
                    e c11 = P.c(j.a(eVar4, size), m1867getDpD9Ej5fM, 0.0f, i15);
                    V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
                    int I12 = u11.I();
                    A0 d12 = u11.d();
                    e f12 = c.f(u11, c11);
                    Iterator it2 = it;
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 f13 = E.f(u11, f11, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, f13);
                    }
                    F1.b(u11, f12, InterfaceC2801g.a.f());
                    C5187j c5187j = C5187j.f39515a;
                    if (z14) {
                        int i19 = C6984d.f65680c;
                        eVar4 = C6983c.a(eVar4, null, 1);
                    }
                    DsIconAtomKt.DsIconAtom(iconDTO, eVar4, u11, IconDTO.$stable, 0);
                    u11.o(939825848);
                    if (z14) {
                        z11 = false;
                        C5185h.a(C8385f.c(Paddings.PADDING_100.m1867getDpD9Ej5fM(), ComposeColorKt.composeColor(UniColors.LAYER_FLOOR_1, u11, 6), c5187j.b(eVar3), h.b(CornerRadius.RADIUS_250.m1866getDpD9Ej5fM())), u11, 0);
                        i14 = 2;
                        th2 = null;
                        DsTextAtomKt.DsTextAtom(dto.getHiddenIconsCount(), null, u11, 0, 2);
                    } else {
                        i14 = 2;
                        th2 = null;
                        z11 = false;
                    }
                    u11.k();
                    u11.f();
                    i15 = i14;
                    it = it2;
                    z12 = true;
                    z13 = z11;
                    th3 = th2;
                    i17 = i18;
                }
                u11.k();
                u11.f();
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            J0 m03 = u11.m0();
            if (m03 != null) {
                m03.G(new ShiftedPreviewIconsComposeViewKt$ShiftedPreviewIconsComposable$3(dto, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i16 == 0) {
        }
        icons = dto.getIcons();
        if (!icons.isEmpty()) {
        }
    }
}
