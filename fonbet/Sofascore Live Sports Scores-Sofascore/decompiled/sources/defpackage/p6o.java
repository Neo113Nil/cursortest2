package defpackage;

import com.google.android.gms.internal.play_billing.zzgs;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p6o implements zzgs {
    public static final p6o b = new p6o(0);
    public static final p6o c = new p6o(1);
    public static final p6o d = new p6o(2);
    public static final p6o e = new p6o(3);
    public static final p6o f = new p6o(4);
    public static final p6o g = new p6o(5);
    public static final p6o h = new p6o(6);
    public static final p6o i = new p6o(7);
    public static final p6o j = new p6o(8);
    public final /* synthetic */ int a;

    public /* synthetic */ p6o(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgs
    public final boolean a(int i2) {
        switch (this.a) {
            case 0:
                switch (i2) {
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                        }
                }
                break;
            case 2:
                if (zzjs.a(i2) != null) {
                    break;
                }
                break;
            case 3:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : zzjz.PLAY_BILLING_ACTIVITY_CREATED_ACTION : zzjz.IN_APP_BILLING_RESULT_UPDATE_ACTION : zzjz.ALTERNATIVE_BILLING_ACTION : zzjz.LOCAL_PURCHASES_UPDATED_ACTION : zzjz.PURCHASES_UPDATED_ACTION : zzjz.BROADCAST_ACTION_UNSPECIFIED) != null) {
                    break;
                }
                break;
            case 4:
                if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                    break;
                }
            case 5:
                switch (i2) {
                }
            case 6:
                switch (i2) {
                }
            case 7:
                if (i2 == 0 || i2 == 1) {
                    break;
                }
            default:
                if (i2 == 0 || i2 == 1) {
                    break;
                }
        }
        return true;
    }
}
