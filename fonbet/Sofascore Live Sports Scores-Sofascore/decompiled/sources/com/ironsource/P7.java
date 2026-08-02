package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum P7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    P7(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final P7 a(@NotNull String str) {
            List split$default;
            str.getClass();
            split$default = StringsKt__StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null);
            return split$default.size() < 2 ? P7.UnknownProvider : a(StringsKt.toIntOrNull((String) split$default.get(1)));
        }

        private a() {
        }

        @NotNull
        public final P7 a(@Nullable Integer num) {
            P7 p7;
            P7[] values = P7.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    p7 = null;
                    break;
                }
                p7 = values[i];
                int b = p7.b();
                if (num != null && b == num.intValue()) {
                    break;
                }
                i++;
            }
            return p7 == null ? P7.UnknownProvider : p7;
        }
    }
}
