package ru.ozon.uni.android.ds.compose.component.rating;

import C1.f;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import P0.E;
import S0.A0;
import S0.C0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3970l0;
import S0.J0;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import hd.C6915b;
import kd.InterfaceC7663b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.ranges.h;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.component.rating.DsRatingStyle;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.android.ds.compose.util.GradientExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import x1.L;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0083\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"&\u0010 \u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e0\u0004j\u0002`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&²\u0006\u000e\u0010%\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/uni/atoms/data/rating/RatingDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "onSelected", "DsRatingAtom", "(Lru/ozon/uni/atoms/data/rating/RatingDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "total", "Lru/ozon/uni/android/ds/compose/component/rating/DsRatingSize;", "size", "Lru/ozon/uni/android/ds/compose/component/rating/DsRatingStyle;", "style", "", "separateClickable", "Lkotlin/Function0;", "onClick", "Ll1/Q;", "starsBrush", "starsBackgroundBrush", "DsRating-u6rfSSE", "(FLandroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/rating/DsRatingSize;IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ll1/Q;Ll1/Q;LS0/k;II)V", "DsRating", "roundToHalf", "(F)F", "Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/android/ds/compose/modifier/AtomLocator;", "ratingLocator", "Lkotlin/jvm/functions/Function1;", "Lkd/b;", "INDEX_RANGE", "Lkd/b;", "selectedIndex", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsRatingKt {

    @NotNull
    private static final Function1<TestInfo, Locator> ratingLocator = DsRatingKt$ratingLocator$1.INSTANCE;

    @NotNull
    private static final InterfaceC7663b<Float> INDEX_RANGE = h.l(0.0f, 5.0f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0332  */
    /* JADX WARN: Type inference failed for: r26v5, types: [androidx.compose.ui.e] */
    /* renamed from: DsRating-u6rfSSE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1762DsRatingu6rfSSE(float f7, e eVar, DsRatingSize dsRatingSize, int i11, boolean z11, Function0<Unit> function0, Function1<? super Float, Unit> function1, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        float f11;
        int i14;
        e eVar2;
        int i15;
        DsRatingSize dsRatingSize2;
        int i16;
        int i17;
        int i18;
        boolean z12;
        int i19;
        Function0<Unit> function02;
        int i21;
        Function1<? super Float, Unit> function12;
        int i22;
        int i23;
        int i24;
        int m1770getDEFAULTsnpJkgg;
        AbstractC7799Q abstractC7799Q3;
        float roundToHalf;
        AbstractC7799Q abstractC7799Q4;
        float f12;
        boolean q11;
        Object C11;
        boolean z13;
        DsRatingStyle.Companion companion;
        AbstractC7799Q k02;
        AbstractC7799Q abstractC7799Q5;
        Function1<? super Float, Unit> function13;
        int i25;
        InterfaceC3970l0 interfaceC3970l0;
        int i26;
        Function1<? super Float, Unit> function14;
        int I11;
        int i27;
        C3969l c3969l;
        Function1<? super Float, Unit> function15;
        Function0<Unit> function03;
        AbstractC7799Q abstractC7799Q6;
        boolean z14;
        AbstractC7799Q abstractC7799Q7;
        int i28;
        e.a aVar;
        e.a aVar2;
        long j11;
        DsRatingSize dsRatingSize3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1264491353);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
            f11 = f7;
        } else if ((i12 & 6) == 0) {
            f11 = f7;
            i14 = (u11.q(f11) ? 4 : 2) | i12;
        } else {
            f11 = f7;
            i14 = i12;
        }
        int i29 = 2 & i13;
        if (i29 != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            eVar2 = eVar;
            i14 |= u11.n(eVar2) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i12 & 384) == 0) {
                DsRatingSize dsRatingSize4 = dsRatingSize;
                i14 |= u11.n(dsRatingSize4) ? 256 : 128;
                dsRatingSize2 = dsRatingSize4;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                    i17 = i11;
                } else if ((i12 & 3072) == 0) {
                    i17 = i11;
                    i14 |= u11.r(i17) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                } else {
                    i17 = i11;
                }
                i18 = i13 & 16;
                if (i18 != 0) {
                    i14 |= 24576;
                    z12 = z11;
                } else if ((i12 & 24576) == 0) {
                    z12 = z11;
                    i14 |= u11.p(z12) ? 16384 : 8192;
                } else {
                    z12 = z11;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= 196608;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i12 & 196608) == 0) {
                        i14 |= u11.F(function02) ? 131072 : 65536;
                    }
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i14 |= 1572864;
                    function12 = function1;
                } else {
                    function12 = function1;
                    if ((i12 & 1572864) == 0) {
                        i14 |= u11.F(function12) ? 1048576 : 524288;
                    }
                }
                i22 = 128 & i13;
                if (i22 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i14 |= u11.n(abstractC7799Q) ? 8388608 : 4194304;
                }
                i23 = 256 & i13;
                if (i23 != 0) {
                    i14 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    i24 = i23;
                    i14 |= u11.n(abstractC7799Q2) ? 67108864 : 33554432;
                    if ((i14 & 38347923) == 38347922 || !u11.b()) {
                        if (i29 != 0) {
                            eVar2 = e.f40358c0;
                        }
                        if (i15 != 0) {
                            dsRatingSize2 = DsRatingSize.SIZE_500;
                        }
                        m1770getDEFAULTsnpJkgg = i16 == 0 ? DsRatingStyle.INSTANCE.m1770getDEFAULTsnpJkgg() : i17;
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i19 != 0) {
                            function02 = null;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        AbstractC7799Q abstractC7799Q8 = i22 == 0 ? null : abstractC7799Q;
                        abstractC7799Q3 = i24 == 0 ? null : abstractC7799Q2;
                        roundToHalf = roundToHalf(((Number) h.i(Float.valueOf(f11), INDEX_RANGE)).floatValue());
                        float gap = dsRatingSize2.getGap();
                        if (z12) {
                            abstractC7799Q4 = abstractC7799Q8;
                            f12 = 0;
                        } else {
                            abstractC7799Q4 = abstractC7799Q8;
                            f12 = dsRatingSize2.getGapClickable();
                        }
                        float f13 = gap + f12;
                        float iconWidth = (5 * (dsRatingSize2.getIconWidth() + f13)) - f13;
                        u11.o(-349082667);
                        q11 = u11.q(roundToHalf);
                        C11 = u11.C();
                        z13 = z12;
                        if (!q11 || C11 == InterfaceC3967k.a.a()) {
                            C11 = C0.a(roundToHalf);
                            u11.x(C11);
                        }
                        InterfaceC3970l0 interfaceC3970l02 = (InterfaceC3970l0) C11;
                        u11.k();
                        u11.o(-349080273);
                        companion = DsRatingStyle.INSTANCE;
                        if (DsRatingStyle.m1768equalsimpl0(m1770getDEFAULTsnpJkgg, companion.m1769getCUSTOMsnpJkgg()) || abstractC7799Q4 == null) {
                            abstractC7799Q5 = abstractC7799Q3;
                            function13 = function12;
                            k02 = new K0(DsRatingStyle.getSelectedColor(m1770getDEFAULTsnpJkgg, u11, (i14 >> 9) & 14));
                        } else {
                            abstractC7799Q5 = abstractC7799Q3;
                            function13 = function12;
                            k02 = abstractC7799Q4;
                        }
                        u11.k();
                        u11.o(-349075035);
                        AbstractC7799Q k03 = (DsRatingStyle.m1768equalsimpl0(m1770getDEFAULTsnpJkgg, companion.m1769getCUSTOMsnpJkgg()) || abstractC7799Q5 == null) ? new K0(DsRatingStyle.getBackgroundColor(m1770getDEFAULTsnpJkgg, u11, (i14 >> 9) & 14)) : abstractC7799Q5;
                        u11.k();
                        u11.o(-349066592);
                        e v11 = a0.v(eVar2, null, 3);
                        u11.o(-349065924);
                        if (z13) {
                            i25 = m1770getDEFAULTsnpJkgg;
                            interfaceC3970l0 = interfaceC3970l02;
                            i26 = 458752;
                            function14 = function13;
                            if (function02 != null) {
                                v11 = i.c(v11, false, null, null, function02, 7);
                            }
                        } else {
                            Float valueOf = Float.valueOf(roundToHalf);
                            i26 = 458752;
                            u11.o(-1401019029);
                            i25 = m1770getDEFAULTsnpJkgg;
                            boolean n11 = ((i14 & 3670016) == 1048576) | u11.n(interfaceC3970l02) | ((i14 & 458752) == 131072) | u11.q(iconWidth);
                            Object C12 = u11.C();
                            if (n11 || C12 == InterfaceC3967k.a.a()) {
                                Function1<? super Float, Unit> function16 = function13;
                                C12 = new DsRatingKt$DsRating$1$1$1(function16, function02, interfaceC3970l02, iconWidth, null);
                                function14 = function16;
                                interfaceC3970l0 = interfaceC3970l02;
                                u11.x(C12);
                            } else {
                                interfaceC3970l0 = interfaceC3970l02;
                                function14 = function13;
                            }
                            u11.k();
                            int i31 = L.f104834b;
                            v11 = v11.l0(new SuspendPointerInputElement(function14, valueOf, null, (Function2) C12, 4));
                        }
                        u11.k();
                        u11.k();
                        Y b11 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f14 = c.f(u11, v11);
                        int i32 = i14;
                        Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a11);
                        }
                        Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, h11);
                        }
                        U7.i.b(u11, f14, -1400986646);
                        i27 = 0;
                        C3969l c3969l2 = u11;
                        while (i27 < 5) {
                            boolean z15 = i27 == 4;
                            M m11 = new M();
                            c3969l2.o(-1400976377);
                            e.a aVar3 = e.f40358c0;
                            if (z15) {
                                aVar = aVar3;
                                aVar2 = aVar;
                            } else {
                                aVar = aVar3;
                                aVar2 = T.j(aVar3, 0.0f, 0.0f, f13, 0.0f, 11);
                            }
                            e.a aVar4 = aVar;
                            e o11 = a0.o(aVar2, dsRatingSize2.getIconWidth(), dsRatingSize2.getIconTouchZoneHeight());
                            if (z13) {
                                int i33 = i27 + 1;
                                String valueOf2 = String.valueOf(i33);
                                c3969l2.o(558016635);
                                boolean n12 = c3969l2.n(interfaceC3970l0) | c3969l2.r(i33) | ((i32 & 3670016) == 1048576) | ((i32 & i26) == 131072);
                                Object C13 = c3969l2.C();
                                if (n12 || C13 == InterfaceC3967k.a.a()) {
                                    C13 = new DsRatingKt$DsRating$2$1$2$1$1(i33, function14, function02, interfaceC3970l0);
                                    c3969l2.x(C13);
                                }
                                c3969l2.k();
                                o11 = o11.l0(i.b(aVar4, null, null, false, valueOf2, null, (Function0) C13, 20));
                            }
                            c3969l2.k();
                            e c11 = o.c(f.a(o11, new DsRatingKt$DsRating$2$1$3(m11)), false, new DsRatingKt$DsRating$2$1$4(m11, i27, interfaceC3970l0));
                            c3969l2.o(-23225252);
                            Object C14 = c3969l2.C();
                            if (C14 == InterfaceC3967k.a.a()) {
                                C14 = DsRatingKt$DsRating$2$1$5$1.INSTANCE;
                                c3969l2.x(C14);
                            }
                            c3969l2.k();
                            e a12 = androidx.compose.ui.graphics.a.a(c11, (Function1) C14);
                            c3969l2.o(-23220716);
                            boolean n13 = c3969l2.n(interfaceC3970l0) | c3969l2.r(i27) | c3969l2.n(k02) | c3969l2.n(k03);
                            Object C15 = c3969l2.C();
                            if (n13 || C15 == InterfaceC3967k.a.a()) {
                                C15 = new DsRatingKt$DsRating$2$1$6$1(i27, k02, k03, interfaceC3970l0);
                                c3969l2.x(C15);
                            }
                            c3969l2.k();
                            e c12 = androidx.compose.ui.draw.c.c(a12, (Function1) C15);
                            AbstractC8972b icon = dsRatingSize2.getIcon(c3969l2, (i32 >> 6) & 14);
                            j11 = C7807Z.f72251e;
                            C3969l c3969l3 = c3969l2;
                            E.a(icon, null, c12, j11, c3969l3, 3120);
                            i27++;
                            c3969l2 = c3969l3;
                        }
                        c3969l = c3969l2;
                        c3969l.k();
                        c3969l.f();
                        function15 = function14;
                        function03 = function02;
                        abstractC7799Q6 = abstractC7799Q4;
                        z14 = z13;
                        abstractC7799Q7 = abstractC7799Q5;
                        i28 = i25;
                        dsRatingSize3 = dsRatingSize2;
                    } else {
                        u11.j();
                        abstractC7799Q7 = abstractC7799Q2;
                        i28 = i17;
                        c3969l = u11;
                        function15 = function12;
                        function03 = function02;
                        abstractC7799Q6 = abstractC7799Q;
                        z14 = z12;
                        dsRatingSize3 = dsRatingSize2;
                    }
                    DsRatingSize dsRatingSize5 = dsRatingSize3;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new DsRatingKt$DsRating$3(f7, eVar2, dsRatingSize5, i28, z14, function03, function15, abstractC7799Q6, abstractC7799Q7, i12, i13));
                        return;
                    }
                    return;
                }
                i24 = i23;
                if ((i14 & 38347923) == 38347922) {
                }
                if (i29 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 == 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 == 0) {
                }
                if (i24 == 0) {
                }
                roundToHalf = roundToHalf(((Number) h.i(Float.valueOf(f11), INDEX_RANGE)).floatValue());
                float gap2 = dsRatingSize2.getGap();
                if (z12) {
                }
                float f132 = gap2 + f12;
                float iconWidth2 = (5 * (dsRatingSize2.getIconWidth() + f132)) - f132;
                u11.o(-349082667);
                q11 = u11.q(roundToHalf);
                C11 = u11.C();
                z13 = z12;
                if (!q11) {
                }
                C11 = C0.a(roundToHalf);
                u11.x(C11);
                InterfaceC3970l0 interfaceC3970l022 = (InterfaceC3970l0) C11;
                u11.k();
                u11.o(-349080273);
                companion = DsRatingStyle.INSTANCE;
                if (DsRatingStyle.m1768equalsimpl0(m1770getDEFAULTsnpJkgg, companion.m1769getCUSTOMsnpJkgg())) {
                }
                abstractC7799Q5 = abstractC7799Q3;
                function13 = function12;
                k02 = new K0(DsRatingStyle.getSelectedColor(m1770getDEFAULTsnpJkgg, u11, (i14 >> 9) & 14));
                u11.k();
                u11.o(-349075035);
                if (DsRatingStyle.m1768equalsimpl0(m1770getDEFAULTsnpJkgg, companion.m1769getCUSTOMsnpJkgg())) {
                }
                u11.k();
                u11.o(-349066592);
                e v112 = a0.v(eVar2, null, 3);
                u11.o(-349065924);
                if (z13) {
                }
                u11.k();
                u11.k();
                Y b112 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                I11 = u11.I();
                A0 d112 = u11.d();
                e f142 = c.f(u11, v112);
                int i322 = i14;
                Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h112 = Cm.e.h(u11, b112, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h112);
                U7.i.b(u11, f142, -1400986646);
                i27 = 0;
                C3969l c3969l22 = u11;
                while (i27 < 5) {
                }
                c3969l = c3969l22;
                c3969l.k();
                c3969l.f();
                function15 = function14;
                function03 = function02;
                abstractC7799Q6 = abstractC7799Q4;
                z14 = z13;
                abstractC7799Q7 = abstractC7799Q5;
                i28 = i25;
                dsRatingSize3 = dsRatingSize2;
                DsRatingSize dsRatingSize52 = dsRatingSize3;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            dsRatingSize2 = dsRatingSize;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            i18 = i13 & 16;
            if (i18 != 0) {
            }
            i19 = i13 & 32;
            if (i19 != 0) {
            }
            i21 = i13 & 64;
            if (i21 != 0) {
            }
            i22 = 128 & i13;
            if (i22 != 0) {
            }
            i23 = 256 & i13;
            if (i23 != 0) {
            }
            i24 = i23;
            if ((i14 & 38347923) == 38347922) {
            }
            if (i29 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 == 0) {
            }
            if (i24 == 0) {
            }
            roundToHalf = roundToHalf(((Number) h.i(Float.valueOf(f11), INDEX_RANGE)).floatValue());
            float gap22 = dsRatingSize2.getGap();
            if (z12) {
            }
            float f1322 = gap22 + f12;
            float iconWidth22 = (5 * (dsRatingSize2.getIconWidth() + f1322)) - f1322;
            u11.o(-349082667);
            q11 = u11.q(roundToHalf);
            C11 = u11.C();
            z13 = z12;
            if (!q11) {
            }
            C11 = C0.a(roundToHalf);
            u11.x(C11);
            InterfaceC3970l0 interfaceC3970l0222 = (InterfaceC3970l0) C11;
            u11.k();
            u11.o(-349080273);
            companion = DsRatingStyle.INSTANCE;
            if (DsRatingStyle.m1768equalsimpl0(m1770getDEFAULTsnpJkgg, companion.m1769getCUSTOMsnpJkgg())) {
            }
            abstractC7799Q5 = abstractC7799Q3;
            function13 = function12;
            k02 = new K0(DsRatingStyle.getSelectedColor(m1770getDEFAULTsnpJkgg, u11, (i14 >> 9) & 14));
            u11.k();
            u11.o(-349075035);
            if (DsRatingStyle.m1768equalsimpl0(m1770getDEFAULTsnpJkgg, companion.m1769getCUSTOMsnpJkgg())) {
            }
            u11.k();
            u11.o(-349066592);
            e v1122 = a0.v(eVar2, null, 3);
            u11.o(-349065924);
            if (z13) {
            }
            u11.k();
            u11.k();
            Y b1122 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f1422 = c.f(u11, v1122);
            int i3222 = i14;
            Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h1122 = Cm.e.h(u11, b1122, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h1122);
            U7.i.b(u11, f1422, -1400986646);
            i27 = 0;
            C3969l c3969l222 = u11;
            while (i27 < 5) {
            }
            c3969l = c3969l222;
            c3969l.k();
            c3969l.f();
            function15 = function14;
            function03 = function02;
            abstractC7799Q6 = abstractC7799Q4;
            z14 = z13;
            abstractC7799Q7 = abstractC7799Q5;
            i28 = i25;
            dsRatingSize3 = dsRatingSize2;
            DsRatingSize dsRatingSize522 = dsRatingSize3;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        dsRatingSize2 = dsRatingSize;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        i18 = i13 & 16;
        if (i18 != 0) {
        }
        i19 = i13 & 32;
        if (i19 != 0) {
        }
        i21 = i13 & 64;
        if (i21 != 0) {
        }
        i22 = 128 & i13;
        if (i22 != 0) {
        }
        i23 = 256 & i13;
        if (i23 != 0) {
        }
        i24 = i23;
        if ((i14 & 38347923) == 38347922) {
        }
        if (i29 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 == 0) {
        }
        if (i24 == 0) {
        }
        roundToHalf = roundToHalf(((Number) h.i(Float.valueOf(f11), INDEX_RANGE)).floatValue());
        float gap222 = dsRatingSize2.getGap();
        if (z12) {
        }
        float f13222 = gap222 + f12;
        float iconWidth222 = (5 * (dsRatingSize2.getIconWidth() + f13222)) - f13222;
        u11.o(-349082667);
        q11 = u11.q(roundToHalf);
        C11 = u11.C();
        z13 = z12;
        if (!q11) {
        }
        C11 = C0.a(roundToHalf);
        u11.x(C11);
        InterfaceC3970l0 interfaceC3970l02222 = (InterfaceC3970l0) C11;
        u11.k();
        u11.o(-349080273);
        companion = DsRatingStyle.INSTANCE;
        if (DsRatingStyle.m1768equalsimpl0(m1770getDEFAULTsnpJkgg, companion.m1769getCUSTOMsnpJkgg())) {
        }
        abstractC7799Q5 = abstractC7799Q3;
        function13 = function12;
        k02 = new K0(DsRatingStyle.getSelectedColor(m1770getDEFAULTsnpJkgg, u11, (i14 >> 9) & 14));
        u11.k();
        u11.o(-349075035);
        if (DsRatingStyle.m1768equalsimpl0(m1770getDEFAULTsnpJkgg, companion.m1769getCUSTOMsnpJkgg())) {
        }
        u11.k();
        u11.o(-349066592);
        e v11222 = a0.v(eVar2, null, 3);
        u11.o(-349065924);
        if (z13) {
        }
        u11.k();
        u11.k();
        Y b11222 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f14222 = c.f(u11, v11222);
        int i32222 = i14;
        Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h11222 = Cm.e.h(u11, b11222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h11222);
        U7.i.b(u11, f14222, -1400986646);
        i27 = 0;
        C3969l c3969l2222 = u11;
        while (i27 < 5) {
        }
        c3969l = c3969l2222;
        c3969l.k();
        c3969l.f();
        function15 = function14;
        function03 = function02;
        abstractC7799Q6 = abstractC7799Q4;
        z14 = z13;
        abstractC7799Q7 = abstractC7799Q5;
        i28 = i25;
        dsRatingSize3 = dsRatingSize2;
        DsRatingSize dsRatingSize5222 = dsRatingSize3;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009e  */
    /* JADX WARN: Type inference failed for: r3v15, types: [l1.Q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsRatingAtom(@NotNull RatingDTO dto, e eVar, Function1<? super AtomAction, Unit> function1, Function1<? super Float, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function13;
        int i15;
        Function1<? super Float, Unit> function14;
        e eVar3;
        Function1<? super AtomAction, Unit> function15;
        RatingDTO.RatingSize size;
        RatingDTO.RatingStyle style;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1;
        AbstractC7799Q k02;
        K0 k03;
        Function1<? super AtomAction, Unit> function16;
        Function1<? super Float, Unit> function17;
        AtomAction atomAction;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-1955969007);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function13 = function1;
                i13 |= u11.F(function13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function14 = function12;
                    i13 |= u11.F(function14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i13 & 1171) == 1170 || !u11.b()) {
                        eVar3 = i16 == 0 ? e.f40358c0 : eVar2;
                        function15 = i14 == 0 ? null : function13;
                        Function1<? super Float, Unit> function18 = i15 == 0 ? null : function14;
                        e testTag = AtomLocatorKt.testTag(AnalyticsModifierKt.viewAnalytics(eVar3, dto), ratingLocator.invoke(dto.getTestInfo()));
                        Float total = dto.getTotal();
                        float floatValue = total == null ? total.floatValue() : 0.0f;
                        size = dto.getSize();
                        if (size == null) {
                            size = RatingDTO.RatingSize.SIZE_500;
                        }
                        DsRatingSize dsSize = DsRatingSizeKt.toDsSize(size);
                        style = dto.getStyle();
                        if (style == null) {
                            style = RatingDTO.RatingStyle.DEFAULT;
                        }
                        int dsStyle = DsRatingStyleKt.toDsStyle(style);
                        Boolean separateClickable = dto.getSeparateClickable();
                        boolean booleanValue = separateClickable == null ? separateClickable.booleanValue() : true;
                        if (function15 == null) {
                            CommonControlSettings common = dto.getCommon();
                            foundationMapperKt$toOnClickLambda$1$1 = (common == null || (atomAction = common.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function15, atomAction);
                        } else {
                            foundationMapperKt$toOnClickLambda$1$1 = null;
                        }
                        RatingDTO.CustomStyle customStyle = dto.getCustomStyle();
                        String starsColor = customStyle == null ? customStyle.getStarsColor() : null;
                        u11.o(-626058202);
                        C7807Z c7807z = starsColor != null ? null : TokenParserKt.tokenToColor(starsColor, u11, 0);
                        u11.k();
                        Function1<? super AtomAction, Unit> function19 = function15;
                        k02 = c7807z == null ? new K0(c7807z.w()) : null;
                        u11.o(-626059025);
                        if (k02 == null) {
                            RatingDTO.CustomStyle customStyle2 = dto.getCustomStyle();
                            UniGradient starsGradient = customStyle2 != null ? customStyle2.getStarsGradient() : null;
                            k02 = starsGradient == null ? null : GradientExtKt.toBrush(starsGradient, u11, UniGradient.$stable);
                        }
                        u11.k();
                        RatingDTO.CustomStyle customStyle3 = dto.getCustomStyle();
                        String starsBackgroundColor = customStyle3 == null ? customStyle3.getStarsBackgroundColor() : null;
                        u11.o(-626053018);
                        C7807Z c7807z2 = starsBackgroundColor != null ? null : TokenParserKt.tokenToColor(starsBackgroundColor, u11, 0);
                        u11.k();
                        k03 = c7807z2 == null ? new K0(c7807z2.w()) : null;
                        u11.o(-626054141);
                        if (k03 == null) {
                            RatingDTO.CustomStyle customStyle4 = dto.getCustomStyle();
                            UniGradient starsBackgroundGradient = customStyle4 != null ? customStyle4.getStarsBackgroundGradient() : null;
                            k03 = starsBackgroundGradient == null ? null : GradientExtKt.toBrush(starsBackgroundGradient, u11, UniGradient.$stable);
                        }
                        u11.k();
                        m1762DsRatingu6rfSSE(floatValue, testTag, dsSize, dsStyle, booleanValue, foundationMapperKt$toOnClickLambda$1$1, function18, k02, k03, u11, (i13 << 9) & 3670016, 0);
                        function16 = function19;
                        function17 = function18;
                    } else {
                        u11.j();
                        eVar3 = eVar2;
                        function16 = function13;
                        function17 = function14;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new DsRatingKt$DsRatingAtom$4(dto, eVar3, function16, function17, i11, i12));
                        return;
                    }
                    return;
                }
                function14 = function12;
                if ((i13 & 1171) == 1170) {
                }
                if (i16 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                e testTag2 = AtomLocatorKt.testTag(AnalyticsModifierKt.viewAnalytics(eVar3, dto), ratingLocator.invoke(dto.getTestInfo()));
                Float total2 = dto.getTotal();
                if (total2 == null) {
                }
                size = dto.getSize();
                if (size == null) {
                }
                DsRatingSize dsSize2 = DsRatingSizeKt.toDsSize(size);
                style = dto.getStyle();
                if (style == null) {
                }
                int dsStyle2 = DsRatingStyleKt.toDsStyle(style);
                Boolean separateClickable2 = dto.getSeparateClickable();
                if (separateClickable2 == null) {
                }
                if (function15 == null) {
                }
                RatingDTO.CustomStyle customStyle5 = dto.getCustomStyle();
                if (customStyle5 == null) {
                }
                u11.o(-626058202);
                if (starsColor != null) {
                }
                u11.k();
                Function1<? super AtomAction, Unit> function192 = function15;
                if (c7807z == null) {
                }
                u11.o(-626059025);
                if (k02 == null) {
                }
                u11.k();
                RatingDTO.CustomStyle customStyle32 = dto.getCustomStyle();
                if (customStyle32 == null) {
                }
                u11.o(-626053018);
                if (starsBackgroundColor != null) {
                }
                u11.k();
                if (c7807z2 == null) {
                }
                u11.o(-626054141);
                if (k03 == null) {
                }
                u11.k();
                m1762DsRatingu6rfSSE(floatValue, testTag2, dsSize2, dsStyle2, booleanValue, foundationMapperKt$toOnClickLambda$1$1, function18, k02, k03, u11, (i13 << 9) & 3670016, 0);
                function16 = function192;
                function17 = function18;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            function13 = function1;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function14 = function12;
            if ((i13 & 1171) == 1170) {
            }
            if (i16 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            e testTag22 = AtomLocatorKt.testTag(AnalyticsModifierKt.viewAnalytics(eVar3, dto), ratingLocator.invoke(dto.getTestInfo()));
            Float total22 = dto.getTotal();
            if (total22 == null) {
            }
            size = dto.getSize();
            if (size == null) {
            }
            DsRatingSize dsSize22 = DsRatingSizeKt.toDsSize(size);
            style = dto.getStyle();
            if (style == null) {
            }
            int dsStyle22 = DsRatingStyleKt.toDsStyle(style);
            Boolean separateClickable22 = dto.getSeparateClickable();
            if (separateClickable22 == null) {
            }
            if (function15 == null) {
            }
            RatingDTO.CustomStyle customStyle52 = dto.getCustomStyle();
            if (customStyle52 == null) {
            }
            u11.o(-626058202);
            if (starsColor != null) {
            }
            u11.k();
            Function1<? super AtomAction, Unit> function1922 = function15;
            if (c7807z == null) {
            }
            u11.o(-626059025);
            if (k02 == null) {
            }
            u11.k();
            RatingDTO.CustomStyle customStyle322 = dto.getCustomStyle();
            if (customStyle322 == null) {
            }
            u11.o(-626053018);
            if (starsBackgroundColor != null) {
            }
            u11.k();
            if (c7807z2 == null) {
            }
            u11.o(-626054141);
            if (k03 == null) {
            }
            u11.k();
            m1762DsRatingu6rfSSE(floatValue, testTag22, dsSize22, dsStyle22, booleanValue, foundationMapperKt$toOnClickLambda$1$1, function18, k02, k03, u11, (i13 << 9) & 3670016, 0);
            function16 = function1922;
            function17 = function18;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function13 = function1;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function14 = function12;
        if ((i13 & 1171) == 1170) {
        }
        if (i16 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        e testTag222 = AtomLocatorKt.testTag(AnalyticsModifierKt.viewAnalytics(eVar3, dto), ratingLocator.invoke(dto.getTestInfo()));
        Float total222 = dto.getTotal();
        if (total222 == null) {
        }
        size = dto.getSize();
        if (size == null) {
        }
        DsRatingSize dsSize222 = DsRatingSizeKt.toDsSize(size);
        style = dto.getStyle();
        if (style == null) {
        }
        int dsStyle222 = DsRatingStyleKt.toDsStyle(style);
        Boolean separateClickable222 = dto.getSeparateClickable();
        if (separateClickable222 == null) {
        }
        if (function15 == null) {
        }
        RatingDTO.CustomStyle customStyle522 = dto.getCustomStyle();
        if (customStyle522 == null) {
        }
        u11.o(-626058202);
        if (starsColor != null) {
        }
        u11.k();
        Function1<? super AtomAction, Unit> function19222 = function15;
        if (c7807z == null) {
        }
        u11.o(-626059025);
        if (k02 == null) {
        }
        u11.k();
        RatingDTO.CustomStyle customStyle3222 = dto.getCustomStyle();
        if (customStyle3222 == null) {
        }
        u11.o(-626053018);
        if (starsBackgroundColor != null) {
        }
        u11.k();
        if (c7807z2 == null) {
        }
        u11.o(-626054141);
        if (k03 == null) {
        }
        u11.k();
        m1762DsRatingu6rfSSE(floatValue, testTag222, dsSize222, dsStyle222, booleanValue, foundationMapperKt$toOnClickLambda$1$1, function18, k02, k03, u11, (i13 << 9) & 3670016, 0);
        function16 = function19222;
        function17 = function18;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    private static final float roundToHalf(float f7) {
        return C6915b.c(f7 * 2.0f) / 2.0f;
    }
}
