package ru.ozon.uni.core.compose.theme;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.FreshThemeKt;
import ru.ozon.uni.core.repository.UniThemeKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "darkTheme", "Lkotlin/Function0;", "", "content", "FreshTheme", "(ZLkotlin/jvm/functions/Function2;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FreshThemeKt {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if ((r12 & 1) != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FreshTheme(final boolean z11, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        int i13;
        final Function2<? super InterfaceC3967k, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-1448391814);
        if ((i11 & 6) == 0) {
            i13 = (((i12 & 1) == 0 && u11.p(z11)) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(content) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            function2 = content;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                if ((i12 & 1) != 0) {
                    z11 = p.a(u11);
                    i13 &= -15;
                }
                boolean z12 = z11;
                u11.j0();
                int i14 = i13 << 6;
                function2 = content;
                UniThemeKt.UniTheme(FreshColorSchemeKt.getFreshLightColorScheme(), FreshColorSchemeKt.getFreshDarkColorScheme(), z12, function2, u11, (i14 & 896) | 54 | (i14 & 7168), 0);
                z11 = z12;
            } else {
                u11.j();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: kl0.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FreshTheme$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    int i15 = i11;
                    int i16 = i12;
                    FreshTheme$lambda$0 = FreshThemeKt.FreshTheme$lambda$0(z11, function2, i15, i16, (InterfaceC3967k) obj, intValue);
                    return FreshTheme$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreshTheme$lambda$0(boolean z11, Function2 function2, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        FreshTheme(z11, function2, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }
}
