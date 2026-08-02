package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.ui.themes.VKTheme;
import java.util.Objects;
import xsna.f5z;
import xsna.fr70;
import xsna.gqo;
import xsna.lyd;
import xsna.ro;
import xsna.tk5;
import xsna.uas;
import xsna.y8i;

/* compiled from: DialogFragment.java */
/* loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler h;
    public boolean q;

    @Nullable
    public Dialog s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final a i = new a();
    public final b j = new b();
    public final c k = new c();
    public int l = 0;
    public int m = 0;
    public boolean n = true;
    public boolean o = true;
    public int p = -1;
    public final C0034d r = new C0034d();
    public boolean w = false;

    /* compiled from: DialogFragment.java */
    /* loaded from: classes12.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            dVar.k.onDismiss(dVar.s);
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: classes12.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(@Nullable DialogInterface dialogInterface) {
            d dVar = d.this;
            Dialog dialog = dVar.s;
            if (dialog != null) {
                dVar.onCancel(dialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: classes12.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(@Nullable DialogInterface dialogInterface) {
            d dVar = d.this;
            Dialog dialog = dVar.s;
            if (dialog != null) {
                dVar.onDismiss(dialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public class C0034d implements fr70<f5z> {
        public C0034d() {
        }

        @Override // xsna.fr70
        public final void a(f5z f5zVar) {
            if (f5zVar != null) {
                d dVar = d.this;
                if (dVar.o) {
                    View requireView = dVar.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dVar.s != null) {
                        if (FragmentManager.P(3)) {
                            Objects.toString(dVar.s);
                        }
                        dVar.s.setContentView(requireView);
                    }
                }
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: classes12.dex */
    public class e extends uas {
        public final /* synthetic */ uas b;

        public e(uas uasVar) {
            this.b = uasVar;
        }

        @Override // xsna.uas
        @Nullable
        public final View b(int i) {
            uas uasVar = this.b;
            if (uasVar.c()) {
                return uasVar.b(i);
            }
            Dialog dialog = d.this.s;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        @Override // xsna.uas
        public final boolean c() {
            return this.b.c() || d.this.w;
        }
    }

    public final void An(boolean z) {
        this.n = z;
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public final void Bn(int i, int i2) {
        if (FragmentManager.P(2)) {
            toString();
        }
        this.l = i;
        if (i == 2 || i == 3) {
            this.m = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.m = i2;
        }
    }

    public void Cn(@NonNull Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void M1() {
        dismiss();
    }

    public void Td(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        this.u = false;
        this.v = true;
        androidx.fragment.app.a b2 = tk5.b(fragmentManager, fragmentManager);
        b2.r = true;
        b2.f(0, this, str, 1);
        b2.k(false);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final uas createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        un(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.r);
        if (this.v) {
            return;
        }
        this.u = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.h = new Handler();
        this.o = this.mContainerId == 0;
        if (bundle != null) {
            this.l = bundle.getInt("android:style", 0);
            this.m = bundle.getInt("android:theme", 0);
            this.n = bundle.getBoolean("android:cancelable", true);
            this.o = bundle.getBoolean("android:showsDialog", this.o);
            this.p = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.s;
        if (dialog != null) {
            this.t = true;
            dialog.setOnDismissListener(null);
            this.s.dismiss();
            if (!this.u) {
                onDismiss(this.s);
            }
            this.s = null;
            this.w = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.v && !this.u) {
            this.u = true;
        }
        getViewLifecycleOwnerLiveData().j(this.r);
    }

    public void onDismiss() {
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.o;
        if (z && !this.q) {
            if (z && !this.w) {
                try {
                    this.q = true;
                    Dialog yn = yn(bundle);
                    this.s = yn;
                    if (this.o) {
                        Cn(yn, this.l);
                        Context mo2getContext = mo2getContext();
                        if (mo2getContext instanceof Activity) {
                            this.s.setOwnerActivity((Activity) mo2getContext);
                        }
                        this.s.setCancelable(this.n);
                        this.s.setOnCancelListener(this.j);
                        this.s.setOnDismissListener(this.k);
                        this.w = true;
                    } else {
                        this.s = null;
                    }
                    this.q = false;
                } catch (Throwable th) {
                    this.q = false;
                    throw th;
                }
            }
            if (FragmentManager.P(2)) {
                toString();
            }
            Dialog dialog = this.s;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.P(2)) {
            toString();
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.s;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.l;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.m;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.n;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.o;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.p;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.s;
        if (dialog != null) {
            this.t = false;
            dialog.show();
            View decorView = this.s.getWindow().getDecorView();
            gqo.f(decorView, this);
            ro.o(decorView, this);
            lyd.h(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.s == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.s.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.s == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.s.onRestoreInstanceState(bundle2);
    }

    public void sb(VKTheme vKTheme) {
        tn();
    }

    public void tn() {
        un(true, false);
    }

    public final void un(boolean z, boolean z2) {
        if (this.u) {
            return;
        }
        this.u = true;
        this.v = false;
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.s.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.h.getLooper()) {
                    onDismiss(this.s);
                } else {
                    this.h.post(this.i);
                }
            }
        }
        this.t = true;
        if (this.p >= 0) {
            getParentFragmentManager().X(this.p, z);
            this.p = -1;
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        androidx.fragment.app.a b2 = tk5.b(parentFragmentManager, parentFragmentManager);
        b2.r = true;
        b2.q(this);
        if (z) {
            b2.k(true);
        } else {
            b2.k(false);
        }
    }

    public int vn() {
        return this.m;
    }

    public void wn() {
        tn();
    }

    @Nullable
    public final Dialog x2() {
        return this.s;
    }

    public void xn() {
        tn();
    }

    @NonNull
    public Dialog yn(@Nullable Bundle bundle) {
        if (FragmentManager.P(3)) {
            toString();
        }
        return new y8i(requireContext(), vn());
    }

    @NonNull
    public final Dialog zn() {
        Dialog dialog = this.s;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.t) {
            return;
        }
        if (FragmentManager.P(3)) {
            toString();
        }
        un(true, true);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }
}
