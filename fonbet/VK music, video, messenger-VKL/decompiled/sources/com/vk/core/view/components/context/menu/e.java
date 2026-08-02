package com.vk.core.view.components.context.menu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a9m;
import xsna.am;
import xsna.av20;
import xsna.c5g;
import xsna.d1x;
import xsna.d8t0;
import xsna.drr;
import xsna.e3m;
import xsna.e43;
import xsna.f4m;
import xsna.fnj;
import xsna.fpj;
import xsna.gpu0;
import xsna.gu9;
import xsna.gzs;
import xsna.ify;
import xsna.iut0;
import xsna.qvv0;
import xsna.s3q0;
import xsna.x9;
import xsna.zh0;

/* compiled from: VkUiContextMenu.kt */
/* loaded from: classes17.dex */
public final class e extends VkContextMenu {
    public gzs<s3q0> p;
    public gzs<s3q0> q;

    /* compiled from: VkUiContextMenu.kt */
    public static abstract class a extends VkContextMenu.d {
        public int v;

        public a(View view, Rect rect, View view2, int i, int i2) {
            super((i2 & 1) != 0 ? null : view, (i2 & 2) != 0 ? null : rect, (i2 & 4) != 0 ? null : view2, i);
            this.v = R.layout.ds_internal_context_menu_item;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
        @Override // com.vk.core.view.components.context.menu.VkContextMenu.f
        public final VkContextMenu a() {
            RecyclerView.Adapter adapter;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                adapter = this.l;
            } else {
                d8t0 d8t0Var = new d8t0(ref$ObjectRef, 8);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.vk.core.view.components.context.menu.b) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((com.vk.core.view.components.context.menu.b) it2.next()).a);
                }
                av20.a aVar = new av20.a();
                aVar.d(n(), e3m.b(this.e));
                aVar.d = new com.vk.core.view.components.context.menu.c(this, arrayList3);
                aVar.e = new d(d8t0Var);
                aVar.f = arrayList3;
                adapter = aVar.b();
            }
            RecyclerView.Adapter adapter2 = adapter;
            VkContextMenu.b bVar = new VkContextMenu.b(this.s, this.m, this.n, this.r, this.t, this.u);
            Context context = this.e;
            gpu0 gpu0Var = this.o;
            drr drrVar = this.p;
            ?? eVar = new e(context, adapter2, gpu0Var, this.a, this.c, bVar, this.q, this.b, drrVar, VkContextMenu.OverlayContentPosition.Above);
            ref$ObjectRef.element = eVar;
            return eVar;
        }

        public int n() {
            return this.v;
        }
    }

    /* compiled from: VkUiContextMenu.kt */
    public static final class b extends a {
        public int w;

        @Override // com.vk.core.view.components.context.menu.e.a
        public final int n() {
            return this.w;
        }
    }

    /* compiled from: VkUiContextMenu.kt */
    public static final class c extends a {
    }

    @Override // com.vk.core.view.components.context.menu.VkContextMenu
    public final d1x a() {
        return gu9.a(this.a);
    }

    @Override // com.vk.core.view.components.context.menu.VkContextMenu
    public final void b() {
        fpj fpjVar;
        if (c() && (fpjVar = this.o) != null) {
            fpjVar.dismiss();
        }
    }

    @Override // com.vk.core.view.components.context.menu.VkContextMenu
    public final void e(gzs<s3q0> gzsVar) {
        this.q = gzsVar;
    }

    @Override // com.vk.core.view.components.context.menu.VkContextMenu
    public final void f(gzs<s3q0> gzsVar) {
        this.p = gzsVar;
    }

    @Override // com.vk.core.view.components.context.menu.VkContextMenu
    public final VkContextMenu g() {
        l(this.f.b, false, false);
        return this;
    }

    @Override // com.vk.core.view.components.context.menu.VkContextMenu
    public final VkContextMenu h(boolean z) {
        l(this.f.b, z, false);
        return this;
    }

    @Override // com.vk.core.view.components.context.menu.VkContextMenu
    public final VkContextMenu i(boolean z) {
        l(this.f.b, z, true);
        return this;
    }

    @Override // com.vk.core.view.components.context.menu.VkContextMenu
    public final VkContextMenu j(boolean z) {
        int height;
        int i = this.f.b;
        View view = this.d;
        if (view != null) {
            height = view.getHeight();
        } else {
            Rect rect = this.h;
            height = rect != null ? rect.height() : 0;
        }
        l(height + i, z, false);
        return this;
    }

    public final void l(int i, boolean z, boolean z2) {
        Context context;
        boolean z3;
        Rect rect;
        int width;
        int i2;
        int i3;
        View view;
        View rootView;
        int height;
        View rootView2;
        if (c()) {
            return;
        }
        View view2 = this.e;
        View view3 = this.d;
        View view4 = view3 == null ? view2 : view3;
        Context context2 = this.a;
        if (view4 == null || (context = view4.getContext()) == null) {
            context = context2;
        }
        int i4 = 1;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                z3 = true;
                boolean z4 = view4 == null && view4.getWindowToken() == null;
                if (!z3 || z4) {
                }
                gzs<s3q0> gzsVar = this.p;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context2).inflate(R.layout.popup_dialog_actions, (ViewGroup) null);
                View findViewById = viewGroup.findViewById(R.id.actions);
                RecyclerView recyclerView = (RecyclerView) findViewById;
                recyclerView.setBackground(a());
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setLayoutAnimation(null);
                recyclerView.setItemAnimator(null);
                RecyclerView.Adapter<RecyclerView.e0> adapter = this.b;
                recyclerView.setAdapter(adapter);
                RecyclerView.n nVar = this.c;
                if (nVar != null) {
                    recyclerView.addItemDecoration(nVar);
                }
                k(i, 0, recyclerView);
                this.m = findViewById;
                this.n = findViewById;
                View findViewById2 = viewGroup.findViewById(R.id.actionsBackground);
                findViewById2.setBackground(null);
                findViewById2.setOnClickListener(new zh0(this, 10));
                iut0.o(findViewById2, am.a.e, context2.getString(R.string.vk_ui_accessibility_close), null);
                this.l = findViewById2;
                View.OnAttachStateChangeListener onAttachStateChangeListener = this.i;
                if (onAttachStateChangeListener != null) {
                    viewGroup.addOnAttachStateChangeListener(onAttachStateChangeListener);
                }
                if (view4 == null) {
                    throw new IllegalStateException("No anchor view provided");
                }
                View view5 = this.l;
                if (view5 == null) {
                    view5 = null;
                }
                View view6 = this.n;
                if (view6 == null) {
                    view6 = null;
                }
                fpj fpjVar = new fpj(viewGroup, view4, view5, view6);
                fpjVar.setClippingEnabled(false);
                fpjVar.setOnDismissListener(new a9m(this, i4));
                VkContextMenu.b bVar = this.f;
                int i5 = bVar.c;
                int i6 = bVar.d;
                Rect rect2 = this.h;
                boolean z5 = this.g;
                if (view3 != null) {
                    rect = z5 ? f4m.e(view3) : f4m.c(view3);
                } else {
                    if (rect2 == null) {
                        throw new IllegalStateException("No anchor rect provided");
                    }
                    rect = rect2;
                }
                if (view3 != null) {
                    width = view3.getMeasuredWidth();
                } else {
                    if (rect2 == null) {
                        throw new IllegalStateException("No anchor provided");
                    }
                    width = rect2.width();
                }
                View view7 = this.n;
                if (view7 == null) {
                    view7 = null;
                }
                int measuredWidth = view7.getMeasuredWidth();
                View view8 = this.n;
                if (view8 == null) {
                    view8 = null;
                }
                int measuredHeight = view8.getMeasuredHeight();
                Context context3 = e43.a;
                if (context3 == null) {
                    context3 = null;
                }
                int i7 = context3.getResources().getDisplayMetrics().heightPixels;
                Context context4 = e43.a;
                if (context4 == null) {
                    context4 = null;
                }
                int i8 = context4.getResources().getDisplayMetrics().widthPixels;
                boolean c2 = fnj.c(context2);
                if (!c2) {
                    if (c2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (view3 != null && (rootView2 = view3.getRootView()) != null) {
                        height = (z5 ? f4m.e(rootView2) : f4m.c(rootView2)).height();
                    } else {
                        if (view2 == null || (rootView = view2.getRootView()) == null) {
                            throw new IllegalStateException("No root view provided");
                        }
                        height = rootView.getHeight();
                    }
                    i7 = height;
                }
                Context context5 = e43.a;
                if (context5 == null) {
                    context5 = null;
                }
                int i9 = context5.getResources().getDisplayMetrics().widthPixels;
                int b2 = z ? measuredWidth > width ? rect.left - ((measuredWidth - width) / 2) : x9.b(width, measuredWidth, 2, rect.left) : (rect.exactCenterX() <= ((float) (i9 / 2)) || width >= i9) ? rect.left - i6 : (rect.right - measuredWidth) + i6;
                View view9 = this.m;
                if (view9 == null) {
                    view9 = null;
                }
                int paddingLeft = view9.getPaddingLeft() + b2;
                int i10 = measuredWidth + b2;
                View view10 = this.m;
                if (view10 == null) {
                    view10 = null;
                }
                int paddingRight = i10 - view10.getPaddingRight();
                int i11 = paddingLeft - i5;
                if (i11 < 0) {
                    b2 += i11;
                }
                int i12 = paddingRight + i5;
                if (i12 >= i8) {
                    b2 -= i12 - i8;
                }
                int i13 = z2 ? ((rect.top + i6) - i) - measuredHeight : (rect.top - i6) + i;
                int i14 = measuredHeight + i13;
                int i15 = ify.a;
                boolean e = ify.e(ify.c);
                int d = i7 - ify.d(3, null);
                if (e) {
                    if (i14 > d) {
                        i2 = i14 - d;
                        i3 = i2 - i6;
                    }
                    i3 = 0;
                } else {
                    if (e) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i14 > i7) {
                        i2 = i14 - i7;
                        i3 = i2 - i6;
                    }
                    i3 = 0;
                }
                int i16 = i13 - i3;
                int a2 = fnj.a(context2) - i6;
                int i17 = -i6;
                if (i16 < a2) {
                    i16 = a2;
                }
                if (b2 < i17) {
                    b2 = i17 + i5;
                }
                if (z5) {
                    Rect e2 = view3 != null ? f4m.e(view3) : null;
                    Rect c3 = view3 != null ? f4m.c(view3) : null;
                    if (e2 != null && c3 != null) {
                        b2 = (b2 - e2.left) + c3.left;
                        i16 = (i16 - e2.top) + c3.top;
                    }
                }
                if (view3 != null) {
                    view = view3;
                } else {
                    if (view2 == null) {
                        throw new IllegalStateException("No anchor view provided");
                    }
                    view = view2;
                }
                fpjVar.showAtLocation(view, 0, b2, i16);
                this.o = fpjVar;
                if (adapter != null) {
                    adapter.registerAdapterDataObserver(new qvv0(this, i));
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (view4 == null) {
        }
        if (z3) {
        }
    }
}
