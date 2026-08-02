package i3;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.util.Log;
import co.paystack.android.ui.AddressVerificationActivity;
import co.paystack.android.ui.AuthActivity;
import co.paystack.android.ui.CardActivity;
import co.paystack.android.ui.OtpActivity;
import co.paystack.android.ui.PinActivity;
import co.paystack.android.ui.a;
import i3.C4520a;
import j3.C5091a;
import java.util.HashMap;
import k3.C5151c;
import l3.InterfaceC5396a;
import o3.C5797b;
import o3.C5798c;
import o3.C5799d;
import o3.i;
import q3.C6110b;
import q3.C6111c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: i3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4527h {

    /* renamed from: o, reason: collision with root package name */
    public static final String f48087o = "h";

    /* renamed from: p, reason: collision with root package name */
    public static boolean f48088p = false;

    /* renamed from: a, reason: collision with root package name */
    public final C6111c f48089a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f48090b;

    /* renamed from: d, reason: collision with root package name */
    public final C4520a.InterfaceC0724a f48092d;

    /* renamed from: j, reason: collision with root package name */
    public co.paystack.android.api.request.b f48098j;

    /* renamed from: k, reason: collision with root package name */
    public co.paystack.android.api.request.c f48099k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC5396a f48100l;

    /* renamed from: e, reason: collision with root package name */
    public final co.paystack.android.ui.c f48093e = co.paystack.android.ui.c.b();

    /* renamed from: f, reason: collision with root package name */
    public final co.paystack.android.ui.e f48094f = co.paystack.android.ui.e.a();

    /* renamed from: g, reason: collision with root package name */
    public final co.paystack.android.ui.d f48095g = co.paystack.android.ui.d.a();

    /* renamed from: h, reason: collision with root package name */
    public final co.paystack.android.ui.b f48096h = co.paystack.android.ui.b.a();

    /* renamed from: i, reason: collision with root package name */
    public final co.paystack.android.ui.a f48097i = co.paystack.android.ui.a.b();

    /* renamed from: m, reason: collision with root package name */
    public int f48101m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Callback f48102n = new a();

    /* renamed from: c, reason: collision with root package name */
    public final C4526g f48091c = new C4526g();

    /* renamed from: i3.h$a */
    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th2) {
            Log.e(C4527h.f48087o, th2.getMessage());
            C4527h.this.v(th2);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            C4527h.this.s((C5151c) response.body());
        }
    }

    /* renamed from: i3.h$c */
    public class c extends AsyncTask {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a.C0453a doInBackground(String... strArr) {
            Intent intent = new Intent(C4527h.this.f48090b, (Class<?>) AddressVerificationActivity.class);
            intent.putExtra("country_code", strArr[0]);
            C4527h.this.f48090b.startActivity(intent);
            synchronized (co.paystack.android.ui.a.c()) {
                try {
                    co.paystack.android.ui.a.c().wait();
                } catch (InterruptedException unused) {
                    C4527h.this.v(new Exception("Address entry Interrupted"));
                }
            }
            return C4527h.this.f48097i.a();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(a.C0453a c0453a) {
            super.onPostExecute(c0453a);
            if (c0453a == null) {
                C4527h.this.v(new Exception("No address provided"));
            } else {
                Log.e("AVS_ADDRESS", c0453a.toString());
                C4527h.this.r(c0453a);
            }
        }

        public /* synthetic */ c(C4527h c4527h, a aVar) {
            this();
        }
    }

    /* renamed from: i3.h$d */
    public class d extends AsyncTask {
        public d() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            C4527h.this.f48090b.startActivity(new Intent(C4527h.this.f48090b, (Class<?>) AuthActivity.class));
            synchronized (C4527h.this.f48096h) {
                try {
                    C4527h.this.f48096h.wait();
                } catch (InterruptedException unused) {
                    return C4527h.this.f48096h.b();
                }
            }
            return C4527h.this.f48096h.b();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            C4527h.this.s(C5151c.a(str));
        }

        public /* synthetic */ d(C4527h c4527h, a aVar) {
            this();
        }
    }

    /* renamed from: i3.h$e */
    public class e extends AsyncTask {
        public e() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6110b doInBackground(Void... voidArr) {
            C4527h.this.f48090b.startActivity(new Intent(C4527h.this.f48090b, (Class<?>) CardActivity.class));
            synchronized (C4527h.this.f48093e) {
                try {
                    C4527h.this.f48093e.wait();
                } catch (InterruptedException unused) {
                    C4527h.this.v(new Exception("Card entry Interrupted"));
                }
            }
            return C4527h.this.f48093e.a();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(C6110b c6110b) {
            super.onPostExecute(c6110b);
            if (c6110b == null || !c6110b.isValid()) {
                C4527h.this.v(new C5797b("Invalid card parameters"));
            } else {
                C4527h.this.f48089a.r(c6110b);
                C4527h.this.q();
            }
        }

        public /* synthetic */ e(C4527h c4527h, a aVar) {
            this();
        }
    }

    /* renamed from: i3.h$f */
    public class f extends AsyncTask {
        public f() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            C4527h.this.f48090b.startActivity(new Intent(C4527h.this.f48090b, (Class<?>) OtpActivity.class));
            synchronized (C4527h.this.f48095g) {
                try {
                    C4527h.this.f48095g.wait();
                } catch (InterruptedException unused) {
                    C4527h.this.v(new Exception("OTP entry Interrupted"));
                }
            }
            return C4527h.this.f48095g.b();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (str == null) {
                C4527h.this.v(new Exception("You did not provide an OTP"));
            } else {
                C4527h.this.f48099k.e(str);
                C4527h.this.B();
            }
        }

        public /* synthetic */ f(C4527h c4527h, a aVar) {
            this();
        }
    }

    /* renamed from: i3.h$g */
    public class g extends AsyncTask {
        public g() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            C4527h.this.f48090b.startActivity(new Intent(C4527h.this.f48090b, (Class<?>) PinActivity.class));
            synchronized (C4527h.this.f48094f) {
                try {
                    C4527h.this.f48094f.wait();
                } catch (InterruptedException unused) {
                    C4527h.this.v(new Exception("PIN entry Interrupted"));
                }
            }
            return C4527h.this.f48094f.b();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (str == null || 4 != str.length()) {
                C4527h.this.v(new Exception("PIN must be exactly 4 digits"));
            } else {
                C4527h.this.f48098j.b(str);
                C4527h.this.y();
            }
        }

        public /* synthetic */ g(C4527h c4527h, a aVar) {
            this();
        }
    }

    public C4527h(Activity activity, C6111c c6111c, C4520a.InterfaceC0724a interfaceC0724a) {
        this.f48090b = activity;
        this.f48089a = c6111c;
        this.f48092d = interfaceC0724a;
    }

    public final void A() {
        f48088p = true;
    }

    public final void B() {
        try {
            C();
        } catch (Exception e10) {
            Log.e(f48087o, e10.getMessage(), e10);
            v(e10);
        }
    }

    public final void C() {
        this.f48100l.b(this.f48099k.b()).enqueue(this.f48102n);
    }

    public void q() {
        try {
            if (this.f48089a.g() != null && this.f48089a.g().isValid()) {
                t();
                y();
                return;
            }
            co.paystack.android.ui.c b10 = co.paystack.android.ui.c.b();
            synchronized (b10) {
                b10.c(this.f48089a.g());
            }
            new e(this, null).execute(new Void[0]);
        } catch (Exception e10) {
            Log.e(f48087o, e10.getMessage(), e10);
            if (!(e10 instanceof i)) {
                z();
            }
            this.f48092d.a(e10, this.f48091c);
        }
    }

    public final void r(a.C0453a c0453a) {
        HashMap<String, String> e10 = c0453a.e();
        e10.put("trans", this.f48091c.a());
        try {
            this.f48100l.d(e10).enqueue(this.f48102n);
        } catch (Exception e11) {
            Log.e(f48087o, e11.getMessage(), e11);
            v(e11);
        }
    }

    public final void s(C5151c c5151c) {
        C4527h c4527h;
        int i10;
        if (c5151c == null) {
            c5151c = C5151c.f();
        }
        if (c5151c.hasErrors) {
            v(new C5798c(c5151c.message));
            return;
        }
        this.f48091c.d(c5151c);
        if (c5151c.status.equalsIgnoreCase("1") || c5151c.status.equalsIgnoreCase("success")) {
            z();
            this.f48092d.b(this.f48091c);
            return;
        }
        a aVar = null;
        if (c5151c.status.equalsIgnoreCase("2") && c5151c.b() && c5151c.auth.equalsIgnoreCase("avs")) {
            new c(this, aVar).execute(c5151c.avsCountryCode);
            return;
        }
        if (c5151c.status.equalsIgnoreCase("2") || (c5151c.b() && c5151c.auth.equalsIgnoreCase("pin"))) {
            new g(this, aVar).execute(new Void[0]);
            return;
        }
        if (c5151c.status.equalsIgnoreCase("3") && c5151c.d()) {
            this.f48092d.c(this.f48091c);
            this.f48099k.f(c5151c.trans);
            this.f48095g.e(c5151c.message);
            new f(this, aVar).execute(new Void[0]);
            return;
        }
        if (!this.f48091c.c()) {
            c4527h = this;
        } else {
            if (c5151c.status.equalsIgnoreCase("requery")) {
                this.f48092d.c(this.f48091c);
                new b(5000L, 5000L).start();
                return;
            }
            c4527h = this;
            if (c5151c.b() && c5151c.auth.equalsIgnoreCase("3DS") && c5151c.e()) {
                c4527h.f48092d.c(c4527h.f48091c);
                c4527h.f48096h.e(c5151c.otpmessage);
                new d(this, aVar).execute(new Void[0]);
                return;
            } else if (c5151c.b() && ((c5151c.auth.equalsIgnoreCase("otp") || c5151c.auth.equalsIgnoreCase("phone")) && c5151c.c())) {
                c4527h.f48092d.c(c4527h.f48091c);
                c4527h.f48099k.f(c4527h.f48091c.a());
                c4527h.f48095g.e(c5151c.otpmessage);
                new f(this, aVar).execute(new Void[0]);
                return;
            }
        }
        if (!c5151c.status.equalsIgnoreCase("0") && !c5151c.status.equalsIgnoreCase("error")) {
            v(new RuntimeException("Unknown server response"));
            return;
        }
        if (c5151c.message.equalsIgnoreCase("Invalid Data Sent") && (i10 = c4527h.f48101m) < 3) {
            c4527h.f48101m = i10 + 1;
            y();
        } else if (c5151c.message.equalsIgnoreCase("Access code has expired")) {
            v(new C5799d(c5151c.message));
        } else {
            v(new C5798c(c5151c.message));
        }
    }

    public final void t() {
        if (f48088p) {
            throw new i();
        }
        A();
        this.f48100l = new C5091a().a();
        this.f48098j = new co.paystack.android.api.request.b(this.f48089a);
        this.f48099k = new co.paystack.android.api.request.c();
    }

    public final void u() {
        this.f48100l.a(this.f48098j.c()).enqueue(this.f48102n);
    }

    public final void v(Throwable th2) {
        z();
        this.f48092d.a(th2, this.f48091c);
    }

    public final void w() {
        try {
            x();
        } catch (Exception e10) {
            Log.e(f48087o, e10.getMessage(), e10);
            v(e10);
        }
    }

    public final void x() {
        this.f48100l.c(this.f48091c.a()).enqueue(this.f48102n);
    }

    public final void y() {
        try {
            u();
        } catch (Exception e10) {
            Log.e(f48087o, e10.getMessage(), e10);
            v(e10);
        }
    }

    public final void z() {
        f48088p = false;
    }

    /* renamed from: i3.h$b */
    public class b extends CountDownTimer {
        public b(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C4527h.this.w();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }
}
