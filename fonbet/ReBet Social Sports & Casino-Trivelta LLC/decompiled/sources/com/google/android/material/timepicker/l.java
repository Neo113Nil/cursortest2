package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;
import xa.o;
import y0.z;

/* loaded from: classes3.dex */
public class l implements TimePickerView.f, i {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f36475a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeModel f36476b;

    /* renamed from: c, reason: collision with root package name */
    public final TextWatcher f36477c = new a();

    /* renamed from: d, reason: collision with root package name */
    public final TextWatcher f36478d = new b();

    /* renamed from: e, reason: collision with root package name */
    public final ChipTextInputComboView f36479e;

    /* renamed from: f, reason: collision with root package name */
    public final ChipTextInputComboView f36480f;

    /* renamed from: g, reason: collision with root package name */
    public final j f36481g;

    /* renamed from: h, reason: collision with root package name */
    public final EditText f36482h;

    /* renamed from: i, reason: collision with root package name */
    public final EditText f36483i;

    /* renamed from: j, reason: collision with root package name */
    public MaterialButtonToggleGroup f36484j;

    public class a extends xa.k {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    l.this.f36476b.j(0);
                } else {
                    l.this.f36476b.j(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public class b extends xa.k {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    l.this.f36476b.h(0);
                } else {
                    l.this.f36476b.h(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.c(((Integer) view.getTag(ia.g.f48424c0)).intValue());
        }
    }

    public class d extends com.google.android.material.timepicker.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Resources f36488b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TimeModel f36489c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i10, Resources resources, TimeModel timeModel) {
            super(context, i10);
            this.f36488b = resources;
            this.f36489c = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.A0(this.f36488b.getString(ia.k.f48541s) + " " + view.getResources().getString(this.f36489c.c(), String.valueOf(this.f36489c.d())));
        }
    }

    public class e extends com.google.android.material.timepicker.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Resources f36491b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TimeModel f36492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i10, Resources resources, TimeModel timeModel) {
            super(context, i10);
            this.f36491b = resources;
            this.f36492c = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.A0(this.f36491b.getString(ia.k.f48542t) + " " + view.getResources().getString(ia.k.f48536n, String.valueOf(this.f36492c.f36405e)));
        }
    }

    public class f extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Resources f36494a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f36495b;

        public f(Resources resources, int i10) {
            this.f36494a = resources;
            this.f36495b = i10;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setText(this.f36494a.getString(this.f36495b));
        }
    }

    public l(LinearLayout linearLayout, TimeModel timeModel) {
        this.f36475a = linearLayout;
        this.f36476b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(ia.g.f48455u);
        this.f36479e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(ia.g.f48452r);
        this.f36480f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(ia.g.f48454t);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(ia.g.f48454t);
        textView.setText(resources.getString(ia.k.f48542t));
        textView.setImportantForAccessibility(2);
        textView2.setText(resources.getString(ia.k.f48541s));
        textView2.setImportantForAccessibility(2);
        chipTextInputComboView.setTag(ia.g.f48424c0, 12);
        chipTextInputComboView2.setTag(ia.g.f48424c0, 10);
        if (timeModel.f36403c == 0) {
            k();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(timeModel.e());
        chipTextInputComboView.c(timeModel.f());
        EditText editText = chipTextInputComboView2.e().getEditText();
        this.f36482h = editText;
        editText.setAccessibilityDelegate(j(linearLayout.getResources(), ia.k.f48541s));
        EditText editText2 = chipTextInputComboView.e().getEditText();
        this.f36483i = editText2;
        editText2.setAccessibilityDelegate(j(linearLayout.getResources(), ia.k.f48542t));
        this.f36481g = new j(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.f(new d(linearLayout.getContext(), ia.k.f48533k, resources, timeModel));
        chipTextInputComboView.f(new e(linearLayout.getContext(), ia.k.f48535m, resources, timeModel));
        f();
    }

    public static /* synthetic */ void a(l lVar, MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        lVar.getClass();
        if (z10) {
            lVar.f36476b.k(i10 == ia.g.f48449p ? 1 : 0);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i10) {
        this.f36476b.f36406f = i10;
        this.f36479e.setChecked(i10 == 12);
        this.f36480f.setChecked(i10 == 10);
        l();
    }

    public final void d() {
        this.f36482h.addTextChangedListener(this.f36478d);
        this.f36483i.addTextChangedListener(this.f36477c);
    }

    public void e() {
        this.f36479e.setChecked(false);
        this.f36480f.setChecked(false);
    }

    public void f() {
        d();
        i(this.f36476b);
        this.f36481g.a();
    }

    public final void g() {
        this.f36482h.removeTextChangedListener(this.f36478d);
        this.f36483i.removeTextChangedListener(this.f36477c);
    }

    public void h() {
        this.f36479e.setChecked(this.f36476b.f36406f == 12);
        this.f36480f.setChecked(this.f36476b.f36406f == 10);
    }

    @Override // com.google.android.material.timepicker.i
    public void hide() {
        View focusedChild = this.f36475a.getFocusedChild();
        if (focusedChild != null) {
            o.i(focusedChild, false);
        }
        this.f36475a.setVisibility(8);
    }

    public final void i(TimeModel timeModel) {
        g();
        Locale locale = this.f36475a.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(timeModel.f36405e));
        String format2 = String.format(locale, "%02d", Integer.valueOf(timeModel.d()));
        this.f36479e.g(format);
        this.f36480f.g(format2);
        d();
        l();
    }

    @Override // com.google.android.material.timepicker.i
    public void invalidate() {
        i(this.f36476b);
    }

    public final View.AccessibilityDelegate j(Resources resources, int i10) {
        return new f(resources, i10);
    }

    public final void k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f36475a.findViewById(ia.g.f48451q);
        this.f36484j = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.k
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i10, boolean z10) {
                l.a(l.this, materialButtonToggleGroup2, i10, z10);
            }
        });
        this.f36484j.setVisibility(0);
        l();
    }

    public final void l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f36484j;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.r(this.f36476b.f36407g == 0 ? ia.g.f48447o : ia.g.f48449p);
    }

    @Override // com.google.android.material.timepicker.i
    public void show() {
        this.f36475a.setVisibility(0);
        c(this.f36476b.f36406f);
    }
}
