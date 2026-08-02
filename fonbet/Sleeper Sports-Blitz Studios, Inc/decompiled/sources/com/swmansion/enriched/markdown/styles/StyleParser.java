package com.swmansion.enriched.markdown.styles;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StyleParser.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0007J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bJ \u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/StyleParser;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "parseOptionalColor", "", "map", "Lcom/facebook/react/bridge/ReadableMap;", SDKConstants.PARAM_KEY, "", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;", "parseColor", "parseOptionalDouble", "", "default", "parseOptionalInt", "parseString", "parseBoolean", "", "toPixelFromSP", "", "value", "toPixelFromDIP", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StyleParser {
    private final Context context;

    public StyleParser(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Integer parseOptionalColor(ReadableMap map, String key) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!map.hasKey(key) || map.isNull(key)) {
            return null;
        }
        return ColorPropConverter.getColor(Double.valueOf(map.getDouble(key)), this.context);
    }

    public final int parseColor(ReadableMap map, String key) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(key, "key");
        Integer parseOptionalColor = parseOptionalColor(map, key);
        if (parseOptionalColor != null) {
            return parseOptionalColor.intValue();
        }
        throw new IllegalArgumentException("Color key '" + key + "' is missing, null, or invalid");
    }

    public static /* synthetic */ double parseOptionalDouble$default(StyleParser styleParser, ReadableMap readableMap, String str, double d, int i, Object obj) {
        if ((i & 4) != 0) {
            d = 0.0d;
        }
        return styleParser.parseOptionalDouble(readableMap, str, d);
    }

    public final double parseOptionalDouble(ReadableMap map, String key, double r4) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(key, "key");
        return (!map.hasKey(key) || map.isNull(key)) ? r4 : map.getDouble(key);
    }

    public static /* synthetic */ int parseOptionalInt$default(StyleParser styleParser, ReadableMap readableMap, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return styleParser.parseOptionalInt(readableMap, str, i);
    }

    public final int parseOptionalInt(ReadableMap map, String key, int r4) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(key, "key");
        return (!map.hasKey(key) || map.isNull(key)) ? r4 : map.getInt(key);
    }

    public static /* synthetic */ String parseString$default(StyleParser styleParser, ReadableMap readableMap, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return styleParser.parseString(readableMap, str, str2);
    }

    public final String parseString(ReadableMap map, String key, String r4) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r4, "default");
        String string = map.getString(key);
        return string == null ? r4 : string;
    }

    public static /* synthetic */ boolean parseBoolean$default(StyleParser styleParser, ReadableMap readableMap, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return styleParser.parseBoolean(readableMap, str, z);
    }

    public final boolean parseBoolean(ReadableMap map, String key, boolean r4) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(key, "key");
        return (!map.hasKey(key) || map.isNull(key)) ? r4 : map.getBoolean(key);
    }

    public final float toPixelFromSP(float value) {
        return PixelUtil.toPixelFromSP$default(value, 0.0f, 2, null);
    }

    public final float toPixelFromDIP(float value) {
        return PixelUtil.toPixelFromDIP(value);
    }
}
