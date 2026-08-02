package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface V1 {
    @NotNull
    com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements V1 {

        @Nullable
        private final JSONObject a;

        public /* synthetic */ a(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new JSONObject() : jSONObject);
        }

        @Override // com.ironsource.V1
        @NotNull
        public com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str) {
            str.getClass();
            JSONObject jSONObject = this.a;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            String optString = optJSONObject != null ? optJSONObject.optString("plumbus") : null;
            return optString != null ? new p.a(optString) : new p.b();
        }

        public a(@Nullable JSONObject jSONObject) {
            this.a = jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
