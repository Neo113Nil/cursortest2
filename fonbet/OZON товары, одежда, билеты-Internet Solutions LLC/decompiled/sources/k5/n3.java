package k5;

import android.content.Context;
import android.content.IntentFilter;
import android.telecom.TelecomManager;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k5.C7497b1;
import k5.InterfaceC7576v1;

/* loaded from: classes8.dex */
final class n3 extends D0<Om0.a> implements InterfaceC7590z, C7497b1.a, InterfaceC7576v1.a {

    /* renamed from: t, reason: collision with root package name */
    private static final long f70798t = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70799e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final InterfaceC7576v1 f70800f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final G0 f70801g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final TelecomManager f70802h;

    /* renamed from: i, reason: collision with root package name */
    private C7497b1 f70803i;

    /* renamed from: j, reason: collision with root package name */
    private Date f70804j;

    /* renamed from: k, reason: collision with root package name */
    private Date f70805k;

    /* renamed from: l, reason: collision with root package name */
    private int f70806l;

    /* renamed from: m, reason: collision with root package name */
    private int f70807m;

    /* renamed from: n, reason: collision with root package name */
    private String f70808n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f70809o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f70810p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f70811q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f70812r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f70813s;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70814a;

        static {
            int[] iArr = new int[InterfaceC7576v1.b.values().length];
            f70814a = iArr;
            try {
                iArr[InterfaceC7576v1.b.f40final.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70814a[InterfaceC7576v1.b.f38default.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70814a[InterfaceC7576v1.b.f39do.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70814a[InterfaceC7576v1.b.f42instanceof.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70814a[InterfaceC7576v1.b.f43native.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    n3(@NonNull Context context, @NonNull TelecomManager telecomManager, @NonNull InterfaceC7576v1 interfaceC7576v1, @NonNull G0 g02) {
        super(Mm0.e.PhoneLastCall);
        this.f70806l = 0;
        this.f70807m = 0;
        this.f70808n = "unknown";
        this.f70810p = true;
        this.f70799e = context;
        this.f70802h = telecomManager;
        this.f70800f = interfaceC7576v1;
        this.f70801g = g02;
    }

    private boolean C() {
        return this.f70804j != null && System.currentTimeMillis() < this.f70804j.getTime() + f70798t;
    }

    private void D(@NonNull String str, @NonNull Date date) {
        this.f70808n = str;
        this.f70806l = 2;
        this.f70807m = 1;
        this.f70804j = date;
        this.f70805k = null;
        this.f70809o = true;
    }

    private boolean w() {
        return Gf.d.l(this.f70799e, EnumC7578w.READ_PHONE_STATE.a());
    }

    final void B(@NonNull InterfaceC7576v1.b bVar) {
        boolean z11 = this.f70803i != null;
        Date date = new Date();
        Date date2 = C() ? this.f70804j : date;
        int i11 = a.f70814a[bVar.ordinal()];
        if (i11 == 1) {
            if (!C() || this.f70805k != null) {
                date = this.f70805k;
            }
            String str = this.f70808n;
            int i12 = this.f70807m;
            Date date3 = this.f70804j;
            this.f70808n = str;
            this.f70806l = 0;
            this.f70807m = i12;
            this.f70804j = date3;
            this.f70805k = date;
            this.f70813s = false;
            return;
        }
        if (i11 == 2) {
            if (this.f70813s) {
                Objects.requireNonNull(date2);
                date = date2;
            }
            this.f70808n = "unknown";
            this.f70806l = 1;
            this.f70807m = 1;
            this.f70804j = date;
            this.f70805k = null;
            this.f70809o = false;
            this.f70813s = true;
            return;
        }
        if (i11 == 3) {
            if (this.f70810p && z11 && !this.f70811q) {
                if (this.f70813s) {
                    Objects.requireNonNull(date2);
                    date = date2;
                }
                D("cell", date);
            } else if (!z11) {
                if (this.f70813s) {
                    Objects.requireNonNull(date2);
                    date = date2;
                }
                D("cell", date);
            }
            this.f70813s = true;
            return;
        }
        if (i11 == 4) {
            if (this.f70813s) {
                Objects.requireNonNull(date2);
                date = date2;
            }
            D("voip", date);
            this.f70813s = true;
            return;
        }
        if (i11 != 5) {
            return;
        }
        if (this.f70810p && z11 && !this.f70811q) {
            if (this.f70813s) {
                Objects.requireNonNull(date2);
                date = date2;
            }
            D("cell", date);
        } else if (!z11) {
            String str2 = this.f70808n;
            if (this.f70813s) {
                Objects.requireNonNull(date2);
                date = date2;
            }
            D(str2, date);
        }
        this.f70813s = true;
    }

    @Override // k5.InterfaceC7576v1.a
    public final void b() {
        this.f70812r = true;
    }

    @Override // k5.C7497b1.a
    public final void d(@NonNull Date date, @NonNull Date date2) {
        this.f70808n = "cell";
        this.f70806l = 0;
        this.f70807m = 2;
        this.f70804j = date;
        this.f70805k = date2;
        if (this.f70812r) {
            this.f70812r = false;
            this.f70800f.c();
        }
        this.f70811q = true;
    }

    protected final void finalize() throws Throwable {
        try {
            k();
        } finally {
            super.finalize();
        }
    }

    @Override // k5.InterfaceC7576v1.a
    public final void g(@NonNull InterfaceC7576v1.b bVar) {
        B(bVar);
    }

    @Override // k5.C7497b1.a
    public final void h(@NonNull Date date) {
        this.f70808n = "cell";
        this.f70806l = 2;
        this.f70807m = 2;
        this.f70804j = date;
        this.f70805k = null;
        this.f70809o = true;
        this.f70811q = true;
    }

    @Override // k5.C7497b1.a
    public final void i(@NonNull Date date) {
        Date date2 = new Date();
        this.f70808n = "cell";
        this.f70806l = 0;
        this.f70807m = 1;
        this.f70804j = date;
        this.f70805k = date2;
        if (this.f70812r) {
            this.f70812r = false;
            this.f70800f.c();
        }
        this.f70811q = true;
    }

    @Override // k5.C7497b1.a
    public final void j(@NonNull Date date) {
        this.f70808n = "cell";
        this.f70806l = 1;
        this.f70807m = 1;
        this.f70804j = date;
        this.f70805k = null;
        this.f70809o = false;
        this.f70811q = true;
    }

    @Override // k5.InterfaceC7590z
    public final void k() {
        C7497b1 c7497b1 = this.f70803i;
        if (c7497b1 != null) {
            this.f70799e.unregisterReceiver(c7497b1);
            this.f70803i = null;
        }
        this.f70800f.a(this);
    }

    @Override // k5.C7497b1.a
    public final void l(@NonNull Date date) {
        D("cell", date);
        this.f70811q = true;
    }

    @Override // k5.C7497b1.a
    public final void m(@NonNull Date date, @NonNull Date date2) {
        this.f70808n = "cell";
        this.f70806l = 0;
        this.f70807m = 1;
        this.f70804j = date;
        this.f70805k = date2;
        if (this.f70812r) {
            this.f70812r = false;
            this.f70800f.c();
        }
        this.f70811q = true;
    }

    @Override // k5.InterfaceC7590z
    public final void o() {
        if (w()) {
            C7497b1 c7497b1 = this.f70803i;
            Context context = this.f70799e;
            if (c7497b1 != null) {
                context.unregisterReceiver(c7497b1);
                this.f70803i = null;
            }
            C7497b1 c7497b12 = new C7497b1(this);
            this.f70803i = c7497b12;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PHONE_STATE");
            context.registerReceiver(c7497b12, intentFilter);
        } else {
            this.f70801g.a(x(), Mm0.f.Warning, "Permission READ_PHONE_STATE was not granted. Parameter may contain inaccurate values", 1);
        }
        this.f70800f.b(this);
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        long j11;
        B(((AbstractC7560r1) this.f70800f).h());
        boolean C11 = C();
        int i11 = this.f70806l;
        if (i11 == 0 && C11) {
            i11 = 3;
        }
        if (i11 == 0 && this.f70810p && !this.f70811q) {
            if (w() ? this.f70802h.isInCall() : false) {
                i11 = 4;
            }
            this.f70810p = false;
        }
        Om0.a aVar = new Om0.a();
        aVar.put("state", Integer.valueOf(i11));
        aVar.put("direction", Integer.valueOf(i11 != 0 ? this.f70807m : 0));
        aVar.put("type", i11 == 0 ? "unknown" : this.f70808n);
        if (i11 == 0 || this.f70804j == null) {
            j11 = 0;
        } else {
            j11 = ((this.f70805k == null ? new Date() : this.f70805k).getTime() - this.f70804j.getTime()) / TimeUnit.SECONDS.toMillis(1L);
        }
        aVar.put("duration", Long.valueOf(j11));
        aVar.put("answered", Boolean.valueOf(this.f70809o));
        return aVar;
    }
}
