package com.bytedance.sdk.openadsdk.gm;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends TTDislikeDialogAbstract {
    private pcc oo;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc();

        void pcc(int i, FilterWord filterWord);

        void sf();
    }

    public oo(Context context, String str, List<FilterWord> list) {
        super(context, tz.wh(context, "tt_dislikeDialog"));
        this.pcc = str;
        this.sf = list;
    }

    private void sf() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.gm.oo.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (oo.this.oo != null) {
                    pcc unused = oo.this.oo;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.gm.oo.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (oo.this.oo != null) {
                    oo.this.oo.sf();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(rj.gm(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new vy(getContext(), this.gm, this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            pcc();
            sf();
            setMaterialMeta(this.pcc, this.sf);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gm.ork.sf
    public void pcc(int i) {
        FilterWord sf;
        if (ork.gm == i) {
            dismiss();
            return;
        }
        if (ork.vj == i) {
            pcc pccVar = this.oo;
            if (pccVar != null) {
                pccVar.pcc();
                return;
            }
            return;
        }
        if (ork.sf != i || (sf = this.gm.sf()) == null || ork.pcc.equals(sf)) {
            return;
        }
        pcc pccVar2 = this.oo;
        if (pccVar2 != null) {
            try {
                pccVar2.pcc(0, sf);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void pcc(pcc pccVar) {
        this.oo = pccVar;
    }

    private void pcc() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
