package defpackage;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class myh extends o41 {
    public final PointF i;
    public final PointF j;
    public final z78 k;
    public final z78 l;
    public wj9 m;
    public wj9 n;

    public myh(z78 z78Var, z78 z78Var2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = z78Var;
        this.l = z78Var2;
        i(this.d);
    }

    @Override // defpackage.o41
    public final Object e() {
        return l();
    }

    @Override // defpackage.o41
    public final /* bridge */ /* synthetic */ Object f(nja njaVar, float f) {
        return l();
    }

    @Override // defpackage.o41
    public final void i(float f) {
        z78 z78Var = this.k;
        z78Var.i(f);
        z78 z78Var2 = this.l;
        z78Var2.i(f);
        this.i.set(((Float) z78Var.e()).floatValue(), ((Float) z78Var2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((k41) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF l() {
        Float f;
        Float f2 = null;
        if (this.m != null) {
            z78 z78Var = this.k;
            nja i = z78Var.c.i();
            if (i != null) {
                Float f3 = i.h;
                wj9 wj9Var = this.m;
                float f4 = i.g;
                f = (Float) wj9Var.C(f4, f3 == null ? f4 : f3.floatValue(), (Float) i.b, (Float) i.c, z78Var.c(), z78Var.d(), z78Var.d);
                if (this.n != null) {
                    z78 z78Var2 = this.l;
                    nja i2 = z78Var2.c.i();
                    if (i2 != null) {
                        Float f5 = i2.h;
                        wj9 wj9Var2 = this.n;
                        float f6 = i2.g;
                        f2 = (Float) wj9Var2.C(f6, f5 == null ? f6 : f5.floatValue(), (Float) i2.b, (Float) i2.c, z78Var2.c(), z78Var2.d(), z78Var2.d);
                    }
                }
                PointF pointF = this.i;
                PointF pointF2 = this.j;
                if (f != null) {
                    pointF2.set(pointF.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    pointF2.set(f.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (f2 != null) {
                    pointF2.set(pointF2.x, pointF.y);
                    return pointF2;
                }
                pointF2.set(pointF2.x, f2.floatValue());
                return pointF2;
            }
        }
        f = null;
        if (this.n != null) {
        }
        PointF pointF3 = this.i;
        PointF pointF22 = this.j;
        if (f != null) {
        }
        if (f2 != null) {
        }
    }
}
