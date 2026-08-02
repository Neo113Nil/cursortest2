package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d extends DialogInterfaceOnCancelListenerC2163m implements TimePickerView.d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f36424A;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f36426C;

    /* renamed from: D, reason: collision with root package name */
    public MaterialButton f36427D;

    /* renamed from: E, reason: collision with root package name */
    public Button f36428E;

    /* renamed from: G, reason: collision with root package name */
    public TimeModel f36430G;

    /* renamed from: q, reason: collision with root package name */
    public TimePickerView f36436q;

    /* renamed from: r, reason: collision with root package name */
    public ViewStub f36437r;

    /* renamed from: s, reason: collision with root package name */
    public h f36438s;

    /* renamed from: t, reason: collision with root package name */
    public l f36439t;

    /* renamed from: u, reason: collision with root package name */
    public i f36440u;

    /* renamed from: v, reason: collision with root package name */
    public int f36441v;

    /* renamed from: w, reason: collision with root package name */
    public int f36442w;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f36444y;

    /* renamed from: m, reason: collision with root package name */
    public final Set f36432m = new LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public final Set f36433n = new LinkedHashSet();

    /* renamed from: o, reason: collision with root package name */
    public final Set f36434o = new LinkedHashSet();

    /* renamed from: p, reason: collision with root package name */
    public final Set f36435p = new LinkedHashSet();

    /* renamed from: x, reason: collision with root package name */
    public int f36443x = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f36445z = 0;

    /* renamed from: B, reason: collision with root package name */
    public int f36425B = 0;

    /* renamed from: F, reason: collision with root package name */
    public int f36429F = 0;

    /* renamed from: H, reason: collision with root package name */
    public int f36431H = 0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = d.this.f36432m.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            d.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = d.this.f36433n.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            d.this.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            dVar.f36429F = dVar.f36429F == 0 ? 1 : 0;
            d dVar2 = d.this;
            dVar2.y0(dVar2.f36427D);
        }
    }

    /* renamed from: com.google.android.material.timepicker.d$d, reason: collision with other inner class name */
    public static final class C0505d {

        /* renamed from: b, reason: collision with root package name */
        public Integer f36450b;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f36452d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f36454f;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f36456h;

        /* renamed from: a, reason: collision with root package name */
        public TimeModel f36449a = new TimeModel();

        /* renamed from: c, reason: collision with root package name */
        public int f36451c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f36453e = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f36455g = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f36457i = 0;

        public d j() {
            return d.v0(this);
        }

        public C0505d k(int i10) {
            this.f36449a.i(i10);
            return this;
        }

        public C0505d l(int i10) {
            this.f36450b = Integer.valueOf(i10);
            return this;
        }

        public C0505d m(int i10) {
            this.f36449a.j(i10);
            return this;
        }

        public C0505d n(CharSequence charSequence) {
            this.f36456h = charSequence;
            return this;
        }

        public C0505d o(CharSequence charSequence) {
            this.f36454f = charSequence;
            return this;
        }

        public C0505d p(int i10) {
            TimeModel timeModel = this.f36449a;
            int i11 = timeModel.f36404d;
            int i12 = timeModel.f36405e;
            TimeModel timeModel2 = new TimeModel(i10);
            this.f36449a = timeModel2;
            timeModel2.j(i12);
            this.f36449a.i(i11);
            return this;
        }

        public C0505d q(CharSequence charSequence) {
            this.f36452d = charSequence;
            return this;
        }
    }

    public static /* synthetic */ void f0(d dVar) {
        i iVar = dVar.f36440u;
        if (iVar instanceof l) {
            ((l) iVar).h();
        }
    }

    public static d v0(C0505d c0505d) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", c0505d.f36449a);
        if (c0505d.f36450b != null) {
            bundle.putInt("TIME_PICKER_INPUT_MODE", c0505d.f36450b.intValue());
        }
        bundle.putInt("TIME_PICKER_TITLE_RES", c0505d.f36451c);
        if (c0505d.f36452d != null) {
            bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", c0505d.f36452d);
        }
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", c0505d.f36453e);
        if (c0505d.f36454f != null) {
            bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", c0505d.f36454f);
        }
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", c0505d.f36455g);
        if (c0505d.f36456h != null) {
            bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", c0505d.f36456h);
        }
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", c0505d.f36457i);
        dVar.setArguments(bundle);
        return dVar;
    }

    public boolean o0(DialogInterface.OnDismissListener onDismissListener) {
        return this.f36435p.add(onDismissListener);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f36434o.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        w0(bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), t0());
        Context context = dialog.getContext();
        com.google.android.material.shape.i iVar = new com.google.android.material.shape.i(context, null, ia.c.f48211P, ia.l.f48558J);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ia.m.MaterialTimePicker, ia.c.f48211P, ia.l.f48558J);
        this.f36442w = obtainStyledAttributes.getResourceId(ia.m.f48593A4, 0);
        this.f36441v = obtainStyledAttributes.getResourceId(ia.m.f48603B4, 0);
        int color = obtainStyledAttributes.getColor(ia.m.f49095z4, 0);
        obtainStyledAttributes.recycle();
        iVar.T(context);
        iVar.f0(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(iVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        iVar.e0(window.getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(ia.i.f48485r, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(ia.g.f48393A);
        this.f36436q = timePickerView;
        timePickerView.J(this);
        this.f36437r = (ViewStub) viewGroup2.findViewById(ia.g.f48457w);
        this.f36427D = (MaterialButton) viewGroup2.findViewById(ia.g.f48459y);
        TextView textView = (TextView) viewGroup2.findViewById(ia.g.f48437j);
        int i10 = this.f36443x;
        if (i10 != 0) {
            textView.setText(i10);
        } else if (!TextUtils.isEmpty(this.f36444y)) {
            textView.setText(this.f36444y);
        }
        y0(this.f36427D);
        Button button = (Button) viewGroup2.findViewById(ia.g.f48460z);
        button.setOnClickListener(new a());
        int i11 = this.f36445z;
        if (i11 != 0) {
            button.setText(i11);
        } else if (!TextUtils.isEmpty(this.f36424A)) {
            button.setText(this.f36424A);
        }
        Button button2 = (Button) viewGroup2.findViewById(ia.g.f48458x);
        this.f36428E = button2;
        button2.setOnClickListener(new b());
        int i12 = this.f36425B;
        if (i12 != 0) {
            this.f36428E.setText(i12);
        } else if (!TextUtils.isEmpty(this.f36426C)) {
            this.f36428E.setText(this.f36426C);
        }
        x0();
        this.f36427D.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f36440u = null;
        this.f36438s = null;
        this.f36439t = null;
        TimePickerView timePickerView = this.f36436q;
        if (timePickerView != null) {
            timePickerView.J(null);
            this.f36436q = null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f36435p.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f36430G);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f36429F);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f36443x);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f36444y);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f36445z);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f36424A);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f36425B);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f36426C);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f36431H);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f36440u instanceof l) {
            view.postDelayed(new Runnable() { // from class: com.google.android.material.timepicker.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.f0(d.this);
                }
            }, 100L);
        }
    }

    public boolean p0(View.OnClickListener onClickListener) {
        return this.f36432m.add(onClickListener);
    }

    public final Pair q0(int i10) {
        if (i10 == 0) {
            return new Pair(Integer.valueOf(this.f36441v), Integer.valueOf(ia.k.f48543u));
        }
        if (i10 == 1) {
            return new Pair(Integer.valueOf(this.f36442w), Integer.valueOf(ia.k.f48540r));
        }
        throw new IllegalArgumentException("no icon for mode: " + i10);
    }

    public int r0() {
        return this.f36430G.f36404d % 24;
    }

    public int s0() {
        return this.f36430G.f36405e;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        x0();
    }

    public final int t0() {
        int i10 = this.f36431H;
        if (i10 != 0) {
            return i10;
        }
        TypedValue a10 = Ca.b.a(requireContext(), ia.c.f48212Q);
        if (a10 == null) {
            return 0;
        }
        return a10.data;
    }

    public final i u0(int i10, TimePickerView timePickerView, ViewStub viewStub) {
        if (i10 != 0) {
            if (this.f36439t == null) {
                this.f36439t = new l((LinearLayout) viewStub.inflate(), this.f36430G);
            }
            this.f36439t.e();
            return this.f36439t;
        }
        h hVar = this.f36438s;
        if (hVar == null) {
            hVar = new h(timePickerView, this.f36430G);
        }
        this.f36438s = hVar;
        return hVar;
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    public void w() {
        this.f36429F = 1;
        y0(this.f36427D);
        this.f36439t.h();
    }

    public final void w0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f36430G = timeModel;
        if (timeModel == null) {
            this.f36430G = new TimeModel();
        }
        this.f36429F = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f36430G.f36403c != 1 ? 0 : 1);
        this.f36443x = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f36444y = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f36445z = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f36424A = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f36425B = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f36426C = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f36431H = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    public final void x0() {
        Button button = this.f36428E;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    public final void y0(MaterialButton materialButton) {
        if (materialButton == null || this.f36436q == null || this.f36437r == null) {
            return;
        }
        i iVar = this.f36440u;
        if (iVar != null) {
            iVar.hide();
        }
        i u02 = u0(this.f36429F, this.f36436q, this.f36437r);
        this.f36440u = u02;
        u02.show();
        this.f36440u.invalidate();
        Pair q02 = q0(this.f36429F);
        materialButton.setIconResource(((Integer) q02.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) q02.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }
}
