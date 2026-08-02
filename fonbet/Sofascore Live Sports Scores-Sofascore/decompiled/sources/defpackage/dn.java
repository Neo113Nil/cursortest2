package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dn implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 1:
                ((AlertDialog) obj).getButton(-1).setEnabled(false);
                break;
            case 2:
                Window window = ((gjf) obj).getWindow();
                if (window != null) {
                    window.setDimAmount(0.5f);
                    break;
                }
                break;
            default:
                Context context = ((s01) obj).getContext();
                context.getClass();
                nv.l0(context, dv.POPUP_QUEUE, bv.REMOVE_ADS, null);
                break;
        }
    }
}
