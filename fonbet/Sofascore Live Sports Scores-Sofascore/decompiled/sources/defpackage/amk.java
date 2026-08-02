package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class amk extends bmk {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public amk(amk amkVar, dh0 dh0Var) {
        ylk ylkVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = amkVar.c;
        this.d = amkVar.d;
        this.e = amkVar.e;
        this.f = amkVar.f;
        this.g = amkVar.g;
        this.h = amkVar.h;
        this.i = amkVar.i;
        String str = amkVar.k;
        this.k = str;
        if (str != null) {
            dh0Var.put(str, this);
        }
        matrix.set(amkVar.j);
        ArrayList arrayList = amkVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof amk) {
                this.b.add(new amk((amk) obj, dh0Var));
            } else {
                if (obj instanceof zlk) {
                    zlk zlkVar = (zlk) obj;
                    zlk zlkVar2 = new zlk(zlkVar);
                    zlkVar2.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    zlkVar2.g = 1.0f;
                    zlkVar2.h = 1.0f;
                    zlkVar2.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    zlkVar2.j = 1.0f;
                    zlkVar2.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    zlkVar2.l = Paint.Cap.BUTT;
                    zlkVar2.m = Paint.Join.MITER;
                    zlkVar2.n = 4.0f;
                    zlkVar2.d = zlkVar.d;
                    zlkVar2.e = zlkVar.e;
                    zlkVar2.g = zlkVar.g;
                    zlkVar2.f = zlkVar.f;
                    zlkVar2.c = zlkVar.c;
                    zlkVar2.h = zlkVar.h;
                    zlkVar2.i = zlkVar.i;
                    zlkVar2.j = zlkVar.j;
                    zlkVar2.k = zlkVar.k;
                    zlkVar2.l = zlkVar.l;
                    zlkVar2.m = zlkVar.m;
                    zlkVar2.n = zlkVar.n;
                    ylkVar = zlkVar2;
                } else {
                    if (!(obj instanceof ylk)) {
                        a70.r("Unknown object in the tree!");
                        throw null;
                    }
                    ylkVar = new ylk((ylk) obj);
                }
                this.b.add(ylkVar);
                Object obj2 = ylkVar.b;
                if (obj2 != null) {
                    dh0Var.put(obj2, ylkVar);
                }
            }
        }
    }

    @Override // defpackage.bmk
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((bmk) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.bmk
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((bmk) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public amk() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = new Matrix();
        this.k = null;
    }
}
