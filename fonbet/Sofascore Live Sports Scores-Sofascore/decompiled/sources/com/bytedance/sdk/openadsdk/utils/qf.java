package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    private static long gm = 0;
    static int pcc = -1;
    static float sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public final int pcc;
        public final float sf;

        public pcc(int i, float f) {
            this.pcc = i;
            this.sf = f;
        }
    }

    @NonNull
    public static pcc pcc() {
        if (gm == 0 || SystemClock.elapsedRealtime() - gm > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            Intent f = fn0.f("android.intent.action.BATTERY_CHANGED", com.bytedance.sdk.openadsdk.core.lu.pcc(), null);
            "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(f));
            if (f != null) {
                pcc(f);
                gm = SystemClock.elapsedRealtime();
            }
        }
        return new pcc(pcc, sf);
    }

    private static void pcc(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            pcc = 1;
        } else {
            pcc = 0;
        }
        sf = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }
}
