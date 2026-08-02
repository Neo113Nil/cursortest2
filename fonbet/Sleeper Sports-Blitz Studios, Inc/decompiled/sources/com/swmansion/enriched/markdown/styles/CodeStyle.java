package com.swmansion.enriched.markdown.styles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeStyle.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/CodeStyle;", "", "color", "", "backgroundColor", ViewProps.BORDER_COLOR, "<init>", "(III)V", "getColor", "()I", "getBackgroundColor", "getBorderColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CodeStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int backgroundColor;
    private final int borderColor;
    private final int color;

    public static /* synthetic */ CodeStyle copy$default(CodeStyle codeStyle, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = codeStyle.color;
        }
        if ((i4 & 2) != 0) {
            i2 = codeStyle.backgroundColor;
        }
        if ((i4 & 4) != 0) {
            i3 = codeStyle.borderColor;
        }
        return codeStyle.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    public final CodeStyle copy(int color, int backgroundColor, int borderColor) {
        return new CodeStyle(color, backgroundColor, borderColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeStyle)) {
            return false;
        }
        CodeStyle codeStyle = (CodeStyle) other;
        return this.color == codeStyle.color && this.backgroundColor == codeStyle.backgroundColor && this.borderColor == codeStyle.borderColor;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.color) * 31) + Integer.hashCode(this.backgroundColor)) * 31) + Integer.hashCode(this.borderColor);
    }

    public String toString() {
        return "CodeStyle(color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ")";
    }

    public CodeStyle(int i, int i2, int i3) {
        this.color = i;
        this.backgroundColor = i2;
        this.borderColor = i3;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    /* compiled from: CodeStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/CodeStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/CodeStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CodeStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new CodeStyle(parser.parseColor(map, "color"), parser.parseColor(map, "backgroundColor"), parser.parseColor(map, ViewProps.BORDER_COLOR));
        }
    }
}
