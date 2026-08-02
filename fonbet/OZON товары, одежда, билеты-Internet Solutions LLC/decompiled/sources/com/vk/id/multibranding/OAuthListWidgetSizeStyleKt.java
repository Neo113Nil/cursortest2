package com.vk.id.multibranding;

import Hj0.T;
import Sc.o;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.vk.id.multibranding.common.style.OAuthListWidgetSizeStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0003\u001a\u00020\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;", "style", "iconPadding", "(Landroidx/compose/ui/e;Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;)Landroidx/compose/ui/e;", "LZ1/h;", "(Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;)F", "iconSize", "height", "", "heightDp", "(Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;)I", "LZ1/u;", "asFontSize", "(Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;)J", "asLineHeight", "multibranding-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthListWidgetSizeStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OAuthListWidgetSizeStyle.values().length];
            try {
                iArr[OAuthListWidgetSizeStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.SMALL_32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.SMALL_34.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.SMALL_36.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.SMALL_38.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.MEDIUM_40.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.MEDIUM_42.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.MEDIUM_44.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.MEDIUM_46.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.LARGE_48.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.LARGE_50.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.LARGE_52.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.LARGE_54.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OAuthListWidgetSizeStyle.LARGE_56.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long asFontSize(@NotNull OAuthListWidgetSizeStyle oAuthListWidgetSizeStyle) {
        int i11;
        Intrinsics.checkNotNullParameter(oAuthListWidgetSizeStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[oAuthListWidgetSizeStyle.ordinal()]) {
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

    public static final long asLineHeight(@NotNull OAuthListWidgetSizeStyle oAuthListWidgetSizeStyle) {
        int i11;
        Intrinsics.checkNotNullParameter(oAuthListWidgetSizeStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[oAuthListWidgetSizeStyle.ordinal()]) {
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
    public static final e height(@NotNull e eVar, @NotNull OAuthListWidgetSizeStyle style) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return a0.f(eVar, heightDp(style));
    }

    public static final int heightDp(@NotNull OAuthListWidgetSizeStyle oAuthListWidgetSizeStyle) {
        Intrinsics.checkNotNullParameter(oAuthListWidgetSizeStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[oAuthListWidgetSizeStyle.ordinal()]) {
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
    public static final e iconPadding(@NotNull e eVar, @NotNull OAuthListWidgetSizeStyle style) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return androidx.compose.foundation.layout.T.f(eVar, iconPadding(style));
    }

    public static final float iconSize(@NotNull OAuthListWidgetSizeStyle oAuthListWidgetSizeStyle) {
        Intrinsics.checkNotNullParameter(oAuthListWidgetSizeStyle, "<this>");
        int i11 = 28;
        switch (WhenMappings.$EnumSwitchMapping$0[oAuthListWidgetSizeStyle.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i11 = 24;
                break;
            default:
                throw new o();
        }
        return i11;
    }

    public static final float iconPadding(@NotNull OAuthListWidgetSizeStyle oAuthListWidgetSizeStyle) {
        Intrinsics.checkNotNullParameter(oAuthListWidgetSizeStyle, "<this>");
        int i11 = 6;
        switch (WhenMappings.$EnumSwitchMapping$0[oAuthListWidgetSizeStyle.ordinal()]) {
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
