package org.chromium.base.task;

import org.chromium.base.ThreadUtils;

/* loaded from: classes10.dex */
public final class i extends TaskRunnerImpl {
    @Override // org.chromium.base.task.TaskRunnerImpl
    protected final void h() {
        int i11 = PostTask.f78564f;
        ThreadUtils.a().post(this.f78575e);
    }
}
