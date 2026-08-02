package com.swmansion.enriched.markdown.styles;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkStyle.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/LinkStyle;", "", "color", "", TtmlNode.UNDERLINE, "", "<init>", "(IZ)V", "getColor", "()I", "getUnderline", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LinkStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int color;
    private final boolean underline;

    public static /* synthetic */ LinkStyle copy$default(LinkStyle linkStyle, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = linkStyle.color;
        }
        if ((i2 & 2) != 0) {
            z = linkStyle.underline;
        }
        return linkStyle.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUnderline() {
        return this.underline;
    }

    public final LinkStyle copy(int color, boolean underline) {
        return new LinkStyle(color, underline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkStyle)) {
            return false;
        }
        LinkStyle linkStyle = (LinkStyle) other;
        return this.color == linkStyle.color && this.underline == linkStyle.underline;
    }

    public int hashCode() {
        return (Integer.hashCode(this.color) * 31) + Boolean.hashCode(this.underline);
    }

    public String toString() {
        return "LinkStyle(color=" + this.color + ", underline=" + this.underline + ")";
    }

    public LinkStyle(int i, boolean z) {
        this.color = i;
        this.underline = z;
    }

    public final int getColor() {
        return this.color;
    }

    public final boolean getUnderline() {
        return this.underline;
    }

    /* compiled from: LinkStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/LinkStyle$Companion;", "", "<init>", "()V", "fromReadableMap", "Lcom/swmansion/enriched/markdown/styles/LinkStyle;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "parser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LinkStyle fromReadableMap(ReadableMap map, StyleParser parser) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new LinkStyle(parser.parseColor(map, "color"), map.getBoolean(TtmlNode.UNDERLINE));
        }
    }
}
