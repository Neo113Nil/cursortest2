package com.ironsource;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.List;
import xsna.arm0;
import xsna.drm0;
import xsna.zcl;

/* loaded from: classes13.dex */
public enum S7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);

    public static final a b = new a(null);
    private final int a;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final S7 a(Integer num) {
            S7 s7;
            S7[] values = S7.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    s7 = null;
                    break;
                }
                s7 = values[i];
                int b = s7.b();
                if (num != null && b == num.intValue()) {
                    break;
                }
                i++;
            }
            return s7 == null ? S7.UnknownProvider : s7;
        }

        private a() {
        }

        public final S7 a(String str) {
            List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
            return c0.size() < 2 ? S7.UnknownProvider : a(arm0.m(10, (String) c0.get(1)));
        }
    }

    S7(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
