package ru.ozon.uni.ozi.components.badge;

import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.foundation.components.badge.FoundationBadgeKt;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeSize;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeStyle;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.theme.OziTypography;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.PainterUtilsKt;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredBrush;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;
import u0.C9915y;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a[\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aa\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "label", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "Lq1/b;", "startGraphic", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;", "style", "", "numeric", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeSize;", "size", "OziBadge", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;Lq1/b;Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;ZLru/ozon/uni/ozi/components/badge/presets/OziBadgeSize;LS0/k;II)V", "showChevron", "OziBadgeImpl", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;Lq1/b;Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;ZLru/ozon/uni/ozi/components/badge/presets/OziBadgeSize;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziBadgeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OziBadgeSize.values().length];
            try {
                iArr[OziBadgeSize.Size300.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziBadgeSize.Size400.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OziBadgeSize.Size500.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OziBadgeSize.Size600.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OziBadge(@NotNull String label, Function0<Unit> function0, e eVar, AbstractC8972b abstractC8972b, OziBadgeStyle oziBadgeStyle, boolean z11, OziBadgeSize oziBadgeSize, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        AbstractC8972b abstractC8972b2;
        int i15;
        OziBadgeStyle oziBadgeStyle2;
        int i16;
        boolean z12;
        int i17;
        OziBadgeSize oziBadgeSize2;
        AbstractC8972b abstractC8972b3;
        OziBadgeStyle oziBadgeStyle3;
        boolean z13;
        OziBadgeSize oziBadgeSize3;
        Function0<Unit> function02;
        J0 m02;
        Intrinsics.checkNotNullParameter(label, "label");
        C3969l u11 = interfaceC3967k.u(782611061);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(label) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function0) ? 32 : 16;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                abstractC8972b2 = abstractC8972b;
                i13 |= u11.n(abstractC8972b2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    oziBadgeStyle2 = oziBadgeStyle;
                    i13 |= u11.n(oziBadgeStyle2) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        z12 = z11;
                        i13 |= u11.p(z12) ? 131072 : 65536;
                        i17 = i12 & 64;
                        if (i17 != 0) {
                            i13 |= 1572864;
                        } else if ((1572864 & i11) == 0) {
                            oziBadgeSize2 = oziBadgeSize;
                            i13 |= u11.n(oziBadgeSize2) ? 1048576 : 524288;
                            if ((599187 & i13) == 599186 || !u11.b()) {
                                if (i18 != 0) {
                                    eVar2 = e.f40358c0;
                                }
                                abstractC8972b3 = i14 == 0 ? null : abstractC8972b2;
                                oziBadgeStyle3 = i15 == 0 ? OziBadgeStyle.NeutralSecondary.INSTANCE : oziBadgeStyle2;
                                z13 = i16 == 0 ? false : z12;
                                oziBadgeSize3 = i17 == 0 ? OziBadgeSize.Size500 : oziBadgeSize2;
                                boolean z14 = function0 != null;
                                u11.o(419256206);
                                if (function0 != null) {
                                    u11.o(419256547);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = OziBadgeKt$OziBadge$1$1.INSTANCE;
                                        u11.x(C11);
                                    }
                                    function02 = (Function0) C11;
                                    u11.k();
                                } else {
                                    function02 = function0;
                                }
                                u11.k();
                                int i19 = i13 & 14;
                                int i21 = i13 << 3;
                                OziBadgeImpl(label, z14, function02, eVar2, abstractC8972b3, oziBadgeStyle3, z13, oziBadgeSize3, u11, i19 | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128), 0);
                            } else {
                                u11.j();
                                abstractC8972b3 = abstractC8972b2;
                                oziBadgeStyle3 = oziBadgeStyle2;
                                z13 = z12;
                                oziBadgeSize3 = oziBadgeSize2;
                            }
                            m02 = u11.m0();
                            if (m02 == null) {
                                m02.G(new OziBadgeKt$OziBadge$2(label, function0, eVar2, abstractC8972b3, oziBadgeStyle3, z13, oziBadgeSize3, i11, i12));
                                return;
                            }
                            return;
                        }
                        oziBadgeSize2 = oziBadgeSize;
                        if ((599187 & i13) == 599186) {
                        }
                        if (i18 != 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (function0 != null) {
                        }
                        u11.o(419256206);
                        if (function0 != null) {
                        }
                        u11.k();
                        int i192 = i13 & 14;
                        int i212 = i13 << 3;
                        OziBadgeImpl(label, z14, function02, eVar2, abstractC8972b3, oziBadgeStyle3, z13, oziBadgeSize3, u11, i192 | (i212 & 7168) | (57344 & i212) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128), 0);
                        m02 = u11.m0();
                        if (m02 == null) {
                        }
                    }
                    z12 = z11;
                    i17 = i12 & 64;
                    if (i17 != 0) {
                    }
                    oziBadgeSize2 = oziBadgeSize;
                    if ((599187 & i13) == 599186) {
                    }
                    if (i18 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (function0 != null) {
                    }
                    u11.o(419256206);
                    if (function0 != null) {
                    }
                    u11.k();
                    int i1922 = i13 & 14;
                    int i2122 = i13 << 3;
                    OziBadgeImpl(label, z14, function02, eVar2, abstractC8972b3, oziBadgeStyle3, z13, oziBadgeSize3, u11, i1922 | (i2122 & 7168) | (57344 & i2122) | (458752 & i2122) | (3670016 & i2122) | (i2122 & 29360128), 0);
                    m02 = u11.m0();
                    if (m02 == null) {
                    }
                }
                oziBadgeStyle2 = oziBadgeStyle;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                z12 = z11;
                i17 = i12 & 64;
                if (i17 != 0) {
                }
                oziBadgeSize2 = oziBadgeSize;
                if ((599187 & i13) == 599186) {
                }
                if (i18 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (function0 != null) {
                }
                u11.o(419256206);
                if (function0 != null) {
                }
                u11.k();
                int i19222 = i13 & 14;
                int i21222 = i13 << 3;
                OziBadgeImpl(label, z14, function02, eVar2, abstractC8972b3, oziBadgeStyle3, z13, oziBadgeSize3, u11, i19222 | (i21222 & 7168) | (57344 & i21222) | (458752 & i21222) | (3670016 & i21222) | (i21222 & 29360128), 0);
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            abstractC8972b2 = abstractC8972b;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            oziBadgeStyle2 = oziBadgeStyle;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            z12 = z11;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            oziBadgeSize2 = oziBadgeSize;
            if ((599187 & i13) == 599186) {
            }
            if (i18 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (function0 != null) {
            }
            u11.o(419256206);
            if (function0 != null) {
            }
            u11.k();
            int i192222 = i13 & 14;
            int i212222 = i13 << 3;
            OziBadgeImpl(label, z14, function02, eVar2, abstractC8972b3, oziBadgeStyle3, z13, oziBadgeSize3, u11, i192222 | (i212222 & 7168) | (57344 & i212222) | (458752 & i212222) | (3670016 & i212222) | (i212222 & 29360128), 0);
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        abstractC8972b2 = abstractC8972b;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        oziBadgeStyle2 = oziBadgeStyle;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        z12 = z11;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        oziBadgeSize2 = oziBadgeSize;
        if ((599187 & i13) == 599186) {
        }
        if (i18 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (function0 != null) {
        }
        u11.o(419256206);
        if (function0 != null) {
        }
        u11.k();
        int i1922222 = i13 & 14;
        int i2122222 = i13 << 3;
        OziBadgeImpl(label, z14, function02, eVar2, abstractC8972b3, oziBadgeStyle3, z13, oziBadgeSize3, u11, i1922222 | (i2122222 & 7168) | (57344 & i2122222) | (458752 & i2122222) | (3670016 & i2122222) | (i2122222 & 29360128), 0);
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x01c4, code lost:
    
        if (r14 != null) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OziBadgeImpl(@NotNull String label, boolean z11, @NotNull Function0<Unit> onClick, e eVar, AbstractC8972b abstractC8972b, OziBadgeStyle oziBadgeStyle, boolean z12, OziBadgeSize oziBadgeSize, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        AbstractC8972b abstractC8972b2;
        int i15;
        OziBadgeStyle oziBadgeStyle2;
        int i16;
        boolean z13;
        int i17;
        OziBadgeSize oziBadgeSize2;
        OziBadgeSize oziBadgeSize3;
        boolean z14;
        int i18;
        int i19;
        int i21;
        T bodyAccent250Caption;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        OziBadgeSize oziBadgeSize4;
        C3969l c3969l;
        int i32;
        C3969l c3969l2;
        AbstractC8972b abstractC8972b3;
        OziBadgeStyle oziBadgeStyle3;
        boolean z15;
        e eVar3;
        OziBadgeSize oziBadgeSize5;
        J0 m02;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-2081734055);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(label) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.p(z11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i33 = i12 & 8;
        if (i33 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                abstractC8972b2 = abstractC8972b;
                i13 |= u11.n(abstractC8972b2) ? 16384 : 8192;
                i15 = i12 & 32;
                if (i15 != 0) {
                    i13 |= 196608;
                    oziBadgeStyle2 = oziBadgeStyle;
                } else {
                    oziBadgeStyle2 = oziBadgeStyle;
                    if ((i11 & 196608) == 0) {
                        i13 |= u11.n(oziBadgeStyle2) ? 131072 : 65536;
                    }
                }
                i16 = i12 & 64;
                if (i16 != 0) {
                    i13 |= 1572864;
                    z13 = z12;
                } else {
                    z13 = z12;
                    if ((i11 & 1572864) == 0) {
                        i13 |= u11.p(z13) ? 1048576 : 524288;
                    }
                }
                i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i17 != 0) {
                    i13 |= 12582912;
                    oziBadgeSize2 = oziBadgeSize;
                } else {
                    oziBadgeSize2 = oziBadgeSize;
                    if ((i11 & 12582912) == 0) {
                        i13 |= u11.n(oziBadgeSize2) ? 8388608 : 4194304;
                    }
                }
                if ((i13 & 4793491) == 4793490 || !u11.b()) {
                    if (i33 != 0) {
                        eVar2 = e.f40358c0;
                    }
                    if (i14 != 0) {
                        abstractC8972b2 = null;
                    }
                    OziBadgeStyle oziBadgeStyle4 = i15 != 0 ? OziBadgeStyle.NeutralSecondary.INSTANCE : oziBadgeStyle2;
                    boolean z16 = i16 != 0 ? false : z13;
                    oziBadgeSize3 = i17 != 0 ? OziBadgeSize.Size500 : oziBadgeSize2;
                    z14 = (z11 || oziBadgeSize3 == OziBadgeSize.Size300) ? false : true;
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    i18 = iArr[oziBadgeSize3.ordinal()];
                    if (i18 == 1) {
                        i19 = 16;
                    } else if (i18 == 2) {
                        i19 = 20;
                    } else if (i18 == 3) {
                        i19 = 24;
                    } else {
                        if (i18 != 4) {
                            throw new o();
                        }
                        i19 = 32;
                    }
                    float f7 = i19;
                    OziTheme oziTheme = OziTheme.INSTANCE;
                    OziTypography typography = oziTheme.getTypography();
                    i21 = iArr[oziBadgeSize3.ordinal()];
                    if (i21 == 1) {
                        bodyAccent250Caption = typography.getBodyAccent250Caption();
                    } else if (i21 == 2) {
                        bodyAccent250Caption = z16 ? typography.getBodyNumeric300() : typography.getBodyControl300();
                    } else if (i21 == 3) {
                        bodyAccent250Caption = z16 ? typography.getBodyNumeric400() : typography.getBodyControl400();
                    } else {
                        if (i21 != 4) {
                            throw new o();
                        }
                        bodyAccent250Caption = z16 ? typography.getBodyNumeric500() : typography.getBodyControl500();
                    }
                    i22 = iArr[oziBadgeSize3.ordinal()];
                    if (i22 == 1) {
                        i23 = abstractC8972b2 != null ? 3 : 5;
                    } else if (i22 != 2) {
                        if (i22 != 3) {
                            if (i22 != 4) {
                                throw new o();
                            }
                            if (abstractC8972b2 == null) {
                                i23 = 12;
                            }
                        }
                        i23 = 8;
                    } else {
                        if (abstractC8972b2 != null) {
                            i23 = 4;
                        }
                        i23 = 6;
                    }
                    float f11 = i23;
                    if (z14) {
                        int i34 = iArr[oziBadgeSize3.ordinal()];
                        if (i34 == 1) {
                            throw new IllegalStateException("Unreachable");
                        }
                        if (i34 == 2 || i34 == 3) {
                            i24 = 2;
                        } else {
                            if (i34 != 4) {
                                throw new o();
                            }
                            i24 = 4;
                        }
                    } else {
                        int i35 = iArr[oziBadgeSize3.ordinal()];
                        if (i35 == 1) {
                            i24 = 5;
                        } else if (i35 == 2) {
                            i24 = 6;
                        } else if (i35 == 3) {
                            i24 = 8;
                        } else {
                            if (i35 != 4) {
                                throw new o();
                            }
                            i24 = 12;
                        }
                    }
                    float f12 = i24;
                    i25 = iArr[oziBadgeSize3.ordinal()];
                    T t2 = bodyAccent250Caption;
                    if (i25 == 1) {
                        i26 = -1;
                    } else if (i25 == 2 || i25 == 3) {
                        i26 = 2;
                    } else {
                        if (i25 != 4) {
                            throw new o();
                        }
                        i26 = 4;
                    }
                    float f13 = i26;
                    i27 = iArr[oziBadgeSize3.ordinal()];
                    if (i27 == 1) {
                        i28 = 5;
                    } else if (i27 == 2) {
                        i28 = 6;
                    } else if (i27 == 3) {
                        i28 = 8;
                    } else {
                        if (i27 != 4) {
                            throw new o();
                        }
                        i28 = 12;
                    }
                    float f14 = i28;
                    i29 = iArr[oziBadgeSize3.ordinal()];
                    if (i29 != 1 || i29 == 2) {
                        i31 = 2;
                    } else if (i29 != 3) {
                        i31 = 4;
                        if (i29 != 4) {
                            throw new o();
                        }
                    } else {
                        i31 = 4;
                    }
                    float f15 = i31;
                    e eVar4 = eVar2;
                    e oziTestTag = OziTestTagsKt.oziTestTag(eVar4, OziBadgeTestTags.Container, null, u11, ((i13 >> 9) & 14) | 48, 2);
                    e.a aVar = e.f40358c0;
                    e oziTestTag2 = OziTestTagsKt.oziTestTag(aVar, OziBadgeTestTags.Label, null, u11, 54, 2);
                    e oziTestTag3 = OziTestTagsKt.oziTestTag(aVar, OziBadgeTestTags.StartGraphic, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b2, OziBadgeTestTags.INSTANCE.getStartGraphicName()), u11, 54, 0);
                    e oziTestTag4 = OziTestTagsKt.oziTestTag(aVar, OziBadgeTestTags.Chevron, null, u11, 54, 2);
                    AbstractC7799Q value = DeferredBrush.getValue(oziBadgeStyle4.getBackgroundDefBrush(), u11, 0);
                    oziTheme.getIcons();
                    u11.B(-886331929);
                    AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                    u11.K();
                    long value2 = DeferredColor.getValue(oziBadgeStyle4.getStartGraphicDefColor(), u11, 0);
                    long value3 = DeferredColor.getValue(oziBadgeStyle4.getLabelDefColor(), u11, 0);
                    long value4 = DeferredColor.getValue(oziBadgeStyle4.getEndGraphicDefColor(), u11, 0);
                    float f16 = oziBadgeSize3 == OziBadgeSize.Size400 ? 0 : 2;
                    oziBadgeSize4 = OziBadgeSize.Size300;
                    if (oziBadgeSize3 == oziBadgeSize4) {
                        c3969l = u11;
                        i32 = 12;
                    } else {
                        c3969l = u11;
                        i32 = 16;
                    }
                    int i36 = i13;
                    AbstractC8972b abstractC8972b4 = abstractC8972b2;
                    c3969l2 = c3969l;
                    FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(oziTestTag, oziTestTag2, oziTestTag3, oziTestTag4, f7, f14, f14, f14, f14, value, onClick, z14, abstractC8972b4, uniPainterResource, value2, value3, label, t2, value4, f15, f16, i32, new C9915y(f11, oziBadgeSize3 == oziBadgeSize4 ? (float) 1.5d : f13, f12, oziBadgeSize3 == oziBadgeSize4 ? (float) 0.5d : f13), oziBadgeSize3 == oziBadgeSize4, c3969l2, 0, ((i36 >> 6) & 910) | ((i36 << 18) & 3670016), 0, 0);
                    abstractC8972b3 = abstractC8972b4;
                    oziBadgeStyle3 = oziBadgeStyle4;
                    z15 = z16;
                    eVar3 = eVar4;
                    oziBadgeSize5 = oziBadgeSize3;
                } else {
                    u11.j();
                    c3969l2 = u11;
                    oziBadgeSize5 = oziBadgeSize2;
                    z15 = z13;
                    oziBadgeStyle3 = oziBadgeStyle2;
                    eVar3 = eVar2;
                    abstractC8972b3 = abstractC8972b2;
                }
                m02 = c3969l2.m0();
                if (m02 != null) {
                    m02.G(new OziBadgeKt$OziBadgeImpl$1(label, z11, onClick, eVar3, abstractC8972b3, oziBadgeStyle3, z15, oziBadgeSize5, i11, i12));
                    return;
                }
                return;
            }
            abstractC8972b2 = abstractC8972b;
            i15 = i12 & 32;
            if (i15 != 0) {
            }
            i16 = i12 & 64;
            if (i16 != 0) {
            }
            i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i17 != 0) {
            }
            if ((i13 & 4793491) == 4793490) {
            }
            if (i33 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (z11) {
            }
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            i18 = iArr2[oziBadgeSize3.ordinal()];
            if (i18 == 1) {
            }
            float f72 = i19;
            OziTheme oziTheme2 = OziTheme.INSTANCE;
            OziTypography typography2 = oziTheme2.getTypography();
            i21 = iArr2[oziBadgeSize3.ordinal()];
            if (i21 == 1) {
            }
            i22 = iArr2[oziBadgeSize3.ordinal()];
            if (i22 == 1) {
            }
            float f112 = i23;
            if (z14) {
            }
            float f122 = i24;
            i25 = iArr2[oziBadgeSize3.ordinal()];
            T t22 = bodyAccent250Caption;
            if (i25 == 1) {
            }
            float f132 = i26;
            i27 = iArr2[oziBadgeSize3.ordinal()];
            if (i27 == 1) {
            }
            float f142 = i28;
            i29 = iArr2[oziBadgeSize3.ordinal()];
            if (i29 != 1) {
            }
            i31 = 2;
            float f152 = i31;
            e eVar42 = eVar2;
            e oziTestTag5 = OziTestTagsKt.oziTestTag(eVar42, OziBadgeTestTags.Container, null, u11, ((i13 >> 9) & 14) | 48, 2);
            e.a aVar2 = e.f40358c0;
            e oziTestTag22 = OziTestTagsKt.oziTestTag(aVar2, OziBadgeTestTags.Label, null, u11, 54, 2);
            e oziTestTag32 = OziTestTagsKt.oziTestTag(aVar2, OziBadgeTestTags.StartGraphic, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b2, OziBadgeTestTags.INSTANCE.getStartGraphicName()), u11, 54, 0);
            e oziTestTag42 = OziTestTagsKt.oziTestTag(aVar2, OziBadgeTestTags.Chevron, null, u11, 54, 2);
            AbstractC7799Q value5 = DeferredBrush.getValue(oziBadgeStyle4.getBackgroundDefBrush(), u11, 0);
            oziTheme2.getIcons();
            u11.B(-886331929);
            AbstractC8972b uniPainterResource2 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
            u11.K();
            long value22 = DeferredColor.getValue(oziBadgeStyle4.getStartGraphicDefColor(), u11, 0);
            long value32 = DeferredColor.getValue(oziBadgeStyle4.getLabelDefColor(), u11, 0);
            long value42 = DeferredColor.getValue(oziBadgeStyle4.getEndGraphicDefColor(), u11, 0);
            if (oziBadgeSize3 == OziBadgeSize.Size400) {
            }
            oziBadgeSize4 = OziBadgeSize.Size300;
            if (oziBadgeSize3 == oziBadgeSize4) {
            }
            int i362 = i13;
            AbstractC8972b abstractC8972b42 = abstractC8972b2;
            c3969l2 = c3969l;
            FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(oziTestTag5, oziTestTag22, oziTestTag32, oziTestTag42, f72, f142, f142, f142, f142, value5, onClick, z14, abstractC8972b42, uniPainterResource2, value22, value32, label, t22, value42, f152, f16, i32, new C9915y(f112, oziBadgeSize3 == oziBadgeSize4 ? (float) 1.5d : f132, f122, oziBadgeSize3 == oziBadgeSize4 ? (float) 0.5d : f132), oziBadgeSize3 == oziBadgeSize4, c3969l2, 0, ((i362 >> 6) & 910) | ((i362 << 18) & 3670016), 0, 0);
            abstractC8972b3 = abstractC8972b42;
            oziBadgeStyle3 = oziBadgeStyle4;
            z15 = z16;
            eVar3 = eVar42;
            oziBadgeSize5 = oziBadgeSize3;
            m02 = c3969l2.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        abstractC8972b2 = abstractC8972b;
        i15 = i12 & 32;
        if (i15 != 0) {
        }
        i16 = i12 & 64;
        if (i16 != 0) {
        }
        i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 != 0) {
        }
        if ((i13 & 4793491) == 4793490) {
        }
        if (i33 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (z11) {
        }
        int[] iArr22 = WhenMappings.$EnumSwitchMapping$0;
        i18 = iArr22[oziBadgeSize3.ordinal()];
        if (i18 == 1) {
        }
        float f722 = i19;
        OziTheme oziTheme22 = OziTheme.INSTANCE;
        OziTypography typography22 = oziTheme22.getTypography();
        i21 = iArr22[oziBadgeSize3.ordinal()];
        if (i21 == 1) {
        }
        i22 = iArr22[oziBadgeSize3.ordinal()];
        if (i22 == 1) {
        }
        float f1122 = i23;
        if (z14) {
        }
        float f1222 = i24;
        i25 = iArr22[oziBadgeSize3.ordinal()];
        T t222 = bodyAccent250Caption;
        if (i25 == 1) {
        }
        float f1322 = i26;
        i27 = iArr22[oziBadgeSize3.ordinal()];
        if (i27 == 1) {
        }
        float f1422 = i28;
        i29 = iArr22[oziBadgeSize3.ordinal()];
        if (i29 != 1) {
        }
        i31 = 2;
        float f1522 = i31;
        e eVar422 = eVar2;
        e oziTestTag52 = OziTestTagsKt.oziTestTag(eVar422, OziBadgeTestTags.Container, null, u11, ((i13 >> 9) & 14) | 48, 2);
        e.a aVar22 = e.f40358c0;
        e oziTestTag222 = OziTestTagsKt.oziTestTag(aVar22, OziBadgeTestTags.Label, null, u11, 54, 2);
        e oziTestTag322 = OziTestTagsKt.oziTestTag(aVar22, OziBadgeTestTags.StartGraphic, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b2, OziBadgeTestTags.INSTANCE.getStartGraphicName()), u11, 54, 0);
        e oziTestTag422 = OziTestTagsKt.oziTestTag(aVar22, OziBadgeTestTags.Chevron, null, u11, 54, 2);
        AbstractC7799Q value52 = DeferredBrush.getValue(oziBadgeStyle4.getBackgroundDefBrush(), u11, 0);
        oziTheme22.getIcons();
        u11.B(-886331929);
        AbstractC8972b uniPainterResource22 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
        u11.K();
        long value222 = DeferredColor.getValue(oziBadgeStyle4.getStartGraphicDefColor(), u11, 0);
        long value322 = DeferredColor.getValue(oziBadgeStyle4.getLabelDefColor(), u11, 0);
        long value422 = DeferredColor.getValue(oziBadgeStyle4.getEndGraphicDefColor(), u11, 0);
        if (oziBadgeSize3 == OziBadgeSize.Size400) {
        }
        oziBadgeSize4 = OziBadgeSize.Size300;
        if (oziBadgeSize3 == oziBadgeSize4) {
        }
        int i3622 = i13;
        AbstractC8972b abstractC8972b422 = abstractC8972b2;
        c3969l2 = c3969l;
        FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(oziTestTag52, oziTestTag222, oziTestTag322, oziTestTag422, f722, f1422, f1422, f1422, f1422, value52, onClick, z14, abstractC8972b422, uniPainterResource22, value222, value322, label, t222, value422, f1522, f16, i32, new C9915y(f1122, oziBadgeSize3 == oziBadgeSize4 ? (float) 1.5d : f1322, f1222, oziBadgeSize3 == oziBadgeSize4 ? (float) 0.5d : f1322), oziBadgeSize3 == oziBadgeSize4, c3969l2, 0, ((i3622 >> 6) & 910) | ((i3622 << 18) & 3670016), 0, 0);
        abstractC8972b3 = abstractC8972b422;
        oziBadgeStyle3 = oziBadgeStyle4;
        z15 = z16;
        eVar3 = eVar422;
        oziBadgeSize5 = oziBadgeSize3;
        m02 = c3969l2.m0();
        if (m02 != null) {
        }
    }
}
