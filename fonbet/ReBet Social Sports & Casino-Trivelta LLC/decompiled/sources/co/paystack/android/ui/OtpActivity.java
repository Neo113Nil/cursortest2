package co.paystack.android.ui;

import android.app.Activity;
import android.os.Bundle;
import co.paystack.android.design.widget.PinPadView;
import i3.AbstractC4523d;
import i3.AbstractC4524e;

/* loaded from: classes.dex */
public class OtpActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public final d f28085a = d.a();

    /* renamed from: b, reason: collision with root package name */
    public PinPadView f28086b;

    public class a implements PinPadView.d {
        public a() {
        }

        @Override // co.paystack.android.design.widget.PinPadView.d
        public void a(String str, String str2) {
            if (str2.length() >= OtpActivity.this.f28086b.getPinLength()) {
                OtpActivity.this.f28086b.setPinLength(OtpActivity.this.f28086b.getPinLength() + 1);
            }
        }
    }

    public class b implements PinPadView.e {
        public b() {
        }

        @Override // co.paystack.android.design.widget.PinPadView.e
        public void a(String str) {
            OtpActivity.this.b(str);
        }

        @Override // co.paystack.android.design.widget.PinPadView.e
        public void b(String str) {
            OtpActivity.this.b(str);
        }
    }

    public void b(String str) {
        synchronized (this.f28085a) {
            this.f28085a.d(str);
            this.f28085a.notify();
        }
        finish();
    }

    public void c() {
        this.f28086b.setPromptText(this.f28085a.c());
        this.f28086b.setVibrateOnIncompleteSubmit(false);
        this.f28086b.setAutoSubmit(false);
        this.f28086b.setOnPinChangedListener(new a());
        this.f28086b.setOnSubmitListener(new b());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC4524e.f48081d);
        setTitle("ENTER OTP");
        getWindow().addFlags(128);
        this.f28086b = (PinPadView) findViewById(AbstractC4523d.f48075o);
        c();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b("");
    }
}
