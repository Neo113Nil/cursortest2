package com.vk.push.core.ipc;

import com.vk.push.common.AppInfo;

/* compiled from: RuStore.kt */
/* loaded from: classes5.dex */
public final class RuStore {
    public static final RuStore INSTANCE = new RuStore();

    public final AppInfo getAppInfo() {
        return new AppInfo("ru.vk.store", "661F20828EF780DE0B79BC59F26A30864316355F30E4F91CFA14A20791839914");
    }
}
