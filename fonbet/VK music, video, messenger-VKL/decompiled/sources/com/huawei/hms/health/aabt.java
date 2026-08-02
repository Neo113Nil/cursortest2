package com.huawei.hms.health;

import java.lang.reflect.Field;
import java.security.PrivilegedAction;

/* loaded from: classes13.dex */
class aabt implements PrivilegedAction {
    final /* synthetic */ Field aab;

    public aabt(Field field) {
        this.aab = field;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        this.aab.setAccessible(true);
        return null;
    }
}
