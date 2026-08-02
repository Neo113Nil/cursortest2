package com.vk.community.design.compose.topbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.vk.movika.tools.controls.seekbar.i;
import xsna.izs;
import xsna.rpo0;
import xsna.s3q0;
import xsna.wh50;
import xsna.wzs;
import xsna.zak0;

/* compiled from: PassthroughThemedComposeView.kt */
/* loaded from: classes17.dex */
public final class PassthroughThemedComposeView extends rpo0 {
    public static final /* synthetic */ int o = 0;
    public final wh50<wzs<a, Integer, s3q0>> m;
    public izs<? super MotionEvent, Boolean> n;

    public PassthroughThemedComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(null);
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        a M = aVar.M(1516204507);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(1516204507, i2, -1, "com.vk.community.design.compose.topbar.PassthroughThemedComposeView.ThemedContent (PassthroughThemedComposeView.kt:23)");
            }
            wzs wzsVar = (wzs) ((zak0) this.m).getValue();
            if (wzsVar == null) {
                M.K(-922514306);
            } else {
                M.K(1078620131);
                wzsVar.invoke(M, 0);
            }
            M.j();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new i(this, i, 12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        izs<? super MotionEvent, Boolean> izsVar = this.n;
        if (izsVar == null || !izsVar.invoke(motionEvent).booleanValue()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final izs<MotionEvent, Boolean> getShouldHandleTouchByComposeView() {
        return this.n;
    }

    public final void setContent(wzs<? super a, ? super Integer, s3q0> wzsVar) {
        ((zak0) this.m).setValue(wzsVar);
    }

    public final void setShouldHandleTouchByComposeView(izs<? super MotionEvent, Boolean> izsVar) {
        this.n = izsVar;
    }
}
