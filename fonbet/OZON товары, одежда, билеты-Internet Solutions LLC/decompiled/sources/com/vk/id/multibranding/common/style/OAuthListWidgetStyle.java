package com.vk.id.multibranding.common.style;

import com.vk.id.multibranding.common.style.OAuthListWidgetCornersStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 #2\u00020\u0001:\u0003$%#B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u0012\u0004\b\"\u0010\u0012\u001a\u0004\b \u0010!\u0082\u0001\u0002&'¨\u0006("}, d2 = {"Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;", "", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;", "cornersStyle", "Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetRippleStyle;", "rippleStyle", "Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetBorderStyle;", "borderStyle", "Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetTextStyle;", "textStyle", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;", "sizeStyle", "<init>", "(Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetRippleStyle;Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetBorderStyle;Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetTextStyle;Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;)V", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;", "getCornersStyle", "()Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;", "getCornersStyle$annotations", "()V", "Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetRippleStyle;", "getRippleStyle", "()Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetRippleStyle;", "getRippleStyle$annotations", "Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetBorderStyle;", "getBorderStyle", "()Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetBorderStyle;", "getBorderStyle$annotations", "Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetTextStyle;", "getTextStyle", "()Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetTextStyle;", "getTextStyle$annotations", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;", "getSizeStyle", "()Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;", "getSizeStyle$annotations", "Companion", "Dark", "Light", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle$Dark;", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle$Light;", "multibranding-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class OAuthListWidgetStyle {

    @NotNull
    private final InternalVKIDOAuthListWidgetBorderStyle borderStyle;

    @NotNull
    private final OAuthListWidgetCornersStyle cornersStyle;

    @NotNull
    private final InternalVKIDOAuthListWidgetRippleStyle rippleStyle;

    @NotNull
    private final OAuthListWidgetSizeStyle sizeStyle;

    @NotNull
    private final InternalVKIDOAuthListWidgetTextStyle textStyle;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle$Light;", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;", "cornersStyle", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;", "sizeStyle", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;", "<init>", "(Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;)V", "multibranding-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Light extends OAuthListWidgetStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Light(@NotNull OAuthListWidgetCornersStyle cornersStyle, @NotNull OAuthListWidgetSizeStyle sizeStyle) {
            super(cornersStyle, InternalVKIDOAuthListWidgetRippleStyle.DARK, InternalVKIDOAuthListWidgetBorderStyle.DARK, InternalVKIDOAuthListWidgetTextStyle.DARK, sizeStyle, null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
        }
    }

    public /* synthetic */ OAuthListWidgetStyle(OAuthListWidgetCornersStyle oAuthListWidgetCornersStyle, InternalVKIDOAuthListWidgetRippleStyle internalVKIDOAuthListWidgetRippleStyle, InternalVKIDOAuthListWidgetBorderStyle internalVKIDOAuthListWidgetBorderStyle, InternalVKIDOAuthListWidgetTextStyle internalVKIDOAuthListWidgetTextStyle, OAuthListWidgetSizeStyle oAuthListWidgetSizeStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(oAuthListWidgetCornersStyle, internalVKIDOAuthListWidgetRippleStyle, internalVKIDOAuthListWidgetBorderStyle, internalVKIDOAuthListWidgetTextStyle, oAuthListWidgetSizeStyle);
    }

    @NotNull
    public final InternalVKIDOAuthListWidgetBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    @NotNull
    public final OAuthListWidgetCornersStyle getCornersStyle() {
        return this.cornersStyle;
    }

    @NotNull
    public final InternalVKIDOAuthListWidgetRippleStyle getRippleStyle() {
        return this.rippleStyle;
    }

    @NotNull
    public final OAuthListWidgetSizeStyle getSizeStyle() {
        return this.sizeStyle;
    }

    @NotNull
    public final InternalVKIDOAuthListWidgetTextStyle getTextStyle() {
        return this.textStyle;
    }

    private OAuthListWidgetStyle(OAuthListWidgetCornersStyle oAuthListWidgetCornersStyle, InternalVKIDOAuthListWidgetRippleStyle internalVKIDOAuthListWidgetRippleStyle, InternalVKIDOAuthListWidgetBorderStyle internalVKIDOAuthListWidgetBorderStyle, InternalVKIDOAuthListWidgetTextStyle internalVKIDOAuthListWidgetTextStyle, OAuthListWidgetSizeStyle oAuthListWidgetSizeStyle) {
        this.cornersStyle = oAuthListWidgetCornersStyle;
        this.rippleStyle = internalVKIDOAuthListWidgetRippleStyle;
        this.borderStyle = internalVKIDOAuthListWidgetBorderStyle;
        this.textStyle = internalVKIDOAuthListWidgetTextStyle;
        this.sizeStyle = oAuthListWidgetSizeStyle;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle$Dark;", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;", "cornersStyle", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;", "sizeStyle", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;", "<init>", "(Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;)V", "multibranding-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dark extends OAuthListWidgetStyle {
        public /* synthetic */ Dark(OAuthListWidgetCornersStyle oAuthListWidgetCornersStyle, OAuthListWidgetSizeStyle oAuthListWidgetSizeStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OAuthListWidgetCornersStyle.Default.INSTANCE : oAuthListWidgetCornersStyle, (i11 & 2) != 0 ? OAuthListWidgetSizeStyle.DEFAULT : oAuthListWidgetSizeStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dark(@NotNull OAuthListWidgetCornersStyle cornersStyle, @NotNull OAuthListWidgetSizeStyle sizeStyle) {
            super(cornersStyle, InternalVKIDOAuthListWidgetRippleStyle.LIGHT, InternalVKIDOAuthListWidgetBorderStyle.LIGHT, InternalVKIDOAuthListWidgetTextStyle.LIGHT, sizeStyle, null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
        }
    }
}
