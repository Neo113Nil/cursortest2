package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.common.ReactConstants;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J!\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J!\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013J\"\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J!\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/bridge/ColorPropConverter;", "", "<init>", "()V", "supportWideGamut", "", "JSON_KEY", "", "PREFIX_RESOURCE", "PREFIX_ATTR", "PACKAGE_DELIMITER", "PATH_DELIMITER", "ATTR", "ATTR_SEGMENT", "getColorInteger", "", EventKeys.VALUE_KEY, "context", "Landroid/content/Context;", "(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;", "getColorInstance", "Landroid/graphics/Color;", "getColor", "defaultInt", "resolveResourcePath", "resourcePath", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;", "resolveResource", "resolveThemeAttribute", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ColorPropConverter {

    @NotNull
    private static final String ATTR = "attr";

    @NotNull
    private static final String ATTR_SEGMENT = "attr/";

    @NotNull
    public static final ColorPropConverter INSTANCE = new ColorPropConverter();

    @NotNull
    private static final String JSON_KEY = "resource_paths";

    @NotNull
    private static final String PACKAGE_DELIMITER = ":";

    @NotNull
    private static final String PATH_DELIMITER = "/";

    @NotNull
    private static final String PREFIX_ATTR = "?";

    @NotNull
    private static final String PREFIX_RESOURCE = "@";

    private ColorPropConverter() {
    }

    @JvmStatic
    @Nullable
    public static final Integer getColor(@Nullable Object value, @NotNull Context context) {
        Color colorInstance;
        int argb;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (INSTANCE.supportWideGamut() && (colorInstance = getColorInstance(value, context)) != null) {
                argb = colorInstance.toArgb();
                return Integer.valueOf(argb);
            }
        } catch (JSApplicationCausedNativeException e10) {
            E6.a.N(ReactConstants.TAG, e10, "Error extracting color from WideGamut", new Object[0]);
        }
        return INSTANCE.getColorInteger(value, context);
    }

    @JvmStatic
    @Nullable
    public static final Color getColorInstance(@Nullable Object value, @NotNull Context context) {
        Color valueOf;
        ColorSpace colorSpace;
        long pack;
        Color valueOf2;
        Color valueOf3;
        Intrinsics.checkNotNullParameter(context, "context");
        if (value == null) {
            return null;
        }
        ColorPropConverter colorPropConverter = INSTANCE;
        if (colorPropConverter.supportWideGamut() && (value instanceof Double)) {
            valueOf3 = Color.valueOf((int) ((Number) value).doubleValue());
            return valueOf3;
        }
        if (!(value instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        if (colorPropConverter.supportWideGamut()) {
            ReadableMap readableMap = (ReadableMap) value;
            if (readableMap.hasKey("space")) {
                colorSpace = ColorSpace.get(Intrinsics.areEqual(readableMap.getString("space"), "display-p3") ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                Intrinsics.checkNotNullExpressionValue(colorSpace, "get(...)");
                pack = Color.pack((float) readableMap.getDouble("r"), (float) readableMap.getDouble("g"), (float) readableMap.getDouble(com.google.crypto.tink.integration.android.b.f37029b), (float) readableMap.getDouble("a"), colorSpace);
                valueOf2 = Color.valueOf(pack);
                return valueOf2;
            }
        }
        ReadableArray array = ((ReadableMap) value).getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        int size = array.size();
        for (int i10 = 0; i10 < size; i10++) {
            Integer resolveResourcePath = resolveResourcePath(context, array.getString(i10));
            if (INSTANCE.supportWideGamut() && resolveResourcePath != null) {
                valueOf = Color.valueOf(resolveResourcePath.intValue());
                return valueOf;
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private final Integer getColorInteger(Object value, Context context) {
        if (value == null) {
            return null;
        }
        if (value instanceof Double) {
            return Integer.valueOf((int) ((Number) value).doubleValue());
        }
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!(value instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        ReadableMap readableMap = (ReadableMap) value;
        if (readableMap.hasKey("space")) {
            float f10 = (float) readableMap.getDouble("r");
            float f11 = 255;
            return Integer.valueOf(Color.argb((int) (((float) readableMap.getDouble("a")) * f11), (int) (f10 * f11), (int) (((float) readableMap.getDouble("g")) * f11), (int) (((float) readableMap.getDouble(com.google.crypto.tink.integration.android.b.f37029b)) * f11)));
        }
        ReadableArray array = readableMap.getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        int size = array.size();
        for (int i10 = 0; i10 < size; i10++) {
            Integer resolveResourcePath = resolveResourcePath(context, array.getString(i10));
            if (resolveResourcePath != null) {
                return resolveResourcePath;
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private final int resolveResource(Context context, String resourcePath) {
        String str;
        List split$default = StringsKt.split$default((CharSequence) resourcePath, new String[]{PACKAGE_DELIMITER}, false, 0, 6, (Object) null);
        String packageName = context.getPackageName();
        if (split$default.size() > 1) {
            packageName = (String) split$default.get(0);
            str = (String) split$default.get(1);
        } else {
            str = resourcePath;
        }
        List split$default2 = StringsKt.split$default((CharSequence) str, new String[]{PATH_DELIMITER}, false, 0, 6, (Object) null);
        String str2 = (String) split$default2.get(0);
        return androidx.core.content.res.k.d(context.getResources(), context.getResources().getIdentifier((String) split$default2.get(1), str2, packageName), context.getTheme());
    }

    @JvmStatic
    @Nullable
    public static final Integer resolveResourcePath(@NotNull Context context, @Nullable String resourcePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourcePath != null && resourcePath.length() != 0) {
            boolean startsWith$default = StringsKt.startsWith$default(resourcePath, PREFIX_RESOURCE, false, 2, (Object) null);
            boolean startsWith$default2 = StringsKt.startsWith$default(resourcePath, PREFIX_ATTR, false, 2, (Object) null);
            String substring = resourcePath.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            try {
                if (startsWith$default) {
                    return Integer.valueOf(INSTANCE.resolveResource(context, substring));
                }
                if (startsWith$default2) {
                    return Integer.valueOf(INSTANCE.resolveThemeAttribute(context, substring));
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    private final int resolveThemeAttribute(Context context, String resourcePath) {
        String replace$default = StringsKt.replace$default(resourcePath, ATTR_SEGMENT, "", false, 4, (Object) null);
        List split$default = StringsKt.split$default((CharSequence) replace$default, new String[]{PACKAGE_DELIMITER}, false, 0, 6, (Object) null);
        String packageName = context.getPackageName();
        if (split$default.size() > 1) {
            packageName = (String) split$default.get(0);
            replace$default = (String) split$default.get(1);
        }
        int identifier = context.getResources().getIdentifier(replace$default, ATTR, packageName);
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(replace$default, ATTR, Constants.PLATFORM_ANDROID);
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            return typedValue.data;
        }
        throw new Resources.NotFoundException();
    }

    private final boolean supportWideGamut() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @JvmStatic
    public static final int getColor(@Nullable Object value, @NotNull Context context, int defaultInt) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Integer color = getColor(value, context);
            return color != null ? color.intValue() : defaultInt;
        } catch (JSApplicationCausedNativeException e10) {
            E6.a.N(ReactConstants.TAG, e10, "Error converting ColorValue", new Object[0]);
            return defaultInt;
        }
    }
}
