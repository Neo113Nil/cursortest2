package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.k8e0;
import xsna.lhg;
import xsna.qpn0;
import xsna.ux3;

/* loaded from: classes12.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object d = new Object();
    public final ArrayList b;
    public k8e0 c;

    public ProtectionLayout(Context context) {
        super(context);
        this.b = new ArrayList();
    }

    private qpn0 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof qpn0) {
            return (qpn0) tag;
        }
        qpn0 qpn0Var = new qpn0(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, qpn0Var);
        return qpn0Var;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        qpn0 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.c = new k8e0(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.c.a.size() <= 0) {
            return;
        }
        a aVar = this.c.a.get(0);
        getContext();
        aVar.getClass();
        throw new IllegalArgumentException(lhg.a(0, "Unexpected side: "));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != d) {
            k8e0 k8e0Var = this.c;
            int childCount = getChildCount() - (k8e0Var != null ? k8e0Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.c != null) {
            removeViews(getChildCount() - this.c.a.size(), this.c.a.size());
            if (this.c.a.size() > 0) {
                this.c.a.get(0).getClass();
                throw null;
            }
            k8e0 k8e0Var = this.c;
            ArrayList<a> arrayList = k8e0Var.a;
            if (!k8e0Var.f) {
                k8e0Var.f = true;
                k8e0Var.b.b.remove(k8e0Var);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).c = null;
                }
                arrayList.clear();
            }
            this.c = null;
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
        if (tag instanceof qpn0) {
            qpn0 qpn0Var = (qpn0) tag;
            if (qpn0Var.b.isEmpty()) {
                qpn0Var.a.post(new ux3(qpn0Var, 10));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList();
    }
}
