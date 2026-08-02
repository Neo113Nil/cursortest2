package com.vk.push.pushsdk.ipc;

import com.vk.push.common.Logger;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;
import xsna.jke0;

/* compiled from: ForegroundPushService.kt */
/* loaded from: classes.dex */
public final class ForegroundPushService extends BasePushService {
    public final String m = "ForegroundPushService";
    public final bpn0 n = new bpn0(a.i);

    /* compiled from: ForegroundPushService.kt */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements gzs<jke0> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final jke0 invoke() {
            return new jke0(0);
        }
    }

    @Override // com.vk.push.pushsdk.ipc.BasePushService
    public final String b() {
        return this.m;
    }

    @Override // com.vk.push.pushsdk.ipc.BasePushService
    public final void c() {
        Logger.DefaultImpls.info$default(a(), "Run service in foreground", null, 2, null);
        ((jke0) this.n.getValue()).getClass();
        jke0.a();
        throw null;
    }

    @Override // com.vk.push.pushsdk.ipc.BasePushService
    public final void d(int i) {
        ((jke0) this.n.getValue()).getClass();
        jke0.b(this);
        stopSelf(i);
    }

    public final void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        d(i);
    }
}
