package com.ironsource;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Q8 {

    @NotNull
    private static final a b = new a(null);

    @Deprecated
    @NotNull
    public static final String c = "mismatch";

    @NotNull
    private final C4369w1 a;

    public /* synthetic */ Q8(C4369w1 c4369w1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Ib.v.d().q() : c4369w1);
    }

    private final void a(EnumC4373w5 enumC4373w5, String str, Class<?> cls, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("subId=" + str + BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        }
        sb.append("name=".concat(cls.getName()));
        String sb2 = sb.toString();
        JSONObject b2 = IronSourceUtils.b(false);
        b2.put(IronSourceConstants.EVENTS_EXT1, sb2);
        if (str2 != null) {
            b2.put("reason", str2);
        }
        this.a.a(new C4355v5(enumC4373w5, b2));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Q8(@NotNull C4369w1 c4369w1) {
        c4369w1.getClass();
        this.a = c4369w1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(@NotNull String str, @NotNull Class<?> cls, boolean z) {
        str.getClass();
        cls.getClass();
        a(EnumC4373w5.TROUBLESHOOTING_ILR_THIRD_PARTY_SUBSCRIBE_FAILED, str, cls, z ? c : null);
    }

    public final void a(@NotNull Class<?> cls) {
        cls.getClass();
        a(this, EnumC4373w5.TROUBLESHOOTING_ILR_THIRD_PARTY_UNSUBSCRIBE, null, cls, null, 8, null);
    }

    public static /* synthetic */ void a(Q8 q8, EnumC4373w5 enumC4373w5, String str, Class cls, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        q8.a(enumC4373w5, str, cls, str2);
    }

    public final void a(@NotNull String str, @NotNull Class<?> cls) {
        str.getClass();
        cls.getClass();
        a(this, EnumC4373w5.TROUBLESHOOTING_ILR_THIRD_PARTY_SUBSCRIBE, str, cls, null, 8, null);
    }
}
