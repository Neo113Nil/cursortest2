package com.vk.avatar.api;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.imageloader.view.VKImageView;
import kotlin.LazyThreadSafetyMode;
import xsna.awt0;
import xsna.car0;
import xsna.cq5;
import xsna.dar0;
import xsna.ear0;
import xsna.epx;
import xsna.far0;
import xsna.h84;
import xsna.i700;
import xsna.j800;
import xsna.j9r0;
import xsna.k800;
import xsna.k9r0;
import xsna.kr5;
import xsna.lrb0;
import xsna.msy;
import xsna.o9r0;
import xsna.ozl;
import xsna.q700;
import xsna.qvm0;
import xsna.r800;
import xsna.s3q0;
import xsna.t800;
import xsna.tdq;
import xsna.u9r0;
import xsna.udy;
import xsna.vxl0;
import xsna.w9r0;
import xsna.z800;
import xsna.zjt;

/* compiled from: VKAvatarView.kt */
@ozl
/* loaded from: classes15.dex */
public class VKAvatarView extends VKImageView {
    public static final /* synthetic */ int r = 0;
    public final far0 m;
    public k800 n;
    public float o;
    public final lrb0 p;
    public final Object q;

    public VKAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static void T0(VKAvatarView vKAvatarView, i700 i700Var, k9r0 k9r0Var) {
        if (!vKAvatarView.getSafeUpdate()) {
            if (vKAvatarView.getWidth() > 0) {
                vKAvatarView.W0(i700Var, k9r0Var.b, k9r0Var.c);
                return;
            } else {
                awt0.s(vKAvatarView, new h84(vKAvatarView, i700Var, k9r0Var, 4));
                return;
            }
        }
        if (!vKAvatarView.isLaidOut() || vKAvatarView.isLayoutRequested()) {
            vKAvatarView.addOnLayoutChangeListener(new dar0(vKAvatarView, i700Var, k9r0Var));
        } else {
            vKAvatarView.W0(i700Var, null, k9r0Var.c);
        }
    }

    public static s3q0 U0(VKAvatarView vKAvatarView, Canvas canvas) {
        super.onDraw(canvas);
        return s3q0.a;
    }

    public static void Z0(VKAvatarView vKAvatarView, String str, Drawable drawable, AvatarBorderType avatarBorderType, cq5 cq5Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        if ((i & 4) != 0) {
            avatarBorderType = AvatarBorderType.CIRCLE;
        }
        if ((i & 8) != 0) {
            cq5Var = cq5.b.a;
        }
        far0 far0Var = vKAvatarView.m;
        zjt<?> zjtVar = far0Var.a;
        ear0.d(far0Var, avatarBorderType, cq5Var, 4);
        if (drawable != null) {
            zjtVar.setPlaceholderImage(drawable);
        }
        zjtVar.load(str);
    }

