package com.reactnativecompressor.Video.VideoCompressor.utils;

import androidx.collection.SieveCacheKt;
import kotlin.Metadata;

/* compiled from: NumbersUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u000e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¨\u0006\b"}, d2 = {"uInt32ToLong", "", "int32", "", "uInt32ToInt", "uInt32", "uInt64ToLong", "uInt64", "react-native-compressor_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NumbersUtilsKt {
    public static final long uInt32ToLong(int i) {
        return i;
    }

    public static final int uInt32ToInt(long j) {
        if (j > SieveCacheKt.NodeLinkMask || j < 0) {
            throw new Exception("uInt32 value is too large or negative");
        }
        return (int) j;
    }

    public static final long uInt64ToLong(long j) {
        if (j >= 0) {
            return j;
        }
        throw new Exception("uInt64 value is negative");
    }

    public static final int uInt32ToInt(int i) {
        if (i >= 0) {
            return i;
        }
        throw new Exception("uInt32 value is negative");
    }
}
