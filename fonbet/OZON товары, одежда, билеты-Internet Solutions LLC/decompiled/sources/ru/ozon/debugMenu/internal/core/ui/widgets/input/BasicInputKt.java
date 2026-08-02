package ru.ozon.debugMenu.internal.core.ui.widgets.input;

import A0.g;
import A0.h;
import B0.C2475h;
import B0.M0;
import B0.N0;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import I0.j1;
import I0.k1;
import K1.M;
import K1.N;
import K1.T;
import Q1.K;
import Q1.X;
import S0.A0;
import S0.C3969l;
import S0.C3996z;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import T7.E;
import U7.i;
import a1.C4912a;
import a1.c;
import android.os.Build;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.K0;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.input.core.decorationBox.DebugMenuDecorationBoxKt;
import t0.q;
import u0.C9891D;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0089\u0002\u0010*\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b(\u0010)\u001aÁ\u0001\u0010/\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010,\u001a\u00020+H\u0003¢\u0006\u0004\b-\u0010.\"\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067²\u0006\u0010\u00106\u001a\u0004\u0018\u0001058\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "LQ1/K;", "", "onValueChange", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "label", HammersV3BodyDTO.PLACEHOLDER, "Lkotlin/Function0;", "rightContent", "", "enabled", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "showSystemContent", "LB0/N0;", "keyboardOptions", "LB0/M0;", "keyboardActions", "LQ1/X;", "visualTransformation", "Lt0/q;", "interactionSource", "onClearClick", "onFocusChanged", "Ll1/Z;", "backgroundColor", "cursorColor", "valueColor", "labelColor", "borderColor", "activeBorderColor", "LK1/T;", "labelTextStyle", "valueTextStyle", "LZ1/h;", "borderWidth", "Lj1/r;", "focusRequester", "BasicInput-qDwmbCE", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LQ1/K;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZZLB0/N0;LB0/M0;LQ1/X;Lt0/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;JJJJJJLK1/T;LK1/T;FLj1/r;LS0/k;IIII)V", "BasicInput", "Lu0/x;", "contentPadding", "InputBody-zDOBpz4", "(Landroidx/compose/ui/e;LQ1/K;Ljava/lang/String;Ljava/lang/String;ZZLQ1/X;Lt0/q;LB0/N0;LB0/M0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;JJJJLK1/T;LK1/T;Lu0/x;LS0/k;II)V", "InputBody", "LA0/g;", "inputShape", "LA0/g;", "getInputShape", "()LA0/g;", "LK1/K;", "textLayoutResult", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasicInputKt {

    @NotNull
    private static final g inputShape = h.b(12);

    /* JADX WARN: Removed duplicated region for block: B:100:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x036b  */
    /* renamed from: BasicInput-qDwmbCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1620BasicInputqDwmbCE(@NotNull e modifier, @NotNull Function1<? super K, Unit> onValueChange, @NotNull K value, @NotNull String label, String str, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, boolean z12, boolean z13, N0 n02, M0 m02, X x11, @NotNull q interactionSource, Function0<Unit> function0, @NotNull Function1<? super Boolean, Unit> onFocusChanged, long j11, long j12, long j13, long j14, long j15, long j16, @NotNull T labelTextStyle, @NotNull T valueTextStyle, float f7, @NotNull r focusRequester, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Function0<Unit> function02;
        long j17;
        long j18;
        int i26;
        int i27;
        int i28;
        long j19;
        int i29;
        int i31;
        float f11;
        int i32;
        int i33;
        int i34;
        C4912a c11;
        int I11;
        C3969l c3969l;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function22;
        int I12;
        X x12;
        N0 n03;
        String str2;
        M0 m03;
        J0 m04;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
        Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        C3969l u11 = interfaceC3967k.u(-806005613);
        if ((i14 & 1) != 0) {
            i15 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i15 = i11 | (u11.n(modifier) ? 4 : 2);
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i11 & 48) == 0) {
            i15 |= u11.F(onValueChange) ? 32 : 16;
        }
        int i35 = i15;
        if ((i14 & 4) != 0) {
            i16 = i35 | 384;
        } else if ((i11 & 384) == 0) {
            i16 = i35 | (u11.n(value) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        } else {
            i16 = i35;
        }
        if ((i14 & 8) != 0) {
            i16 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i16 |= u11.n(label) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i36 = i14 & 16;
        if (i36 != 0) {
            i16 |= 24576;
            i17 = i36;
        } else {
            i17 = i36;
            if ((i11 & 24576) == 0) {
                i16 |= u11.n(str) ? 16384 : 8192;
                if ((i14 & 32) == 0) {
                    i16 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    i16 |= u11.F(function2) ? 131072 : 65536;
                }
                if ((i14 & 64) == 0) {
                    i16 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i16 |= u11.p(z11) ? 1048576 : 524288;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    i16 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i16 |= u11.p(z12) ? 8388608 : 4194304;
                }
                if ((i14 & 256) == 0) {
                    i16 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i16 |= u11.p(z13) ? 67108864 : 33554432;
                }
                i18 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i18 == 0) {
                    i16 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    i16 |= u11.n(n02) ? 536870912 : 268435456;
                }
                i19 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i19 == 0) {
                    i22 = i19;
                    i21 = i12 | 6;
                } else {
                    if ((i12 & 6) == 0) {
                        i21 = i12 | (u11.n(m02) ? 4 : 2);
                    } else {
                        i21 = i12;
                    }
                    i22 = i19;
                }
                i23 = i14 & 2048;
                if (i23 == 0) {
                    i21 |= 48;
                } else if ((i12 & 48) == 0) {
                    i21 |= u11.n(x11) ? 32 : 16;
                }
                int i37 = i21;
                if ((i14 & 4096) == 0) {
                    i25 = i37 | 384;
                    i24 = i12;
                } else {
                    i24 = i12;
                    if ((i24 & 384) == 0) {
                        i25 = i37 | (u11.n(interactionSource) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
                    } else {
                        i25 = i37;
                    }
                }
                if ((i14 & 8192) == 0) {
                    i25 |= 3072;
                } else if ((i24 & 3072) == 0) {
                    function02 = function0;
                    i25 |= u11.F(function02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i14 & 16384) != 0) {
                        i25 |= 24576;
                    } else if ((i24 & 24576) == 0) {
                        i25 |= u11.F(onFocusChanged) ? 16384 : 8192;
                    }
                    if ((32768 & i14) != 0) {
                        i25 |= 196608;
                        j17 = j11;
                    } else {
                        j17 = j11;
                        if ((i24 & 196608) == 0) {
                            i25 |= u11.s(j17) ? 131072 : 65536;
                        }
                    }
                    if ((i14 & 65536) != 0) {
                        i25 |= 1572864;
                    } else if ((i24 & 1572864) == 0) {
                        int i38 = i25;
                        j18 = j12;
                        i26 = i38 | (u11.s(j18) ? 1048576 : 524288);
                        if ((i14 & 131072) == 0) {
                            i26 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            i27 = i26 | (u11.s(j13) ? 8388608 : 4194304);
                            if ((i14 & 262144) != 0) {
                                i27 |= 100663296;
                            } else if ((i12 & 100663296) == 0) {
                                i27 |= u11.s(j14) ? 67108864 : 33554432;
                            }
                            if ((i14 & 524288) != 0) {
                                i27 |= 805306368;
                            } else if ((i12 & 805306368) == 0) {
                                i27 |= u11.s(j15) ? 536870912 : 268435456;
                            }
                            if ((i14 & 1048576) != 0) {
                                i29 = i13 | 6;
                                i28 = i16;
                                j19 = j16;
                            } else if ((i13 & 6) == 0) {
                                i28 = i16;
                                j19 = j16;
                                i29 = i13 | (u11.s(j19) ? 4 : 2);
                            } else {
                                i28 = i16;
                                j19 = j16;
                                i29 = i13;
                            }
                            if ((i14 & 2097152) != 0) {
                                i29 |= 48;
                            } else if ((i13 & 48) == 0) {
                                i29 |= u11.n(labelTextStyle) ? 32 : 16;
                            }
                            int i39 = i29;
                            if ((i14 & 4194304) != 0) {
                                i31 = i39 | 384;
                            } else if ((i13 & 384) == 0) {
                                i31 = i39 | (u11.n(valueTextStyle) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
                            } else {
                                i31 = i39;
                            }
                            if ((i14 & 8388608) != 0) {
                                i32 = i28;
                                i33 = i31 | 3072;
                                f11 = f7;
                            } else {
                                int i41 = i31;
                                if ((i13 & 3072) == 0) {
                                    f11 = f7;
                                    i41 |= u11.q(f11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                                } else {
                                    f11 = f7;
                                }
                                i32 = i28;
                                i33 = i41;
                            }
                            if ((i14 & 16777216) != 0) {
                                i34 = i33 | 24576;
                            } else {
                                int i42 = i33;
                                if ((i13 & 24576) == 0) {
                                    i42 |= u11.n(focusRequester) ? 16384 : 8192;
                                }
                                i34 = i42;
                            }
                            if ((i32 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i34 & 9363) == 9362 && u11.b()) {
                                u11.j();
                                str2 = str;
                                m03 = m02;
                                x12 = x11;
                                c3969l = u11;
                                n03 = n02;
                            } else {
                                String str3 = i17 != 0 ? null : str;
                                N0 n04 = i18 != 0 ? N0.f1448g : n02;
                                M0 m05 = i22 != 0 ? M0.f1437b : m02;
                                X a11 = i23 != 0 ? X.a.a() : x11;
                                boolean z14 = value.f().length() > 0;
                                c11 = c.c(-1682014907, new BasicInputKt$BasicInput$trailingIcon$1(onValueChange, function02), u11);
                                u11.o(1222207926);
                                if (z13 || !z12 || !z14) {
                                    c11 = null;
                                }
                                Function2<? super InterfaceC3967k, ? super Integer, Unit> c12 = !z11 ? null : function2 == null ? c11 : c11 == null ? function2 : c.c(-1909033542, new BasicInputKt$getTrailingIcon$1(c11, function2), u11);
                                u11.k();
                                e i43 = a0.i(a0.e(modifier, 1.0f), 56);
                                g gVar = inputShape;
                                e c13 = C8385f.c(f11, z12 ? j19 : j15, androidx.compose.foundation.e.b(i43, j17, gVar), gVar);
                                if (Build.VERSION.SDK_INT <= 27) {
                                    c13 = c13.l0(FocusableKt.a(e.f40358c0, true, null));
                                }
                                Y b11 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                                I11 = u11.I();
                                A0 d11 = u11.d();
                                e f12 = androidx.compose.ui.c.f(u11, c13);
                                Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.H(a12);
                                } else {
                                    u11.e();
                                }
                                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    a.d(I11, u11, I11, h11);
                                }
                                F1.b(u11, f12, InterfaceC2801g.a.f());
                                C9891D c9891d = C9891D.f99599a;
                                String str4 = str3;
                                c3969l = u11;
                                N0 n05 = n04;
                                M0 m06 = m05;
                                X x13 = a11;
                                function22 = c12;
                                C3996z.a(k1.b().c(new j1(j18, C7807Z.o(0.4f, j18))), c.c(1883071671, new BasicInputKt$BasicInput$2$1(c9891d, focusRequester, value, label, str4, z11, z12, x13, interactionSource, n05, m06, onValueChange, onFocusChanged, j14, j13, j12, j11, labelTextStyle, valueTextStyle, c12), c3969l), c3969l, 56);
                                e b12 = c9891d.b(e.f40358c0, InterfaceC6250b.a.i());
                                V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
                                I12 = c3969l.I();
                                A0 d12 = c3969l.d();
                                e f14 = androidx.compose.ui.c.f(c3969l, b12);
                                Function0 a13 = InterfaceC2801g.a.a();
                                c3969l.i();
                                if (c3969l.t()) {
                                    c3969l.H(a13);
                                } else {
                                    c3969l.e();
                                }
                                Function2 f15 = E.f(c3969l, f13, c3969l, d12);
                                if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I12))) {
                                    a.d(I12, c3969l, I12, f15);
                                }
                                i.b(c3969l, f14, 400937100);
                                if (function22 != null) {
                                    function22.invoke(c3969l, 0);
                                    Unit unit = Unit.f71690a;
                                }
                                c3969l.k();
                                c3969l.f();
                                c3969l.f();
                                x12 = x13;
                                n03 = n05;
                                str2 = str4;
                                m03 = m06;
                            }
                            m04 = c3969l.m0();
                            if (m04 != null) {
                                m04.G(new BasicInputKt$BasicInput$3(modifier, onValueChange, value, label, str2, function2, z11, z12, z13, n03, m03, x12, interactionSource, function0, onFocusChanged, j11, j12, j13, j14, j15, j16, labelTextStyle, valueTextStyle, f7, focusRequester, i11, i12, i13, i14));
                                return;
                            }
                            return;
                        }
                        i27 = i26;
                        if ((i14 & 262144) != 0) {
                        }
                        if ((i14 & 524288) != 0) {
                        }
                        if ((i14 & 1048576) != 0) {
                        }
                        if ((i14 & 2097152) != 0) {
                        }
                        int i392 = i29;
                        if ((i14 & 4194304) != 0) {
                        }
                        if ((i14 & 8388608) != 0) {
                        }
                        if ((i14 & 16777216) != 0) {
                        }
                        if ((i32 & 306783379) != 306783378) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (value.f().length() > 0) {
                        }
                        c11 = c.c(-1682014907, new BasicInputKt$BasicInput$trailingIcon$1(onValueChange, function02), u11);
                        u11.o(1222207926);
                        if (z13) {
                        }
                        c11 = null;
                        if (!z11) {
                        }
                        u11.k();
                        e i432 = a0.i(a0.e(modifier, 1.0f), 56);
                        g gVar2 = inputShape;
                        e c132 = C8385f.c(f11, z12 ? j19 : j15, androidx.compose.foundation.e.b(i432, j17, gVar2), gVar2);
                        if (Build.VERSION.SDK_INT <= 27) {
                        }
                        Y b112 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                        I11 = u11.I();
                        A0 d112 = u11.d();
                        e f122 = androidx.compose.ui.c.f(u11, c132);
                        Function0 a122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 h112 = Cm.e.h(u11, b112, u11, d112);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, h112);
                        F1.b(u11, f122, InterfaceC2801g.a.f());
                        C9891D c9891d2 = C9891D.f99599a;
                        String str42 = str3;
                        c3969l = u11;
                        N0 n052 = n04;
                        M0 m062 = m05;
                        X x132 = a11;
                        function22 = c12;
                        C3996z.a(k1.b().c(new j1(j18, C7807Z.o(0.4f, j18))), c.c(1883071671, new BasicInputKt$BasicInput$2$1(c9891d2, focusRequester, value, label, str42, z11, z12, x132, interactionSource, n052, m062, onValueChange, onFocusChanged, j14, j13, j12, j11, labelTextStyle, valueTextStyle, c12), c3969l), c3969l, 56);
                        e b122 = c9891d2.b(e.f40358c0, InterfaceC6250b.a.i());
                        V f132 = C5185h.f(InterfaceC6250b.a.o(), false);
                        I12 = c3969l.I();
                        A0 d122 = c3969l.d();
                        e f142 = androidx.compose.ui.c.f(c3969l, b122);
                        Function0 a132 = InterfaceC2801g.a.a();
                        c3969l.i();
                        if (c3969l.t()) {
                        }
                        Function2 f152 = E.f(c3969l, f132, c3969l, d122);
                        if (!c3969l.t()) {
                        }
                        a.d(I12, c3969l, I12, f152);
                        i.b(c3969l, f142, 400937100);
                        if (function22 != null) {
                        }
                        c3969l.k();
                        c3969l.f();
                        c3969l.f();
                        x12 = x132;
                        n03 = n052;
                        str2 = str42;
                        m03 = m062;
                        m04 = c3969l.m0();
                        if (m04 != null) {
                        }
                    }
                    i26 = i25;
                    j18 = j12;
                    if ((i14 & 131072) == 0) {
                    }
                    i27 = i26;
                    if ((i14 & 262144) != 0) {
                    }
                    if ((i14 & 524288) != 0) {
                    }
                    if ((i14 & 1048576) != 0) {
                    }
                    if ((i14 & 2097152) != 0) {
                    }
                    int i3922 = i29;
                    if ((i14 & 4194304) != 0) {
                    }
                    if ((i14 & 8388608) != 0) {
                    }
                    if ((i14 & 16777216) != 0) {
                    }
                    if ((i32 & 306783379) != 306783378) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (value.f().length() > 0) {
                    }
                    c11 = c.c(-1682014907, new BasicInputKt$BasicInput$trailingIcon$1(onValueChange, function02), u11);
                    u11.o(1222207926);
                    if (z13) {
                    }
                    c11 = null;
                    if (!z11) {
                    }
                    u11.k();
                    e i4322 = a0.i(a0.e(modifier, 1.0f), 56);
                    g gVar22 = inputShape;
                    e c1322 = C8385f.c(f11, z12 ? j19 : j15, androidx.compose.foundation.e.b(i4322, j17, gVar22), gVar22);
                    if (Build.VERSION.SDK_INT <= 27) {
                    }
                    Y b1122 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                    I11 = u11.I();
                    A0 d1122 = u11.d();
                    e f1222 = androidx.compose.ui.c.f(u11, c1322);
                    Function0 a1222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 h1122 = Cm.e.h(u11, b1122, u11, d1122);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, h1122);
                    F1.b(u11, f1222, InterfaceC2801g.a.f());
                    C9891D c9891d22 = C9891D.f99599a;
                    String str422 = str3;
                    c3969l = u11;
                    N0 n0522 = n04;
                    M0 m0622 = m05;
                    X x1322 = a11;
                    function22 = c12;
                    C3996z.a(k1.b().c(new j1(j18, C7807Z.o(0.4f, j18))), c.c(1883071671, new BasicInputKt$BasicInput$2$1(c9891d22, focusRequester, value, label, str422, z11, z12, x1322, interactionSource, n0522, m0622, onValueChange, onFocusChanged, j14, j13, j12, j11, labelTextStyle, valueTextStyle, c12), c3969l), c3969l, 56);
                    e b1222 = c9891d22.b(e.f40358c0, InterfaceC6250b.a.i());
                    V f1322 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I12 = c3969l.I();
                    A0 d1222 = c3969l.d();
                    e f1422 = androidx.compose.ui.c.f(c3969l, b1222);
                    Function0 a1322 = InterfaceC2801g.a.a();
                    c3969l.i();
                    if (c3969l.t()) {
                    }
                    Function2 f1522 = E.f(c3969l, f1322, c3969l, d1222);
                    if (!c3969l.t()) {
                    }
                    a.d(I12, c3969l, I12, f1522);
                    i.b(c3969l, f1422, 400937100);
                    if (function22 != null) {
                    }
                    c3969l.k();
                    c3969l.f();
                    c3969l.f();
                    x12 = x1322;
                    n03 = n0522;
                    str2 = str422;
                    m03 = m0622;
                    m04 = c3969l.m0();
                    if (m04 != null) {
                    }
                }
                function02 = function0;
                if ((i14 & 16384) != 0) {
                }
                if ((32768 & i14) != 0) {
                }
                if ((i14 & 65536) != 0) {
                }
                i26 = i25;
                j18 = j12;
                if ((i14 & 131072) == 0) {
                }
                i27 = i26;
                if ((i14 & 262144) != 0) {
                }
                if ((i14 & 524288) != 0) {
                }
                if ((i14 & 1048576) != 0) {
                }
                if ((i14 & 2097152) != 0) {
                }
                int i39222 = i29;
                if ((i14 & 4194304) != 0) {
                }
                if ((i14 & 8388608) != 0) {
                }
                if ((i14 & 16777216) != 0) {
                }
                if ((i32 & 306783379) != 306783378) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if (value.f().length() > 0) {
                }
                c11 = c.c(-1682014907, new BasicInputKt$BasicInput$trailingIcon$1(onValueChange, function02), u11);
                u11.o(1222207926);
                if (z13) {
                }
                c11 = null;
                if (!z11) {
                }
                u11.k();
                e i43222 = a0.i(a0.e(modifier, 1.0f), 56);
                g gVar222 = inputShape;
                e c13222 = C8385f.c(f11, z12 ? j19 : j15, androidx.compose.foundation.e.b(i43222, j17, gVar222), gVar222);
                if (Build.VERSION.SDK_INT <= 27) {
                }
                Y b11222 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                I11 = u11.I();
                A0 d11222 = u11.d();
                e f12222 = androidx.compose.ui.c.f(u11, c13222);
                Function0 a12222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h11222 = Cm.e.h(u11, b11222, u11, d11222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h11222);
                F1.b(u11, f12222, InterfaceC2801g.a.f());
                C9891D c9891d222 = C9891D.f99599a;
                String str4222 = str3;
                c3969l = u11;
                N0 n05222 = n04;
                M0 m06222 = m05;
                X x13222 = a11;
                function22 = c12;
                C3996z.a(k1.b().c(new j1(j18, C7807Z.o(0.4f, j18))), c.c(1883071671, new BasicInputKt$BasicInput$2$1(c9891d222, focusRequester, value, label, str4222, z11, z12, x13222, interactionSource, n05222, m06222, onValueChange, onFocusChanged, j14, j13, j12, j11, labelTextStyle, valueTextStyle, c12), c3969l), c3969l, 56);
                e b12222 = c9891d222.b(e.f40358c0, InterfaceC6250b.a.i());
                V f13222 = C5185h.f(InterfaceC6250b.a.o(), false);
                I12 = c3969l.I();
                A0 d12222 = c3969l.d();
                e f14222 = androidx.compose.ui.c.f(c3969l, b12222);
                Function0 a13222 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                }
                Function2 f15222 = E.f(c3969l, f13222, c3969l, d12222);
                if (!c3969l.t()) {
                }
                a.d(I12, c3969l, I12, f15222);
                i.b(c3969l, f14222, 400937100);
                if (function22 != null) {
                }
                c3969l.k();
                c3969l.f();
                c3969l.f();
                x12 = x13222;
                n03 = n05222;
                str2 = str4222;
                m03 = m06222;
                m04 = c3969l.m0();
                if (m04 != null) {
                }
            }
        }
        if ((i14 & 32) == 0) {
        }
        if ((i14 & 64) == 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((i14 & 256) == 0) {
        }
        i18 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i18 == 0) {
        }
        i19 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i19 == 0) {
        }
        i23 = i14 & 2048;
        if (i23 == 0) {
        }
        int i372 = i21;
        if ((i14 & 4096) == 0) {
        }
        if ((i14 & 8192) == 0) {
        }
        function02 = function0;
        if ((i14 & 16384) != 0) {
        }
        if ((32768 & i14) != 0) {
        }
        if ((i14 & 65536) != 0) {
        }
        i26 = i25;
        j18 = j12;
        if ((i14 & 131072) == 0) {
        }
        i27 = i26;
        if ((i14 & 262144) != 0) {
        }
        if ((i14 & 524288) != 0) {
        }
        if ((i14 & 1048576) != 0) {
        }
        if ((i14 & 2097152) != 0) {
        }
        int i392222 = i29;
        if ((i14 & 4194304) != 0) {
        }
        if ((i14 & 8388608) != 0) {
        }
        if ((i14 & 16777216) != 0) {
        }
        if ((i32 & 306783379) != 306783378) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if (value.f().length() > 0) {
        }
        c11 = c.c(-1682014907, new BasicInputKt$BasicInput$trailingIcon$1(onValueChange, function02), u11);
        u11.o(1222207926);
        if (z13) {
        }
        c11 = null;
        if (!z11) {
        }
        u11.k();
        e i432222 = a0.i(a0.e(modifier, 1.0f), 56);
        g gVar2222 = inputShape;
        e c132222 = C8385f.c(f11, z12 ? j19 : j15, androidx.compose.foundation.e.b(i432222, j17, gVar2222), gVar2222);
        if (Build.VERSION.SDK_INT <= 27) {
        }
        Y b112222 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f122222 = androidx.compose.ui.c.f(u11, c132222);
        Function0 a122222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112222 = Cm.e.h(u11, b112222, u11, d112222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112222);
        F1.b(u11, f122222, InterfaceC2801g.a.f());
        C9891D c9891d2222 = C9891D.f99599a;
        String str42222 = str3;
        c3969l = u11;
        N0 n052222 = n04;
        M0 m062222 = m05;
        X x132222 = a11;
        function22 = c12;
        C3996z.a(k1.b().c(new j1(j18, C7807Z.o(0.4f, j18))), c.c(1883071671, new BasicInputKt$BasicInput$2$1(c9891d2222, focusRequester, value, label, str42222, z11, z12, x132222, interactionSource, n052222, m062222, onValueChange, onFocusChanged, j14, j13, j12, j11, labelTextStyle, valueTextStyle, c12), c3969l), c3969l, 56);
        e b122222 = c9891d2222.b(e.f40358c0, InterfaceC6250b.a.i());
        V f132222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I12 = c3969l.I();
        A0 d122222 = c3969l.d();
        e f142222 = androidx.compose.ui.c.f(c3969l, b122222);
        Function0 a132222 = InterfaceC2801g.a.a();
        c3969l.i();
        if (c3969l.t()) {
        }
        Function2 f152222 = E.f(c3969l, f132222, c3969l, d122222);
        if (!c3969l.t()) {
        }
        a.d(I12, c3969l, I12, f152222);
        i.b(c3969l, f142222, 400937100);
        if (function22 != null) {
        }
        c3969l.k();
        c3969l.f();
        c3969l.f();
        x12 = x132222;
        n03 = n052222;
        str2 = str42222;
        m03 = m062222;
        m04 = c3969l.m0();
        if (m04 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InputBody-zDOBpz4, reason: not valid java name */
    public static final void m1621InputBodyzDOBpz4(e eVar, K k11, String str, String str2, boolean z11, boolean z12, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, T t2, T t11, InterfaceC9914x interfaceC9914x, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        K k12;
        String str3;
        int i14;
        InterfaceC3978p0 interfaceC3978p0;
        K k13;
        e eVar2;
        C3969l c3969l;
        T t12;
        InterfaceC3978p0 interfaceC3978p02;
        long j15;
        C3969l u11 = interfaceC3967k.u(-1034919701);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            k12 = k11;
            i13 |= u11.n(k12) ? 32 : 16;
        } else {
            k12 = k11;
        }
        if ((i11 & 384) == 0) {
            str3 = str;
            i13 |= u11.n(str3) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            str3 = str;
        }
        int i15 = i11 & 3072;
        int i16 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i15 == 0) {
            i13 |= u11.n(str2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.p(z11) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= u11.p(z12) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.n(x11) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.n(qVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.n(n02) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.n(m02) ? 536870912 : 268435456;
        }
        int i17 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.F(function1) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.F(function12) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            if (u11.s(j12)) {
                i16 = 2048;
            }
            i14 |= i16;
        }
        if ((i12 & 24576) == 0) {
            i14 |= u11.s(j13) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= u11.s(j14) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= u11.n(t2) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= u11.n(t11) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= u11.n(interfaceC9914x) ? 67108864 : 33554432;
        }
        int i18 = i14;
        C3969l c3969l2 = u11;
        if ((i17 & 306783379) == 306783378 && (i18 & 38347923) == 38347922 && c3969l2.b()) {
            c3969l2.j();
            j15 = j13;
        } else {
            int i19 = i17 >> 12;
            int i21 = ((i18 >> 18) & 112) | (i19 & 896);
            int i22 = i19 & 7168;
            int i23 = i21 | i22 | ((i17 << 6) & 57344) | ((i18 << 9) & 458752) | (i18 & 3670016) | ((i17 << 12) & 29360128);
            int i24 = i18 & 234881024;
            InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> m1626DebugMenuDecorationBox1YH7lEI = DebugMenuDecorationBoxKt.m1626DebugMenuDecorationBox1YH7lEI(k12.f(), t11, x11, qVar, str3, j11, t2, str2, interfaceC9914x, c3969l2, i23 | i24);
            T c11 = T.c(t11, j12, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            M a11 = N.a(c3969l2);
            c3969l2.o(792183395);
            Object C11 = c3969l2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                c3969l2.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C11;
            c3969l2.k();
            if (z12) {
                interfaceC3978p0 = interfaceC3978p03;
                k13 = k12;
            } else {
                interfaceC3978p0 = interfaceC3978p03;
                k13 = new K(k12.c(), 0L, 6);
            }
            e e11 = a0.e(b.a(eVar, DebugMenuInputTestTags.TextField), 1.0f);
            c3969l2.o(792194697);
            boolean z13 = (i18 & 112) == 32;
            Object C12 = c3969l2.C();
            if (z13 || C12 == InterfaceC3967k.a.a()) {
                C12 = new BasicInputKt$InputBody$1$1(function12);
                c3969l2.x(C12);
            }
            c3969l2.k();
            e a12 = androidx.compose.ui.focus.a.a(e11, (Function1) C12);
            c3969l2.o(792197381);
            boolean n11 = (i24 == 67108864) | ((i17 & 112) == 32) | ((i17 & 458752) == 131072) | c3969l2.n(a11) | c3969l2.n(c11) | ((i18 & 458752) == 131072);
            Object C13 = c3969l2.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                eVar2 = a12;
                K k14 = k12;
                c3969l = c3969l2;
                t12 = c11;
                interfaceC3978p02 = interfaceC3978p0;
                BasicInputKt$InputBody$2$1 basicInputKt$InputBody$2$1 = new BasicInputKt$InputBody$2$1(k14, z12, interfaceC9914x, a11, t12, j14, interfaceC3978p02);
                c3969l.x(basicInputKt$InputBody$2$1);
                C13 = basicInputKt$InputBody$2$1;
            } else {
                eVar2 = a12;
                c3969l = c3969l2;
                t12 = c11;
                interfaceC3978p02 = interfaceC3978p0;
            }
            c3969l.k();
            e d11 = androidx.compose.ui.draw.c.d(eVar2, (Function1) C13);
            j15 = j13;
            K0 k02 = new K0(j15);
            c3969l.o(792217787);
            Object C14 = c3969l.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = new BasicInputKt$InputBody$3$1(interfaceC3978p02);
                c3969l.x(C14);
            }
            c3969l.k();
            int i25 = i17 >> 6;
            C3969l c3969l3 = c3969l;
            C2475h.c(k13, function1, d11, z11, false, t12, n02, m02, true, 0, 0, x11, (Function1) C14, qVar, k02, c.c(-315804594, new BasicInputKt$InputBody$4(m1626DebugMenuDecorationBox1YH7lEI), c3969l), c3969l3, ((i18 << 3) & 112) | 100663296 | ((i17 >> 3) & 7168) | (i25 & 3670016) | (i25 & 29360128), ((i17 >> 15) & 112) | 196992 | i22, 1552);
            c3969l2 = c3969l3;
        }
        J0 m03 = c3969l2.m0();
        if (m03 != null) {
            m03.G(new BasicInputKt$InputBody$5(eVar, k11, str, str2, z11, z12, x11, qVar, n02, m02, function1, function12, j11, j12, j15, j14, t2, t11, interfaceC9914x, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K1.K InputBody_zDOBpz4$lambda$4(InterfaceC3978p0<K1.K> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }
}
