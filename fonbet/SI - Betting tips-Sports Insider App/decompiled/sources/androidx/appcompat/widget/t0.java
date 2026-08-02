package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 implements y0, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public androidx.appcompat.app.l f947a;

    /* renamed from: b, reason: collision with root package name */
    public u0 f948b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f949c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f950d;

    public t0(z0 z0Var) {
        this.f950d = z0Var;
    }

    @Override // androidx.appcompat.widget.y0
    public final boolean a() {
        androidx.appcompat.app.l lVar = this.f947a;
        if (lVar != null) {
            return lVar.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.y0
    public final int b() {
        return 0;
    }

    @Override // androidx.appcompat.widget.y0
    public final void d(int i5) {
        io.sentry.android.core.w0.d("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.y0
    public final void dismiss() {
        androidx.appcompat.app.l lVar = this.f947a;
        if (lVar != null) {
            lVar.dismiss();
            this.f947a = null;
        }
    }

    @Override // androidx.appcompat.widget.y0
    public final CharSequence e() {
        return this.f949c;
    }

    @Override // androidx.appcompat.widget.y0
    public final Drawable getBackground() {
        return null;
    }

    @Override // androidx.appcompat.widget.y0
    public final void h(CharSequence charSequence) {
        this.f949c = charSequence;
    }

    @Override // androidx.appcompat.widget.y0
    public final void i(int i5) {
        io.sentry.android.core.w0.d("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.y0
    public final void j(int i5) {
        io.sentry.android.core.w0.d("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.y0
    public final void k(int i5, int i10) {
        if (this.f948b == null) {
            return;
        }
        z0 z0Var = this.f950d;
        androidx.appcompat.app.k kVar = new androidx.appcompat.app.k(z0Var.getPopupContext());
        CharSequence charSequence = this.f949c;
        if (charSequence != null) {
            kVar.setTitle(charSequence);
        }
        kVar.setSingleChoiceItems(this.f948b, z0Var.getSelectedItemPosition(), this);
        androidx.appcompat.app.l create = kVar.create();
        this.f947a = create;
        AlertController$RecycleListView alertController$RecycleListView = create.f299a.f266g;
        alertController$RecycleListView.setTextDirection(i5);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f947a.show();
    }

    @Override // androidx.appcompat.widget.y0
    public final int l() {
        return 0;
    }

    @Override // androidx.appcompat.widget.y0
    public final void m(ListAdapter listAdapter) {
        this.f948b = (u0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        z0 z0Var = this.f950d;
        z0Var.setSelection(i5);
        if (z0Var.getOnItemClickListener() != null) {
            z0Var.performItemClick(null, i5, this.f948b.getItemId(i5));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.y0
    public final void setBackgroundDrawable(Drawable drawable) {
        io.sentry.android.core.w0.d("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
