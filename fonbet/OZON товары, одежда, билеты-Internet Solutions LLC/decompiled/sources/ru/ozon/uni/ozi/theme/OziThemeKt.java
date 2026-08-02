package ru.ozon.uni.ozi.theme;

import J0.C3265a1;
import J0.C3343t;
import S0.B1;
import S0.C3969l;
import S0.G0;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import Sc.o;
import a1.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u000b\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "isDarkTheme", "Lkotlin/Function0;", "", "content", "OziTheme", "(ZLkotlin/jvm/functions/Function2;LS0/k;II)V", "Lru/ozon/uni/ozi/theme/OziMiniAppColorScheme;", "colorScheme", "Lru/ozon/uni/ozi/theme/OziColorTheme;", "colorTheme", "(Lru/ozon/uni/ozi/theme/OziMiniAppColorScheme;Lru/ozon/uni/ozi/theme/OziColorTheme;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "LS0/G0;", "Lru/ozon/uni/ozi/theme/OziColorScheme;", "LocalOziColors", "LS0/G0;", "getLocalOziColors", "()LS0/G0;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziThemeKt {

    @NotNull
    private static final G0<OziColorScheme> LocalOziColors = new B1(OziThemeKt$LocalOziColors$1.INSTANCE);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OziMiniAppColorScheme.values().length];
            try {
                iArr[OziMiniAppColorScheme.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziMiniAppColorScheme.Fresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OziColorTheme.values().length];
            try {
                iArr2[OziColorTheme.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OziColorTheme.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if ((r11 & 1) != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OziTheme(boolean z11, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(276344835);
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
                u11.j0();
                function2 = content;
                OziTheme(OziMiniAppColorScheme.Default, z11 ? OziColorTheme.Dark : OziColorTheme.Light, function2, u11, ((i13 << 3) & 896) | 6, 0);
            } else {
                u11.j();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OziThemeKt$OziTheme$1(z11, function2, i11, i12));
        }
    }

    @NotNull
    public static final G0<OziColorScheme> getLocalOziColors() {
        return LocalOziColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OziTheme(@NotNull OziMiniAppColorScheme colorScheme, OziColorTheme oziColorTheme, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        OziColorTheme oziColorTheme2;
        int i14;
        OziColorScheme defaultLightOziColorScheme;
        OziColorTheme oziColorTheme3;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-1673885201);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(colorScheme) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= ((i12 & 2) == 0 && u11.n(oziColorTheme)) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(content) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            oziColorTheme3 = oziColorTheme;
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
                int i15 = i12 & 2;
            } else if ((i12 & 2) != 0) {
                oziColorTheme2 = p.a(u11) ? OziColorTheme.Dark : OziColorTheme.Light;
                u11.j0();
                i14 = WhenMappings.$EnumSwitchMapping$1[oziColorTheme2.ordinal()];
                if (i14 != 1) {
                    int i16 = WhenMappings.$EnumSwitchMapping$0[colorScheme.ordinal()];
                    if (i16 == 1) {
                        defaultLightOziColorScheme = DefaultLightOziColorSchemeKt.getDefaultLightOziColorScheme();
                    } else if (i16 == 2) {
                        defaultLightOziColorScheme = FreshOziColorSchemeKt.getFreshLightOziColorScheme();
                    } else {
                        throw new o();
                    }
                } else if (i14 == 2) {
                    int i17 = WhenMappings.$EnumSwitchMapping$0[colorScheme.ordinal()];
                    if (i17 == 1) {
                        defaultLightOziColorScheme = DefaultDarkOziColorSchemeKt.getDefaultDarkOziColorScheme();
                    } else if (i17 == 2) {
                        defaultLightOziColorScheme = FreshOziColorSchemeKt.getFreshDarkOziColorScheme();
                    } else {
                        throw new o();
                    }
                } else {
                    throw new o();
                }
                C3265a1.a(!p.a(u11) ? C3343t.c() : C3343t.e(), null, null, c.c(-551370597, new OziThemeKt$OziTheme$2(defaultLightOziColorScheme, content), u11), u11, 3072);
                oziColorTheme3 = oziColorTheme2;
            }
            oziColorTheme2 = oziColorTheme;
            u11.j0();
            i14 = WhenMappings.$EnumSwitchMapping$1[oziColorTheme2.ordinal()];
            if (i14 != 1) {
            }
            C3265a1.a(!p.a(u11) ? C3343t.c() : C3343t.e(), null, null, c.c(-551370597, new OziThemeKt$OziTheme$2(defaultLightOziColorScheme, content), u11), u11, 3072);
            oziColorTheme3 = oziColorTheme2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OziThemeKt$OziTheme$3(colorScheme, oziColorTheme3, content, i11, i12));
        }
    }
}
