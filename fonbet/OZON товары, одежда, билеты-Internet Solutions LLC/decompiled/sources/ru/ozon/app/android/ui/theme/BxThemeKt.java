package ru.ozon.app.android.ui.theme;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.core.compose.theme.FreshThemeKt;
import ru.ozon.uni.core.compose.theme.SelectThemeKt;
import ru.ozon.uni.core.repository.UniThemeKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "darkTheme", "", "themeResId", "Lkotlin/Function0;", "", "content", "BxTheme", "(ZILkotlin/jvm/functions/Function2;LS0/k;II)V", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BxThemeKt {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0078, code lost:
    
        if ((r14 & 2) != 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BxTheme(boolean z11, int i11, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        int i14;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(69357860);
        if ((i12 & 6) == 0) {
            i14 = (((i13 & 1) == 0 && u11.p(z11)) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= ((i13 & 2) == 0 && u11.r(i11)) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            i14 |= u11.F(content) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i12 & 1) == 0 || u11.w0()) {
                if ((i13 & 1) != 0) {
                    z11 = p.a(u11);
                    i14 &= -15;
                }
                if ((i13 & 2) != 0) {
                    i11 = R$style.OzonTheme;
                    i14 &= -113;
                }
                u11.j0();
                if (i11 == ru.ozon.app.android.fresh.navigation.R$style.FreshActivityTheme) {
                    u11.o(-1684097737);
                    FreshThemeKt.FreshTheme(z11, content, u11, ((i14 >> 3) & 112) | (i14 & 14), 0);
                    u11.k();
                } else if (i11 == ru.ozon.app.android.select.feature.entry.R$style.OzonSelectTheme) {
                    u11.o(-1684094312);
                    SelectThemeKt.SelectTheme(z11, content, u11, ((i14 >> 3) & 112) | (i14 & 14), 0);
                    u11.k();
                } else {
                    u11.o(-1684092779);
                    UniThemeKt.UniTheme(z11, content, u11, ((i14 >> 3) & 112) | (i14 & 14), 0);
                    u11.k();
                }
            } else {
                u11.j();
                if ((i13 & 1) != 0) {
                    i14 &= -15;
                }
            }
        }
        boolean z12 = z11;
        int i15 = i11;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BxThemeKt$BxTheme$1(z12, i15, content, i12, i13));
        }
    }
}
