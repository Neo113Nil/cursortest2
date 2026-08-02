package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.gm.ork;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements ork.sf {
    protected final ork gm;
    private View oo;
    protected String pcc;
    protected List<FilterWord> sf;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        ork orkVar = new ork();
        this.gm = orkVar;
        orkVar.pcc(this);
    }

    public void destroy() {
        ork orkVar = this.gm;
        if (orkVar != null) {
            orkVar.pcc();
        }
    }

    public ork getDislikeManager() {
        return this.gm;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.oo = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.oo;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        ork orkVar = this.gm;
        if (orkVar != null) {
            orkVar.gm(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.pcc = str;
        this.sf = list;
        this.gm.pcc(str);
        this.gm.pcc(this.sf);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i) {
        super(context, i);
        ork orkVar = new ork();
        this.gm = orkVar;
        orkVar.pcc(this);
    }
}
