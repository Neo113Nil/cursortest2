package com.huawei.hms.hihealth.options;

import com.huawei.hms.hihealth.data.SamplePoint;

/* loaded from: classes13.dex */
public interface OnSamplePointListener {
    void onSamplePoint(SamplePoint samplePoint);

    default void onException(int i, String str) {
    }
}
