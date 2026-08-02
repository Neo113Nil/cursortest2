package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n15 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n15(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) obj;
                Dialog dialog = dialogFragment.l;
                if (dialog != null) {
                    dialogFragment.onCancel(dialog);
                    break;
                }
                break;
            case 1:
                lj2 lj2Var = (lj2) obj;
                if (lj2Var.r() instanceof oed) {
                    p2g p2gVar = w2g.b;
                    lj2Var.resumeWith(null);
                    break;
                }
                break;
            case 2:
                ((JsResult) obj).cancel();
                break;
            case 3:
                ((JsPromptResult) obj).cancel();
                break;
            default:
                zzm zzmVar = (zzm) obj;
                if (zzmVar != null) {
                    zzmVar.zza();
                    break;
                }
                break;
        }
    }
}
