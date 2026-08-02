package com.swmansion.enriched.markdown.renderer;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NodeRenderer.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/RendererConfig;", "", "style", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/styles/StyleConfig;)V", "getStyle", "()Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RendererConfig {
    private final StyleConfig style;

    public static /* synthetic */ RendererConfig copy$default(RendererConfig rendererConfig, StyleConfig styleConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            styleConfig = rendererConfig.style;
        }
        return rendererConfig.copy(styleConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final StyleConfig getStyle() {
        return this.style;
    }

    public final RendererConfig copy(StyleConfig style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new RendererConfig(style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RendererConfig) && Intrinsics.areEqual(this.style, ((RendererConfig) other).style);
    }

    public int hashCode() {
        return this.style.hashCode();
    }

    public String toString() {
        return "RendererConfig(style=" + this.style + ")";
    }

    public RendererConfig(StyleConfig style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
    }

    public final StyleConfig getStyle() {
        return this.style;
    }
}
