package com.vk.dto.common.data;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.serialize.Serializer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.aay;
import xsna.zcl;

/* compiled from: MerchantRestriction.kt */
/* loaded from: classes18.dex */
public final class MerchantRestriction extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MerchantRestriction> CREATOR = new c();
    public final Map<String, Double> b;
    public final String c;

    /* compiled from: MerchantRestriction.kt */
    public static final class a {
        public static MerchantRestriction a(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = jSONObject.getJSONArray(InAppPurchaseMetaData.KEY_CURRENCY);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashMap.put(jSONArray.getString(i), Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("max_price");
            int length2 = jSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i2);
                if (optJSONObject != null) {
                    hashMap.put(optJSONObject.optString(InAppPurchaseMetaData.KEY_CURRENCY), Double.valueOf(optJSONObject.getDouble("amount")));
                }
            }
            return new MerchantRestriction(hashMap, jSONObject.optString("text"), null);
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<MerchantRestriction> {
        @Override // xsna.aay
        public final MerchantRestriction a(JSONObject jSONObject) {
            Serializer.c<MerchantRestriction> cVar = MerchantRestriction.CREATOR;
            return a.a(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<MerchantRestriction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MerchantRestriction a(Serializer serializer) {
            Serializer.c<MerchantRestriction> cVar = MerchantRestriction.CREATOR;
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            HashMap hashMap = new HashMap();
            int u = serializer.u();
            for (int i = 0; i < u; i++) {
                hashMap.put(serializer.H(), Double.valueOf(serializer.r()));
            }
            return new MerchantRestriction(hashMap, H, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MerchantRestriction[i];
        }
    }

    static {
        new b();
    }

    public MerchantRestriction() {
        throw null;
    }

    public MerchantRestriction(Map map, String str, zcl zclVar) {
        this.b = map;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        Map<String, Double> map = this.b;
        serializer.S(map.size());
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            serializer.j0((String) entry.getKey());
            serializer.O(((Number) entry.getValue()).doubleValue());
        }
    }
}
