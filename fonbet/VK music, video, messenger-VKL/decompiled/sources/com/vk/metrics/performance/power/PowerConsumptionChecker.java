package com.vk.metrics.performance.power;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import com.vk.log.L;
import com.vk.metrics.performance.power.PowerConsumptionChecker;
import xsna.aw90;
import xsna.epx;
import xsna.iy6;
import xsna.ms9;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: PowerConsumptionChecker.kt */
/* loaded from: classes.dex */
public final class PowerConsumptionChecker extends aw90 {
    public final Context b;
    public final BatteryManager c;
    public final a d = new a();
    public final a e = new a();

    /* compiled from: PowerConsumptionChecker.kt */
    public static final class a {
        public long a;
        public int b;
        public int c;
        public boolean d;

        public /* synthetic */ a() {
            this(0, 0, 0L, false);
        }

        public a(int i, int i2, long j, boolean z) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = z;
        }
    }

    /* compiled from: PowerConsumptionChecker.kt */
    public static final class b {
        public final a a;
        public final a b;

        public b(a aVar, a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Measurement(begin=" + this.a + ", end=" + this.b + ')';
        }
    }

    public PowerConsumptionChecker(Context context) {
        this.b = context;
        this.c = (BatteryManager) context.getSystemService("batterymanager");
    }

    public static final void d(PowerConsumptionChecker powerConsumptionChecker, wzs wzsVar, Intent intent, PowerConsumptionChecker$batteryInfo$receiver$1 powerConsumptionChecker$batteryInfo$receiver$1) {
        float intExtra = intent.getIntExtra("temperature", 0) / 10;
        try {
            powerConsumptionChecker.b.unregisterReceiver(powerConsumptionChecker$batteryInfo$receiver$1);
        } catch (Throwable unused) {
        }
        Integer valueOf = Integer.valueOf((int) intExtra);
        int intExtra2 = intent.getIntExtra("status", -1);
        wzsVar.invoke(valueOf, Boolean.valueOf(intExtra2 == 2 || intExtra2 == 5));
    }

    @Override // xsna.aw90
    public final void a() {
        int i;
        a aVar = this.d;
        if (aVar.a > 0) {
            L.G("performance measurement is already started");
            return;
        }
        aVar.a = 0L;
        aVar.b = 0;
        aVar.c = 0;
        aVar.d = false;
        a aVar2 = this.e;
        aVar2.a = 0L;
        aVar2.b = 0;
        aVar2.c = 0;
        aVar2.d = false;
        aVar.a = System.currentTimeMillis() / 1000;
        try {
            i = this.c.getIntProperty(4);
        } catch (Throwable unused) {
            i = -1;
        }
        aVar.b = i;
        c(new wzs() { // from class: xsna.twc0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                int intValue = ((Integer) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                PowerConsumptionChecker.a aVar3 = PowerConsumptionChecker.this.d;
                aVar3.c = intValue;
                aVar3.d = booleanValue;
                return s3q0.a;
            }
        });
    }

    @Override // xsna.aw90
    public final void b() {
        int i;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        a aVar = this.e;
        aVar.a = currentTimeMillis;
        try {
            i = this.c.getIntProperty(4);
        } catch (Throwable unused) {
            i = -1;
        }
        aVar.b = i;
        c(new iy6(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.BroadcastReceiver, com.vk.metrics.performance.power.PowerConsumptionChecker$batteryInfo$receiver$1] */
    public final void c(final wzs<? super Integer, ? super Boolean, s3q0> wzsVar) {
        try {
            ?? r0 = new BroadcastReceiver() { // from class: com.vk.metrics.performance.power.PowerConsumptionChecker$batteryInfo$receiver$1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    PowerConsumptionChecker.d(PowerConsumptionChecker.this, wzsVar, intent, this);
                }
            };
            Intent registerReceiver = this.b.registerReceiver(r0, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                d(this, wzsVar, registerReceiver, r0);
            }
        } catch (Throwable th) {
            L.G(ms9.b("can't get  temperature data  ", th));
        }
    }

    public final b e() {
        b bVar;
        int i;
        int i2;
        a aVar = this.d;
        long j = aVar.a;
        a aVar2 = this.e;
        if (j > 0) {
            long j2 = aVar2.a;
            if (j < j2 && (i = aVar.b) > 0 && (i2 = aVar2.b) > 0) {
                bVar = new b(new a(i, aVar.c, j, aVar.d), new a(i2, aVar2.c, j2, aVar2.d));
                aVar.a = 0L;
                aVar.b = 0;
                aVar.c = 0;
                aVar.d = false;
                aVar2.a = 0L;
                aVar2.b = 0;
                aVar2.c = 0;
                aVar2.d = false;
                return bVar;
            }
        }
        bVar = null;
        aVar.a = 0L;
        aVar.b = 0;
        aVar.c = 0;
        aVar.d = false;
        aVar2.a = 0L;
        aVar2.b = 0;
        aVar2.c = 0;
        aVar2.d = false;
        return bVar;
    }
}
