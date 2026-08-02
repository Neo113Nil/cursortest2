package ed;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;

/* loaded from: classes4.dex */
public abstract class q {
    public static final Map a(C4201a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return MapsKt.mapOf(TuplesKt.to(ViewProps.TOP, Float.valueOf(PixelUtil.toDIPFromPixel(insets.d()))), TuplesKt.to(ViewProps.RIGHT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.c()))), TuplesKt.to(ViewProps.BOTTOM, Float.valueOf(PixelUtil.toDIPFromPixel(insets.a()))), TuplesKt.to(ViewProps.LEFT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.b()))));
    }

    public static final WritableMap b(C4201a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(insets.d()));
        createMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(insets.c()));
        createMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(insets.a()));
        createMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(insets.b()));
        return createMap;
    }

    public static final Map c(c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return MapsKt.mapOf(TuplesKt.to(C5444x.f55808b, Float.valueOf(PixelUtil.toDIPFromPixel(rect.c()))), TuplesKt.to("y", Float.valueOf(PixelUtil.toDIPFromPixel(rect.d()))), TuplesKt.to("width", Float.valueOf(PixelUtil.toDIPFromPixel(rect.b()))), TuplesKt.to("height", Float.valueOf(PixelUtil.toDIPFromPixel(rect.a()))));
    }

    public static final WritableMap d(c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C5444x.f55808b, PixelUtil.toDIPFromPixel(rect.c()));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(rect.d()));
        createMap.putDouble("width", PixelUtil.toDIPFromPixel(rect.b()));
        createMap.putDouble("height", PixelUtil.toDIPFromPixel(rect.a()));
        return createMap;
    }
}
