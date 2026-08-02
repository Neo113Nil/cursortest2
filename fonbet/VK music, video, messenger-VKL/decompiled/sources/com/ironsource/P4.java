package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.pn00;

/* loaded from: classes13.dex */
public interface P4 {

    public static final class a {
        private final Map<String, Object> a;

        public a(String str) {
            this.a = pn00.m(new Pair(IronSourceConstants.EVENTS_PROVIDER, str), new Pair(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(String str, Object obj) {
            this.a.put(str, obj);
        }

        public final Map<String, Object> a() {
            return new LinkedHashMap(this.a);
        }
    }

    void a(EnumC4650y5 enumC4650y5, De de);

    void a(EnumC4650y5 enumC4650y5, String str);

    public static final class b implements P4 {
        private final C7 a;
        private final a b;

        public b(C7 c7, a aVar) {
            this.a = c7;
            this.b = aVar;
        }

        @Override // com.ironsource.P4
        public void a(EnumC4650y5 enumC4650y5, String str) {
            Map<String, Object> a = this.b.a();
            a.put("spId", str);
            this.a.a(new C4632x5(enumC4650y5, new JSONObject(pn00.t(a))));
        }

        @Override // com.ironsource.P4
        public void a(EnumC4650y5 enumC4650y5, De de) {
            Map<String, Object> a = this.b.a();
            if (de != null) {
                a.put(IronSourceConstants.EVENTS_EXT1, de.toString());
            }
            this.a.a(new C4632x5(enumC4650y5, new JSONObject(pn00.t(a))));
        }
    }
}
