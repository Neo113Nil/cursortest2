package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.b01;
import defpackage.ql3;
import defpackage.vjf;
import defpackage.wm3;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class Barrier extends ql3 {
    public int h;
    public b01 i;

    public Barrier(Context context) {
        super(context);
        this.a = new int[32];
        this.g = new HashMap();
        this.c = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.i.u0;
    }

    public int getMargin() {
        return this.i.v0;
    }

    public int getType() {
        return this.h;
    }

    @Override // defpackage.ql3
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.i = new b01();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vjf.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.i.u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.i.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.i;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000c, code lost:
    
        if (r4 == 6) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        if (r4 == 6) goto L5;
     */
    @Override // defpackage.ql3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(wm3 wm3Var, boolean z) {
        int i = this.h;
        if (z) {
            if (i != 5) {
            }
            i = 1;
        } else {
            if (i != 5) {
            }
            i = 0;
        }
        if (wm3Var instanceof b01) {
            ((b01) wm3Var).t0 = i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.i.u0 = z;
    }

    public void setDpMargin(int i) {
        this.i.v0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.i.v0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
