package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes11.dex */
public final class b implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController b;
    public final /* synthetic */ AlertController.b c;

    public b(AlertController.b bVar, AlertController alertController) {
        this.c = bVar;
        this.b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.b bVar = this.c;
        DialogInterface.OnClickListener onClickListener = bVar.s;
        AlertController alertController = this.b;
        onClickListener.onClick(alertController.b, i);
        if (bVar.x) {
            return;
        }
        alertController.b.dismiss();
    }
}
