package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.drawee.drawable.r;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/views/image/ImageResizeMode;", "", "<init>", "()V", "", "resizeModeValue", "Lcom/facebook/drawee/drawable/r;", "toScaleType", "(Ljava/lang/String;)Lcom/facebook/drawee/drawable/r;", "Landroid/graphics/Shader$TileMode;", "toTileMode", "(Ljava/lang/String;)Landroid/graphics/Shader$TileMode;", "defaultValue", "()Lcom/facebook/drawee/drawable/r;", "defaultTileMode", "()Landroid/graphics/Shader$TileMode;", "", ViewProps.RESIZE_MODE, "fromInt", "(I)Ljava/lang/String;", "RESIZE_MODE_CONTAIN", "Ljava/lang/String;", "RESIZE_MODE_COVER", "RESIZE_MODE_STRETCH", "RESIZE_MODE_CENTER", "RESIZE_MODE_REPEAT", "RESIZE_MODE_NONE", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageResizeMode {

    @NotNull
    public static final ImageResizeMode INSTANCE = new ImageResizeMode();

    @NotNull
    private static final String RESIZE_MODE_CENTER = "center";

    @NotNull
    private static final String RESIZE_MODE_CONTAIN = "contain";

    @NotNull
    private static final String RESIZE_MODE_COVER = "cover";

    @NotNull
    private static final String RESIZE_MODE_NONE = "none";

    @NotNull
    private static final String RESIZE_MODE_REPEAT = "repeat";

    @NotNull
    private static final String RESIZE_MODE_STRETCH = "stretch";

    private ImageResizeMode() {
    }

    @JvmStatic
    @NotNull
    public static final Shader.TileMode defaultTileMode() {
        return Shader.TileMode.CLAMP;
    }

    @JvmStatic
    @NotNull
    public static final r defaultValue() {
        r CENTER_CROP = r.f30528i;
        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
        return CENTER_CROP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @JvmStatic
    @NotNull
    public static final r toScaleType(@Nullable String resizeModeValue) {
        if (resizeModeValue != null) {
            switch (resizeModeValue.hashCode()) {
                case -1881872635:
                    if (resizeModeValue.equals(RESIZE_MODE_STRETCH)) {
                        r FIT_XY = r.f30520a;
                        Intrinsics.checkNotNullExpressionValue(FIT_XY, "FIT_XY");
                        return FIT_XY;
                    }
                    break;
                case -1364013995:
                    if (resizeModeValue.equals(RESIZE_MODE_CENTER)) {
                        r CENTER_INSIDE = r.f30527h;
                        Intrinsics.checkNotNullExpressionValue(CENTER_INSIDE, "CENTER_INSIDE");
                        return CENTER_INSIDE;
                    }
                    break;
                case -934531685:
                    if (resizeModeValue.equals(RESIZE_MODE_REPEAT)) {
                        return ScaleTypeStartInside.INSTANCE.getINSTANCE();
                    }
                    break;
                case 3387192:
                    if (resizeModeValue.equals("none")) {
                        return ScaleTypeStartInside.INSTANCE.getINSTANCE();
                    }
                    break;
                case 94852023:
                    if (resizeModeValue.equals(RESIZE_MODE_COVER)) {
                        r CENTER_CROP = r.f30528i;
                        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
                        return CENTER_CROP;
                    }
                    break;
                case 951526612:
                    if (resizeModeValue.equals(RESIZE_MODE_CONTAIN)) {
                        r FIT_CENTER = r.f30524e;
                        Intrinsics.checkNotNullExpressionValue(FIT_CENTER, "FIT_CENTER");
                        return FIT_CENTER;
                    }
                    break;
            }
        }
        if (resizeModeValue != null) {
            E6.a.K(ReactConstants.TAG, "Invalid resize mode: '" + resizeModeValue + "'");
        }
        return defaultValue();
    }

    @JvmStatic
    @NotNull
    public static final Shader.TileMode toTileMode(@Nullable String resizeModeValue) {
        if (Intrinsics.areEqual(RESIZE_MODE_CONTAIN, resizeModeValue) || Intrinsics.areEqual(RESIZE_MODE_COVER, resizeModeValue) || Intrinsics.areEqual(RESIZE_MODE_STRETCH, resizeModeValue) || Intrinsics.areEqual(RESIZE_MODE_CENTER, resizeModeValue) || Intrinsics.areEqual("none", resizeModeValue)) {
            return Shader.TileMode.CLAMP;
        }
        if (Intrinsics.areEqual(RESIZE_MODE_REPEAT, resizeModeValue)) {
            return Shader.TileMode.REPEAT;
        }
        if (resizeModeValue != null) {
            E6.a.K(ReactConstants.TAG, "Invalid resize mode: '" + resizeModeValue + "'");
        }
        return defaultTileMode();
    }

    public final /* synthetic */ String fromInt(int resizeMode) {
        return resizeMode != 0 ? resizeMode != 1 ? resizeMode != 2 ? resizeMode != 3 ? resizeMode != 4 ? "none" : RESIZE_MODE_REPEAT : RESIZE_MODE_CENTER : RESIZE_MODE_STRETCH : RESIZE_MODE_CONTAIN : RESIZE_MODE_COVER;
    }
}
