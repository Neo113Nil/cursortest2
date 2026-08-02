package com.vk.id.onetap.common.button.style;

import Sc.o;
import com.vk.id.onetap.common.icon.style.InternalVKIconSizeStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"internalVKIDAsIconSizeStyle", "Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "onetap-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
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

    @NotNull
    public static final InternalVKIconSizeStyle internalVKIDAsIconSizeStyle(@NotNull OneTapButtonSizeStyle oneTapButtonSizeStyle) {
        Intrinsics.checkNotNullParameter(oneTapButtonSizeStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[oneTapButtonSizeStyle.ordinal()]) {
            case 1:
                return InternalVKIconSizeStyle.NORMAL;
            case 2:
            case 3:
            case 4:
            case 5:
                return InternalVKIconSizeStyle.SMALL;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return InternalVKIconSizeStyle.NORMAL;
            default:
                throw new o();
        }
    }
}
