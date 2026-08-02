package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lcb implements yfc, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public vec c;
    public ExpandedMenuView d;
    public xfc e;
    public kcb f;

    public lcb(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.yfc
    public final void b(vec vecVar, boolean z) {
        xfc xfcVar = this.e;
        if (xfcVar != null) {
            xfcVar.b(vecVar, z);
        }
    }

    @Override // defpackage.yfc
    public final boolean c(sji sjiVar) {
        boolean hasVisibleItems = sjiVar.hasVisibleItems();
        Context context = sjiVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        xec xecVar = new xec();
        xecVar.a = sjiVar;
        wm wmVar = new wm(context);
        lcb lcbVar = new lcb(wmVar.getContext());
        xecVar.c = lcbVar;
        lcbVar.e = xecVar;
        sjiVar.b(lcbVar, context);
        lcb lcbVar2 = xecVar.c;
        kcb kcbVar = lcbVar2.f;
        if (kcbVar == null) {
            kcbVar = new kcb(lcbVar2);
            lcbVar2.f = kcbVar;
        }
        sm smVar = wmVar.a;
        smVar.m = kcbVar;
        smVar.n = xecVar;
        View view = sjiVar.o;
        if (view != null) {
            smVar.e = view;
        } else {
            smVar.c = sjiVar.n;
            wmVar.setTitle(sjiVar.m);
        }
        smVar.k = xecVar;
        xm create = wmVar.create();
        xecVar.b = create;
        create.setOnDismissListener(xecVar);
        WindowManager.LayoutParams attributes = xecVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        xecVar.b.show();
        xfc xfcVar = this.e;
        if (xfcVar == null) {
            return true;
        }
        xfcVar.k(sjiVar);
        return true;
    }

    @Override // defpackage.yfc
    public final boolean d(efc efcVar) {
        return false;
    }

    @Override // defpackage.yfc
    public final void e(xfc xfcVar) {
        throw null;
    }

    @Override // defpackage.yfc
    public final void f() {
        kcb kcbVar = this.f;
        if (kcbVar != null) {
            kcbVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.yfc
    public final boolean g() {
        return false;
    }

    @Override // defpackage.yfc
    public final boolean h(efc efcVar) {
        return false;
    }

    @Override // defpackage.yfc
    public final void i(Context context, vec vecVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = vecVar;
        kcb kcbVar = this.f;
        if (kcbVar != null) {
            kcbVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
