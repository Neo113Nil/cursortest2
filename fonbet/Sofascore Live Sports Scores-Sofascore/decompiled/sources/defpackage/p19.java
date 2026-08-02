package defpackage;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p19 implements OutcomeReceiver {
    public final /* synthetic */ int a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onError(Throwable th) {
        r19 r19Var;
        r19 r19Var2;
        switch (this.a) {
            case 0:
                Exception exc = (Exception) th;
                exc.getClass();
                Set set = cw3.a;
                set.contains(q19.class);
                if (!set.contains(q19.class)) {
                    try {
                        r19Var = q19.c;
                    } catch (Throwable th2) {
                        cw3.a(q19.class, th2);
                    }
                    if (r19Var != null) {
                        Intrinsics.i("gpsDebugLogger");
                        throw null;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("gps_ara_failed_reason", exc.toString());
                    Unit unit = Unit.a;
                    r19Var.a(bundle, "gps_ara_failed");
                    return;
                }
                r19Var = null;
                if (r19Var != null) {
                }
            default:
                Exception exc2 = (Exception) th;
                exc2.getClass();
                Set set2 = cw3.a;
                set2.contains(bzd.class);
                exc2.toString();
                if (!set2.contains(bzd.class)) {
                    try {
                        r19Var2 = bzd.e;
                    } catch (Throwable th3) {
                        cw3.a(bzd.class, th3);
                    }
                    if (r19Var2 != null) {
                        Intrinsics.i("gpsDebugLogger");
                        throw null;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("gps_pa_failed_reason", exc2.toString());
                    Unit unit2 = Unit.a;
                    r19Var2.a(bundle2, "gps_pa_failed");
                    return;
                }
                r19Var2 = null;
                if (r19Var2 != null) {
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResult(Object obj) {
        r19 r19Var;
        r19 r19Var2;
        int i = this.a;
        obj.getClass();
        switch (i) {
            case 0:
                Set set = cw3.a;
                set.contains(q19.class);
                if (!set.contains(q19.class)) {
                    try {
                        r19Var = q19.c;
                    } catch (Throwable th) {
                        cw3.a(q19.class, th);
                    }
                    if (r19Var == null) {
                        r19Var.a(null, "gps_ara_succeed");
                        return;
                    } else {
                        Intrinsics.i("gpsDebugLogger");
                        throw null;
                    }
                }
                r19Var = null;
                if (r19Var == null) {
                }
            default:
                Set set2 = cw3.a;
                set2.contains(bzd.class);
                if (!set2.contains(bzd.class)) {
                    try {
                        r19Var2 = bzd.e;
                    } catch (Throwable th2) {
                        cw3.a(bzd.class, th2);
                    }
                    if (r19Var2 == null) {
                        r19Var2.a(null, "gps_pa_succeed");
                        return;
                    } else {
                        Intrinsics.i("gpsDebugLogger");
                        throw null;
                    }
                }
                r19Var2 = null;
                if (r19Var2 == null) {
                }
        }
    }
}
