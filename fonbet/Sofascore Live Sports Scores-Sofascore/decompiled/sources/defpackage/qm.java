package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qm implements AdapterView.OnItemClickListener {
    public final /* synthetic */ vm a;
    public final /* synthetic */ sm b;

    public qm(sm smVar, vm vmVar) {
        this.b = smVar;
        this.a = vmVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        sm smVar = this.b;
        DialogInterface.OnClickListener onClickListener = smVar.n;
        vm vmVar = this.a;
        onClickListener.onClick(vmVar.b, i);
        if (smVar.r) {
            return;
        }
        vmVar.b.dismiss();
    }
}
