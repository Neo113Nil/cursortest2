package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vef {
    public final ArrayList a = new ArrayList();
    public final pqi b;
    public u4a c;
    public u4a d;
    public int e;
    public boolean f;

    public vef(pqi pqiVar, ArrayList arrayList) {
        u4a u4aVar = u4a.e;
        this.c = u4aVar;
        this.d = u4aVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = pqiVar.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            u4a u4aVar2 = pqiVar.c;
            u4a u4aVar3 = pqiVar.d;
            this.c = u4aVar2;
            this.d = u4aVar3;
            c();
            b(pqiVar.e);
        }
        this.b = pqiVar;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d23 d23Var = (d23) list.get(i);
            d23Var.getClass();
            if (true == z) {
                vef vefVar = d23Var.e;
                if (vefVar != null) {
                    throw new IllegalStateException(d23Var + " (" + (i + 1) + "/" + size + ") is already controlled by " + vefVar + " but is still added to " + this);
                }
                d23Var.e = this;
                this.a.add(d23Var);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d23 d23Var = (d23) arrayList.get(size);
            if (!d23Var.g) {
                ColorDrawable colorDrawable = d23Var.f;
                if (d23Var.h != i) {
                    d23Var.h = i;
                    colorDrawable.setColor(i);
                    uef uefVar = d23Var.b;
                    uefVar.e = colorDrawable;
                    k1d k1dVar = uefVar.i;
                    if (k1dVar != null) {
                        ((View) k1dVar.c).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        u4a c;
        ArrayList arrayList = this.a;
        u4a u4aVar = u4a.e;
        u4a u4aVar2 = u4aVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d23 d23Var = (d23) arrayList.get(size);
            u4a u4aVar3 = this.c;
            u4a u4aVar4 = this.d;
            d23Var.c = u4aVar3;
            uef uefVar = d23Var.b;
            d23Var.d = u4aVar4;
            if (!uefVar.c.equals(u4aVar2)) {
                uefVar.c = u4aVar2;
                k1d k1dVar = uefVar.i;
                if (k1dVar != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k1dVar.b;
                    layoutParams.leftMargin = u4aVar2.a;
                    layoutParams.topMargin = u4aVar2.b;
                    layoutParams.rightMargin = u4aVar2.c;
                    layoutParams.bottomMargin = u4aVar2.d;
                    ((View) k1dVar.c).setLayoutParams(layoutParams);
                }
            }
            int i2 = d23Var.a;
            if (i2 == 1) {
                i = d23Var.c.a;
                int i3 = d23Var.d.a;
                if (uefVar.a != i3) {
                    uefVar.a = i3;
                    k1d k1dVar2 = uefVar.i;
                    if (k1dVar2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) k1dVar2.b;
                        layoutParams2.width = i3;
                        ((View) k1dVar2.c).setLayoutParams(layoutParams2);
                    }
                }
                c = u4a.c(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = d23Var.c.b;
                int i4 = d23Var.d.b;
                if (uefVar.b != i4) {
                    uefVar.b = i4;
                    k1d k1dVar3 = uefVar.i;
                    if (k1dVar3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) k1dVar3.b;
                        layoutParams3.height = i4;
                        ((View) k1dVar3.c).setLayoutParams(layoutParams3);
                    }
                }
                c = u4a.c(0, i, 0, 0);
            } else if (i2 == 4) {
                i = d23Var.c.c;
                int i5 = d23Var.d.c;
                if (uefVar.a != i5) {
                    uefVar.a = i5;
                    k1d k1dVar4 = uefVar.i;
                    if (k1dVar4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) k1dVar4.b;
                        layoutParams4.width = i5;
                        ((View) k1dVar4.c).setLayoutParams(layoutParams4);
                    }
                }
                c = u4a.c(0, 0, i, 0);
            } else if (i2 != 8) {
                c = u4aVar;
                i = 0;
            } else {
                i = d23Var.c.d;
                int i6 = d23Var.d.d;
                if (uefVar.b != i6) {
                    uefVar.b = i6;
                    k1d k1dVar5 = uefVar.i;
                    if (k1dVar5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) k1dVar5.b;
                        layoutParams5.height = i6;
                        ((View) k1dVar5.c).setLayoutParams(layoutParams5);
                    }
                }
                c = u4a.c(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (uefVar.d != z) {
                uefVar.d = z;
                k1d k1dVar6 = uefVar.i;
                if (k1dVar6 != null) {
                    ((View) k1dVar6.c).setVisibility(z ? 0 : 8);
                }
            }
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            d23Var.a(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            d23Var.b(f);
            u4aVar2 = u4a.a(u4aVar2, c);
        }
    }
}
