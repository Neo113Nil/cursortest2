package com.swmansion.enriched.markdown.styles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageStyle.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/ImageStyle;", "", "height", "", ViewProps.BORDER_RADIUS, ViewProps.MARGIN_BOTTOM, "<init>", "(FFF)V", "getHeight", "()F", "getBorderRadius", "getMarginBottom", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ImageStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float borderRadius;
    private final float height;
    private final float marginBottom;

    public static /* synthetic */ ImageStyle copy$default(ImageStyle imageStyle, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = imageStyle.height;
        }
        if ((i & 2) != 0) {
            f2 = imageStyle.borderRadius;
        }
        if ((i & 4) != 0) {
            f3 = imageStyle.marginBottom;
        }
        return imageStyle.copy(f, f2, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final float getBorderRadius() {
        return this.borderRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final float getMarginBottom() {
        return this.marginBottom;
    }

    public final ImageStyle copy(float height, float borderRadius, float marginBottom) {
        return new ImageStyle(height, borderRadius, marginBottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageStyle)) {
            return false;
        }
        ImageStyle imageStyle = (ImageStyle) other;
        return Float.compare(this.height, imageStyle.height) == 0 && Float.compare(this.borderRadius, imageStyle.borderRadius) == 0 && Float.compare(this.marginBottom, imageStyle.marginBottom) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.height) * 31) + Float.hashCode(this.borderRadius)) * 31) + Float.hashCode(this.marginBottom);
    }

    public String toString() {
        return "ImageStyle(height=" + this.height + ", borderRadius=" + this.borderRadius + ", marginBottom=" + this.marginBottom + ")";
    }

    public ImageStyle(float f, float f2, float f3) {
        this.height = f;
        this.borderRadius = f2;
        this.marginBottom = f3;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getBorderRadius() {
        return this.borderRadius;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    /* compiled from: ImageStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/ImageStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/ImageStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImageStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new ImageStyle(parser.toPixelFromDIP((float) map.getDouble("height")), parser.toPixelFromDIP((float) map.getDouble(ViewProps.BORDER_RADIUS)), parser.toPixelFromDIP((float) map.getDouble(ViewProps.MARGIN_BOTTOM)));
        }
    }
}
