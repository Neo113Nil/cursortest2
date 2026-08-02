package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public enum R7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);

    public static final a b = new a(null);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final R7 a(Integer num) {
            R7 r7;
            R7[] values = R7.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r7 = null;
                    break;
                }
                r7 = values[i];
                int b = r7.b();
                if (num != null && b == num.intValue()) {
                    break;
                }
                i++;
            }
            return r7 == null ? R7.UnknownProvider : r7;
        }

        private a() {
        }

        public final R7 a(String dynamicDemandSourceId) {
            Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            List split$default = StringsKt.split$default((CharSequence) dynamicDemandSourceId, new String[]{"_"}, false, 0, 6, (Object) null);
            return split$default.size() < 2 ? R7.UnknownProvider : a(StringsKt.toIntOrNull((String) split$default.get(1)));
        }
    }

    R7(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
