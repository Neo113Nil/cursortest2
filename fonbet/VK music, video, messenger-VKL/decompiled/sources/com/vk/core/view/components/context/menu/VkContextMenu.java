package com.vk.core.view.components.context.menu;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.baf0;
import xsna.c5g;
import xsna.d1x;
import xsna.dhr0;
import xsna.drr;
import xsna.e43;
import xsna.fnj;
import xsna.fpj;
import xsna.g5g;
import xsna.gpu0;
import xsna.gq;
import xsna.gzs;
import xsna.hbh0;
import xsna.id90;
import xsna.krv0;
import xsna.ozl;
import xsna.s3q0;
import xsna.vnj;
import xsna.zrp;
import xsna.zwt0;

/* compiled from: VkContextMenu.kt */
/* loaded from: classes17.dex */
public abstract class VkContextMenu {
    public final Context a;
    public final RecyclerView.Adapter<RecyclerView.e0> b;
    public final RecyclerView.n c;
    public final View d;
    public final View e;
    public final b f;
    public final boolean g;
    public final Rect h;
    public final View.OnAttachStateChangeListener i;
    public gzs<s3q0> j;
    public gzs<s3q0> k;
    public View l;
    public View m;
    public View n;
    public fpj o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkContextMenu.kt */
    public static final class OverlayContentPosition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OverlayContentPosition[] $VALUES;
        public static final OverlayContentPosition Above;
        public static final OverlayContentPosition Below;

        static {
            OverlayContentPosition overlayContentPosition = new OverlayContentPosition("Above", 0);
            Above = overlayContentPosition;
            OverlayContentPosition overlayContentPosition2 = new OverlayContentPosition("Below", 1);
            Below = overlayContentPosition2;
            OverlayContentPosition[] overlayContentPositionArr = {overlayContentPosition, overlayContentPosition2};
            $VALUES = overlayContentPositionArr;
            $ENTRIES = new asp(overlayContentPositionArr);
        }

        public OverlayContentPosition() {
            throw null;
        }

        public static OverlayContentPosition valueOf(String str) {
            return (OverlayContentPosition) Enum.valueOf(OverlayContentPosition.class, str);
        }

