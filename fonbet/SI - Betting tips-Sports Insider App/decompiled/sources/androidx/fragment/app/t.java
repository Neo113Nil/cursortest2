package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2085b;

    public /* synthetic */ t(int i5, Object obj) {
        this.f2084a = i5;
        this.f2085b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterface.OnDismissListener onDismissListener;
        Dialog dialog;
        switch (this.f2084a) {
            case 0:
                y yVar = (y) this.f2085b;
                onDismissListener = yVar.mOnDismissListener;
                dialog = yVar.mDialog;
                onDismissListener.onDismiss(dialog);
                break;
            case 1:
                k2 k2Var = (k2) this.f2085b;
                if (!k2Var.f1989b.isEmpty()) {
                    k2Var.f();
                    break;
                }
                break;
            default:
                ((j1) this.f2085b).z(true);
                break;
        }
    }
}
