package com.swmansion.enriched.markdown.renderer;

import com.swmansion.enriched.markdown.styles.BaseBlockStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockStyleContext.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/MutableBlockStyle;", "", "<init>", "()V", "fontSize", "", "getFontSize", "()F", "setFontSize", "(F)V", "fontFamily", "", "getFontFamily", "()Ljava/lang/String;", "setFontFamily", "(Ljava/lang/String;)V", "fontWeight", "getFontWeight", "setFontWeight", "color", "", "getColor", "()I", "setColor", "(I)V", "isDirty", "", "()Z", "setDirty", "(Z)V", "updateFrom", "", "style", "Lcom/swmansion/enriched/markdown/styles/BaseBlockStyle;", "toImmutable", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "clear", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MutableBlockStyle {
    private int color;
    private float fontSize;
    private boolean isDirty;
    private String fontFamily = "";
    private String fontWeight = "";

    public final float getFontSize() {
        return this.fontSize;
    }

    public final void setFontSize(float f) {
        this.fontSize = f;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final void setFontFamily(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fontFamily = str;
    }

    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final void setFontWeight(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fontWeight = str;
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    /* renamed from: isDirty, reason: from getter */
    public final boolean getIsDirty() {
        return this.isDirty;
    }

    public final void setDirty(boolean z) {
        this.isDirty = z;
    }

    public final void updateFrom(BaseBlockStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.fontSize = style.getFontSize();
        this.fontFamily = style.getFontFamily();
        this.fontWeight = style.getFontWeight();
        this.color = style.getColor();
        this.isDirty = true;
    }

    public final BlockStyle toImmutable() {
        return new BlockStyle(this.fontSize, this.fontFamily, this.fontWeight, this.color);
    }

    public final void clear() {
        this.isDirty = false;
    }
}
