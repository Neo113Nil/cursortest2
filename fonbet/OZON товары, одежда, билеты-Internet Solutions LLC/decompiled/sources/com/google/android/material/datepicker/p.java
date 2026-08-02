package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.C5334o0;
import androidx.core.view.Q0;
import androidx.core.view.Y;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.Q;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.datepicker.C5843a;
import com.google.android.material.internal.CheckableImageButton;
import j.C7232a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n7.C8448a;
import o7.ViewOnTouchListenerC8655a;
import ru.ozon.app.android.R;
import y7.C10856g;

/* loaded from: classes9.dex */
public final class p<S> extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<s<? super S>> f58272a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f58273b = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f58274c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f58275d = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private int f58276e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC5846d<S> f58277f;

    /* renamed from: g, reason: collision with root package name */
    private z<S> f58278g;

    /* renamed from: h, reason: collision with root package name */
    private C5843a f58279h;

    /* renamed from: i, reason: collision with root package name */
    private h<S> f58280i;

    /* renamed from: j, reason: collision with root package name */
    private int f58281j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f58282k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f58283l;

    /* renamed from: m, reason: collision with root package name */
    private int f58284m;

    /* renamed from: n, reason: collision with root package name */
    private int f58285n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f58286o;

    /* renamed from: p, reason: collision with root package name */
    private int f58287p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f58288q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f58289r;

    /* renamed from: s, reason: collision with root package name */
    private CheckableImageButton f58290s;

    /* renamed from: t, reason: collision with root package name */
    private C10856g f58291t;

    /* renamed from: u, reason: collision with root package name */
    private Button f58292u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f58293v;

    final class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p pVar = p.this;
            Iterator it = pVar.f58272a.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                pVar.D();
                sVar.a();
            }
            pVar.dismiss();
        }
    }

    final class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p pVar = p.this;
            Iterator it = pVar.f58273b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            pVar.dismiss();
        }
    }

    final class c extends y<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s11) {
            p pVar = p.this;
            pVar.G();
            pVar.f58292u.setEnabled(pVar.B().D0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC5846d<S> B() {
        if (this.f58277f == null) {
            this.f58277f = (InterfaceC5846d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f58277f;
    }

    private static int C(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        u d11 = u.d();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i11 = d11.f58308d;
        return ((i11 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i11) + (dimensionPixelOffset * 2);
    }

    static boolean E(int i11, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(v7.b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), new int[]{i11});
        boolean z11 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        z<S> zVar;
        requireContext();
        int i11 = this.f58276e;
        if (i11 == 0) {
            i11 = B().Q();
        }
        InterfaceC5846d<S> B11 = B();
        C5843a c5843a = this.f58279h;
        h<S> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable("GRID_SELECTOR_KEY", B11);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c5843a);
        bundle.putParcelable("CURRENT_MONTH_KEY", c5843a.i());
        hVar.setArguments(bundle);
        this.f58280i = hVar;
        if (this.f58290s.isChecked()) {
            InterfaceC5846d<S> B12 = B();
            C5843a c5843a2 = this.f58279h;
            zVar = new t<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i11);
            bundle2.putParcelable("DATE_SELECTOR_KEY", B12);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c5843a2);
            zVar.setArguments(bundle2);
        } else {
            zVar = this.f58280i;
        }
        this.f58278g = zVar;
        G();
        Q p11 = getChildFragmentManager().p();
        p11.r(R.id.mtrl_calendar_frame, this.f58278g, null);
        p11.k();
        this.f58278g.t(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        InterfaceC5846d<S> B11 = B();
        getContext();
        String x12 = B11.x1();
        this.f58289r.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), x12));
        this.f58289r.setText(x12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(@NonNull CheckableImageButton checkableImageButton) {
        this.f58290s.setContentDescription(this.f58290s.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final S D() {
        return B().m();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f58274c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f58276e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f58277f = (InterfaceC5846d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f58279h = (C5843a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f58281j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f58282k = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f58284m = bundle.getInt("INPUT_MODE_KEY");
        this.f58285n = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f58286o = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f58287p = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f58288q = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i11 = this.f58276e;
        if (i11 == 0) {
            i11 = B().Q();
        }
        Dialog dialog = new Dialog(requireContext, i11);
        Context context = dialog.getContext();
        this.f58283l = E(android.R.attr.windowFullscreen, context);
        int b11 = v7.b.b(context, R.attr.colorSurface, p.class.getCanonicalName());
        C10856g c10856g = new C10856g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f58291t = c10856g;
        c10856g.v(context);
        this.f58291t.B(ColorStateList.valueOf(b11));
        this.f58291t.A(Y.k(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f58283l ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f58283l) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(C(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(C(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f58289r = textView;
        int i11 = Y.f42258g;
        textView.setAccessibilityLiveRegion(1);
        this.f58290s = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f58282k;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f58281j);
        }
        this.f58290s.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f58290s;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, C7232a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C7232a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f58290s.setChecked(this.f58284m != 0);
        Y.C(this.f58290s, null);
        H(this.f58290s);
        this.f58290s.setOnClickListener(new r(this));
        this.f58292u = (Button) inflate.findViewById(R.id.confirm_button);
        if (B().D0()) {
            this.f58292u.setEnabled(true);
        } else {
            this.f58292u.setEnabled(false);
        }
        this.f58292u.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.f58286o;
        if (charSequence2 != null) {
            this.f58292u.setText(charSequence2);
        } else {
            int i12 = this.f58285n;
            if (i12 != 0) {
                this.f58292u.setText(i12);
            }
        }
        this.f58292u.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f58288q;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i13 = this.f58287p;
            if (i13 != 0) {
                button.setText(i13);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f58275d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f58276e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f58277f);
        C5843a.b bVar = new C5843a.b(this.f58279h);
        if (this.f58280i.D() != null) {
            bVar.b(this.f58280i.D().f58310f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f58281j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f58282k);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f58285n);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f58286o);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f58287p);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f58288q);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f58283l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f58291t);
            if (!this.f58293v) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i11 = Build.VERSION.SDK_INT;
                boolean z11 = false;
                boolean z12 = valueOf == null || valueOf.intValue() == 0;
                int a11 = C8448a.a(android.R.attr.colorBackground, -16777216, window.getContext());
                if (z12) {
                    valueOf = Integer.valueOf(a11);
                }
                C5334o0.a(window, false);
                window.getContext();
                int f7 = i11 < 27 ? androidx.core.graphics.c.f(C8448a.a(android.R.attr.navigationBarColor, -16777216, window.getContext()), UserVerificationMethods.USER_VERIFY_PATTERN) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(f7);
                boolean z13 = C8448a.c(0) || C8448a.c(valueOf.intValue());
                boolean c11 = C8448a.c(a11);
                if (C8448a.c(f7) || (f7 == 0 && c11)) {
                    z11 = true;
                }
                Q0 q02 = new Q0(window.getDecorView(), window);
                q02.e(z13);
                q02.d(z11);
                Y.J(findViewById, new q(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop()));
                this.f58293v = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f58291t, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC8655a(requireDialog(), rect));
        }
        F();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        this.f58278g.f58326a.clear();
        super.onStop();
    }
}
