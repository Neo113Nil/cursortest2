package com.bytedance.sdk.component.wh.pcc.sf;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.wh.pcc.pcc.vj;
import com.bytedance.sdk.component.wh.pcc.qf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static boolean gm() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.oo())) ? false : true;
    }

    public static boolean oo() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.vj())) ? false : true;
    }

    public static boolean pcc() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.pcc())) ? false : true;
    }

    private static long sf(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory() / 1048576;
        long maxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (maxMemory <= 0) {
            if (freeMemory <= 2) {
                return 1L;
            }
            return freeMemory <= 10 ? Math.min(i, 10) : Math.min((freeMemory / 2) * 10, i);
        }
        long j = ((freeMemory + maxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        return j <= 10 ? Math.min(i, 10) : Math.min(j * 10, i);
    }

    public static boolean vj() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.gm())) ? false : true;
    }

    public static boolean wh() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.wh())) ? false : true;
    }

    public static long pcc(int i, Context context) {
        return sf(i, context);
    }

    public static boolean sf() {
        vj gm = qf.wh().gm();
        return (gm == null || TextUtils.isEmpty(gm.sf())) ? false : true;
    }
}
