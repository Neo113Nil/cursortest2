package com.vk.core.view.components.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.picture.b;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.aar0;
import xsna.an10;
import xsna.c1o0;
import xsna.ear0;
import xsna.epx;
import xsna.far0;
import xsna.g5g;
import xsna.hbh0;
import xsna.hdu0;
import xsna.j9r0;
import xsna.l9r0;
import xsna.o9r0;
import xsna.s3q0;
import xsna.u9r0;
import xsna.vep;
import xsna.w9r0;
import xsna.zdt;
import xsna.zjt;

/* compiled from: VkAvatar.kt */
/* loaded from: classes17.dex */
public class VkAvatar extends b {
    public final far0 q;
    public hdu0 r;
    public boolean s;

    public VkAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static s3q0 O0(VkAvatar vkAvatar, Canvas canvas) {
        super.onDraw(canvas);
        vkAvatar.L0(canvas);
        j9r0 j9r0Var = vkAvatar.q.f;
        if (j9r0Var != null) {
            canvas.drawPath((Path) j9r0Var.b.a, vkAvatar.getInnerBorderPaint());
        }
        return s3q0.a;
    }

    public final void Q0(VkAvatarBadge vkAvatarBadge) {
        far0 far0Var = this.q;
        far0Var.h.add(vkAvatarBadge);
        far0Var.a.invalidate();
    }

    public final void S0() {
        far0 far0Var = this.q;
        far0Var.h.clear();
        far0Var.a.invalidate();
    }

    public final void T0(String str) {
        far0 far0Var = this.q;
        g5g.D(far0Var.h, true, new zdt(str, 1));
        far0Var.a.invalidate();
    }

    public final boolean U0(String str) {
        ArrayList arrayList = this.q.h;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (epx.f(((VkAvatarBadge) it.next()).getTag(), str)) {
                return true;
            }
        }
        return false;
    }

    public final void W0(hdu0 hdu0Var, boolean z) {
        far0 far0Var = this.q;
        far0Var.b = o9r0.a(far0Var.b, false, null, null, null, null, null, null, null, z, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        this.s = true;
        this.r = hdu0Var;
        requestLayout();
    }

    public final ear0 getDelegate$foundation_release() {
        return this.q;
    }

    @Override // com.vk.core.view.components.picture.b
    public int getOverlayIconSize() {
        aar0 aar0Var = this.q.i;
        Context context = getContext();
        float f = aar0Var.a;
        return hbh0.b(f < 32.0f ? 16 : f < 44.0f ? 20 : f < 56.0f ? 24 : f < 96.0f ? 28 : 32, context);
    }

    @Override // com.vk.core.view.components.picture.b
    public int getPlaceholderIconSize() {
        aar0 aar0Var = this.q.i;
        Context context = getContext();
        float f = aar0Var.a;
        return hbh0.b(f < 24.0f ? 12 : f < 32.0f ? 16 : f < 36.0f ? 20 : f < 48.0f ? 24 : f < 64.0f ? 28 : f < 72.0f ? 32 : 36, context);
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.q.e(canvas, new c1o0(8, this, canvas));
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        far0 far0Var = this.q;
        far0Var.i = new aar0(an10.b(hbh0.c(r14.getContext(), r0)), far0Var.a.getMeasuredWidth());
        hdu0 hdu0Var = this.r;
        if (!this.s) {
            o9r0 o9r0Var = far0Var.b;
            getMeasuredWidth();
            getContext();
            far0Var.b = o9r0.a(o9r0Var, false, null, null, null, null, null, null, null, true, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        }
        if (hdu0Var == null) {
            vep.a.a(this);
        } else {
            hdu0Var.a(this);
        }
        zjt<?> zjtVar = far0Var.a;
        u9r0 u9r0Var = far0Var.e;
        if (u9r0Var == null) {
            return;
        }
        l9r0 l9r0Var = u9r0Var.b;
        if (!l9r0Var.i) {
            zjtVar.setPadding(0, 0, 0, 0);
        } else {
            int i3 = (int) l9r0Var.d;
            zjtVar.setPadding(i3, i3, i3, i3);
        }
    }

    public final void setAvatarCutout(w9r0 w9r0Var) {
        this.q.c = w9r0Var;
    }

    public final void setBorder(hdu0 hdu0Var) {
        this.r = hdu0Var;
        this.s = false;
        requestLayout();
    }

    public /* synthetic */ VkAvatar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public VkAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.q = new far0(this, null);
    }
}
