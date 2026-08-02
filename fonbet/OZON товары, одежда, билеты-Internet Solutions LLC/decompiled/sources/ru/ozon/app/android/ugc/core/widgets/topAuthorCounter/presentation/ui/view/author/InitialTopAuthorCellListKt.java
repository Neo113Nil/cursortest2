package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.author;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Z1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.C7460f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorDTO;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u0010\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$InitialTopAuthor;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "InitialTopAuthorCellList", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$InitialTopAuthor;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Ln1/e;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "cellHeight", "iconRadiusPx", "circleCenterY", "(Ln1/e;Lru/ozon/uni/atoms/data/dsCell/CellDTO;FF)F", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InitialTopAuthorCellListKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r2 == S0.InterfaceC3967k.a.a()) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [S0.k, S0.l] */
    /* JADX WARN: Type inference failed for: r0v4, types: [S0.l] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ru.ozon.uni.core.repository.UniTheme] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InitialTopAuthorCellList(e eVar, @NotNull TopAuthorDTO.TopAuthorContent.InitialTopAuthor data, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        CellDTO.LeftBlock leftBlock;
        IconDTO iconDTO;
        IconDTO copy;
        Object obj;
        Object k02;
        IconDTO icon;
        IconDTO.IconSize size;
        C3969l c3969l;
        e eVar3;
        C7460f c7460f;
        C7460f c7460f2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ?? u11 = interfaceC3967k.u(5854772);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(data) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
            eVar3 = eVar2;
        } else {
            e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
            List<CellDTO> topAuthorCells = data.getTopAuthorCells();
            if (topAuthorCells.isEmpty()) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new InitialTopAuthorCellListKt$InitialTopAuthorCellList$1(eVar4, data, actionHandler, i11, i12));
                    return;
                }
                return;
            }
            e eVar5 = eVar4;
            u11.o(-1152187980);
            boolean n11 = u11.n(topAuthorCells);
            Object C11 = u11.C();
            ?? r32 = 0;
            int i15 = 0;
            if (!n11) {
                obj = C11;
            }
            List<CellDTO> list = topAuthorCells;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            int i16 = 0;
            for (Object obj2 : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C7714v.O0();
                    throw null;
                }
                CellDTO cellDTO = (CellDTO) obj2;
                CellDTO.LeftBlock leftBlock2 = cellDTO.getLeftBlock();
                if (leftBlock2 != null) {
                    IconDTO icon2 = leftBlock2.getIcon();
                    if (icon2 != null) {
                        copy = icon2.copy((r34 & 1) != 0 ? icon2.size : null, (r34 & 2) != 0 ? icon2.hasShape : null, (r34 & 4) != 0 ? icon2.shape : null, (r34 & 8) != 0 ? icon2.text : String.valueOf(i17), (r34 & 16) != 0 ? icon2.icon : null, (r34 & 32) != 0 ? icon2.backgroundImage : null, (r34 & 64) != 0 ? icon2.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? icon2.textColor : null, (r34 & 256) != 0 ? icon2.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? icon2.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? icon2.borderWidth : null, (r34 & 2048) != 0 ? icon2.isBorderInside : null, (r34 & 4096) != 0 ? icon2.hasParanja : null, (r34 & 8192) != 0 ? icon2.getContext() : null, (r34 & 16384) != 0 ? icon2.getTestInfo() : null, (r34 & 32768) != 0 ? icon2.getTrackingInfo() : null);
                        iconDTO = copy;
                    } else {
                        iconDTO = null;
                    }
                    leftBlock = CellDTO.LeftBlock.copy$default(leftBlock2, null, null, null, null, null, iconDTO, null, null, 223, null);
                } else {
                    leftBlock = null;
                }
                arrayList.add(CellDTO.copy$default(cellDTO, null, null, leftBlock, null, null, 27, null));
                i16 = i17;
            }
            u11.x(arrayList);
            obj = arrayList;
            List list2 = (List) obj;
            u11.k();
            List<String> backgroundGradient = data.getBackgroundGradient();
            if (backgroundGradient != null) {
                List<String> list3 = backgroundGradient;
                r32 = new ArrayList(C7714v.z(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    C7807Z c7807z = TokenParserKt.tokenToColor((String) it.next(), u11, 0);
                    r32.add(C7807Z.m(c7807z != null ? c7807z.w() : C7807Z.f72258l));
                }
            }
            if (r32 == 0) {
                r32 = K.f71697a;
            }
            List list4 = r32;
            u11.o(-1152174991);
            boolean n12 = u11.n(list4);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                if (list4.size() >= 2) {
                    k02 = AbstractC7799Q.a.d(AbstractC7799Q.Companion, list4, 0L, 0L, 14);
                } else {
                    C7807Z c7807z2 = (C7807Z) C7714v.M(list4);
                    k02 = new K0(c7807z2 != null ? c7807z2.w() : C7807Z.f72258l);
                }
                C12 = k02;
                u11.x(C12);
            }
            AbstractC7799Q abstractC7799Q = (AbstractC7799Q) C12;
            u11.k();
            long bgActiveWarningSecondary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgActiveWarningSecondary();
            u11.o(-1152164768);
            boolean n13 = u11.n(topAuthorCells);
            Object C13 = u11.C();
            if (n13 || C13 == InterfaceC3967k.a.a()) {
                CellDTO.LeftBlock leftBlock3 = ((CellDTO) C7714v.K(topAuthorCells)).getLeftBlock();
                C13 = h.a(((leftBlock3 == null || (icon = leftBlock3.getIcon()) == null || (size = icon.getSize()) == null) ? 0 : size.getSizeShape()) / 2);
                u11.x(C13);
            }
            float d11 = ((h) C13).d();
            u11.k();
            u11.o(-1152160952);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                c7460f2 = C7460f.f70279e;
                C14 = n1.f(c7460f2, D1.f25195a);
                u11.x(C14);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C14;
            Object b11 = Pk0.h.b(u11, -1152158904);
            if (b11 == InterfaceC3967k.a.a()) {
                c7460f = C7460f.f70279e;
                b11 = n1.f(c7460f, D1.f25195a);
                u11.x(b11);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) b11;
            u11.k();
            e e11 = a0.e(eVar5, 1.0f);
            u11.o(-1152153963);
            boolean F11 = u11.F(list2) | u11.q(d11) | u11.s(bgActiveWarningSecondary);
            Object C15 = u11.C();
            if (F11 || C15 == InterfaceC3967k.a.a()) {
                InitialTopAuthorCellListKt$InitialTopAuthorCellList$2$1 initialTopAuthorCellListKt$InitialTopAuthorCellList$2$1 = new InitialTopAuthorCellListKt$InitialTopAuthorCellList$2$1(list2, d11, interfaceC3978p0, interfaceC3978p02, bgActiveWarningSecondary);
                u11.x(initialTopAuthorCellListKt$InitialTopAuthorCellList$2$1);
                C15 = initialTopAuthorCellListKt$InitialTopAuthorCellList$2$1;
            }
            u11.k();
            e b12 = c.b(e11, (Function1) C15);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, b12);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(-2120083090);
            int size2 = list2.size();
            ?? r02 = u11;
            while (i15 < size2) {
                CellDTO cellDTO2 = (CellDTO) list2.get(i15);
                r02.o(-2120056300);
                r02.o(-2120060964);
                e.a aVar = e.f40358c0;
                r02.o(1654577455);
                boolean q11 = r02.q(d11) | r02.n(abstractC7799Q) | r02.F(cellDTO2);
                Object C16 = r02.C();
                if (q11 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new InitialTopAuthorCellListKt$InitialTopAuthorCellList$3$1$1$1(d11, abstractC7799Q, cellDTO2);
                    r02.x(C16);
                }
                r02.k();
                e d13 = c.d(aVar, (Function1) C16);
                if (i15 == 0) {
                    r02.o(-119537458);
                    Object C17 = r02.C();
                    if (C17 == InterfaceC3967k.a.a()) {
                        C17 = new InitialTopAuthorCellListKt$InitialTopAuthorCellList$3$1$2$1$1(interfaceC3978p0);
                        r02.x(C17);
                    }
                    r02.k();
                    d13 = androidx.compose.ui.layout.e.a(d13, (Function1) C17);
                }
                r02.k();
                if (i15 == C7714v.P(list2)) {
                    r02.o(-119532019);
                    Object C18 = r02.C();
                    if (C18 == InterfaceC3967k.a.a()) {
                        C18 = new InitialTopAuthorCellListKt$InitialTopAuthorCellList$3$1$3$1$1(interfaceC3978p02);
                        r02.x(C18);
                    }
                    r02.k();
                    d13 = androidx.compose.ui.layout.e.a(d13, (Function1) C18);
                }
                r02.k();
                AbstractC7799Q abstractC7799Q2 = abstractC7799Q;
                e eVar6 = d13;
                C3969l c3969l2 = r02;
                DsCellAtomKt.DsCellAtom(cellDTO2, eVar6, actionHandler, c3969l2, CellDTO.$stable | (i13 & 896), 0);
                i15++;
                r02 = c3969l2;
                abstractC7799Q = abstractC7799Q2;
            }
            c3969l = r02;
            c3969l.k();
            c3969l.f();
            eVar3 = eVar5;
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new InitialTopAuthorCellListKt$InitialTopAuthorCellList$4(eVar3, data, actionHandler, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float circleCenterY(InterfaceC8412e interfaceC8412e, CellDTO cellDTO, float f7, float f11) {
        CommonCellSettings.LayoutPadding topPadding;
        h dp;
        if (!CollectionsExtKt.isNotNullOrEmpty(cellDTO.getCenterBlock().getBadgeList())) {
            return f7 / 2.0f;
        }
        CellDTO.Settings settings = cellDTO.getSettings();
        return f11 + ((settings == null || (topPadding = settings.getTopPadding()) == null || (dp = CommonCellSettingsKt.getDp(topPadding)) == null) ? 0.0f : interfaceC8412e.v1(dp.d()));
    }
}
