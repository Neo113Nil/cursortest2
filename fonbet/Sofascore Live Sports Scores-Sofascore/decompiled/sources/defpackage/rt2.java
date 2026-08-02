package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rt2 extends aj6 {
    public final /* synthetic */ Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt2(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // defpackage.aj6
    public final int n(float f, float f2) {
        RectF closeIconTouchBounds;
        Rect rect = Chip.w;
        Chip chip = this.q;
        if (!chip.d()) {
            return 0;
        }
        closeIconTouchBounds = chip.getCloseIconTouchBounds();
        return closeIconTouchBounds.contains(f, f2) ? 1 : 0;
    }

    @Override // defpackage.aj6
    public final void o(ArrayList arrayList) {
        st2 st2Var;
        arrayList.add(0);
        Rect rect = Chip.w;
        Chip chip = this.q;
        if (!chip.d() || (st2Var = chip.e) == null || !st2Var.U || chip.h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // defpackage.aj6
    public final boolean r(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.s) {
                    chip.r.w(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.aj6
    public final void s(da daVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
        Chip chip = this.q;
        st2 st2Var = chip.e;
        accessibilityNodeInfo.setCheckable(st2Var != null && st2Var.a0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        daVar.k(chip.getAccessibilityClassName());
        daVar.s(chip.getText());
    }

    @Override // defpackage.aj6
    public final void t(int i, da daVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            daVar.i(Chip.w);
            return;
        }
        Chip chip = this.q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        daVar.i(closeIconTouchBoundsInt);
        daVar.b(x9.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        daVar.k(Button.class.getName());
    }

    @Override // defpackage.aj6
    public final void u(int i, boolean z) {
        Chip chip = this.q;
        if (i == 1) {
            chip.m = z;
        }
        st2 st2Var = chip.e;
        boolean z2 = chip.m;
        boolean z3 = false;
        if (st2Var.V != null) {
            z3 = st2Var.d0(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : st2.P0);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }
}
