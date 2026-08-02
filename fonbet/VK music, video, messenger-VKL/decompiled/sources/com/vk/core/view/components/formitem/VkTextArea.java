package com.vk.core.view.components.formitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.dq;
import xsna.e3m;
import xsna.ei50;
import xsna.epx;
import xsna.f4m;
import xsna.fha0;
import xsna.fxp;
import xsna.gko;
import xsna.gpo0;
import xsna.gzs;
import xsna.hbh0;
import xsna.ho8;
import xsna.izs;
import xsna.jir0;
import xsna.jo60;
import xsna.oa01;
import xsna.q01;
import xsna.q1p;
import xsna.q80;
import xsna.qf10;
import xsna.rcs0;
import xsna.s3q0;
import xsna.shy;
import xsna.tlo0;
import xsna.too0;
import xsna.uv80;
import xsna.vev0;
import xsna.x7g;
import xsna.z3m;

/* compiled from: VkTextArea.kt */
/* loaded from: classes17.dex */
public final class VkTextArea extends LinearLayout implements too0, fxp, jir0, ei50, q80 {
    public static final /* synthetic */ int r = 0;
    public b b;
    public d c;
    public a d;
    public c e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final EditText i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public z3m p;
    public gzs<s3q0> q;

    /* compiled from: VkTextArea.kt */
    public interface a {

        /* compiled from: VkTextArea.kt */
        /* renamed from: com.vk.core.view.components.formitem.VkTextArea$a$a, reason: collision with other inner class name */
        public static final class C0838a implements a {
            public final gko a;
            public final izs<View, s3q0> b;
            public final x7g c;
            public final String d;

            public C0838a(gko gkoVar, izs izsVar, x7g x7gVar, String str) {
                this.a = gkoVar;
                this.b = izsVar;
                this.c = x7gVar;
                this.d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0838a)) {
                    return false;
                }
                C0838a c0838a = (C0838a) obj;
                return this.a.equals(c0838a.a) && this.b.equals(c0838a.b) && this.c.equals(c0838a.c) && epx.f(this.d, c0838a.d);
            }

