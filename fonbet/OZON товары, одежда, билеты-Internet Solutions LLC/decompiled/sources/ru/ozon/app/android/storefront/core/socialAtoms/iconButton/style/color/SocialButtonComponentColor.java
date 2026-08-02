package ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.color;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Style;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/color/SocialButtonComponentColor;", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/color/SocialButtonColor;", "style", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;)V", "getSemanticColor", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialButtonComponentColor extends SocialButtonColor {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.STYLE_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Style.STYLE_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Style.STYLE_EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Style.STYLE_NEUTRAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Style.STYLE_NEGATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Style.STYLE_DISABLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Style.STYLE_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Style.STYLE_PRIMARY_BLACK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Style.STYLE_SECONDARY_BLACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Style.STYLE_PRIMARY_WHITE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Style.STYLE_SECONDARY_WHITE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Style.STYLE_CLEAR_NEUTRAL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Style.STYLE_CLEAR_PRIMARY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialButtonComponentColor(@NotNull Style style) {
        super(style);
        Intrinsics.checkNotNullParameter(style, "style");
    }

    @NotNull
    public String getSemanticColor() {
        StyleParser.OzColor ozColor;
        switch (WhenMappings.$EnumSwitchMapping$0[getStyle().ordinal()]) {
            case 1:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE;
                break;
            case 2:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY;
                break;
            case 3:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE;
                break;
            case 4:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY;
                break;
            case 5:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_CTRL_NEGATIVE;
                break;
            case 6:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_QUATERNARY;
                break;
            case 7:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE;
                break;
            case 8:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE;
                break;
            case 9:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_VIDEOPLEER;
                break;
            case 10:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_VIDEOPLEER;
                break;
            case 11:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE;
                break;
            case 12:
                ozColor = StyleParser.OzColor.OZ_COLOR_WHITE_OVERLAY_2_CONST;
                break;
            case 13:
                ozColor = StyleParser.OzColor.OZ_SEMANTIC_TEXT_ACTION;
                break;
            default:
                throw new o();
        }
        return ozColor.getValue();
    }
}
