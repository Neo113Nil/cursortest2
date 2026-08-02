package com.bytedance.sdk.openadsdk.core.gbb.sf;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends gm implements Comparable<pcc> {
    public long pcc;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.gbb.sf.pcc$pcc, reason: collision with other inner class name */
    public static class C0073pcc {
        private gm.EnumC0072gm gm = gm.EnumC0072gm.TRACKING_URL;
        private final String pcc;
        private final long sf;

        public C0073pcc(String str, long j) {
            this.pcc = str;
            this.sf = j;
        }

        public pcc pcc() {
            return new pcc(this.sf, this.pcc, this.gm, Boolean.FALSE);
        }
    }

    public pcc(long j, String str, gm.EnumC0072gm enumC0072gm, Boolean bool) {
        super(str, enumC0072gm, bool);
        this.pcc = j;
    }

    public static int pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Float.parseFloat(split[2]) * 1000.0f) + (Integer.parseInt(split[1]) * 60000) + (Integer.parseInt(split[0]) * 3600000));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public String toString() {
        return super.toString();
    }

    public long pcc() {
        return this.pcc;
    }

    public boolean pcc(long j) {
        return this.pcc <= j && !oo();
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(pcc pccVar) {
        if (pccVar == null) {
            return 1;
        }
        long j = this.pcc;
        long j2 = pccVar.pcc;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }
}
