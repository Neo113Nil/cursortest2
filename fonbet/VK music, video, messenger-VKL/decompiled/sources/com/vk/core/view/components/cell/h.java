package com.vk.core.view.components.cell;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.tool.view.AdaptiveHorizontalLinearLayout;
import com.vk.core.view.components.cell.slot.Slot;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cpy;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.h4j0;
import xsna.ms9;
import xsna.too0;

/* compiled from: VkSexyCell.kt */
/* loaded from: classes17.dex */
public final class h extends AdaptiveHorizontalLinearLayout implements too0 {
    public Slot.Size b;
    public Slot.Align c;
    public b d;
    public a e;
    public c f;
    public Integer g;
    public LinearLayout h;
    public LinearLayout i;
    public LinearLayout j;

    /* compiled from: VkSexyCell.kt */
    public static final class a {
        public final List<Slot<?>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Slot<?>> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("After(slots="), this.a);
        }
    }

    /* compiled from: VkSexyCell.kt */
    public static final class b {
        public final List<Slot<?>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Slot<?>> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Before(slots="), this.a);
        }
    }

    /* compiled from: VkSexyCell.kt */
    public static final class c {
        public final Slot<?> a;
        public final Slot<?> b;
        public final Slot<?> c;

        public c(Slot<?> slot, Slot<?> slot2, Slot<?> slot3) {
            this.a = slot;
            this.b = slot2;
            this.c = slot3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Slot<?> slot = this.b;
            int hashCode2 = (hashCode + (slot == null ? 0 : slot.hashCode())) * 31;
            Slot<?> slot2 = this.c;
            return hashCode2 + (slot2 != null ? slot2.hashCode() : 0);
        }

        public final String toString() {
            return "Middle(slot1=" + this.a + ", slot2=" + this.b + ", buttonsSlot=" + this.c + ')';
        }
    }

    /* compiled from: VkSexyCell.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Slot.Align.values().length];
            try {
                iArr[Slot.Align.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Slot.Align.Middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h(Context context) {
        super(context, null, 0);
        setOrientation(0);
        this.b = Slot.Size.M;
        this.c = Slot.Align.Middle;
        setOrientation(0);
        setGravity(16);
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size2_xl, context);
        f4m.l(a2, a2, this);
        getContext();
        g();
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
    }

    @Override // xsna.too0
    public final void Ng() {
        List<Slot<?>> list;
        Slot<?> slot;
        Slot<?> slot2;
        Slot<?> slot3;
        List<Slot<?>> list2;
        b bVar = this.d;
        if (bVar != null && (list2 = bVar.a) != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((Slot) it.next()).Ng();
            }
        }
        c cVar = this.f;
        if (cVar != null && (slot3 = cVar.a) != null) {
            slot3.Ng();
        }
        c cVar2 = this.f;
        if (cVar2 != null && (slot2 = cVar2.b) != null) {
            slot2.Ng();
        }
        c cVar3 = this.f;
        if (cVar3 != null && (slot = cVar3.c) != null) {
            slot.Ng();
        }
        a aVar = this.e;
        if (aVar == null || (list = aVar.a) == null) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((Slot) it2.next()).Ng();
        }
    }

    public final LinearLayout c() {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.ds_internal_cell_right);
        setOrientation(0);
        this.j = linearLayout2;
        addView(linearLayout2, cpy.b(0, 0, 0, 0, 0, 0, 63));
        return linearLayout2;
    }

    public final LinearLayout d() {
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.ds_internal_cell_left);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        this.h = linearLayout2;
        getContext();
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_s, getContext());
        addView(linearLayout2, 0, cpy.b(0, 0, 0, a2, a2, 0, 39));
        return linearLayout2;
    }

    public final void e() {
        int i;
        int i2 = d.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i2 == 1) {
            i = 48;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 16;
        }
        setGravity(i);
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            linearLayout.setGravity(i);
        }
        LinearLayout linearLayout2 = this.i;
        if (linearLayout2 != null) {
            linearLayout2.setGravity(i);
        }
        LinearLayout linearLayout3 = this.j;
        if (linearLayout3 != null) {
            linearLayout3.setGravity(i);
        }
    }

    public final void f() {
        b bVar = this.d;
        if (bVar != null) {
            Slot.Size size = this.b;
            Iterator<T> it = bVar.a.iterator();
            while (it.hasNext()) {
                ((Slot) it.next()).Ad(size);
            }
        }
        c cVar = this.f;
        if (cVar != null) {
            Slot.Size size2 = this.b;
            cVar.a.Ad(size2);
            Slot<?> slot = cVar.b;
            if (slot != null) {
                slot.Ad(size2);
            }
            Slot<?> slot2 = cVar.c;
            if (slot2 != null) {
                slot2.Ad(size2);
            }
        }
        a aVar = this.e;
        if (aVar != null) {
            Slot.Size size3 = this.b;
            Iterator<T> it2 = aVar.a.iterator();
            while (it2.hasNext()) {
                ((Slot) it2.next()).Ad(size3);
            }
        }
    }

    public final void g() {
        int i;
        int a2;
        Integer num = this.g;
        if (num != null) {
            a2 = num.intValue();
        } else {
            Context context = getContext();
            int i2 = h4j0.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i2 == 1) {
                i = R.dimen.vk_ui_spacing_size_xs;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.dimen.vk_ui_spacing_size_m;
            }
            a2 = e3m.a(i, context);
        }
        f4m.B(a2, a2, this);
    }

    public final a getAfter() {
        return this.e;
    }

    public final Slot.Align getAlign() {
        return this.c;
    }

    public final b getBefore() {
        return this.d;
    }

    public final Integer getCustomVerticalPaddings$foundation_release() {
        return this.g;
    }

    public final c getMiddle() {
        return this.f;
    }

    public final Slot.Size getSize() {
        return this.b;
    }

    public final void setAfter(a aVar) {
        this.e = aVar;
        LinearLayout c2 = c();
        c2.setVisibility(aVar != null ? 0 : 8);
        c2.removeAllViews();
        if (aVar != null) {
            f();
            e();
            Iterator<T> it = aVar.a.iterator();
            while (it.hasNext()) {
                Slot slot = (Slot) it.next();
                c2.getContext();
                c2.addView(slot.getView(), cpy.b(0, 0, 0, 0, 0, 0, 59));
            }
        }
    }

    public final void setAfterAdaptivity$foundation_release(AdaptiveHorizontalLinearLayout.LayoutParams.Adaptivity adaptivity) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            AdaptiveHorizontalLinearLayout.LayoutParams layoutParams = new AdaptiveHorizontalLinearLayout.LayoutParams(linearLayout.getLayoutParams());
            layoutParams.a = adaptivity;
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    public final void setAlign(Slot.Align align) {
        this.c = align;
        e();
    }

    public final void setBefore(b bVar) {
        int a2;
        this.d = bVar;
        LinearLayout d2 = d();
        d2.setVisibility(bVar != null ? 0 : 8);
        d2.removeAllViews();
        if (bVar != null) {
            f();
            e();
            Iterator<T> it = bVar.a.iterator();
            while (it.hasNext()) {
                Slot slot = (Slot) it.next();
                Context context = d2.getContext();
                int i = h4j0.$EnumSwitchMapping$0[this.b.ordinal()];
                if (i == 1 || i == 2) {
                    a2 = e3m.a(R.dimen.vk_ui_spacing_size_xl, context);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a2 = e3m.a(R.dimen.vk_ui_spacing_size2_xl, context);
                }
                d2.addView(slot.getView(), cpy.b(0, 0, 0, 0, 0, a2, 31));
            }
        }
    }

    public final void setCustomVerticalPaddings$foundation_release(Integer num) {
        this.g = num;
        g();
    }

    public final void setMiddle(c cVar) {
        View view;
        View view2;
        this.f = cVar;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            linearLayout = new LinearLayout(getContext());
            linearLayout.setId(R.id.ds_internal_cell_middle);
            linearLayout.setClipChildren(false);
            linearLayout.setOrientation(1);
            this.i = linearLayout;
            int indexOfChild = indexOfChild(this.h);
            int i = indexOfChild != 0 ? 1 + indexOfChild : 1;
            AdaptiveHorizontalLinearLayout.LayoutParams layoutParams = new AdaptiveHorizontalLinearLayout.LayoutParams(cpy.b(0, 0, 0, 0, 0, 0, 63));
            layoutParams.a = AdaptiveHorizontalLinearLayout.LayoutParams.Adaptivity.GROW_SHRINK;
            addView(linearLayout, i, layoutParams);
        }
        linearLayout.setVisibility(cVar == null ? 8 : 0);
        linearLayout.removeAllViews();
        if (cVar != null) {
            f();
            e();
            linearLayout.addView(cVar.a.getView());
            Slot<?> slot = cVar.b;
            if (slot != null && (view2 = slot.getView()) != null) {
                linearLayout.addView(view2, cpy.b(0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size_s, linearLayout.getContext()), 0, 0, 55));
            }
            Slot<?> slot2 = cVar.c;
            if (slot2 == null || (view = slot2.getView()) == null) {
                return;
            }
            linearLayout.addView(view, cpy.b(0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xl, linearLayout.getContext()), 0, 0, 55));
        }
    }

    public final void setSize(Slot.Size size) {
        List<Slot<?>> list;
        List<Slot<?>> list2;
        int a2;
        this.b = size;
        getContext();
        f();
        g();
        d();
        b bVar = this.d;
        if (bVar != null && (list2 = bVar.a) != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                View view = ((Slot) it.next()).getView();
                Context context = getContext();
                int i = h4j0.$EnumSwitchMapping$0[this.b.ordinal()];
                if (i == 1 || i == 2) {
                    a2 = e3m.a(R.dimen.vk_ui_spacing_size_xl, context);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a2 = e3m.a(R.dimen.vk_ui_spacing_size2_xl, context);
                }
                f4m.r(a2, view);
            }
        }
        c();
        a aVar = this.e;
        if (aVar == null || (list = aVar.a) == null) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            View view2 = ((Slot) it2.next()).getView();
            getContext();
            f4m.s(0, view2);
        }
    }
}
