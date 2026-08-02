package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.d23;
import defpackage.k1d;
import defpackage.ljg;
import defpackage.pqi;
import defpackage.t4f;
import defpackage.u4a;
import defpackage.uef;
import defpackage.vef;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object c = new Object();
    public final ArrayList a;
    public vef b;

    public ProtectionLayout(Context context, List list) {
        super(context);
        this.a = new ArrayList();
        setProtections(list);
    }

    private pqi getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof pqi) {
            return (pqi) tag;
        }
        pqi pqiVar = new pqi(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, pqiVar);
        return pqiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[LOOP:0: B:7:0x0028->B:21:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        pqi orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.b = new vef(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.b.a.size();
        for (int i4 = 0; i4 < size; i4++) {
            d23 d23Var = (d23) this.b.a.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            uef uefVar = d23Var.b;
            int i6 = d23Var.a;
            int i7 = -1;
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = uefVar.b;
                    i2 = 48;
                } else if (i6 == 4) {
                    i = uefVar.a;
                    i2 = 5;
                } else if (i6 != 8) {
                    a70.p(ljg.j(i6, "Unexpected side: "));
                    return;
                } else {
                    i3 = uefVar.b;
                    i2 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
                u4a u4aVar = uefVar.c;
                layoutParams.leftMargin = u4aVar.a;
                layoutParams.topMargin = u4aVar.b;
                layoutParams.rightMargin = u4aVar.c;
                layoutParams.bottomMargin = u4aVar.d;
                View view = new View(context);
                view.setTag(c);
                view.setTranslationX(uefVar.f);
                view.setTranslationY(uefVar.g);
                view.setAlpha(uefVar.h);
                view.setVisibility(uefVar.d ? 0 : 8);
                view.setBackground(uefVar.e);
                k1d k1dVar = new k1d(17, layoutParams, view);
                if (uefVar.i == null) {
                    a70.r("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    uefVar.i = k1dVar;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = uefVar.a;
                i2 = 3;
            }
            i7 = i;
            i3 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i3, i2);
            u4a u4aVar2 = uefVar.c;
            layoutParams2.leftMargin = u4aVar2.a;
            layoutParams2.topMargin = u4aVar2.b;
            layoutParams2.rightMargin = u4aVar2.c;
            layoutParams2.bottomMargin = u4aVar2.d;
            View view2 = new View(context);
            view2.setTag(c);
            view2.setTranslationX(uefVar.f);
            view2.setTranslationY(uefVar.g);
            view2.setAlpha(uefVar.h);
            view2.setVisibility(uefVar.d ? 0 : 8);
            view2.setBackground(uefVar.e);
            k1d k1dVar2 = new k1d(17, layoutParams2, view2);
            if (uefVar.i == null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != c) {
            vef vefVar = this.b;
            int childCount = getChildCount() - (vefVar != null ? vefVar.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        vef vefVar;
        if (this.b != null) {
            removeViews(getChildCount() - this.b.a.size(), this.b.a.size());
            int size = this.b.a.size();
            int i = 0;
            while (true) {
                vefVar = this.b;
                if (i >= size) {
                    break;
                }
                ((d23) vefVar.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = vefVar.a;
            if (!vefVar.f) {
                vefVar.f = true;
                vefVar.b.b.remove(vefVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((d23) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof pqi) {
            pqi pqiVar = (pqi) tag;
            if (pqiVar.b.isEmpty()) {
                pqiVar.a.post(new t4f(pqiVar, 15));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<d23> list) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.a = new ArrayList();
    }
}
