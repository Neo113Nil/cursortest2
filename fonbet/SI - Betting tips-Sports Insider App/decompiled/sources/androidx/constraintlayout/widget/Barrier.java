package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f1051h;

    /* renamed from: i, reason: collision with root package name */
    public int f1052i;
    public x.a j;

    public Barrier(Context context) {
        super(context);
        this.f1061a = new int[32];
        this.f1067g = new HashMap();
        this.f1063c = context;
        g(null);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        x.a aVar = new x.a();
        aVar.f25265s0 = 0;
        aVar.f25266t0 = true;
        aVar.f25267u0 = 0;
        aVar.f25268v0 = false;
        this.j = aVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f1216b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.j.f25266t0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.j.f25267u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1064d = this.j;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.j.f25266t0;
    }

    public int getMargin() {
        return this.j.f25267u0;
    }

    public int getType() {
        return this.f1051h;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void h(x.d dVar, boolean z5) {
        int i5 = this.f1051h;
        this.f1052i = i5;
        if (z5) {
            if (i5 == 5) {
                this.f1052i = 1;
            } else if (i5 == 6) {
                this.f1052i = 0;
            }
        } else if (i5 == 5) {
            this.f1052i = 0;
        } else if (i5 == 6) {
            this.f1052i = 1;
        }
        if (dVar instanceof x.a) {
            ((x.a) dVar).f25265s0 = this.f1052i;
        }
    }

    public void setAllowsGoneWidget(boolean z5) {
        this.j.f25266t0 = z5;
    }

    public void setDpMargin(int i5) {
        this.j.f25267u0 = (int) ((i5 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i5) {
        this.j.f25267u0 = i5;
    }

    public void setType(int i5) {
        this.f1051h = i5;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
