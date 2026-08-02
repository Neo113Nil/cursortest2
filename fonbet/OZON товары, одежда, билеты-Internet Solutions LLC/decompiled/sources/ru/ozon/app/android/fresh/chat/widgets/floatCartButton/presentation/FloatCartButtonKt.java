package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u0.E;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001ag\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textAtom", "Ll1/Z;", "backgroundColor", "LZ1/h;", "buttonCornerRadius", "verticalPadding", "horizontalPadding", "spaceBetween", "Lkotlin/Function0;", "", "onClick", "FloatCartButton-2FlEJow", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;JFFFFLkotlin/jvm/functions/Function0;LS0/k;II)V", "FloatCartButton", "chat_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FloatCartButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b5  */
    /* renamed from: FloatCartButton-2FlEJow, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m708FloatCartButton2FlEJow(e eVar, @NotNull IconDTO iconAtom, @NotNull TextDTO textAtom, long j11, float f7, float f11, float f12, float f13, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        float f14;
        int i14;
        float f15;
        int i15;
        float f16;
        int i16;
        int i17;
        int i18;
        e b11;
        int I11;
        float f17;
        float f18;
        J0 m02;
        Intrinsics.checkNotNullParameter(iconAtom, "iconAtom");
        Intrinsics.checkNotNullParameter(textAtom, "textAtom");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-156402160);
        int i19 = i12 & 1;
        if (i19 != 0) {
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
            i13 |= (i11 & 64) == 0 ? u11.n(iconAtom) : u11.F(iconAtom) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(textAtom) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.s(j11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i21 = i12 & 16;
        if (i21 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            f14 = f7;
            i13 |= u11.q(f14) ? 16384 : 8192;
            i14 = i12 & 32;
            if (i14 == 0) {
                i13 |= 196608;
            } else if ((196608 & i11) == 0) {
                f15 = f11;
                i13 |= u11.q(f15) ? 131072 : 65536;
                i15 = i12 & 64;
                if (i15 != 0) {
                    i13 |= 1572864;
                    f16 = f12;
                } else {
                    f16 = f12;
                    if ((i11 & 1572864) == 0) {
                        i13 |= u11.q(f16) ? 1048576 : 524288;
                    }
                }
                i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i16 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i17 = i16;
                    i13 |= u11.q(f13) ? 8388608 : 4194304;
                    if ((i12 & 256) == 0) {
                        i13 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        i13 |= u11.F(onClick) ? 67108864 : 33554432;
                    }
                    i18 = i13;
                    if ((38347923 & i18) == 38347922 || !u11.b()) {
                        e eVar3 = i19 == 0 ? e.f40358c0 : eVar2;
                        if (i21 != 0) {
                            f14 = 24;
                        }
                        if (i14 != 0) {
                            f15 = 10;
                        }
                        float f19 = i15 == 0 ? 16 : f16;
                        float f21 = i17 == 0 ? 8 : f13;
                        b11 = androidx.compose.foundation.e.b(C6988h.a(eVar3, h.b(f14)), j11, y0.a());
                        float f22 = f21;
                        e eVar4 = eVar3;
                        e g10 = T.g(i.c(b11, false, null, null, onClick, 7), f19, f15);
                        Y b12 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f23 = c.f(u11, g10);
                        Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a11);
                        }
                        Function2 h11 = Cm.e.h(u11, b12, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, h11);
                        }
                        F1.b(u11, f23, InterfaceC2801g.a.f());
                        e.a aVar = e.f40358c0;
                        DsIconAtomKt.DsIconAtom(iconAtom, a0.v(aVar, null, 3), u11, IconDTO.$stable | 48 | ((i18 >> 3) & 14), 0);
                        E.a(u11, a0.r(aVar, f22));
                        DsTextAtomKt.DsTextAtom(textAtom, a0.v(aVar, null, 3), u11, ((i18 >> 6) & 14) | 48, 0);
                        u11.f();
                        f17 = f22;
                        f18 = f19;
                        eVar2 = eVar4;
                    } else {
                        u11.j();
                        f17 = f13;
                        f18 = f16;
                    }
                    float f24 = f14;
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new FloatCartButtonKt$FloatCartButton$2(eVar2, iconAtom, textAtom, j11, f24, f15, f18, f17, onClick, i11, i12));
                        return;
                    }
                    return;
                }
                i17 = i16;
                if ((i12 & 256) == 0) {
                }
                i18 = i13;
                if ((38347923 & i18) == 38347922) {
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                b11 = androidx.compose.foundation.e.b(C6988h.a(eVar3, h.b(f14)), j11, y0.a());
                float f222 = f21;
                e eVar42 = eVar3;
                e g102 = T.g(i.c(b11, false, null, null, onClick, 7), f19, f15);
                Y b122 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                I11 = u11.I();
                A0 d112 = u11.d();
                e f232 = c.f(u11, g102);
                Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h112 = Cm.e.h(u11, b122, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h112);
                F1.b(u11, f232, InterfaceC2801g.a.f());
                e.a aVar2 = e.f40358c0;
                DsIconAtomKt.DsIconAtom(iconAtom, a0.v(aVar2, null, 3), u11, IconDTO.$stable | 48 | ((i18 >> 3) & 14), 0);
                E.a(u11, a0.r(aVar2, f222));
                DsTextAtomKt.DsTextAtom(textAtom, a0.v(aVar2, null, 3), u11, ((i18 >> 6) & 14) | 48, 0);
                u11.f();
                f17 = f222;
                f18 = f19;
                eVar2 = eVar42;
                float f242 = f14;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            f15 = f11;
            i15 = i12 & 64;
            if (i15 != 0) {
            }
            i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i16 != 0) {
            }
            i17 = i16;
            if ((i12 & 256) == 0) {
            }
            i18 = i13;
            if ((38347923 & i18) == 38347922) {
            }
            if (i19 == 0) {
            }
            if (i21 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            b11 = androidx.compose.foundation.e.b(C6988h.a(eVar3, h.b(f14)), j11, y0.a());
            float f2222 = f21;
            e eVar422 = eVar3;
            e g1022 = T.g(i.c(b11, false, null, null, onClick, 7), f19, f15);
            Y b1222 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f2322 = c.f(u11, g1022);
            Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h1122 = Cm.e.h(u11, b1222, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h1122);
            F1.b(u11, f2322, InterfaceC2801g.a.f());
            e.a aVar22 = e.f40358c0;
            DsIconAtomKt.DsIconAtom(iconAtom, a0.v(aVar22, null, 3), u11, IconDTO.$stable | 48 | ((i18 >> 3) & 14), 0);
            E.a(u11, a0.r(aVar22, f2222));
            DsTextAtomKt.DsTextAtom(textAtom, a0.v(aVar22, null, 3), u11, ((i18 >> 6) & 14) | 48, 0);
            u11.f();
            f17 = f2222;
            f18 = f19;
            eVar2 = eVar422;
            float f2422 = f14;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        f14 = f7;
        i14 = i12 & 32;
        if (i14 == 0) {
        }
        f15 = f11;
        i15 = i12 & 64;
        if (i15 != 0) {
        }
        i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i16 != 0) {
        }
        i17 = i16;
        if ((i12 & 256) == 0) {
        }
        i18 = i13;
        if ((38347923 & i18) == 38347922) {
        }
        if (i19 == 0) {
        }
        if (i21 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        b11 = androidx.compose.foundation.e.b(C6988h.a(eVar3, h.b(f14)), j11, y0.a());
        float f22222 = f21;
        e eVar4222 = eVar3;
        e g10222 = T.g(i.c(b11, false, null, null, onClick, 7), f19, f15);
        Y b12222 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f23222 = c.f(u11, g10222);
        Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h11222 = Cm.e.h(u11, b12222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h11222);
        F1.b(u11, f23222, InterfaceC2801g.a.f());
        e.a aVar222 = e.f40358c0;
        DsIconAtomKt.DsIconAtom(iconAtom, a0.v(aVar222, null, 3), u11, IconDTO.$stable | 48 | ((i18 >> 3) & 14), 0);
        E.a(u11, a0.r(aVar222, f22222));
        DsTextAtomKt.DsTextAtom(textAtom, a0.v(aVar222, null, 3), u11, ((i18 >> 6) & 14) | 48, 0);
        u11.f();
        f17 = f22222;
        f18 = f19;
        eVar2 = eVar4222;
        float f24222 = f14;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
