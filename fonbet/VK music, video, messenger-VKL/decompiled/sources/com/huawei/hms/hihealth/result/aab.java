package com.huawei.hms.hihealth.result;

import androidx.annotation.NonNull;
import com.huawei.hms.support.api.client.Result;

/* loaded from: classes13.dex */
public class aab<T extends Result> {
    private T mResult;

    @NonNull
    public T getResult() {
        return this.mResult;
    }

    public void setResult(@NonNull T t) {
        this.mResult = t;
    }
}
