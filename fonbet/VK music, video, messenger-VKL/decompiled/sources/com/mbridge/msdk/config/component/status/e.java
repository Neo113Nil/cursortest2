package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MBVolumeEventPublisher.java */
/* loaded from: classes13.dex */
public class e {
    private AudioManager b;
    private b c;
    private final String a = "MBVolumeEventPublisher";
    private final List<com.mbridge.msdk.config.component.status.a> d = new CopyOnWriteArrayList();

    /* compiled from: MBVolumeEventPublisher.java */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                e.this.b();
            }
        }
    }

    public e() {
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        if (d != null) {
            this.b = (AudioManager) d.getApplicationContext().getSystemService("audio");
        }
        c();
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.d.remove(aVar);
        }
    }

    public void c() {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d != null) {
                this.c = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                d.registerReceiver(this.c, intentFilter);
            }
        } catch (Throwable th) {
            q0.b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    public void d() {
        if (this.d.isEmpty()) {
            e();
            this.b = null;
        }
    }

    public void e() {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d != null) {
                d.unregisterReceiver(this.c);
            }
        } catch (Throwable th) {
            q0.b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916005");
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("volume"), String.valueOf(a()));
            bVar.a(hashMap);
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th) {
            q0.b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (this.d.contains(aVar)) {
            return;
        }
        this.d.add(aVar);
    }

    private double a() {
        AudioManager audioManager = this.b;
        return ((this.b != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
    }
}
