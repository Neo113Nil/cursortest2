package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rt1 extends um3 {
    public final d f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt1(Context context, zbl zblVar, int i) {
        super(context, zblVar);
        this.g = i;
        this.f = new d(this, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r8.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // defpackage.um3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        int i = this.g;
        Context context = this.b;
        boolean z = true;
        switch (i) {
            case 0:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    rik o = rik.o();
                    int i2 = st1.a;
                    o.getClass();
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    rik o2 = rik.o();
                    int i3 = tt1.a;
                    o2.getClass();
                    return Boolean.FALSE;
                }
                float intExtra2 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                if (registerReceiver2.getIntExtra("status", -1) != 1 && intExtra2 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent registerReceiver3 = context.registerReceiver(null, e());
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (hashCode == -730838620) {
                            break;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.um3
    public final void c() {
        rik o = rik.o();
        int i = m52.a;
        o.getClass();
        this.b.registerReceiver(this.f, e());
    }

    @Override // defpackage.um3
    public final void d() {
        rik o = rik.o();
        int i = m52.a;
        o.getClass();
        this.b.unregisterReceiver(this.f);
    }

    public final IntentFilter e() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
