package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import com.sofascore.model.mvvm.model.PlayerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S2 {
    public String a;
    public int b;
    public int c;

    public S2(CellInfo cellInfo, String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        if (cellInfo instanceof CellInfoGsm) {
            this.c = i;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            cellIdentity.getClass();
            this.a = a(str, str2, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.c = i;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            cellIdentity2.getClass();
            this.a = a(str, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
            return;
        }
        if (cellInfo instanceof CellInfoWcdma) {
            this.c = i;
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            this.b = cellInfoWcdma.getCellSignalStrength().getDbm();
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            cellIdentity3.getClass();
            this.a = a(str, str2, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
        }
    }

    public static String a(String str, String str2, int i, int i2, int i3, int i4) {
        str.getClass();
        str2.getClass();
        return str + "#" + str2 + "#" + i + "#" + i2 + "#" + (i3 == -1 ? "" : Integer.valueOf(i3)) + "#" + (i4 != Integer.MAX_VALUE ? Integer.valueOf(i4) : "");
    }

    public static String a(String str, int i, int i2, int i3) {
        str.getClass();
        return str + "#" + i + "#" + i2 + "#" + i3;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            int i = this.b;
            if (i != Integer.MAX_VALUE) {
                jSONObject.put(PlayerKt.E_SPORTS_SOFT_SUPPORT, i);
            }
            jSONObject.put("nt", this.c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public S2() {
    }
}
