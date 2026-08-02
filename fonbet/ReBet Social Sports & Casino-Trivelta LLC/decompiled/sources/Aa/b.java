package Aa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class b extends FrameLayout implements h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f287a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f288b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f289c;

    public b(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(ia.i.f48477j, (ViewGroup) this, true);
        a();
    }

    public void a() {
        setVisibility((!this.f289c || (!this.f287a && this.f288b)) ? 8 : 0);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        a();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public androidx.appcompat.view.menu.g getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setDividersEnabled(boolean z10) {
        this.f289c = z10;
        a();
    }

    @Override // Aa.h
    public void setExpanded(boolean z10) {
        this.f287a = z10;
        a();
    }

    @Override // Aa.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f288b = z10;
        a();
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
