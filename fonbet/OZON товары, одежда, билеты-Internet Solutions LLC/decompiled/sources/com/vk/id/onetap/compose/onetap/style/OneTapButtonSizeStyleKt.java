package com.vk.id.onetap.compose.onetap.style;

import Hj0.T;
import Sc.o;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.vk.id.onetap.common.button.style.OneTapButtonSizeStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0003\u001a\u00020\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "style", "iconPadding", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;)Landroidx/compose/ui/e;", "LZ1/h;", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;)F", "height", "", "heightDp", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;)I", "LZ1/u;", "asFontSize", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;)J", "asLineHeight", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapButtonSizeStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneTapButtonSizeStyle.values().length];
            try {
                iArr[OneTapButtonSizeStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneTapButtonSizeStyle.SMALL_32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneTapButtonSizeStyle.SMALL_34.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OneTapButtonSizeStyle.SMALL_36.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OneTapButtonSizeStyle.SMALL_38.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OneTapButtonSizeStyle.MEDIUM_40.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OneTapButtonSizeStyle.MEDIUM_42.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OneTapButtonSizeStyle.MEDIUM_44.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OneTapButtonSizeStyle.MEDIUM_46.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OneTapButtonSizeStyle.LARGE_48.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OneTapButtonSizeStyle.LARGE_50.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OneTapButtonSizeStyle.LARGE_52.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OneTapButtonSizeStyle.LARGE_54.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OneTapButtonSizeStyle.LARGE_56.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long asFontSize(@NotNull OneTapButtonSizeStyle oneTapButtonSizeStyle) {
        int i11;
        Intrinsics.checkNotNullParameter(oneTapButtonSizeStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[oneTapButtonSizeStyle.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                i11 = 16;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i11 = 14;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                i11 = 17;
                break;
            default:
                throw new o();
        }
        return T.d(i11);
    }

    public static final long asLineHeight(@NotNull OneTapButtonSizeStyle oneTapButtonSizeStyle) {
        int i11;
        Intrinsics.checkNotNullParameter(oneTapButtonSizeStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[oneTapButtonSizeStyle.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                i11 = 20;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i11 = 18;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                i11 = 22;
                break;
            default:
                throw new o();
        }
        return T.d(i11);
    }

    @NotNull
    public static final e height(@NotNull e eVar, @NotNull OneTapButtonSizeStyle style) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return a0.f(eVar, heightDp(style));
    }

    public static final int heightDp(@NotNull OneTapButtonSizeStyle oneTapButtonSizeStyle) {
        Intrinsics.checkNotNullParameter(oneTapButtonSizeStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[oneTapButtonSizeStyle.ordinal()]) {
            case 1:
                return 44;
            case 2:
                return 32;
            case 3:
                return 34;
            case 4:
                return 36;
            case 5:
                return 38;
            case 6:
                return 40;
            case 7:
                return 42;
            case 8:
                return 44;
            case 9:
                return 46;
            case 10:
                return 48;
            case 11:
                return 50;
            case 12:
                return 52;
            case 13:
                return 54;
            case 14:
                return 56;
            default:
                throw new o();
        }
    }

    @NotNull
    public static final e iconPadding(@NotNull e eVar, @NotNull OneTapButtonSizeStyle style) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return androidx.compose.foundation.layout.T.f(eVar, iconPadding(style));
    }

    public static final float iconPadding(@NotNull OneTapButtonSizeStyle oneTapButtonSizeStyle) {
        Intrinsics.checkNotNullParameter(oneTapButtonSizeStyle, "<this>");
        int i11 = 6;
        switch (WhenMappings.$EnumSwitchMapping$0[oneTapButtonSizeStyle.ordinal()]) {
            case 1:
            case 8:
                i11 = 8;
                break;
            case 2:
                i11 = 4;
                break;
            case 3:
                i11 = 5;
                break;
            case 4:
            case 6:
                break;
            case 5:
            case 7:
                i11 = 7;
                break;
            case 9:
                i11 = 9;
                break;
            case 10:
                i11 = 10;
                break;
            case 11:
                i11 = 11;
                break;
            case 12:
                i11 = 12;
                break;
            case 13:
                i11 = 13;
                break;
            case 14:
                i11 = 14;
                break;
            default:
                throw new o();
        }
        return i11;
    }
}
