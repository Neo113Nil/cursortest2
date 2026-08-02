package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class it9 {
    public final Context a;
    public ds4 b;
    public Object c;
    public sti d;
    public mt9 e;
    public List f;
    public rwj g;
    public final ef0 h;
    public final LinkedHashMap i;
    public Boolean j;
    public au3 k;
    public au3 l;
    public au3 m;
    public final l3a n;
    public Integer o;
    public Drawable p;
    public Integer q;
    public Drawable r;
    public hkh s;
    public g6b t;
    public hkh u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public it9(ot9 ot9Var, Context context) {
        this.a = context;
        this.b = ot9Var.x;
        this.c = ot9Var.b;
        this.d = ot9Var.c;
        this.e = ot9Var.d;
        gv4 gv4Var = ot9Var.w;
        this.v = gv4Var.g;
        this.f = ot9Var.f;
        this.g = gv4Var.f;
        q89 q89Var = ot9Var.h;
        q89Var.getClass();
        this.h = vha.k(q89Var);
        this.i = tub.q(ot9Var.i.a);
        this.j = gv4Var.h;
        this.w = gv4Var.i;
        this.x = gv4Var.j;
        this.k = gv4Var.c;
        this.l = gv4Var.d;
        this.m = gv4Var.e;
        this.n = new l3a(ot9Var.r);
        this.o = ot9Var.s;
        this.p = ot9Var.t;
        this.q = ot9Var.u;
        this.r = ot9Var.v;
        this.s = gv4Var.a;
        this.y = gv4Var.b;
        if (ot9Var.a == context) {
            this.t = ot9Var.p;
            this.u = ot9Var.q;
            this.z = ot9Var.C;
        } else {
            this.t = null;
            this.u = null;
            this.z = 0;
        }
    }

    public final ot9 a() {
        boolean z;
        au3 au3Var;
        g6b g6bVar;
        Object obj;
        hkh hkhVar;
        ImageView imageView;
        g6b lifecycle;
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = f8h.g;
        }
        Object obj3 = obj2;
        sti stiVar = this.d;
        mt9 mt9Var = this.e;
        ds4 ds4Var = this.b;
        Bitmap.Config config = ds4Var.g;
        int i = this.v;
        if (i == 0) {
            i = ds4Var.f;
        }
        int i2 = i;
        List list = this.f;
        rwj rwjVar = this.g;
        if (rwjVar == null) {
            rwjVar = ds4Var.e;
        }
        rwj rwjVar2 = rwjVar;
        ef0 ef0Var = this.h;
        q89 i3 = ef0Var != null ? vha.i(ef0Var) : null;
        if (i3 == null) {
            i3 = l.c;
        } else {
            Bitmap.Config[] configArr = l.a;
        }
        q89 q89Var = i3;
        LinkedHashMap linkedHashMap = this.i;
        gti gtiVar = linkedHashMap != null ? new gti(oyn.S(linkedHashMap)) : null;
        if (gtiVar == null) {
            gtiVar = gti.b;
        }
        gti gtiVar2 = gtiVar;
        Boolean bool = this.j;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            this.b.getClass();
            z = true;
        }
        this.b.getClass();
        int i4 = this.w;
        if (i4 == 0) {
            i4 = this.b.h;
        }
        int i5 = i4;
        int i6 = this.x;
        if (i6 == 0) {
            i6 = this.b.i;
        }
        int i7 = i6;
        ds4 ds4Var2 = this.b;
        int i8 = ds4Var2.j;
        au3 au3Var2 = ds4Var2.a;
        au3 au3Var3 = this.k;
        if (au3Var3 == null) {
            au3Var3 = ds4Var2.b;
        }
        au3 au3Var4 = au3Var3;
        au3 au3Var5 = this.l;
        if (au3Var5 == null) {
            au3Var5 = ds4Var2.c;
        }
        au3 au3Var6 = au3Var5;
        au3 au3Var7 = this.m;
        if (au3Var7 == null) {
            au3Var7 = ds4Var2.d;
        }
        au3 au3Var8 = au3Var7;
        g6b g6bVar2 = this.t;
        Context context = this.a;
        if (g6bVar2 == null) {
            sti stiVar2 = this.d;
            au3Var = au3Var2;
            Object context2 = stiVar2 instanceof ku9 ? ((ku9) stiVar2).b.getContext() : context;
            while (true) {
                if (context2 instanceof u6b) {
                    lifecycle = ((u6b) context2).getLifecycle();
                    break;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = uz8.b;
            }
            g6bVar2 = lifecycle;
        } else {
            au3Var = au3Var2;
        }
        hkh hkhVar2 = this.s;
        if (hkhVar2 == null && (hkhVar2 = this.u) == null) {
            sti stiVar3 = this.d;
            g6bVar = g6bVar2;
            if (stiVar3 instanceof ku9) {
                ImageView imageView2 = ((ku9) stiVar3).b;
                ImageView.ScaleType scaleType = imageView2.getScaleType();
                obj = obj3;
                hkhVar2 = (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) ? new kpf(jjh.c) : new ppf(imageView2);
            } else {
                obj = obj3;
                hkhVar2 = new i55(context);
            }
        } else {
            g6bVar = g6bVar2;
            obj = obj3;
        }
        int i9 = this.y;
        if (i9 == 0 && (i9 = this.z) == 0) {
            hkh hkhVar3 = this.s;
            ppf ppfVar = hkhVar3 instanceof ppf ? (ppf) hkhVar3 : null;
            if (ppfVar != null) {
                imageView = ppfVar.a;
            } else {
                sti stiVar4 = this.d;
                ku9 ku9Var = stiVar4 instanceof ku9 ? (ku9) stiVar4 : null;
                imageView = ku9Var != null ? ku9Var.b : null;
            }
            int i10 = 2;
            if (imageView != null) {
                Bitmap.Config[] configArr2 = l.a;
                ImageView.ScaleType scaleType2 = imageView.getScaleType();
                int i11 = scaleType2 == null ? -1 : k.a[scaleType2.ordinal()];
                hkhVar = hkhVar2;
                if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                    i10 = 1;
                }
            } else {
                hkhVar = hkhVar2;
            }
            i9 = i10;
        } else {
            hkhVar = hkhVar2;
        }
        l3a l3aVar = this.n;
        u8e u8eVar = l3aVar != null ? new u8e(oyn.S(l3aVar.a)) : null;
        if (u8eVar == null) {
            u8eVar = u8e.b;
        }
        return new ot9(context, obj, stiVar, mt9Var, config, i2, list, rwjVar2, q89Var, gtiVar2, z, false, i5, i7, i8, au3Var, au3Var4, au3Var6, au3Var8, g6bVar, hkhVar, i9, u8eVar, this.o, this.p, this.q, this.r, new gv4(this.s, this.y, this.k, this.l, this.m, this.g, this.v, this.j, this.w, this.x), this.b);
    }

    public final void b() {
        this.t = null;
        this.u = null;
        this.z = 0;
    }

    public it9(Context context) {
        this.a = context;
        this.b = j.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.v = 0;
        this.f = km5.a;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.w = 0;
        this.x = 0;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.y = 0;
        this.t = null;
        this.u = null;
        this.z = 0;
    }
}
