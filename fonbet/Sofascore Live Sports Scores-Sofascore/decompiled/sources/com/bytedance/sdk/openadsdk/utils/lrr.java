package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lrr {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ boolean gm;
        View pcc = null;
        final /* synthetic */ ViewGroup sf;

        public pcc(ViewGroup viewGroup, boolean z) {
            this.sf = viewGroup;
            this.gm = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                sf sfVar = (sf) this.sf.getTag(520093765);
                if (this.pcc == null) {
                    ViewGroup viewGroup = this.sf;
                    lrr.sf(viewGroup, sfVar, (Integer) viewGroup.getTag(520093766), this.gm);
                    return;
                }
                Rect rect = new Rect();
                this.pcc.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.sf.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (sfVar != null) {
                        sfVar.pcc(this.sf, false);
                    }
                    this.sf.setTag(520093763, Boolean.FALSE);
                } else {
                    if (sfVar != null) {
                        sfVar.pcc(this.sf, true);
                    }
                    this.sf.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.sf.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc();

        void pcc(View view, boolean z);

        void pcc(boolean z);

        void sf();
    }

    public static void pcc(final ViewGroup viewGroup, boolean z, int i, final boolean z2, sf sfVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, sfVar);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final pcc pccVar = new pcc(viewGroup, z2);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.lrr.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        pcc.this.pcc = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        pcc.this.pcc = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(pccVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.lrr.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        sf sfVar2 = (sf) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        lrr.sf(viewGroup2, sfVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.lrr.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z3) {
                try {
                    sf sfVar2 = (sf) viewGroup.getTag(520093765);
                    if (sfVar2 != null) {
                        sfVar2.pcc(z3);
                        ViewGroup viewGroup2 = viewGroup;
                        lrr.sf(viewGroup2, sfVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    }
                } catch (Exception e) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.lrr.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                sf sfVar2 = (sf) viewGroup.getTag(520093765);
                if (sfVar2 != null) {
                    sfVar2.pcc();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                sf sfVar2 = (sf) viewGroup.getTag(520093765);
                if (sfVar2 != null) {
                    sfVar2.sf();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(View view, sf sfVar, Integer num, boolean z) {
        if (sfVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        sfVar.pcc(view, pcc(view, num.intValue(), z));
    }

    private static boolean pcc(View view, int i, boolean z) {
        return com.bytedance.sdk.openadsdk.core.nn.pcc(view, 20, i, z);
    }

    public static ArrayList<View> pcc(View view, int i) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int indexOfChild = viewGroup.indexOfChild(view) + 1; indexOfChild < viewGroup.getChildCount(); indexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(indexOfChild));
                }
            }
            if (i > 1 && parent != null) {
                arrayList.addAll(pcc((View) parent, i - 1));
            }
        }
        return arrayList;
    }

    public static View pcc(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return pcc((View) parent, cls);
    }
}
