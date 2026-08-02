package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.results.base.BaseActivity;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vn implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function2) obj2).invoke(Boolean.FALSE, Boolean.valueOf(((MaterialCheckBox) ((ed) obj).c).isChecked()));
                break;
            default:
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj2;
                s01 s01Var = (s01) obj;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                Context context = s01Var.getContext();
                context.getClass();
                FragmentActivity K = hkg.K(context);
                BaseActivity baseActivity = K instanceof BaseActivity ? (BaseActivity) K : null;
                if (baseActivity != null) {
                    baseActivity.z().c(s01Var.h);
                    break;
                }
                break;
        }
    }
}
