package com.fyber.inneractive.sdk.web;

import android.util.LruCache;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.k73;

/* loaded from: classes12.dex */
public final class z0 extends LruCache {
    public z0() {
        super(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        String str;
        c1 c1Var = (c1) obj2;
        int i = 0;
        for (String str2 : c1Var.b.keySet()) {
            if (str2 != null && (str = (String) c1Var.b.get(str2)) != null) {
                i = k73.a(str2.length(), i, str);
            }
        }
        return i + c1Var.a.length;
    }
}
