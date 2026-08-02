package com.ironsource;

import org.chromium.base.TimeUtils;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public enum H3 {
    Day("d", TimeUtils.MILLISECONDS_PER_DAY),
    Hour("h", 3600000),
    Second(UcumUtils.UCUM_SECONDS, 1000);

    public static final a c = new a(null);
    private final String a;
    private final long b;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final H3 a(String str) {
            for (H3 h3 : H3.values()) {
                if (epx.f(h3.a, str)) {
                    return h3;
                }
            }
            return null;
        }

        private a() {
        }
    }

    H3(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final long a(Integer num) {
        return (num != null ? num.intValue() : 1) * this.b;
    }

    public static /* synthetic */ long a(H3 h3, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return h3.a(num);
    }
}
