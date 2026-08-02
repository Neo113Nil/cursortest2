package com.huawei.hms.hihealth;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.health.aacp;
import com.huawei.hms.hihealth.data.DataType;
import com.huawei.hms.hihealth.options.DataTypeAddOptions;
import com.huawei.hms.hihealth.result.HealthKitAuthResult;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;

/* loaded from: classes13.dex */
public class SettingController {
    private aabo aab;

    public SettingController() {
        this.aab = null;
        this.aab = aacp.aabg();
    }

    public Task<DataType> addDataType(DataTypeAddOptions dataTypeAddOptions) {
        return ((aacp) this.aab).aab(dataTypeAddOptions);
    }

    @Deprecated
    public Task<Void> checkHealthAppAuthorisation() {
        return checkHealthAppAuthorization();
    }

    public Task<Void> checkHealthAppAuthorization() {
        return ((aacp) this.aab).aab();
    }

    public Task<Void> disableHiHealth() {
        return ((aacp) this.aab).aaba();
    }

    public Task<String> getAuthUrl() {
        return ((aacp) this.aab).aabb();
    }

    @Deprecated
    public Task<Boolean> getHealthAppAuthorisation() {
        return getHealthAppAuthorization();
    }

    public Task<Boolean> getHealthAppAuthorization() {
        return ((aacp) this.aab).aabc();
    }

    public Task<Boolean> getLinkHealthKitStatus() {
        return ((aacp) this.aab).aabe();
    }

    @Deprecated
    public Boolean isAppInTrustList(String str) {
        return ((aacp) this.aab).aab(str);
    }

    public boolean openAuthFromCloud() {
        return ((aacp) this.aab).aabf();
    }

    public HealthKitAuthResult parseHealthKitAuthResultFromIntent(Intent intent) {
        return ((aacp) this.aab).aab(intent);
    }

    public Task<DataType> readDataType(String str) {
        return ((aacp) this.aab).aaba(str);
    }

    public Intent requestAuthorizationIntent(String[] strArr, boolean z) {
        return ((aacp) this.aab).aab(strArr, z);
    }

    public Task<Boolean> setLinkHealthKitStatus(boolean z) {
        return ((aacp) this.aab).aab(z);
    }

    @Deprecated
    public SettingController(@NonNull AuthHuaweiId authHuaweiId) {
        this.aab = null;
        this.aab = aacp.aabg();
    }
}
