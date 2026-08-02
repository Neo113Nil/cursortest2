package Aa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class k extends FrameLayout implements h {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f411a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f412b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f413c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.view.menu.g f414d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f415e;

    public k(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(ia.i.f48478k, (ViewGroup) this, true);
        this.f411a = (TextView) findViewById(ia.g.f48422b0);
    }

    private void a() {
        androidx.appcompat.view.menu.g gVar = this.f414d;
        if (gVar != null) {
            setVisibility((!gVar.isVisible() || (!this.f412b && this.f413c)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f414d = gVar;
        gVar.setCheckable(false);
        this.f411a.setText(gVar.getTitle());
        a();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f414d;
    }

    @Override // Aa.h
    public void setExpanded(boolean z10) {
        this.f412b = z10;
        a();
    }

    @Override // Aa.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f413c = z10;
        a();
    }

    public void setTextAppearance(int i10) {
        C0.j.m(this.f411a, i10);
        ColorStateList colorStateList = this.f415e;
        if (colorStateList != null) {
            this.f411a.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f415e = colorStateList;
        if (colorStateList != null) {
            this.f411a.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
