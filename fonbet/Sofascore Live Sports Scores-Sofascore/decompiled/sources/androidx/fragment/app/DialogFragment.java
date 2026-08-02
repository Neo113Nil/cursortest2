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
import defpackage.a70;
import defpackage.b8;
import defpackage.bo8;
import defpackage.cc3;
import defpackage.ep8;
import defpackage.ilg;
import defpackage.ljg;
import defpackage.n15;
import defpackage.o15;
import defpackage.p15;
import defpackage.q15;
import defpackage.qha;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler a;
    public boolean j;
    public Dialog l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final b8 b = new b8(this, 11);
    public final n15 c = new n15(this, 0);
    public final o15 d = new o15(this);
    public int e = 0;
    public int f = 0;
    public boolean g = true;
    public boolean h = true;
    public int i = -1;
    public final p15 k = new p15(this, 0);
    public boolean p = false;

    @Override // androidx.fragment.app.Fragment
    public final bo8 createFragmentContainer() {
        return new q15(this, super.createFragmentContainer());
    }

    public void j() {
        k(false, false);
    }

    public final void k(boolean z, boolean z2) {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = false;
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.l.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.a.getLooper()) {
                    onDismiss(this.l);
                } else {
                    this.a.post(this.b);
                }
            }
        }
        this.m = true;
        if (this.i >= 0) {
            s parentFragmentManager = getParentFragmentManager();
            int i = this.i;
            parentFragmentManager.getClass();
            if (i < 0) {
                a70.p(ljg.j(i, "Bad id: "));
                return;
            } else {
                parentFragmentManager.x(new ep8(parentFragmentManager, null, i, 1), z);
                this.i = -1;
                return;
            }
        }
        s parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        a aVar = new a(parentFragmentManager2);
        aVar.r = true;
        aVar.k(this);
        if (z) {
            aVar.g(true, true);
        } else {
            aVar.f();
        }
    }

    public Dialog l(Bundle bundle) {
        if (s.O(3)) {
            toString();
        }
        return new cc3(requireContext(), this.f);
    }

    public final Dialog m() {
        Dialog dialog = this.l;
        if (dialog != null) {
            return dialog;
        }
        ilg.f(this, " does not have a Dialog.", "DialogFragment ");
        return null;
    }

    public final void n(int i, int i2) {
        if (s.O(2)) {
            toString();
        }
        this.e = i;
        if (i == 2 || i == 3) {
            this.f = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.f = i2;
        }
    }

    public void o(Dialog dialog, int i) {
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

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.k);
        if (this.o) {
            return;
        }
        this.n = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new Handler();
        this.h = this.mContainerId == 0;
        if (bundle != null) {
            this.e = bundle.getInt("android:style", 0);
            this.f = bundle.getInt("android:theme", 0);
            this.g = bundle.getBoolean("android:cancelable", true);
            this.h = bundle.getBoolean("android:showsDialog", this.h);
            this.i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.l;
        if (dialog != null) {
            this.m = true;
            dialog.setOnDismissListener(null);
            this.l.dismiss();
            if (!this.n) {
                onDismiss(this.l);
            }
            this.l = null;
            this.p = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (!this.o && !this.n) {
            this.n = true;
        }
        getViewLifecycleOwnerLiveData().i(this.k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.m) {
            return;
        }
        if (s.O(3)) {
            toString();
        }
        k(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.h;
        if (z && !this.j) {
            if (z && !this.p) {
                try {
                    this.j = true;
                    Dialog l = l(bundle);
                    this.l = l;
                    if (this.h) {
                        o(l, this.e);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.l.setOwnerActivity((Activity) context);
                        }
                        this.l.setCancelable(this.g);
                        this.l.setOnCancelListener(this.c);
                        this.l.setOnDismissListener(this.d);
                        this.p = true;
                    } else {
                        this.l = null;
                    }
                    this.j = false;
                } catch (Throwable th) {
                    this.j = false;
                    throw th;
                }
            }
            if (s.O(2)) {
                toString();
            }
            Dialog dialog = this.l;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (s.O(2)) {
            toString();
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.l;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.e;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.g;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.h;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.i;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.l;
        if (dialog != null) {
            this.m = false;
            dialog.show();
            View decorView = this.l.getWindow().getDecorView();
            qha.Q(decorView, this);
            decorView.setTag(com.sofascore.results.R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(com.sofascore.results.R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.l.onRestoreInstanceState(bundle2);
    }

    public void p(s sVar, String str) {
        this.n = false;
        this.o = true;
        sVar.getClass();
        a aVar = new a(sVar);
        aVar.r = true;
        aVar.i(0, this, str, 1);
        aVar.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.l.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
