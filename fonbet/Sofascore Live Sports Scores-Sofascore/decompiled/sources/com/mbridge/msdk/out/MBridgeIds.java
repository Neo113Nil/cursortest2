package com.mbridge.msdk.out;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.system.NoProGuard;
import defpackage.mz1;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBridgeIds implements Serializable, NoProGuard {
    private String contextId;
    private String placementId;
    private String requestId;
    private String unitId;
    private String bidToken = "";
    private boolean isCache = false;

    public MBridgeIds(String str, String str2, String str3) {
        this.placementId = str;
        this.unitId = str2;
        this.requestId = str3;
    }

    public String getBidToken() {
        if (TextUtils.isEmpty(this.bidToken)) {
            this.bidToken = "";
        }
        return this.bidToken;
    }

    public String getContextId() {
        return this.contextId;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getRequestId() {
        return TextUtils.isEmpty(this.requestId) ? "" : this.requestId;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCache(boolean z) {
        this.isCache = z;
    }

    public void setContextId(String str) {
        this.contextId = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MBridgeIds{placementId='");
        sb.append(this.placementId);
        sb.append("', unitId='");
        sb.append(this.unitId);
        sb.append("', bidToken='");
        return mz1.o(sb, this.bidToken, "'}");
    }

    public MBridgeIds(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
    }

    public MBridgeIds() {
    }
}
