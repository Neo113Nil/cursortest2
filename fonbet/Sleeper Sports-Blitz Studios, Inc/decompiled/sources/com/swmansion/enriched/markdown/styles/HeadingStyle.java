package com.swmansion.enriched.markdown.styles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.ProfilingTraceData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeadingStyle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/HeadingStyle;", "Lcom/swmansion/enriched/markdown/styles/BaseBlockStyle;", "fontSize", "", "fontFamily", "", "fontWeight", "color", "", ViewProps.MARGIN_BOTTOM, ViewProps.LINE_HEIGHT, "<init>", "(FLjava/lang/String;Ljava/lang/String;IFF)V", "getFontSize", "()F", "getFontFamily", "()Ljava/lang/String;", "getFontWeight", "getColor", "()I", "getMarginBottom", "getLineHeight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HeadingStyle implements BaseBlockStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int color;
    private final String fontFamily;
    private final float fontSize;
    private final String fontWeight;
    private final float lineHeight;
    private final float marginBottom;

    public static /* synthetic */ HeadingStyle copy$default(HeadingStyle headingStyle, float f, String str, String str2, int i, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = headingStyle.fontSize;
        }
        if ((i2 & 2) != 0) {
            str = headingStyle.fontFamily;
        }
        if ((i2 & 4) != 0) {
            str2 = headingStyle.fontWeight;
        }
        if ((i2 & 8) != 0) {
            i = headingStyle.color;
        }
        if ((i2 & 16) != 0) {
            f2 = headingStyle.marginBottom;
        }
        if ((i2 & 32) != 0) {
            f3 = headingStyle.lineHeight;
        }
        float f4 = f2;
        float f5 = f3;
        return headingStyle.copy(f, str, str2, i, f4, f5);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
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

    public final HeadingStyle copy(float fontSize, String fontFamily, String fontWeight, int color, float marginBottom, float lineHeight) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new HeadingStyle(fontSize, fontFamily, fontWeight, color, marginBottom, lineHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadingStyle)) {
            return false;
        }
        HeadingStyle headingStyle = (HeadingStyle) other;
        return Float.compare(this.fontSize, headingStyle.fontSize) == 0 && Intrinsics.areEqual(this.fontFamily, headingStyle.fontFamily) && Intrinsics.areEqual(this.fontWeight, headingStyle.fontWeight) && this.color == headingStyle.color && Float.compare(this.marginBottom, headingStyle.marginBottom) == 0 && Float.compare(this.lineHeight, headingStyle.lineHeight) == 0;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.fontSize) * 31) + this.fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.marginBottom)) * 31) + Float.hashCode(this.lineHeight);
    }

    public String toString() {
        return "HeadingStyle(fontSize=" + this.fontSize + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", color=" + this.color + ", marginBottom=" + this.marginBottom + ", lineHeight=" + this.lineHeight + ")";
    }

    public HeadingStyle(float f, String fontFamily, String fontWeight, int i, float f2, float f3) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontSize = f;
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.color = i;
        this.marginBottom = f2;
        this.lineHeight = f3;
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

    /* compiled from: HeadingStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/HeadingStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/HeadingStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HeadingStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new HeadingStyle(parser.toPixelFromSP((float) map.getDouble("fontSize")), StyleParser.parseString$default(parser, map, "fontFamily", null, 4, null), parser.parseString(map, "fontWeight", ProfilingTraceData.TRUNCATION_REASON_NORMAL), parser.parseColor(map, "color"), parser.toPixelFromDIP((float) map.getDouble(ViewProps.MARGIN_BOTTOM)), parser.toPixelFromSP((float) map.getDouble(ViewProps.LINE_HEIGHT)));
        }
    }
}
