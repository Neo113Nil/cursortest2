package com.huawei.hms.health;

import com.huawei.hmf.tasks.Task;
import xsna.d380;
import xsna.g5o0;

/* loaded from: classes13.dex */
public class aacr implements d380 {
    private g5o0 aab;
    private aacw aaba;

    public aacr(g5o0 g5o0Var, aacw aacwVar) {
        this.aab = g5o0Var;
        this.aaba = aacwVar;
    }

    @Override // xsna.d380
    public void onComplete(Task task) {
        if (task == null) {
            this.aab.b(this.aaba.aab(new NullPointerException()));
        } else if (!task.f()) {
            this.aab.a(task.d());
        } else {
            this.aab.b(this.aaba.aab(task.e()));
        }
    }
}
