package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g4 implements androidx.appcompat.view.menu.z {

    /* renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.n f761a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.view.menu.p f762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f763c;

    public g4(Toolbar toolbar) {
        this.f763c = toolbar;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean collapseItemActionView(androidx.appcompat.view.menu.n nVar, androidx.appcompat.view.menu.p pVar) {
        Toolbar toolbar = this.f763c;
        KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof n.c) {
            ((n.c) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.mExpandedActionView);
        toolbar.removeView(toolbar.mCollapseButtonView);
        toolbar.mExpandedActionView = null;
        toolbar.addChildrenForExpandedActionView();
        this.f762b = null;
        toolbar.requestLayout();
        pVar.C = false;
        pVar.f529n.onItemsChanged(false);
        toolbar.updateBackInvokedCallbackState();
        return true;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean expandItemActionView(androidx.appcompat.view.menu.n nVar, androidx.appcompat.view.menu.p pVar) {
        Toolbar toolbar = this.f763c;
        toolbar.ensureCollapseButtonView();
        ViewParent parent = toolbar.mCollapseButtonView.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
            }
            toolbar.addView(toolbar.mCollapseButtonView);
        }
        View actionView = pVar.getActionView();
        toolbar.mExpandedActionView = actionView;
        this.f762b = pVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
            }
            h4 generateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
            generateDefaultLayoutParams.f768a = (toolbar.mButtonGravity & 112) | 8388611;
            generateDefaultLayoutParams.f769b = 2;
            toolbar.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
            toolbar.addView(toolbar.mExpandedActionView);
        }
        toolbar.removeChildrenForExpandedActionView();
        toolbar.requestLayout();
        pVar.C = true;
        pVar.f529n.onItemsChanged(false);
        KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof n.c) {
            ((n.c) callback).onActionViewExpanded();
        }
        toolbar.updateBackInvokedCallbackState();
        return true;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void initForMenu(Context context, androidx.appcompat.view.menu.n nVar) {
        androidx.appcompat.view.menu.p pVar;
        androidx.appcompat.view.menu.n nVar2 = this.f761a;
        if (nVar2 != null && (pVar = this.f762b) != null) {
            nVar2.collapseItemActionView(pVar);
        }
        this.f761a = nVar;
    }

    @Override // androidx.appcompat.view.menu.z
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.f0 f0Var) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void updateMenuView(boolean z5) {
        if (this.f762b != null) {
            androidx.appcompat.view.menu.n nVar = this.f761a;
            if (nVar != null) {
                int size = nVar.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (this.f761a.getItem(i5) == this.f762b) {
                        return;
                    }
                }
            }
            collapseItemActionView(this.f761a, this.f762b);
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onCloseMenu(androidx.appcompat.view.menu.n nVar, boolean z5) {
    }
}
