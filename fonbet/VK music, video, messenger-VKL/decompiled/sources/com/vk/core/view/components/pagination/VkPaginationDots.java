package com.vk.core.view.components.pagination;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i;
import androidx.compose.runtime.k;
import com.vk.core.view.components.pagination.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.epx;
import xsna.f870;
import xsna.oav0;
import xsna.rg50;
import xsna.rpo0;
import xsna.wak0;
import xsna.wd90;
import xsna.wh50;
import xsna.xa2;
import xsna.zak0;

/* compiled from: VkPaginationDots.kt */
/* loaded from: classes17.dex */
public final class VkPaginationDots extends rpo0 {
    public static final /* synthetic */ int r = 0;
    public final wh50 m;
    public final rg50 n;
    public final rg50 o;
    public final rg50 p;
    public final rg50 q;

    public VkPaginationDots(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        wd90 bVar;
        androidx.compose.runtime.a M = aVar.M(-432323224);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-432323224, i2, -1, "com.vk.core.view.components.pagination.VkPaginationDots.ThemedContent (VkPaginationDots.kt:40)");
            }
            a mode = getMode();
            if (epx.f(mode, a.C0850a.a)) {
                bVar = wd90.a.a;
            } else {
                if (!(mode instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new wd90.b(((a.b) getMode()).a);
            }
            oav0.b(bVar, getDotsCount(), getCurrentDotIndex(), null, f870.c(e3m.f(getDotsColor(), getContext())), null, null, getMaxVisibleDots(), M, 0, 104);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new xa2(this, i, 13);
        }
    }

    public final int getCurrentDotIndex() {
        return this.p.getIntValue();
    }

    public final int getDotsColor() {
        return this.o.getIntValue();
    }

    public final int getDotsCount() {
        return this.n.getIntValue();
    }

    public final int getMaxVisibleDots() {
        return this.q.getIntValue();
    }

    public final a getMode() {
        return (a) ((zak0) this.m).getValue();
    }

    public final void setCurrentDotIndex(int i) {
        ((wak0) this.p).C(i);
    }

    public final void setDotsColor(int i) {
        ((wak0) this.o).C(i);
    }

    public final void setDotsCount(int i) {
        ((wak0) this.n).C(i);
    }

    public final void setMaxVisibleDots(int i) {
        ((wak0) this.q).C(i);
    }

    public final void setMode(a aVar) {
        ((zak0) this.m).setValue(aVar);
    }

    public VkPaginationDots(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.m = k.b(a.C0850a.a);
        this.n = i.a(5);
        this.o = i.a(R.attr.vk_ui_icon_secondary);
        this.p = i.a(0);
        this.q = i.a(7);
    }
}
