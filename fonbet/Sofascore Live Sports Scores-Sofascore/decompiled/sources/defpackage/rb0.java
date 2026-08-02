package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rb0 extends r9 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ ub0 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb0(ub0 ub0Var, Context context) {
        super(ub0Var);
        this.d = ub0Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.r9
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    @Override // defpackage.r9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h() {
        Location location;
        boolean z;
        long j;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!nb0.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                x6k x6kVar = (x6k) obj;
                LocationManager locationManager = (LocationManager) x6kVar.c;
                yli yliVar = (yli) x6kVar.d;
                if (yliVar.b > System.currentTimeMillis()) {
                    z = yliVar.a;
                } else {
                    Context context = (Context) x6kVar.b;
                    Location location2 = null;
                    if (aik.C(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        if (locationManager.isProviderEnabled("network")) {
                            location = locationManager.getLastKnownLocation("network");
                            if (aik.C(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                try {
                                    if (locationManager.isProviderEnabled("gps")) {
                                        location2 = locationManager.getLastKnownLocation("gps");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (location2 != null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                                location = location2;
                            }
                            if (location == null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                dw1 dw1Var = dw1.g;
                                if (dw1Var == null) {
                                    dw1Var = new dw1();
                                    dw1.g = dw1Var;
                                }
                                dw1 dw1Var2 = dw1Var;
                                dw1Var2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                                dw1Var2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                                z = dw1Var2.b == 1;
                                long j2 = dw1Var2.d;
                                long j3 = dw1Var2.c;
                                dw1Var2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                                long j4 = dw1Var2.d;
                                if (j2 == -1 || j3 == -1) {
                                    j = currentTimeMillis + 43200000;
                                } else {
                                    if (currentTimeMillis > j3) {
                                        j2 = j4;
                                    } else if (currentTimeMillis > j2) {
                                        j2 = j3;
                                    }
                                    j = j2 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                                }
                                yliVar.a = z;
                                yliVar.b = j;
                            } else {
                                int i2 = Calendar.getInstance().get(11);
                                if (i2 < 6 || i2 >= 22) {
                                    z = true;
                                }
                            }
                        }
                    }
                    location = null;
                    if (aik.C(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    }
                    if (location2 != null) {
                    }
                    location = location2;
                    if (location == null) {
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // defpackage.r9
    public final void x() {
        int i = this.c;
        ub0 ub0Var = this.d;
        switch (i) {
            case 0:
                ub0Var.r(true, true);
                break;
            default:
                ub0Var.r(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb0(ub0 ub0Var, x6k x6kVar) {
        super(ub0Var);
        this.d = ub0Var;
        this.e = x6kVar;
    }
}
