package s0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.c1;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22605c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22606a;

    /* renamed from: b, reason: collision with root package name */
    public c f22607b;

    public d(Context context, List list) {
        super(context);
        this.f22606a = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, gVar);
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0 A[LOOP:0: B:4:0x0023->B:18:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i5;
        int i10;
        int i11;
        ArrayList arrayList = this.f22606a;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f22607b = new c(getOrInstallSystemBarStateMonitor(), arrayList);
        int childCount = getChildCount();
        int size = this.f22607b.f22599a.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) this.f22607b.f22599a.get(i12);
            Context context = getContext();
            int i13 = i12 + childCount;
            b bVar = aVar.f22583b;
            int i14 = aVar.f22582a;
            int i15 = -1;
            if (i14 != 1) {
                if (i14 == 2) {
                    i11 = bVar.f22591b;
                    i10 = 48;
                } else if (i14 == 4) {
                    i5 = bVar.f22590a;
                    i10 = 5;
                } else {
                    if (i14 != 8) {
                        throw new IllegalArgumentException(c1.i(i14, "Unexpected side: "));
                    }
                    i11 = bVar.f22591b;
                    i10 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i11, i10);
                g0.d dVar = bVar.f22592c;
                layoutParams.leftMargin = dVar.f9676a;
                layoutParams.topMargin = dVar.f9677b;
                layoutParams.rightMargin = dVar.f9678c;
                layoutParams.bottomMargin = dVar.f9679d;
                View view = new View(context);
                view.setTag(f22605c);
                view.setTranslationX(bVar.f22595f);
                view.setTranslationY(bVar.f22596g);
                view.setAlpha(bVar.f22597h);
                view.setVisibility(bVar.f22593d ? 0 : 4);
                view.setBackground(bVar.f22594e);
                io.sentry.util.network.b bVar2 = new io.sentry.util.network.b(10, layoutParams, view);
                if (bVar.f22598i == null) {
                    throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                }
                bVar.f22598i = bVar2;
                addView(view, i13, layoutParams);
            } else {
                i5 = bVar.f22590a;
                i10 = 3;
            }
            i15 = i5;
            i11 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i15, i11, i10);
            g0.d dVar2 = bVar.f22592c;
            layoutParams2.leftMargin = dVar2.f9676a;
            layoutParams2.topMargin = dVar2.f9677b;
            layoutParams2.rightMargin = dVar2.f9678c;
            layoutParams2.bottomMargin = dVar2.f9679d;
            View view2 = new View(context);
            view2.setTag(f22605c);
            view2.setTranslationX(bVar.f22595f);
            view2.setTranslationY(bVar.f22596g);
            view2.setAlpha(bVar.f22597h);
            view2.setVisibility(bVar.f22593d ? 0 : 4);
            view2.setBackground(bVar.f22594e);
            io.sentry.util.network.b bVar22 = new io.sentry.util.network.b(10, layoutParams2, view2);
            if (bVar.f22598i == null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f22605c) {
            c cVar = this.f22607b;
            int childCount = getChildCount() - (cVar != null ? cVar.f22599a.size() : 0);
            if (i5 > childCount || i5 < 0) {
                i5 = childCount;
            }
        }
        super.addView(view, i5, layoutParams);
    }

    public final void b() {
        if (this.f22607b != null) {
            removeViews(getChildCount() - this.f22607b.f22599a.size(), this.f22607b.f22599a.size());
            int size = this.f22607b.f22599a.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((a) this.f22607b.f22599a.get(i5)).f22583b.f22598i = null;
            }
            c cVar = this.f22607b;
            ArrayList arrayList = cVar.f22599a;
            if (!cVar.f22604f) {
                cVar.f22604f = true;
                cVar.f22600b.f22613b.remove(cVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((a) arrayList.get(size2)).f22586e = null;
                }
                arrayList.clear();
            }
            this.f22607b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22607b != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (gVar.f22613b.isEmpty()) {
                gVar.f22612a.post(new io.sentry.android.core.f(15, gVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.f22606a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
