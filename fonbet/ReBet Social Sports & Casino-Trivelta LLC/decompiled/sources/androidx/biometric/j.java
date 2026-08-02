package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.lifecycle.C;
import androidx.lifecycle.U;
import l0.AbstractC5338c;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: m, reason: collision with root package name */
    public final Handler f17491m = new Handler(Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final Runnable f17492n = new a();

    /* renamed from: o, reason: collision with root package name */
    public BiometricViewModel f17493o;

    /* renamed from: p, reason: collision with root package name */
    public int f17494p;

    /* renamed from: q, reason: collision with root package name */
    public int f17495q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f17496r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f17497s;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.k0();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            j.this.f17493o.Y(true);
        }
    }

    public class c implements C {
        public c() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Integer num) {
            j jVar = j.this;
            jVar.f17491m.removeCallbacks(jVar.f17492n);
            j.this.m0(num.intValue());
            j.this.n0(num.intValue());
            j jVar2 = j.this;
            jVar2.f17491m.postDelayed(jVar2.f17492n, 2000L);
        }
    }

    public class d implements C {
        public d() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(CharSequence charSequence) {
            j jVar = j.this;
            jVar.f17491m.removeCallbacks(jVar.f17492n);
            j.this.o0(charSequence);
            j jVar2 = j.this;
            jVar2.f17491m.postDelayed(jVar2.f17492n, 2000L);
        }
    }

    public static class e {
        public static void a(@NonNull Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    public static class f {
        public static int a() {
            return n.f17507a;
        }
    }

    private void f0() {
        AbstractActivityC2168s activity = getActivity();
        if (activity == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new U(activity).a(BiometricViewModel.class);
        this.f17493o = biometricViewModel;
        biometricViewModel.q().observe(this, new c());
        this.f17493o.o().observe(this, new d());
    }

    public static j j0() {
        return new j();
    }

    public final Drawable g0(int i10, int i11) {
        int i12;
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i10 == 0 && i11 == 1) {
            i12 = p.f17510b;
        } else if (i10 == 1 && i11 == 2) {
            i12 = p.f17509a;
        } else if (i10 == 2 && i11 == 1) {
            i12 = p.f17510b;
        } else {
            if (i10 != 1 || i11 != 3) {
                return null;
            }
            i12 = p.f17510b;
        }
        return AbstractC5338c.getDrawable(context, i12);
    }

    public final int h0(int i10) {
        Context context = getContext();
        AbstractActivityC2168s activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public void k0() {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.f17493o.W(1);
            this.f17493o.U(context.getString(s.f17518c));
        }
    }

    public final boolean l0(int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            return false;
        }
        if (i10 == 1 && i11 == 2) {
            return true;
        }
        return i10 == 2 && i11 == 1;
    }

    public void m0(int i10) {
        int p10;
        Drawable g02;
        if (this.f17496r == null || (g02 = g0((p10 = this.f17493o.p()), i10)) == null) {
            return;
        }
        this.f17496r.setImageDrawable(g02);
        if (l0(p10, i10)) {
            e.a(g02);
        }
        this.f17493o.V(i10);
    }

    public void n0(int i10) {
        TextView textView = this.f17497s;
        if (textView != null) {
            textView.setTextColor(i10 == 2 ? this.f17494p : this.f17495q);
        }
    }

    public void o0(CharSequence charSequence) {
        TextView textView = this.f17497s;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f17493o.S(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f0();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17494p = h0(f.a());
        } else {
            Context context = getContext();
            this.f17494p = context != null ? AbstractC5338c.getColor(context, o.f17508a) : 0;
        }
        this.f17495q = h0(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle bundle) {
        a.C0340a c0340a = new a.C0340a(requireContext());
        c0340a.setTitle(this.f17493o.v());
        View inflate = LayoutInflater.from(c0340a.getContext()).inflate(r.f17515a, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(q.f17514d);
        if (textView != null) {
            CharSequence u10 = this.f17493o.u();
            if (TextUtils.isEmpty(u10)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(u10);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(q.f17511a);
        if (textView2 != null) {
            CharSequence n10 = this.f17493o.n();
            if (TextUtils.isEmpty(n10)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(n10);
            }
        }
        this.f17496r = (ImageView) inflate.findViewById(q.f17513c);
        this.f17497s = (TextView) inflate.findViewById(q.f17512b);
        c0340a.h(androidx.biometric.b.c(this.f17493o.d()) ? getString(s.f17516a) : this.f17493o.t(), new b());
        c0340a.setView(inflate);
        androidx.appcompat.app.a create = c0340a.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f17491m.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f17493o.V(0);
        this.f17493o.W(1);
        this.f17493o.U(getString(s.f17518c));
    }
}
