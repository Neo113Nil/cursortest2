package com.vk.reefton.trackers;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.vk.reefton.trackers.l;
import java.util.concurrent.TimeUnit;
import xsna.bpn0;
import xsna.fnf0;
import xsna.fp;
import xsna.l7i;
import xsna.lz2;
import xsna.qof0;
import xsna.r7i;
import xsna.vof0;
import xsna.xk;

/* compiled from: ReefDeviceTracker.kt */
/* loaded from: classes5.dex */
public final class c extends l {
    public static final long h = TimeUnit.SECONDS.toMillis(5);
    public static final bpn0 i = new bpn0(new lz2(28));
    public final fnf0 a;
    public final TelephonyManager b;
    public final PowerManager c;
    public final Context d;
    public final b e;
    public a f;
    public long g;

    /* compiled from: ReefDeviceTracker.kt */
    public static final class a {
        public final boolean a;
        public final float b;

        public a(float f, boolean z) {
            this.a = z;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "BatteryState(isCharging=" + this.a + ", batteryPct=" + this.b + ")";
        }
    }

    /* compiled from: ReefDeviceTracker.kt */
    public interface b {
        a a(Context context);
    }

    /* compiled from: ReefDeviceTracker.kt */
    /* renamed from: com.vk.reefton.trackers.c$c, reason: collision with other inner class name */
    public static final class C1759c implements b {
        @Override // com.vk.reefton.trackers.c.b
        public final a a(Context context) {
            Intent a = fp.a("android.intent.action.BATTERY_CHANGED", context, null);
            return new a(a != null ? (a.getIntExtra("level", -1) * 100) / a.getIntExtra("scale", -1) : -1.0f, (a != null ? a.getIntExtra("status", -1) : -1) == 2);
        }
    }

    /* compiled from: ReefDeviceTracker.kt */
    public static final class d implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            fnf0 a = qof0Var.a();
            Application application = qof0Var.a;
            return new c(a, (TelephonyManager) application.getSystemService("phone"), (PowerManager) application.getSystemService("power"), application);
        }
    }

    public c(fnf0 fnf0Var, TelephonyManager telephonyManager, PowerManager powerManager, Context context) {
        b bVar = (b) i.getValue();
        this.a = fnf0Var;
        this.b = telephonyManager;
        this.c = powerManager;
        this.d = context;
        this.e = bVar;
        this.g = -1L;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new xk(27, this, vof0Var));
    }
}
