package com.unity3d.ads.core.domain;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import xsna.spj;

/* compiled from: HandleOpenUrl.kt */
/* loaded from: classes14.dex */
public interface HandleOpenUrl {

    /* compiled from: HandleOpenUrl.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(HandleOpenUrl handleOpenUrl, AdObject adObject, String str, String str2, String str3, Map map, boolean z, spj spjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 8) != 0) {
                str3 = CommonConstant.ACTION.HWID_SCHEME_URL;
            }
            String str4 = str3;
            if ((i & 16) != 0) {
                map = null;
            }
            Map map2 = map;
            if ((i & 32) != 0) {
                z = false;
            }
            return handleOpenUrl.invoke(adObject, str, str2, str4, map2, z, spjVar);
        }
    }

    Object invoke(AdObject adObject, String str, String str2, String str3, Map<String, ? extends Object> map, boolean z, spj<? super Boolean> spjVar);
}
