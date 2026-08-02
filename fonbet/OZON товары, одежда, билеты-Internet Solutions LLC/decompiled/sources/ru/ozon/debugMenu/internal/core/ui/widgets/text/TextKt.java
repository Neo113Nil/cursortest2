package ru.ozon.debugMenu.internal.core.ui.widgets.text;

import B0.C2510t;
import K1.K;
import K1.T;
import P1.A;
import P1.AbstractC3809p;
import P1.F;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import V1.h;
import V1.i;
import Z1.u;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;
import y20.f;

@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÏ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"", "text", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "LZ1/u;", "fontSize", "LP1/A;", "fontStyle", "LP1/F;", "fontWeight", "LP1/p;", "fontFamily", "letterSpacing", "LV1/i;", "textDecoration", "LV1/h;", "textAlign", "lineHeight", "LV1/r;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "LK1/K;", "", "onTextLayout", "LK1/T;", "style", "Text--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/e;JJLP1/A;LP1/F;LP1/p;JLV1/i;LV1/h;JIZIILkotlin/jvm/functions/Function1;LK1/T;LS0/k;III)V", "Text", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0317  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1643Text4IGK_g(@NotNull String text, e eVar, long j11, long j12, A a11, F f7, AbstractC3809p abstractC3809p, long j13, i iVar, h hVar, long j14, int i11, boolean z11, int i12, int i13, Function1<? super K, Unit> function1, T t2, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16) {
        int i17;
        int i18;
        long j15;
        int i19;
        long j16;
        int i21;
        A a12;
        int i22;
        F f11;
        int i23;
        AbstractC3809p abstractC3809p2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        e eVar2;
        long j17;
        i iVar2;
        h hVar2;
        long j18;
        int i41;
        boolean z12;
        int i42;
        int i43;
        Function1<? super K, Unit> function12;
        T t11;
        e eVar3;
        T t12;
        final long f12;
        boolean s11;
        Object C11;
        C3969l c3969l;
        Function1<? super K, Unit> function13;
        F f13;
        h hVar3;
        e eVar4;
        long j19;
        long j21;
        A a13;
        AbstractC3809p abstractC3809p3;
        i iVar3;
        int i44;
        int i45;
        boolean z13;
        long j22;
        int i46;
        T t13;
        long j23;
        J0 m02;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(956048280);
        if ((i16 & 1) != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = (u11.n(text) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i47 = i16 & 2;
        if (i47 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            i17 |= u11.n(eVar) ? 32 : 16;
            i18 = i16 & 4;
            if (i18 == 0) {
                i17 |= 384;
                j15 = j11;
            } else {
                j15 = j11;
                if ((i14 & 384) == 0) {
                    i17 |= u11.s(j15) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                }
            }
            i19 = i16 & 8;
            if (i19 == 0) {
                i17 |= 3072;
                j16 = j12;
            } else {
                j16 = j12;
                if ((i14 & 3072) == 0) {
                    i17 |= u11.s(j16) ? 2048 : 1024;
                }
            }
            i21 = i16 & 16;
            if (i21 == 0) {
                i17 |= 24576;
            } else if ((i14 & 24576) == 0) {
                a12 = a11;
                i17 |= u11.n(a12) ? 16384 : 8192;
                i22 = i16 & 32;
                if (i22 != 0) {
                    i17 |= 196608;
                    f11 = f7;
                } else {
                    f11 = f7;
                    if ((i14 & 196608) == 0) {
                        i17 |= u11.n(f11) ? 131072 : 65536;
                    }
                }
                i23 = i16 & 64;
                int i48 = 524288;
                if (i23 != 0) {
                    i17 |= 1572864;
                    abstractC3809p2 = abstractC3809p;
                } else {
                    abstractC3809p2 = abstractC3809p;
                    if ((i14 & 1572864) == 0) {
                        i17 |= u11.n(abstractC3809p2) ? 1048576 : 524288;
                    }
                }
                i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i24 != 0) {
                    i17 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    i17 |= u11.s(j13) ? 8388608 : 4194304;
                }
                i25 = i16 & 256;
                if (i25 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    i17 |= u11.n(iVar) ? 67108864 : 33554432;
                    i26 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i26 == 0) {
                        i17 |= 805306368;
                    } else if ((i14 & 805306368) == 0) {
                        i27 = i26;
                        i17 |= u11.n(hVar) ? 536870912 : 268435456;
                        i28 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i28 != 0) {
                            i31 = i15 | 6;
                            i29 = i28;
                        } else if ((i15 & 6) == 0) {
                            i29 = i28;
                            i31 = i15 | (u11.s(j14) ? 4 : 2);
                        } else {
                            i29 = i28;
                            i31 = i15;
                        }
                        i32 = i16 & 2048;
                        if (i32 != 0) {
                            i31 |= 48;
                        } else if ((i15 & 48) == 0) {
                            i31 |= u11.r(i11) ? 32 : 16;
                            int i49 = i31;
                            i33 = i16 & 4096;
                            if (i33 == 0) {
                                i34 = i49 | 384;
                            } else {
                                int i51 = i49;
                                if ((i15 & 384) == 0) {
                                    i51 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                                }
                                i34 = i51;
                            }
                            i35 = i16 & 8192;
                            if (i35 == 0) {
                                i36 = i34 | 3072;
                            } else {
                                int i52 = i34;
                                if ((i15 & 3072) == 0) {
                                    i36 = i52 | (u11.r(i12) ? 2048 : 1024);
                                } else {
                                    i36 = i52;
                                }
                            }
                            i37 = i16 & 16384;
                            if (i37 == 0) {
                                i38 = i36 | 24576;
                            } else {
                                i38 = i36;
                                if ((i15 & 24576) == 0) {
                                    i38 |= u11.r(i13) ? 16384 : 8192;
                                    i39 = i16 & 32768;
                                    if (i39 != 0) {
                                        i38 |= 196608;
                                    } else if ((i15 & 196608) == 0) {
                                        i38 |= u11.F(function1) ? 131072 : 65536;
                                    }
                                    if ((i15 & 1572864) == 0) {
                                        if ((i16 & 65536) == 0 && u11.n(t2)) {
                                            i48 = 1048576;
                                        }
                                        i38 |= i48;
                                    }
                                    if ((i17 & 306783379) != 306783378 && (i38 & 599187) == 599186 && u11.b()) {
                                        u11.j();
                                        eVar4 = eVar;
                                        iVar3 = iVar;
                                        i45 = i11;
                                        z13 = z11;
                                        i44 = i12;
                                        i46 = i13;
                                        function13 = function1;
                                        t13 = t2;
                                        c3969l = u11;
                                        j19 = j15;
                                        a13 = a12;
                                        j21 = j16;
                                        f13 = f11;
                                        abstractC3809p3 = abstractC3809p2;
                                        j23 = j13;
                                        hVar3 = hVar;
                                        j22 = j14;
                                    } else {
                                        u11.Q0();
                                        if ((i14 & 1) != 0 || u11.w0()) {
                                            eVar2 = i47 != 0 ? e.f40358c0 : eVar;
                                            if (i18 != 0) {
                                                j15 = C7807Z.f72259m;
                                            }
                                            if (i19 != 0) {
                                                j16 = u.f35334c;
                                            }
                                            if (i21 != 0) {
                                                a12 = null;
                                            }
                                            if (i22 != 0) {
                                                f11 = null;
                                            }
                                            if (i23 != 0) {
                                                abstractC3809p2 = null;
                                            }
                                            j17 = i24 != 0 ? u.f35334c : j13;
                                            iVar2 = i25 != 0 ? null : iVar;
                                            hVar2 = i27 != 0 ? null : hVar;
                                            j18 = i29 != 0 ? u.f35334c : j14;
                                            i41 = i32 != 0 ? 1 : i11;
                                            z12 = i33 != 0 ? true : z11;
                                            i42 = i35 != 0 ? Integer.MAX_VALUE : i12;
                                            i43 = i37 == 0 ? i13 : 1;
                                            function12 = i39 == 0 ? function1 : null;
                                            if ((i16 & 65536) != 0) {
                                                t11 = (T) u11.m(f.f());
                                                i38 &= -3670017;
                                                u11.j0();
                                                if (j15 == 16) {
                                                    eVar3 = eVar2;
                                                    t12 = t11;
                                                    f12 = j15;
                                                } else {
                                                    eVar3 = eVar2;
                                                    t12 = t11;
                                                    f12 = t11.f() != 16 ? t11.f() : C7807Z.f72259m;
                                                }
                                                A a14 = a12;
                                                long j24 = j16;
                                                i iVar4 = iVar2;
                                                AbstractC3809p abstractC3809p4 = abstractC3809p2;
                                                long j25 = j17;
                                                T F11 = T.F(t12, 0L, j24, f11, a14, abstractC3809p4, j25, iVar4, hVar2 == null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j18, 16609105);
                                                T t14 = t12;
                                                u11.o(1977363494);
                                                s11 = u11.s(f12);
                                                C11 = u11.C();
                                                if (!s11 || C11 == InterfaceC3967k.a.a()) {
                                                    C11 = new InterfaceC7813c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt$Text$1$1
                                                        @Override // l1.InterfaceC7813c0
                                                        /* renamed from: invoke-0d7_KjU */
                                                        public final long mo7invoke0d7_KjU() {
                                                            return f12;
                                                        }
                                                    };
                                                    u11.x(C11);
                                                }
                                                u11.k();
                                                int i53 = i38 << 9;
                                                e eVar5 = eVar3;
                                                C2510t.b(text, eVar5, F11, function12, i41, z12, i42, i43, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i38 >> 6) & 7168) | (57344 & i53) | (458752 & i53) | (3670016 & i53) | (i53 & 29360128), 0);
                                                c3969l = u11;
                                                h hVar4 = hVar2;
                                                function13 = function12;
                                                f13 = f11;
                                                hVar3 = hVar4;
                                                eVar4 = eVar5;
                                                j19 = j15;
                                                j21 = j24;
                                                a13 = a14;
                                                abstractC3809p3 = abstractC3809p4;
                                                iVar3 = iVar4;
                                                i44 = i42;
                                                i45 = i41;
                                                z13 = z12;
                                                j22 = j18;
                                                i46 = i43;
                                                t13 = t14;
                                                j23 = j25;
                                            }
                                        } else {
                                            u11.j();
                                            if ((i16 & 65536) != 0) {
                                                i38 &= -3670017;
                                            }
                                            eVar2 = eVar;
                                            j17 = j13;
                                            iVar2 = iVar;
                                            hVar2 = hVar;
                                            j18 = j14;
                                            i41 = i11;
                                            z12 = z11;
                                            i42 = i12;
                                            i43 = i13;
                                            function12 = function1;
                                        }
                                        t11 = t2;
                                        u11.j0();
                                        if (j15 == 16) {
                                        }
                                        A a142 = a12;
                                        long j242 = j16;
                                        i iVar42 = iVar2;
                                        AbstractC3809p abstractC3809p42 = abstractC3809p2;
                                        long j252 = j17;
                                        T F112 = T.F(t12, 0L, j242, f11, a142, abstractC3809p42, j252, iVar42, hVar2 == null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j18, 16609105);
                                        T t142 = t12;
                                        u11.o(1977363494);
                                        s11 = u11.s(f12);
                                        C11 = u11.C();
                                        if (!s11) {
                                        }
                                        C11 = new InterfaceC7813c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt$Text$1$1
                                            @Override // l1.InterfaceC7813c0
                                            /* renamed from: invoke-0d7_KjU */
                                            public final long mo7invoke0d7_KjU() {
                                                return f12;
                                            }
                                        };
                                        u11.x(C11);
                                        u11.k();
                                        int i532 = i38 << 9;
                                        e eVar52 = eVar3;
                                        C2510t.b(text, eVar52, F112, function12, i41, z12, i42, i43, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i38 >> 6) & 7168) | (57344 & i532) | (458752 & i532) | (3670016 & i532) | (i532 & 29360128), 0);
                                        c3969l = u11;
                                        h hVar42 = hVar2;
                                        function13 = function12;
                                        f13 = f11;
                                        hVar3 = hVar42;
                                        eVar4 = eVar52;
                                        j19 = j15;
                                        j21 = j242;
                                        a13 = a142;
                                        abstractC3809p3 = abstractC3809p42;
                                        iVar3 = iVar42;
                                        i44 = i42;
                                        i45 = i41;
                                        z13 = z12;
                                        j22 = j18;
                                        i46 = i43;
                                        t13 = t142;
                                        j23 = j252;
                                    }
                                    m02 = c3969l.m0();
                                    if (m02 != null) {
                                        m02.G(new TextKt$Text$2(text, eVar4, j19, j21, a13, f13, abstractC3809p3, j23, iVar3, hVar3, j22, i45, z13, i44, i46, function13, t13, i14, i15, i16));
                                        return;
                                    }
                                    return;
                                }
                            }
                            i39 = i16 & 32768;
                            if (i39 != 0) {
                            }
                            if ((i15 & 1572864) == 0) {
                            }
                            if ((i17 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i14 & 1) != 0) {
                            }
                            if (i47 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i25 != 0) {
                            }
                            if (i27 != 0) {
                            }
                            if (i29 != 0) {
                            }
                            if (i32 != 0) {
                            }
                            if (i33 != 0) {
                            }
                            if (i35 != 0) {
                            }
                            if (i37 == 0) {
                            }
                            if (i39 == 0) {
                            }
                            if ((i16 & 65536) != 0) {
                            }
                            t11 = t2;
                            u11.j0();
                            if (j15 == 16) {
                            }
                            A a1422 = a12;
                            long j2422 = j16;
                            i iVar422 = iVar2;
                            AbstractC3809p abstractC3809p422 = abstractC3809p2;
                            long j2522 = j17;
                            T F1122 = T.F(t12, 0L, j2422, f11, a1422, abstractC3809p422, j2522, iVar422, hVar2 == null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j18, 16609105);
                            T t1422 = t12;
                            u11.o(1977363494);
                            s11 = u11.s(f12);
                            C11 = u11.C();
                            if (!s11) {
                            }
                            C11 = new InterfaceC7813c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt$Text$1$1
                                @Override // l1.InterfaceC7813c0
                                /* renamed from: invoke-0d7_KjU */
                                public final long mo7invoke0d7_KjU() {
                                    return f12;
                                }
                            };
                            u11.x(C11);
                            u11.k();
                            int i5322 = i38 << 9;
                            e eVar522 = eVar3;
                            C2510t.b(text, eVar522, F1122, function12, i41, z12, i42, i43, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i38 >> 6) & 7168) | (57344 & i5322) | (458752 & i5322) | (3670016 & i5322) | (i5322 & 29360128), 0);
                            c3969l = u11;
                            h hVar422 = hVar2;
                            function13 = function12;
                            f13 = f11;
                            hVar3 = hVar422;
                            eVar4 = eVar522;
                            j19 = j15;
                            j21 = j2422;
                            a13 = a1422;
                            abstractC3809p3 = abstractC3809p422;
                            iVar3 = iVar422;
                            i44 = i42;
                            i45 = i41;
                            z13 = z12;
                            j22 = j18;
                            i46 = i43;
                            t13 = t1422;
                            j23 = j2522;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        int i492 = i31;
                        i33 = i16 & 4096;
                        if (i33 == 0) {
                        }
                        i35 = i16 & 8192;
                        if (i35 == 0) {
                        }
                        i37 = i16 & 16384;
                        if (i37 == 0) {
                        }
                        i39 = i16 & 32768;
                        if (i39 != 0) {
                        }
                        if ((i15 & 1572864) == 0) {
                        }
                        if ((i17 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i14 & 1) != 0) {
                        }
                        if (i47 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i25 != 0) {
                        }
                        if (i27 != 0) {
                        }
                        if (i29 != 0) {
                        }
                        if (i32 != 0) {
                        }
                        if (i33 != 0) {
                        }
                        if (i35 != 0) {
                        }
                        if (i37 == 0) {
                        }
                        if (i39 == 0) {
                        }
                        if ((i16 & 65536) != 0) {
                        }
                        t11 = t2;
                        u11.j0();
                        if (j15 == 16) {
                        }
                        A a14222 = a12;
                        long j24222 = j16;
                        i iVar4222 = iVar2;
                        AbstractC3809p abstractC3809p4222 = abstractC3809p2;
                        long j25222 = j17;
                        T F11222 = T.F(t12, 0L, j24222, f11, a14222, abstractC3809p4222, j25222, iVar4222, hVar2 == null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j18, 16609105);
                        T t14222 = t12;
                        u11.o(1977363494);
                        s11 = u11.s(f12);
                        C11 = u11.C();
                        if (!s11) {
                        }
                        C11 = new InterfaceC7813c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt$Text$1$1
                            @Override // l1.InterfaceC7813c0
                            /* renamed from: invoke-0d7_KjU */
                            public final long mo7invoke0d7_KjU() {
                                return f12;
                            }
                        };
                        u11.x(C11);
                        u11.k();
                        int i53222 = i38 << 9;
                        e eVar5222 = eVar3;
                        C2510t.b(text, eVar5222, F11222, function12, i41, z12, i42, i43, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i38 >> 6) & 7168) | (57344 & i53222) | (458752 & i53222) | (3670016 & i53222) | (i53222 & 29360128), 0);
                        c3969l = u11;
                        h hVar4222 = hVar2;
                        function13 = function12;
                        f13 = f11;
                        hVar3 = hVar4222;
                        eVar4 = eVar5222;
                        j19 = j15;
                        j21 = j24222;
                        a13 = a14222;
                        abstractC3809p3 = abstractC3809p4222;
                        iVar3 = iVar4222;
                        i44 = i42;
                        i45 = i41;
                        z13 = z12;
                        j22 = j18;
                        i46 = i43;
                        t13 = t14222;
                        j23 = j25222;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                    i27 = i26;
                    i28 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i28 != 0) {
                    }
                    i32 = i16 & 2048;
                    if (i32 != 0) {
                    }
                    int i4922 = i31;
                    i33 = i16 & 4096;
                    if (i33 == 0) {
                    }
                    i35 = i16 & 8192;
                    if (i35 == 0) {
                    }
                    i37 = i16 & 16384;
                    if (i37 == 0) {
                    }
                    i39 = i16 & 32768;
                    if (i39 != 0) {
                    }
                    if ((i15 & 1572864) == 0) {
                    }
                    if ((i17 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i14 & 1) != 0) {
                    }
                    if (i47 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i32 != 0) {
                    }
                    if (i33 != 0) {
                    }
                    if (i35 != 0) {
                    }
                    if (i37 == 0) {
                    }
                    if (i39 == 0) {
                    }
                    if ((i16 & 65536) != 0) {
                    }
                    t11 = t2;
                    u11.j0();
                    if (j15 == 16) {
                    }
                    A a142222 = a12;
                    long j242222 = j16;
                    i iVar42222 = iVar2;
                    AbstractC3809p abstractC3809p42222 = abstractC3809p2;
                    long j252222 = j17;
                    T F112222 = T.F(t12, 0L, j242222, f11, a142222, abstractC3809p42222, j252222, iVar42222, hVar2 == null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j18, 16609105);
                    T t142222 = t12;
                    u11.o(1977363494);
                    s11 = u11.s(f12);
                    C11 = u11.C();
                    if (!s11) {
                    }
                    C11 = new InterfaceC7813c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt$Text$1$1
                        @Override // l1.InterfaceC7813c0
                        /* renamed from: invoke-0d7_KjU */
                        public final long mo7invoke0d7_KjU() {
                            return f12;
                        }
                    };
                    u11.x(C11);
                    u11.k();
                    int i532222 = i38 << 9;
                    e eVar52222 = eVar3;
                    C2510t.b(text, eVar52222, F112222, function12, i41, z12, i42, i43, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i38 >> 6) & 7168) | (57344 & i532222) | (458752 & i532222) | (3670016 & i532222) | (i532222 & 29360128), 0);
                    c3969l = u11;
                    h hVar42222 = hVar2;
                    function13 = function12;
                    f13 = f11;
                    hVar3 = hVar42222;
                    eVar4 = eVar52222;
                    j19 = j15;
                    j21 = j242222;
                    a13 = a142222;
                    abstractC3809p3 = abstractC3809p42222;
                    iVar3 = iVar42222;
                    i44 = i42;
                    i45 = i41;
                    z13 = z12;
                    j22 = j18;
                    i46 = i43;
                    t13 = t142222;
                    j23 = j252222;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i26 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i26 == 0) {
                }
                i27 = i26;
                i28 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i28 != 0) {
                }
                i32 = i16 & 2048;
                if (i32 != 0) {
                }
                int i49222 = i31;
                i33 = i16 & 4096;
                if (i33 == 0) {
                }
                i35 = i16 & 8192;
                if (i35 == 0) {
                }
                i37 = i16 & 16384;
                if (i37 == 0) {
                }
                i39 = i16 & 32768;
                if (i39 != 0) {
                }
                if ((i15 & 1572864) == 0) {
                }
                if ((i17 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i14 & 1) != 0) {
                }
                if (i47 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 != 0) {
                }
                if (i27 != 0) {
                }
                if (i29 != 0) {
                }
                if (i32 != 0) {
                }
                if (i33 != 0) {
                }
                if (i35 != 0) {
                }
                if (i37 == 0) {
                }
                if (i39 == 0) {
                }
                if ((i16 & 65536) != 0) {
                }
                t11 = t2;
                u11.j0();
                if (j15 == 16) {
                }
                A a1422222 = a12;
                long j2422222 = j16;
                i iVar422222 = iVar2;
                AbstractC3809p abstractC3809p422222 = abstractC3809p2;
                long j2522222 = j17;
                T F1122222 = T.F(t12, 0L, j2422222, f11, a1422222, abstractC3809p422222, j2522222, iVar422222, hVar2 == null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j18, 16609105);
                T t1422222 = t12;
                u11.o(1977363494);
                s11 = u11.s(f12);
                C11 = u11.C();
                if (!s11) {
                }
                C11 = new InterfaceC7813c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt$Text$1$1
                    @Override // l1.InterfaceC7813c0
                    /* renamed from: invoke-0d7_KjU */
                    public final long mo7invoke0d7_KjU() {
                        return f12;
                    }
                };
                u11.x(C11);
                u11.k();
                int i5322222 = i38 << 9;
                e eVar522222 = eVar3;
                C2510t.b(text, eVar522222, F1122222, function12, i41, z12, i42, i43, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i38 >> 6) & 7168) | (57344 & i5322222) | (458752 & i5322222) | (3670016 & i5322222) | (i5322222 & 29360128), 0);
                c3969l = u11;
                h hVar422222 = hVar2;
                function13 = function12;
                f13 = f11;
                hVar3 = hVar422222;
                eVar4 = eVar522222;
                j19 = j15;
                j21 = j2422222;
                a13 = a1422222;
                abstractC3809p3 = abstractC3809p422222;
                iVar3 = iVar422222;
                i44 = i42;
                i45 = i41;
                z13 = z12;
                j22 = j18;
                i46 = i43;
                t13 = t1422222;
                j23 = j2522222;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            a12 = a11;
            i22 = i16 & 32;
            if (i22 != 0) {
            }
            i23 = i16 & 64;
            int i482 = 524288;
            if (i23 != 0) {
            }
            i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i24 != 0) {
            }
            i25 = i16 & 256;
            if (i25 != 0) {
            }
            i26 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i26 == 0) {
            }
            i27 = i26;
            i28 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i28 != 0) {
            }
            i32 = i16 & 2048;
            if (i32 != 0) {
            }
            int i492222 = i31;
            i33 = i16 & 4096;
            if (i33 == 0) {
            }
            i35 = i16 & 8192;
            if (i35 == 0) {
            }
            i37 = i16 & 16384;
            if (i37 == 0) {
            }
            i39 = i16 & 32768;
            if (i39 != 0) {
            }
            if ((i15 & 1572864) == 0) {
            }
            if ((i17 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i14 & 1) != 0) {
            }
            if (i47 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 != 0) {
            }
            if (i24 != 0) {
            }
            if (i25 != 0) {
            }
            if (i27 != 0) {
            }
            if (i29 != 0) {
            }
            if (i32 != 0) {
            }
            if (i33 != 0) {
            }
            if (i35 != 0) {
            }
            if (i37 == 0) {
            }
            if (i39 == 0) {
            }
            if ((i16 & 65536) != 0) {
            }
            t11 = t2;
            u11.j0();
            if (j15 == 16) {
            }
            A a14222222 = a12;
            long j24222222 = j16;
            i iVar4222222 = iVar2;
            AbstractC3809p abstractC3809p4222222 = abstractC3809p2;
            long j25222222 = j17;
            T F11222222 = T.F(t12, 0L, j24222222, f11, a14222222, abstractC3809p4222222, j25222222, iVar4222222, hVar2 == null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j18, 16609105);
            T t14222222 = t12;
            u11.o(1977363494);
            s11 = u11.s(f12);
            C11 = u11.C();
            if (!s11) {
            }
            C11 = new InterfaceC7813c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt$Text$1$1
                @Override // l1.InterfaceC7813c0
                /* renamed from: invoke-0d7_KjU */
                public final long mo7invoke0d7_KjU() {
                    return f12;
                }
            };
            u11.x(C11);
            u11.k();
            int i53222222 = i38 << 9;
            e eVar5222222 = eVar3;
            C2510t.b(text, eVar5222222, F11222222, function12, i41, z12, i42, i43, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i38 >> 6) & 7168) | (57344 & i53222222) | (458752 & i53222222) | (3670016 & i53222222) | (i53222222 & 29360128), 0);
            c3969l = u11;
            h hVar4222222 = hVar2;
            function13 = function12;
            f13 = f11;
            hVar3 = hVar4222222;
            eVar4 = eVar5222222;
            j19 = j15;
            j21 = j24222222;
            a13 = a14222222;
            abstractC3809p3 = abstractC3809p4222222;
            iVar3 = iVar4222222;
            i44 = i42;
            i45 = i41;
            z13 = z12;
            j22 = j18;
            i46 = i43;
            t13 = t14222222;
            j23 = j25222222;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        i18 = i16 & 4;
        if (i18 == 0) {
        }
        i19 = i16 & 8;
        if (i19 == 0) {
        }
        i21 = i16 & 16;
        if (i21 == 0) {
        }
        a12 = a11;
        i22 = i16 & 32;
        if (i22 != 0) {
        }
        i23 = i16 & 64;
        int i4822 = 524288;
        if (i23 != 0) {
        }
        i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i24 != 0) {
        }
        i25 = i16 & 256;
        if (i25 != 0) {
        }
        i26 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i26 == 0) {
        }
        i27 = i26;
        i28 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i28 != 0) {
        }
        i32 = i16 & 2048;
        if (i32 != 0) {
        }
        int i4922222 = i31;
        i33 = i16 & 4096;
        if (i33 == 0) {
        }
        i35 = i16 & 8192;
        if (i35 == 0) {
        }
        i37 = i16 & 16384;
        if (i37 == 0) {
        }
        i39 = i16 & 32768;
        if (i39 != 0) {
        }
        if ((i15 & 1572864) == 0) {
        }
        if ((i17 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i14 & 1) != 0) {
        }
        if (i47 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (i27 != 0) {
        }
        if (i29 != 0) {
        }
        if (i32 != 0) {
        }
        if (i33 != 0) {
        }
        if (i35 != 0) {
        }
        if (i37 == 0) {
        }
        if (i39 == 0) {
        }
        if ((i16 & 65536) != 0) {
        }
        t11 = t2;
        u11.j0();
        if (j15 == 16) {
        }
        A a142222222 = a12;
        long j242222222 = j16;
        i iVar42222222 = iVar2;
        AbstractC3809p abstractC3809p42222222 = abstractC3809p2;
        long j252222222 = j17;
        T F112222222 = T.F(t12, 0L, j242222222, f11, a142222222, abstractC3809p42222222, j252222222, iVar42222222, hVar2 == null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j18, 16609105);
        T t142222222 = t12;
        u11.o(1977363494);
        s11 = u11.s(f12);
        C11 = u11.C();
        if (!s11) {
        }
        C11 = new InterfaceC7813c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt$Text$1$1
            @Override // l1.InterfaceC7813c0
            /* renamed from: invoke-0d7_KjU */
            public final long mo7invoke0d7_KjU() {
                return f12;
            }
        };
        u11.x(C11);
        u11.k();
        int i532222222 = i38 << 9;
        e eVar52222222 = eVar3;
        C2510t.b(text, eVar52222222, F112222222, function12, i41, z12, i42, i43, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i38 >> 6) & 7168) | (57344 & i532222222) | (458752 & i532222222) | (3670016 & i532222222) | (i532222222 & 29360128), 0);
        c3969l = u11;
        h hVar42222222 = hVar2;
        function13 = function12;
        f13 = f11;
        hVar3 = hVar42222222;
        eVar4 = eVar52222222;
        j19 = j15;
        j21 = j242222222;
        a13 = a142222222;
        abstractC3809p3 = abstractC3809p42222222;
        iVar3 = iVar42222222;
        i44 = i42;
        i45 = i41;
        z13 = z12;
        j22 = j18;
        i46 = i43;
        t13 = t142222222;
        j23 = j252222222;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
