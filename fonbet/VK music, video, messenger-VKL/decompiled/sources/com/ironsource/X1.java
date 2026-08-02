package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import org.json.JSONObject;
import xsna.zcl;

/* loaded from: classes13.dex */
public interface X1 {

    public static final class a implements X1 {
        private final JSONObject a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.X1
        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            JSONObject jSONObject = this.a;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            String optString = optJSONObject != null ? optJSONObject.optString("plumbus") : null;
            return optString != null ? new p.a(optString) : new p.b();
        }

        public a(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i, zcl zclVar) {
            this((i & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    com.ironsource.mediationsdk.demandOnly.p a(String str);
}
