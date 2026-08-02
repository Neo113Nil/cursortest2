package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzcf extends BroadcastReceiver {
    public final /* synthetic */ zzcg a;

    public zzcf(zzcg zzcgVar) {
        this.a = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzcg zzcgVar = this.a;
        synchronized (zzcgVar) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : zzcgVar.b.entrySet()) {
                    if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                        arrayList.add((BroadcastReceiver) entry.getKey());
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
