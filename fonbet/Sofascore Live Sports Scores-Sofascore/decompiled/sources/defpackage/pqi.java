package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pqi {
    public final nqi a;
    public final ArrayList b = new ArrayList();
    public u4a c;
    public u4a d;
    public int e;

    public pqi(ViewGroup viewGroup) {
        View view;
        u4a u4aVar = u4a.e;
        this.c = u4aVar;
        this.d = u4aVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        nqi nqiVar = new nqi(this, viewGroup.getContext(), viewGroup);
        this.a = nqiVar;
        nqiVar.setVisibility(8);
        nqiVar.setWillNotDraw(true);
        imf imfVar = new imf(this, 20);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(nqiVar, imfVar);
        d9l.a(nqiVar, new oqi(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView(nqiVar, 0);
        } else {
            view.addOnAttachStateChangeListener(new a16(viewGroup, 6, nqiVar));
        }
    }
}
