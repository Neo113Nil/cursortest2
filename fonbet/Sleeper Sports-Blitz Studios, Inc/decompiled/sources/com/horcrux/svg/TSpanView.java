package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactFontManager;
import com.horcrux.svg.TextProperties;
import java.text.Bidi;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
class TSpanView extends TextView {
    private static final String FONTS = "fonts/";
    private static final String OTF = ".otf";
    private static final String TTF = ".ttf";
    static final String additionalLigatures = "'hlig', 'cala', ";
    static final String defaultFeatures = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', ";
    static final String disableDiscretionaryLigatures = "'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ";
    static final String fontWeightTag = "'wght' ";
    private static final double radToDeg = 57.29577951308232d;
    static final String requiredFontFeatures = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk',";
    private static final double tau = 6.283185307179586d;
    private final AssetManager assets;
    private final ArrayList<String> emoji;
    private final ArrayList<Matrix> emojiTransforms;
    private Path mCachedPath;

    @Nullable
    String mContent;
    private TextPathView textPath;

    public TSpanView(ReactContext reactContext) {
        super(reactContext);
        this.emoji = new ArrayList<>();
        this.emojiTransforms = new ArrayList<>();
        this.assets = this.mContext.getResources().getAssets();
    }

    public void setContent(@Nullable String str) {
        this.mContent = str;
        invalidate();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.mCachedPath = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView
    void clearCache() {
        this.mCachedPath = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f) {
        if (this.mContent != null) {
            if (this.mInlineSize != null && this.mInlineSize.value != 0.0d) {
                if (setupFillPaint(paint, this.fillOpacity * f)) {
                    drawWrappedText(canvas, paint);
                }
                if (setupStrokePaint(paint, f * this.strokeOpacity)) {
                    drawWrappedText(canvas, paint);
                    return;
                }
                return;
            }
            int size = this.emoji.size();
            if (size > 0) {
                applyTextPropertiesToPaint(paint, getTextRootGlyphContext().getFont());
                for (int i = 0; i < size; i++) {
                    String str = this.emoji.get(i);
                    Matrix matrix = this.emojiTransforms.get(i);
                    canvas.save();
                    canvas.concat(matrix);
                    canvas.drawText(str, 0.0f, 0.0f, paint);
                    canvas.restore();
                }
            }
            drawPath(canvas, paint, f);
            return;
        }
        clip(canvas, paint);
        drawGroup(canvas, paint, f);
    }

    private void drawWrappedText(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        GlyphContext textRootGlyphContext = getTextRootGlyphContext();
        pushGlyphContext();
        FontData font = textRootGlyphContext.getFont();
        TextPaint textPaint = new TextPaint(paint);
        applyTextPropertiesToPaint(textPaint, font);
        applySpacingAndFeatures(textPaint, font);
        double fontSize = textRootGlyphContext.getFontSize();
        int i = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[font.textAnchor.ordinal()];
        if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout staticLayout = getStaticLayout(textPaint, alignment, true, new SpannableString(this.mContent), (int) PropHelper.fromRelative(this.mInlineSize, canvas.getWidth(), 0.0d, this.mScale, fontSize));
        int lineAscent = staticLayout.getLineAscent(0);
        float nextX = (float) textRootGlyphContext.nextX(0.0d);
        float nextY = (float) (textRootGlyphContext.nextY() + lineAscent);
        popGlyphContext();
        canvas.save();
        canvas.translate(nextX, nextY);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private StaticLayout getStaticLayout(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    public static String visualToLogical(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int intValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mCachedPath;
        if (path != null) {
            return path;
        }
        if (this.mContent == null) {
            Path groupPath = getGroupPath(canvas, paint);
            this.mCachedPath = groupPath;
            return groupPath;
        }
        setupTextPath();
        pushGlyphContext();
        this.mCachedPath = getLinePath(visualToLogical(this.mContent), paint, canvas);
        popGlyphContext();
        return this.mCachedPath;
    }

    @Override // com.horcrux.svg.TextView
    double getSubtreeTextChunksTotalAdvance(Paint paint) {
        if (!Double.isNaN(this.cachedAdvance)) {
            return this.cachedAdvance;
        }
        String str = this.mContent;
        double d = 0.0d;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof TextView) {
                    d += ((TextView) childAt).getSubtreeTextChunksTotalAdvance(paint);
                }
            }
            this.cachedAdvance = d;
            return d;
        }
        if (str.length() == 0) {
            this.cachedAdvance = 0.0d;
            return 0.0d;
        }
        FontData font = getTextRootGlyphContext().getFont();
        applyTextPropertiesToPaint(paint, font);
        applySpacingAndFeatures(paint, font);
        this.cachedAdvance = paint.measureText(str);
        return this.cachedAdvance;
    }

