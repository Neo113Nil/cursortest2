package com.ironsource.adapters.ironsource;

import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import org.json.JSONObject;
import xsna.zcl;

/* loaded from: classes13.dex */
public interface IronSourceLoadParameters {

    public static final class Base implements IronSourceLoadParameters {
        private final JSONObject loadConfig;
        private final String serverData;

        public Base(JSONObject jSONObject, String str) {
            this.loadConfig = jSONObject;
            this.serverData = str;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                hashMap.put("adm", d.b().a(this.serverData));
                hashMap.putAll(d.b().b(this.serverData));
            }
            return hashMap;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i, zcl zclVar) {
            this(jSONObject, (i & 2) != 0 ? null : str);
        }
    }

    public static final class Constants {
        public static final String ADM_KEY = "adm";
        public static final String DEMAND_ONLY = "demandOnly";
        public static final Constants INSTANCE = new Constants();
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    public static final class WithLog implements IronSourceLoadParameters {
        private final IronSourceLoadParameters loadParameters;

        public WithLog(IronSourceLoadParameters ironSourceLoadParameters) {
            this.loadParameters = ironSourceLoadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> value = this.loadParameters.value();
            if (!value.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : value.keySet()) {
                    IronLog.ADAPTER_API.verbose(str + "=" + ((Object) value.get(str)));
                }
            }
            return value;
        }
    }

    JSONObject config();

    boolean demandOnly();

    HashMap<String, String> value();
}
