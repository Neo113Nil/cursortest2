package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes9.dex */
final class zbvu {
    public static final /* synthetic */ int zba = 0;
    private static final zbvu zbb = new zbvu();
    private final ConcurrentMap zbd = new ConcurrentHashMap();
    private final zbvy zbc = new zbvd();

    private zbvu() {
    }

    public static zbvu zba() {
        return zbb;
    }

    public final zbvx zbb(Class cls) {
        zbuo.zbc(cls, "messageType");
        zbvx zbvxVar = (zbvx) this.zbd.get(cls);
        if (zbvxVar != null) {
            return zbvxVar;
        }
        zbvx zba2 = this.zbc.zba(cls);
        zbuo.zbc(cls, "messageType");
        zbvx zbvxVar2 = (zbvx) this.zbd.putIfAbsent(cls, zba2);
        return zbvxVar2 == null ? zba2 : zbvxVar2;
    }
}
