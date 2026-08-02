package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzea;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d8o implements zzea {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public d8o(Handler handler) {
        this.a = handler;
    }

    public static /* synthetic */ void j(y7o y7oVar) {
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(y7oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static y7o l() {
        y7o y7oVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                y7oVar = arrayList.isEmpty() ? new y7o() : (y7o) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return y7oVar;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final y7o a(Object obj) {
        y7o l = l();
        l.a = this.a.obtainMessage(31, 0, 0, obj);
        return l;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean b(zzdz zzdzVar) {
        y7o y7oVar = (y7o) zzdzVar;
        Message message = y7oVar.a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue(message);
        y7oVar.a = null;
        j(y7oVar);
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean c(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void d(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean e(int i, int i2) {
        return this.a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean f(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean g(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final y7o h(int i, Object obj) {
        y7o l = l();
        l.a = this.a.obtainMessage(i, obj);
        return l;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean i(wjn wjnVar) {
        return this.a.postDelayed(wjnVar, 1000L);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final y7o k(int i) {
        y7o l = l();
        l.a = this.a.obtainMessage(i);
        return l;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final Looper zza() {
        return this.a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzb(int i) {
        return this.a.hasMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final y7o zze(int i, int i2, int i3) {
        y7o l = l();
        l.a = this.a.obtainMessage(i, i2, i3);
        return l;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzl() {
        this.a.removeCallbacksAndMessages(null);
    }
}
