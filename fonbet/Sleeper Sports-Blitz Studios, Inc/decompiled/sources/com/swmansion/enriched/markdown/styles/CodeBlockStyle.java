package com.swmansion.enriched.markdown.styles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.ProfilingTraceData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeBlockStyle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00063"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/CodeBlockStyle;", "Lcom/swmansion/enriched/markdown/styles/BaseBlockStyle;", "fontSize", "", "fontFamily", "", "fontWeight", "color", "", ViewProps.MARGIN_BOTTOM, ViewProps.LINE_HEIGHT, "backgroundColor", ViewProps.BORDER_COLOR, ViewProps.BORDER_RADIUS, ViewProps.BORDER_WIDTH, ViewProps.PADDING, "<init>", "(FLjava/lang/String;Ljava/lang/String;IFFIIFFF)V", "getFontSize", "()F", "getFontFamily", "()Ljava/lang/String;", "getFontWeight", "getColor", "()I", "getMarginBottom", "getLineHeight", "getBackgroundColor", "getBorderColor", "getBorderRadius", "getBorderWidth", "getPadding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CodeBlockStyle implements BaseBlockStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int backgroundColor;
    private final int borderColor;
    private final float borderRadius;
    private final float borderWidth;
    private final int color;
    private final String fontFamily;
    private final float fontSize;
    private final String fontWeight;
    private final float lineHeight;
    private final float marginBottom;
    private final float padding;

    public static /* synthetic */ CodeBlockStyle copy$default(CodeBlockStyle codeBlockStyle, float f, String str, String str2, int i, float f2, float f3, int i2, int i3, float f4, float f5, float f6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f = codeBlockStyle.fontSize;
        }
        if ((i4 & 2) != 0) {
            str = codeBlockStyle.fontFamily;
        }
        if ((i4 & 4) != 0) {
            str2 = codeBlockStyle.fontWeight;
        }
        if ((i4 & 8) != 0) {
            i = codeBlockStyle.color;
        }
        if ((i4 & 16) != 0) {
            f2 = codeBlockStyle.marginBottom;
        }
        if ((i4 & 32) != 0) {
            f3 = codeBlockStyle.lineHeight;
        }
        if ((i4 & 64) != 0) {
            i2 = codeBlockStyle.backgroundColor;
        }
        if ((i4 & 128) != 0) {
            i3 = codeBlockStyle.borderColor;
        }
        if ((i4 & 256) != 0) {
            f4 = codeBlockStyle.borderRadius;
        }
        if ((i4 & 512) != 0) {
            f5 = codeBlockStyle.borderWidth;
        }
        if ((i4 & 1024) != 0) {
            f6 = codeBlockStyle.padding;
        }
        float f7 = f5;
        float f8 = f6;
        int i5 = i3;
        float f9 = f4;
        float f10 = f3;
        int i6 = i2;
        float f11 = f2;
        String str3 = str2;
        return codeBlockStyle.copy(f, str, str3, i, f11, f10, i6, i5, f9, f7, f8);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component10, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: component11, reason: from getter */
    public final float getPadding() {
        return this.padding;
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
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component9, reason: from getter */
    public final float getBorderRadius() {
        return this.borderRadius;
    }

    public final CodeBlockStyle copy(float fontSize, String fontFamily, String fontWeight, int color, float marginBottom, float lineHeight, int backgroundColor, int borderColor, float borderRadius, float borderWidth, float padding) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new CodeBlockStyle(fontSize, fontFamily, fontWeight, color, marginBottom, lineHeight, backgroundColor, borderColor, borderRadius, borderWidth, padding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeBlockStyle)) {
            return false;
        }
        CodeBlockStyle codeBlockStyle = (CodeBlockStyle) other;
        return Float.compare(this.fontSize, codeBlockStyle.fontSize) == 0 && Intrinsics.areEqual(this.fontFamily, codeBlockStyle.fontFamily) && Intrinsics.areEqual(this.fontWeight, codeBlockStyle.fontWeight) && this.color == codeBlockStyle.color && Float.compare(this.marginBottom, codeBlockStyle.marginBottom) == 0 && Float.compare(this.lineHeight, codeBlockStyle.lineHeight) == 0 && this.backgroundColor == codeBlockStyle.backgroundColor && this.borderColor == codeBlockStyle.borderColor && Float.compare(this.borderRadius, codeBlockStyle.borderRadius) == 0 && Float.compare(this.borderWidth, codeBlockStyle.borderWidth) == 0 && Float.compare(this.padding, codeBlockStyle.padding) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((Float.hashCode(this.fontSize) * 31) + this.fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.marginBottom)) * 31) + Float.hashCode(this.lineHeight)) * 31) + Integer.hashCode(this.backgroundColor)) * 31) + Integer.hashCode(this.borderColor)) * 31) + Float.hashCode(this.borderRadius)) * 31) + Float.hashCode(this.borderWidth)) * 31) + Float.hashCode(this.padding);
    }

    public String toString() {
        return "CodeBlockStyle(fontSize=" + this.fontSize + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", color=" + this.color + ", marginBottom=" + this.marginBottom + ", lineHeight=" + this.lineHeight + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", borderRadius=" + this.borderRadius + ", borderWidth=" + this.borderWidth + ", padding=" + this.padding + ")";
    }

    public CodeBlockStyle(float f, String fontFamily, String fontWeight, int i, float f2, float f3, int i2, int i3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontSize = f;
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.color = i;
        this.marginBottom = f2;
        this.lineHeight = f3;
        this.backgroundColor = i2;
        this.borderColor = i3;
        this.borderRadius = f4;
        this.borderWidth = f5;
        this.padding = f6;
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

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float getBorderRadius() {
        return this.borderRadius;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final float getPadding() {
        return this.padding;
    }

    /* compiled from: CodeBlockStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/CodeBlockStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/CodeBlockStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CodeBlockStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new CodeBlockStyle(parser.toPixelFromSP((float) map.getDouble("fontSize")), StyleParser.parseString$default(parser, map, "fontFamily", null, 4, null), parser.parseString(map, "fontWeight", ProfilingTraceData.TRUNCATION_REASON_NORMAL), parser.parseColor(map, "color"), parser.toPixelFromDIP((float) map.getDouble(ViewProps.MARGIN_BOTTOM)), parser.toPixelFromSP((float) map.getDouble(ViewProps.LINE_HEIGHT)), parser.parseColor(map, "backgroundColor"), parser.parseColor(map, ViewProps.BORDER_COLOR), parser.toPixelFromDIP((float) map.getDouble(ViewProps.BORDER_RADIUS)), parser.toPixelFromDIP((float) map.getDouble(ViewProps.BORDER_WIDTH)), parser.toPixelFromDIP((float) map.getDouble(ViewProps.PADDING)));
        }
    }
}
