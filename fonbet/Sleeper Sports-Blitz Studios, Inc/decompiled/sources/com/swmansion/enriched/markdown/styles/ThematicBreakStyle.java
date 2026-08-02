package com.swmansion.enriched.markdown.styles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThematicBreakStyle.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/ThematicBreakStyle;", "", "color", "", "height", "", ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, "<init>", "(IFFF)V", "getColor", "()I", "getHeight", "()F", "getMarginTop", "getMarginBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ThematicBreakStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int color;
    private final float height;
    private final float marginBottom;
    private final float marginTop;

    public static /* synthetic */ ThematicBreakStyle copy$default(ThematicBreakStyle thematicBreakStyle, int i, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = thematicBreakStyle.color;
        }
        if ((i2 & 2) != 0) {
            f = thematicBreakStyle.height;
        }
        if ((i2 & 4) != 0) {
            f2 = thematicBreakStyle.marginTop;
        }
        if ((i2 & 8) != 0) {
            f3 = thematicBreakStyle.marginBottom;
        }
        return thematicBreakStyle.copy(i, f, f2, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final float getMarginTop() {
        return this.marginTop;
    }

    /* renamed from: component4, reason: from getter */
    public final float getMarginBottom() {
        return this.marginBottom;
    }

    public final ThematicBreakStyle copy(int color, float height, float marginTop, float marginBottom) {
        return new ThematicBreakStyle(color, height, marginTop, marginBottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThematicBreakStyle)) {
            return false;
        }
        ThematicBreakStyle thematicBreakStyle = (ThematicBreakStyle) other;
        return this.color == thematicBreakStyle.color && Float.compare(this.height, thematicBreakStyle.height) == 0 && Float.compare(this.marginTop, thematicBreakStyle.marginTop) == 0 && Float.compare(this.marginBottom, thematicBreakStyle.marginBottom) == 0;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.color) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.marginTop)) * 31) + Float.hashCode(this.marginBottom);
    }

    public String toString() {
        return "ThematicBreakStyle(color=" + this.color + ", height=" + this.height + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ")";
    }

    public ThematicBreakStyle(int i, float f, float f2, float f3) {
        this.color = i;
        this.height = f;
        this.marginTop = f2;
        this.marginBottom = f3;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getMarginTop() {
        return this.marginTop;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    /* compiled from: ThematicBreakStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/ThematicBreakStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/ThematicBreakStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ThematicBreakStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new ThematicBreakStyle(parser.parseColor(map, "color"), parser.toPixelFromDIP((float) map.getDouble("height")), parser.toPixelFromDIP((float) map.getDouble(ViewProps.MARGIN_TOP)), parser.toPixelFromDIP((float) map.getDouble(ViewProps.MARGIN_BOTTOM)));
        }
    }
}
