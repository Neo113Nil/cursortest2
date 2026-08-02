package com.vk.push.pushsdk.ipc;

/* compiled from: PushService.kt */
/* loaded from: classes.dex */
public final class PushService extends BasePushService {
    public final String m = "BackgroundPushService";

    @Override // com.vk.push.pushsdk.ipc.BasePushService
    public final String b() {
        return this.m;
    }

    @Override // com.vk.push.pushsdk.ipc.BasePushService
    public final void d(int i) {
        stopSelf(i);
    }

    @Override // com.vk.push.pushsdk.ipc.BasePushService
    public final void c() {
    }
}
