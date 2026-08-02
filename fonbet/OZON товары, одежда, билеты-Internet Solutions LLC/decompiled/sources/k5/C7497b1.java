package k5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.util.Date;

/* renamed from: k5.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7497b1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final D0 f70708a;

    /* renamed from: b, reason: collision with root package name */
    private int f70709b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Date f70710c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f70711d;

    /* renamed from: k5.b1$a */
    public interface a {
        void d(@NonNull Date date, @NonNull Date date2);

        void h(@NonNull Date date);

        void i(@NonNull Date date);

        void j(@NonNull Date date);

        void l(@NonNull Date date);

        void m(@NonNull Date date, @NonNull Date date2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7497b1(@NonNull a aVar) {
        this.f70708a = (D0) aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [k5.D0, k5.b1$a] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        int i11;
        if (!"android.intent.action.PHONE_STATE".equals(intent.getAction())) {
            return;
        }
        String stringExtra = intent.getStringExtra("state");
        if (stringExtra != null) {
            if (stringExtra.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                i11 = 2;
            } else if (stringExtra.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                i11 = 1;
            }
            if (this.f70709b == i11) {
                Date date = new Date();
                ?? r32 = this.f70708a;
                if (i11 == 1) {
                    this.f70711d = true;
                    this.f70710c = date;
                    r32.j(date);
                } else if (i11 == 2) {
                    this.f70710c = date;
                    if (this.f70709b != 1) {
                        this.f70711d = false;
                        r32.h(date);
                    } else {
                        this.f70711d = true;
                        r32.l(date);
                    }
                } else if (this.f70709b == 1) {
                    r32.i(this.f70710c);
                } else if (this.f70711d) {
                    r32.m(this.f70710c, date);
                } else {
                    r32.d(this.f70710c, date);
                }
                this.f70709b = i11;
                return;
            }
            return;
        }
        i11 = 0;
        if (this.f70709b == i11) {
        }
    }
}
