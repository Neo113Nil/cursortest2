package ru.ozon.uni.ozi.components.notificationBar;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarContainerLocation;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarStateKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aa\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "key", "Landroidx/compose/ui/e;", "modifier", "", "autoHideDelay", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;", "notificationBarState", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarContainerLocation;", "location", "Lkotlin/Function0;", "", "onDismiss", "content", "OziNotificationBarContainer", "(Ljava/lang/Object;Landroidx/compose/ui/e;Ljava/lang/Long;Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarContainerLocation;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarContainerKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OziNotificationBarContainer(@NotNull Object key, e eVar, Long l11, OziNotificationBarState oziNotificationBarState, OziNotificationBarContainerLocation oziNotificationBarContainerLocation, Function0<Unit> function0, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Long l12;
        OziNotificationBarState oziNotificationBarState2;
        int i15;
        OziNotificationBarContainerLocation oziNotificationBarContainerLocation2;
        int i16;
        Function0<Unit> function02;
        int i17;
        OziNotificationBarState oziNotificationBarState3;
        Long l13;
        OziNotificationBarContainerLocation oziNotificationBarContainerLocation3;
        boolean z11;
        Object C11;
        boolean F11;
        Object C12;
        OziNotificationBarState oziNotificationBarState4;
        e eVar3;
        OziNotificationBarContainerLocation oziNotificationBarContainerLocation4;
        Long l14;
        J0 m02;
        int i18;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-56898636);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(key) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                l12 = l11;
                i13 |= u11.n(l12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        oziNotificationBarState2 = oziNotificationBarState;
                        if (u11.F(oziNotificationBarState2)) {
                            i18 = 2048;
                            i13 |= i18;
                        }
                    } else {
                        oziNotificationBarState2 = oziNotificationBarState;
                    }
                    i18 = UserVerificationMethods.USER_VERIFY_ALL;
                    i13 |= i18;
                } else {
                    oziNotificationBarState2 = oziNotificationBarState;
                }
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    oziNotificationBarContainerLocation2 = oziNotificationBarContainerLocation;
                    i13 |= u11.n(oziNotificationBarContainerLocation2) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        function02 = function0;
                        i13 |= u11.F(function02) ? 131072 : 65536;
                        if ((i12 & 64) != 0) {
                            i13 |= 1572864;
                        } else if ((i11 & 1572864) == 0) {
                            i13 |= u11.F(content) ? 1048576 : 524288;
                        }
                        if ((i13 & 599187) == 599186 || !u11.b()) {
                            u11.Q0();
                            if ((i11 & 1) != 0 || u11.w0()) {
                                e eVar4 = i19 != 0 ? e.f40358c0 : eVar2;
                                if (i14 != 0) {
                                    l12 = 5000L;
                                }
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                    oziNotificationBarState2 = OziNotificationBarStateKt.rememberNotificationBarState(u11, 0);
                                }
                                if (i15 != 0) {
                                    oziNotificationBarContainerLocation2 = OziNotificationBarContainerLocation.Top;
                                }
                                OziNotificationBarState oziNotificationBarState5 = oziNotificationBarState2;
                                i17 = i13;
                                oziNotificationBarState3 = oziNotificationBarState5;
                                eVar2 = eVar4;
                                l13 = l12;
                                oziNotificationBarContainerLocation3 = oziNotificationBarContainerLocation2;
                                if (i16 != 0) {
                                    function02 = null;
                                }
                            } else {
                                u11.j();
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                OziNotificationBarState oziNotificationBarState6 = oziNotificationBarState2;
                                i17 = i13;
                                oziNotificationBarState3 = oziNotificationBarState6;
                                l13 = l12;
                                oziNotificationBarContainerLocation3 = oziNotificationBarContainerLocation2;
                            }
                            u11.j0();
                            oziNotificationBarState3.setOnDismiss$uni_release(function02);
                            int i21 = i17 >> 9;
                            BasicNotificationBarContainerKt.BasicNotificationBarContainer(oziNotificationBarState3, oziNotificationBarContainerLocation3, eVar2, content, u11, (i21 & 7168) | (i21 & 126) | ((i17 << 3) & 896), 0);
                            Unit unit = Unit.f71690a;
                            u11.o(-1720436187);
                            z11 = (458752 & i17) == 131072;
                            C11 = u11.C();
                            if (!z11 || C11 == InterfaceC3967k.a.a()) {
                                C11 = new OziNotificationBarContainerKt$OziNotificationBarContainer$1$1(function02);
                                u11.x(C11);
                            }
                            u11.k();
                            Q.c(unit, (Function1) C11, u11);
                            u11.o(-1720432418);
                            F11 = u11.F(oziNotificationBarState3) | ((i17 & 896) == 256);
                            C12 = u11.C();
                            if (!F11 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new OziNotificationBarContainerKt$OziNotificationBarContainer$2$1(oziNotificationBarState3, l13, null);
                                u11.x(C12);
                            }
                            u11.k();
                            Q.f(key, eVar2, oziNotificationBarContainerLocation3, (Function2) C12, u11);
                            e eVar5 = eVar2;
                            oziNotificationBarState4 = oziNotificationBarState3;
                            eVar3 = eVar5;
                            oziNotificationBarContainerLocation4 = oziNotificationBarContainerLocation3;
                            l14 = l13;
                        } else {
                            u11.j();
                            eVar3 = eVar2;
                            l14 = l12;
                            oziNotificationBarState4 = oziNotificationBarState2;
                            oziNotificationBarContainerLocation4 = oziNotificationBarContainerLocation2;
                        }
                        Function0<Unit> function03 = function02;
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new OziNotificationBarContainerKt$OziNotificationBarContainer$3(key, eVar3, l14, oziNotificationBarState4, oziNotificationBarContainerLocation4, function03, content, i11, i12));
                            return;
                        }
                        return;
                    }
                    function02 = function0;
                    if ((i12 & 64) != 0) {
                    }
                    if ((i13 & 599187) == 599186) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i12 & 8) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    OziNotificationBarState oziNotificationBarState52 = oziNotificationBarState2;
                    i17 = i13;
                    oziNotificationBarState3 = oziNotificationBarState52;
                    eVar2 = eVar4;
                    l13 = l12;
                    oziNotificationBarContainerLocation3 = oziNotificationBarContainerLocation2;
                    if (i16 != 0) {
                    }
                    u11.j0();
                    oziNotificationBarState3.setOnDismiss$uni_release(function02);
                    int i212 = i17 >> 9;
                    BasicNotificationBarContainerKt.BasicNotificationBarContainer(oziNotificationBarState3, oziNotificationBarContainerLocation3, eVar2, content, u11, (i212 & 7168) | (i212 & 126) | ((i17 << 3) & 896), 0);
                    Unit unit2 = Unit.f71690a;
                    u11.o(-1720436187);
                    if ((458752 & i17) == 131072) {
                    }
                    C11 = u11.C();
                    if (!z11) {
                    }
                    C11 = new OziNotificationBarContainerKt$OziNotificationBarContainer$1$1(function02);
                    u11.x(C11);
                    u11.k();
                    Q.c(unit2, (Function1) C11, u11);
                    u11.o(-1720432418);
                    F11 = u11.F(oziNotificationBarState3) | ((i17 & 896) == 256);
                    C12 = u11.C();
                    if (!F11) {
                    }
                    C12 = new OziNotificationBarContainerKt$OziNotificationBarContainer$2$1(oziNotificationBarState3, l13, null);
                    u11.x(C12);
                    u11.k();
                    Q.f(key, eVar2, oziNotificationBarContainerLocation3, (Function2) C12, u11);
                    e eVar52 = eVar2;
                    oziNotificationBarState4 = oziNotificationBarState3;
                    eVar3 = eVar52;
                    oziNotificationBarContainerLocation4 = oziNotificationBarContainerLocation3;
                    l14 = l13;
                    Function0<Unit> function032 = function02;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                oziNotificationBarContainerLocation2 = oziNotificationBarContainerLocation;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                function02 = function0;
                if ((i12 & 64) != 0) {
                }
                if ((i13 & 599187) == 599186) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i19 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i12 & 8) != 0) {
                }
                if (i15 != 0) {
                }
                OziNotificationBarState oziNotificationBarState522 = oziNotificationBarState2;
                i17 = i13;
                oziNotificationBarState3 = oziNotificationBarState522;
                eVar2 = eVar4;
                l13 = l12;
                oziNotificationBarContainerLocation3 = oziNotificationBarContainerLocation2;
                if (i16 != 0) {
                }
                u11.j0();
                oziNotificationBarState3.setOnDismiss$uni_release(function02);
                int i2122 = i17 >> 9;
                BasicNotificationBarContainerKt.BasicNotificationBarContainer(oziNotificationBarState3, oziNotificationBarContainerLocation3, eVar2, content, u11, (i2122 & 7168) | (i2122 & 126) | ((i17 << 3) & 896), 0);
                Unit unit22 = Unit.f71690a;
                u11.o(-1720436187);
                if ((458752 & i17) == 131072) {
                }
                C11 = u11.C();
                if (!z11) {
                }
                C11 = new OziNotificationBarContainerKt$OziNotificationBarContainer$1$1(function02);
                u11.x(C11);
                u11.k();
                Q.c(unit22, (Function1) C11, u11);
                u11.o(-1720432418);
                F11 = u11.F(oziNotificationBarState3) | ((i17 & 896) == 256);
                C12 = u11.C();
                if (!F11) {
                }
                C12 = new OziNotificationBarContainerKt$OziNotificationBarContainer$2$1(oziNotificationBarState3, l13, null);
                u11.x(C12);
                u11.k();
                Q.f(key, eVar2, oziNotificationBarContainerLocation3, (Function2) C12, u11);
                e eVar522 = eVar2;
                oziNotificationBarState4 = oziNotificationBarState3;
                eVar3 = eVar522;
                oziNotificationBarContainerLocation4 = oziNotificationBarContainerLocation3;
                l14 = l13;
                Function0<Unit> function0322 = function02;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            l12 = l11;
            if ((i11 & 3072) == 0) {
            }
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            oziNotificationBarContainerLocation2 = oziNotificationBarContainerLocation;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            function02 = function0;
            if ((i12 & 64) != 0) {
            }
            if ((i13 & 599187) == 599186) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i12 & 8) != 0) {
            }
            if (i15 != 0) {
            }
            OziNotificationBarState oziNotificationBarState5222 = oziNotificationBarState2;
            i17 = i13;
            oziNotificationBarState3 = oziNotificationBarState5222;
            eVar2 = eVar4;
            l13 = l12;
            oziNotificationBarContainerLocation3 = oziNotificationBarContainerLocation2;
            if (i16 != 0) {
            }
            u11.j0();
            oziNotificationBarState3.setOnDismiss$uni_release(function02);
            int i21222 = i17 >> 9;
            BasicNotificationBarContainerKt.BasicNotificationBarContainer(oziNotificationBarState3, oziNotificationBarContainerLocation3, eVar2, content, u11, (i21222 & 7168) | (i21222 & 126) | ((i17 << 3) & 896), 0);
            Unit unit222 = Unit.f71690a;
            u11.o(-1720436187);
            if ((458752 & i17) == 131072) {
            }
            C11 = u11.C();
            if (!z11) {
            }
            C11 = new OziNotificationBarContainerKt$OziNotificationBarContainer$1$1(function02);
            u11.x(C11);
            u11.k();
            Q.c(unit222, (Function1) C11, u11);
            u11.o(-1720432418);
            F11 = u11.F(oziNotificationBarState3) | ((i17 & 896) == 256);
            C12 = u11.C();
            if (!F11) {
            }
            C12 = new OziNotificationBarContainerKt$OziNotificationBarContainer$2$1(oziNotificationBarState3, l13, null);
            u11.x(C12);
            u11.k();
            Q.f(key, eVar2, oziNotificationBarContainerLocation3, (Function2) C12, u11);
            e eVar5222 = eVar2;
            oziNotificationBarState4 = oziNotificationBarState3;
            eVar3 = eVar5222;
            oziNotificationBarContainerLocation4 = oziNotificationBarContainerLocation3;
            l14 = l13;
            Function0<Unit> function03222 = function02;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        l12 = l11;
        if ((i11 & 3072) == 0) {
        }
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        oziNotificationBarContainerLocation2 = oziNotificationBarContainerLocation;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        function02 = function0;
        if ((i12 & 64) != 0) {
        }
        if ((i13 & 599187) == 599186) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i12 & 8) != 0) {
        }
        if (i15 != 0) {
        }
        OziNotificationBarState oziNotificationBarState52222 = oziNotificationBarState2;
        i17 = i13;
        oziNotificationBarState3 = oziNotificationBarState52222;
        eVar2 = eVar4;
        l13 = l12;
        oziNotificationBarContainerLocation3 = oziNotificationBarContainerLocation2;
        if (i16 != 0) {
        }
        u11.j0();
        oziNotificationBarState3.setOnDismiss$uni_release(function02);
        int i212222 = i17 >> 9;
        BasicNotificationBarContainerKt.BasicNotificationBarContainer(oziNotificationBarState3, oziNotificationBarContainerLocation3, eVar2, content, u11, (i212222 & 7168) | (i212222 & 126) | ((i17 << 3) & 896), 0);
        Unit unit2222 = Unit.f71690a;
        u11.o(-1720436187);
        if ((458752 & i17) == 131072) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new OziNotificationBarContainerKt$OziNotificationBarContainer$1$1(function02);
        u11.x(C11);
        u11.k();
        Q.c(unit2222, (Function1) C11, u11);
        u11.o(-1720432418);
        F11 = u11.F(oziNotificationBarState3) | ((i17 & 896) == 256);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new OziNotificationBarContainerKt$OziNotificationBarContainer$2$1(oziNotificationBarState3, l13, null);
        u11.x(C12);
        u11.k();
        Q.f(key, eVar2, oziNotificationBarContainerLocation3, (Function2) C12, u11);
        e eVar52222 = eVar2;
        oziNotificationBarState4 = oziNotificationBarState3;
        eVar3 = eVar52222;
        oziNotificationBarContainerLocation4 = oziNotificationBarContainerLocation3;
        l14 = l13;
        Function0<Unit> function032222 = function02;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
