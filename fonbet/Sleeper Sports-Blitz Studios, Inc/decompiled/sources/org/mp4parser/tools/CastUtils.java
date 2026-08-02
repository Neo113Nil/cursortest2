package org.mp4parser.tools;

import androidx.collection.SieveCacheKt;

/* loaded from: classes10.dex */
public class CastUtils {
    public static int l2i(long j) {
        if (j <= SieveCacheKt.NodeLinkMask && j >= SieveCacheKt.NodeMetaAndPreviousMask) {
            return (int) j;
        }
        throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + j + ")");
    }
}
