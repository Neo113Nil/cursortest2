package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellScope;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellCenterScope;", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope;", "<init>", "()V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/compose/ui/e;", "modifier", "subtitle", "", "isReversed", "", "titleMaxLines", "subtitleMaxLines", "", "TextBlock", "(Ljava/lang/String;Landroidx/compose/ui/e;Ljava/lang/String;ZIILS0/k;II)V", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "addonMarker", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "getAddonMarker", "()Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "Companion", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuCellCenterScope extends DebugMenuCellScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DebugMenuCellCenterScope INSTANCE = new DebugMenuCellCenterScope();

    @NotNull
    private final DebugMenuCellScope.AddonMarker addonMarker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellCenterScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellCenterScope;", "getINSTANCE", "()Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellCenterScope;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DebugMenuCellCenterScope getINSTANCE() {
            return DebugMenuCellCenterScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private DebugMenuCellCenterScope() {
        super(null);
        this.addonMarker = DebugMenuCellScope.AddonMarker.Center;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextBlock(@NotNull String title, e eVar, String str, boolean z11, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        int i15;
        e eVar2;
        int i16;
        String str2;
        int i17;
        boolean z12;
        int i18;
        int i19;
        int i21;
        int i22;
        DebugMenuCellScope debugMenuCellScope;
        boolean z13;
        int i23;
        String str3;
        e eVar3;
        int i24;
        J0 m02;
        Intrinsics.checkNotNullParameter(title, "title");
        C3969l u11 = interfaceC3967k.u(1332649094);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (u11.n(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            eVar2 = eVar;
            i15 |= u11.n(eVar2) ? 32 : 16;
            i16 = i14 & 4;
            if (i16 == 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= u11.n(str2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i17 = i14 & 8;
                if (i17 != 0) {
                    i15 |= 3072;
                } else if ((i13 & 3072) == 0) {
                    z12 = z11;
                    i15 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i18 = i14 & 16;
                    if (i18 == 0) {
                        i15 |= 24576;
                    } else if ((i13 & 24576) == 0) {
                        i19 = i11;
                        i15 |= u11.r(i19) ? 16384 : 8192;
                        i21 = i14 & 32;
                        if (i21 != 0) {
                            i15 |= 196608;
                        } else if ((196608 & i13) == 0) {
                            i22 = i12;
                            i15 |= u11.r(i22) ? 131072 : 65536;
                            if ((i14 & 64) == 0) {
                                i15 |= 1572864;
                            } else if ((i13 & 1572864) == 0) {
                                debugMenuCellScope = this;
                                i15 |= u11.n(debugMenuCellScope) ? 1048576 : 524288;
                                int i26 = i15;
                                if ((i15 & 599187) == 599186 || !u11.b()) {
                                    e eVar4 = i25 != 0 ? e.f40358c0 : eVar2;
                                    if (i16 != 0) {
                                        str2 = null;
                                    }
                                    if (i17 != 0) {
                                        z12 = false;
                                    }
                                    if (i18 != 0) {
                                        i19 = 2;
                                    }
                                    if (i21 != 0) {
                                        i22 = 1;
                                    }
                                    boolean z14 = z12;
                                    int i27 = i19;
                                    int i28 = i22;
                                    debugMenuCellScope.m1616AddonBuilder942rkJo(T.h(eVar4, 0.0f, 2, 1), null, 0.0f, c.c(1870933339, new DebugMenuCellCenterScope$TextBlock$1(z14, str2, i27, title, i28), u11), u11, (57344 & (i26 >> 6)) | 3072, 6);
                                    z13 = z14;
                                    i23 = i28;
                                    str3 = str2;
                                    eVar3 = eVar4;
                                    i24 = i27;
                                } else {
                                    u11.j();
                                    eVar3 = eVar2;
                                    str3 = str2;
                                    z13 = z12;
                                    i24 = i19;
                                    i23 = i22;
                                }
                                m02 = u11.m0();
                                if (m02 != null) {
                                    m02.G(new DebugMenuCellCenterScope$TextBlock$2(this, title, eVar3, str3, z13, i24, i23, i13, i14));
                                    return;
                                }
                                return;
                            }
                            debugMenuCellScope = this;
                            int i262 = i15;
                            if ((i15 & 599187) == 599186) {
                            }
                            if (i25 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            boolean z142 = z12;
                            int i272 = i19;
                            int i282 = i22;
                            debugMenuCellScope.m1616AddonBuilder942rkJo(T.h(eVar4, 0.0f, 2, 1), null, 0.0f, c.c(1870933339, new DebugMenuCellCenterScope$TextBlock$1(z142, str2, i272, title, i282), u11), u11, (57344 & (i262 >> 6)) | 3072, 6);
                            z13 = z142;
                            i23 = i282;
                            str3 = str2;
                            eVar3 = eVar4;
                            i24 = i272;
                            m02 = u11.m0();
                            if (m02 != null) {
                            }
                        }
                        i22 = i12;
                        if ((i14 & 64) == 0) {
                        }
                        debugMenuCellScope = this;
                        int i2622 = i15;
                        if ((i15 & 599187) == 599186) {
                        }
                        if (i25 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        boolean z1422 = z12;
                        int i2722 = i19;
                        int i2822 = i22;
                        debugMenuCellScope.m1616AddonBuilder942rkJo(T.h(eVar4, 0.0f, 2, 1), null, 0.0f, c.c(1870933339, new DebugMenuCellCenterScope$TextBlock$1(z1422, str2, i2722, title, i2822), u11), u11, (57344 & (i2622 >> 6)) | 3072, 6);
                        z13 = z1422;
                        i23 = i2822;
                        str3 = str2;
                        eVar3 = eVar4;
                        i24 = i2722;
                        m02 = u11.m0();
                        if (m02 != null) {
                        }
                    }
                    i19 = i11;
                    i21 = i14 & 32;
                    if (i21 != 0) {
                    }
                    i22 = i12;
                    if ((i14 & 64) == 0) {
                    }
                    debugMenuCellScope = this;
                    int i26222 = i15;
                    if ((i15 & 599187) == 599186) {
                    }
                    if (i25 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    boolean z14222 = z12;
                    int i27222 = i19;
                    int i28222 = i22;
                    debugMenuCellScope.m1616AddonBuilder942rkJo(T.h(eVar4, 0.0f, 2, 1), null, 0.0f, c.c(1870933339, new DebugMenuCellCenterScope$TextBlock$1(z14222, str2, i27222, title, i28222), u11), u11, (57344 & (i26222 >> 6)) | 3072, 6);
                    z13 = z14222;
                    i23 = i28222;
                    str3 = str2;
                    eVar3 = eVar4;
                    i24 = i27222;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                z12 = z11;
                i18 = i14 & 16;
                if (i18 == 0) {
                }
                i19 = i11;
                i21 = i14 & 32;
                if (i21 != 0) {
                }
                i22 = i12;
                if ((i14 & 64) == 0) {
                }
                debugMenuCellScope = this;
                int i262222 = i15;
                if ((i15 & 599187) == 599186) {
                }
                if (i25 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                boolean z142222 = z12;
                int i272222 = i19;
                int i282222 = i22;
                debugMenuCellScope.m1616AddonBuilder942rkJo(T.h(eVar4, 0.0f, 2, 1), null, 0.0f, c.c(1870933339, new DebugMenuCellCenterScope$TextBlock$1(z142222, str2, i272222, title, i282222), u11), u11, (57344 & (i262222 >> 6)) | 3072, 6);
                z13 = z142222;
                i23 = i282222;
                str3 = str2;
                eVar3 = eVar4;
                i24 = i272222;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            str2 = str;
            i17 = i14 & 8;
            if (i17 != 0) {
            }
            z12 = z11;
            i18 = i14 & 16;
            if (i18 == 0) {
            }
            i19 = i11;
            i21 = i14 & 32;
            if (i21 != 0) {
            }
            i22 = i12;
            if ((i14 & 64) == 0) {
            }
            debugMenuCellScope = this;
            int i2622222 = i15;
            if ((i15 & 599187) == 599186) {
            }
            if (i25 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            boolean z1422222 = z12;
            int i2722222 = i19;
            int i2822222 = i22;
            debugMenuCellScope.m1616AddonBuilder942rkJo(T.h(eVar4, 0.0f, 2, 1), null, 0.0f, c.c(1870933339, new DebugMenuCellCenterScope$TextBlock$1(z1422222, str2, i2722222, title, i2822222), u11), u11, (57344 & (i2622222 >> 6)) | 3072, 6);
            z13 = z1422222;
            i23 = i2822222;
            str3 = str2;
            eVar3 = eVar4;
            i24 = i2722222;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i16 = i14 & 4;
        if (i16 == 0) {
        }
        str2 = str;
        i17 = i14 & 8;
        if (i17 != 0) {
        }
        z12 = z11;
        i18 = i14 & 16;
        if (i18 == 0) {
        }
        i19 = i11;
        i21 = i14 & 32;
        if (i21 != 0) {
        }
        i22 = i12;
        if ((i14 & 64) == 0) {
        }
        debugMenuCellScope = this;
        int i26222222 = i15;
        if ((i15 & 599187) == 599186) {
        }
        if (i25 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        boolean z14222222 = z12;
        int i27222222 = i19;
        int i28222222 = i22;
        debugMenuCellScope.m1616AddonBuilder942rkJo(T.h(eVar4, 0.0f, 2, 1), null, 0.0f, c.c(1870933339, new DebugMenuCellCenterScope$TextBlock$1(z14222222, str2, i27222222, title, i28222222), u11), u11, (57344 & (i26222222 >> 6)) | 3072, 6);
        z13 = z14222222;
        i23 = i28222222;
        str3 = str2;
        eVar3 = eVar4;
        i24 = i27222222;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    @Override // ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellScope
    @NotNull
    public DebugMenuCellScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
