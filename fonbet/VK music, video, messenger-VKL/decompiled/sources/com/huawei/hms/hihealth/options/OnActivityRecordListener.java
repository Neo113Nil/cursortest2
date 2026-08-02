package com.huawei.hms.hihealth.options;

import com.huawei.hms.hihealth.data.SamplePoint;
import java.util.List;

/* loaded from: classes13.dex */
public interface OnActivityRecordListener {
    void onStatusChange(int i);

    default void onReceive(List<SamplePoint> list) {
    }
}
