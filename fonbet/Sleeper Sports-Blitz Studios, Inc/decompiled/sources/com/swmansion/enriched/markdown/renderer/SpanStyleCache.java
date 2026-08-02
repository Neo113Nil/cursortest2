package com.swmansion.enriched.markdown.renderer;

import android.graphics.Typeface;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpanStyleCache.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bJ\u0016\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006 "}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "", "style", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/styles/StyleConfig;)V", "colorsToPreserve", "", "getColorsToPreserve", "()[I", "strongColor", "", "getStrongColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "emphasisColor", "getEmphasisColor", "linkColor", "getLinkColor", "()I", "linkUnderline", "", "getLinkUnderline", "()Z", "codeColor", "getCodeColor", "buildColorsToPreserve", "getStrongColorFor", "blockColor", "getEmphasisColorFor", "currentColor", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SpanStyleCache {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Typeface> typefaceCache = new LinkedHashMap();
    private final int codeColor;
    private final int[] colorsToPreserve;
    private final Integer emphasisColor;
    private final int linkColor;
    private final boolean linkUnderline;
    private final Integer strongColor;

    public SpanStyleCache(StyleConfig style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.colorsToPreserve = buildColorsToPreserve(style);
        this.strongColor = style.getStrongStyle().getColor();
        this.emphasisColor = style.getEmphasisStyle().getColor();
        this.linkColor = style.getLinkStyle().getColor();
        this.linkUnderline = style.getLinkStyle().getUnderline();
        this.codeColor = style.getCodeStyle().getColor();
    }

    public final int[] getColorsToPreserve() {
        return this.colorsToPreserve;
    }

    public final Integer getStrongColor() {
        return this.strongColor;
    }

    public final Integer getEmphasisColor() {
        return this.emphasisColor;
    }

    public final int getLinkColor() {
        return this.linkColor;
    }

    public final boolean getLinkUnderline() {
        return this.linkUnderline;
    }

    public final int getCodeColor() {
        return this.codeColor;
    }

    private final int[] buildColorsToPreserve(StyleConfig style) {
        List createListBuilder = CollectionsKt.createListBuilder();
        Integer color = style.getStrongStyle().getColor();
        if (color != null) {
            if (color.intValue() == 0) {
                color = null;
            }
            if (color != null) {
                createListBuilder.add(Integer.valueOf(color.intValue()));
            }
        }
        Integer color2 = style.getEmphasisStyle().getColor();
        if (color2 != null) {
            if (color2.intValue() == 0) {
                color2 = null;
            }
            if (color2 != null) {
                createListBuilder.add(Integer.valueOf(color2.intValue()));
            }
        }
        Integer valueOf = Integer.valueOf(style.getLinkStyle().getColor());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            createListBuilder.add(Integer.valueOf(valueOf.intValue()));
        }
        Integer valueOf2 = Integer.valueOf(style.getCodeStyle().getColor());
        Integer num = valueOf2.intValue() != 0 ? valueOf2 : null;
        if (num != null) {
            createListBuilder.add(Integer.valueOf(num.intValue()));
        }
        return CollectionsKt.toIntArray(CollectionsKt.build(createListBuilder));
    }

    public final int getStrongColorFor(int blockColor) {
        Integer num = this.strongColor;
        return num != null ? num.intValue() : blockColor;
    }

    public final int getEmphasisColorFor(int blockColor, int currentColor) {
        if (currentColor != blockColor) {
            return currentColor;
        }
        Integer num = this.emphasisColor;
        return num != null ? num.intValue() : blockColor;
    }

    /* compiled from: SpanStyleCache.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache$Companion;", "", "<init>", "()V", "typefaceCache", "", "", "Landroid/graphics/Typeface;", "getTypeface", "fontFamily", "style", "", "getTypefaceWithWeight", "fontWeight", "getMonospaceTypeface", "currentStyle", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Typeface getTypeface(String fontFamily, int style) {
            Typeface typeface;
            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
            Map map = SpanStyleCache.typefaceCache;
            String str = fontFamily + "|" + style;
            Object obj = map.get(str);
            if (obj == null) {
                if (fontFamily.length() <= 0) {
                    fontFamily = null;
                }
                if (fontFamily == null || (typeface = Typeface.create(fontFamily, 0)) == null) {
                    typeface = Typeface.DEFAULT;
                }
                obj = Typeface.create(typeface, style);
                Intrinsics.checkNotNullExpressionValue(obj, "create(...)");
                map.put(str, obj);
            }
            return (Typeface) obj;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        
            if (r3.equals("900") == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            if (r3.equals("800") == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r3.equals("700") == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
        
            if (r3.equals(androidx.media3.extractor.text.ttml.TtmlNode.BOLD) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
        
            r3 = 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Typeface getTypefaceWithWeight(String fontFamily, String fontWeight) {
            int i;
            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            String lowerCase = fontWeight.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case 54391:
                    break;
                case 55352:
                    break;
                case 56313:
                    break;
                case 3029637:
                    break;
                default:
                    i = 0;
                    break;
            }
            return getTypeface(fontFamily, i);
        }

        public final Typeface getMonospaceTypeface(int currentStyle) {
            Map map = SpanStyleCache.typefaceCache;
            String str = "monospace|" + currentStyle;
            Object obj = map.get(str);
            if (obj == null) {
                obj = Typeface.create(Typeface.MONOSPACE, currentStyle);
                Intrinsics.checkNotNullExpressionValue(obj, "create(...)");
                map.put(str, obj);
            }
            return (Typeface) obj;
        }
    }
}
