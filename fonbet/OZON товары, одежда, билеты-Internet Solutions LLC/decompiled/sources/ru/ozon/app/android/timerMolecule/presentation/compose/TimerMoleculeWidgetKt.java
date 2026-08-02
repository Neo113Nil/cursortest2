package ru.ozon.app.android.timerMolecule.presentation.compose;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.timerMolecule.presentation.TimerTickData;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerViewModel;
import ru.ozon.app.android.timerMolecule.presentation.TimerViewModelImpl;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aQ\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0012²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "state", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "onTimerFinish", "", "useCompactStyle", "Lru/ozon/app/android/timerMolecule/presentation/TimerViewModel;", "timerViewModel", "withoutStart", "TimerMoleculeWidget", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;ZLru/ozon/app/android/timerMolecule/presentation/TimerViewModel;ZLS0/k;II)V", "", "timerText", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Landroidx/compose/ui/e;Ljava/lang/String;LS0/k;II)V", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerMoleculeWidgetKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimerMoleculeWidget(@NotNull TimerVO state, e eVar, Function0<Unit> function0, boolean z11, TimerViewModel timerViewModel, boolean z12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function0<Unit> function02;
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        e eVar3;
        boolean z15;
        Object C11;
        boolean z16;
        Object C12;
        TimerTickData TimerMoleculeWidget$lambda$3;
        C3969l c3969l;
        e eVar4;
        J0 m02;
        int i17;
        TimerViewModel timerViewModel2 = timerViewModel;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(47518662);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function02 = function0;
                i13 |= u11.F(function02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    z13 = z11;
                    i13 |= u11.p(z13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i11 & 24576) == 0) {
                        if ((i12 & 16) == 0) {
                            if ((32768 & i11) == 0 ? u11.n(timerViewModel2) : u11.F(timerViewModel2)) {
                                i17 = 16384;
                                i13 |= i17;
                            }
                        }
                        i17 = 8192;
                        i13 |= i17;
                    }
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                        z14 = z12;
                    } else {
                        z14 = z12;
                        if ((i11 & 196608) == 0) {
                            i13 |= u11.p(z14) ? 131072 : 65536;
                        }
                    }
                    if ((i13 & 74899) == 74898 || !u11.b()) {
                        u11.Q0();
                        if ((i11 & 1) != 0 || u11.w0()) {
                            eVar3 = i18 == 0 ? e.f40358c0 : eVar2;
                            if (i14 != 0) {
                                function02 = null;
                            }
                            if (i15 != 0) {
                                z13 = false;
                            }
                            if ((i12 & 16) != 0) {
                                u11.o(-1013628961);
                                Object C13 = u11.C();
                                if (C13 == InterfaceC3967k.a.a()) {
                                    C13 = new TimerViewModelImpl(state, z13);
                                    u11.x(C13);
                                }
                                timerViewModel2 = (TimerViewModelImpl) C13;
                                u11.k();
                                i13 &= -57345;
                            }
                            if (i16 != 0) {
                                z14 = false;
                            }
                        } else {
                            u11.j();
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            eVar3 = eVar2;
                        }
                        u11.j0();
                        u11.o(-1013623862);
                        int i19 = (57344 & i13) ^ 24576;
                        z15 = ((i19 <= 16384 && u11.F(timerViewModel2)) || (i13 & 24576) == 16384) | ((i13 & 14) != 4) | ((458752 & i13) != 131072);
                        C11 = u11.C();
                        if (!z15 || C11 == InterfaceC3967k.a.a()) {
                            C11 = new TimerMoleculeWidgetKt$TimerMoleculeWidget$2$1(timerViewModel2, state, z14);
                            u11.x(C11);
                        }
                        u11.k();
                        Q.c(state, (Function1) C11, u11);
                        u11.o(-1013618409);
                        z16 = ((i19 <= 16384 && u11.F(timerViewModel2)) || (i13 & 24576) == 16384) | ((i13 & 896) == 256);
                        C12 = u11.C();
                        if (!z16 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1(timerViewModel2, function02, null);
                            u11.x(C12);
                        }
                        u11.k();
                        Q.e(u11, timerViewModel2, (Function2) C12);
                        TimerMoleculeWidget$lambda$3 = TimerMoleculeWidget$lambda$3(C6285b.c(timerViewModel2.getTimerState(), u11, 0));
                        if (TimerMoleculeWidget$lambda$3 != null) {
                            c3969l = u11;
                        } else {
                            TimerMoleculeWidget(state, eVar3, TimerMoleculeWidget$lambda$3.getText(), u11, i13 & 126, 0);
                            c3969l = u11;
                        }
                        eVar4 = eVar3;
                    } else {
                        u11.j();
                        c3969l = u11;
                        eVar4 = eVar2;
                    }
                    TimerViewModel timerViewModel3 = timerViewModel2;
                    boolean z17 = z14;
                    Function0<Unit> function03 = function02;
                    boolean z18 = z13;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new TimerMoleculeWidgetKt$TimerMoleculeWidget$5(state, eVar4, function03, z18, timerViewModel3, z17, i11, i12));
                        return;
                    }
                    return;
                }
                z13 = z11;
                if ((i11 & 24576) == 0) {
                }
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                if ((i13 & 74899) == 74898) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i18 == 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if ((i12 & 16) != 0) {
                }
                if (i16 != 0) {
                }
                u11.j0();
                u11.o(-1013623862);
                int i192 = (57344 & i13) ^ 24576;
                z15 = ((i192 <= 16384 && u11.F(timerViewModel2)) || (i13 & 24576) == 16384) | ((i13 & 14) != 4) | ((458752 & i13) != 131072);
                C11 = u11.C();
                if (!z15) {
                }
                C11 = new TimerMoleculeWidgetKt$TimerMoleculeWidget$2$1(timerViewModel2, state, z14);
                u11.x(C11);
                u11.k();
                Q.c(state, (Function1) C11, u11);
                u11.o(-1013618409);
                z16 = ((i192 <= 16384 && u11.F(timerViewModel2)) || (i13 & 24576) == 16384) | ((i13 & 896) == 256);
                C12 = u11.C();
                if (!z16) {
                }
                C12 = new TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1(timerViewModel2, function02, null);
                u11.x(C12);
                u11.k();
                Q.e(u11, timerViewModel2, (Function2) C12);
                TimerMoleculeWidget$lambda$3 = TimerMoleculeWidget$lambda$3(C6285b.c(timerViewModel2.getTimerState(), u11, 0));
                if (TimerMoleculeWidget$lambda$3 != null) {
                }
                eVar4 = eVar3;
                TimerViewModel timerViewModel32 = timerViewModel2;
                boolean z172 = z14;
                Function0<Unit> function032 = function02;
                boolean z182 = z13;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            function02 = function0;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            z13 = z11;
            if ((i11 & 24576) == 0) {
            }
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            if ((i13 & 74899) == 74898) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i18 == 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if ((i12 & 16) != 0) {
            }
            if (i16 != 0) {
            }
            u11.j0();
            u11.o(-1013623862);
            int i1922 = (57344 & i13) ^ 24576;
            z15 = ((i1922 <= 16384 && u11.F(timerViewModel2)) || (i13 & 24576) == 16384) | ((i13 & 14) != 4) | ((458752 & i13) != 131072);
            C11 = u11.C();
            if (!z15) {
            }
            C11 = new TimerMoleculeWidgetKt$TimerMoleculeWidget$2$1(timerViewModel2, state, z14);
            u11.x(C11);
            u11.k();
            Q.c(state, (Function1) C11, u11);
            u11.o(-1013618409);
            z16 = ((i1922 <= 16384 && u11.F(timerViewModel2)) || (i13 & 24576) == 16384) | ((i13 & 896) == 256);
            C12 = u11.C();
            if (!z16) {
            }
            C12 = new TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1(timerViewModel2, function02, null);
            u11.x(C12);
            u11.k();
            Q.e(u11, timerViewModel2, (Function2) C12);
            TimerMoleculeWidget$lambda$3 = TimerMoleculeWidget$lambda$3(C6285b.c(timerViewModel2.getTimerState(), u11, 0));
            if (TimerMoleculeWidget$lambda$3 != null) {
            }
            eVar4 = eVar3;
            TimerViewModel timerViewModel322 = timerViewModel2;
            boolean z1722 = z14;
            Function0<Unit> function0322 = function02;
            boolean z1822 = z13;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function02 = function0;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        z13 = z11;
        if ((i11 & 24576) == 0) {
        }
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        if ((i13 & 74899) == 74898) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i18 == 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if ((i12 & 16) != 0) {
        }
        if (i16 != 0) {
        }
        u11.j0();
        u11.o(-1013623862);
        int i19222 = (57344 & i13) ^ 24576;
        z15 = ((i19222 <= 16384 && u11.F(timerViewModel2)) || (i13 & 24576) == 16384) | ((i13 & 14) != 4) | ((458752 & i13) != 131072);
        C11 = u11.C();
        if (!z15) {
        }
        C11 = new TimerMoleculeWidgetKt$TimerMoleculeWidget$2$1(timerViewModel2, state, z14);
        u11.x(C11);
        u11.k();
        Q.c(state, (Function1) C11, u11);
        u11.o(-1013618409);
        z16 = ((i19222 <= 16384 && u11.F(timerViewModel2)) || (i13 & 24576) == 16384) | ((i13 & 896) == 256);
        C12 = u11.C();
        if (!z16) {
        }
        C12 = new TimerMoleculeWidgetKt$TimerMoleculeWidget$3$1(timerViewModel2, function02, null);
        u11.x(C12);
        u11.k();
        Q.e(u11, timerViewModel2, (Function2) C12);
        TimerMoleculeWidget$lambda$3 = TimerMoleculeWidget$lambda$3(C6285b.c(timerViewModel2.getTimerState(), u11, 0));
        if (TimerMoleculeWidget$lambda$3 != null) {
        }
        eVar4 = eVar3;
        TimerViewModel timerViewModel3222 = timerViewModel2;
        boolean z17222 = z14;
        Function0<Unit> function03222 = function02;
        boolean z18222 = z13;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    private static final TimerTickData TimerMoleculeWidget$lambda$3(A1<TimerTickData> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimerMoleculeWidget(TimerVO timerVO, e eVar, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        TimerVO timerVO2;
        int i13;
        e eVar2;
        String str2;
        C7807Z c7807z;
        int I11;
        e eVar3;
        long j11;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(692535972);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            timerVO2 = timerVO;
        } else if ((i11 & 6) == 0) {
            timerVO2 = timerVO;
            i13 = (u11.n(timerVO2) ? 4 : 2) | i11;
        } else {
            timerVO2 = timerVO;
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                str2 = str;
                i13 |= u11.n(str2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) != 146 && u11.b()) {
                    u11.j();
                    eVar3 = eVar2;
                } else {
                    e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
                    String backgroundColor = timerVO2.getBackgroundColor();
                    u11.o(-1013598571);
                    c7807z = backgroundColor == null ? null : TokenParserKt.tokenToColor(backgroundColor, u11, 0);
                    u11.k();
                    e l02 = a0.x(e.f40358c0, null, 3).l0(eVar4);
                    if (c7807z != null) {
                        if (c7807z != null) {
                            j11 = c7807z.w();
                        } else {
                            j11 = C7807Z.f72258l;
                        }
                        CornerRadius cornerRadius = timerVO2.getCornerRadius();
                        if (cornerRadius == null) {
                            cornerRadius = CornerRadius.NO_RADIUS;
                        }
                        l02 = androidx.compose.foundation.e.b(l02, j11, h.b(cornerRadius.m1866getDpD9Ej5fM()));
                    }
                    V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, l02);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    DsTextAtomKt.DsTextAtom(TextDTO.copy$default(timerVO2.getTitle(), OzonSpannableStringKt.toOzonSpannableString(str2), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, u11, 0, 2);
                    u11.f();
                    eVar3 = eVar4;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new TimerMoleculeWidgetKt$TimerMoleculeWidget$8(timerVO2, eVar3, str2, i11, i12));
                    return;
                }
                return;
            }
            str2 = str;
            if ((i13 & 147) != 146) {
            }
            if (i14 != 0) {
            }
            String backgroundColor2 = timerVO2.getBackgroundColor();
            u11.o(-1013598571);
            if (backgroundColor2 == null) {
            }
            u11.k();
            e l022 = a0.x(e.f40358c0, null, 3).l0(eVar4);
            if (c7807z != null) {
            }
            V f72 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, l022);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(TextDTO.copy$default(timerVO2.getTitle(), OzonSpannableStringKt.toOzonSpannableString(str2), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, u11, 0, 2);
            u11.f();
            eVar3 = eVar4;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        str2 = str;
        if ((i13 & 147) != 146) {
        }
        if (i14 != 0) {
        }
        String backgroundColor22 = timerVO2.getBackgroundColor();
        u11.o(-1013598571);
        if (backgroundColor22 == null) {
        }
        u11.k();
        e l0222 = a0.x(e.f40358c0, null, 3).l0(eVar4);
        if (c7807z != null) {
        }
        V f722 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, l0222);
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        DsTextAtomKt.DsTextAtom(TextDTO.copy$default(timerVO2.getTitle(), OzonSpannableStringKt.toOzonSpannableString(str2), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, u11, 0, 2);
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
