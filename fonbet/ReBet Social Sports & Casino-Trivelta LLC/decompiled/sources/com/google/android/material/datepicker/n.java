package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.J;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.fragment.app.N;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n.AbstractC5596a;
import ta.ViewOnTouchListenerC6453a;

/* loaded from: classes3.dex */
public class n<S> extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: T, reason: collision with root package name */
    public static final Object f35361T = "CONFIRM_BUTTON_TAG";

    /* renamed from: V, reason: collision with root package name */
    public static final Object f35362V = "CANCEL_BUTTON_TAG";

    /* renamed from: W, reason: collision with root package name */
    public static final Object f35363W = "TOGGLE_BUTTON_TAG";

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f35364A;

    /* renamed from: B, reason: collision with root package name */
    public int f35365B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f35366C;

    /* renamed from: D, reason: collision with root package name */
    public int f35367D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f35368E;

    /* renamed from: F, reason: collision with root package name */
    public int f35369F;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f35370G;

    /* renamed from: H, reason: collision with root package name */
    public TextView f35371H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f35372I;

    /* renamed from: J, reason: collision with root package name */
    public CheckableImageButton f35373J;

    /* renamed from: K, reason: collision with root package name */
    public com.google.android.material.shape.i f35374K;

    /* renamed from: L, reason: collision with root package name */
    public Button f35375L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f35376O;

    /* renamed from: P, reason: collision with root package name */
    public CharSequence f35377P;

    /* renamed from: R, reason: collision with root package name */
    public CharSequence f35378R;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f35379m = new LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f35380n = new LinkedHashSet();

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f35381o = new LinkedHashSet();

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f35382p = new LinkedHashSet();

    /* renamed from: q, reason: collision with root package name */
    public int f35383q;

    /* renamed from: r, reason: collision with root package name */
    public DateSelector f35384r;

    /* renamed from: s, reason: collision with root package name */
    public t f35385s;

    /* renamed from: t, reason: collision with root package name */
    public CalendarConstraints f35386t;

    /* renamed from: u, reason: collision with root package name */
    public j f35387u;

    /* renamed from: v, reason: collision with root package name */
    public int f35388v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f35389w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35390x;

    /* renamed from: y, reason: collision with root package name */
    public int f35391y;

    /* renamed from: z, reason: collision with root package name */
    public int f35392z;

    public class a implements J {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35393a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f35394b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35395c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f35396d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f35397e;

        public a(int i10, View view, int i11, int i12, int i13) {
            this.f35393a = i10;
            this.f35394b = view;
            this.f35395c = i11;
            this.f35396d = i12;
            this.f35397e = i13;
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            androidx.core.graphics.e f10 = f02.f(F0.p.g());
            if (this.f35393a >= 0) {
                this.f35394b.getLayoutParams().height = this.f35393a + f10.f19099b;
                View view2 = this.f35394b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f35394b;
            view3.setPadding(this.f35395c + f10.f19098a, this.f35396d + f10.f19099b, this.f35397e + f10.f19100c, view3.getPaddingBottom());
            return f02;
        }
    }

    public class b extends s {
        public b() {
        }

        @Override // com.google.android.material.datepicker.s
        public void a() {
            n.this.f35375L.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.s
        public void b(Object obj) {
            n nVar = n.this;
            nVar.D0(nVar.q0());
            n.this.f35375L.setEnabled(n.this.n0().S());
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final DateSelector f35400a;

        /* renamed from: c, reason: collision with root package name */
        public CalendarConstraints f35402c;

        /* renamed from: b, reason: collision with root package name */
        public int f35401b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f35403d = 0;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f35404e = null;

        /* renamed from: f, reason: collision with root package name */
        public int f35405f = 0;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f35406g = null;

        /* renamed from: h, reason: collision with root package name */
        public int f35407h = 0;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f35408i = null;

        /* renamed from: j, reason: collision with root package name */
        public int f35409j = 0;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f35410k = null;

        /* renamed from: l, reason: collision with root package name */
        public int f35411l = 0;

        /* renamed from: m, reason: collision with root package name */
        public CharSequence f35412m = null;

        /* renamed from: n, reason: collision with root package name */
        public Object f35413n = null;

        /* renamed from: o, reason: collision with root package name */
        public int f35414o = 0;

        public c(DateSelector dateSelector) {
            this.f35400a = dateSelector;
        }

        public static c c() {
            return new c(new SingleDateSelector());
        }

        public static boolean d(Month month, CalendarConstraints calendarConstraints) {
            return month.compareTo(calendarConstraints.l()) >= 0 && month.compareTo(calendarConstraints.h()) <= 0;
        }

        public n a() {
            if (this.f35402c == null) {
                this.f35402c = new CalendarConstraints.b().a();
            }
            if (this.f35403d == 0) {
                this.f35403d = this.f35400a.t();
            }
            Object obj = this.f35413n;
            if (obj != null) {
                this.f35400a.H(obj);
            }
            if (this.f35402c.k() == null) {
                this.f35402c.N(b());
            }
            return n.y0(this);
        }

        public final Month b() {
            if (!this.f35400a.T().isEmpty()) {
                Month c10 = Month.c(((Long) this.f35400a.T().iterator().next()).longValue());
                if (d(c10, this.f35402c)) {
                    return c10;
                }
            }
            Month d10 = Month.d();
            return d(d10, this.f35402c) ? d10 : this.f35402c.l();
        }

        public c e(CalendarConstraints calendarConstraints) {
            this.f35402c = calendarConstraints;
            return this;
        }

        public c f(int i10) {
            this.f35414o = i10;
            return this;
        }

        public c g(CharSequence charSequence) {
            this.f35410k = charSequence;
            this.f35409j = 0;
            return this;
        }

        public c h(CharSequence charSequence) {
            this.f35406g = charSequence;
            this.f35405f = 0;
            return this;
        }

        public c i(Object obj) {
            this.f35413n = obj;
            return this;
        }

        public c j(int i10) {
            this.f35401b = i10;
            return this;
        }

        public c k(CharSequence charSequence) {
            this.f35404e = charSequence;
            this.f35403d = 0;
            return this;
        }
    }

    public static boolean B0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Ca.b.f(context, ia.c.f48205J, j.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public static /* synthetic */ void f0(n nVar, View view) {
        nVar.f35375L.setEnabled(nVar.n0().S());
        nVar.f35373J.toggle();
        nVar.f35391y = nVar.f35391y == 1 ? 0 : 1;
        nVar.F0(nVar.f35373J);
        nVar.C0();
    }

    public static Drawable l0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC5596a.b(context, ia.f.f48384c));
        stateListDrawable.addState(new int[0], AbstractC5596a.b(context, ia.f.f48385d));
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector n0() {
        if (this.f35384r == null) {
            this.f35384r = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f35384r;
    }

    public static CharSequence o0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        return split.length > 1 ? split[0] : charSequence;
    }

    public static int r0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ia.e.f48347i0);
        int i10 = Month.d().f35278d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(ia.e.f48351k0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ia.e.f48357n0));
    }

    public static boolean v0(Context context) {
        return B0(context, R.attr.windowFullscreen);
    }

    public static boolean x0(Context context) {
        return B0(context, ia.c.f48235g0);
    }

    public static n y0(c cVar) {
        n nVar = new n();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", cVar.f35401b);
        bundle.putParcelable("DATE_SELECTOR_KEY", cVar.f35400a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar.f35402c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", cVar.f35403d);
        bundle.putCharSequence("TITLE_TEXT_KEY", cVar.f35404e);
        bundle.putInt("INPUT_MODE_KEY", cVar.f35414o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", cVar.f35405f);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", cVar.f35406g);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", cVar.f35407h);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", cVar.f35408i);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", cVar.f35409j);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", cVar.f35410k);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", cVar.f35411l);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", cVar.f35412m);
        nVar.setArguments(bundle);
        return nVar;
    }

    public void A0(View view) {
        Iterator it = this.f35379m.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(s0());
        }
        dismiss();
    }

    public final void C0() {
        int t02 = t0(requireContext());
        j y02 = j.y0(n0(), t02, this.f35386t, null);
        this.f35387u = y02;
        t tVar = y02;
        if (this.f35391y == 1) {
            tVar = p.f0(n0(), t02, this.f35386t);
        }
        this.f35385s = tVar;
        E0();
        D0(q0());
        N s10 = getChildFragmentManager().s();
        s10.o(ia.g.f48402J, this.f35385s);
        s10.j();
        this.f35385s.d0(new b());
    }

    public void D0(String str) {
        this.f35372I.setContentDescription(p0());
        this.f35372I.setText(str);
    }

    public final void E0() {
        this.f35371H.setText((this.f35391y == 1 && w0()) ? this.f35378R : this.f35377P);
    }

    public final void F0(CheckableImageButton checkableImageButton) {
        this.f35373J.setContentDescription(this.f35391y == 1 ? checkableImageButton.getContext().getString(ia.k.f48515U) : checkableImageButton.getContext().getString(ia.k.f48517W));
    }

    public boolean j0(DialogInterface.OnDismissListener onDismissListener) {
        return this.f35382p.add(onDismissListener);
    }

    public boolean k0(o oVar) {
        return this.f35379m.add(oVar);
    }

    public final void m0(Window window) {
        if (this.f35376O) {
            return;
        }
        View findViewById = requireView().findViewById(ia.g.f48435i);
        xa.c.a(window, true, xa.o.e(findViewById), null);
        int paddingTop = findViewById.getPaddingTop();
        AbstractC2082d0.x0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingLeft(), paddingTop, findViewById.getPaddingRight()));
        this.f35376O = true;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f35381o.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f35383q = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f35384r = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f35386t = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f35388v = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f35389w = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f35391y = bundle.getInt("INPUT_MODE_KEY");
        this.f35392z = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f35364A = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f35365B = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f35366C = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f35367D = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f35368E = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f35369F = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f35370G = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f35389w;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f35388v);
        }
        this.f35377P = charSequence;
        this.f35378R = o0(charSequence);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), t0(requireContext()));
        Context context = dialog.getContext();
        this.f35390x = v0(context);
        this.f35374K = new com.google.android.material.shape.i(context, null, ia.c.f48205J, ia.l.f48554F);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ia.m.MaterialCalendar, ia.c.f48205J, ia.l.f48554F);
        int color = obtainStyledAttributes.getColor(ia.m.f48632E3, 0);
        obtainStyledAttributes.recycle();
        this.f35374K.T(context);
        this.f35374K.f0(ColorStateList.valueOf(color));
        this.f35374K.e0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f35390x ? ia.i.f48466C : ia.i.f48465B, viewGroup);
        Context context = inflate.getContext();
        if (this.f35390x) {
            inflate.findViewById(ia.g.f48402J).setLayoutParams(new LinearLayout.LayoutParams(r0(context), -2));
        } else {
            inflate.findViewById(ia.g.f48403K).setLayoutParams(new LinearLayout.LayoutParams(r0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(ia.g.f48408P);
        this.f35372I = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f35373J = (CheckableImageButton) inflate.findViewById(ia.g.f48409Q);
        this.f35371H = (TextView) inflate.findViewById(ia.g.f48411S);
        u0(context);
        this.f35375L = (Button) inflate.findViewById(ia.g.f48425d);
        if (n0().S()) {
            this.f35375L.setEnabled(true);
        } else {
            this.f35375L.setEnabled(false);
        }
        this.f35375L.setTag(f35361T);
        CharSequence charSequence = this.f35364A;
        if (charSequence != null) {
            this.f35375L.setText(charSequence);
        } else {
            int i10 = this.f35392z;
            if (i10 != 0) {
                this.f35375L.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f35366C;
        if (charSequence2 != null) {
            this.f35375L.setContentDescription(charSequence2);
        } else if (this.f35365B != 0) {
            this.f35375L.setContentDescription(getContext().getResources().getText(this.f35365B));
        }
        this.f35375L.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.this.A0(view);
            }
        });
        Button button = (Button) inflate.findViewById(ia.g.f48419a);
        button.setTag(f35362V);
        CharSequence charSequence3 = this.f35368E;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f35367D;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f35370G;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f35369F != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f35369F));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.this.z0(view);
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f35382p.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f35383q);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f35384r);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f35386t);
        j jVar = this.f35387u;
        Month t02 = jVar == null ? null : jVar.t0();
        if (t02 != null) {
            bVar.c(t02.f35280f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f35388v);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f35389w);
        bundle.putInt("INPUT_MODE_KEY", this.f35391y);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f35392z);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f35364A);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f35365B);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f35366C);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f35367D);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f35368E);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f35369F);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f35370G);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f35390x) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f35374K);
            m0(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(ia.e.f48355m0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f35374K, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC6453a(requireDialog(), rect));
        }
        C0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onStop() {
        this.f35385s.e0();
        super.onStop();
    }

    public final String p0() {
        return n0().x(requireContext());
    }

    public String q0() {
        return n0().F(getContext());
    }

    public final Object s0() {
        return n0().W();
    }

    public final int t0(Context context) {
        int i10 = this.f35383q;
        return i10 != 0 ? i10 : n0().z(context);
    }

    public final void u0(Context context) {
        this.f35373J.setTag(f35363W);
        this.f35373J.setImageDrawable(l0(context));
        this.f35373J.setChecked(this.f35391y != 0);
        AbstractC2082d0.l0(this.f35373J, null);
        F0(this.f35373J);
        this.f35373J.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.f0(n.this, view);
            }
        });
    }

    public final boolean w0() {
        return getResources().getConfiguration().orientation == 2;
    }

    public void z0(View view) {
        Iterator it = this.f35380n.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        dismiss();
    }
}
