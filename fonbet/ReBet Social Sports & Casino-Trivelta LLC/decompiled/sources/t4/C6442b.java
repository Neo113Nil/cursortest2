package t4;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6442b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6442b f65677a = new C6442b();

    public static final ReadableArray a(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        Intrinsics.checkNotNull(str);
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getArray(str);
    }

    public static final boolean b(ReadableMap readableMap, String str, boolean z10) {
        if (readableMap != null) {
            Intrinsics.checkNotNull(str);
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                return readableMap.getBoolean(str);
            }
        }
        return z10;
    }

    public static final double c(ReadableMap readableMap, String str, double d10) {
        if (readableMap != null) {
            Intrinsics.checkNotNull(str);
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                return readableMap.getDouble(str);
            }
        }
        return d10;
    }

    public static final float d(ReadableMap readableMap, String str, float f10) {
        if (readableMap != null) {
            Intrinsics.checkNotNull(str);
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                return (float) readableMap.getDouble(str);
            }
        }
        return f10;
    }

    public static final int e(ReadableMap readableMap, String str, int i10) {
        if (readableMap != null) {
            Intrinsics.checkNotNull(str);
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                return readableMap.getInt(str);
            }
        }
        return i10;
    }

    public static final ReadableMap f(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        Intrinsics.checkNotNull(str);
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getMap(str);
    }

    public static final String g(ReadableMap readableMap, String str) {
        return h(readableMap, str, null);
    }

    public static final String h(ReadableMap readableMap, String str, String str2) {
        if (readableMap != null) {
            Intrinsics.checkNotNull(str);
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                return readableMap.getString(str);
            }
        }
        return str2;
    }

    public static final int i(String str, int i10) {
        if (str == null) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i10;
        }
    }
}
