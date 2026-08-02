package com.huawei.hms.common.internal;

import xsna.g5o0;

/* loaded from: classes13.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {
    private final TaskApiCall<? extends AnyClient, TResult> a;
    private final g5o0<TResult> b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, g5o0<TResult> g5o0Var) {
        super(1);
        this.a = taskApiCall;
        this.b = g5o0Var;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.a;
    }

    public g5o0<TResult> getTaskCompletionSource() {
        return this.b;
    }
}
