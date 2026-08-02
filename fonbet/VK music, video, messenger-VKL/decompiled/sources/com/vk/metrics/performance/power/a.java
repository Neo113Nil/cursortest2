package com.vk.metrics.performance.power;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.metrics.performance.power.PowerConsumptionChecker;
import xsna.bpn0;
import xsna.ip;
import xsna.xa3;

/* compiled from: AppConsumptionReporter.kt */
/* loaded from: classes.dex */
public final class a {
    public static final PowerConsumptionChecker.b h = new PowerConsumptionChecker.b(new PowerConsumptionChecker.a(), new PowerConsumptionChecker.a());
    public final xa3 a;
    public int b;
    public int c;
    public long d;
    public int e;
    public final PowerConsumptionChecker f;
    public final bpn0 g = new bpn0(new ip(this, 1));

    /* compiled from: AppConsumptionReporter.kt */
    /* renamed from: com.vk.metrics.performance.power.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1279a extends Exception {
        public C1279a(Throwable th) {
            super(th);
        }
    }

    public a(Context context, boolean z, xa3 xa3Var) {
        this.a = xa3Var;
        this.f = new PowerConsumptionChecker(context);
    }

    public static int a(String str) {
        long m = Preference.m(0L, "consumption_measurement", str);
        Preference.C("consumption_measurement", str);
        return (int) m;
    }
}
