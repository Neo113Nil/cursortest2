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
final class N2 extends D0<Integer> implements InterfaceC7590z, C7497b1.a {

    /* renamed from: i, reason: collision with root package name */
    private static final long f70614i = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70615e;

    /* renamed from: f, reason: collision with root package name */
    private Date f70616f;

    /* renamed from: g, reason: collision with root package name */
    private int f70617g;

    /* renamed from: h, reason: collision with root package name */
    private C7497b1 f70618h;

    N2(@NonNull Context context) {
        super(Mm0.e.PhoneCallState);
        this.f70615e = context;
    }

    private boolean w() {
        return this.f70616f != null && System.currentTimeMillis() < this.f70616f.getTime() + f70614i;
    }

    @Override // k5.C7497b1.a
    public final void d(@NonNull Date date, @NonNull Date date2) {
        this.f70617g = 0;
        this.f70616f = date2;
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
        this.f70617g = 2;
        this.f70616f = date;
    }

    @Override // k5.C7497b1.a
    public final void i(@NonNull Date date) {
        this.f70617g = 0;
        this.f70616f = date;
    }

    @Override // k5.C7497b1.a
    public final void j(@NonNull Date date) {
        this.f70617g = 1;
        this.f70616f = date;
    }

    @Override // k5.InterfaceC7590z
    public final void k() {
        C7497b1 c7497b1 = this.f70618h;
        if (c7497b1 != null) {
            this.f70615e.unregisterReceiver(c7497b1);
        }
        this.f70618h = null;
    }

    @Override // k5.C7497b1.a
    public final void l(@NonNull Date date) {
        this.f70617g = 2;
        this.f70616f = date;
    }

    @Override // k5.C7497b1.a
    public final void m(@NonNull Date date, @NonNull Date date2) {
        this.f70617g = 0;
        this.f70616f = date2;
    }

    @Override // k5.InterfaceC7590z
    public final void o() {
        String a11 = EnumC7578w.READ_PHONE_STATE.a();
        Context context = this.f70615e;
        if (Gf.d.l(context, a11)) {
            if (this.f70618h != null) {
                k();
            }
            C7497b1 c7497b1 = new C7497b1(this);
            this.f70618h = c7497b1;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PHONE_STATE");
            context.registerReceiver(c7497b1, intentFilter);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (w() != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // k5.D0
    @NonNull
    @SuppressLint({"MissingPermission", "SwitchIntDef"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Integer s() throws D1 {
        int i11;
        Context context = this.f70615e;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int i12 = 0;
        if (audioManager != null) {
            switch (audioManager.getMode()) {
                case 1:
                    i11 = 1;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    i11 = 2;
                    break;
            }
            if (i11 == 0) {
                this.f70616f = new Date();
                i12 = i11;
            } else {
                if (this.f70617g != 0 || !w()) {
                    if (Gf.d.l(context, EnumC7578w.READ_PHONE_STATE.a())) {
                        i12 = this.f70617g;
                    }
                }
                i12 = 3;
            }
            if (i12 != 3) {
                this.f70617g = i12;
            }
            return Integer.valueOf(i12);
        }
        i11 = 0;
        if (i11 == 0) {
        }
        if (i12 != 3) {
        }
        return Integer.valueOf(i12);
    }
}
