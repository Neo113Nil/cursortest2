package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Q3;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu {
    public static int gm(Context context) {
        return jsj.pcc(context, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean kj(Context context) {
        if (context == null) {
            return false;
        }
        int gm = gm(context);
        return gm == 2 || gm == 3 || gm == 4 || gm == 5 || gm == 6;
    }

    public static boolean oo(Context context) {
        return gm(context) == 4;
    }

    public static boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static String qf(Context context) {
        int gm = gm(context);
        return gm != 2 ? gm != 3 ? gm != 4 ? gm != 5 ? gm != 6 ? "mobile" : "5g" : "4g" : Q3.b : Q3.a : "2g";
    }

    public static int sf(Context context) {
        int gm = gm(context);
        if (gm == 1) {
            return 0;
        }
        if (gm == 4) {
            return 1;
        }
        if (gm == 5) {
            return 4;
        }
        if (gm != 6) {
            return gm;
        }
        return 6;
    }

    public static boolean vj(Context context) {
        return gm(context) == 5;
    }

    public static boolean wh(Context context) {
        return gm(context) == 6;
    }

    public static boolean pcc(Context context) {
        return gm(context) != 0;
    }
}
