package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.android.gms.measurement.internal.zzic;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.qzk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends qzk implements zzhl.zza {
    public zzhl c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new zzhl();
        }
        zzgu zzguVar = zzic.r(context, null, null, null).f;
        zzic.m(zzguVar);
        zzgs zzgsVar = zzguVar.o;
        zzgs zzgsVar2 = zzguVar.j;
        if (intent == null) {
            zzgsVar2.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzgsVar.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzgsVar2.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        zzgsVar.a("Starting wakeful intent.");
        SparseArray sparseArray = qzk.a;
        synchronized (sparseArray) {
            try {
                int i = qzk.b;
                int i2 = i + 1;
                qzk.b = i2;
                if (i2 <= 0) {
                    qzk.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                sparseArray.put(i, newWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
