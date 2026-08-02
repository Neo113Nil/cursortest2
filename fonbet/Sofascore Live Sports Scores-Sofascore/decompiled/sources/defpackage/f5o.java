package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class f5o implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ zzez d;

    public f5o(zzez zzezVar, boolean z) {
        Objects.requireNonNull(zzezVar);
        this.d = zzezVar;
        zzezVar.a.getClass();
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        zzez zzezVar = this.d;
        if (zzezVar.f) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            zzezVar.d(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
