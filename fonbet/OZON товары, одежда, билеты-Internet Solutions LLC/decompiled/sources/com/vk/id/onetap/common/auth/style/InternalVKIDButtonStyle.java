package com.vk.id.onetap.common.auth.style;

import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonElevationStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonSizeStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonSizeStyleKt;
import com.vk.id.onetap.common.icon.style.InternalVKIconColorStyle;
import com.vk.id.onetap.common.icon.style.InternalVKIconStyle;
import com.vk.id.onetap.common.progress.style.InternalCircleProgressStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000512345BQ\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100\u0082\u0001\u00056789:¨\u0006;"}, d2 = {"Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBackgroundStyle;", "backgroundStyle", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonRippleStyle;", "rippleStyle", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBorderStyle;", "borderStyle", "Lcom/vk/id/onetap/common/icon/style/InternalVKIconStyle;", "iconStyle", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonTextStyle;", "textStyle", "Lcom/vk/id/onetap/common/progress/style/InternalCircleProgressStyle;", "progressStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "elevationStyle", "<init>", "(Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBackgroundStyle;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonRippleStyle;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBorderStyle;Lcom/vk/id/onetap/common/icon/style/InternalVKIconStyle;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonTextStyle;Lcom/vk/id/onetap/common/progress/style/InternalCircleProgressStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBackgroundStyle;", "getBackgroundStyle", "()Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBackgroundStyle;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonRippleStyle;", "getRippleStyle", "()Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonRippleStyle;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBorderStyle;", "getBorderStyle", "()Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBorderStyle;", "Lcom/vk/id/onetap/common/icon/style/InternalVKIconStyle;", "getIconStyle", "()Lcom/vk/id/onetap/common/icon/style/InternalVKIconStyle;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonTextStyle;", "getTextStyle", "()Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonTextStyle;", "Lcom/vk/id/onetap/common/progress/style/InternalCircleProgressStyle;", "getProgressStyle", "()Lcom/vk/id/onetap/common/progress/style/InternalCircleProgressStyle;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "getCornersStyle", "()Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "getSizeStyle", "()Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "getElevationStyle", "()Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "Light", "Dark", "Secondary", "TransparentLight", "TransparentDark", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$Dark;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$Light;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$Secondary;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$TransparentDark;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$TransparentLight;", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class InternalVKIDButtonStyle {

    @NotNull
    private final InternalVKIDButtonBackgroundStyle backgroundStyle;

    @NotNull
    private final InternalVKIDButtonBorderStyle borderStyle;

    @NotNull
    private final OneTapButtonCornersStyle cornersStyle;

    @NotNull
    private final OneTapButtonElevationStyle elevationStyle;

    @NotNull
    private final InternalVKIconStyle iconStyle;

    @NotNull
    private final InternalCircleProgressStyle progressStyle;

    @NotNull
    private final InternalVKIDButtonRippleStyle rippleStyle;

    @NotNull
    private final OneTapButtonSizeStyle sizeStyle;

    @NotNull
    private final InternalVKIDButtonTextStyle textStyle;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$Dark;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dark extends InternalVKIDButtonStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dark(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(InternalVKIDButtonBackgroundStyle.BLUE, InternalVKIDButtonRippleStyle.LIGHT, InternalVKIDButtonBorderStyle.NONE, new InternalVKIconStyle(InternalVKIconColorStyle.WHITE, OneTapButtonSizeStyleKt.internalVKIDAsIconSizeStyle(sizeStyle)), InternalVKIDButtonTextStyle.LIGHT, InternalCircleProgressStyle.LIGHT, cornersStyle, sizeStyle, elevationStyle, null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$Secondary;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Secondary extends InternalVKIDButtonStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Secondary(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(InternalVKIDButtonBackgroundStyle.WHITE, InternalVKIDButtonRippleStyle.DARK, InternalVKIDButtonBorderStyle.DARK, new InternalVKIconStyle(InternalVKIconColorStyle.BLUE, OneTapButtonSizeStyleKt.internalVKIDAsIconSizeStyle(sizeStyle)), InternalVKIDButtonTextStyle.DARK, InternalCircleProgressStyle.DARK, cornersStyle, sizeStyle, elevationStyle, null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$TransparentDark;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransparentDark extends InternalVKIDButtonStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransparentDark(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(InternalVKIDButtonBackgroundStyle.TRANSPARENT, InternalVKIDButtonRippleStyle.LIGHT, InternalVKIDButtonBorderStyle.LIGHT, new InternalVKIconStyle(InternalVKIconColorStyle.BLUE, OneTapButtonSizeStyleKt.internalVKIDAsIconSizeStyle(sizeStyle)), InternalVKIDButtonTextStyle.LIGHT, InternalCircleProgressStyle.LIGHT, cornersStyle, sizeStyle, elevationStyle, null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$TransparentLight;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransparentLight extends InternalVKIDButtonStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransparentLight(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(InternalVKIDButtonBackgroundStyle.TRANSPARENT, InternalVKIDButtonRippleStyle.DARK, InternalVKIDButtonBorderStyle.DARK, new InternalVKIconStyle(InternalVKIconColorStyle.BLUE, OneTapButtonSizeStyleKt.internalVKIDAsIconSizeStyle(sizeStyle)), InternalVKIDButtonTextStyle.DARK, InternalCircleProgressStyle.DARK, cornersStyle, sizeStyle, elevationStyle, null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    public /* synthetic */ InternalVKIDButtonStyle(InternalVKIDButtonBackgroundStyle internalVKIDButtonBackgroundStyle, InternalVKIDButtonRippleStyle internalVKIDButtonRippleStyle, InternalVKIDButtonBorderStyle internalVKIDButtonBorderStyle, InternalVKIconStyle internalVKIconStyle, InternalVKIDButtonTextStyle internalVKIDButtonTextStyle, InternalCircleProgressStyle internalCircleProgressStyle, OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalVKIDButtonBackgroundStyle, internalVKIDButtonRippleStyle, internalVKIDButtonBorderStyle, internalVKIconStyle, internalVKIDButtonTextStyle, internalCircleProgressStyle, oneTapButtonCornersStyle, oneTapButtonSizeStyle, oneTapButtonElevationStyle);
    }

    @NotNull
    public final InternalVKIDButtonBackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    @NotNull
    public final InternalVKIDButtonBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    @NotNull
    public final OneTapButtonCornersStyle getCornersStyle() {
        return this.cornersStyle;
    }

    @NotNull
    public final OneTapButtonElevationStyle getElevationStyle() {
        return this.elevationStyle;
    }

    @NotNull
    public final InternalVKIconStyle getIconStyle() {
        return this.iconStyle;
    }

    @NotNull
    public final InternalCircleProgressStyle getProgressStyle() {
        return this.progressStyle;
    }

    @NotNull
    public final OneTapButtonSizeStyle getSizeStyle() {
        return this.sizeStyle;
    }

    @NotNull
    public final InternalVKIDButtonTextStyle getTextStyle() {
        return this.textStyle;
    }

    private InternalVKIDButtonStyle(InternalVKIDButtonBackgroundStyle internalVKIDButtonBackgroundStyle, InternalVKIDButtonRippleStyle internalVKIDButtonRippleStyle, InternalVKIDButtonBorderStyle internalVKIDButtonBorderStyle, InternalVKIconStyle internalVKIconStyle, InternalVKIDButtonTextStyle internalVKIDButtonTextStyle, InternalCircleProgressStyle internalCircleProgressStyle, OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle) {
        this.backgroundStyle = internalVKIDButtonBackgroundStyle;
        this.rippleStyle = internalVKIDButtonRippleStyle;
        this.borderStyle = internalVKIDButtonBorderStyle;
        this.iconStyle = internalVKIconStyle;
        this.textStyle = internalVKIDButtonTextStyle;
        this.progressStyle = internalCircleProgressStyle;
        this.cornersStyle = oneTapButtonCornersStyle;
        this.sizeStyle = oneTapButtonSizeStyle;
        this.elevationStyle = oneTapButtonElevationStyle;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle$Light;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Light extends InternalVKIDButtonStyle {
        public /* synthetic */ Light(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OneTapButtonCornersStyle.Default.INSTANCE : oneTapButtonCornersStyle, (i11 & 2) != 0 ? OneTapButtonSizeStyle.MEDIUM_44 : oneTapButtonSizeStyle, (i11 & 4) != 0 ? OneTapButtonElevationStyle.Default.INSTANCE : oneTapButtonElevationStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Light(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(InternalVKIDButtonBackgroundStyle.BLUE, InternalVKIDButtonRippleStyle.LIGHT, InternalVKIDButtonBorderStyle.NONE, new InternalVKIconStyle(InternalVKIconColorStyle.WHITE, OneTapButtonSizeStyleKt.internalVKIDAsIconSizeStyle(sizeStyle)), InternalVKIDButtonTextStyle.LIGHT, InternalCircleProgressStyle.LIGHT, cornersStyle, sizeStyle, elevationStyle, null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }
}
