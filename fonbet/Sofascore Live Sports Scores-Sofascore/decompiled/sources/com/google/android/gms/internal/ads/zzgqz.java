package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import defpackage.ddb;
import defpackage.q7o;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgqz extends BroadcastReceiver implements zzgqe, zzggg {
    public final Context a;
    public final ExecutorService b;
    public boolean c = true;

    public zzgqz(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void a(HashMap hashMap, Context context, View view) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        hashMap.put("up", Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void b(HashMap hashMap) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        hashMap.put("up", Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void c(HashMap hashMap) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        hashMap.put("up", Boolean.valueOf(z));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.c = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ddb zza() {
        return zzhcy.c(this.b, new q7o(this, 18));
    }
}
