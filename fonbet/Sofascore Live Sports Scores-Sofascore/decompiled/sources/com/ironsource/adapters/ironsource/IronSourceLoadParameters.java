package com.ironsource.adapters.ironsource;

import com.ironsource.U3;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface IronSourceLoadParameters {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Constants {

        @NotNull
        public static final String ADM_KEY = "adm";

        @NotNull
        public static final String DEMAND_ONLY = "demandOnly";

        @NotNull
        public static final Constants INSTANCE = new Constants();

        @NotNull
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class WithLog implements IronSourceLoadParameters {

        @NotNull
        private final IronSourceLoadParameters loadParameters;

        public WithLog(@NotNull IronSourceLoadParameters ironSourceLoadParameters) {
            ironSourceLoadParameters.getClass();
            this.loadParameters = ironSourceLoadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public HashMap<String, String> value() {
            HashMap<String, String> value = this.loadParameters.value();
            if (!value.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : value.keySet()) {
                    IronLog.ADAPTER_API.verbose(str + U3.j.b + ((Object) value.get(str)));
                }
            }
            return value;
        }
    }

    @NotNull
    JSONObject config();

    boolean demandOnly();

    @NotNull
    HashMap<String, String> value();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Base implements IronSourceLoadParameters {

        @NotNull
        private final JSONObject loadConfig;

        @Nullable
        private final String serverData;

        public Base(@NotNull JSONObject jSONObject, @Nullable String str) {
            jSONObject.getClass();
            this.loadConfig = jSONObject;
            this.serverData = str;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public HashMap<String, String> value() {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                String a = d.b().a(this.serverData);
                a.getClass();
                hashMap.put("adm", a);
                hashMap.putAll(d.b().b(this.serverData));
            }
            return hashMap;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, (i & 2) != 0 ? null : str);
        }
    }
}
