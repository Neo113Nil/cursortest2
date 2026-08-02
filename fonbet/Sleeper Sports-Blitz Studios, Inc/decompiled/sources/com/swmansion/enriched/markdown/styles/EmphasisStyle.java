package com.swmansion.enriched.markdown.styles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmphasisStyle.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/EmphasisStyle;", "", "color", "", "<init>", "(Ljava/lang/Integer;)V", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/swmansion/enriched/markdown/styles/EmphasisStyle;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EmphasisStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer color;

    public static /* synthetic */ EmphasisStyle copy$default(EmphasisStyle emphasisStyle, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = emphasisStyle.color;
        }
        return emphasisStyle.copy(num);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    public final EmphasisStyle copy(Integer color) {
        return new EmphasisStyle(color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EmphasisStyle) && Intrinsics.areEqual(this.color, ((EmphasisStyle) other).color);
    }

    public int hashCode() {
        Integer num = this.color;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "EmphasisStyle(color=" + this.color + ")";
    }

    public EmphasisStyle(Integer num) {
        this.color = num;
    }

    public final Integer getColor() {
        return this.color;
    }

    /* compiled from: EmphasisStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/EmphasisStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/EmphasisStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EmphasisStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new EmphasisStyle(parser.parseOptionalColor(map, "color"));
        }
    }
}
