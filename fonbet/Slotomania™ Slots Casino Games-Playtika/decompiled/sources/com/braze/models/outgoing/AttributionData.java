package com.braze.models.outgoing;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/braze/models/outgoing/AttributionData;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "forJsonPut", "", "network", "Ljava/lang/String;", "campaign", "adGroup", "creative", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class AttributionData implements IPutIntoJson<JSONObject> {
    private static final String ADGROUP_KEY = "adgroup";
    private static final String CAMPAIGN_KEY = "campaign";
    private static final String CREATIVE_KEY = "ad";
    private static final String NETWORK_KEY = "source";
    private final String adGroup;
    private final String campaign;
    private final String creative;
    private final String network;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating AttributionData Json.";
        }
    }

    public AttributionData(String network, String campaign, String adGroup, String creative) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(adGroup, "adGroup");
        Intrinsics.checkNotNullParameter(creative, "creative");
        this.network = network;
        this.campaign = campaign;
        this.adGroup = adGroup;
        this.creative = creative;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!StringsKt.isBlank(this.network)) {
                jSONObject.put("source", this.network);
            }
            if (!StringsKt.isBlank(this.campaign)) {
                jSONObject.put("campaign", this.campaign);
            }
            if (!StringsKt.isBlank(this.adGroup)) {
                jSONObject.put(ADGROUP_KEY, this.adGroup);
            }
            if (!StringsKt.isBlank(this.creative)) {
                jSONObject.put(CREATIVE_KEY, this.creative);
                return jSONObject;
            }
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
        return jSONObject;
    }
}
