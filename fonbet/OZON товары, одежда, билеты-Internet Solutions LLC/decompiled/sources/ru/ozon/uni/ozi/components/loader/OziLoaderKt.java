package ru.ozon.uni.ozi.components.loader;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.loader.presets.OziLoaderSize;
import ru.ozon.uni.ozi.theme.OziTheme;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "Lru/ozon/uni/ozi/components/loader/presets/OziLoaderSize;", "size", "", "OziLoader-3IgeMak", "(Landroidx/compose/ui/e;JLru/ozon/uni/ozi/components/loader/presets/OziLoaderSize;LS0/k;II)V", "OziLoader", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziLoaderKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OziLoaderSize.values().length];
            try {
                iArr[OziLoaderSize.Size200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziLoaderSize.Size300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OziLoaderSize.Size400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OziLoaderSize.Size500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OziLoaderSize.Size600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* renamed from: OziLoader-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3108OziLoader3IgeMak(e eVar, long j11, OziLoaderSize oziLoaderSize, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j12;
        OziLoaderSize oziLoaderSize2;
        OziLoaderSize oziLoaderSize3;
        int i14;
        float f7;
        OziLoaderSize oziLoaderSize4;
        e eVar2;
        long j13;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1157510480);
        int i15 = i12 & 1;
        int i16 = 4;
        int i17 = 2;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            j12 = j11;
            i13 |= ((i12 & 2) == 0 && u11.s(j12)) ? 32 : 16;
        } else {
            j12 = j11;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            oziLoaderSize2 = oziLoaderSize;
            i13 |= u11.n(oziLoaderSize2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    if (i15 != 0) {
                        eVar = e.f40358c0;
                    }
                    if ((i12 & 2) != 0) {
                        j12 = OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getGraphicActionPrimary();
                        i13 &= -113;
                    }
                    if (i18 != 0) {
                        oziLoaderSize3 = OziLoaderSize.Size500;
                        long j14 = j12;
                        e eVar3 = eVar;
                        u11.j0();
                        i14 = WhenMappings.$EnumSwitchMapping$0[oziLoaderSize3.ordinal()];
                        if (i14 != 1 && i14 != 2) {
                            i17 = 3;
                            if (i14 != 3) {
                                if (i14 != 4) {
                                    i16 = 5;
                                    if (i14 != 5) {
                                        throw new o();
                                    }
                                }
                                f7 = i16;
                                BasicLoaderKt.m3107BasicLoaderFandsMM(eVar3, j14, oziLoaderSize3.getOuterSize(), oziLoaderSize3.getInnerSize(), f7, u11, i13 & 126);
                                oziLoaderSize4 = oziLoaderSize3;
                                eVar2 = eVar3;
                                j13 = j14;
                            }
                        }
                        f7 = i17;
                        BasicLoaderKt.m3107BasicLoaderFandsMM(eVar3, j14, oziLoaderSize3.getOuterSize(), oziLoaderSize3.getInnerSize(), f7, u11, i13 & 126);
                        oziLoaderSize4 = oziLoaderSize3;
                        eVar2 = eVar3;
                        j13 = j14;
                    }
                } else {
                    u11.j();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                }
                oziLoaderSize3 = oziLoaderSize2;
                long j142 = j12;
                e eVar32 = eVar;
                u11.j0();
                i14 = WhenMappings.$EnumSwitchMapping$0[oziLoaderSize3.ordinal()];
                if (i14 != 1) {
                    i17 = 3;
                    if (i14 != 3) {
                    }
                }
                f7 = i17;
                BasicLoaderKt.m3107BasicLoaderFandsMM(eVar32, j142, oziLoaderSize3.getOuterSize(), oziLoaderSize3.getInnerSize(), f7, u11, i13 & 126);
                oziLoaderSize4 = oziLoaderSize3;
                eVar2 = eVar32;
                j13 = j142;
            } else {
                u11.j();
                eVar2 = eVar;
                j13 = j12;
                oziLoaderSize4 = oziLoaderSize2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new OziLoaderKt$OziLoader$1(eVar2, j13, oziLoaderSize4, i11, i12));
                return;
            }
            return;
        }
        oziLoaderSize2 = oziLoaderSize;
        if ((i13 & 147) == 146) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if (i18 != 0) {
        }
        oziLoaderSize3 = oziLoaderSize2;
        long j1422 = j12;
        e eVar322 = eVar;
        u11.j0();
        i14 = WhenMappings.$EnumSwitchMapping$0[oziLoaderSize3.ordinal()];
        if (i14 != 1) {
        }
        f7 = i17;
        BasicLoaderKt.m3107BasicLoaderFandsMM(eVar322, j1422, oziLoaderSize3.getOuterSize(), oziLoaderSize3.getInnerSize(), f7, u11, i13 & 126);
        oziLoaderSize4 = oziLoaderSize3;
        eVar2 = eVar322;
        j13 = j1422;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
