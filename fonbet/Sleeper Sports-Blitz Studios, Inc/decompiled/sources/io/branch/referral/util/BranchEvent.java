package io.branch.referral.util;

import android.content.Context;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.ServerRequest;
import io.branch.referral.ServerResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class BranchEvent {
    private final List<BranchUniversalObject> buoList;
    private final JSONObject customProperties;
    private final String eventName;
    private final boolean isStandardEvent;
    private final JSONObject standardProperties;
    private final HashMap<String, Object> topLevelProperties;

    public BranchEvent(BRANCH_STANDARD_EVENT branch_standard_event) {
        this(branch_standard_event.getName());
    }

    public BranchEvent(String str) {
        this.topLevelProperties = new HashMap<>();
        this.standardProperties = new JSONObject();
        this.customProperties = new JSONObject();
        this.eventName = str;
        BRANCH_STANDARD_EVENT[] values = BRANCH_STANDARD_EVENT.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (str.equals(values[i].getName())) {
                z = true;
                break;
            }
            i++;
        }
        this.isStandardEvent = z;
        this.buoList = new ArrayList();
    }

    public BranchEvent setCustomerEventAlias(String str) {
        return addTopLevelProperty(Defines.Jsonkey.CustomerEventAlias.getKey(), str);
    }

    public BranchEvent setAdType(AdType adType) {
        return addStandardProperty(Defines.Jsonkey.AdType.getKey(), adType.getName());
    }

    public BranchEvent setTransactionID(String str) {
        return addStandardProperty(Defines.Jsonkey.TransactionID.getKey(), str);
    }

    public BranchEvent setCurrency(CurrencyType currencyType) {
        return addStandardProperty(Defines.Jsonkey.Currency.getKey(), currencyType.toString());
    }

    public BranchEvent setRevenue(double d) {
        return addStandardProperty(Defines.Jsonkey.Revenue.getKey(), Double.valueOf(d));
    }

    public BranchEvent setShipping(double d) {
        return addStandardProperty(Defines.Jsonkey.Shipping.getKey(), Double.valueOf(d));
    }

    public BranchEvent setTax(double d) {
        return addStandardProperty(Defines.Jsonkey.Tax.getKey(), Double.valueOf(d));
    }

    public BranchEvent setCoupon(String str) {
        return addStandardProperty(Defines.Jsonkey.Coupon.getKey(), str);
    }

    public BranchEvent setAffiliation(String str) {
        return addStandardProperty(Defines.Jsonkey.Affiliation.getKey(), str);
    }

    public BranchEvent setDescription(String str) {
        return addStandardProperty(Defines.Jsonkey.Description.getKey(), str);
    }

    public BranchEvent setSearchQuery(String str) {
        return addStandardProperty(Defines.Jsonkey.SearchQuery.getKey(), str);
    }

    private BranchEvent addStandardProperty(String str, Object obj) {
        if (obj != null) {
            try {
                this.standardProperties.put(str, obj);
                return this;
            } catch (JSONException e) {
                e.printStackTrace();
                return this;
            }
        }
        this.standardProperties.remove(str);
        return this;
    }

    private BranchEvent addTopLevelProperty(String str, Object obj) {
        if (!this.topLevelProperties.containsKey(str)) {
            this.topLevelProperties.put(str, obj);
            return this;
        }
        this.topLevelProperties.remove(str);
        return this;
    }

    public BranchEvent addCustomDataProperty(String str, String str2) {
        try {
            this.customProperties.put(str, str2);
            return this;
        } catch (JSONException e) {
            e.printStackTrace();
            return this;
        }
    }

    public BranchEvent addContentItems(BranchUniversalObject... branchUniversalObjectArr) {
        Collections.addAll(this.buoList, branchUniversalObjectArr);
        return this;
    }

    public BranchEvent addContentItems(List<BranchUniversalObject> list) {
        this.buoList.addAll(list);
        return this;
    }

    public String getEventName() {
        return this.eventName;
    }

    public boolean logEvent(Context context) {
        String path = (this.isStandardEvent ? Defines.RequestPath.TrackStandardEvent : Defines.RequestPath.TrackCustomEvent).getPath();
        if (Branch.getInstance() == null) {
            return false;
        }
        Branch.getInstance().handleNewRequest(new ServerRequestLogEvent(context, path));
        return true;
    }

    private class ServerRequestLogEvent extends ServerRequest {
        @Override // io.branch.referral.ServerRequest
        public void clearCallbacks() {
        }

        @Override // io.branch.referral.ServerRequest
        public boolean handleErrors(Context context) {
            return false;
        }

        @Override // io.branch.referral.ServerRequest
        public void handleFailure(int i, String str) {
        }

        @Override // io.branch.referral.ServerRequest
        public boolean isGetRequest() {
            return false;
        }

        @Override // io.branch.referral.ServerRequest
        public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        }

        @Override // io.branch.referral.ServerRequest
        public boolean shouldRetryOnFail() {
            return true;
        }

        @Override // io.branch.referral.ServerRequest
        protected boolean shouldUpdateLimitFacebookTracking() {
            return true;
        }

        ServerRequestLogEvent(Context context, String str) {
            super(context, str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Defines.Jsonkey.Name.getKey(), BranchEvent.this.eventName);
                if (BranchEvent.this.customProperties.length() > 0) {
                    jSONObject.put(Defines.Jsonkey.CustomData.getKey(), BranchEvent.this.customProperties);
                }
                if (BranchEvent.this.standardProperties.length() > 0) {
                    jSONObject.put(Defines.Jsonkey.EventData.getKey(), BranchEvent.this.standardProperties);
                }
                if (BranchEvent.this.topLevelProperties.size() > 0) {
                    for (Map.Entry entry : BranchEvent.this.topLevelProperties.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                if (BranchEvent.this.buoList.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put(Defines.Jsonkey.ContentItems.getKey(), jSONArray);
                    Iterator it = BranchEvent.this.buoList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((BranchUniversalObject) it.next()).convertToJson());
                    }
                }
                setPost(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            updateEnvironment(context, jSONObject);
        }

        @Override // io.branch.referral.ServerRequest
        public ServerRequest.BRANCH_API_VERSION getBranchRemoteAPIVersion() {
            return ServerRequest.BRANCH_API_VERSION.V2;
        }
    }
}
