package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzfs;
import defpackage.jqi;
import defpackage.nzk;
import defpackage.wjn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfs {
    public final nzk a;
    public final zzea b;
    public final zzea c;
    public boolean d;
    public boolean e;

    public zzfs(Context context, Looper looper, zzdp zzdpVar) {
        this.a = new nzk(context.getApplicationContext());
        this.b = zzdpVar.a(looper, null);
        this.c = zzdpVar.a(Looper.getMainLooper(), null);
    }

    public final void a(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (this.d) {
            b(true, z);
        }
    }

    public final void b(final boolean z, final boolean z2) {
        zzea zzeaVar = this.b;
        if (z && z2) {
            zzeaVar.f(new jqi(this, z, z2));
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c.i(new wjn(20, this, atomicBoolean));
        zzeaVar.f(new Runnable() { // from class: a9o
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                atomicBoolean.set(false);
                zzfs.this.a.b(z, z2);
            }
        });
    }
}
