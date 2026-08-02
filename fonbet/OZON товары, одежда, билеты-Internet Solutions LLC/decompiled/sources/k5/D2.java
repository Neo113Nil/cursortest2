package k5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import k5.C7497b1;

/* loaded from: classes8.dex */
final class D2 extends D0<Integer> implements InterfaceC7590z, C7497b1.a {

    /* renamed from: i, reason: collision with root package name */
    private static final long f70527i = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: e, reason: collision with root package name */
    private Date f70528e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final Context f70529f;

    /* renamed from: g, reason: collision with root package name */
    private C7497b1 f70530g;

    /* renamed from: h, reason: collision with root package name */
    private int f70531h;

    D2(@NonNull Context context) {
        super(Mm0.e.PhoneCallDirection);
        this.f70531h = 0;
        this.f70529f = context;
    }

    @Override // k5.C7497b1.a
    public final void d(@NonNull Date date, @NonNull Date date2) {
        this.f70528e = date2;
        this.f70531h = 2;
    }

    protected final void finalize() throws Throwable {
        try {
            k();
        } finally {
            super.finalize();
        }
    }

    @Override // k5.C7497b1.a
    public final void h(@NonNull Date date) {
        this.f70528e = date;
        this.f70531h = 2;
    }

    @Override // k5.C7497b1.a
    public final void i(@NonNull Date date) {
        this.f70528e = date;
        this.f70531h = 1;
    }

    @Override // k5.C7497b1.a
    public final void j(@NonNull Date date) {
        this.f70528e = date;
        this.f70531h = 1;
    }

    @Override // k5.InterfaceC7590z
    public final void k() {
        C7497b1 c7497b1 = this.f70530g;
        if (c7497b1 != null) {
            this.f70529f.unregisterReceiver(c7497b1);
        }
        this.f70530g = null;
    }

    @Override // k5.C7497b1.a
    public final void l(@NonNull Date date) {
        this.f70528e = date;
        this.f70531h = 1;
    }

    @Override // k5.C7497b1.a
    public final void m(@NonNull Date date, @NonNull Date date2) {
        this.f70528e = date2;
        this.f70531h = 1;
    }

    @Override // k5.InterfaceC7590z
    public final void o() {
        String a11 = EnumC7578w.READ_PHONE_STATE.a();
        Context context = this.f70529f;
        if (Gf.d.l(context, a11)) {
            if (this.f70530g != null) {
                k();
            }
            C7497b1 c7497b1 = new C7497b1(this);
            this.f70530g = c7497b1;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PHONE_STATE");
            context.registerReceiver(c7497b1, intentFilter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // k5.D0
    @NonNull
    @SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Integer s() throws D1 {
        int i11;
        int i12;
        Context context = this.f70529f;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int i13 = 0;
        if (audioManager != null) {
            i11 = 1;
            switch (audioManager.getMode()) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Gf.d.l(context, EnumC7578w.READ_PHONE_STATE.a()) && (i12 = this.f70531h) != 0) {
                        i11 = i12;
                        break;
                    }
                    break;
            }
            if (i11 == 0) {
                this.f70528e = new Date();
                i13 = i11;
            } else {
                Date date = this.f70528e;
                if (date == null || date.getTime() + f70527i >= System.currentTimeMillis()) {
                    i13 = this.f70531h;
                }
            }
            if (i13 != 0) {
                this.f70531h = i13;
            }
            return Integer.valueOf(i13);
        }
        i11 = 0;
        if (i11 == 0) {
        }
        if (i13 != 0) {
        }
        return Integer.valueOf(i13);
    }
}
