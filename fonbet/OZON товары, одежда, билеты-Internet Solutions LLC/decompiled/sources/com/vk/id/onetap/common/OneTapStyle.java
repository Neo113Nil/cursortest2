package com.vk.id.onetap.common;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import com.vk.id.common.util.IsDarkThemeKt;
import com.vk.id.multibranding.common.style.OAuthListWidgetStyle;
import com.vk.id.onetap.common.alternate.style.InternalVKIDAlternateAccountButtonStyle;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonElevationStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonSizeStyle;
import com.vk.id.onetap.common.mutlibranding.style.CornersStyleExtKt;
import com.vk.id.onetap.common.mutlibranding.style.SizeStyleExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 (2\u00020\u0001:\b)*+,-./(B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u0012\u0004\b\"\u0010\u0012\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\u00020#8FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0012\u001a\u0004\b$\u0010%\u0082\u0001\u00070123456¨\u00067"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle;", "", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "vkidButtonStyle", "Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonStyle;", "alternateAccountButtonStyle", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonStyle;)V", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "getCornersStyle", "()Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "getCornersStyle$annotations", "()V", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "getSizeStyle", "()Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "getSizeStyle$annotations", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "getElevationStyle", "()Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "getElevationStyle$annotations", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "getVkidButtonStyle", "()Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "getVkidButtonStyle$annotations", "Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonStyle;", "getAlternateAccountButtonStyle", "()Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonStyle;", "getAlternateAccountButtonStyle$annotations", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;", "getOAuthListWidgetStyle", "()Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;", "getOAuthListWidgetStyle$annotations", "oAuthListWidgetStyle", "Companion", "Light", "Dark", "SecondaryLight", "SecondaryDark", "TransparentLight", "TransparentDark", "Icon", "Lcom/vk/id/onetap/common/OneTapStyle$Dark;", "Lcom/vk/id/onetap/common/OneTapStyle$Icon;", "Lcom/vk/id/onetap/common/OneTapStyle$Light;", "Lcom/vk/id/onetap/common/OneTapStyle$SecondaryDark;", "Lcom/vk/id/onetap/common/OneTapStyle$SecondaryLight;", "Lcom/vk/id/onetap/common/OneTapStyle$TransparentDark;", "Lcom/vk/id/onetap/common/OneTapStyle$TransparentLight;", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class OneTapStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final InternalVKIDAlternateAccountButtonStyle alternateAccountButtonStyle;

    @NotNull
    private final OneTapButtonCornersStyle cornersStyle;

    @NotNull
    private final OneTapButtonElevationStyle elevationStyle;

    @NotNull
    private final OneTapButtonSizeStyle sizeStyle;

    @NotNull
    private final InternalVKIDButtonStyle vkidButtonStyle;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ,\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ.\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0010"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle$Companion;", "", "<init>", "()V", "system", "Lcom/vk/id/onetap/common/OneTapStyle;", "context", "Landroid/content/Context;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "secondarySystem", "transparentSystem", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneTapStyle secondarySystem(@NotNull Context context, @NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
            return (OneTapStyle) (IsDarkThemeKt.getInternalVkIdIsDarkTheme(context) ? OneTapStyle$Companion$secondarySystem$1.INSTANCE : OneTapStyle$Companion$secondarySystem$2.INSTANCE).invoke(cornersStyle, sizeStyle, elevationStyle);
        }

        @NotNull
        public final OneTapStyle system(@NotNull Context context, @NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
            return (OneTapStyle) (IsDarkThemeKt.getInternalVkIdIsDarkTheme(context) ? OneTapStyle$Companion$system$1.INSTANCE : OneTapStyle$Companion$system$2.INSTANCE).invoke(cornersStyle, sizeStyle, elevationStyle);
        }

        @InterfaceC3999a
        @NotNull
        public final OneTapStyle transparentSystem(@NotNull Context context, @NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
            return (OneTapStyle) (IsDarkThemeKt.getInternalVkIdIsDarkTheme(context) ? OneTapStyle$Companion$transparentSystem$1.INSTANCE : OneTapStyle$Companion$transparentSystem$2.INSTANCE).invoke(cornersStyle, sizeStyle, elevationStyle);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle$Dark;", "Lcom/vk/id/onetap/common/OneTapStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dark extends OneTapStyle {
        public Dark() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ Dark(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OneTapButtonCornersStyle.Default.INSTANCE : oneTapButtonCornersStyle, (i11 & 2) != 0 ? OneTapButtonSizeStyle.DEFAULT : oneTapButtonSizeStyle, (i11 & 4) != 0 ? OneTapButtonElevationStyle.Default.INSTANCE : oneTapButtonElevationStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dark(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(cornersStyle, sizeStyle, elevationStyle, new InternalVKIDButtonStyle.Dark(cornersStyle, sizeStyle, elevationStyle), new InternalVKIDAlternateAccountButtonStyle.Dark(cornersStyle, sizeStyle), null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle$Icon;", "Lcom/vk/id/onetap/common/OneTapStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Icon extends OneTapStyle {
        public Icon() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ Icon(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OneTapButtonCornersStyle.Default.INSTANCE : oneTapButtonCornersStyle, (i11 & 2) != 0 ? OneTapButtonSizeStyle.DEFAULT : oneTapButtonSizeStyle, (i11 & 4) != 0 ? OneTapButtonElevationStyle.Default.INSTANCE : oneTapButtonElevationStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Icon(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(cornersStyle, sizeStyle, elevationStyle, new InternalVKIDButtonStyle.Light(cornersStyle, sizeStyle, elevationStyle), new InternalVKIDAlternateAccountButtonStyle.Light(cornersStyle, sizeStyle), null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle$Light;", "Lcom/vk/id/onetap/common/OneTapStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Light extends OneTapStyle {
        public Light() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ Light(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OneTapButtonCornersStyle.Default.INSTANCE : oneTapButtonCornersStyle, (i11 & 2) != 0 ? OneTapButtonSizeStyle.DEFAULT : oneTapButtonSizeStyle, (i11 & 4) != 0 ? OneTapButtonElevationStyle.Default.INSTANCE : oneTapButtonElevationStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Light(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(cornersStyle, sizeStyle, elevationStyle, new InternalVKIDButtonStyle.Light(cornersStyle, sizeStyle, elevationStyle), new InternalVKIDAlternateAccountButtonStyle.Light(cornersStyle, sizeStyle), null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle$SecondaryDark;", "Lcom/vk/id/onetap/common/OneTapStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SecondaryDark extends OneTapStyle {
        public SecondaryDark() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ SecondaryDark(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OneTapButtonCornersStyle.Default.INSTANCE : oneTapButtonCornersStyle, (i11 & 2) != 0 ? OneTapButtonSizeStyle.DEFAULT : oneTapButtonSizeStyle, (i11 & 4) != 0 ? OneTapButtonElevationStyle.Default.INSTANCE : oneTapButtonElevationStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondaryDark(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(cornersStyle, sizeStyle, elevationStyle, new InternalVKIDButtonStyle.Secondary(cornersStyle, sizeStyle, elevationStyle), new InternalVKIDAlternateAccountButtonStyle.Dark(cornersStyle, sizeStyle), null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle$SecondaryLight;", "Lcom/vk/id/onetap/common/OneTapStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SecondaryLight extends OneTapStyle {
        public SecondaryLight() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ SecondaryLight(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OneTapButtonCornersStyle.Default.INSTANCE : oneTapButtonCornersStyle, (i11 & 2) != 0 ? OneTapButtonSizeStyle.DEFAULT : oneTapButtonSizeStyle, (i11 & 4) != 0 ? OneTapButtonElevationStyle.Default.INSTANCE : oneTapButtonElevationStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondaryLight(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(cornersStyle, sizeStyle, elevationStyle, new InternalVKIDButtonStyle.Secondary(cornersStyle, sizeStyle, elevationStyle), new InternalVKIDAlternateAccountButtonStyle.Light(cornersStyle, sizeStyle), null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle$TransparentDark;", "Lcom/vk/id/onetap/common/OneTapStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransparentDark extends OneTapStyle {
        public TransparentDark() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ TransparentDark(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OneTapButtonCornersStyle.Default.INSTANCE : oneTapButtonCornersStyle, (i11 & 2) != 0 ? OneTapButtonSizeStyle.DEFAULT : oneTapButtonSizeStyle, (i11 & 4) != 0 ? OneTapButtonElevationStyle.Default.INSTANCE : oneTapButtonElevationStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransparentDark(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(cornersStyle, sizeStyle, elevationStyle, new InternalVKIDButtonStyle.TransparentDark(cornersStyle, sizeStyle, elevationStyle), new InternalVKIDAlternateAccountButtonStyle.TransparentDark(cornersStyle, sizeStyle), null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/onetap/common/OneTapStyle$TransparentLight;", "Lcom/vk/id/onetap/common/OneTapStyle;", "cornersStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "sizeStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "elevationStyle", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "<init>", "(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransparentLight extends OneTapStyle {
        public TransparentLight() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ TransparentLight(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? OneTapButtonCornersStyle.Default.INSTANCE : oneTapButtonCornersStyle, (i11 & 2) != 0 ? OneTapButtonSizeStyle.DEFAULT : oneTapButtonSizeStyle, (i11 & 4) != 0 ? OneTapButtonElevationStyle.Default.INSTANCE : oneTapButtonElevationStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransparentLight(@NotNull OneTapButtonCornersStyle cornersStyle, @NotNull OneTapButtonSizeStyle sizeStyle, @NotNull OneTapButtonElevationStyle elevationStyle) {
            super(cornersStyle, sizeStyle, elevationStyle, new InternalVKIDButtonStyle.TransparentLight(cornersStyle, sizeStyle, elevationStyle), new InternalVKIDAlternateAccountButtonStyle.TransparentLight(cornersStyle, sizeStyle), null);
            Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
            Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
            Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        }
    }

    public /* synthetic */ OneTapStyle(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, InternalVKIDButtonStyle internalVKIDButtonStyle, InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneTapButtonCornersStyle, oneTapButtonSizeStyle, oneTapButtonElevationStyle, internalVKIDButtonStyle, internalVKIDAlternateAccountButtonStyle);
    }

    @NotNull
    public final InternalVKIDAlternateAccountButtonStyle getAlternateAccountButtonStyle() {
        return this.alternateAccountButtonStyle;
    }

    @NotNull
    public final OAuthListWidgetStyle getOAuthListWidgetStyle() {
        if ((this instanceof Icon) || (this instanceof TransparentLight) || (this instanceof SecondaryLight) || (this instanceof Light)) {
            return new OAuthListWidgetStyle.Light(CornersStyleExtKt.toOAuthListWidgetStyle(this.cornersStyle), SizeStyleExtKt.toOAuthListWidgetStyle(this.sizeStyle));
        }
        if ((this instanceof TransparentDark) || (this instanceof SecondaryDark) || (this instanceof Dark)) {
            return new OAuthListWidgetStyle.Dark(CornersStyleExtKt.toOAuthListWidgetStyle(this.cornersStyle), SizeStyleExtKt.toOAuthListWidgetStyle(this.sizeStyle));
        }
        throw new o();
    }

    @NotNull
    public final InternalVKIDButtonStyle getVkidButtonStyle() {
        return this.vkidButtonStyle;
    }

    private OneTapStyle(OneTapButtonCornersStyle oneTapButtonCornersStyle, OneTapButtonSizeStyle oneTapButtonSizeStyle, OneTapButtonElevationStyle oneTapButtonElevationStyle, InternalVKIDButtonStyle internalVKIDButtonStyle, InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle) {
        this.cornersStyle = oneTapButtonCornersStyle;
        this.sizeStyle = oneTapButtonSizeStyle;
        this.elevationStyle = oneTapButtonElevationStyle;
        this.vkidButtonStyle = internalVKIDButtonStyle;
        this.alternateAccountButtonStyle = internalVKIDAlternateAccountButtonStyle;
    }
}
