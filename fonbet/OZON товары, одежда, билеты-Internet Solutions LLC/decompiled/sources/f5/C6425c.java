package f5;

import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6425c extends AbstractC6428f<Boolean> {
    @Override // f5.AbstractC6430h
    public final Object d() {
        String str;
        Intent registerReceiver = c().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            androidx.work.o e11 = androidx.work.o.e();
            str = C6426d.f62733a;
            e11.c(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        boolean z11 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    @Override // f5.AbstractC6428f
    @NotNull
    public final IntentFilter i() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // f5.AbstractC6428f
    public final void j(@NotNull Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        androidx.work.o e11 = androidx.work.o.e();
        str = C6426d.f62733a;
        e11.a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    f(Boolean.TRUE);
                }
            } else if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                f(Boolean.FALSE);
            }
        }
    }
}
