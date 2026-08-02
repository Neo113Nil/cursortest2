package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q1c extends s1c {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q1c(Context context, int i) {
        super(r1);
        context.getClass();
        switch (i) {
            case 1:
                Object systemService = context.getSystemService((Class<Object>) sw9.g());
                systemService.getClass();
                super(sw9.c(systemService));
                break;
            default:
                MeasurementManager measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                break;
        }
    }
}
