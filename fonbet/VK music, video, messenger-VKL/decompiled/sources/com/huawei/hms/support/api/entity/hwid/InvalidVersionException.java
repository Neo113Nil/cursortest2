package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.support.api.client.Status;

/* loaded from: classes13.dex */
public class InvalidVersionException extends Exception {
    private Status a;

    public InvalidVersionException(Status status) {
        this.a = status;
    }

    public Status getError() {
        return this.a;
    }
}