            public final int hashCode() {
                int a = shy.a(this.c.a, dq.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31);
                String str = this.d;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(icon=");
                sb.append(this.a);
                sb.append(", onClick=");
                sb.append(this.b);
                sb.append(", iconTint=");
                sb.append(this.c);
                sb.append(", iconDescription=");
                return ho8.a(sb, this.d, ')');
            }
        }
    }

    /* compiled from: VkTextArea.kt */
    public interface b {

        /* compiled from: VkTextArea.kt */
        public static final class a implements b {
            public final gko a;

            public a(gko gkoVar) {
                this.a = gkoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return Integer.hashCode(this.a.a) * 961;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", iconTint=null, iconDescription=null)";
            }
        }
    }

    /* compiled from: VkTextArea.kt */
    public static final class c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Clear(onClick=null)";
        }
    }

    /* compiled from: VkTextArea.kt */
    public static final class d {
        public final tlo0.h a;
        public final tlo0 b;

        public d(int i, tlo0.h hVar, tlo0.h hVar2) {
            hVar2 = (i & 2) != 0 ? null : hVar2;
            this.a = hVar;
            this.b = hVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            tlo0 tlo0Var = this.b;
            return Integer.hashCode(8) + shy.a(1, (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "Middle(text=" + this.a + ", placeholder=" + this.b + ", minLines=1, maxLines=8)";
        }
    }

    public VkTextArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void c(ImageView imageView, int i) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        f4m.t(i, imageView);
        f4m.q(i, imageView);
        imageView.setLayoutParams(layoutParams);
    }

    private final int[] getActiveState() {
        return (int[]) this.o.getValue();
    }

    private final int[] getErrorState() {
        return (int[]) this.m.getValue();
    }

    private final int[] getValidState() {
        return (int[]) this.n.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        Context context = getContext();
        getContext();
        setBackground(context.getDrawable(R.drawable.ds_internal_form_item_input_bg));
        b();
    }

    @Override // xsna.q80
    public final boolean a() {
        return false;
    }

    public final void b() {
        int d2 = gpo0.d(R.attr.vk_ui_text_primary, this);
        EditText editText = this.i;
        editText.setTextColor(d2);
        editText.setHintTextColor(gpo0.d(R.attr.vk_ui_text_secondary, this));
        getContext();
        q1p.a(editText, gpo0.d(R.attr.vk_ui_stroke_accent, this));
    }

    public final a getAfter() {
        return this.d;
    }

    public final b getBefore() {
        return this.b;
    }

    public final c getClear() {
        return this.e;
    }

    public final EditText getEditText() {
        return this.i;
    }

    public final d getMiddle() {
        return this.c;
    }

    public final String getText() {
        return this.i.getText().toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (this.f) {
            View.mergeDrawableStates(onCreateDrawableState, getErrorState());
        }
        if (this.g) {
            View.mergeDrawableStates(onCreateDrawableState, getValidState());
        }
        if (this.h) {
            View.mergeDrawableStates(onCreateDrawableState, getActiveState());
        }
        return onCreateDrawableState;
    }

    public void setActive(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        refreshDrawableState();
    }

    public final void setAfter(a aVar) {
        this.d = aVar;
        boolean z = aVar != null;
        ImageView imageView = this.k;
        f4m.E(imageView, z);
        a aVar2 = this.d;
        if (aVar2 != null) {
            if (!(aVar2 instanceof a.C0838a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.C0838a c0838a = (a.C0838a) aVar2;
            imageView.setVisibility(0);
            imageView.setImageDrawable(gko.b(c0838a.a.a, imageView.getContext()));
            gpo0.g(imageView, c0838a.c);
            imageView.setContentDescription(c0838a.d);
            izs<View, s3q0> izsVar = c0838a.b;
            imageView.setClickable(true);
            imageView.setBackground(imageView.isClickable() ? e3m.e(R.attr.selectableItemBackgroundBorderless, imageView.getContext()) : null);
            imageView.setOnClickListener(new q01(izsVar, 16));
        }
    }

    public final void setBefore(b bVar) {
        this.b = bVar;
        boolean z = bVar != null;
        ImageView imageView = this.j;
        f4m.E(imageView, z);
        b bVar2 = this.b;
        if (bVar2 != null) {
            if (!(bVar2 instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setVisibility(0);
            imageView.setImageDrawable(gko.b(((b.a) bVar2).a.a, imageView.getContext()));
            imageView.getContext();
            gpo0.f(imageView, Integer.valueOf(R.attr.vk_ui_icon_accent));
            imageView.setContentDescription(null);
        }
    }

    public final void setClear(c cVar) {
        this.e = cVar;
        boolean z = cVar != null;
        ImageView imageView = this.l;
        f4m.E(imageView, z);
        c cVar2 = this.e;
        if (cVar2 != null) {
            imageView.setOnClickListener(new qf10(1, cVar2, this));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.l.setEnabled(z);
        this.k.setEnabled(z);
        this.j.setEnabled(z);
        this.i.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    @Override // xsna.fxp
    public void setError(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        refreshDrawableState();
    }

    public final void setMiddle(d dVar) {
        this.c = dVar;
        if (dVar != null) {
            CharSequence a2 = tlo0.b.a(dVar.a, getContext());
            EditText editText = this.i;
            editText.setText(a2);
            tlo0 tlo0Var = dVar.b;
            editText.setHint(tlo0Var != null ? tlo0Var.a(getContext()) : null);
            editText.setMinLines(1);
            editText.setMaxLines(8);
        }
    }

    @Override // xsna.q80
    public void setOnActiveStateChangeListener(gzs<s3q0> gzsVar) {
        this.q = gzsVar;
    }

    @Override // xsna.ei50
    public void setOnContentChangedListener(gzs<s3q0> gzsVar) {
        z3m z3mVar = this.p;
        EditText editText = this.i;
        editText.removeTextChangedListener(z3mVar);
        this.p = oa01.a(editText, new fha0(2, gzsVar));
    }

    public final void setText(String str) {
        this.i.setText(str);
    }

    @Override // xsna.jir0
    public void setValid(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        refreshDrawableState();
    }

    @Override // xsna.ei50
    public final boolean y0() {
        Editable text = this.i.getText();
        return !(text == null || text.length() == 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkTextArea(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.m = new bpn0(new jo60(26));
        this.n = new bpn0(new uv80(19));
        this.o = new bpn0(new rcs0(8));
        LayoutInflater.from(context).inflate(R.layout.ds_internal_text_area, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(R.id.edit_text);
        this.i = editText;
        ImageView imageView = (ImageView) findViewById(R.id.before_icon);
        this.j = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.after_icon);
        this.k = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.clear_icon);
        this.l = imageView3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.H, 0, 0);
        String string = obtainStyledAttributes.getString(0);
        String string2 = obtainStyledAttributes.getString(3);
        int integer = obtainStyledAttributes.getInteger(2, 1);
        int integer2 = obtainStyledAttributes.getInteger(1, 8);
        editText.setText(string);
        editText.setHint(string2);
        editText.setMinLines(integer);
        editText.setMaxLines(integer2);
        editText.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text_normal, context));
        editText.setIncludeFontPadding(false);
        editText.setMinimumHeight(hbh0.b(44, context));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.cqv0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i2 = VkTextArea.r;
                VkTextArea vkTextArea = VkTextArea.this;
                vkTextArea.setActive(z);
                gzs<s3q0> gzsVar = vkTextArea.q;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
            }
        });
        getContext();
        int i2 = (int) vev0.h;
        f4m.B(i2, i2, editText);
        c(imageView3, i2);
        c(imageView2, i2);
        c(imageView, i2);
        getContext();
        int i3 = (int) vev0.i;
        f4m.l(i3, i3, this);
        Context context2 = getContext();
        getContext();
        setBackground(context2.getDrawable(R.drawable.ds_internal_form_item_input_bg));
        b();
        obtainStyledAttributes.recycle();
    }
}
