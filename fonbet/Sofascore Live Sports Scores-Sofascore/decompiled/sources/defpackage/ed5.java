package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ed5 extends rn5 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final cd5 i;
    public final jr2 j;
    public final dd5 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [dd5] */
    public ed5(qn5 qn5Var) {
        super(qn5Var);
        this.i = new cd5(this, 0);
        this.j = new jr2(this, 3);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: dd5
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                ed5 ed5Var = ed5.this;
                AutoCompleteTextView autoCompleteTextView = ed5Var.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                ed5Var.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = x2a.M(qn5Var.getContext(), R.attr.motionDurationShort3, 67);
        this.e = x2a.M(qn5Var.getContext(), R.attr.motionDurationShort3, 50);
        this.g = yfa.E(qn5Var.getContext(), R.attr.motionEasingLinearInterpolator, e80.a);
    }

    @Override // defpackage.rn5
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && fcp.l0(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new wb3(this, 17));
    }

    @Override // defpackage.rn5
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.rn5
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.rn5
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.rn5
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.rn5
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.rn5
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.rn5
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.rn5
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            cp4.h("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new f6(this, 3));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: bd5
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                ed5 ed5Var = ed5.this;
                ed5Var.m = true;
                ed5Var.o = SystemClock.uptimeMillis();
                ed5Var.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.rn5
    public final void m(da daVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
        if (!fcp.l0(this.h)) {
            daVar.k(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // defpackage.rn5
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || fcp.l0(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.rn5
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i = 10;
        ofFloat.addUpdateListener(new s2(this, i));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new s2(this, i));
        this.q = ofFloat2;
        ofFloat2.addListener(new eb(this, 4));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.rn5
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
