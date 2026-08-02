package com.swmansion.enriched.markdown.styles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.ProfilingTraceData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockquoteStyle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001eJt\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle;", "Lcom/swmansion/enriched/markdown/styles/BaseBlockStyle;", "fontSize", "", "fontFamily", "", "fontWeight", "color", "", ViewProps.MARGIN_BOTTOM, ViewProps.LINE_HEIGHT, ViewProps.BORDER_COLOR, ViewProps.BORDER_WIDTH, "gapWidth", "backgroundColor", "<init>", "(FLjava/lang/String;Ljava/lang/String;IFFIFFLjava/lang/Integer;)V", "getFontSize", "()F", "getFontFamily", "()Ljava/lang/String;", "getFontWeight", "getColor", "()I", "getMarginBottom", "getLineHeight", "getBorderColor", "getBorderWidth", "getGapWidth", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(FLjava/lang/String;Ljava/lang/String;IFFIFFLjava/lang/Integer;)Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle;", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BlockquoteStyle implements BaseBlockStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer backgroundColor;
    private final int borderColor;
    private final float borderWidth;
    private final int color;
    private final String fontFamily;
    private final float fontSize;
    private final String fontWeight;
    private final float gapWidth;
    private final float lineHeight;
    private final float marginBottom;

    public static /* synthetic */ BlockquoteStyle copy$default(BlockquoteStyle blockquoteStyle, float f, String str, String str2, int i, float f2, float f3, int i2, float f4, float f5, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = blockquoteStyle.fontSize;
        }
        if ((i3 & 2) != 0) {
            str = blockquoteStyle.fontFamily;
        }
        if ((i3 & 4) != 0) {
            str2 = blockquoteStyle.fontWeight;
        }
        if ((i3 & 8) != 0) {
            i = blockquoteStyle.color;
        }
        if ((i3 & 16) != 0) {
            f2 = blockquoteStyle.marginBottom;
        }
        if ((i3 & 32) != 0) {
            f3 = blockquoteStyle.lineHeight;
        }
        if ((i3 & 64) != 0) {
            i2 = blockquoteStyle.borderColor;
        }
        if ((i3 & 128) != 0) {
            f4 = blockquoteStyle.borderWidth;
        }
        if ((i3 & 256) != 0) {
            f5 = blockquoteStyle.gapWidth;
        }
        if ((i3 & 512) != 0) {
            num = blockquoteStyle.backgroundColor;
        }
        float f6 = f5;
        Integer num2 = num;
        int i4 = i2;
        float f7 = f4;
        float f8 = f2;
        float f9 = f3;
        return blockquoteStyle.copy(f, str, str2, i, f8, f9, i4, f7, f6, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
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
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component8, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: component9, reason: from getter */
    public final float getGapWidth() {
        return this.gapWidth;
    }

    public final BlockquoteStyle copy(float fontSize, String fontFamily, String fontWeight, int color, float marginBottom, float lineHeight, int borderColor, float borderWidth, float gapWidth, Integer backgroundColor) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new BlockquoteStyle(fontSize, fontFamily, fontWeight, color, marginBottom, lineHeight, borderColor, borderWidth, gapWidth, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockquoteStyle)) {
            return false;
        }
        BlockquoteStyle blockquoteStyle = (BlockquoteStyle) other;
        return Float.compare(this.fontSize, blockquoteStyle.fontSize) == 0 && Intrinsics.areEqual(this.fontFamily, blockquoteStyle.fontFamily) && Intrinsics.areEqual(this.fontWeight, blockquoteStyle.fontWeight) && this.color == blockquoteStyle.color && Float.compare(this.marginBottom, blockquoteStyle.marginBottom) == 0 && Float.compare(this.lineHeight, blockquoteStyle.lineHeight) == 0 && this.borderColor == blockquoteStyle.borderColor && Float.compare(this.borderWidth, blockquoteStyle.borderWidth) == 0 && Float.compare(this.gapWidth, blockquoteStyle.gapWidth) == 0 && Intrinsics.areEqual(this.backgroundColor, blockquoteStyle.backgroundColor);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((Float.hashCode(this.fontSize) * 31) + this.fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.marginBottom)) * 31) + Float.hashCode(this.lineHeight)) * 31) + Integer.hashCode(this.borderColor)) * 31) + Float.hashCode(this.borderWidth)) * 31) + Float.hashCode(this.gapWidth)) * 31;
        Integer num = this.backgroundColor;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "BlockquoteStyle(fontSize=" + this.fontSize + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", color=" + this.color + ", marginBottom=" + this.marginBottom + ", lineHeight=" + this.lineHeight + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", gapWidth=" + this.gapWidth + ", backgroundColor=" + this.backgroundColor + ")";
    }

    public BlockquoteStyle(float f, String fontFamily, String fontWeight, int i, float f2, float f3, int i2, float f4, float f5, Integer num) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontSize = f;
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.color = i;
        this.marginBottom = f2;
        this.lineHeight = f3;
        this.borderColor = i2;
        this.borderWidth = f4;
        this.gapWidth = f5;
        this.backgroundColor = num;
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

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final float getGapWidth() {
        return this.gapWidth;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /* compiled from: BlockquoteStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BlockquoteStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new BlockquoteStyle(parser.toPixelFromSP((float) map.getDouble("fontSize")), StyleParser.parseString$default(parser, map, "fontFamily", null, 4, null), parser.parseString(map, "fontWeight", ProfilingTraceData.TRUNCATION_REASON_NORMAL), parser.parseColor(map, "color"), parser.toPixelFromDIP((float) map.getDouble(ViewProps.MARGIN_BOTTOM)), parser.toPixelFromSP((float) map.getDouble(ViewProps.LINE_HEIGHT)), parser.parseColor(map, ViewProps.BORDER_COLOR), parser.toPixelFromDIP((float) map.getDouble(ViewProps.BORDER_WIDTH)), parser.toPixelFromDIP((float) map.getDouble("gapWidth")), parser.parseOptionalColor(map, "backgroundColor"));
        }
    }
}
