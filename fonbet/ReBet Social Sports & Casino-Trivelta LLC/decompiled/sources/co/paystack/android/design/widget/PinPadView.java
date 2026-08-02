package co.paystack.android.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.k;
import co.paystack.android.design.widget.PinPadButton;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class PinPadView extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public PinPadButton f27918A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f27919B;

    /* renamed from: C, reason: collision with root package name */
    public LinearLayout f27920C;

    /* renamed from: D, reason: collision with root package name */
    public List f27921D;

    /* renamed from: E, reason: collision with root package name */
    public d f27922E;

    /* renamed from: F, reason: collision with root package name */
    public e f27923F;

    /* renamed from: G, reason: collision with root package name */
    public StringBuilder f27924G;

    /* renamed from: H, reason: collision with root package name */
    public int f27925H;

    /* renamed from: I, reason: collision with root package name */
    public int f27926I;

    /* renamed from: J, reason: collision with root package name */
    public int f27927J;

    /* renamed from: K, reason: collision with root package name */
    public AttributeSet f27928K;

    /* renamed from: L, reason: collision with root package name */
    public HashMap f27929L;

    /* renamed from: O, reason: collision with root package name */
    public PinPadButton.a f27930O;

    /* renamed from: P, reason: collision with root package name */
    public PinPadButton.a f27931P;

    /* renamed from: R, reason: collision with root package name */
    public PinPadButton.a f27932R;

    /* renamed from: a, reason: collision with root package name */
    public int f27933a;

    /* renamed from: b, reason: collision with root package name */
    public int f27934b;

    /* renamed from: c, reason: collision with root package name */
    public int f27935c;

    /* renamed from: d, reason: collision with root package name */
    public int f27936d;

    /* renamed from: e, reason: collision with root package name */
    public int f27937e;

    /* renamed from: f, reason: collision with root package name */
    public int f27938f;

    /* renamed from: g, reason: collision with root package name */
    public String f27939g;

    /* renamed from: h, reason: collision with root package name */
    public int f27940h;

    /* renamed from: i, reason: collision with root package name */
    public float f27941i;

    /* renamed from: j, reason: collision with root package name */
    public float f27942j;

    /* renamed from: k, reason: collision with root package name */
    public float f27943k;

    /* renamed from: l, reason: collision with root package name */
    public int f27944l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27945m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27946n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27947o;

    /* renamed from: p, reason: collision with root package name */
    public PinPadButton f27948p;

    /* renamed from: q, reason: collision with root package name */
    public PinPadButton f27949q;

    /* renamed from: r, reason: collision with root package name */
    public PinPadButton f27950r;

    /* renamed from: s, reason: collision with root package name */
    public PinPadButton f27951s;

    /* renamed from: t, reason: collision with root package name */
    public PinPadButton f27952t;

    /* renamed from: u, reason: collision with root package name */
    public PinPadButton f27953u;

    /* renamed from: v, reason: collision with root package name */
    public PinPadButton f27954v;

    /* renamed from: w, reason: collision with root package name */
    public PinPadButton f27955w;

    /* renamed from: x, reason: collision with root package name */
    public PinPadButton f27956x;

    /* renamed from: y, reason: collision with root package name */
    public PinPadButton f27957y;

    /* renamed from: z, reason: collision with root package name */
    public PinPadButton f27958z;

    public class a implements PinPadButton.a {
        public a() {
        }

        @Override // co.paystack.android.design.widget.PinPadButton.a
        public void a(PinPadButton pinPadButton) {
            if (PinPadView.this.f27924G.length() >= PinPadView.this.getPinLength()) {
                PinPadView.this.y();
                return;
            }
            String sb2 = PinPadView.this.f27924G.toString();
            PinPadView.this.f27924G.append(PinPadView.this.j(pinPadButton));
            PinPadView pinPadView = PinPadView.this;
            pinPadView.x(sb2, pinPadView.f27924G.toString());
        }
    }

    public class b implements PinPadButton.a {
        public b() {
        }

        @Override // co.paystack.android.design.widget.PinPadButton.a
        public void a(PinPadButton pinPadButton) {
            if (PinPadView.this.f27924G.length() <= 0) {
                PinPadView.this.y();
                return;
            }
            String sb2 = PinPadView.this.f27924G.toString();
            PinPadView.this.f27924G.replace(PinPadView.this.f27924G.length() - 1, PinPadView.this.f27924G.length(), "");
            PinPadView pinPadView = PinPadView.this;
            pinPadView.x(sb2, pinPadView.f27924G.toString().trim());
        }
    }

    public class c implements PinPadButton.a {
        public c() {
        }

        @Override // co.paystack.android.design.widget.PinPadButton.a
        public void a(PinPadButton pinPadButton) {
            if (PinPadView.this.f27924G.toString().length() == PinPadView.this.f27940h) {
                if (PinPadView.this.f27923F != null) {
                    PinPadView.this.f27923F.a(PinPadView.this.f27924G.toString());
                }
            } else {
                if (PinPadView.this.f27947o) {
                    PinPadView.this.y();
                }
                if (PinPadView.this.f27923F != null) {
                    PinPadView.this.f27923F.b(PinPadView.this.f27924G.toString());
                }
            }
        }
    }

    public interface d {
        void a(String str, String str2);
    }

    public interface e {
        void a(String str);

        void b(String str);
    }

    public PinPadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private AttributeSet getAttrs() {
        return this.f27928K;
    }

    public final void g() {
        this.f27929L = new HashMap();
        int[] iArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (this.f27945m) {
            v(iArr);
        }
        for (int i10 = 0; i10 < 10; i10++) {
            h((PinPadButton) this.f27921D.get(i10), Integer.valueOf(iArr[i10]));
        }
    }

    public boolean getAutoSubmit() {
        return this.f27946n;
    }

    public int getPinLength() {
        return this.f27940h;
    }

    public boolean getPlaceDigitsRandomly() {
        return this.f27945m;
    }

    public int getPromptPadding() {
        return this.f27925H;
    }

    public int getPromptPaddingBottom() {
        return this.f27927J;
    }

    public int getPromptPaddingTop() {
        return this.f27926I;
    }

    public boolean getVibrateOnIncompleteSubmit() {
        return this.f27947o;
    }

    public final void h(PinPadButton pinPadButton, Integer num) {
        this.f27929L.put(pinPadButton, num);
        pinPadButton.e(Integer.toString(num.intValue()));
    }

    public final void i(Context context, AttributeSet attributeSet) {
        int i10;
        int i11;
        this.f27920C.removeAllViews();
        for (int i12 = 0; i12 < this.f27940h; i12++) {
            co.paystack.android.design.widget.a aVar = new co.paystack.android.design.widget.a(context, attributeSet);
            aVar.setChecked(false);
            aVar.h(this.f27935c);
            aVar.f(this.f27934b);
            aVar.g(this.f27933a);
            if (i12 == 0) {
                i11 = this.f27936d;
                i10 = 0;
            } else if (i12 == this.f27940h - 1) {
                i10 = this.f27936d;
                i11 = 0;
            } else {
                i10 = this.f27936d;
                i11 = i10;
            }
            int i13 = this.f27935c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13, i13);
            layoutParams.gravity = 17;
            layoutParams.setMargins(i10, 0, i11, 0);
            aVar.setLayoutParams(layoutParams);
            this.f27920C.addView(aVar);
        }
    }

    public final String j(PinPadButton pinPadButton) {
        return pinPadButton != null ? ((Integer) this.f27929L.get(pinPadButton)).toString() : "";
    }

    public final void k(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        this.f27928K = attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.PinPadView);
        this.f27940h = obtainStyledAttributes.getInteger(f.f28009q, 4);
        this.f27941i = obtainStyledAttributes.getDimension(f.f28000h, 18.0f);
        this.f27942j = obtainStyledAttributes.getDimension(f.f27997e, 12.0f);
        this.f27943k = obtainStyledAttributes.getDimension(f.f28016x, 18.0f);
        this.f27944l = obtainStyledAttributes.getDimensionPixelSize(f.f27999g, 24);
        this.f27935c = obtainStyledAttributes.getDimensionPixelSize(f.f28006n, 24);
        this.f27936d = obtainStyledAttributes.getDimensionPixelSize(f.f28007o, 8);
        this.f27925H = obtainStyledAttributes.getDimensionPixelSize(f.f28012t, getResources().getDimensionPixelSize(co.paystack.android.design.widget.c.f27971a));
        this.f27926I = obtainStyledAttributes.getDimensionPixelSize(f.f28014v, getResources().getDimensionPixelSize(co.paystack.android.design.widget.c.f27973c));
        this.f27927J = obtainStyledAttributes.getDimensionPixelSize(f.f28013u, getResources().getDimensionPixelSize(co.paystack.android.design.widget.c.f27972b));
        this.f27945m = obtainStyledAttributes.getBoolean(f.f28010r, true);
        this.f27946n = obtainStyledAttributes.getBoolean(f.f27996d, true);
        this.f27947o = obtainStyledAttributes.getBoolean(f.f28017y, true);
        this.f27933a = obtainStyledAttributes.getColor(f.f28005m, k.d(getResources(), co.paystack.android.design.widget.b.f27969c, null));
        this.f27934b = obtainStyledAttributes.getColor(f.f28004l, k.d(getResources(), co.paystack.android.design.widget.b.f27968b, null));
        this.f27937e = obtainStyledAttributes.getColor(f.f28003k, k.d(getResources(), co.paystack.android.design.widget.b.f27967a, null));
        this.f27938f = obtainStyledAttributes.getColor(f.f28015w, k.d(getResources(), co.paystack.android.design.widget.b.f27970d, null));
        if (obtainStyledAttributes.hasValue(f.f28011s)) {
            this.f27939g = obtainStyledAttributes.getString(f.f28011s);
        }
        obtainStyledAttributes.recycle();
        View inflate = View.inflate(context, co.paystack.android.design.widget.e.f27992b, this);
        this.f27948p = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27977d);
        this.f27949q = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27978e);
        this.f27950r = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27979f);
        this.f27951s = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27980g);
        this.f27952t = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27981h);
        this.f27953u = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27982i);
        this.f27954v = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27983j);
        this.f27955w = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27984k);
        this.f27956x = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27985l);
        this.f27957y = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27986m);
        this.f27958z = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27987n);
        this.f27918A = (PinPadButton) inflate.findViewById(co.paystack.android.design.widget.d.f27988o);
        this.f27919B = (TextView) inflate.findViewById(co.paystack.android.design.widget.d.f27990q);
        this.f27920C = (LinearLayout) inflate.findViewById(co.paystack.android.design.widget.d.f27989p);
        this.f27921D = Arrays.asList(this.f27948p, this.f27949q, this.f27950r, this.f27951s, this.f27952t, this.f27953u, this.f27954v, this.f27955w, this.f27956x, this.f27957y);
        this.f27924G = new StringBuilder();
        i(context, attributeSet);
        g();
        p(this.f27941i, false);
        l(this.f27942j, false);
        o(this.f27944l, false);
        n(this.f27937e, false);
        t(this.f27938f, false);
        u(this.f27943k, false);
        setPromptText(this.f27939g);
        q(this.f27925H, false);
        s(this.f27926I, false);
        r(this.f27927J, false);
        setPinLength(this.f27940h);
        m();
        w(this.f27924G.toString());
    }

    public final void l(float f10, boolean z10) {
        for (PinPadButton pinPadButton : this.f27921D) {
            if (pinPadButton != null) {
                pinPadButton.b(f10);
            }
        }
        if (z10) {
            requestLayout();
        }
    }

    public final void m() {
        Iterator it = this.f27921D.iterator();
        while (it.hasNext()) {
            ((PinPadButton) it.next()).c(this.f27930O);
        }
        this.f27918A.c(this.f27932R);
        this.f27958z.c(this.f27931P);
    }

    public final void n(int i10, boolean z10) {
        for (PinPadButton pinPadButton : this.f27921D) {
            if (pinPadButton != null) {
                pinPadButton.g(i10);
            }
        }
        this.f27918A.g(i10);
        if (z10) {
            requestLayout();
        }
    }

    public final void o(int i10, boolean z10) {
        this.f27958z.d(i10);
        this.f27918A.d(i10);
        if (z10) {
            requestLayout();
        }
    }

    public final void p(float f10, boolean z10) {
        for (PinPadButton pinPadButton : this.f27921D) {
            if (pinPadButton != null) {
                pinPadButton.f(f10);
            }
        }
        this.f27918A.f(f10);
        if (z10) {
            requestLayout();
        }
    }

    public final void q(int i10, boolean z10) {
        this.f27919B.setPadding(i10, i10, i10, i10);
        if (z10) {
            requestLayout();
        }
    }

    public final void r(int i10, boolean z10) {
        TextView textView = this.f27919B;
        textView.setPadding(textView.getPaddingLeft(), this.f27919B.getPaddingTop(), this.f27919B.getPaddingRight(), i10);
        if (z10) {
            requestLayout();
        }
    }

    public final void s(int i10, boolean z10) {
        TextView textView = this.f27919B;
        textView.setPadding(textView.getPaddingLeft(), i10, this.f27919B.getPaddingRight(), this.f27919B.getPaddingBottom());
        if (z10) {
            requestLayout();
        }
    }

    public void setAlphabetTextSize(float f10) {
        l(f10, true);
    }

    public void setAutoSubmit(boolean z10) {
        this.f27946n = z10;
    }

    public void setButtonTextColor(int i10) {
        n(i10, true);
    }

    public void setImageButtonSize(int i10) {
        o(i10, true);
    }

    public void setNumericTextSize(float f10) {
        p(f10, true);
    }

    public void setOnPinChangedListener(d dVar) {
        this.f27922E = dVar;
    }

    public void setOnSubmitListener(e eVar) {
        this.f27923F = eVar;
    }

    public void setPinLength(int i10) {
        if (i10 < 0) {
            return;
        }
        this.f27940h = i10;
        i(getContext(), getAttrs());
        w(this.f27924G.toString());
        requestLayout();
    }

    public void setPlaceDigitsRandomly(boolean z10) {
        this.f27945m = z10;
        g();
    }

    public void setPromptPadding(int i10) {
        this.f27925H = i10;
        q(i10, true);
    }

    public void setPromptPaddingBottom(int i10) {
        this.f27927J = i10;
        r(i10, true);
    }

    public void setPromptPaddingTop(int i10) {
        this.f27926I = i10;
        s(i10, true);
    }

    public void setPromptText(String str) {
        this.f27939g = str;
        this.f27919B.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        this.f27919B.setText(this.f27939g);
        requestLayout();
    }

    public void setPromptTextColor(int i10) {
        t(i10, true);
    }

    public void setPromptTextSize(float f10) {
        u(f10, true);
    }

    public void setVibrateOnIncompleteSubmit(boolean z10) {
        this.f27947o = z10;
    }

    public final void t(int i10, boolean z10) {
        this.f27919B.setTextColor(i10);
        if (z10) {
            requestLayout();
        }
    }

    public final void u(float f10, boolean z10) {
        this.f27919B.setTextSize(0, f10);
        if (z10) {
            requestLayout();
        }
    }

    public final void v(int[] iArr) {
        Random random = new Random();
        for (int length = iArr.length - 1; length > 0; length--) {
            int nextInt = random.nextInt(length + 1);
            int i10 = iArr[nextInt];
            iArr[nextInt] = iArr[length];
            iArr[length] = i10;
        }
    }

    public final void w(String str) {
        if (str.length() <= this.f27920C.getChildCount()) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                ((co.paystack.android.design.widget.a) this.f27920C.getChildAt(i10)).setChecked(true);
            }
            for (int length = str.length(); length < this.f27920C.getChildCount(); length++) {
                ((co.paystack.android.design.widget.a) this.f27920C.getChildAt(length)).setChecked(false);
            }
        }
        requestLayout();
    }

    public final void x(String str, String str2) {
        e eVar;
        w(str2);
        d dVar = this.f27922E;
        if (dVar != null) {
            dVar.a(str, str2);
        }
        if (this.f27946n && this.f27940h == this.f27924G.length() && (eVar = this.f27923F) != null) {
            eVar.a(str2);
        }
    }

    public void y() {
        ((Vibrator) getContext().getSystemService("vibrator")).vibrate(300L);
    }

    public PinPadView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27933a = -1;
        this.f27934b = -1;
        this.f27937e = -1;
        this.f27938f = -1;
        this.f27940h = 4;
        this.f27945m = true;
        this.f27946n = true;
        this.f27947o = true;
        this.f27929L = new HashMap();
        this.f27930O = new a();
        this.f27931P = new b();
        this.f27932R = new c();
        k(context, attributeSet);
    }
}
