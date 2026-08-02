package co.paystack.android.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import i3.AbstractC4523d;
import i3.AbstractC4524e;
import m.AbstractActivityC5481c;
import q3.C6110b;
import r3.AbstractC6203c;

/* loaded from: classes.dex */
public class CardActivity extends AbstractActivityC5481c {

    /* renamed from: g, reason: collision with root package name */
    public EditText f28073g;

    /* renamed from: h, reason: collision with root package name */
    public EditText f28074h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f28075i;

    /* renamed from: j, reason: collision with root package name */
    public EditText f28076j;

    /* renamed from: k, reason: collision with root package name */
    public C6110b f28077k;

    /* renamed from: f, reason: collision with root package name */
    public final co.paystack.android.ui.c f28072f = co.paystack.android.ui.c.b();

    /* renamed from: l, reason: collision with root package name */
    public View.OnFocusChangeListener f28078l = new a();

    /* renamed from: m, reason: collision with root package name */
    public boolean f28079m = false;

    public class a implements View.OnFocusChangeListener {
        public a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            CardActivity.this.C();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CardActivity.this.C()) {
                CardActivity cardActivity = CardActivity.this;
                cardActivity.B(cardActivity.f28077k);
            }
        }
    }

    public class c implements TextView.OnEditorActionListener {
        public c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            CardActivity.this.f28074h.requestFocus();
            return true;
        }
    }

    public class d implements TextView.OnEditorActionListener {
        public d() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            CardActivity.this.f28075i.requestFocus();
            return true;
        }
    }

    public class e implements TextView.OnEditorActionListener {
        public e() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            CardActivity.this.f28076j.requestFocus();
            return true;
        }
    }

    public void B(C6110b c6110b) {
        if (this.f28079m) {
            return;
        }
        synchronized (this.f28072f) {
            this.f28072f.c(c6110b);
            this.f28072f.notify();
        }
        finish();
        this.f28079m = true;
    }

    public final boolean C() {
        int parseInt;
        String trim = this.f28073g.getText().toString().trim();
        if (AbstractC6203c.b(trim)) {
            this.f28073g.setError("Empty card number");
            return false;
        }
        C6110b n10 = new C6110b.c(trim, 0, 0, "").n();
        this.f28077k = n10;
        if (!n10.m()) {
            this.f28073g.setError("Invalid card number");
            return false;
        }
        String trim2 = this.f28074h.getText().toString().trim();
        if (AbstractC6203c.b(trim2)) {
            this.f28074h.setError("Empty cvc");
            return false;
        }
        this.f28077k.h(trim2);
        if (!this.f28077k.k()) {
            this.f28074h.setError("Invalid cvc");
            return false;
        }
        try {
            parseInt = Integer.parseInt(this.f28075i.getText().toString().trim());
        } catch (Exception unused) {
        }
        if (parseInt < 1 || parseInt > 12) {
            this.f28075i.setError("Invalid month");
            return false;
        }
        this.f28077k.i(Integer.valueOf(parseInt));
        try {
            int parseInt2 = Integer.parseInt(this.f28076j.getText().toString().trim());
            if (parseInt2 < 1) {
                this.f28076j.setError("Invalid year");
                return false;
            }
            this.f28077k.j(Integer.valueOf(parseInt2));
            if (this.f28077k.l()) {
                return true;
            }
            this.f28075i.setError("Invalid expiry");
            this.f28076j.setError("Invalid expiry");
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        C6110b a10;
        super.onCreate(bundle);
        setContentView(AbstractC4524e.f48080c);
        getWindow().addFlags(128);
        setTitle("ENTER CARD DETAILS");
        this.f28073g = (EditText) findViewById(AbstractC4523d.f48065e);
        this.f28074h = (EditText) findViewById(AbstractC4523d.f48066f);
        this.f28075i = (EditText) findViewById(AbstractC4523d.f48067g);
        this.f28076j = (EditText) findViewById(AbstractC4523d.f48068h);
        synchronized (this.f28072f) {
            a10 = this.f28072f.a();
            this.f28077k = a10;
        }
        if (a10 != null) {
            this.f28073g.setText(a10.e());
            this.f28074h.setText(this.f28077k.a());
            this.f28075i.setText(this.f28077k.b().intValue() == 0 ? "" : this.f28077k.b().toString());
            this.f28076j.setText(this.f28077k.c().intValue() == 0 ? "" : this.f28077k.c().toString());
        }
        ((Button) findViewById(AbstractC4523d.f48064d)).setOnClickListener(new b());
        this.f28073g.setOnFocusChangeListener(this.f28078l);
        this.f28074h.setOnFocusChangeListener(this.f28078l);
        this.f28075i.setOnFocusChangeListener(this.f28078l);
        this.f28076j.setOnFocusChangeListener(this.f28078l);
        this.f28073g.setOnEditorActionListener(new c());
        this.f28074h.setOnEditorActionListener(new d());
        this.f28075i.setOnEditorActionListener(new e());
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        B(null);
    }
}
