package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rm implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView a;
    public final /* synthetic */ vm b;
    public final /* synthetic */ sm c;

    public rm(sm smVar, AlertController$RecycleListView alertController$RecycleListView, vm vmVar) {
        this.c = smVar;
        this.a = alertController$RecycleListView;
        this.b = vmVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        sm smVar = this.c;
        boolean[] zArr = smVar.p;
        AlertController$RecycleListView alertController$RecycleListView = this.a;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        smVar.t.onClick(this.b.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
