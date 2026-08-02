package jc;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.LiveData;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.n;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractActivityC5481c;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f53935a;

    /* renamed from: b, reason: collision with root package name */
    public final Promise f53936b;

    /* renamed from: c, reason: collision with root package name */
    public final FragmentManager f53937c;

    /* renamed from: d, reason: collision with root package name */
    public final ReactApplicationContext f53938d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53939e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.datepicker.n f53940f;

    /* renamed from: g, reason: collision with root package name */
    public n.c f53941g;

    public final class a implements com.google.android.material.datepicker.o, DialogInterface.OnDismissListener {
        public a() {
        }

        @Override // com.google.android.material.datepicker.o
        public /* bridge */ /* synthetic */ void a(Object obj) {
            c(((Number) obj).longValue());
        }

        public final Calendar b(long j10) {
            C5124j c5124j = new C5124j(v.this.f53935a);
            Calendar calendar = Calendar.getInstance(AbstractC5118d.m(v.this.f53935a));
            Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar2.setTimeInMillis(j10);
            calendar.set(1, calendar2.get(1));
            calendar.set(2, calendar2.get(2));
            calendar.set(5, calendar2.get(5));
            calendar.set(11, c5124j.b());
            calendar.set(12, c5124j.c());
            calendar.set(13, 0);
            calendar.set(14, 0);
            Intrinsics.checkNotNull(calendar);
            return calendar;
        }

        public void c(long j10) {
            if (v.this.f53939e || !v.this.f53938d.hasActiveReactInstance()) {
                return;
            }
            Calendar b10 = b(j10);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dateSetAction");
            writableNativeMap.putDouble(EventKeys.TIMESTAMP, b10.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (b10.getTimeZone().getOffset(b10.getTimeInMillis()) / 1000) / 60);
            v.this.f53936b.resolve(writableNativeMap);
            v.this.f53939e = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            if (v.this.f53939e || !v.this.f53938d.hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            v.this.f53936b.resolve(writableNativeMap);
            v.this.f53939e = true;
        }
    }

    public static final class b implements C, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f53943a;

        public b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53943a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f53943a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.C
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53943a.invoke(obj);
        }
    }

    public v(Bundle args, Promise promise, FragmentManager fragmentManager, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f53935a = args;
        this.f53936b = promise;
        this.f53937c = fragmentManager;
        this.f53938d = reactContext;
        n.c c10 = n.c.c();
        Intrinsics.checkNotNullExpressionValue(c10, "datePicker(...)");
        this.f53941g = c10;
    }

    public static final Unit u(final com.google.android.material.datepicker.n nVar, final C5124j c5124j, final v vVar, final LiveData liveData, final AbstractActivityC5481c abstractActivityC5481c, InterfaceC2193s interfaceC2193s) {
        View decorView;
        if (interfaceC2193s == null) {
            return Unit.INSTANCE;
        }
        Window window = nVar.requireDialog().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new Runnable() { // from class: jc.t
                @Override // java.lang.Runnable
                public final void run() {
                    v.v(com.google.android.material.datepicker.n.this, c5124j, vVar, liveData, abstractActivityC5481c);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void v(com.google.android.material.datepicker.n nVar, C5124j c5124j, v vVar, LiveData liveData, AbstractActivityC5481c abstractActivityC5481c) {
        Window window;
        View decorView;
        Dialog dialog = nVar.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        final String valueOf = String.valueOf(c5124j.f());
        View k10 = vVar.k(decorView, new Function1() { // from class: jc.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean w10;
                w10 = v.w(valueOf, (View) obj);
                return Boolean.valueOf(w10);
            }
        });
        if (k10 != null) {
            k10.performClick();
        } else {
            liveData.removeObservers(abstractActivityC5481c);
        }
    }

    public static final boolean w(String str, View v10) {
        CharSequence text;
        String obj;
        Intrinsics.checkNotNullParameter(v10, "v");
        if (v10 instanceof TextView) {
            TextView textView = (TextView) v10;
            if (textView.isShown() && textView.isClickable() && (text = textView.getText()) != null && (obj = text.toString()) != null && StringsKt.contains$default((CharSequence) obj, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        a aVar = new a();
        com.google.android.material.datepicker.n nVar = this.f53940f;
        Intrinsics.checkNotNull(nVar);
        nVar.k0(aVar);
        com.google.android.material.datepicker.n nVar2 = this.f53940f;
        Intrinsics.checkNotNull(nVar2);
        nVar2.j0(aVar);
    }

    public final void j() {
        q();
        s();
        r();
        n();
        o();
        p();
        this.f53940f = this.f53941g.a();
        t();
    }

    public final View k(View view, Function1 function1) {
        if (((Boolean) function1.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View k10 = k(childAt, function1);
            if (k10 != null) {
                return k10;
            }
        }
        return null;
    }

    public final int l(int i10) {
        Resources.Theme theme;
        Activity currentActivity = this.f53938d.getCurrentActivity();
        if (currentActivity == null || (theme = currentActivity.getTheme()) == null) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public final void m() {
        j();
        i();
        x();
    }

    public final void n() {
        Bundle bundle = this.f53935a.getBundle("dialogButtons");
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("negative");
        Bundle bundle3 = bundle.getBundle("positive");
        if (bundle2 != null) {
            this.f53941g.g(bundle2.getString(AnnotatedPrivateKey.LABEL));
        }
        if (bundle3 != null) {
            this.f53941g.h(bundle3.getString(AnnotatedPrivateKey.LABEL));
        }
    }

    public final void o() {
        CalendarConstraints.b bVar = new CalendarConstraints.b();
        if (this.f53935a.containsKey("firstDayOfWeek")) {
            bVar.b(this.f53935a.getInt("firstDayOfWeek"));
        }
        ArrayList arrayList = new ArrayList();
        if (this.f53935a.containsKey("minimumDate")) {
            DateValidatorPointForward a10 = DateValidatorPointForward.a(AbstractC5118d.o(this.f53935a));
            Intrinsics.checkNotNullExpressionValue(a10, "from(...)");
            arrayList.add(a10);
        }
        if (this.f53935a.containsKey("maximumDate")) {
            DateValidatorPointBackward a11 = DateValidatorPointBackward.a(AbstractC5118d.n(this.f53935a));
            Intrinsics.checkNotNullExpressionValue(a11, "before(...)");
            arrayList.add(a11);
        }
        bVar.d(CompositeDateValidator.c(arrayList));
        this.f53941g.e(bVar.a());
    }

    public final void p() {
        if (this.f53935a.getBoolean("fullscreen")) {
            this.f53941g.j(l(ia.c.f48204I));
        } else {
            this.f53941g.j(l(ia.c.f48206K));
        }
    }

    public final void q() {
        this.f53941g.i(new C5124j(this.f53935a).e());
    }

    public final void r() {
        String string = this.f53935a.getString("initialInputMode");
        if (string == null || string.length() == 0) {
            this.f53941g.f(0);
            return;
        }
        String string2 = this.f53935a.getString("initialInputMode");
        Intrinsics.checkNotNull(string2);
        String upperCase = string2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (w.valueOf(upperCase) == w.KEYBOARD) {
            this.f53941g.f(1);
        } else {
            this.f53941g.f(0);
        }
    }

    public final void s() {
        String string = this.f53935a.getString("title");
        if (string == null || string.length() == 0) {
            return;
        }
        this.f53941g.k(this.f53935a.getString("title"));
    }

    public final void t() {
        final com.google.android.material.datepicker.n nVar;
        if (this.f53935a.getBoolean("startOnYearSelection")) {
            final C5124j c5124j = new C5124j(this.f53935a);
            Activity currentActivity = this.f53938d.getCurrentActivity();
            final AbstractActivityC5481c abstractActivityC5481c = currentActivity instanceof AbstractActivityC5481c ? (AbstractActivityC5481c) currentActivity : null;
            if (abstractActivityC5481c == null || (nVar = this.f53940f) == null) {
                return;
            }
            final LiveData viewLifecycleOwnerLiveData = nVar.getViewLifecycleOwnerLiveData();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwnerLiveData, "getViewLifecycleOwnerLiveData(...)");
            viewLifecycleOwnerLiveData.observe(abstractActivityC5481c, new b(new Function1() { // from class: jc.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit u10;
                    u10 = v.u(com.google.android.material.datepicker.n.this, c5124j, this, viewLifecycleOwnerLiveData, abstractActivityC5481c, (InterfaceC2193s) obj);
                    return u10;
                }
            }));
        }
    }

    public final void x() {
        com.google.android.material.datepicker.n nVar = this.f53940f;
        Intrinsics.checkNotNull(nVar);
        nVar.show(this.f53937c, "RNCMaterialDatePicker");
    }
}
