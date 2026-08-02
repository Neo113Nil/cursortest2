package com.huawei.hms.hihealth;

import com.huawei.hmf.tasks.Task;
import com.huawei.hms.health.aacj;
import com.huawei.hms.hihealth.data.AppLangItem;
import com.huawei.hms.hihealth.data.ScopeLangItem;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class ConsentsController {
    private aabk aab = aacj.aab();

    public ConsentsController() {
    }

    public Task<Void> cancelAuthorization(String str) {
        return ((aacj) this.aab).aab(str);
    }

    public Task<ScopeLangItem> get(String str, String str2) {
        return ((aacj) this.aab).aab(str, str2);
    }

    @Deprecated
    public Task<List<AppLangItem>> list(String str, int i) {
        return ((aacj) this.aab).aab(str, i);
    }

    @Deprecated
    public Task<Map<String, String>> queryAppNameByAppIds(List<String> list) {
        return ((aacj) this.aab).aab(list);
    }

    @Deprecated
    public Task<Map<String, String>> queryAppNameByPkgNames(List<String> list) {
        return ((aacj) this.aab).aaba(list);
    }

    @Deprecated
    public Task<Void> revoke(String str) {
        return ((aacj) this.aab).aab(str);
    }

    @Deprecated
    public ConsentsController(AuthHuaweiId authHuaweiId) {
    }

    public Task<Void> cancelAuthorization(String str, List<String> list) {
        return ((aacj) this.aab).aab(str, list);
    }

    @Deprecated
    public Task<Void> revoke(String str, List<String> list) {
        return ((aacj) this.aab).aab(str, list);
    }

    public Task<Void> cancelAuthorization(boolean z) {
        return ((aacj) this.aab).aab(z);
    }
}
