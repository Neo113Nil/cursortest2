package com.vk.photo.editor.markup.view.tools.button;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.photo.editor.markup.view.tools.PaintBackgroundView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.fyt0;
import xsna.n8g;
import xsna.wpa0;
import xsna.y8g;

/* compiled from: PipetteButton.kt */
/* loaded from: classes4.dex */
public final class PipetteButton extends FrameLayout {
    public final PaintBackgroundView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public wpa0 f;

    public PipetteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new wpa0.b(false);
        LayoutInflater.from(context).inflate(R.layout.internal_pipette_button, (ViewGroup) this, true);
        this.b = (PaintBackgroundView) findViewById(R.id.color);
        this.e = (ImageView) findViewById(R.id.image_pipette);
        this.c = (ImageView) findViewById(R.id.image_selected_inside_border);
        this.d = (ImageView) findViewById(R.id.image_selected_outside_border);
        b();
        setImportantForAccessibility(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(wpa0 wpa0Var, int i) {
        if (wpa0Var instanceof wpa0.a) {
            if (n8g.e(((wpa0.a) wpa0Var).a.a(), -1) <= 1.5d) {
                return i;
            }
            return -1;
        }
        if (!(wpa0Var instanceof wpa0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((wpa0.b) wpa0Var).a) {
        }
    }

    public final void b() {
        y8g cVar;
        wpa0 wpa0Var = this.f;
        if (wpa0Var instanceof wpa0.a) {
            cVar = ((wpa0.a) wpa0Var).a;
        } else {
            if (!(wpa0Var instanceof wpa0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = ((wpa0.b) wpa0Var).a ? new y8g.c(-1) : new y8g.c(-13882066);
        }
        Paint paint = this.b.getPaint();
        getWidth();
        getHeight();
        if (cVar instanceof y8g.c) {
            paint.setColor(((y8g.c) cVar).a);
        } else {
            if (cVar instanceof y8g.b) {
                throw null;
            }
            paint.setColor(0);
            paint.setShader(null);
        }
        this.e.setColorFilter(new PorterDuffColorFilter(a(this.f, -13882066), PorterDuff.Mode.SRC_ATOP));
        wpa0 wpa0Var2 = this.f;
        boolean p = wpa0Var2.p();
        ImageView imageView = this.d;
        ImageView imageView2 = this.c;
        if (p) {
            imageView2.setVisibility(0);
            fyt0.o(imageView, wpa0Var2 instanceof wpa0.a);
            imageView2.setColorFilter(new PorterDuffColorFilter(a(wpa0Var2, -16777216), PorterDuff.Mode.MULTIPLY));
        } else {
            imageView2.clearColorFilter();
            fyt0.h(imageView2);
            fyt0.h(imageView);
        }
        super.setSelected(this.f.p());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final wpa0 getState() {
        return this.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        wpa0 bVar;
        super.setSelected(z);
        if (this.f.p() == z) {
            return;
        }
        wpa0 wpa0Var = this.f;
        if (wpa0Var instanceof wpa0.a) {
            bVar = new wpa0.a(((wpa0.a) wpa0Var).a, z);
        } else {
            if (!(wpa0Var instanceof wpa0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ((wpa0.b) wpa0Var).getClass();
            bVar = new wpa0.b(z);
        }
        setState(bVar);
    }

    public final void setState(wpa0 wpa0Var) {
        this.f = wpa0Var;
        b();
    }
}
