package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qig {
    public cqa a;
    public yig b;
    public final AlertDialog c;

    public qig(Context context, String str, List list) {
        rig rigVar = new rig(context, str, list);
        this.c = new AlertDialog.Builder(context).setView(rigVar).setTitle("Customer feedback").setPositiveButton("Report this ad", new on(11)).setNegativeButton("Cancel", new pn(this, 6)).setOnDismissListener(new j0(this, 4)).create();
        rigVar.setReasonChangeListener(new qfg(this, 2));
    }
}
