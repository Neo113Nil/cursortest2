package com.swmansion.enriched.markdown;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MeasurementStore.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002'(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0006JA\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ)\u0010\u001e\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0002\u0010\u001fJ)\u0010 \u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0002\u0010\u001fJ\u0012\u0010!\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\"\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020&H\u0002J\"\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/swmansion/enriched/markdown/MeasurementStore;", "", "<init>", "()V", "data", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/swmansion/enriched/markdown/MeasurementStore$MeasurementParams;", "measurePaint", "Landroid/text/TextPaint;", "store", "", "id", "spannable", "", "paint", "release", "", "getMeasureById", "", "context", "Landroid/content/Context;", "width", "", "height", "heightMode", "Lcom/facebook/yoga/YogaMeasureMode;", "props", "Lcom/facebook/react/bridge/ReadableMap;", "(Landroid/content/Context;Ljava/lang/Integer;FFLcom/facebook/yoga/YogaMeasureMode;Lcom/facebook/react/bridge/ReadableMap;)J", "getMeasureByIdInternal", "(Ljava/lang/Integer;FLcom/facebook/react/bridge/ReadableMap;)J", "initialMeasure", "getInitialFontSize", "measure", ViewProps.MAX_WIDTH, "text", "paintParams", "Lcom/swmansion/enriched/markdown/MeasurementStore$PaintParams;", "PaintParams", "MeasurementParams", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MeasurementStore {
    public static final MeasurementStore INSTANCE = new MeasurementStore();
    private static final ConcurrentHashMap<Integer, MeasurementParams> data = new ConcurrentHashMap<>();
    private static final TextPaint measurePaint = new TextPaint();

    /* compiled from: MeasurementStore.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/swmansion/enriched/markdown/MeasurementStore$PaintParams;", "", "typeface", "Landroid/graphics/Typeface;", "fontSize", "", "<init>", "(Landroid/graphics/Typeface;F)V", "getTypeface", "()Landroid/graphics/Typeface;", "getFontSize", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class PaintParams {
        private final float fontSize;
        private final Typeface typeface;

        public static /* synthetic */ PaintParams copy$default(PaintParams paintParams, Typeface typeface, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                typeface = paintParams.typeface;
            }
            if ((i & 2) != 0) {
                f = paintParams.fontSize;
            }
            return paintParams.copy(typeface, f);
        }

        /* renamed from: component1, reason: from getter */
        public final Typeface getTypeface() {
            return this.typeface;
        }

        /* renamed from: component2, reason: from getter */
        public final float getFontSize() {
            return this.fontSize;
        }

        public final PaintParams copy(Typeface typeface, float fontSize) {
            Intrinsics.checkNotNullParameter(typeface, "typeface");
            return new PaintParams(typeface, fontSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaintParams)) {
                return false;
            }
            PaintParams paintParams = (PaintParams) other;
            return Intrinsics.areEqual(this.typeface, paintParams.typeface) && Float.compare(this.fontSize, paintParams.fontSize) == 0;
        }

        public int hashCode() {
            return (this.typeface.hashCode() * 31) + Float.hashCode(this.fontSize);
        }

        public String toString() {
            return "PaintParams(typeface=" + this.typeface + ", fontSize=" + this.fontSize + ")";
        }

        public PaintParams(Typeface typeface, float f) {
            Intrinsics.checkNotNullParameter(typeface, "typeface");
            this.typeface = typeface;
            this.fontSize = f;
        }

        public final Typeface getTypeface() {
            return this.typeface;
        }

        public final float getFontSize() {
            return this.fontSize;
        }
    }

    private MeasurementStore() {
    }

    /* compiled from: MeasurementStore.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/swmansion/enriched/markdown/MeasurementStore$MeasurementParams;", "", "cachedWidth", "", "cachedSize", "", "spannable", "", "paintParams", "Lcom/swmansion/enriched/markdown/MeasurementStore$PaintParams;", "<init>", "(FJLjava/lang/CharSequence;Lcom/swmansion/enriched/markdown/MeasurementStore$PaintParams;)V", "getCachedWidth", "()F", "getCachedSize", "()J", "getSpannable", "()Ljava/lang/CharSequence;", "getPaintParams", "()Lcom/swmansion/enriched/markdown/MeasurementStore$PaintParams;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class MeasurementParams {
        private final long cachedSize;
        private final float cachedWidth;
        private final PaintParams paintParams;
        private final CharSequence spannable;

        public static /* synthetic */ MeasurementParams copy$default(MeasurementParams measurementParams, float f, long j, CharSequence charSequence, PaintParams paintParams, int i, Object obj) {
            if ((i & 1) != 0) {
                f = measurementParams.cachedWidth;
            }
            if ((i & 2) != 0) {
                j = measurementParams.cachedSize;
            }
            if ((i & 4) != 0) {
                charSequence = measurementParams.spannable;
            }
            if ((i & 8) != 0) {
                paintParams = measurementParams.paintParams;
            }
            return measurementParams.copy(f, j, charSequence, paintParams);
        }

        /* renamed from: component1, reason: from getter */
        public final float getCachedWidth() {
            return this.cachedWidth;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCachedSize() {
            return this.cachedSize;
        }

        /* renamed from: component3, reason: from getter */
        public final CharSequence getSpannable() {
            return this.spannable;
        }

        /* renamed from: component4, reason: from getter */
        public final PaintParams getPaintParams() {
            return this.paintParams;
        }

        public final MeasurementParams copy(float cachedWidth, long cachedSize, CharSequence spannable, PaintParams paintParams) {
            Intrinsics.checkNotNullParameter(paintParams, "paintParams");
            return new MeasurementParams(cachedWidth, cachedSize, spannable, paintParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MeasurementParams)) {
                return false;
            }
            MeasurementParams measurementParams = (MeasurementParams) other;
            return Float.compare(this.cachedWidth, measurementParams.cachedWidth) == 0 && this.cachedSize == measurementParams.cachedSize && Intrinsics.areEqual(this.spannable, measurementParams.spannable) && Intrinsics.areEqual(this.paintParams, measurementParams.paintParams);
        }

        public int hashCode() {
            int hashCode = ((Float.hashCode(this.cachedWidth) * 31) + Long.hashCode(this.cachedSize)) * 31;
            CharSequence charSequence = this.spannable;
            return ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.paintParams.hashCode();
        }

        public String toString() {
            float f = this.cachedWidth;
            long j = this.cachedSize;
            CharSequence charSequence = this.spannable;
            return "MeasurementParams(cachedWidth=" + f + ", cachedSize=" + j + ", spannable=" + ((Object) charSequence) + ", paintParams=" + this.paintParams + ")";
        }

        public MeasurementParams(float f, long j, CharSequence charSequence, PaintParams paintParams) {
            Intrinsics.checkNotNullParameter(paintParams, "paintParams");
            this.cachedWidth = f;
            this.cachedSize = j;
            this.spannable = charSequence;
            this.paintParams = paintParams;
        }

        public final float getCachedWidth() {
            return this.cachedWidth;
        }

        public final long getCachedSize() {
            return this.cachedSize;
        }

        public final CharSequence getSpannable() {
            return this.spannable;
        }

        public final PaintParams getPaintParams() {
            return this.paintParams;
        }
    }

    public final boolean store(int id, CharSequence spannable, TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        ConcurrentHashMap<Integer, MeasurementParams> concurrentHashMap = data;
        MeasurementParams measurementParams = concurrentHashMap.get(Integer.valueOf(id));
        float cachedWidth = measurementParams != null ? measurementParams.getCachedWidth() : 0.0f;
        long cachedSize = measurementParams != null ? measurementParams.getCachedSize() : 0L;
        Typeface typeface = paint.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        Intrinsics.checkNotNull(typeface);
        PaintParams paintParams = new PaintParams(typeface, paint.getTextSize());
        long measure = measure(cachedWidth, spannable, paint);
        concurrentHashMap.put(Integer.valueOf(id), new MeasurementParams(cachedWidth, measure, spannable, paintParams));
        return cachedSize != measure;
    }

    public final void release(int id) {
        data.remove(Integer.valueOf(id));
    }

    public final long getMeasureById(Context context, Integer id, float width, float height, YogaMeasureMode heightMode, ReadableMap props) {
        Intrinsics.checkNotNullParameter(context, "context");
        long measureByIdInternal = getMeasureByIdInternal(id, width, props);
        float height2 = YogaMeasureOutput.getHeight(measureByIdInternal);
        if (heightMode != YogaMeasureMode.AT_MOST) {
            return measureByIdInternal;
        }
        return YogaMeasureOutput.make(YogaMeasureOutput.getWidth(measureByIdInternal), RangesKt.coerceAtMost(height2, PixelUtil.toDIPFromPixel(height)));
    }

    private final long getMeasureByIdInternal(Integer id, float width, ReadableMap props) {
        if (id != null) {
            id.intValue();
            ConcurrentHashMap<Integer, MeasurementParams> concurrentHashMap = data;
            MeasurementParams measurementParams = concurrentHashMap.get(id);
            if (measurementParams == null) {
                return initialMeasure(id, width, props);
            }
            if (measurementParams.getCachedWidth() != width || measurementParams.getCachedSize() == 0) {
                long measure = measure(width, measurementParams.getSpannable(), measurementParams.getPaintParams());
                concurrentHashMap.put(id, new MeasurementParams(width, measure, measurementParams.getSpannable(), measurementParams.getPaintParams()));
                return measure;
            }
            return measurementParams.getCachedSize();
        }
        return initialMeasure(null, width, props);
    }

    private final long initialMeasure(Integer id, float width, ReadableMap props) {
        String str;
        String string;
        str = "I";
        if (props != null && (string = props.getString("markdown")) != null) {
            String str2 = string;
            str = str2.length() != 0 ? str2 : "I";
        }
        float initialFontSize = getInitialFontSize(props);
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        PaintParams paintParams = new PaintParams(DEFAULT, initialFontSize);
        String str3 = str;
        long measure = measure(width, str3, paintParams);
        if (id != null) {
            data.put(id, new MeasurementParams(width, measure, str3, paintParams));
        }
        return measure;
    }

    private final float getInitialFontSize(ReadableMap props) {
        ReadableMap map;
        ReadableMap map2 = props != null ? props.getMap("markdownStyle") : null;
        return (float) Math.ceil(PixelUtil.toPixelFromSP$default((map2 == null || (map = map2.getMap("paragraph")) == null) ? 16.0f : (float) map.getDouble("fontSize"), 0.0f, 2, null));
    }

    private final long measure(float maxWidth, CharSequence text, PaintParams paintParams) {
        TextPaint textPaint = measurePaint;
        textPaint.reset();
        textPaint.setTypeface(paintParams.getTypeface());
        textPaint.setTextSize(paintParams.getFontSize());
        return measure(maxWidth, text, textPaint);
    }

    private final long measure(float maxWidth, CharSequence text, TextPaint paint) {
        if (text == null) {
        }
        StaticLayout.Builder lineSpacing = StaticLayout.Builder.obtain(text, 0, text.length(), paint, RangesKt.coerceAtLeast((int) Math.ceil(maxWidth), 1)).setIncludePad(false).setLineSpacing(0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(lineSpacing, "setLineSpacing(...)");
        if (Build.VERSION.SDK_INT >= 29) {
            lineSpacing.setBreakStrategy(1);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            lineSpacing.setUseLineSpacingFromFallbacks(true);
        }
        Intrinsics.checkNotNullExpressionValue(lineSpacing.build(), "build(...)");
        return YogaMeasureOutput.make(PixelUtil.toDIPFromPixel(maxWidth), PixelUtil.toDIPFromPixel(r6.getHeight()));
    }
}
