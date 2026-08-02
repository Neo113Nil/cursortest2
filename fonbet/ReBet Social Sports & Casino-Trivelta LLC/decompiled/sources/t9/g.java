package t9;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3195t;
import com.google.android.gms.common.internal.InterfaceC3194s;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.OnFailureListener;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static volatile g f65793c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f65794d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Duration f65795e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3194s f65796a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f65797b = new AtomicLong(-1);

    static {
        Duration ofMinutes;
        ofMinutes = Duration.ofMinutes(30L);
        f65795e = ofMinutes;
    }

    public g(Context context, String str) {
        this.f65796a = r.b(context, C3195t.a().b("ads_identifier:api").a());
    }

    public static g a(Context context) {
        if (f65793c == null) {
            synchronized (f65794d) {
                try {
                    if (f65793c == null) {
                        f65793c = new g(context, "ads_identifier:api");
                    }
                } finally {
                }
            }
        }
        return f65793c;
    }

    public static /* synthetic */ void b(g gVar, long j10, Exception exc) {
        ConnectionResult g10;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof com.google.android.gms.common.api.b) && (g10 = ((com.google.android.gms.common.api.b) exc).getStatus().g()) != null && g10.h() == 24) {
            gVar.f65797b.set(j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r4 > r6) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(int i10, int i11, long j10, long j11, int i12) {
        long millis;
        AtomicLong atomicLong = this.f65797b;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.f65797b.get() != -1) {
            long j12 = elapsedRealtime - this.f65797b.get();
            millis = f65795e.toMillis();
        }
        InterfaceC3194s interfaceC3194s = this.f65796a;
        if (interfaceC3194s == null) {
            return;
        }
        interfaceC3194s.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i11, 0, j10, j11, null, null, 0, i12)))).addOnFailureListener(new OnFailureListener() { // from class: t9.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                g.b(g.this, elapsedRealtime, exc);
            }
        });
    }
}
