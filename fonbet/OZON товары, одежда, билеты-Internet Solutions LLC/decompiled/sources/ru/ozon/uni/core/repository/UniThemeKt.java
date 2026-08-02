package ru.ozon.uni.core.repository;

import Bl0.C2652m;
import J0.C3265a1;
import J0.C3339s;
import J0.C3343t;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import a1.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.DefaultUniColorSchemeKt;
import ru.ozon.uni.core.compose.theme.UniColorScheme;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.repository.UniThemeKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"", "darkTheme", "Lkotlin/Function0;", "", "content", "UniTheme", "(ZLkotlin/jvm/functions/Function2;LS0/k;II)V", "Lru/ozon/uni/core/compose/theme/UniColorScheme;", "lightDsColorScheme", "darkDsColorScheme", "(Lru/ozon/uni/core/compose/theme/UniColorScheme;Lru/ozon/uni/core/compose/theme/UniColorScheme;ZLkotlin/jvm/functions/Function2;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniThemeKt {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if ((r12 & 1) != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniTheme(final boolean z11, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        int i13;
        final Function2<? super InterfaceC3967k, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-1943558397);
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
                UniTheme(DefaultUniColorSchemeKt.getDefaultLightUniColorScheme(), DefaultUniColorSchemeKt.getDefaultDarkUniColorScheme(), z12, function2, u11, (i14 & 896) | 54 | (i14 & 7168), 0);
                z11 = z12;
            } else {
                u11.j();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ml0.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UniTheme$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    int i15 = i11;
                    int i16 = i12;
                    UniTheme$lambda$0 = UniThemeKt.UniTheme$lambda$0(z11, function2, i15, i16, (InterfaceC3967k) obj, intValue);
                    return UniTheme$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UniTheme$lambda$0(boolean z11, Function2 function2, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        UniTheme(z11, function2, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UniTheme$lambda$1(UniColorScheme uniColorScheme, UniColorScheme uniColorScheme2, boolean z11, Function2 function2, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        UniTheme(uniColorScheme, uniColorScheme2, z11, function2, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniTheme(@NotNull final UniColorScheme lightDsColorScheme, @NotNull final UniColorScheme darkDsColorScheme, boolean z11, @NotNull final Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        int i13;
        boolean a11;
        final C3339s e11;
        final boolean z12;
        Intrinsics.checkNotNullParameter(lightDsColorScheme, "lightDsColorScheme");
        Intrinsics.checkNotNullParameter(darkDsColorScheme, "darkDsColorScheme");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-2018607805);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(lightDsColorScheme) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(darkDsColorScheme) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= ((i12 & 4) == 0 && u11.p(z11)) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(content) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            z12 = z11;
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
                int i14 = i12 & 4;
            } else if ((i12 & 4) != 0) {
                a11 = p.a(u11);
                u11.j0();
                UniColorScheme uniColorScheme = !a11 ? darkDsColorScheme : lightDsColorScheme;
                if (!a11) {
                    e11 = C3343t.c();
                } else {
                    e11 = C3343t.e();
                }
                C3996z.a(UniCompositionLocalKt.getLocalUniColorScheme().c(uniColorScheme), c.b(new Function2<InterfaceC3967k, Integer, Unit>() { // from class: ru.ozon.uni.core.repository.UniThemeKt$UniTheme$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                        invoke(interfaceC3967k2, num.intValue());
                        return Unit.f71690a;
                    }

                    public final void invoke(InterfaceC3967k interfaceC3967k2, int i15) {
                        if ((i15 & 3) == 2 && interfaceC3967k2.b()) {
                            interfaceC3967k2.j();
                        } else {
                            C3265a1.a(C3339s.this, null, null, content, interfaceC3967k2, 0);
                        }
                    }
                }, u11, -1950330749), u11, 56);
                z12 = a11;
            }
            a11 = z11;
            u11.j0();
            if (!a11) {
            }
            if (!a11) {
            }
            C3996z.a(UniCompositionLocalKt.getLocalUniColorScheme().c(uniColorScheme), c.b(new Function2<InterfaceC3967k, Integer, Unit>() { // from class: ru.ozon.uni.core.repository.UniThemeKt$UniTheme$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3967k interfaceC3967k2, int i15) {
                    if ((i15 & 3) == 2 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                    } else {
                        C3265a1.a(C3339s.this, null, null, content, interfaceC3967k2, 0);
                    }
                }
            }, u11, -1950330749), u11, 56);
            z12 = a11;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ml0.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UniTheme$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    int i15 = i11;
                    int i16 = i12;
                    UniTheme$lambda$1 = UniThemeKt.UniTheme$lambda$1(UniColorScheme.this, darkDsColorScheme, z12, content, i15, i16, (InterfaceC3967k) obj, intValue);
                    return UniTheme$lambda$1;
                }
            });
        }
    }
}