    private void applySpacingAndFeatures(Paint paint, FontData fontData) {
        double d = fontData.letterSpacing;
        paint.setLetterSpacing((float) (d / (fontData.fontSize * this.mScale)));
        if (d == 0.0d && fontData.fontVariantLigatures == TextProperties.FontVariantLigatures.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + fontData.fontFeatureSettings);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + fontData.fontFeatureSettings);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            paint.setFontVariationSettings(fontWeightTag + fontData.absoluteFontWeight + fontData.fontVariationSettings);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path getLinePath(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        boolean z;
        double d;
        GlyphContext glyphContext;
        boolean z2;
        TSpanView tSpanView;
        double d2;
        boolean z3;
        GlyphContext glyphContext2;
        double d3;
        boolean z4;
        GlyphPathBag glyphPathBag;
        float[] fArr;
        boolean[] zArr;
        double d4;
        double d5;
        double d6;
        int i;
        boolean z5;
        double d7;
        String baselineShift;
        TextProperties.AlignmentBaseline alignmentBaseline;
        char c;
        int i2;
        boolean z6;
        float f;
        boolean z7;
        double d8;
        float[] fArr2;
        Canvas canvas2;
        int i3;
        GlyphContext glyphContext3;
        GlyphPathBag glyphPathBag2;
        Matrix matrix;
        TSpanView tSpanView2;
        Paint paint2;
        float[] fArr3;
        Path path;
        char c2;
        double d9;
        GlyphPathBag glyphPathBag3;
        float f2;
        double d10;
        char c3;
        double d11;
        float[] fArr4;
        int i4;
        String str2;
        Path orCreateAndCache;
        int i5;
        int i6;
        double d12;
        Paint paint3 = paint;
        Canvas canvas3 = canvas;
        int length = str.length();
        Path path2 = new Path();
        this.emoji.clear();
        this.emojiTransforms.clear();
        if (length != 0) {
            boolean z8 = this.textPath != null;
            if (z8) {
                pathMeasure = new PathMeasure(this.textPath.getTextPath(canvas3, paint3), false);
                d = pathMeasure.getLength();
                boolean isClosed = pathMeasure.isClosed();
                if (d != 0.0d) {
                    z = isClosed;
                }
            } else {
                pathMeasure = null;
                z = false;
                d = 0.0d;
            }
            PathMeasure pathMeasure2 = pathMeasure;
            GlyphContext textRootGlyphContext = getTextRootGlyphContext();
            FontData font = textRootGlyphContext.getFont();
            applyTextPropertiesToPaint(paint3, font);
            GlyphPathBag glyphPathBag4 = new GlyphPathBag(paint3);
            boolean[] zArr2 = new boolean[length];
            char[] charArray = str.toCharArray();
            double d13 = font.kerning;
            double d14 = font.wordSpacing;
            double d15 = font.letterSpacing;
            boolean z9 = font.manualKerning;
            if (d15 == 0.0d) {
                glyphContext = textRootGlyphContext;
                if (font.fontVariantLigatures == TextProperties.FontVariantLigatures.normal) {
                    z2 = true;
                    if (!z2) {
                        paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + font.fontFeatureSettings);
                    } else {
                        paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + font.fontFeatureSettings);
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        paint3.setFontVariationSettings(fontWeightTag + font.absoluteFontWeight + font.fontVariationSettings);
                    }
                    ReadableMap readableMap = font.fontData;
                    float[] fArr5 = new float[length];
                    double d16 = d;
                    paint3.getTextWidths(str, fArr5);
                    TextProperties.TextAnchor textAnchor = font.textAnchor;
                    double subtreeTextChunksTotalAdvance = getTextAnchorRoot().getSubtreeTextChunksTotalAdvance(paint3);
                    double textAnchorOffset = getTextAnchorOffset(textAnchor, subtreeTextChunksTotalAdvance);
                    double fontSize = glyphContext.getFontSize();
                    char c4 = 65535;
                    if (z8) {
                        tSpanView = this;
                        d2 = subtreeTextChunksTotalAdvance;
                        z3 = z9;
                        glyphContext2 = glyphContext;
                        d3 = fontSize;
                        z4 = z8;
                        glyphPathBag = glyphPathBag4;
                        fArr = fArr5;
                        zArr = zArr2;
                        d4 = d16;
                        d5 = 0.0d;
                        d6 = textAnchorOffset;
                        i = 1;
                        z5 = false;
                    } else {
                        boolean z10 = this.textPath.getMidLine() == TextProperties.TextPathMidLine.sharp;
                        int i7 = this.textPath.getSide() == TextProperties.TextPathSide.right ? -1 : 1;
                        d2 = subtreeTextChunksTotalAdvance;
                        z3 = z9;
                        glyphContext2 = glyphContext;
                        fArr = fArr5;
                        z4 = z8;
                        zArr = zArr2;
                        glyphPathBag = glyphPathBag4;
                        double absoluteStartOffset = getAbsoluteStartOffset(this.textPath.getStartOffset(), d16, fontSize);
                        tSpanView = this;
                        d4 = d16;
                        double d17 = textAnchorOffset + absoluteStartOffset;
                        d3 = fontSize;
                        if (z) {
                            double d18 = absoluteStartOffset + (textAnchor == TextProperties.TextAnchor.middle ? -(d4 / 2.0d) : 0.0d);
                            d6 = d17;
                            d5 = d18;
                            z5 = z10;
                            d7 = d18 + d4;
                            i = i7;
                            double d19 = 1.0d;
                            if (tSpanView.mTextLength != null) {
                                double fromRelative = PropHelper.fromRelative(tSpanView.mTextLength, canvas3.getWidth(), 0.0d, tSpanView.mScale, d3);
                                if (fromRelative < 0.0d) {
                                    throw new IllegalArgumentException("Negative textLength value");
                                }
                                if (AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[tSpanView.mLengthAdjust.ordinal()] != 2) {
                                    d15 += (fromRelative - d2) / (length - 1);
                                } else {
                                    d19 = fromRelative / d2;
                                }
                            }
                            double d20 = i;
                            boolean z11 = z5;
                            Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                            int i8 = i;
                            double d21 = d19 * d20;
                            double d22 = fontMetrics.descent;
                            double d23 = d4;
                            double d24 = fontMetrics.leading + d22;
                            double d25 = (-fontMetrics.ascent) + fontMetrics.leading;
                            double d26 = -fontMetrics.top;
                            double d27 = d26 + d24;
                            baselineShift = tSpanView.getBaselineShift();
                            alignmentBaseline = tSpanView.getAlignmentBaseline();
                            if (alignmentBaseline != null) {
                                switch (alignmentBaseline) {
                                    case textBottom:
                                    case afterEdge:
                                    case textAfterEdge:
                                    case ideographic:
                                        c = 0;
                                        d25 = -d22;
                                        break;
                                    case middle:
                                        c = 0;
                                        paint3.getTextBounds("x", 0, 1, new Rect());
                                        d25 = r0.height() / 2.0d;
                                        break;
                                    case central:
                                        d25 = (d25 - d22) / 2.0d;
                                        c = 0;
                                        break;
                                    case mathematical:
                                        d12 = 0.5d;
                                        d25 *= d12;
                                        c = 0;
                                        break;
                                    case hanging:
                                        d12 = 0.8d;
                                        d25 *= d12;
                                        c = 0;
                                        break;
                                    case textTop:
                                    case beforeEdge:
                                    case textBeforeEdge:
                                        c = 0;
                                        break;
                                    case bottom:
                                        d25 = d24;
                                        c = 0;
                                        break;
                                    case center:
                                        d25 = d27 / 2.0d;
                                        c = 0;
                                        break;
                                    case top:
                                        d25 = d26;
                                        c = 0;
                                        break;
                                }
                                if (baselineShift != null && !baselineShift.isEmpty() && (i6 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[alignmentBaseline.ordinal()]) != 14 && i6 != 16) {
                                    baselineShift.hashCode();
                                    switch (baselineShift.hashCode()) {
                                        case -1720785339:
                                            if (baselineShift.equals("baseline")) {
                                                c4 = c;
                                                break;
                                            }
                                            break;
                                        case 114240:
                                            if (baselineShift.equals("sub")) {
                                                c4 = 1;
                                                break;
                                            }
                                            break;
                                        case 109801339:
                                            if (baselineShift.equals("super")) {
                                                c4 = 2;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c4) {
                                        case 0:
                                            break;
                                        case 1:
                                            if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                                int i9 = readableMap.getInt("unitsPerEm");
                                                ReadableMap map = readableMap.getMap("tables");
                                                if (map.hasKey("os2")) {
                                                    ReadableMap map2 = map.getMap("os2");
                                                    if (map2.hasKey("ySubscriptYOffset")) {
                                                        d25 += ((tSpanView.mScale * d3) * map2.getDouble("ySubscriptYOffset")) / i9;
                                                        break;
                                                    }
                                                }
                                                d25 = d25;
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                                int i10 = readableMap.getInt("unitsPerEm");
                                                ReadableMap map3 = readableMap.getMap("tables");
                                                if (map3.hasKey("os2")) {
                                                    ReadableMap map4 = map3.getMap("os2");
                                                    if (map4.hasKey("ySuperscriptYOffset")) {
                                                        d25 -= ((tSpanView.mScale * d3) * map4.getDouble("ySuperscriptYOffset")) / i10;
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            d25 -= PropHelper.fromRelative(baselineShift, tSpanView.mScale * d3, tSpanView.mScale, d3);
                                            break;
                                    }
                                }
                                double d28 = d25;
                                Matrix matrix2 = new Matrix();
                                Matrix matrix3 = new Matrix();
                                Matrix matrix4 = new Matrix();
                                float[] fArr6 = new float[9];
                                float[] fArr7 = new float[9];
                                i2 = 0;
                                while (i2 < length) {
                                    char c5 = charArray[i2];
                                    String valueOf = String.valueOf(c5);
                                    boolean z12 = zArr[i2];
                                    if (z12) {
                                        valueOf = "";
                                        z6 = false;
                                        f = 0.0f;
                                    } else {
                                        int i11 = i2;
                                        z6 = false;
                                        f = 0.0f;
                                        while (true) {
                                            int i12 = i11 + 1;
                                            if (i12 < length && fArr[i12] <= 0.0f) {
                                                valueOf = valueOf + charArray[i12];
                                                zArr[i12] = true;
                                                i11 = i12;
                                                z6 = true;
                                            }
                                        }
                                    }
                                    int i13 = i2;
                                    double measureText = paint3.measureText(valueOf) * d19;
                                    if (!z3) {
                                        d13 = (fArr[i13] * d19) - measureText;
                                    }
                                    boolean z13 = c5 == ' ';
                                    double d29 = measureText + (z13 ? d14 : 0.0d) + d15;
                                    if (z12) {
                                        z7 = z13;
                                        d8 = 0.0d;
                                    } else {
                                        z7 = z13;
                                        d8 = d13 + d29;
                                    }
                                    double nextX = glyphContext2.nextX(d8);
                                    double nextY = glyphContext2.nextY();
                                    double nextDeltaX = glyphContext2.nextDeltaX();
                                    double nextDeltaY = glyphContext2.nextDeltaY();
                                    String str3 = valueOf;
                                    double nextRotation = glyphContext2.nextRotation();
                                    if (z12 || z7) {
                                        fArr2 = fArr7;
                                        canvas2 = canvas3;
                                        i3 = length;
                                        glyphContext3 = glyphContext2;
                                        glyphPathBag2 = glyphPathBag;
                                        matrix = matrix3;
                                        tSpanView2 = this;
                                        paint2 = paint;
                                        fArr3 = fArr6;
                                        path = path2;
                                    } else {
                                        double d30 = measureText * d20;
                                        i3 = length;
                                        Path path3 = path2;
                                        double d31 = (d6 + ((nextX + nextDeltaX) * d20)) - (d29 * d20);
                                        if (z4) {
                                            c2 = c5;
                                            d9 = nextRotation;
                                            double d32 = d31 + d30;
                                            double d33 = d30 / 2.0d;
                                            double d34 = d31 + d33;
                                            if (d34 <= d7 && d34 >= d5) {
                                                glyphContext3 = glyphContext2;
                                                if (z11) {
                                                    pathMeasure2.getMatrix((float) d34, matrix3, 3);
                                                    fArr2 = fArr7;
                                                    glyphPathBag3 = glyphPathBag;
                                                    matrix = matrix3;
                                                    d11 = d23;
                                                    c3 = 2;
                                                    fArr4 = fArr6;
                                                } else {
                                                    if (d31 < 0.0d) {
                                                        glyphPathBag3 = glyphPathBag;
                                                        float f3 = f;
                                                        pathMeasure2.getMatrix(f3, matrix2, 3);
                                                        matrix2.preTranslate((float) d31, f3);
                                                        i5 = 1;
                                                    } else {
                                                        glyphPathBag3 = glyphPathBag;
                                                        i5 = 1;
                                                        pathMeasure2.getMatrix((float) d31, matrix2, 1);
                                                    }
                                                    pathMeasure2.getMatrix((float) d34, matrix3, i5);
                                                    if (d32 > d23) {
                                                        d11 = d23;
                                                        pathMeasure2.getMatrix((float) d11, matrix4, 3);
                                                        matrix4.preTranslate((float) (d32 - d11), 0.0f);
                                                    } else {
                                                        d11 = d23;
                                                        pathMeasure2.getMatrix((float) d32, matrix4, i5);
                                                    }
                                                    matrix2.getValues(fArr6);
                                                    matrix4.getValues(fArr7);
                                                    c3 = 2;
                                                    fArr2 = fArr7;
                                                    fArr4 = fArr6;
                                                    matrix = matrix3;
                                                    matrix.preRotate((float) (Math.atan2(fArr7[5] - fArr6[5], fArr7[2] - fArr6[2]) * radToDeg * d20));
                                                }
                                                matrix.preTranslate((float) (-d33), (float) (nextDeltaY + d28));
                                                d10 = d21;
                                                i4 = i8;
                                                matrix.preScale((float) d10, i4);
                                                f2 = 0.0f;
                                                matrix.postTranslate(0.0f, (float) nextY);
                                            } else {
                                                tSpanView2 = this;
                                                canvas2 = canvas;
                                                fArr2 = fArr7;
                                                fArr3 = fArr6;
                                                glyphContext3 = glyphContext2;
                                                glyphPathBag2 = glyphPathBag;
                                                matrix = matrix3;
                                                path = path3;
                                                paint2 = paint;
                                            }
                                        } else {
                                            fArr2 = fArr7;
                                            c2 = c5;
                                            d9 = nextRotation;
                                            glyphContext3 = glyphContext2;
                                            glyphPathBag3 = glyphPathBag;
                                            matrix = matrix3;
                                            f2 = f;
                                            d10 = d21;
                                            c3 = 2;
                                            d11 = d23;
                                            fArr4 = fArr6;
                                            i4 = i8;
                                            matrix.setTranslate((float) d31, (float) (nextY + nextDeltaY + d28));
                                        }
                                        matrix.preRotate((float) d9);
                                        if (z6) {
                                            orCreateAndCache = new Path();
                                            d21 = d10;
                                            fArr3 = fArr4;
                                            d23 = d11;
                                            tSpanView2 = this;
                                            paint2 = paint;
                                            i8 = i4;
                                            str2 = str3;
                                            paint2.getTextPath(str2, 0, str3.length(), 0.0f, 0.0f, orCreateAndCache);
                                            glyphPathBag2 = glyphPathBag3;
                                        } else {
                                            tSpanView2 = this;
                                            paint2 = paint;
                                            i8 = i4;
                                            d21 = d10;
                                            fArr3 = fArr4;
                                            str2 = str3;
                                            d23 = d11;
                                            glyphPathBag2 = glyphPathBag3;
                                            orCreateAndCache = glyphPathBag2.getOrCreateAndCache(c2, str2);
                                        }
                                        RectF rectF = new RectF();
                                        orCreateAndCache.computeBounds(rectF, true);
                                        if (rectF.width() == f2) {
                                            canvas.save();
                                            canvas2 = canvas;
                                            canvas2.concat(matrix);
                                            tSpanView2.emoji.add(str2);
                                            tSpanView2.emojiTransforms.add(new Matrix(matrix));
                                            canvas2.drawText(str2, f2, f2, paint2);
                                            canvas2.restore();
                                            path = path3;
                                        } else {
                                            canvas2 = canvas;
                                            orCreateAndCache.transform(matrix);
                                            path = path3;
                                            path.addPath(orCreateAndCache);
                                        }
                                    }
                                    paint3 = paint2;
                                    path2 = path;
                                    glyphPathBag = glyphPathBag2;
                                    tSpanView = tSpanView2;
                                    fArr6 = fArr3;
                                    matrix3 = matrix;
                                    length = i3;
                                    glyphContext2 = glyphContext3;
                                    fArr7 = fArr2;
                                    canvas3 = canvas2;
                                    i2 = i13 + 1;
                                }
                                return path2;
                            }
                            c = 0;
                            d25 = 0.0d;
                            if (baselineShift != null) {
                                baselineShift.hashCode();
                                switch (baselineShift.hashCode()) {
                                    case -1720785339:
                                        break;
                                    case 114240:
                                        break;
                                    case 109801339:
                                        break;
                                }
                                switch (c4) {
                                }
                            }
                            double d282 = d25;
                            Matrix matrix22 = new Matrix();
                            Matrix matrix32 = new Matrix();
                            Matrix matrix42 = new Matrix();
                            float[] fArr62 = new float[9];
                            float[] fArr72 = new float[9];
                            i2 = 0;
                            while (i2 < length) {
                            }
                            return path2;
                        }
                        d5 = 0.0d;
                        d6 = d17;
                        z5 = z10;
                        i = i7;
                    }
                    d7 = d4;
                    double d192 = 1.0d;
                    if (tSpanView.mTextLength != null) {
                    }
                    double d202 = i;
                    boolean z112 = z5;
                    Paint.FontMetrics fontMetrics2 = paint3.getFontMetrics();
                    int i82 = i;
                    double d212 = d192 * d202;
                    double d222 = fontMetrics2.descent;
                    double d232 = d4;
                    double d242 = fontMetrics2.leading + d222;
                    double d252 = (-fontMetrics2.ascent) + fontMetrics2.leading;
                    double d262 = -fontMetrics2.top;
                    double d272 = d262 + d242;
                    baselineShift = tSpanView.getBaselineShift();
                    alignmentBaseline = tSpanView.getAlignmentBaseline();
                    if (alignmentBaseline != null) {
                    }
                    c = 0;
                    d252 = 0.0d;
                    if (baselineShift != null) {
                    }
                    double d2822 = d252;
                    Matrix matrix222 = new Matrix();
                    Matrix matrix322 = new Matrix();
                    Matrix matrix422 = new Matrix();
                    float[] fArr622 = new float[9];
                    float[] fArr722 = new float[9];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    return path2;
                }
            } else {
                glyphContext = textRootGlyphContext;
            }
            z2 = false;
            if (!z2) {
            }
            if (Build.VERSION.SDK_INT >= 26) {
            }
            ReadableMap readableMap2 = font.fontData;
            float[] fArr52 = new float[length];
            double d162 = d;
            paint3.getTextWidths(str, fArr52);
            TextProperties.TextAnchor textAnchor2 = font.textAnchor;
            double subtreeTextChunksTotalAdvance2 = getTextAnchorRoot().getSubtreeTextChunksTotalAdvance(paint3);
            double textAnchorOffset2 = getTextAnchorOffset(textAnchor2, subtreeTextChunksTotalAdvance2);
            double fontSize2 = glyphContext.getFontSize();
            char c42 = 65535;
            if (z8) {
            }
            d7 = d4;
            double d1922 = 1.0d;
            if (tSpanView.mTextLength != null) {
            }
            double d2022 = i;
            boolean z1122 = z5;
            Paint.FontMetrics fontMetrics22 = paint3.getFontMetrics();
            int i822 = i;
            double d2122 = d1922 * d2022;
            double d2222 = fontMetrics22.descent;
            double d2322 = d4;
            double d2422 = fontMetrics22.leading + d2222;
            double d2522 = (-fontMetrics22.ascent) + fontMetrics22.leading;
            double d2622 = -fontMetrics22.top;
            double d2722 = d2622 + d2422;
            baselineShift = tSpanView.getBaselineShift();
            alignmentBaseline = tSpanView.getAlignmentBaseline();
            if (alignmentBaseline != null) {
            }
            c = 0;
            d2522 = 0.0d;
            if (baselineShift != null) {
            }
            double d28222 = d2522;
            Matrix matrix2222 = new Matrix();
            Matrix matrix3222 = new Matrix();
            Matrix matrix4222 = new Matrix();
            float[] fArr6222 = new float[9];
            float[] fArr7222 = new float[9];
            i2 = 0;
            while (i2 < length) {
            }
            return path2;
        }
        return path2;
    }

    /* renamed from: com.horcrux.svg.TSpanView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust;

        static {
            int[] iArr = new int[TextProperties.AlignmentBaseline.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline = iArr;
            try {
                iArr[TextProperties.AlignmentBaseline.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[TextProperties.TextLengthAdjust.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust = iArr2;
            try {
                iArr2[TextProperties.TextLengthAdjust.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[TextProperties.TextLengthAdjust.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[TextProperties.TextAnchor.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = iArr3;
            try {
                iArr3[TextProperties.TextAnchor.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private double getAbsoluteStartOffset(SVGLength sVGLength, double d, double d2) {
        return PropHelper.fromRelative(sVGLength, d, 0.0d, this.mScale, d2);
    }

    private double getTextAnchorOffset(TextProperties.TextAnchor textAnchor, double d) {
        int i = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor.ordinal()];
        if (i == 2) {
            return (-d) / 2.0d;
        }
        if (i != 3) {
            return 0.0d;
        }
        return -d;
    }

    private void applyTextPropertiesToPaint(Paint paint, FontData fontData) {
        int i = 0;
        boolean z = fontData.fontWeight == TextProperties.FontWeight.Bold || fontData.absoluteFontWeight >= 550;
        boolean z2 = fontData.fontStyle == TextProperties.FontStyle.italic;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        int i2 = fontData.absoluteFontWeight;
        String str = fontData.fontFamily;
        Typeface typeface = null;
        if (str != null && str.length() > 0) {
            String str2 = FONTS + str + OTF;
            String str3 = FONTS + str + TTF;
            if (Build.VERSION.SDK_INT >= 26) {
                TSpanView$$ExternalSyntheticApiModelOutline0.m11367m$3();
                Typeface.Builder m = TSpanView$$ExternalSyntheticApiModelOutline0.m(this.assets, str2);
                m.setFontVariationSettings(fontWeightTag + i2 + fontData.fontVariationSettings);
                m.setWeight(i2);
                m.setItalic(z2);
                typeface = m.build();
                if (typeface == null) {
                    TSpanView$$ExternalSyntheticApiModelOutline0.m11367m$3();
                    Typeface.Builder m2 = TSpanView$$ExternalSyntheticApiModelOutline0.m(this.assets, str3);
                    m2.setFontVariationSettings(fontWeightTag + i2 + fontData.fontVariationSettings);
                    m2.setWeight(i2);
                    m2.setItalic(z2);
                    typeface = m2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.assets, str2), i);
                    } catch (Exception unused) {
                        typeface = Typeface.create(Typeface.createFromAsset(this.assets, str3), i);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str, i, this.assets);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (fontData.fontSize * this.mScale));
        paint.setLetterSpacing(0.0f);
    }

    private void setupTextPath() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == TextPathView.class) {
                this.textPath = (TextPathView) parent;
                return;
            } else {
                if (!(parent instanceof TextView)) {
                    return;
                }
            }
        }
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        if (this.mContent == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            if ((this.mRegion != null && this.mRegion.contains(round, round2)) || (this.mStrokeRegion != null && this.mStrokeRegion.contains(round, round2))) {
                if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }
}
