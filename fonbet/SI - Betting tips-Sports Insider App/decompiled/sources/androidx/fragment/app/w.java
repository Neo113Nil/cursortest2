package androidx.fragment.app;

import android.app.Dialog;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w implements androidx.lifecycle.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f2101a;

    public w(y yVar) {
        this.f2101a = yVar;
    }

    @Override // androidx.lifecycle.q0
    public final void a(Object obj) {
        boolean z5;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (((androidx.lifecycle.e0) obj) != null) {
            y yVar = this.f2101a;
            z5 = yVar.mShowsDialog;
            if (z5) {
                View requireView = yVar.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                dialog = yVar.mDialog;
                if (dialog != null) {
                    if (j1.L(3)) {
                        StringBuilder sb2 = new StringBuilder("DialogFragment ");
                        sb2.append(this);
                        sb2.append(" setting the content view on ");
                        dialog3 = yVar.mDialog;
                        sb2.append(dialog3);
                        Log.d("FragmentManager", sb2.toString());
                    }
                    dialog2 = yVar.mDialog;
                    dialog2.setContentView(requireView);
                }
            }
        }
    }
}
