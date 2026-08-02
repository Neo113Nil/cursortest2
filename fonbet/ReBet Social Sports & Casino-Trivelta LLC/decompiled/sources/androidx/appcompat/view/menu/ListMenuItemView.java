package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.a0;
import l.AbstractC5335a;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public g f16618a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f16619b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f16620c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f16621d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f16622e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f16623f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f16624g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f16625h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f16626i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f16627j;

    /* renamed from: k, reason: collision with root package name */
    public int f16628k;

    /* renamed from: l, reason: collision with root package name */
    public Context f16629l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16630m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f16631n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16632o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f16633p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16634q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54971D);
    }

    private LayoutInflater getInflater() {
        if (this.f16633p == null) {
            this.f16633p = LayoutInflater.from(getContext());
        }
        return this.f16633p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f16624g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f16625h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16625h.getLayoutParams();
        rect.top += this.f16625h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i10) {
        LinearLayout linearLayout = this.f16626i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f16618a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(l.g.f55129h, (ViewGroup) this, false);
        this.f16622e = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(l.g.f55130i, (ViewGroup) this, false);
        this.f16619b = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(l.g.f55132k, (ViewGroup) this, false);
        this.f16620c = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f16618a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f16618a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f16623f.setText(this.f16618a.h());
        }
        if (this.f16623f.getVisibility() != i10) {
            this.f16623f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f16627j);
        TextView textView = (TextView) findViewById(l.f.f55092N);
        this.f16621d = textView;
        int i10 = this.f16628k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f16629l, i10);
        }
        this.f16623f = (TextView) findViewById(l.f.f55085G);
        ImageView imageView = (ImageView) findViewById(l.f.f55088J);
        this.f16624g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f16631n);
        }
        this.f16625h = (ImageView) findViewById(l.f.f55114s);
        this.f16626i = (LinearLayout) findViewById(l.f.f55108m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f16619b != null && this.f16630m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f16619b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f16620c == null && this.f16622e == null) {
            return;
        }
        if (this.f16618a.m()) {
            if (this.f16620c == null) {
                g();
            }
            compoundButton = this.f16620c;
            view = this.f16622e;
        } else {
            if (this.f16622e == null) {
                e();
            }
            compoundButton = this.f16622e;
            view = this.f16620c;
        }
        if (z10) {
            compoundButton.setChecked(this.f16618a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f16622e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f16620c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f16618a.m()) {
            if (this.f16620c == null) {
                g();
            }
            compoundButton = this.f16620c;
        } else {
            if (this.f16622e == null) {
                e();
            }
            compoundButton = this.f16622e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f16634q = z10;
        this.f16630m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f16625h;
        if (imageView != null) {
            imageView.setVisibility((this.f16632o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f16618a.z() || this.f16634q;
        if (z10 || this.f16630m) {
            ImageView imageView = this.f16619b;
            if (imageView == null && drawable == null && !this.f16630m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f16630m) {
                this.f16619b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f16619b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f16619b.getVisibility() != 0) {
                this.f16619b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f16621d.getVisibility() != 8) {
                this.f16621d.setVisibility(8);
            }
        } else {
            this.f16621d.setText(charSequence);
            if (this.f16621d.getVisibility() != 0) {
                this.f16621d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        a0 v10 = a0.v(getContext(), attributeSet, l.j.MenuView, i10, 0);
        this.f16627j = v10.g(l.j.f55384y1);
        this.f16628k = v10.n(l.j.f55380x1, -1);
        this.f16630m = v10.a(l.j.f55388z1, false);
        this.f16629l = context;
        this.f16631n = v10.g(l.j.f55168A1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC5335a.f55011z, 0);
        this.f16632o = obtainStyledAttributes.hasValue(0);
        v10.x();
        obtainStyledAttributes.recycle();
    }
}
