package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/text/FontMetricsUtil;", "", "<init>", "()V", "CAP_HEIGHT_MEASUREMENT_TEXT", "", "X_HEIGHT_MEASUREMENT_TEXT", "AMPLIFICATION_FACTOR", "", "getFontMetrics", "Lcom/facebook/react/bridge/WritableArray;", "text", "", "layout", "Landroid/text/Layout;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontMetricsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMetricsUtil.kt\ncom/facebook/react/views/text/FontMetricsUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n*L\n1#1,75:1\n1#2:76\n30#3,3:77\n*S KotlinDebug\n*F\n+ 1 FontMetricsUtil.kt\ncom/facebook/react/views/text/FontMetricsUtil\n*L\n58#1:77,3\n*E\n"})
/* loaded from: classes2.dex */
public final class FontMetricsUtil {
    private static final float AMPLIFICATION_FACTOR = 100.0f;

    @NotNull
    private static final String CAP_HEIGHT_MEASUREMENT_TEXT = "T";

    @NotNull
    public static final FontMetricsUtil INSTANCE = new FontMetricsUtil();

    @NotNull
    private static final String X_HEIGHT_MEASUREMENT_TEXT = "x";

    private FontMetricsUtil() {
    }

    @JvmStatic
    @NotNull
    public static final WritableArray getFontMetrics(@NotNull CharSequence text, @NotNull Layout layout, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint = new TextPaint(layout.getPaint());
        textPaint.setTextSize(textPaint.getTextSize() * AMPLIFICATION_FACTOR);
        int i10 = 0;
        int i11 = 1;
        textPaint.getTextBounds(CAP_HEIGHT_MEASUREMENT_TEXT, 0, 1, new Rect());
        float height = (r6.height() / AMPLIFICATION_FACTOR) / displayMetrics.density;
        String str = "x";
        textPaint.getTextBounds("x", 0, 1, new Rect());
        float height2 = (r8.height() / AMPLIFICATION_FACTOR) / displayMetrics.density;
        int lineCount = layout.getLineCount();
        while (i10 < lineCount) {
            float lineWidth = (text.length() <= 0 || text.charAt(layout.getLineEnd(i10) - i11) != '\n') ? layout.getLineWidth(i10) : layout.getLineMax(i10);
            layout.getLineBounds(i10, new Rect());
            WritableMap createMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
            readableMapBuilder.put(str, layout.getLineLeft(i10) / displayMetrics.density);
            readableMapBuilder.put("y", r12.top / displayMetrics.density);
            readableMapBuilder.put("width", lineWidth / displayMetrics.density);
            readableMapBuilder.put("height", r12.height() / displayMetrics.density);
            readableMapBuilder.put("descender", layout.getLineDescent(i10) / displayMetrics.density);
            readableMapBuilder.put("ascender", (-layout.getLineAscent(i10)) / displayMetrics.density);
            readableMapBuilder.put("baseline", layout.getLineBaseline(i10) / displayMetrics.density);
            readableMapBuilder.put("capHeight", height);
            readableMapBuilder.put("xHeight", height2);
            readableMapBuilder.put("text", text.subSequence(layout.getLineStart(i10), layout.getLineEnd(i10)).toString());
            createArray.pushMap(createMap);
            i10++;
            str = str;
            lineCount = lineCount;
            i11 = 1;
        }
        return createArray;
    }
}