        public static OverlayContentPosition[] values() {
            return (OverlayContentPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: VkContextMenu.kt */
    @ozl
    public static final class a extends vnj {
        public final CharSequence a;
        public final Drawable b;
        public final Integer c;
        public final boolean d;
        public final boolean e;
        public final gzs<s3q0> f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(CharSequence charSequence, Drawable drawable, Integer num, boolean z, boolean z2, gzs gzsVar, int i) {
            this(charSequence, drawable, num, z, r8, r9);
            gzs gzsVar2;
            boolean z3;
            drawable = (i & 2) != 0 ? null : drawable;
            num = (i & 4) != 0 ? null : num;
            z = (i & 8) != 0 ? false : z;
            if ((i & 16) != 0) {
                gzsVar2 = gzsVar;
                z3 = false;
            } else {
                gzsVar2 = gzsVar;
                z3 = z2;
            }
        }

        @Override // xsna.vnj
        public final CharSequence a() {
            return this.a;
        }

        public a(CharSequence charSequence, Drawable drawable, Integer num, boolean z, boolean z2, gzs<s3q0> gzsVar) {
            this.a = charSequence;
            this.b = drawable;
            this.c = num;
            this.d = z;
            this.e = z2;
            this.f = gzsVar;
        }
    }

    /* compiled from: VkContextMenu.kt */
    public static final class b {
        public final Integer a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(Integer num, int i, int i2, int i3, int i4, int i5) {
            this.a = num;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    /* compiled from: VkContextMenu.kt */
    public static abstract class c extends f {
        public Context e;
        public final ArrayList f;
        public Drawable g;
        public Integer h;
        public Integer i;
        public gzs<Integer> j;
        public boolean k;
        public RecyclerView.Adapter<RecyclerView.e0> l;
        public int m;
        public int n;
        public gpu0 o;
        public drr p;
        public boolean q;
        public int r;
        public Integer s;
        public int t;
        public int u;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        
            if (r2 == null) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(View view, Rect rect, View view2, int i) {
            super(view, rect, view2, i);
            Context context;
            if (view == null || (context = view.getContext()) == null) {
                context = null;
                Context context2 = view2 != null ? view2.getContext() : null;
                if (context2 == null) {
                    TypedValue typedValue = krv0.a;
                    context2 = krv0.b != null ? dhr0.E() : null;
                    if (context2 == null) {
                        context2 = e43.a;
                    }
                }
                context = context2;
            }
            this.e = context;
            this.f = new ArrayList();
            this.j = com.vk.core.view.components.context.menu.a.b;
            this.n = hbh0.b(4, this.e);
            this.r = hbh0.b(16, this.e);
            this.t = hbh0.b(24, this.e);
            this.u = hbh0.b(40, this.e);
            OverlayContentPosition overlayContentPosition = OverlayContentPosition.Above;
        }

        public static void c(c cVar, int i, Drawable drawable, boolean z, Integer num, gzs gzsVar, int i2) {
            if ((i2 & 2) != 0) {
                drawable = null;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            if ((i2 & 8) != 0) {
                num = null;
            }
            cVar.f.add(new com.vk.core.view.components.context.menu.b(new a(cVar.e.getString(i), drawable, num, z, false, gzsVar)));
        }

        public static void d(c cVar, String str, Drawable drawable, boolean z, gzs gzsVar, int i) {
            if ((i & 2) != 0) {
                drawable = null;
            }
            Drawable drawable2 = drawable;
            if ((i & 4) != 0) {
                z = false;
            }
            cVar.f.add(new com.vk.core.view.components.context.menu.b(new a(str, drawable2, null, z, false, gzsVar)));
        }

        public static void k(e.b bVar) {
            bVar.a().i(false);
        }

        public final void b(int i, baf0 baf0Var, gzs gzsVar) {
            c(this, i, baf0Var, false, null, gzsVar, 24);
        }

        public final void e(RecyclerView.Adapter adapter) {
            this.l = adapter;
        }

        public final void f(Context context) {
            this.e = context;
        }

        public final void g(int i) {
            if (i != 0) {
                this.j = new id90(this, i, 1);
            }
        }

        public final void h(List list) {
            ArrayList arrayList = this.f;
            arrayList.clear();
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.vk.core.view.components.context.menu.b((a) it.next()));
            }
            g5g.y(arrayList2, arrayList);
        }

        public final void i(Integer num) {
            if (num != null && num.intValue() < 0) {
                throw new IllegalArgumentException(gq.d(num, "Illegal maxWidth value: "));
            }
            this.s = num;
        }

        public final VkContextMenu j() {
            return a().g();
        }

        public final VkContextMenu l(boolean z) {
            return a().j(z);
        }
    }

    /* compiled from: VkContextMenu.kt */
    public static abstract class d extends c {
    }

    /* compiled from: VkContextMenu.kt */
    public static final class e {
        public static e.b a(int i, View view) {
            view.getContext();
            e.b bVar = new e.b(view, null, null, i, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            return bVar;
        }
    }

    /* compiled from: VkContextMenu.kt */
    public static abstract class f {
        public final View a;
        public final Rect b;
        public final View c;
        public final int d;

        public f(View view, Rect rect, View view2, int i) {
            this.a = view;
            this.b = rect;
            this.c = view2;
            this.d = i;
        }

        public abstract VkContextMenu a();
    }

    public VkContextMenu(Context context, RecyclerView.Adapter adapter, gpu0 gpu0Var, View view, View view2, b bVar, boolean z, Rect rect, drr drrVar, OverlayContentPosition overlayContentPosition) {
        this.a = context;
        this.b = adapter;
        this.c = gpu0Var;
        this.d = view;
        this.e = view2;
        this.f = bVar;
        this.g = z;
        this.h = rect;
        this.i = drrVar;
    }

    public abstract d1x a();

    public abstract void b();

    public final boolean c() {
        return this.o != null;
    }

    public int d(Context context) {
        return hbh0.b(480, context);
    }

    public void e(gzs<s3q0> gzsVar) {
        this.k = gzsVar;
    }

    public void f(gzs<s3q0> gzsVar) {
        this.j = gzsVar;
    }

    public abstract VkContextMenu g();

    public abstract VkContextMenu h(boolean z);

    public abstract VkContextMenu i(boolean z);

    public abstract VkContextMenu j(boolean z);

    public final void k(int i, int i2, View view) {
        View rootView;
        int width;
        int height;
        View view2 = this.d;
        if (view2 == null) {
            View view3 = this.e;
            if (view3 == null || (rootView = view3.getRootView()) == null) {
                throw new IllegalStateException("No anchor view provided");
            }
        } else {
            rootView = view2.getRootView();
        }
        b bVar = this.f;
        int i3 = bVar.d;
        view.setPadding(i3, bVar.e, i3, bVar.f);
        int b2 = zwt0.b(view.getContext());
        int a2 = fnj.a(rootView.getContext());
        int b3 = hbh0.b(16, view.getContext());
        boolean z = this.g;
        if (z) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            width = hbh0.d(context);
        } else {
            width = rootView.getWidth();
        }
        if (z) {
            Context context2 = e43.a;
            Context context3 = context2 != null ? context2 : null;
            height = Math.max(context3.getResources().getDisplayMetrics().widthPixels, context3.getResources().getDisplayMetrics().heightPixels);
        } else {
            height = rootView.getHeight();
        }
        b bVar2 = this.f;
        Integer num = bVar2.a;
        int min = Math.min(width, num != null ? num.intValue() : d(view.getContext())) - (bVar2.c * 2);
        int i4 = (b3 * 2) + ((((height - i) - b2) - a2) - i2);
        if (i4 < 0) {
            i4 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
