package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w38 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public w38(okj okjVar) {
        this.a = 2;
        this.c = okjVar;
        Context context = okjVar.a.getContext();
        CharSequence charSequence = okjVar.h;
        xb xbVar = new xb();
        xbVar.e = 4096;
        xbVar.g = 4096;
        xbVar.l = null;
        xbVar.m = null;
        xbVar.n = false;
        xbVar.o = false;
        xbVar.p = 16;
        xbVar.i = context;
        xbVar.a = charSequence;
        this.b = xbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                b48 b48Var = (b48) obj2;
                e48 e48Var = b48Var.k;
                if (e48Var != null) {
                    ((d55) e48Var).g(c48.c);
                }
                b48Var.a((Activity) obj);
                b48Var.j = null;
                b48Var.k = null;
                break;
            case 1:
                rac racVar = (rac) obj2;
                obc obcVar = (obc) obj;
                racVar.f.g.o = obcVar;
                obcVar.l(true);
                racVar.c.setVisibility(4);
                racVar.d.setVisibility(0);
                break;
            default:
                okj okjVar = (okj) obj2;
                Window.Callback callback = okjVar.k;
                if (callback != null && okjVar.l) {
                    callback.onMenuItemSelected(0, (xb) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w38(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
