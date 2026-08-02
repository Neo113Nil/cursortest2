package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import com.sports.insider.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class y extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private androidx.lifecycle.q0 mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public y() {
        this.mDismissRunnable = new t(0, this);
        this.mOnCancelListener = new u(this);
        this.mOnDismissListener = new v(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new w(this);
        this.mDialogCreated = false;
    }

    public final void F(boolean z5, boolean z7, boolean z10) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z10) {
                j1 parentFragmentManager = getParentFragmentManager();
                int i5 = this.mBackStackId;
                if (i5 < 0) {
                    parentFragmentManager.getClass();
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i5, "Bad id: "));
                }
                parentFragmentManager.T(i5, 1);
            } else {
                j1 parentFragmentManager2 = getParentFragmentManager();
                int i10 = this.mBackStackId;
                parentFragmentManager2.getClass();
                if (i10 < 0) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i10, "Bad id: "));
                }
                parentFragmentManager2.x(new g1(parentFragmentManager2, null, i10), z5);
            }
            this.mBackStackId = -1;
            return;
        }
        j1 parentFragmentManager3 = getParentFragmentManager();
        parentFragmentManager3.getClass();
        a aVar = new a(parentFragmentManager3);
        aVar.f2083p = true;
        j1 j1Var = this.mFragmentManager;
        j1 j1Var2 = aVar.f1860r;
        if (j1Var != null && j1Var != j1Var2) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new r1(this, 3));
        if (z10) {
            if (aVar.f2075g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            aVar.f2076h = false;
            j1Var2.A(aVar, false);
            return;
        }
        if (z5) {
            aVar.g(true, true);
        } else {
            aVar.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public s0 createFragmentContainer() {
        return new x(this, super.createFragmentContainer());
    }

    public void dismiss() {
        F(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        F(true, false, false);
    }

    public void dismissNow() {
        F(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        Object obj;
        super.onAttach(context);
        androidx.lifecycle.n0 viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        androidx.lifecycle.q0 q0Var = this.mObserver;
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.n0.a("observeForever");
        androidx.lifecycle.k0 k0Var = new androidx.lifecycle.k0(viewLifecycleOwnerLiveData, q0Var);
        p.f fVar = viewLifecycleOwnerLiveData.f2211b;
        p.c a7 = fVar.a(q0Var);
        if (a7 != null) {
            obj = a7.f21388b;
        } else {
            p.c cVar = new p.c(q0Var, k0Var);
            fVar.f21397d++;
            p.c cVar2 = fVar.f21395b;
            if (cVar2 == null) {
                fVar.f21394a = cVar;
                fVar.f21395b = cVar;
            } else {
                cVar2.f21389c = cVar;
                cVar.f21390d = cVar2;
                fVar.f21395b = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.m0 m0Var = (androidx.lifecycle.m0) obj;
        if (m0Var instanceof androidx.lifecycle.l0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (m0Var == null) {
            k0Var.a(true);
        }
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (j1.L(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new e.l(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().i(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (j1.L(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        F(true, true, false);
    }

    public View onFindViewById(int i5) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i5);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z5 = this.mShowsDialog;
        if (z5 && !this.mCreatingDialog) {
            if (z5 && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog onCreateDialog = onCreateDialog(bundle);
                    this.mDialog = onCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(onCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th2) {
                    this.mCreatingDialog = false;
                    throw th2;
                }
            }
            if (j1.L(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (j1.L(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return onGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i5 = this.mStyle;
        if (i5 != 0) {
            bundle.putInt(SAVED_STYLE, i5);
        }
        int i10 = this.mTheme;
        if (i10 != 0) {
            bundle.putInt(SAVED_THEME, i10);
        }
        boolean z5 = this.mCancelable;
        if (!z5) {
            bundle.putBoolean(SAVED_CANCELABLE, z5);
        }
        boolean z7 = this.mShowsDialog;
        if (!z7) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z7);
        }
        int i11 = this.mBackStackId;
        if (i11 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @NonNull
    public final e.l requireComponentDialog() {
        Dialog requireDialog = requireDialog();
        if (requireDialog instanceof e.l) {
            return (e.l) requireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + requireDialog);
    }

    @NonNull
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z5) {
        this.mCancelable = z5;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z5);
        }
    }

    public void setShowsDialog(boolean z5) {
        this.mShowsDialog = z5;
    }

    public void setStyle(int i5, int i10) {
        if (j1.L(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i5 + ", " + i10);
        }
        this.mStyle = i5;
        if (i5 == 2 || i5 == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i10 != 0) {
            this.mTheme = i10;
        }
    }

    public void setupDialog(@NonNull Dialog dialog, int i5) {
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@NonNull j1 j1Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        j1Var.getClass();
        a aVar = new a(j1Var);
        aVar.f2083p = true;
        aVar.c(0, this, str, 1);
        aVar.f();
    }

    public void showNow(@NonNull j1 j1Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        j1Var.getClass();
        a aVar = new a(j1Var);
        aVar.f2083p = true;
        aVar.c(0, this, str, 1);
        if (aVar.f2075g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar.f2076h = false;
        aVar.f1860r.A(aVar, false);
    }

    public int show(@NonNull s1 s1Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        s1Var.c(0, this, str, 1);
        this.mViewDestroyed = false;
        int g10 = ((a) s1Var).g(false, true);
        this.mBackStackId = g10;
        return g10;
    }

    public y(int i5) {
        super(i5);
        this.mDismissRunnable = new t(0, this);
        this.mOnCancelListener = new u(this);
        this.mOnDismissListener = new v(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new w(this);
        this.mDialogCreated = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }
}
