package com.huawei.hms.hihealth;

import androidx.annotation.NonNull;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.health.aacg;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import java.util.List;

/* loaded from: classes13.dex */
public class AuthController {
    private aacg aab;

    public AuthController() {
        this.aab = null;
        this.aab = aacg.aab();
    }

    public Task<String> checkFingerprint(String str, String str2) {
        return this.aab.aab(str, str2);
    }

    public Task<List<String>> queryAuthInfoByAppId(String str) {
        return this.aab.aab(str);
    }

    public Task<List<String>> queryAuthInfoByPkgName(String str) {
        return this.aab.aaba(str);
    }

    @Deprecated
    public AuthController(@NonNull AuthHuaweiId authHuaweiId) {
        this.aab = null;
        this.aab = aacg.aab();
    }
}
