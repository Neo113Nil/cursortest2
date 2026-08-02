package jc;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.material.timepicker.d;
import com.twilio.voice.EventKeys;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f53946a;

    /* renamed from: b, reason: collision with root package name */
    public final Promise f53947b;

    /* renamed from: c, reason: collision with root package name */
    public final FragmentManager f53948c;

    /* renamed from: d, reason: collision with root package name */
    public final ReactApplicationContext f53949d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53950e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.timepicker.d f53951f;

    /* renamed from: g, reason: collision with root package name */
    public d.C0505d f53952g;

    public final class a implements View.OnClickListener, DialogInterface.OnDismissListener {
        public a() {
        }

        public final Calendar a() {
            C5124j c5124j = new C5124j(x.this.f53946a);
            Calendar calendar = Calendar.getInstance(AbstractC5118d.m(x.this.f53946a));
            int f10 = c5124j.f();
            int d10 = c5124j.d();
            int a10 = c5124j.a();
            com.google.android.material.timepicker.d dVar = x.this.f53951f;
            Intrinsics.checkNotNull(dVar);
            int r02 = dVar.r0();
            com.google.android.material.timepicker.d dVar2 = x.this.f53951f;
            Intrinsics.checkNotNull(dVar2);
            calendar.set(f10, d10, a10, r02, dVar2.s0(), 0);
            calendar.set(14, 0);
            Intrinsics.checkNotNull(calendar);
            return calendar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            if (x.this.f53950e || !x.this.f53949d.hasActiveReactInstance()) {
                return;
            }
            Calendar a10 = a();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dateSetAction");
            writableNativeMap.putDouble(EventKeys.TIMESTAMP, a10.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (a10.getTimeZone().getOffset(a10.getTimeInMillis()) / 1000) / 60);
            x.this.f53947b.resolve(writableNativeMap);
            x.this.f53950e = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            if (x.this.f53950e || !x.this.f53949d.hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            x.this.f53947b.resolve(writableNativeMap);
            x.this.f53950e = true;
        }
    }

    public x(Bundle args, Promise promise, FragmentManager fragmentManager, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f53946a = args;
        this.f53947b = promise;
        this.f53948c = fragmentManager;
        this.f53949d = reactContext;
        this.f53952g = new d.C0505d();
    }

    public final void g() {
        a aVar = new a();
        com.google.android.material.timepicker.d dVar = this.f53951f;
        Intrinsics.checkNotNull(dVar);
        dVar.p0(aVar);
        com.google.android.material.timepicker.d dVar2 = this.f53951f;
        Intrinsics.checkNotNull(dVar2);
        dVar2.o0(aVar);
    }

    public final void h() {
        k();
        n();
        l();
        j();
        m();
        this.f53951f = this.f53952g.j();
    }

    public final void i() {
        h();
        g();
        o();
    }

    public final void j() {
        Bundle bundle = this.f53946a.getBundle("dialogButtons");
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("negative");
        Bundle bundle3 = bundle.getBundle("positive");
        if (bundle2 != null) {
            this.f53952g.n(bundle2.getString(AnnotatedPrivateKey.LABEL));
        }
        if (bundle3 != null) {
            this.f53952g.o(bundle3.getString(AnnotatedPrivateKey.LABEL));
        }
    }

    public final void k() {
        C5124j c5124j = new C5124j(this.f53946a);
        this.f53952g.k(c5124j.b()).m(c5124j.c());
    }

    public final void l() {
        String string = this.f53946a.getString("initialInputMode");
        if (string == null || string.length() == 0) {
            this.f53952g.l(0);
            return;
        }
        String string2 = this.f53946a.getString("initialInputMode");
        Intrinsics.checkNotNull(string2);
        String upperCase = string2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (w.valueOf(upperCase) == w.KEYBOARD) {
            this.f53952g.l(1);
        } else {
            this.f53952g.l(0);
        }
    }

    public final void m() {
        if (this.f53946a.getBoolean("is24Hour")) {
            this.f53952g.p(1);
        } else if (DateFormat.is24HourFormat(this.f53949d)) {
            this.f53952g.p(1);
        } else {
            this.f53952g.p(0);
        }
    }

    public final void n() {
        String string = this.f53946a.getString("title");
        if (string == null || string.length() == 0) {
            return;
        }
        this.f53952g.q(this.f53946a.getString("title"));
    }

    public final void o() {
        com.google.android.material.timepicker.d dVar = this.f53951f;
        Intrinsics.checkNotNull(dVar);
        dVar.show(this.f53948c, "RNCMaterialTimePicker");
    }
}
