package defpackage;

import com.google.android.gms.cast.internal.zzx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c5p implements Runnable {
    public final /* synthetic */ zzx a;
    public final /* synthetic */ int b;

    public c5p(y9p y9pVar, zzx zzxVar, int i) {
        this.a = zzxVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.K.b(this.b);
    }
}
