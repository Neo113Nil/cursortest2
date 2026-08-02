package com.ironsource;

import com.braze.Constants;
import com.vungle.ads.internal.signals.SignalManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public enum H3 {
    Day(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, SignalManager.TWENTY_FOUR_HOURS_MILLIS),
    Hour("h", 3600000),
    Second(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, 1000);

    public static final a c = new a(null);
    private final String a;
    private final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final H3 a(String str) {
            for (H3 h3 : H3.values()) {
                if (Intrinsics.areEqual(h3.a, str)) {
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
