package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3832vd implements Eh {
    public final /* synthetic */ C3858wd a;

    public C3832vd(C3858wd c3858wd) {
        this.a = c3858wd;
    }

    @Override // com.inmobi.media.Eh
    public final boolean a() {
        long userTouchResetTime = this.a.a.b.a.b.getRendering().getUserTouchResetTime();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a.b;
        return j != 0 && elapsedRealtime - j < userTouchResetTime;
    }

    @Override // com.inmobi.media.Eh
    public final boolean c() {
        return !this.a.a.b.a.b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.Eh
    public final long getViewTouchTimestamp() {
        return this.a.b;
    }

    @Override // com.inmobi.media.Eh
    public final void a(String str) {
        str.getClass();
        Map a = Hk.a(this.a.a.e.a);
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("BlockAutoRedirection", a, EnumC3943zk.SDK);
    }
}
