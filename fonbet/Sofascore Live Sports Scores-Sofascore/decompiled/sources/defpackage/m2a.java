package defpackage;

import android.app.Application;
import android.view.LayoutInflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m2a implements uff {
    public final /* synthetic */ int a;
    public final l2a b;

    public /* synthetic */ m2a(l2a l2aVar, int i) {
        this.a = i;
        this.b = l2aVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        l2a l2aVar = this.b;
        switch (i) {
            case 0:
                mw9 mw9Var = (mw9) l2aVar.c;
                x2a.w(mw9Var);
                return mw9Var;
            case 1:
                lw9 lw9Var = (lw9) l2aVar.b;
                x2a.w(lw9Var);
                return lw9Var;
            default:
                LayoutInflater layoutInflater = (LayoutInflater) ((Application) l2aVar.d).getSystemService("layout_inflater");
                x2a.w(layoutInflater);
                return layoutInflater;
        }
    }
}
