package com.mbridge.msdk.dycreator.wrapper;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.error.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface DynamicViewBackListener {
    void viewClicked(BaseRespData baseRespData);

    void viewCreateFail(a aVar);

    void viewCreatedSuccess(View view);
}
