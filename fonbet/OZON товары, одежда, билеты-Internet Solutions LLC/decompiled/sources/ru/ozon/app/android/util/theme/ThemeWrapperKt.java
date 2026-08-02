package ru.ozon.app.android.util.theme;

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
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.core.compose.theme.FreshThemeKt;
import ru.ozon.uni.core.compose.theme.SelectThemeKt;
import ru.ozon.uni.core.repository.UniThemeKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "darkTheme", "Lru/ozon/app/android/utils/AppType;", "appType", "", "miniAppName", "Lkotlin/Function0;", "", "content", "ThemeWrapper", "(ZLru/ozon/app/android/utils/AppType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThemeWrapperKt {
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThemeWrapper(boolean z11, @NotNull AppType appType, @NotNull String miniAppName, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        boolean a11;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(574158993);
        if ((i11 & 6) == 0) {
            i13 = (((i12 & 1) == 0 && u11.p(z11)) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(appType) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(miniAppName) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(content) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            a11 = z11;
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
                if ((i12 & 1) != 0) {
                    i13 &= -15;
                }
            } else if ((i12 & 1) != 0) {
                a11 = p.a(u11);
                i13 &= -15;
                u11.j0();
                if (appType != AppType.SELECT) {
                    u11.o(992122549);
                    SelectThemeKt.SelectTheme(a11, content, u11, ((i13 >> 6) & 112) | (i13 & 14), 0);
                    u11.k();
                } else if (appType == AppType.FRESH || Intrinsics.d(miniAppName, "supermarket")) {
                    u11.o(992125556);
                    FreshThemeKt.FreshTheme(a11, content, u11, ((i13 >> 6) & 112) | (i13 & 14), 0);
                    u11.k();
                } else {
                    u11.o(992127058);
                    UniThemeKt.UniTheme(a11, content, u11, ((i13 >> 6) & 112) | (i13 & 14), 0);
                    u11.k();
                }
            }
            a11 = z11;
            u11.j0();
            if (appType != AppType.SELECT) {
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ThemeWrapperKt$ThemeWrapper$1(a11, appType, miniAppName, content, i11, i12));
        }
    }
}
