package com.swmansion.enriched.markdown.styles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.ProfilingTraceData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListStyle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\bHÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00066"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/ListStyle;", "Lcom/swmansion/enriched/markdown/styles/BaseBlockStyle;", "fontSize", "", "fontFamily", "", "fontWeight", "color", "", ViewProps.MARGIN_BOTTOM, ViewProps.LINE_HEIGHT, "bulletColor", "bulletSize", "markerColor", "markerFontWeight", "gapWidth", ViewProps.MARGIN_LEFT, "<init>", "(FLjava/lang/String;Ljava/lang/String;IFFIFILjava/lang/String;FF)V", "getFontSize", "()F", "getFontFamily", "()Ljava/lang/String;", "getFontWeight", "getColor", "()I", "getMarginBottom", "getLineHeight", "getBulletColor", "getBulletSize", "getMarkerColor", "getMarkerFontWeight", "getGapWidth", "getMarginLeft", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ListStyle implements BaseBlockStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int bulletColor;
    private final float bulletSize;
    private final int color;
    private final String fontFamily;
    private final float fontSize;
    private final String fontWeight;
    private final float gapWidth;
    private final float lineHeight;
    private final float marginBottom;
    private final float marginLeft;
    private final int markerColor;
    private final String markerFontWeight;

    public static /* synthetic */ ListStyle copy$default(ListStyle listStyle, float f, String str, String str2, int i, float f2, float f3, int i2, float f4, int i3, String str3, float f5, float f6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f = listStyle.fontSize;
        }
        if ((i4 & 2) != 0) {
            str = listStyle.fontFamily;
        }
        if ((i4 & 4) != 0) {
            str2 = listStyle.fontWeight;
        }
        if ((i4 & 8) != 0) {
            i = listStyle.color;
        }
        if ((i4 & 16) != 0) {
            f2 = listStyle.marginBottom;
        }
        if ((i4 & 32) != 0) {
            f3 = listStyle.lineHeight;
        }
        if ((i4 & 64) != 0) {
            i2 = listStyle.bulletColor;
        }
        if ((i4 & 128) != 0) {
            f4 = listStyle.bulletSize;
        }
        if ((i4 & 256) != 0) {
            i3 = listStyle.markerColor;
        }
        if ((i4 & 512) != 0) {
            str3 = listStyle.markerFontWeight;
        }
        if ((i4 & 1024) != 0) {
            f5 = listStyle.gapWidth;
        }
        if ((i4 & 2048) != 0) {
            f6 = listStyle.marginLeft;
        }
        float f7 = f5;
        float f8 = f6;
        int i5 = i3;
        String str4 = str3;
        int i6 = i2;
        float f9 = f4;
        float f10 = f2;
        float f11 = f3;
        return listStyle.copy(f, str, str2, i, f10, f11, i6, f9, i5, str4, f7, f8);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMarkerFontWeight() {
        return this.markerFontWeight;
    }

    /* renamed from: component11, reason: from getter */
    public final float getGapWidth() {
        return this.gapWidth;
    }

    /* renamed from: component12, reason: from getter */
    public final float getMarginLeft() {
        return this.marginLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component5, reason: from getter */
    public final float getMarginBottom() {
        return this.marginBottom;
    }

    /* renamed from: component6, reason: from getter */
    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: component7, reason: from getter */
    public final int getBulletColor() {
        return this.bulletColor;
    }

    /* renamed from: component8, reason: from getter */
    public final float getBulletSize() {
        return this.bulletSize;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMarkerColor() {
        return this.markerColor;
    }

    public final ListStyle copy(float fontSize, String fontFamily, String fontWeight, int color, float marginBottom, float lineHeight, int bulletColor, float bulletSize, int markerColor, String markerFontWeight, float gapWidth, float marginLeft) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(markerFontWeight, "markerFontWeight");
        return new ListStyle(fontSize, fontFamily, fontWeight, color, marginBottom, lineHeight, bulletColor, bulletSize, markerColor, markerFontWeight, gapWidth, marginLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListStyle)) {
            return false;
        }
        ListStyle listStyle = (ListStyle) other;
        return Float.compare(this.fontSize, listStyle.fontSize) == 0 && Intrinsics.areEqual(this.fontFamily, listStyle.fontFamily) && Intrinsics.areEqual(this.fontWeight, listStyle.fontWeight) && this.color == listStyle.color && Float.compare(this.marginBottom, listStyle.marginBottom) == 0 && Float.compare(this.lineHeight, listStyle.lineHeight) == 0 && this.bulletColor == listStyle.bulletColor && Float.compare(this.bulletSize, listStyle.bulletSize) == 0 && this.markerColor == listStyle.markerColor && Intrinsics.areEqual(this.markerFontWeight, listStyle.markerFontWeight) && Float.compare(this.gapWidth, listStyle.gapWidth) == 0 && Float.compare(this.marginLeft, listStyle.marginLeft) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((((Float.hashCode(this.fontSize) * 31) + this.fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.marginBottom)) * 31) + Float.hashCode(this.lineHeight)) * 31) + Integer.hashCode(this.bulletColor)) * 31) + Float.hashCode(this.bulletSize)) * 31) + Integer.hashCode(this.markerColor)) * 31) + this.markerFontWeight.hashCode()) * 31) + Float.hashCode(this.gapWidth)) * 31) + Float.hashCode(this.marginLeft);
    }

    public String toString() {
        return "ListStyle(fontSize=" + this.fontSize + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", color=" + this.color + ", marginBottom=" + this.marginBottom + ", lineHeight=" + this.lineHeight + ", bulletColor=" + this.bulletColor + ", bulletSize=" + this.bulletSize + ", markerColor=" + this.markerColor + ", markerFontWeight=" + this.markerFontWeight + ", gapWidth=" + this.gapWidth + ", marginLeft=" + this.marginLeft + ")";
    }

    public ListStyle(float f, String fontFamily, String fontWeight, int i, float f2, float f3, int i2, float f4, int i3, String markerFontWeight, float f5, float f6) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(markerFontWeight, "markerFontWeight");
        this.fontSize = f;
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.color = i;
        this.marginBottom = f2;
        this.lineHeight = f3;
        this.bulletColor = i2;
        this.bulletSize = f4;
        this.markerColor = i3;
        this.markerFontWeight = markerFontWeight;
        this.gapWidth = f5;
        this.marginLeft = f6;
    }

    @Override // com.swmansion.enriched.markdown.styles.BaseBlockStyle
    public float getFontSize() {
        return this.fontSize;
    }

    @Override // com.swmansion.enriched.markdown.styles.BaseBlockStyle
    public String getFontFamily() {
        return this.fontFamily;
    }

    @Override // com.swmansion.enriched.markdown.styles.BaseBlockStyle
    public String getFontWeight() {
        return this.fontWeight;
    }

    @Override // com.swmansion.enriched.markdown.styles.BaseBlockStyle
    public int getColor() {
        return this.color;
    }

    @Override // com.swmansion.enriched.markdown.styles.BaseBlockStyle
    public float getMarginBottom() {
        return this.marginBottom;
    }

    @Override // com.swmansion.enriched.markdown.styles.BaseBlockStyle
    public float getLineHeight() {
        return this.lineHeight;
    }

    public final int getBulletColor() {
        return this.bulletColor;
    }

    public final float getBulletSize() {
        return this.bulletSize;
    }

    public final int getMarkerColor() {
        return this.markerColor;
    }

    public final String getMarkerFontWeight() {
        return this.markerFontWeight;
    }

    public final float getGapWidth() {
        return this.gapWidth;
    }

    public final float getMarginLeft() {
        return this.marginLeft;
    }

    /* compiled from: ListStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/ListStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/ListStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ListStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new ListStyle(parser.toPixelFromSP((float) map.getDouble("fontSize")), StyleParser.parseString$default(parser, map, "fontFamily", null, 4, null), parser.parseString(map, "fontWeight", ProfilingTraceData.TRUNCATION_REASON_NORMAL), parser.parseColor(map, "color"), parser.toPixelFromDIP((float) map.getDouble(ViewProps.MARGIN_BOTTOM)), parser.toPixelFromSP((float) map.getDouble(ViewProps.LINE_HEIGHT)), parser.parseColor(map, "bulletColor"), parser.toPixelFromDIP((float) map.getDouble("bulletSize")), parser.parseColor(map, "markerColor"), parser.parseString(map, "markerFontWeight", ProfilingTraceData.TRUNCATION_REASON_NORMAL), parser.toPixelFromDIP((float) map.getDouble("gapWidth")), parser.toPixelFromDIP((float) map.getDouble(ViewProps.MARGIN_LEFT)));
        }
    }
}
