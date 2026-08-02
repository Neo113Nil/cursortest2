package co.paystack.android.ui;

import android.os.Bundle;
import co.paystack.android.design.widget.PinPadView;
import i3.AbstractC4523d;
import i3.AbstractC4524e;
import m.AbstractActivityC5481c;

/* loaded from: classes.dex */
public class PinActivity extends AbstractActivityC5481c {

    /* renamed from: f, reason: collision with root package name */
    public final e f28089f = e.a();

    /* renamed from: g, reason: collision with root package name */
    public PinPadView f28090g;

    public class a implements PinPadView.e {
        public a() {
        }

        @Override // co.paystack.android.design.widget.PinPadView.e
        public void a(String str) {
            PinActivity.this.A(str);
        }

        @Override // co.paystack.android.design.widget.PinPadView.e
        public void b(String str) {
        }
    }

    public void A(String str) {
        synchronized (this.f28089f) {
            this.f28089f.c(str);
            this.f28089f.notify();
        }
        finish();
    }

    public void B() {
        this.f28090g.setOnSubmitListener(new a());
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC4524e.f48082e);
        getWindow().addFlags(128);
        setTitle("ENTER CARD PIN");
        this.f28090g = (PinPadView) findViewById(AbstractC4523d.f48075o);
        B();
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        A("");
    }
}
