package ru.ozon.uni.components.disclaimer;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import K00.b;
import K1.C3422b;
import S0.A0;
import S0.A1;
import S0.C3956f1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.J0;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import fd.InterfaceC6511n;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l0.h0;
import l1.C7807Z;
import l1.y0;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.components.disclaimer.UniDisclaimerTheme;
import ru.ozon.uni.components.disclaimer.addons.UniDisclaimerAdditionalButtonScope;
import ru.ozon.uni.components.disclaimer.addons.UniDisclaimerMainButtonScope;
import ru.ozon.uni.components.iconButton.UniIconButtonColors;
import ru.ozon.uni.components.iconButton.UniIconButtonKt;
import ru.ozon.uni.components.iconButton.UniIconButtonStyle;
import ru.ozon.uni.components.text.UniTextKt;
import ru.ozon.uni.components.text.UniTextPreset;
import ru.ozon.uni.components.text.UniTextResizing;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.utils.AnimationFactory;
import ru.ozon.uni.foundation.utils.SpacersKt;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.PainterUtilsKt;
import ru.ozon.uni.utils.UniTestTagsKt;
import t0.p;
import t0.q;
import t0.u;
import u0.C9891D;
import u0.C9896e;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÇ\u0001\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%²\u0006\u000e\u0010!\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "LK1/b;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "style", "", "hasIcon", "Lq1/b;", "icon", "", "titleLinesLimit", "subtitleLinesLimit", "Lkotlin/Function1;", "Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerMainButtonScope;", "", "mainButton", "Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerAdditionalButtonScope;", "additionalButton", "Lkotlin/Function0;", "onCloseButtonClick", "onClick", "tagSupported", "UniDisclaimer", "(Landroidx/compose/ui/e;LK1/b;LK1/b;Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;ZLq1/b;Ljava/lang/Integer;Ljava/lang/Integer;Lfd/n;Lfd/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLS0/k;III)V", "UniDisclaimerCloseButton", "(Lkotlin/jvm/functions/Function0;LS0/k;I)V", "UniDisclaimerChevron", "(LS0/k;I)V", "LZ1/h;", "BG_CORNER_RADIUS", "F", "textLinesCount", "isPressed", "Ll1/Z;", "backgroundColor", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniDisclaimerKt {
    private static final float BG_CORNER_RADIUS = 16;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029e  */
    /* JADX WARN: Type inference failed for: r37v3, types: [int] */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniDisclaimer(e eVar, C3422b c3422b, C3422b c3422b2, UniDisclaimerTheme uniDisclaimerTheme, boolean z11, AbstractC8972b abstractC8972b, Integer num, Integer num2, InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, Function0<Unit> function0, Function0<Unit> function02, boolean z12, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        C3422b c3422b3;
        int i15;
        int i16;
        int i17;
        C3422b c3422b4;
        int i18;
        boolean z13;
        UniDisclaimerTheme uniDisclaimerTheme2;
        int i19;
        boolean z14;
        int i21;
        int i22;
        Integer num3;
        int i23;
        Integer num4;
        int i24;
        InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        e eVar2;
        boolean z15;
        AbstractC8972b abstractC8972b2;
        InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n4;
        C3422b c3422b5;
        InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n5;
        Integer num5;
        Function0<Unit> function03;
        C3422b c3422b6;
        Function0<Unit> function04;
        UniDisclaimerTheme uniDisclaimerTheme3;
        boolean z16;
        int i34;
        Integer num6;
        AbstractC8972b abstractC8972b3;
        e eVar3;
        int i35;
        J0 m02;
        A1 a12;
        boolean z17;
        e eVar4;
        Function0<Unit> function05;
        e eVar5;
        e eVar6;
        e eVar7;
        e b11;
        e eVar8;
        int i36;
        float f7;
        float f11;
        InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n6;
        InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n7;
        AbstractC8972b abstractC8972b4;
        C3422b c3422b7;
        Integer num7;
        e eVar9;
        C3969l c3969l;
        boolean z18;
        Integer num8;
        Function0<Unit> function06;
        InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n8;
        InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n9;
        AbstractC8972b abstractC8972b5;
        UniDisclaimerTheme uniDisclaimerTheme4;
        C3969l u11 = interfaceC3967k.u(1891402308);
        int i37 = i13 & 1;
        if (i37 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = i11 | (u11.n(eVar) ? 4 : 2);
        } else {
            i14 = i11;
        }
        int i38 = i13 & 2;
        if (i38 != 0) {
            c3422b3 = c3422b;
            i16 = i14 | 48;
            i15 = 32;
        } else {
            c3422b3 = c3422b;
            i15 = 32;
            if ((i11 & 48) == 0) {
                i14 |= u11.n(c3422b3) ? 32 : 16;
            }
            i16 = i14;
        }
        int i39 = i13 & 4;
        if (i39 != 0) {
            i16 |= 384;
            i17 = 48;
        } else {
            i17 = 48;
            if ((i11 & 384) == 0) {
                c3422b4 = c3422b2;
                i16 |= u11.n(c3422b4) ? 256 : 128;
                i18 = i13 & 8;
                if (i18 == 0) {
                    i16 |= 3072;
                    z13 = true;
                } else {
                    z13 = true;
                    if ((i11 & 3072) == 0) {
                        uniDisclaimerTheme2 = uniDisclaimerTheme;
                        i16 |= u11.n(uniDisclaimerTheme2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                        i19 = i13 & 16;
                        if (i19 != 0) {
                            i16 |= 24576;
                        } else if ((i11 & 24576) == 0) {
                            z14 = z11;
                            i16 |= u11.p(z14) ? 16384 : 8192;
                            if ((i11 & 196608) == 0) {
                                i16 |= ((i13 & 32) == 0 && u11.n(abstractC8972b)) ? 131072 : 65536;
                            }
                            i21 = i13 & 64;
                            if (i21 == 0) {
                                i16 |= 1572864;
                                i22 = 6;
                                num3 = num;
                            } else {
                                i22 = 6;
                                num3 = num;
                                if ((i11 & 1572864) == 0) {
                                    i16 |= u11.n(num3) ? 1048576 : 524288;
                                }
                            }
                            i23 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i23 == 0) {
                                i16 |= 12582912;
                                num4 = num2;
                            } else {
                                num4 = num2;
                                if ((i11 & 12582912) == 0) {
                                    i16 |= u11.n(num4) ? 8388608 : 4194304;
                                }
                            }
                            i24 = i13 & 256;
                            if (i24 == 0) {
                                i16 |= 100663296;
                                interfaceC6511n3 = interfaceC6511n;
                            } else {
                                interfaceC6511n3 = interfaceC6511n;
                                if ((i11 & 100663296) == 0) {
                                    i16 |= u11.F(interfaceC6511n3) ? 67108864 : 33554432;
                                }
                            }
                            i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i25 == 0) {
                                i16 |= 805306368;
                                i26 = i25;
                            } else if ((i11 & 805306368) == 0) {
                                i26 = i25;
                                i16 |= u11.F(interfaceC6511n2) ? 536870912 : 268435456;
                            } else {
                                i26 = i25;
                            }
                            i27 = 1024 & i13;
                            if (i27 == 0) {
                                i29 = i12 | 6;
                                i28 = i27;
                            } else if ((i12 & 6) == 0) {
                                i28 = i27;
                                i29 = i12 | (u11.F(function0) ? 4 : 2);
                            } else {
                                i28 = i27;
                                i29 = i12;
                            }
                            i31 = 2048 & i13;
                            if (i31 == 0) {
                                i29 |= 48;
                                i32 = i31;
                            } else if ((i12 & 48) == 0) {
                                i32 = i31;
                                i29 |= u11.F(function02) ? i15 : 16;
                            } else {
                                i32 = i31;
                            }
                            int i41 = i29;
                            i33 = i13 & 4096;
                            if (i33 == 0) {
                                i41 |= 384;
                            } else if ((i12 & 384) == 0) {
                                i41 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                                if ((i16 & 306783379) != 306783378 && (i41 & 147) == 146 && u11.b()) {
                                    u11.j();
                                    eVar9 = eVar;
                                    num8 = num4;
                                    c3422b5 = c3422b3;
                                    c3422b7 = c3422b4;
                                    c3969l = u11;
                                    uniDisclaimerTheme4 = uniDisclaimerTheme2;
                                    abstractC8972b5 = abstractC8972b;
                                    interfaceC6511n9 = interfaceC6511n2;
                                    function06 = function02;
                                    z18 = z12;
                                    interfaceC6511n8 = interfaceC6511n3;
                                    num7 = num3;
                                    function03 = function0;
                                } else {
                                    u11.Q0();
                                    if ((i11 & 1) != 0 || u11.w0()) {
                                        e eVar10 = i37 != 0 ? e.f40358c0 : eVar;
                                        if (i38 != 0) {
                                            c3422b3 = null;
                                        }
                                        if (i39 != 0) {
                                            c3422b4 = null;
                                        }
                                        if (i18 != 0) {
                                            uniDisclaimerTheme2 = UniDisclaimerTheme.Neutral.INSTANCE;
                                        }
                                        if (i19 != 0) {
                                            z14 = z13;
                                        }
                                        if ((i13 & 32) != 0) {
                                            z15 = false;
                                            eVar2 = eVar10;
                                            abstractC8972b2 = TokensExtKt.getIcon(uniDisclaimerTheme2.getIcon(), u11, UniIconToken.$stable);
                                            i16 &= -458753;
                                        } else {
                                            eVar2 = eVar10;
                                            z15 = false;
                                            abstractC8972b2 = abstractC8972b;
                                        }
                                        if (i21 != 0) {
                                            num3 = null;
                                        }
                                        if (i23 != 0) {
                                            num4 = null;
                                        }
                                        if (i24 != 0) {
                                            interfaceC6511n3 = null;
                                        }
                                        C3422b c3422b8 = c3422b4;
                                        interfaceC6511n4 = i26 != 0 ? null : interfaceC6511n2;
                                        c3422b5 = c3422b3;
                                        interfaceC6511n5 = interfaceC6511n3;
                                        num5 = num3;
                                        function03 = i28 != 0 ? null : function0;
                                        c3422b6 = c3422b8;
                                        UniDisclaimerTheme uniDisclaimerTheme5 = uniDisclaimerTheme2;
                                        function04 = i32 != 0 ? null : function02;
                                        uniDisclaimerTheme3 = uniDisclaimerTheme5;
                                        if (i33 != 0) {
                                            i34 = i16;
                                            z16 = z15 ? 1 : 0;
                                        } else {
                                            z16 = z12;
                                            i34 = i16;
                                        }
                                        num6 = num4;
                                        abstractC8972b3 = abstractC8972b2;
                                        eVar3 = eVar2;
                                        i35 = z15;
                                    } else {
                                        u11.j();
                                        if ((i13 & 32) != 0) {
                                            i16 &= -458753;
                                        }
                                        eVar3 = eVar;
                                        z16 = z12;
                                        i34 = i16;
                                        c3422b5 = c3422b3;
                                        c3422b6 = c3422b4;
                                        uniDisclaimerTheme3 = uniDisclaimerTheme2;
                                        i35 = 0;
                                        interfaceC6511n4 = interfaceC6511n2;
                                        function04 = function02;
                                        num6 = num4;
                                        interfaceC6511n5 = interfaceC6511n3;
                                        num5 = num3;
                                        abstractC8972b3 = abstractC8972b;
                                        function03 = function0;
                                    }
                                    u11.j0();
                                    boolean z19 = function04 != null ? z13 : i35;
                                    if ((c3422b5 != null || h.K(c3422b5)) && (c3422b6 == null || h.K(c3422b6))) {
                                        e eVar11 = eVar3;
                                        C3422b c3422b9 = c3422b6;
                                        UniDisclaimerTheme uniDisclaimerTheme6 = uniDisclaimerTheme3;
                                        boolean z21 = z14;
                                        AbstractC8972b abstractC8972b6 = abstractC8972b3;
                                        Integer num9 = num5;
                                        Integer num10 = num6;
                                        InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n10 = interfaceC6511n5;
                                        InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n11 = interfaceC6511n4;
                                        Function0<Unit> function07 = function04;
                                        m02 = u11.m0();
                                        if (m02 != null) {
                                            m02.G(new UniDisclaimerKt$UniDisclaimer$1(eVar11, c3422b5, c3422b9, uniDisclaimerTheme6, z21, abstractC8972b6, num9, num10, interfaceC6511n10, interfaceC6511n11, function03, function07, z16, i11, i12, i13));
                                            return;
                                        }
                                        return;
                                    }
                                    int i42 = i41;
                                    u11.o(890940570);
                                    Object C11 = u11.C();
                                    C3422b c3422b10 = c3422b6;
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = C3956f1.a(i35);
                                        u11.x(C11);
                                    }
                                    InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
                                    Object b12 = Pk0.h.b(u11, 890942560);
                                    UniDisclaimerTheme uniDisclaimerTheme7 = uniDisclaimerTheme3;
                                    if (b12 == InterfaceC3967k.a.a()) {
                                        b12 = p.a();
                                        u11.x(b12);
                                    }
                                    q qVar = (q) b12;
                                    u11.k();
                                    A1 a11 = h0.a(DeferredColor.getValue(UniDisclaimer$lambda$4(u.a(qVar, u11, i22)) ? uniDisclaimerTheme7.getActiveBackgroundColor() : uniDisclaimerTheme7.getBackgroundColor(), u11, i35), AnimationFactory.INSTANCE.easeInOutCircColor$uni_release(), null, u11, 0, 12);
                                    C3969l c3969l2 = u11;
                                    e eVar12 = e.f40358c0;
                                    if (z14) {
                                        a12 = a11;
                                        z17 = z14;
                                        eVar4 = eVar12;
                                    } else {
                                        a12 = a11;
                                        z17 = z14;
                                        eVar12 = T.j(eVar12, 4, 0.0f, 0.0f, 0.0f, 14);
                                        eVar4 = eVar12;
                                    }
                                    if (z19) {
                                        Intrinsics.f(function04);
                                        e eVar13 = eVar4;
                                        Function0<Unit> function08 = function04;
                                        eVar5 = eVar13;
                                        function05 = function08;
                                        eVar7 = eVar3.l0(i.b(eVar13, qVar, null, true, null, null, function08, 24));
                                        eVar6 = eVar3;
                                    } else {
                                        function05 = function04;
                                        eVar5 = eVar4;
                                        eVar6 = eVar3;
                                        eVar7 = eVar6;
                                    }
                                    e a13 = C6988h.a(a0.e(eVar7, 1.0f), A0.h.b(BG_CORNER_RADIUS));
                                    Integer num11 = num5;
                                    Integer num12 = num6;
                                    b11 = androidx.compose.foundation.e.b(a13, UniDisclaimer$lambda$5(a12), y0.a());
                                    float f12 = 12;
                                    if (function03 != null) {
                                        eVar8 = b11;
                                        i36 = 0;
                                        f7 = 0;
                                    } else {
                                        eVar8 = b11;
                                        i36 = 0;
                                        f7 = f12;
                                    }
                                    e j11 = T.j(eVar8, f12, 0.0f, f7, 0.0f, 10);
                                    Function0<Unit> function09 = function05;
                                    Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.l(), c3969l2, i36);
                                    int I11 = c3969l2.I();
                                    A0 d11 = c3969l2.d();
                                    e f13 = c.f(c3969l2, j11);
                                    Function0 a14 = g.a(InterfaceC2801g.f5440U, c3969l2);
                                    if (c3969l2.t()) {
                                        c3969l2.H(a14);
                                    } else {
                                        c3969l2.e();
                                    }
                                    Function2 h11 = Cm.e.h(c3969l2, b13, c3969l2, d11);
                                    if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I11))) {
                                        a.d(I11, c3969l2, I11, h11);
                                    }
                                    F1.b(c3969l2, f13, InterfaceC2801g.a.f());
                                    C9891D c9891d = C9891D.f99599a;
                                    c3969l2.o(-1872673708);
                                    if (!z17 || abstractC8972b3 == null) {
                                        f11 = f12;
                                        interfaceC6511n6 = interfaceC6511n5;
                                        interfaceC6511n7 = interfaceC6511n4;
                                    } else {
                                        e j12 = T.j(c9891d.b(eVar5, InterfaceC6250b.a.l()), 0.0f, f12, 8, f12, 1);
                                        f11 = f12;
                                        V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
                                        int I12 = c3969l2.I();
                                        interfaceC6511n6 = interfaceC6511n5;
                                        A0 d12 = c3969l2.d();
                                        e f15 = c.f(c3969l2, j12);
                                        interfaceC6511n7 = interfaceC6511n4;
                                        Function0 a15 = InterfaceC2801g.a.a();
                                        c3969l2.i();
                                        if (c3969l2.t()) {
                                            c3969l2.H(a15);
                                        } else {
                                            c3969l2.e();
                                        }
                                        Function2 f16 = E.f(c3969l2, f14, c3969l2, d12);
                                        if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I12))) {
                                            a.d(I12, c3969l2, I12, f16);
                                        }
                                        F1.b(c3969l2, f15, InterfaceC2801g.a.f());
                                        e uniTestTag = UniTestTagsKt.uniTestTag(a0.n(eVar5, 24), UniDisclaimerTestTags.Icon, null, c3969l2, 54, 2);
                                        P9.a.b(uniTestTag, "disclaimerIcon");
                                        T0.a(abstractC8972b3, null, uniTestTag, PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniDisclaimerTheme7.getIconColor(), c3969l2, 0), abstractC8972b3), c3969l2, ((i34 >> 15) & 14) | 48);
                                        c3969l2.f();
                                    }
                                    c3969l2.k();
                                    boolean z22 = z13;
                                    e h12 = T.h(c9891d.a(eVar5, 1.0f, z22), 0.0f, f11, z22 ? 1 : 0);
                                    C5194q a16 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l2, 0);
                                    int I13 = c3969l2.I();
                                    A0 d13 = c3969l2.d();
                                    e f17 = c.f(c3969l2, h12);
                                    Function0 a17 = InterfaceC2801g.a.a();
                                    c3969l2.i();
                                    if (c3969l2.t()) {
                                        c3969l2.H(a17);
                                    } else {
                                        c3969l2.e();
                                    }
                                    Function2 g10 = b.g(c3969l2, a16, c3969l2, d13);
                                    if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I13))) {
                                        a.d(I13, c3969l2, I13, g10);
                                    }
                                    F1.b(c3969l2, f17, InterfaceC2801g.a.f());
                                    C9896e c9896e = C9896e.f99653a;
                                    c3969l2.o(-1037437075);
                                    if (c3422b5 == null) {
                                        abstractC8972b4 = abstractC8972b3;
                                    } else {
                                        e e11 = a0.e(eVar5, 1.0f);
                                        Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l2, i17);
                                        int I14 = c3969l2.I();
                                        A0 d14 = c3969l2.d();
                                        e f18 = c.f(c3969l2, e11);
                                        abstractC8972b4 = abstractC8972b3;
                                        Function0 a18 = InterfaceC2801g.a.a();
                                        c3969l2.i();
                                        if (c3969l2.t()) {
                                            c3969l2.H(a18);
                                        } else {
                                            c3969l2.e();
                                        }
                                        Function2 h13 = Cm.e.h(c3969l2, b14, c3969l2, d14);
                                        if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I14))) {
                                            a.d(I14, c3969l2, I14, h13);
                                        }
                                        F1.b(c3969l2, f18, InterfaceC2801g.a.f());
                                        C3422b c3422b11 = z16 ? c3422b5 : new C3422b(6, c3422b5.toString(), null);
                                        UniTheme uniTheme = UniTheme.INSTANCE;
                                        UniTextPreset.Custom custom = new UniTextPreset.Custom(uniTheme.getTypography().getCompactControl500Medium(), 0L, 0.0f, 0.0f, false, 30, null);
                                        long textPrimary = uniTheme.getColors(c3969l2, UniTheme.$stable).getTextPrimary();
                                        int intValue = num11 != null ? num11.intValue() : z19 ? 1 : Integer.MAX_VALUE;
                                        UniTextResizing uniTextResizing = UniTextResizing.Hug;
                                        e uniTestTag2 = UniTestTagsKt.uniTestTag(T.h(c9891d.a(eVar12, 1.0f, false), 0.0f, 2, 1), UniDisclaimerTestTags.Title, null, c3969l2, 48, 2);
                                        P9.a.b(uniTestTag2, "disclaimerTitle");
                                        c3969l2.o(309888566);
                                        Object C12 = c3969l2.C();
                                        if (C12 == InterfaceC3967k.a.a()) {
                                            C12 = new UniDisclaimerKt$UniDisclaimer$2$2$1$1$1$1(interfaceC3972m0);
                                            c3969l2.x(C12);
                                        }
                                        c3969l2.k();
                                        UniTextKt.m1949UniText6P7A1Ok(c3422b11, uniTestTag2, custom, 0, uniTextResizing, 0.0f, 0.0f, 0, textPrimary, intValue, false, (Function1) C12, c3969l2, 24576, 48, 1256);
                                        c3969l2 = c3969l2;
                                        c3969l2.o(309902035);
                                        if (z19 && interfaceC3972m0.getIntValue() == 1) {
                                            UniDisclaimerChevron(c3969l2, 0);
                                        }
                                        c3969l2.k();
                                        c3969l2.f();
                                        Unit unit = Unit.f71690a;
                                    }
                                    c3969l2.k();
                                    c3969l2.o(-1037400717);
                                    if (c3422b10 != null) {
                                        e e12 = a0.e(eVar5, 1.0f);
                                        Y b15 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l2, 48);
                                        int I15 = c3969l2.I();
                                        A0 d15 = c3969l2.d();
                                        e f19 = c.f(c3969l2, e12);
                                        Function0 a19 = InterfaceC2801g.a.a();
                                        c3969l2.i();
                                        if (c3969l2.t()) {
                                            c3969l2.H(a19);
                                        } else {
                                            c3969l2.e();
                                        }
                                        Function2 h14 = Cm.e.h(c3969l2, b15, c3969l2, d15);
                                        if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I15))) {
                                            a.d(I15, c3969l2, I15, h14);
                                        }
                                        F1.b(c3969l2, f19, InterfaceC2801g.a.f());
                                        C3422b c3422b12 = z16 ? c3422b10 : new C3422b(6, c3422b10.toString(), null);
                                        UniTheme uniTheme2 = UniTheme.INSTANCE;
                                        UniTextPreset.Custom custom2 = new UniTextPreset.Custom(uniTheme2.getTypography().getBody450Small(), 0L, 0.0f, 0.0f, false, 30, null);
                                        long textSecondary = uniTheme2.getColors(c3969l2, UniTheme.$stable).getTextSecondary();
                                        int intValue2 = num12 != null ? num12.intValue() : (z19 && c3422b5 == null) ? 1 : Integer.MAX_VALUE;
                                        UniTextResizing uniTextResizing2 = UniTextResizing.Hug;
                                        e a21 = c9891d.a(eVar12, 1.0f, false);
                                        if (c3422b5 == null) {
                                            a21 = a21.l0(T.j(eVar5, 0.0f, 2, 0.0f, 0.0f, 13));
                                        }
                                        e uniTestTag3 = UniTestTagsKt.uniTestTag(a21, UniDisclaimerTestTags.Subtitle, null, c3969l2, 48, 2);
                                        P9.a.b(uniTestTag3, "subtitle");
                                        c3969l2.o(309925417);
                                        boolean z23 = (i34 & 112) == i15;
                                        Object C13 = c3969l2.C();
                                        if (z23 || C13 == InterfaceC3967k.a.a()) {
                                            C13 = new UniDisclaimerKt$UniDisclaimer$2$2$2$1$2$1(c3422b5, interfaceC3972m0);
                                            c3969l2.x(C13);
                                        }
                                        c3969l2.k();
                                        UniTextKt.m1949UniText6P7A1Ok(c3422b12, uniTestTag3, custom2, 0, uniTextResizing2, 0.0f, 0.0f, 0, textSecondary, intValue2, false, (Function1) C13, c3969l2, 24576, 0, 1256);
                                        c3969l2.o(309940036);
                                        if (c3422b5 == null && z19 && interfaceC3972m0.getIntValue() == 1) {
                                            UniDisclaimerChevron(c3969l2, 0);
                                        }
                                        c3969l2.k();
                                        c3969l2.f();
                                        Unit unit2 = Unit.f71690a;
                                    }
                                    c3969l2.k();
                                    SpacersKt.m3043SpacerHeightziNgDLE(c9896e, 2, c3969l2, 54);
                                    c3969l2.o(-1037361668);
                                    if (interfaceC6511n6 != null || interfaceC6511n7 != null) {
                                        d.b i43 = InterfaceC6250b.a.i();
                                        float f21 = 8;
                                        C5179b.i n11 = C5179b.n(f21);
                                        e j13 = T.j(eVar5, 0.0f, f21, 0.0f, 0.0f, 13);
                                        Y b16 = X.b(n11, i43, c3969l2, 54);
                                        int I16 = c3969l2.I();
                                        A0 d16 = c3969l2.d();
                                        e f22 = c.f(c3969l2, j13);
                                        Function0 a22 = InterfaceC2801g.a.a();
                                        c3969l2.i();
                                        if (c3969l2.t()) {
                                            c3969l2.H(a22);
                                        } else {
                                            c3969l2.e();
                                        }
                                        Function2 h15 = Cm.e.h(c3969l2, b16, c3969l2, d16);
                                        if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I16))) {
                                            a.d(I16, c3969l2, I16, h15);
                                        }
                                        U7.i.b(c3969l2, f22, -2056549448);
                                        if (interfaceC6511n6 != null) {
                                            UniDisclaimerMainButtonScope.INSTANCE.getINSTANCE$uni_release().UniDisclaimerMainButtonContainer$uni_release(!z17 ? T.j(eVar5, 4, 0.0f, 0.0f, 0.0f, 14) : eVar5, interfaceC6511n6, c3969l2, ((i34 >> 21) & 112) | 384, 0);
                                            Unit unit3 = Unit.f71690a;
                                        }
                                        c3969l2.k();
                                        c3969l2.o(-2056538902);
                                        if (interfaceC6511n7 != null) {
                                            UniDisclaimerAdditionalButtonScope.INSTANCE.getINSTANCE$uni_release().UniDisclaimerAdditionalButtonContainer$uni_release(!z17 ? T.j(eVar5, 4, 0.0f, 0.0f, 0.0f, 14) : eVar5, interfaceC6511n7, c3969l2, ((i34 >> 24) & 112) | 384, 0);
                                            Unit unit4 = Unit.f71690a;
                                        }
                                        c3969l2.k();
                                        c3969l2.f();
                                    }
                                    c3969l2.k();
                                    c3969l2.f();
                                    if (z19 && interfaceC3972m0.getIntValue() > 1) {
                                        c3969l2.o(2080835099);
                                        e j14 = T.j(eVar5, 8, f11, 0.0f, 0.0f, 12);
                                        V f23 = C5185h.f(InterfaceC6250b.a.o(), false);
                                        int I17 = c3969l2.I();
                                        A0 d17 = c3969l2.d();
                                        e f24 = c.f(c3969l2, j14);
                                        Function0 a23 = InterfaceC2801g.a.a();
                                        c3969l2.i();
                                        if (c3969l2.t()) {
                                            c3969l2.H(a23);
                                        } else {
                                            c3969l2.e();
                                        }
                                        Function2 f25 = E.f(c3969l2, f23, c3969l2, d17);
                                        if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I17))) {
                                            a.d(I17, c3969l2, I17, f25);
                                        }
                                        F1.b(c3969l2, f24, InterfaceC2801g.a.f());
                                        UniDisclaimerChevron(c3969l2, 0);
                                        c3969l2.f();
                                        c3969l2.k();
                                    } else if (function03 != null) {
                                        c3969l2.o(2081031577);
                                        e f26 = T.f(eVar5, 8);
                                        c3969l2.o(-1872526945);
                                        Object C14 = c3969l2.C();
                                        if (C14 == InterfaceC3967k.a.a()) {
                                            C14 = p.a();
                                            c3969l2.x(C14);
                                        }
                                        c3969l2.k();
                                        e b17 = i.b(f26, (q) C14, null, false, null, I1.i.a(0), function03, 12);
                                        V f27 = C5185h.f(InterfaceC6250b.a.o(), false);
                                        int I18 = c3969l2.I();
                                        A0 d18 = c3969l2.d();
                                        e f28 = c.f(c3969l2, b17);
                                        Function0 a24 = InterfaceC2801g.a.a();
                                        c3969l2.i();
                                        if (c3969l2.t()) {
                                            c3969l2.H(a24);
                                        } else {
                                            c3969l2.e();
                                        }
                                        Function2 f29 = E.f(c3969l2, f27, c3969l2, d18);
                                        if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I18))) {
                                            a.d(I18, c3969l2, I18, f29);
                                        }
                                        F1.b(c3969l2, f28, InterfaceC2801g.a.f());
                                        UniDisclaimerCloseButton(function03, c3969l2, i42 & 14);
                                        c3969l2.f();
                                        c3969l2.k();
                                    } else {
                                        c3969l2.o(2081549866);
                                        c3969l2.k();
                                    }
                                    c3969l2.f();
                                    c3422b7 = c3422b10;
                                    num7 = num11;
                                    z14 = z17;
                                    eVar9 = eVar6;
                                    c3969l = c3969l2;
                                    z18 = z16;
                                    num8 = num12;
                                    function06 = function09;
                                    interfaceC6511n8 = interfaceC6511n6;
                                    interfaceC6511n9 = interfaceC6511n7;
                                    abstractC8972b5 = abstractC8972b4;
                                    uniDisclaimerTheme4 = uniDisclaimerTheme7;
                                }
                                J0 m03 = c3969l.m0();
                                if (m03 != null) {
                                    m03.G(new UniDisclaimerKt$UniDisclaimer$3(eVar9, c3422b5, c3422b7, uniDisclaimerTheme4, z14, abstractC8972b5, num7, num8, interfaceC6511n8, interfaceC6511n9, function03, function06, z18, i11, i12, i13));
                                    return;
                                }
                                return;
                            }
                            if ((i16 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i37 != 0) {
                            }
                            if (i38 != 0) {
                            }
                            if (i39 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if ((i13 & 32) != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            C3422b c3422b82 = c3422b4;
                            interfaceC6511n4 = i26 != 0 ? null : interfaceC6511n2;
                            c3422b5 = c3422b3;
                            interfaceC6511n5 = interfaceC6511n3;
                            num5 = num3;
                            function03 = i28 != 0 ? null : function0;
                            c3422b6 = c3422b82;
                            UniDisclaimerTheme uniDisclaimerTheme52 = uniDisclaimerTheme2;
                            function04 = i32 != 0 ? null : function02;
                            uniDisclaimerTheme3 = uniDisclaimerTheme52;
                            if (i33 != 0) {
                            }
                            num6 = num4;
                            abstractC8972b3 = abstractC8972b2;
                            eVar3 = eVar2;
                            i35 = z15;
                            u11.j0();
                            if (function04 != null) {
                            }
                            if (c3422b5 != null) {
                            }
                            e eVar112 = eVar3;
                            C3422b c3422b92 = c3422b6;
                            UniDisclaimerTheme uniDisclaimerTheme62 = uniDisclaimerTheme3;
                            boolean z212 = z14;
                            AbstractC8972b abstractC8972b62 = abstractC8972b3;
                            Integer num92 = num5;
                            Integer num102 = num6;
                            InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n102 = interfaceC6511n5;
                            InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n112 = interfaceC6511n4;
                            Function0<Unit> function072 = function04;
                            m02 = u11.m0();
                            if (m02 != null) {
                            }
                        }
                        z14 = z11;
                        if ((i11 & 196608) == 0) {
                        }
                        i21 = i13 & 64;
                        if (i21 == 0) {
                        }
                        i23 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i23 == 0) {
                        }
                        i24 = i13 & 256;
                        if (i24 == 0) {
                        }
                        i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i25 == 0) {
                        }
                        i27 = 1024 & i13;
                        if (i27 == 0) {
                        }
                        i31 = 2048 & i13;
                        if (i31 == 0) {
                        }
                        int i412 = i29;
                        i33 = i13 & 4096;
                        if (i33 == 0) {
                        }
                        if ((i16 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i37 != 0) {
                        }
                        if (i38 != 0) {
                        }
                        if (i39 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if ((i13 & 32) != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        C3422b c3422b822 = c3422b4;
                        interfaceC6511n4 = i26 != 0 ? null : interfaceC6511n2;
                        c3422b5 = c3422b3;
                        interfaceC6511n5 = interfaceC6511n3;
                        num5 = num3;
                        function03 = i28 != 0 ? null : function0;
                        c3422b6 = c3422b822;
                        UniDisclaimerTheme uniDisclaimerTheme522 = uniDisclaimerTheme2;
                        function04 = i32 != 0 ? null : function02;
                        uniDisclaimerTheme3 = uniDisclaimerTheme522;
                        if (i33 != 0) {
                        }
                        num6 = num4;
                        abstractC8972b3 = abstractC8972b2;
                        eVar3 = eVar2;
                        i35 = z15;
                        u11.j0();
                        if (function04 != null) {
                        }
                        if (c3422b5 != null) {
                        }
                        e eVar1122 = eVar3;
                        C3422b c3422b922 = c3422b6;
                        UniDisclaimerTheme uniDisclaimerTheme622 = uniDisclaimerTheme3;
                        boolean z2122 = z14;
                        AbstractC8972b abstractC8972b622 = abstractC8972b3;
                        Integer num922 = num5;
                        Integer num1022 = num6;
                        InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n1022 = interfaceC6511n5;
                        InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n1122 = interfaceC6511n4;
                        Function0<Unit> function0722 = function04;
                        m02 = u11.m0();
                        if (m02 != null) {
                        }
                    }
                }
                uniDisclaimerTheme2 = uniDisclaimerTheme;
                i19 = i13 & 16;
                if (i19 != 0) {
                }
                z14 = z11;
                if ((i11 & 196608) == 0) {
                }
                i21 = i13 & 64;
                if (i21 == 0) {
                }
                i23 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i23 == 0) {
                }
                i24 = i13 & 256;
                if (i24 == 0) {
                }
                i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i25 == 0) {
                }
                i27 = 1024 & i13;
                if (i27 == 0) {
                }
                i31 = 2048 & i13;
                if (i31 == 0) {
                }
                int i4122 = i29;
                i33 = i13 & 4096;
                if (i33 == 0) {
                }
                if ((i16 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i37 != 0) {
                }
                if (i38 != 0) {
                }
                if (i39 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if ((i13 & 32) != 0) {
                }
                if (i21 != 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                C3422b c3422b8222 = c3422b4;
                interfaceC6511n4 = i26 != 0 ? null : interfaceC6511n2;
                c3422b5 = c3422b3;
                interfaceC6511n5 = interfaceC6511n3;
                num5 = num3;
                function03 = i28 != 0 ? null : function0;
                c3422b6 = c3422b8222;
                UniDisclaimerTheme uniDisclaimerTheme5222 = uniDisclaimerTheme2;
                function04 = i32 != 0 ? null : function02;
                uniDisclaimerTheme3 = uniDisclaimerTheme5222;
                if (i33 != 0) {
                }
                num6 = num4;
                abstractC8972b3 = abstractC8972b2;
                eVar3 = eVar2;
                i35 = z15;
                u11.j0();
                if (function04 != null) {
                }
                if (c3422b5 != null) {
                }
                e eVar11222 = eVar3;
                C3422b c3422b9222 = c3422b6;
                UniDisclaimerTheme uniDisclaimerTheme6222 = uniDisclaimerTheme3;
                boolean z21222 = z14;
                AbstractC8972b abstractC8972b6222 = abstractC8972b3;
                Integer num9222 = num5;
                Integer num10222 = num6;
                InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n10222 = interfaceC6511n5;
                InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n11222 = interfaceC6511n4;
                Function0<Unit> function07222 = function04;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
        }
        c3422b4 = c3422b2;
        i18 = i13 & 8;
        if (i18 == 0) {
        }
        uniDisclaimerTheme2 = uniDisclaimerTheme;
        i19 = i13 & 16;
        if (i19 != 0) {
        }
        z14 = z11;
        if ((i11 & 196608) == 0) {
        }
        i21 = i13 & 64;
        if (i21 == 0) {
        }
        i23 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i23 == 0) {
        }
        i24 = i13 & 256;
        if (i24 == 0) {
        }
        i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i25 == 0) {
        }
        i27 = 1024 & i13;
        if (i27 == 0) {
        }
        i31 = 2048 & i13;
        if (i31 == 0) {
        }
        int i41222 = i29;
        i33 = i13 & 4096;
        if (i33 == 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i37 != 0) {
        }
        if (i38 != 0) {
        }
        if (i39 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if ((i13 & 32) != 0) {
        }
        if (i21 != 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        C3422b c3422b82222 = c3422b4;
        interfaceC6511n4 = i26 != 0 ? null : interfaceC6511n2;
        c3422b5 = c3422b3;
        interfaceC6511n5 = interfaceC6511n3;
        num5 = num3;
        function03 = i28 != 0 ? null : function0;
        c3422b6 = c3422b82222;
        UniDisclaimerTheme uniDisclaimerTheme52222 = uniDisclaimerTheme2;
        function04 = i32 != 0 ? null : function02;
        uniDisclaimerTheme3 = uniDisclaimerTheme52222;
        if (i33 != 0) {
        }
        num6 = num4;
        abstractC8972b3 = abstractC8972b2;
        eVar3 = eVar2;
        i35 = z15;
        u11.j0();
        if (function04 != null) {
        }
        if (c3422b5 != null) {
        }
        e eVar112222 = eVar3;
        C3422b c3422b92222 = c3422b6;
        UniDisclaimerTheme uniDisclaimerTheme62222 = uniDisclaimerTheme3;
        boolean z212222 = z14;
        AbstractC8972b abstractC8972b62222 = abstractC8972b3;
        Integer num92222 = num5;
        Integer num102222 = num6;
        InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n102222 = interfaceC6511n5;
        InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n112222 = interfaceC6511n4;
        Function0<Unit> function072222 = function04;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final boolean UniDisclaimer$lambda$4(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final long UniDisclaimer$lambda$5(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UniDisclaimerChevron(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(138406781);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            UniTheme uniTheme = UniTheme.INSTANCE;
            uniTheme.getIcons();
            u11.B(-886331929);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
            u11.K();
            long graphicTertiary = uniTheme.getColors(u11, UniTheme.$stable).getGraphicTertiary();
            e n11 = a0.n(T.j(e.f40358c0, 4, 0.0f, 0.0f, 0.0f, 14), 24);
            P9.a.b(n11, "chevron");
            T0.a(uniPainterResource, null, n11, graphicTertiary, u11, 432);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new UniDisclaimerKt$UniDisclaimerChevron$1(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UniDisclaimerCloseButton(Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j11;
        C3969l u11 = interfaceC3967k.u(1336877290);
        if ((i11 & 6) == 0) {
            i12 = i11 | (u11.F(function0) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            UniTheme uniTheme = UniTheme.INSTANCE;
            uniTheme.getIcons();
            u11.B(147133907);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_s_cross_filled_compact, "ic_s_cross_filled_compact", u11, 48);
            u11.K();
            int i13 = UniTheme.$stable;
            long clearLightKey0 = uniTheme.getColors(u11, i13).getClearLightKey0();
            long graphicTertiary = uniTheme.getColors(u11, i13).getGraphicTertiary();
            j11 = C7807Z.f72259m;
            UniIconButtonStyle.Custom custom = new UniIconButtonStyle.Custom(new UniIconButtonColors(clearLightKey0, graphicTertiary, j11, (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, null);
            e uniTestTag = UniTestTagsKt.uniTestTag(e.f40358c0, UniDisclaimerTestTags.CloseButton, null, u11, 54, 2);
            P9.a.b(uniTestTag, "closeButton");
            UniIconButtonKt.UniIconButton(uniPainterResource, custom, null, uniTestTag, null, null, false, false, true, true, function0, null, u11, 905969664, i12 & 14, 2292);
            u11 = u11;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new UniDisclaimerKt$UniDisclaimerCloseButton$1(function0, i11));
        }
    }
}
