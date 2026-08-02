package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface P4 {

    public static final class a {
        private final Map<String, Object> a;

        public a(String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.a = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_PROVIDER, providerName), TuplesKt.to(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.a.put(key, value);
        }

        public final Map<String, Object> a() {
            return MapsKt.toMutableMap(this.a);
        }
    }

    void a(EnumC2754y5 enumC2754y5, De de2);

    void a(EnumC2754y5 enumC2754y5, String str);

    public static final class b implements P4 {
        private final B7 a;
        private final a b;

        public b(B7 eventManager, a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.a = eventManager;
            this.b = eventBaseData;
        }

        @Override // com.ironsource.P4
        public void a(EnumC2754y5 eventName, String instanceId) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> a = this.b.a();
            a.put("spId", instanceId);
            this.a.a(new C2736x5(eventName, new JSONObject(MapsKt.toMap(a))));
        }

        @Override // com.ironsource.P4
        public void a(EnumC2754y5 eventName, De de2) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Map<String, Object> a = this.b.a();
            if (de2 != null) {
                a.put(IronSourceConstants.EVENTS_EXT1, de2.toString());
            }
            this.a.a(new C2736x5(eventName, new JSONObject(MapsKt.toMap(a))));
        }
    }
}