    public static /* synthetic */ void c1(VKAvatarView vKAvatarView, AvatarBorderType avatarBorderType, cq5 cq5Var, int i) {
        if ((i & 2) != 0) {
            cq5Var = cq5.b.a;
        }
        vKAvatarView.a1(avatarBorderType, cq5Var, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getSafeUpdate() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    @Override // xsna.zjt
    public final void H0(int i, int i2) {
        super.H0(i, i2);
        this.m.g();
    }

    public final void W0(i700 i700Var, Integer num, int i) {
        k800 k800Var = this.n;
        if (k800Var != null) {
            k800Var.stop();
        }
        this.n = null;
        k800 k800Var2 = new k800();
        k800Var2.s(i700Var);
        if (num != null) {
            k800Var2.a(new udy("**"), t800.I, new j800(new car0(num.intValue())));
        }
        far0 far0Var = this.m;
        u9r0 u9r0Var = far0Var.e;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float b = u9r0Var != null ? tdq.b(u9r0Var) : 0.0f;
        u9r0 u9r0Var2 = far0Var.e;
        if (u9r0Var2 != null) {
            f = u9r0Var2.b.g;
            if (epx.f(u9r0Var2.d, cq5.m.a)) {
                f /= 2.0f;
            }
        }
        int i2 = (int) (((f / 2.0f) + b) * 2.0f);
        this.o = (getWidth() - i2) / 2.0f;
        k800Var2.setBounds(0, 0, i2, i2);
        lrb0 lrb0Var = this.p;
        z800 z800Var = k800Var2.c;
        z800Var.addUpdateListener(lrb0Var);
        z800Var.setRepeatCount(i);
        if (!getSafeUpdate()) {
            k800Var2.p();
        } else if (isAttachedToWindow()) {
            k800Var2.p();
        }
        this.n = k800Var2;
    }

    public void X0() {
        getHierarchy().q(0);
    }

    public final void Y0(kr5 kr5Var) {
        far0 far0Var = this.m;
        zjt<?> zjtVar = far0Var.a;
        ear0.d(far0Var, kr5Var.a, kr5Var.b, 4);
        Drawable drawable = kr5Var.c;
        if (drawable != null) {
            zjtVar.setPlaceholderImage(drawable);
        }
        zjtVar.load(kr5Var.b(far0Var.i.b));
    }

    public final void a1(AvatarBorderType avatarBorderType, cq5 cq5Var, final k9r0 k9r0Var) {
        if (k9r0Var != null) {
            q700.b(getContext(), k9r0Var.a).b(new r800() { // from class: xsna.bar0
                @Override // xsna.r800
                public final void onResult(Object obj) {
                    k9r0 k9r0Var2 = k9r0Var;
                    VKAvatarView.T0(VKAvatarView.this, (i700) obj, k9r0Var2);
                }
            });
        }
        if (k9r0Var == null) {
            k800 k800Var = this.n;
            if (k800Var != null) {
                k800Var.stop();
            }
            this.n = null;
        }
        ear0.d(this.m, avatarBorderType, cq5Var, 4);
    }

    public void c(kr5 kr5Var) {
        Y0(kr5Var);
    }

    public final o9r0 getAvatarBorderConfigParamsOverride() {
        return this.m.b;
    }

    public final w9r0 getAvatarCutout() {
        return this.m.c;
    }

    public final j9r0 getBorder() {
        return this.m.f;
    }

    public final u9r0 getConfig() {
        return this.m.e;
    }

    @Override // xsna.zjt
    public final void load(String str) {
        far0 far0Var = this.m;
        if (far0Var.e == null) {
            ear0.d(far0Var, AvatarBorderType.CIRCLE, null, 6);
        }
        o0(str, null);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k800 k800Var = this.n;
        if (k800Var != null) {
            k800Var.r();
        }
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k800 k800Var = this.n;
        if (k800Var != null) {
            k800Var.o();
        }
    }

    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.m.e(canvas, new qvm0(3, this, canvas));
        k800 k800Var = this.n;
        if (k800Var != null) {
            canvas.save();
            float f = this.o;
            canvas.translate(f, f);
            k800Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.m.g();
    }

    public final void setAvatarBorderConfigParamsOverride(o9r0 o9r0Var) {
        this.m.b = o9r0Var;
    }

    public final void setAvatarCutout(w9r0 w9r0Var) {
        this.m.c = w9r0Var;
    }

    @Override // xsna.zjt, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.m.getClass();
        super.setImageDrawable(drawable);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.m.g();
    }

    @Override // xsna.zjt
    public void setPlaceholderImage(Drawable drawable) {
        this.m.getClass();
        super.setPlaceholderImage(drawable);
        s3q0 s3q0Var = s3q0.a;
    }

    public final void setPostprocessingEnabled(boolean z) {
        this.m.getClass();
    }

    public VKAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new far0(this, attributeSet);
        this.p = new lrb0(this, 6);
        this.q = msy.a(LazyThreadSafetyMode.NONE, new vxl0(3));
        X0();
    }

    public /* synthetic */ VKAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
