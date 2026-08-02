package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ozb extends Drawable.ConstantState {
    public vah a;
    public dj5 b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public int q;
    public final Paint.Style r;

    public ozb(ozb ozbVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = ozbVar.a;
        this.b = ozbVar.b;
        this.k = ozbVar.k;
        this.c = ozbVar.c;
        this.d = ozbVar.d;
        this.g = ozbVar.g;
        this.f = ozbVar.f;
        this.l = ozbVar.l;
        this.i = ozbVar.i;
        this.q = ozbVar.q;
        this.o = ozbVar.o;
        this.j = ozbVar.j;
        this.m = ozbVar.m;
        this.n = ozbVar.n;
        this.p = ozbVar.p;
        this.e = ozbVar.e;
        this.r = ozbVar.r;
        if (ozbVar.h != null) {
            this.h = new Rect(ozbVar.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        qzb qzbVar = new qzb(this);
        qzbVar.f = true;
        qzbVar.g = true;
        return qzbVar;
    }

    public ozb(vah vahVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = vahVar;
        this.b = null;
    }
}
