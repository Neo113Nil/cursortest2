package androidx.appcompat.view.menu;

import android.view.View;
import androidx.appcompat.widget.j2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends j2 {
    public final /* synthetic */ int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f446k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f446k = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.j2
    public final d0 b() {
        androidx.appcompat.widget.i iVar;
        switch (this.j) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f446k).f409f;
                if (cVar == null || (iVar = ((androidx.appcompat.widget.j) cVar).f779a.f853u) == null) {
                    return null;
                }
                return iVar.a();
            default:
                androidx.appcompat.widget.i iVar2 = ((androidx.appcompat.widget.l) this.f446k).f810a.f852t;
                if (iVar2 == null) {
                    return null;
                }
                return iVar2.a();
        }
    }

    @Override // androidx.appcompat.widget.j2
    public final boolean c() {
        d0 b10;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f446k;
                m mVar = actionMenuItemView.f407d;
                return mVar != null && mVar.a(actionMenuItemView.f404a) && (b10 = b()) != null && b10.a();
            default:
                ((androidx.appcompat.widget.l) this.f446k).f810a.d();
                return true;
        }
    }

    @Override // androidx.appcompat.widget.j2
    public boolean d() {
        switch (this.j) {
            case 1:
                androidx.appcompat.widget.n nVar = ((androidx.appcompat.widget.l) this.f446k).f810a;
                if (nVar.f854v != null) {
                    return false;
                }
                nVar.b();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.widget.l lVar, androidx.appcompat.widget.l lVar2) {
        super(lVar2);
        this.f446k = lVar;
    }
}
