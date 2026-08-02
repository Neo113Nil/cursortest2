package defpackage;

import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dvk implements View.OnAttachStateChangeListener {
    public final ImageView a;
    public bka b;
    public g9i c;
    public bvk d;
    public boolean e;

    public dvk(ImageView imageView) {
        this.a = imageView;
    }

    public final synchronized void a() {
        try {
            g9i g9iVar = this.c;
            rq3 rq3Var = null;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            c09 c09Var = c09.a;
            hs4 hs4Var = z45.a;
            this.c = xw3.L(c09Var, rob.a.f, null, new hje(this, rq3Var, 14), 2);
            this.b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized bka b() {
        bka bkaVar = this.b;
        if (bkaVar != null && Intrinsics.c(Looper.myLooper(), Looper.getMainLooper()) && this.e) {
            this.e = false;
            return bkaVar;
        }
        g9i g9iVar = this.c;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.c = null;
        bka bkaVar2 = new bka(this.a, 26);
        this.b = bkaVar2;
        return bkaVar2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bvk bvkVar = this.d;
        if (bvkVar == null) {
            return;
        }
        this.e = true;
        bvkVar.a.a(bvkVar.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bvk bvkVar = this.d;
        if (bvkVar != null) {
            g6b g6bVar = bvkVar.d;
            bvkVar.e.e(null);
            ku9 ku9Var = bvkVar.c;
            if (ku9Var != null) {
                g6bVar.d(ku9Var);
            }
            g6bVar.d(bvkVar);
        }
    }
}
