package ru.ozon.uni.ozi.components.notificationBar;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarDefaults;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarStatus;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.theme.OziThemeKt;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¥\u0001\u0010\u0013\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/ozi/components/notificationBar/OziNotificationBarIconScope;", "", "icon", "", "titleLinesLimit", "subtitleLinesLimit", "Lkotlin/Function0;", "onCloseClick", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarStatus;", "status", "Lru/ozon/uni/ozi/components/notificationBar/OziNotificationBarButtonScope;", "firstButton", "secondButton", "OziNotificationBar", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/e;Lfd/n;IILkotlin/jvm/functions/Function0;Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarStatus;Lfd/n;Lfd/n;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OziNotificationBar(String str, String str2, e eVar, InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, int i11, int i12, Function0<Unit> function0, OziNotificationBarStatus oziNotificationBarStatus, InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        String str3;
        int i15;
        String str4;
        e eVar2;
        InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        Function0<Unit> function02;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n5;
        OziNotificationBarStatus oziNotificationBarStatus2;
        InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n6;
        int i28;
        int i29;
        InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n7;
        Function0<Unit> function03;
        InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n8;
        InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n9;
        e eVar3;
        OziNotificationBarStatus oziNotificationBarStatus3;
        J0 m02;
        int i31;
        C3969l u11 = interfaceC3967k.u(-107688478);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i13 & 6) == 0) {
                i15 = (u11.n(str3) ? 4 : 2) | i13;
            } else {
                i15 = i13;
            }
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i13 & 48) == 0) {
                i15 |= u11.n(str4) ? 32 : 16;
            }
        }
        int i32 = i14 & 4;
        if (i32 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            eVar2 = eVar;
            i15 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 3072) != 0) {
                if ((i14 & 8) == 0) {
                    interfaceC6511n4 = interfaceC6511n;
                    if (u11.F(interfaceC6511n4)) {
                        i31 = 2048;
                        i15 |= i31;
                    }
                } else {
                    interfaceC6511n4 = interfaceC6511n;
                }
                i31 = UserVerificationMethods.USER_VERIFY_ALL;
                i15 |= i31;
            } else {
                interfaceC6511n4 = interfaceC6511n;
            }
            i16 = i14 & 16;
            if (i16 == 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                i17 = i11;
                i15 |= u11.r(i17) ? 16384 : 8192;
                i18 = i14 & 32;
                if (i18 != 0) {
                    i15 |= 196608;
                } else if ((196608 & i13) == 0) {
                    i19 = i12;
                    i15 |= u11.r(i19) ? 131072 : 65536;
                    i21 = i14 & 64;
                    if (i21 == 0) {
                        i15 |= 1572864;
                    } else if ((1572864 & i13) == 0) {
                        function02 = function0;
                        i15 |= u11.F(function02) ? 1048576 : 524288;
                        i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i22 != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            i23 = i15 | (u11.n(oziNotificationBarStatus) ? 8388608 : 4194304);
                            i24 = i14 & 256;
                            if (i24 == 0) {
                                i23 |= 100663296;
                            } else if ((i13 & 100663296) == 0) {
                                i25 = i24;
                                i23 |= u11.F(interfaceC6511n2) ? 67108864 : 33554432;
                                i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                                if (i26 != 0) {
                                    i23 |= 805306368;
                                } else if ((i13 & 805306368) == 0) {
                                    i27 = i26;
                                    i23 |= u11.F(interfaceC6511n3) ? 536870912 : 268435456;
                                    if ((i23 & 306783379) == 306783378 || !u11.b()) {
                                        u11.Q0();
                                        if ((i13 & 1) != 0 || u11.w0()) {
                                            if (i32 != 0) {
                                                eVar2 = e.f40358c0;
                                            }
                                            if ((i14 & 8) != 0) {
                                                interfaceC6511n4 = OziNotificationBarDefaults.INSTANCE.icon(u11, 6);
                                            }
                                            if (i16 != 0) {
                                                i17 = 2;
                                            }
                                            if (i18 != 0) {
                                                i19 = 2;
                                            }
                                            if (i21 != 0) {
                                                function02 = null;
                                            }
                                            OziNotificationBarStatus oziNotificationBarStatus4 = i22 == 0 ? OziNotificationBarStatus.Success : oziNotificationBarStatus;
                                            InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n10 = i25 == 0 ? null : interfaceC6511n2;
                                            interfaceC6511n5 = i27 == 0 ? null : interfaceC6511n3;
                                            oziNotificationBarStatus2 = oziNotificationBarStatus4;
                                            interfaceC6511n6 = interfaceC6511n10;
                                        } else {
                                            u11.j();
                                            oziNotificationBarStatus2 = oziNotificationBarStatus;
                                            interfaceC6511n6 = interfaceC6511n2;
                                            interfaceC6511n5 = interfaceC6511n3;
                                        }
                                        e eVar4 = eVar2;
                                        InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n11 = interfaceC6511n4;
                                        int i33 = i17;
                                        int i34 = i19;
                                        Function0<Unit> function04 = function02;
                                        u11.j0();
                                        OziThemeKt.OziTheme(!OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getIsDark(), c.c(-238160965, new OziNotificationBarKt$OziNotificationBar$1(str3, str4, i33, i34, interfaceC6511n11, function04, interfaceC6511n6, interfaceC6511n5, eVar4, oziNotificationBarStatus2), u11), u11, 48, 0);
                                        i28 = i33;
                                        i29 = i34;
                                        interfaceC6511n7 = interfaceC6511n11;
                                        function03 = function04;
                                        interfaceC6511n8 = interfaceC6511n6;
                                        interfaceC6511n9 = interfaceC6511n5;
                                        eVar3 = eVar4;
                                        oziNotificationBarStatus3 = oziNotificationBarStatus2;
                                    } else {
                                        u11.j();
                                        oziNotificationBarStatus3 = oziNotificationBarStatus;
                                        interfaceC6511n9 = interfaceC6511n3;
                                        eVar3 = eVar2;
                                        interfaceC6511n7 = interfaceC6511n4;
                                        i28 = i17;
                                        i29 = i19;
                                        function03 = function02;
                                        interfaceC6511n8 = interfaceC6511n2;
                                    }
                                    m02 = u11.m0();
                                    if (m02 == null) {
                                        m02.G(new OziNotificationBarKt$OziNotificationBar$2(str, str2, eVar3, interfaceC6511n7, i28, i29, function03, oziNotificationBarStatus3, interfaceC6511n8, interfaceC6511n9, i13, i14));
                                        return;
                                    }
                                    return;
                                }
                                i27 = i26;
                                if ((i23 & 306783379) == 306783378) {
                                }
                                u11.Q0();
                                if ((i13 & 1) != 0) {
                                }
                                if (i32 != 0) {
                                }
                                if ((i14 & 8) != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (i18 != 0) {
                                }
                                if (i21 != 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                oziNotificationBarStatus2 = oziNotificationBarStatus4;
                                interfaceC6511n6 = interfaceC6511n10;
                                e eVar42 = eVar2;
                                InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n112 = interfaceC6511n4;
                                int i332 = i17;
                                int i342 = i19;
                                Function0<Unit> function042 = function02;
                                u11.j0();
                                OziThemeKt.OziTheme(!OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getIsDark(), c.c(-238160965, new OziNotificationBarKt$OziNotificationBar$1(str3, str4, i332, i342, interfaceC6511n112, function042, interfaceC6511n6, interfaceC6511n5, eVar42, oziNotificationBarStatus2), u11), u11, 48, 0);
                                i28 = i332;
                                i29 = i342;
                                interfaceC6511n7 = interfaceC6511n112;
                                function03 = function042;
                                interfaceC6511n8 = interfaceC6511n6;
                                interfaceC6511n9 = interfaceC6511n5;
                                eVar3 = eVar42;
                                oziNotificationBarStatus3 = oziNotificationBarStatus2;
                                m02 = u11.m0();
                                if (m02 == null) {
                                }
                            }
                            i25 = i24;
                            i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i26 != 0) {
                            }
                            i27 = i26;
                            if ((i23 & 306783379) == 306783378) {
                            }
                            u11.Q0();
                            if ((i13 & 1) != 0) {
                            }
                            if (i32 != 0) {
                            }
                            if ((i14 & 8) != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            oziNotificationBarStatus2 = oziNotificationBarStatus4;
                            interfaceC6511n6 = interfaceC6511n10;
                            e eVar422 = eVar2;
                            InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n1122 = interfaceC6511n4;
                            int i3322 = i17;
                            int i3422 = i19;
                            Function0<Unit> function0422 = function02;
                            u11.j0();
                            OziThemeKt.OziTheme(!OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getIsDark(), c.c(-238160965, new OziNotificationBarKt$OziNotificationBar$1(str3, str4, i3322, i3422, interfaceC6511n1122, function0422, interfaceC6511n6, interfaceC6511n5, eVar422, oziNotificationBarStatus2), u11), u11, 48, 0);
                            i28 = i3322;
                            i29 = i3422;
                            interfaceC6511n7 = interfaceC6511n1122;
                            function03 = function0422;
                            interfaceC6511n8 = interfaceC6511n6;
                            interfaceC6511n9 = interfaceC6511n5;
                            eVar3 = eVar422;
                            oziNotificationBarStatus3 = oziNotificationBarStatus2;
                            m02 = u11.m0();
                            if (m02 == null) {
                            }
                        }
                        i23 = i15;
                        i24 = i14 & 256;
                        if (i24 == 0) {
                        }
                        i25 = i24;
                        i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i26 != 0) {
                        }
                        i27 = i26;
                        if ((i23 & 306783379) == 306783378) {
                        }
                        u11.Q0();
                        if ((i13 & 1) != 0) {
                        }
                        if (i32 != 0) {
                        }
                        if ((i14 & 8) != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        oziNotificationBarStatus2 = oziNotificationBarStatus4;
                        interfaceC6511n6 = interfaceC6511n10;
                        e eVar4222 = eVar2;
                        InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n11222 = interfaceC6511n4;
                        int i33222 = i17;
                        int i34222 = i19;
                        Function0<Unit> function04222 = function02;
                        u11.j0();
                        OziThemeKt.OziTheme(!OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getIsDark(), c.c(-238160965, new OziNotificationBarKt$OziNotificationBar$1(str3, str4, i33222, i34222, interfaceC6511n11222, function04222, interfaceC6511n6, interfaceC6511n5, eVar4222, oziNotificationBarStatus2), u11), u11, 48, 0);
                        i28 = i33222;
                        i29 = i34222;
                        interfaceC6511n7 = interfaceC6511n11222;
                        function03 = function04222;
                        interfaceC6511n8 = interfaceC6511n6;
                        interfaceC6511n9 = interfaceC6511n5;
                        eVar3 = eVar4222;
                        oziNotificationBarStatus3 = oziNotificationBarStatus2;
                        m02 = u11.m0();
                        if (m02 == null) {
                        }
                    }
                    function02 = function0;
                    i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i22 != 0) {
                    }
                    i23 = i15;
                    i24 = i14 & 256;
                    if (i24 == 0) {
                    }
                    i25 = i24;
                    i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i26 != 0) {
                    }
                    i27 = i26;
                    if ((i23 & 306783379) == 306783378) {
                    }
                    u11.Q0();
                    if ((i13 & 1) != 0) {
                    }
                    if (i32 != 0) {
                    }
                    if ((i14 & 8) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    oziNotificationBarStatus2 = oziNotificationBarStatus4;
                    interfaceC6511n6 = interfaceC6511n10;
                    e eVar42222 = eVar2;
                    InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n112222 = interfaceC6511n4;
                    int i332222 = i17;
                    int i342222 = i19;
                    Function0<Unit> function042222 = function02;
                    u11.j0();
                    OziThemeKt.OziTheme(!OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getIsDark(), c.c(-238160965, new OziNotificationBarKt$OziNotificationBar$1(str3, str4, i332222, i342222, interfaceC6511n112222, function042222, interfaceC6511n6, interfaceC6511n5, eVar42222, oziNotificationBarStatus2), u11), u11, 48, 0);
                    i28 = i332222;
                    i29 = i342222;
                    interfaceC6511n7 = interfaceC6511n112222;
                    function03 = function042222;
                    interfaceC6511n8 = interfaceC6511n6;
                    interfaceC6511n9 = interfaceC6511n5;
                    eVar3 = eVar42222;
                    oziNotificationBarStatus3 = oziNotificationBarStatus2;
                    m02 = u11.m0();
                    if (m02 == null) {
                    }
                }
                i19 = i12;
                i21 = i14 & 64;
                if (i21 == 0) {
                }
                function02 = function0;
                i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i22 != 0) {
                }
                i23 = i15;
                i24 = i14 & 256;
                if (i24 == 0) {
                }
                i25 = i24;
                i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i26 != 0) {
                }
                i27 = i26;
                if ((i23 & 306783379) == 306783378) {
                }
                u11.Q0();
                if ((i13 & 1) != 0) {
                }
                if (i32 != 0) {
                }
                if ((i14 & 8) != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                oziNotificationBarStatus2 = oziNotificationBarStatus4;
                interfaceC6511n6 = interfaceC6511n10;
                e eVar422222 = eVar2;
                InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n1122222 = interfaceC6511n4;
                int i3322222 = i17;
                int i3422222 = i19;
                Function0<Unit> function0422222 = function02;
                u11.j0();
                OziThemeKt.OziTheme(!OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getIsDark(), c.c(-238160965, new OziNotificationBarKt$OziNotificationBar$1(str3, str4, i3322222, i3422222, interfaceC6511n1122222, function0422222, interfaceC6511n6, interfaceC6511n5, eVar422222, oziNotificationBarStatus2), u11), u11, 48, 0);
                i28 = i3322222;
                i29 = i3422222;
                interfaceC6511n7 = interfaceC6511n1122222;
                function03 = function0422222;
                interfaceC6511n8 = interfaceC6511n6;
                interfaceC6511n9 = interfaceC6511n5;
                eVar3 = eVar422222;
                oziNotificationBarStatus3 = oziNotificationBarStatus2;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            i17 = i11;
            i18 = i14 & 32;
            if (i18 != 0) {
            }
            i19 = i12;
            i21 = i14 & 64;
            if (i21 == 0) {
            }
            function02 = function0;
            i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i22 != 0) {
            }
            i23 = i15;
            i24 = i14 & 256;
            if (i24 == 0) {
            }
            i25 = i24;
            i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i26 != 0) {
            }
            i27 = i26;
            if ((i23 & 306783379) == 306783378) {
            }
            u11.Q0();
            if ((i13 & 1) != 0) {
            }
            if (i32 != 0) {
            }
            if ((i14 & 8) != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            oziNotificationBarStatus2 = oziNotificationBarStatus4;
            interfaceC6511n6 = interfaceC6511n10;
            e eVar4222222 = eVar2;
            InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n11222222 = interfaceC6511n4;
            int i33222222 = i17;
            int i34222222 = i19;
            Function0<Unit> function04222222 = function02;
            u11.j0();
            OziThemeKt.OziTheme(!OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getIsDark(), c.c(-238160965, new OziNotificationBarKt$OziNotificationBar$1(str3, str4, i33222222, i34222222, interfaceC6511n11222222, function04222222, interfaceC6511n6, interfaceC6511n5, eVar4222222, oziNotificationBarStatus2), u11), u11, 48, 0);
            i28 = i33222222;
            i29 = i34222222;
            interfaceC6511n7 = interfaceC6511n11222222;
            function03 = function04222222;
            interfaceC6511n8 = interfaceC6511n6;
            interfaceC6511n9 = interfaceC6511n5;
            eVar3 = eVar4222222;
            oziNotificationBarStatus3 = oziNotificationBarStatus2;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        if ((i13 & 3072) != 0) {
        }
        i16 = i14 & 16;
        if (i16 == 0) {
        }
        i17 = i11;
        i18 = i14 & 32;
        if (i18 != 0) {
        }
        i19 = i12;
        i21 = i14 & 64;
        if (i21 == 0) {
        }
        function02 = function0;
        i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i22 != 0) {
        }
        i23 = i15;
        i24 = i14 & 256;
        if (i24 == 0) {
        }
        i25 = i24;
        i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i26 != 0) {
        }
        i27 = i26;
        if ((i23 & 306783379) == 306783378) {
        }
        u11.Q0();
        if ((i13 & 1) != 0) {
        }
        if (i32 != 0) {
        }
        if ((i14 & 8) != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        oziNotificationBarStatus2 = oziNotificationBarStatus4;
        interfaceC6511n6 = interfaceC6511n10;
        e eVar42222222 = eVar2;
        InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n112222222 = interfaceC6511n4;
        int i332222222 = i17;
        int i342222222 = i19;
        Function0<Unit> function042222222 = function02;
        u11.j0();
        OziThemeKt.OziTheme(!OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getIsDark(), c.c(-238160965, new OziNotificationBarKt$OziNotificationBar$1(str3, str4, i332222222, i342222222, interfaceC6511n112222222, function042222222, interfaceC6511n6, interfaceC6511n5, eVar42222222, oziNotificationBarStatus2), u11), u11, 48, 0);
        i28 = i332222222;
        i29 = i342222222;
        interfaceC6511n7 = interfaceC6511n112222222;
        function03 = function042222222;
        interfaceC6511n8 = interfaceC6511n6;
        interfaceC6511n9 = interfaceC6511n5;
        eVar3 = eVar42222222;
        oziNotificationBarStatus3 = oziNotificationBarStatus2;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
