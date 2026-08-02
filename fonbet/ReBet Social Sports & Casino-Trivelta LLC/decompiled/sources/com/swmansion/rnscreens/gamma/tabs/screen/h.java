package com.swmansion.rnscreens.gamma.tabs.screen;

import android.graphics.Color;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes4.dex */
public abstract class h {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Boolean e(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str) && !readableMap.isNull(str) && readableMap.getType(str) == ReadableType.Boolean) {
            return Boolean.valueOf(readableMap.getBoolean(str));
        }
        return null;
    }

    public static final Integer f(ReadableMap readableMap, String str) {
        String string;
        if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
            try {
                int i10 = a.$EnumSwitchMapping$0[readableMap.getType(str).ordinal()];
                if (i10 == 1) {
                    return Integer.valueOf(readableMap.getInt(str));
                }
                if (i10 == 2 && (string = readableMap.getString(str)) != null) {
                    return Integer.valueOf(Color.parseColor(string));
                }
                return null;
            } catch (Exception e10) {
                Log.w(TabsScreenViewManager.TAG, "[RNScreens] Could not parse color for key '" + str + "': " + e10.getMessage());
            }
        }
        return null;
    }

    public static final Float g(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str) && !readableMap.isNull(str) && readableMap.getType(str) == ReadableType.Number) {
            return Float.valueOf((float) readableMap.getDouble(str));
        }
        return null;
    }

    public static final String h(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str) && !readableMap.isNull(str) && readableMap.getType(str) == ReadableType.String) {
            return readableMap.getString(str);
        }
        return null;
    }
}
