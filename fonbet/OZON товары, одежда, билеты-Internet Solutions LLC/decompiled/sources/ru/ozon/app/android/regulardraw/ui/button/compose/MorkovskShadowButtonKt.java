package ru.ozon.app.android.regulardraw.ui.button.compose;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.u3;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import Z1.d;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7785C;
import l1.C7811b0;
import l1.C7845v;
import l1.InterfaceC7802U;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.ui.CompatibleGraphicsLayerKt;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVOKt;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.compose.MorkovskCurrencyBadgeKt;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.uni.atoms.af.AtomAction;
import u0.InterfaceC9893b;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aE\u0010\u0019\u001a\u00020\b*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001aK\u0010$\u001a\u00020\b*\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%\u001ac\u0010.\u001a\u00020\b*\u00020!2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "item", "Landroidx/compose/ui/e;", "modifier", "LZ1/h;", "cornerRadius", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "MorkovskShadowButton-942rkJo", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Landroidx/compose/ui/e;FLkotlin/jvm/functions/Function1;LS0/k;II)V", "MorkovskShadowButton", "Lru/ozon/app/android/regulardraw/ui/button/compose/ThemeColors;", "colors", "MorkovskShadowButtonContent", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Lru/ozon/app/android/regulardraw/ui/button/compose/ThemeColors;LS0/k;I)V", "Lu0/b;", "", "cornerRadiusPx", "shadowOffsetPx", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/BlurMaskFilter;", "blurMaskFilter", "MorkovskShadowButtonBackground", "(Lu0/b;FFLandroid/graphics/Paint;Landroid/graphics/BlurMaskFilter;Lru/ozon/app/android/regulardraw/ui/button/compose/ThemeColors;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO$Theme;", "theme", "Landroid/content/Context;", "context", "getThemeColors", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO$Theme;Landroid/content/Context;)Lru/ozon/app/android/regulardraw/ui/button/compose/ThemeColors;", "Ln1/e;", "width", "height", "drawMorkovskBlurButtonShadows", "(Ln1/e;FFFFLandroid/graphics/Paint;Landroid/graphics/BlurMaskFilter;Lru/ozon/app/android/regulardraw/ui/button/compose/ThemeColors;)V", "left", "top", "right", "bottom", "Ll1/Z;", "color", "drawRoundedRectWithShadow-B3kwjiM", "(Ln1/e;FFFFFFFLandroid/graphics/Paint;Landroid/graphics/BlurMaskFilter;J)V", "drawRoundedRectWithShadow", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskShadowButtonKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MorkovskShadowButtonDTO.Theme.values().length];
            try {
                iArr[MorkovskShadowButtonDTO.Theme.THEME_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MorkovskShadowButtonDTO.Theme.THEME_TRANSPARENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MorkovskShadowButtonDTO.Theme.THEME_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004e  */
    /* renamed from: MorkovskShadowButton-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m913MorkovskShadowButton942rkJo(@NotNull MorkovskShadowButtonDTO item, e eVar, float f7, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        float f11;
        int i15;
        Function1<? super AtomAction, Unit> function12;
        float m915getCornerRadiusDpD9Ej5fM;
        Function1<? super AtomAction, Unit> function13;
        boolean n11;
        Object C11;
        boolean n12;
        Object C12;
        boolean n13;
        Object C13;
        boolean n14;
        Object C14;
        boolean q11;
        Object C15;
        Object b11;
        boolean F11;
        Object C16;
        int I11;
        e eVar3;
        float f12;
        Function1<? super AtomAction, Unit> function14;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(-245363594);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
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
                f11 = f7;
                i13 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function12 = function1;
                    i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i13 & 1171) == 1170 || !u11.b()) {
                        e eVar4 = i16 == 0 ? e.f40358c0 : eVar2;
                        m915getCornerRadiusDpD9Ej5fM = i14 == 0 ? ShadowButtonDefaults.INSTANCE.m915getCornerRadiusDpD9Ej5fM() : f11;
                        function13 = i15 == 0 ? null : function12;
                        Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                        Object theme = item.getTheme();
                        u11.o(-121693051);
                        n11 = u11.n(theme);
                        C11 = u11.C();
                        if (!n11 || C11 == InterfaceC3967k.a.a()) {
                            C11 = getThemeColors(item.getTheme(), context);
                            u11.x(C11);
                        }
                        ThemeColors themeColors = (ThemeColors) C11;
                        u11.k();
                        d dVar = (d) u11.m(K0.e());
                        u11.o(-121688636);
                        n12 = u11.n(dVar);
                        C12 = u11.C();
                        if (!n12 || C12 == InterfaceC3967k.a.a()) {
                            C12 = Float.valueOf(dVar.v1(m915getCornerRadiusDpD9Ej5fM));
                            u11.x(C12);
                        }
                        float floatValue = ((Number) C12).floatValue();
                        u11.k();
                        u11.o(-121685377);
                        n13 = u11.n(dVar);
                        C13 = u11.C();
                        if (!n13 || C13 == InterfaceC3967k.a.a()) {
                            C13 = Float.valueOf(dVar.v1(ShadowButtonDefaults.INSTANCE.m916getShadowBlurRadiusDpD9Ej5fM()));
                            u11.x(C13);
                        }
                        float floatValue2 = ((Number) C13).floatValue();
                        u11.k();
                        u11.o(-121681413);
                        n14 = u11.n(dVar);
                        C14 = u11.C();
                        if (!n14 || C14 == InterfaceC3967k.a.a()) {
                            C14 = Float.valueOf(dVar.v1(ShadowButtonDefaults.INSTANCE.m917getShadowOffsetDpD9Ej5fM()));
                            u11.x(C14);
                        }
                        float floatValue3 = ((Number) C14).floatValue();
                        u11.k();
                        u11.o(-121677532);
                        q11 = u11.q(floatValue3);
                        C15 = u11.C();
                        if (!q11 || C15 == InterfaceC3967k.a.a()) {
                            C15 = new BlurMaskFilter(floatValue2, BlurMaskFilter.Blur.NORMAL);
                            u11.x(C15);
                        }
                        BlurMaskFilter blurMaskFilter = (BlurMaskFilter) C15;
                        b11 = h.b(u11, -121673641);
                        Object obj = b11;
                        if (b11 == InterfaceC3967k.a.a()) {
                            Paint d11 = C7785C.a().d();
                            d11.setAntiAlias(true);
                            d11.setStyle(Paint.Style.FILL);
                            u11.x(d11);
                            obj = d11;
                        }
                        Paint paint = (Paint) obj;
                        u11.k();
                        e e11 = a0.e(a0.h(C6988h.a(eVar4, A0.h.b(m915getCornerRadiusDpD9Ej5fM)), ShadowButtonDefaults.INSTANCE.m918getViewHeightDpD9Ej5fM(), 0.0f, 2), 1.0f);
                        boolean z11 = function13 == null;
                        u11.o(-121661152);
                        F11 = ((i13 & 7168) != 2048) | u11.F(item);
                        C16 = u11.C();
                        if (!F11 || C16 == InterfaceC3967k.a.a()) {
                            C16 = new MorkovskShadowButtonKt$MorkovskShadowButton$1$1(function13, item);
                            u11.x(C16);
                        }
                        u11.k();
                        e c11 = i.c(e11, z11, null, null, (Function0) C16, 6);
                        V f13 = C5185h.f(InterfaceC6250b.a.e(), false);
                        I11 = u11.I();
                        A0 d12 = u11.d();
                        e f14 = c.f(u11, c11);
                        int i17 = i13;
                        Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a11);
                        }
                        Function2 f15 = E.f(u11, f13, u11, d12);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, f15);
                        }
                        F1.b(u11, f14, InterfaceC2801g.a.f());
                        MorkovskShadowButtonBackground(C5187j.f39515a, floatValue, floatValue3, paint, blurMaskFilter, themeColors, null, u11, 6, 32);
                        MorkovskShadowButtonContent(item, themeColors, u11, i17 & 14);
                        u11.f();
                        eVar3 = eVar4;
                        f12 = m915getCornerRadiusDpD9Ej5fM;
                        function14 = function13;
                    } else {
                        u11.j();
                        eVar3 = eVar2;
                        f12 = f11;
                        function14 = function12;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new MorkovskShadowButtonKt$MorkovskShadowButton$3(item, eVar3, f12, function14, i11, i12));
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i13 & 1171) == 1170) {
                }
                if (i16 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                Object theme2 = item.getTheme();
                u11.o(-121693051);
                n11 = u11.n(theme2);
                C11 = u11.C();
                if (!n11) {
                }
                C11 = getThemeColors(item.getTheme(), context2);
                u11.x(C11);
                ThemeColors themeColors2 = (ThemeColors) C11;
                u11.k();
                d dVar2 = (d) u11.m(K0.e());
                u11.o(-121688636);
                n12 = u11.n(dVar2);
                C12 = u11.C();
                if (!n12) {
                }
                C12 = Float.valueOf(dVar2.v1(m915getCornerRadiusDpD9Ej5fM));
                u11.x(C12);
                float floatValue4 = ((Number) C12).floatValue();
                u11.k();
                u11.o(-121685377);
                n13 = u11.n(dVar2);
                C13 = u11.C();
                if (!n13) {
                }
                C13 = Float.valueOf(dVar2.v1(ShadowButtonDefaults.INSTANCE.m916getShadowBlurRadiusDpD9Ej5fM()));
                u11.x(C13);
                float floatValue22 = ((Number) C13).floatValue();
                u11.k();
                u11.o(-121681413);
                n14 = u11.n(dVar2);
                C14 = u11.C();
                if (!n14) {
                }
                C14 = Float.valueOf(dVar2.v1(ShadowButtonDefaults.INSTANCE.m917getShadowOffsetDpD9Ej5fM()));
                u11.x(C14);
                float floatValue32 = ((Number) C14).floatValue();
                u11.k();
                u11.o(-121677532);
                q11 = u11.q(floatValue32);
                C15 = u11.C();
                if (!q11) {
                }
                C15 = new BlurMaskFilter(floatValue22, BlurMaskFilter.Blur.NORMAL);
                u11.x(C15);
                BlurMaskFilter blurMaskFilter2 = (BlurMaskFilter) C15;
                b11 = h.b(u11, -121673641);
                Object obj2 = b11;
                if (b11 == InterfaceC3967k.a.a()) {
                }
                Paint paint2 = (Paint) obj2;
                u11.k();
                e e112 = a0.e(a0.h(C6988h.a(eVar4, A0.h.b(m915getCornerRadiusDpD9Ej5fM)), ShadowButtonDefaults.INSTANCE.m918getViewHeightDpD9Ej5fM(), 0.0f, 2), 1.0f);
                if (function13 == null) {
                }
                u11.o(-121661152);
                F11 = ((i13 & 7168) != 2048) | u11.F(item);
                C16 = u11.C();
                if (!F11) {
                }
                C16 = new MorkovskShadowButtonKt$MorkovskShadowButton$1$1(function13, item);
                u11.x(C16);
                u11.k();
                e c112 = i.c(e112, z11, null, null, (Function0) C16, 6);
                V f132 = C5185h.f(InterfaceC6250b.a.e(), false);
                I11 = u11.I();
                A0 d122 = u11.d();
                e f142 = c.f(u11, c112);
                int i172 = i13;
                Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f152 = E.f(u11, f132, u11, d122);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f152);
                F1.b(u11, f142, InterfaceC2801g.a.f());
                MorkovskShadowButtonBackground(C5187j.f39515a, floatValue4, floatValue32, paint2, blurMaskFilter2, themeColors2, null, u11, 6, 32);
                MorkovskShadowButtonContent(item, themeColors2, u11, i172 & 14);
                u11.f();
                eVar3 = eVar4;
                f12 = m915getCornerRadiusDpD9Ej5fM;
                function14 = function13;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            f11 = f7;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function12 = function1;
            if ((i13 & 1171) == 1170) {
            }
            if (i16 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            Context context22 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            Object theme22 = item.getTheme();
            u11.o(-121693051);
            n11 = u11.n(theme22);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = getThemeColors(item.getTheme(), context22);
            u11.x(C11);
            ThemeColors themeColors22 = (ThemeColors) C11;
            u11.k();
            d dVar22 = (d) u11.m(K0.e());
            u11.o(-121688636);
            n12 = u11.n(dVar22);
            C12 = u11.C();
            if (!n12) {
            }
            C12 = Float.valueOf(dVar22.v1(m915getCornerRadiusDpD9Ej5fM));
            u11.x(C12);
            float floatValue42 = ((Number) C12).floatValue();
            u11.k();
            u11.o(-121685377);
            n13 = u11.n(dVar22);
            C13 = u11.C();
            if (!n13) {
            }
            C13 = Float.valueOf(dVar22.v1(ShadowButtonDefaults.INSTANCE.m916getShadowBlurRadiusDpD9Ej5fM()));
            u11.x(C13);
            float floatValue222 = ((Number) C13).floatValue();
            u11.k();
            u11.o(-121681413);
            n14 = u11.n(dVar22);
            C14 = u11.C();
            if (!n14) {
            }
            C14 = Float.valueOf(dVar22.v1(ShadowButtonDefaults.INSTANCE.m917getShadowOffsetDpD9Ej5fM()));
            u11.x(C14);
            float floatValue322 = ((Number) C14).floatValue();
            u11.k();
            u11.o(-121677532);
            q11 = u11.q(floatValue322);
            C15 = u11.C();
            if (!q11) {
            }
            C15 = new BlurMaskFilter(floatValue222, BlurMaskFilter.Blur.NORMAL);
            u11.x(C15);
            BlurMaskFilter blurMaskFilter22 = (BlurMaskFilter) C15;
            b11 = h.b(u11, -121673641);
            Object obj22 = b11;
            if (b11 == InterfaceC3967k.a.a()) {
            }
            Paint paint22 = (Paint) obj22;
            u11.k();
            e e1122 = a0.e(a0.h(C6988h.a(eVar4, A0.h.b(m915getCornerRadiusDpD9Ej5fM)), ShadowButtonDefaults.INSTANCE.m918getViewHeightDpD9Ej5fM(), 0.0f, 2), 1.0f);
            if (function13 == null) {
            }
            u11.o(-121661152);
            F11 = ((i13 & 7168) != 2048) | u11.F(item);
            C16 = u11.C();
            if (!F11) {
            }
            C16 = new MorkovskShadowButtonKt$MorkovskShadowButton$1$1(function13, item);
            u11.x(C16);
            u11.k();
            e c1122 = i.c(e1122, z11, null, null, (Function0) C16, 6);
            V f1322 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d1222 = u11.d();
            e f1422 = c.f(u11, c1122);
            int i1722 = i13;
            Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f1522 = E.f(u11, f1322, u11, d1222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f1522);
            F1.b(u11, f1422, InterfaceC2801g.a.f());
            MorkovskShadowButtonBackground(C5187j.f39515a, floatValue42, floatValue322, paint22, blurMaskFilter22, themeColors22, null, u11, 6, 32);
            MorkovskShadowButtonContent(item, themeColors22, u11, i1722 & 14);
            u11.f();
            eVar3 = eVar4;
            f12 = m915getCornerRadiusDpD9Ej5fM;
            function14 = function13;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        f11 = f7;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function12 = function1;
        if ((i13 & 1171) == 1170) {
        }
        if (i16 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        Context context222 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
        Object theme222 = item.getTheme();
        u11.o(-121693051);
        n11 = u11.n(theme222);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = getThemeColors(item.getTheme(), context222);
        u11.x(C11);
        ThemeColors themeColors222 = (ThemeColors) C11;
        u11.k();
        d dVar222 = (d) u11.m(K0.e());
        u11.o(-121688636);
        n12 = u11.n(dVar222);
        C12 = u11.C();
        if (!n12) {
        }
        C12 = Float.valueOf(dVar222.v1(m915getCornerRadiusDpD9Ej5fM));
        u11.x(C12);
        float floatValue422 = ((Number) C12).floatValue();
        u11.k();
        u11.o(-121685377);
        n13 = u11.n(dVar222);
        C13 = u11.C();
        if (!n13) {
        }
        C13 = Float.valueOf(dVar222.v1(ShadowButtonDefaults.INSTANCE.m916getShadowBlurRadiusDpD9Ej5fM()));
        u11.x(C13);
        float floatValue2222 = ((Number) C13).floatValue();
        u11.k();
        u11.o(-121681413);
        n14 = u11.n(dVar222);
        C14 = u11.C();
        if (!n14) {
        }
        C14 = Float.valueOf(dVar222.v1(ShadowButtonDefaults.INSTANCE.m917getShadowOffsetDpD9Ej5fM()));
        u11.x(C14);
        float floatValue3222 = ((Number) C14).floatValue();
        u11.k();
        u11.o(-121677532);
        q11 = u11.q(floatValue3222);
        C15 = u11.C();
        if (!q11) {
        }
        C15 = new BlurMaskFilter(floatValue2222, BlurMaskFilter.Blur.NORMAL);
        u11.x(C15);
        BlurMaskFilter blurMaskFilter222 = (BlurMaskFilter) C15;
        b11 = h.b(u11, -121673641);
        Object obj222 = b11;
        if (b11 == InterfaceC3967k.a.a()) {
        }
        Paint paint222 = (Paint) obj222;
        u11.k();
        e e11222 = a0.e(a0.h(C6988h.a(eVar4, A0.h.b(m915getCornerRadiusDpD9Ej5fM)), ShadowButtonDefaults.INSTANCE.m918getViewHeightDpD9Ej5fM(), 0.0f, 2), 1.0f);
        if (function13 == null) {
        }
        u11.o(-121661152);
        F11 = ((i13 & 7168) != 2048) | u11.F(item);
        C16 = u11.C();
        if (!F11) {
        }
        C16 = new MorkovskShadowButtonKt$MorkovskShadowButton$1$1(function13, item);
        u11.x(C16);
        u11.k();
        e c11222 = i.c(e11222, z11, null, null, (Function0) C16, 6);
        V f13222 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d12222 = u11.d();
        e f14222 = c.f(u11, c11222);
        int i17222 = i13;
        Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f15222 = E.f(u11, f13222, u11, d12222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f15222);
        F1.b(u11, f14222, InterfaceC2801g.a.f());
        MorkovskShadowButtonBackground(C5187j.f39515a, floatValue422, floatValue3222, paint222, blurMaskFilter222, themeColors222, null, u11, 6, 32);
        MorkovskShadowButtonContent(item, themeColors222, u11, i17222 & 14);
        u11.f();
        eVar3 = eVar4;
        f12 = m915getCornerRadiusDpD9Ej5fM;
        function14 = function13;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MorkovskShadowButtonBackground(InterfaceC9893b interfaceC9893b, float f7, float f11, Paint paint, BlurMaskFilter blurMaskFilter, ThemeColors themeColors, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        float f12;
        float f13;
        Paint paint2;
        BlurMaskFilter blurMaskFilter2;
        ThemeColors themeColors2;
        e eVar2;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-169770283);
        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC9893b) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
            f12 = f7;
        } else {
            f12 = f7;
            if ((i11 & 48) == 0) {
                i13 |= u11.q(f12) ? 32 : 16;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 384;
            f13 = f11;
        } else {
            f13 = f11;
            if ((i11 & 384) == 0) {
                i13 |= u11.q(f13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        if ((i12 & 4) != 0) {
            i13 |= 3072;
            paint2 = paint;
        } else {
            paint2 = paint;
            if ((i11 & 3072) == 0) {
                i13 |= u11.F(paint2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 24576;
            blurMaskFilter2 = blurMaskFilter;
        } else {
            blurMaskFilter2 = blurMaskFilter;
            if ((i11 & 24576) == 0) {
                i13 |= u11.F(blurMaskFilter2) ? 16384 : 8192;
            }
        }
        if ((i12 & 16) != 0) {
            i13 |= 196608;
            themeColors2 = themeColors;
        } else {
            themeColors2 = themeColors;
            if ((i11 & 196608) == 0) {
                i13 |= u11.n(themeColors2) ? 131072 : 65536;
            }
        }
        int i14 = i12 & 32;
        if (i14 != 0) {
            i13 |= 1572864;
        } else if ((1572864 & i11) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 1048576 : 524288;
            if ((i13 & 599187) == 599186 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                CompatibleGraphicsLayerKt.CompatibleGraphicsLayer(interfaceC9893b.b(eVar4), a1.c.c(-1331759397, new MorkovskShadowButtonKt$MorkovskShadowButtonBackground$1(eVar4, f12, f13, paint2, blurMaskFilter2, themeColors2), u11), u11, 48, 0);
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new MorkovskShadowButtonKt$MorkovskShadowButtonBackground$2(interfaceC9893b, f7, f11, paint, blurMaskFilter, themeColors, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 599187) == 599186) {
        }
        if (i14 == 0) {
        }
        CompatibleGraphicsLayerKt.CompatibleGraphicsLayer(interfaceC9893b.b(eVar4), a1.c.c(-1331759397, new MorkovskShadowButtonKt$MorkovskShadowButtonBackground$1(eVar4, f12, f13, paint2, blurMaskFilter2, themeColors2), u11), u11, 48, 0);
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MorkovskShadowButtonContent(MorkovskShadowButtonDTO morkovskShadowButtonDTO, ThemeColors themeColors, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-926500154);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(morkovskShadowButtonDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(themeColors) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = e.f40358c0;
            e h11 = T.h(aVar, 16, 0.0f, 2);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h12);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u3.b(morkovskShadowButtonDTO.getTitle(), null, themeColors.getTextColor(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, RegularDrawTypographyKt.getText_20_20_W800(), u11, 0, 3120, 55290);
            MorkovskCurrencyBadgeDTO balance = morkovskShadowButtonDTO.getBalance();
            MorkovskCurrencyBadgeVO map = balance != null ? MorkovskCurrencyBadgeVOKt.map(balance, MorkovskCurrencyBadgeVO.Size.DEFAULT) : null;
            u11.o(1671230843);
            if (map != null) {
                MorkovskCurrencyBadgeKt.MorkovskCurrencyBadge(map, T.j(aVar, 8, 0.0f, 0.0f, 0.0f, 14), null, u11, AtomAction.$stable | 48, 4);
            }
            c3969l = u11;
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new MorkovskShadowButtonKt$MorkovskShadowButtonContent$2(morkovskShadowButtonDTO, themeColors, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawMorkovskBlurButtonShadows(InterfaceC8412e interfaceC8412e, float f7, float f11, float f12, float f13, Paint paint, BlurMaskFilter blurMaskFilter, ThemeColors themeColors) {
        m914drawRoundedRectWithShadowB3kwjiM(interfaceC8412e, 0.0f, 0.0f, f7, f11, f7, f11, f12, paint, blurMaskFilter, themeColors.getDarkShadowColor2());
        float f14 = f7 - f13;
        float f15 = f11 - f13;
        m914drawRoundedRectWithShadowB3kwjiM(interfaceC8412e, f13, f13, f14, f15, f7, f11, f12, paint, blurMaskFilter, themeColors.getDarkShadowColor1());
        float f16 = -f13;
        float f17 = 2 * f13;
        m914drawRoundedRectWithShadowB3kwjiM(interfaceC8412e, f16, f16, f7 - f17, f11 - f17, f7, f11, f12, paint, blurMaskFilter, themeColors.getLightShadowColor());
        m914drawRoundedRectWithShadowB3kwjiM(interfaceC8412e, f13, f13, f14, f15, f7, f11, f12, paint, blurMaskFilter, themeColors.getButtonColor());
    }

    /* renamed from: drawRoundedRectWithShadow-B3kwjiM, reason: not valid java name */
    private static final void m914drawRoundedRectWithShadowB3kwjiM(InterfaceC8412e interfaceC8412e, float f7, float f11, float f12, float f13, float f14, float f15, float f16, Paint paint, BlurMaskFilter blurMaskFilter, long j11) {
        InterfaceC7802U a11 = interfaceC8412e.w0().a();
        int saveLayer = C7845v.b(a11).saveLayer(0.0f, 0.0f, f14, f15, null);
        Canvas b11 = C7845v.b(a11);
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, f14, f15), f16, f16, Path.Direction.CCW);
        b11.clipPath(path);
        paint.setColor(C7811b0.i(j11));
        paint.setMaskFilter(blurMaskFilter);
        C7845v.b(a11).drawRoundRect(f7, f11, f12, f13, f16, f16, paint);
        C7845v.b(a11).restoreToCount(saveLayer);
    }

    private static final ThemeColors getThemeColors(MorkovskShadowButtonDTO.Theme theme, Context context) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return new ThemeColors(C7811b0.b(UtilKt.parseColor(R$color.shadow_button_primary, context)), C7811b0.b(UtilKt.parseColor(R$color.shadow_button_light_primary, context)), C7811b0.b(UtilKt.parseColor(R$color.shadow_button_shadow_color_1_primary, context)), C7811b0.b(UtilKt.parseColor(R$color.shadow_button_shadow_color_2_primary, context)), C7811b0.b(UtilKt.parseColor(R$color.shadow_button_text_color_primary, context)), null);
        }
        if (i11 == 3) {
            return new ThemeColors(C7811b0.b(UtilKt.parseColor(R$color.shadow_button_secondary, context)), C7811b0.b(UtilKt.parseColor(R$color.shadow_button_light_secondary, context)), C7811b0.b(UtilKt.parseColor(R$color.shadow_button_shadow_color_1_secondary, context)), C7811b0.b(UtilKt.parseColor(R$color.shadow_button_shadow_color_2_secondary, context)), C7811b0.b(UtilKt.parseColor(R$color.shadow_button_text_color_secondary, context)), null);
        }
        throw new o();
    }
}
