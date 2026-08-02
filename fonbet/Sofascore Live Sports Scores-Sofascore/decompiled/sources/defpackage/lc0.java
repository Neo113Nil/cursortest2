package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lc0 implements qc0, DialogInterface.OnClickListener {
    public xm a;
    public mc0 b;
    public CharSequence c;
    public final /* synthetic */ b d;

    public lc0(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.qc0
    public final boolean a() {
        xm xmVar = this.a;
        if (xmVar != null) {
            return xmVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.qc0
    public final int b() {
        return 0;
    }

    @Override // defpackage.qc0
    public final void dismiss() {
        xm xmVar = this.a;
        if (xmVar != null) {
            xmVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.qc0
    public final CharSequence e() {
        return this.c;
    }

    @Override // defpackage.qc0
    public final Drawable f() {
        return null;
    }

    @Override // defpackage.qc0
    public final void g(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.qc0
    public final void k(int i, int i2) {
        if (this.b == null) {
            return;
        }
        b bVar = this.d;
        wm wmVar = new wm(bVar.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            wmVar.setTitle(charSequence);
        }
        mc0 mc0Var = this.b;
        int selectedItemPosition = bVar.getSelectedItemPosition();
        sm smVar = wmVar.a;
        smVar.m = mc0Var;
        smVar.n = this;
        smVar.s = selectedItemPosition;
        smVar.r = true;
        xm create = wmVar.create();
        this.a = create;
        AlertController$RecycleListView alertController$RecycleListView = create.g.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.qc0
    public final int l() {
        return 0;
    }

    @Override // defpackage.qc0
    public final void m(ListAdapter listAdapter) {
        this.b = (mc0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        b bVar = this.d;
        bVar.setSelection(i);
        if (bVar.getOnItemClickListener() != null) {
            bVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.qc0
    public final void d(int i) {
    }

    @Override // defpackage.qc0
    public final void i(int i) {
    }

    @Override // defpackage.qc0
    public final void j(int i) {
    }

    @Override // defpackage.qc0
    public final void o(Drawable drawable) {
    }
}
