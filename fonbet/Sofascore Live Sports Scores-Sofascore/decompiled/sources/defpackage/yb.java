package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yb extends en8 {
    public final /* synthetic */ int j = 0;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    @Override // defpackage.en8
    public final wfh b() {
        ac acVar;
        int i = this.j;
        View view = this.k;
        switch (i) {
            case 0:
                zb zbVar = ((ActionMenuItemView) view).m;
                if (zbVar == null || (acVar = ((bc) zbVar).a.r) == null) {
                    return null;
                }
                return acVar.a();
            default:
                ac acVar2 = ((cc) view).a.q;
                if (acVar2 == null) {
                    return null;
                }
                return acVar2.a();
        }
    }

    @Override // defpackage.en8
    public final boolean c() {
        wfh b;
        int i = this.j;
        View view = this.k;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                uec uecVar = actionMenuItemView.k;
                if (uecVar == null || !uecVar.c(actionMenuItemView.h) || (b = b()) == null || !b.a()) {
                }
                break;
            default:
                ((cc) view).a.l();
                break;
        }
        return true;
    }

    @Override // defpackage.en8
    public boolean d() {
        switch (this.j) {
            case 1:
                dc dcVar = ((cc) this.k).a;
                if (dcVar.s != null) {
                    return false;
                }
                dcVar.j();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(cc ccVar, cc ccVar2) {
        super(ccVar2);
        this.k = ccVar;
    }
}
