package com.swmansion.enriched.markdown.renderer;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockStyleContext.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "", "fontSize", "", "fontFamily", "", "fontWeight", "color", "", "<init>", "(FLjava/lang/String;Ljava/lang/String;I)V", "getFontSize", "()F", "getFontFamily", "()Ljava/lang/String;", "getFontWeight", "getColor", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BlockStyle {
    private final int color;
    private final String fontFamily;
    private final float fontSize;
    private final String fontWeight;

    public static /* synthetic */ BlockStyle copy$default(BlockStyle blockStyle, float f, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = blockStyle.fontSize;
        }
        if ((i2 & 2) != 0) {
            str = blockStyle.fontFamily;
        }
        if ((i2 & 4) != 0) {
            str2 = blockStyle.fontWeight;
        }
        if ((i2 & 8) != 0) {
            i = blockStyle.color;
        }
        return blockStyle.copy(f, str, str2, i);
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

    public final BlockStyle copy(float fontSize, String fontFamily, String fontWeight, int color) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new BlockStyle(fontSize, fontFamily, fontWeight, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockStyle)) {
            return false;
        }
        BlockStyle blockStyle = (BlockStyle) other;
        return Float.compare(this.fontSize, blockStyle.fontSize) == 0 && Intrinsics.areEqual(this.fontFamily, blockStyle.fontFamily) && Intrinsics.areEqual(this.fontWeight, blockStyle.fontWeight) && this.color == blockStyle.color;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.fontSize) * 31) + this.fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.color);
    }

    public String toString() {
        return "BlockStyle(fontSize=" + this.fontSize + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", color=" + this.color + ")";
    }

    public BlockStyle(float f, String fontFamily, String fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontSize = f;
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.color = i;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final int getColor() {
        return this.color;
    }
}
