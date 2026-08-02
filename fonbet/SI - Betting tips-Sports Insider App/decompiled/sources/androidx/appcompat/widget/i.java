package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends androidx.appcompat.view.menu.x {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f770l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f771m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context, androidx.appcompat.view.menu.n nVar2, View view) {
        super(context, nVar2, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f771m = nVar;
        this.f557f = 8388613;
        r rVar = nVar.f856x;
        this.f559h = rVar;
        androidx.appcompat.view.menu.v vVar = this.f560i;
        if (vVar != null) {
            vVar.setCallback(rVar);
        }
    }

    @Override // androidx.appcompat.view.menu.x
    public final void c() {
        switch (this.f770l) {
            case 0:
                n nVar = this.f771m;
                nVar.f853u = null;
                nVar.f857y = 0;
                super.c();
                break;
            default:
                n nVar2 = this.f771m;
                androidx.appcompat.view.menu.n nVar3 = nVar2.f837c;
                if (nVar3 != null) {
                    nVar3.close();
                }
                nVar2.f852t = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context, androidx.appcompat.view.menu.f0 f0Var, View view) {
        super(context, f0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f771m = nVar;
        if ((((androidx.appcompat.view.menu.p) f0Var.getItem()).f538x & 32) != 32) {
            View view2 = nVar.j;
            this.f556e = view2 == null ? (View) nVar.f842h : view2;
        }
        r rVar = nVar.f856x;
        this.f559h = rVar;
        androidx.appcompat.view.menu.v vVar = this.f560i;
        if (vVar != null) {
            vVar.setCallback(rVar);
        }
    }
}
