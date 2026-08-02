package com.vk.core.view.components.user.stack;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.alb0;
import xsna.as;
import xsna.byv0;
import xsna.epx;
import xsna.hyv0;
import xsna.ixj;
import xsna.izs;
import xsna.lg90;
import xsna.ozl;
import xsna.pco;
import xsna.q630;
import xsna.rlw;
import xsna.rn20;
import xsna.rpo0;
import xsna.s3q0;
import xsna.t2c;
import xsna.tlw;
import xsna.vby;
import xsna.vua0;
import xsna.wh50;
import xsna.whg0;
import xsna.wq5;
import xsna.xcc;
import xsna.yfi0;
import xsna.yzs;
import xsna.zak0;

/* compiled from: VkUserStackOld.kt */
@ozl
/* loaded from: classes17.dex */
public class VkUserStackOld extends rpo0 {
    public static final /* synthetic */ int t = 0;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;

    /* compiled from: VkUserStackOld.kt */
    public interface a {

        /* compiled from: VkUserStackOld.kt */
        /* renamed from: com.vk.core.view.components.user.stack.VkUserStackOld$a$a, reason: collision with other inner class name */
        public static final class C0885a implements a {
            public static final C0885a a = new C0885a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0885a);
            }

            public final int hashCode() {
                return 510734424;
            }

            public final String toString() {
                return "Bottom";
            }
        }

        /* compiled from: VkUserStackOld.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1010885910;
            }

            public final String toString() {
                return "BottomStart";
            }
        }

        /* compiled from: VkUserStackOld.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -929011250;
            }

            public final String toString() {
                return "End";
            }
        }

        /* compiled from: VkUserStackOld.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 586495125;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: VkUserStackOld.kt */
        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -928996792;
            }

            public final String toString() {
                return "Top";
            }
        }

        /* compiled from: VkUserStackOld.kt */
        public static final class f implements a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1025894771;
            }

            public final String toString() {
                return "TopEnd";
            }
        }
    }

    /* compiled from: VkUserStackOld.kt */
    public interface b {

        /* compiled from: VkUserStackOld.kt */
        @vby
        public static final class a implements b {
            public final boolean equals(Object obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Integer.hashCode(0);
            }

            public final String toString() {
                return "Custom(size=0)";
            }
        }

        /* compiled from: VkUserStackOld.kt */
        /* renamed from: com.vk.core.view.components.user.stack.VkUserStackOld$b$b, reason: collision with other inner class name */
        public static final class C0886b implements b {
            public static final C0886b a = new C0886b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0886b);
            }

            public final int hashCode() {
                return 41376838;
            }

            public final String toString() {
                return "Large";
            }
        }

        /* compiled from: VkUserStackOld.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1314590666;
            }

            public final String toString() {
                return "Medium";
            }
        }

        /* compiled from: VkUserStackOld.kt */
        public static final class d implements b {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 48182802;
            }

            public final String toString() {
                return "Small";
            }
        }
    }

    /* compiled from: VkUserStackOld.kt */
    public static final class c implements wq5<rlw> {
        public static final c b = new c();

        @Override // xsna.wq5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(rlw rlwVar, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1496011746);
            if ((i & 6) == 0) {
                i2 = (M.J(rlwVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(yzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1496011746, i2, -1, "com.vk.core.view.components.user.stack.VkUserStackOld.ThemedContent.<anonymous>.<anonymous>.<no name provided>.Content (VkUserStackOld.kt:73)");
                }
                if (as.a((i2 & 112) | 8, yzsVar, tlw.a(rlwVar, M, i2 & 14), M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new t2c(i, 3, this, rlwVar, yzsVar);
            }
        }
    }

    /* compiled from: VkUserStackOld.kt */
    public static final class d implements ixj {
        public final /* synthetic */ int b;

        public d(int i) {
            this.b = i;
        }

        @Override // xsna.ixj
        public final void e(yzs<? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1602666037);
            if ((i & 6) == 0) {
                i2 = (M.y(yzsVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1602666037, i2, -1, "com.vk.core.view.components.user.stack.VkUserStackOld.ThemedContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (VkUserStackOld.kt:78)");
                }
                yzsVar.invoke(Integer.valueOf(this.b), M, Integer.valueOf((i2 << 3) & 112));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new rn20(this, yzsVar, i, 1);
            }
        }
    }

    public VkUserStackOld(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(EmptyList.b);
        this.n = k.b(null);
        this.o = k.b(b.c.a);
        this.p = k.b(null);
        this.q = k.b(null);
        this.r = k.b(a.d.a);
        this.s = k.b(null);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        float y;
        pco pcoVar;
        float f;
        float f2;
        xcc.a aVar2;
        aVar.K(768469245);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(768469245, 8, -1, "com.vk.core.view.components.user.stack.VkUserStackOld.ThemedContent (VkUserStackOld.kt:42)");
        }
        SemanticsConfiguration m90getSemanticsConfigurationtn9DF0s = m90getSemanticsConfigurationtn9DF0s();
        pco pcoVar2 = null;
        if (m90getSemanticsConfigurationtn9DF0s == null) {
            m90getSemanticsConfigurationtn9DF0s = null;
        }
        q630 b2 = com.vk.core.compose.component.semantics.b.b(q630.a.a, m90getSemanticsConfigurationtn9DF0s);
        b size = getSize();
        b.d dVar = b.d.a;
        if (epx.f(size, dVar)) {
            aVar.K(-235422730);
            float f3 = byv0.a;
            y = byv0.f(UserStackSize.Small, 6);
            aVar.j();
        } else if (epx.f(size, b.c.a)) {
            aVar.K(-235420265);
            float f4 = byv0.a;
            y = byv0.f(UserStackSize.Medium, 6);
            aVar.j();
        } else if (epx.f(size, b.C0886b.a)) {
            aVar.K(-235417802);
            float f5 = byv0.a;
            y = byv0.f(UserStackSize.Large, 6);
            aVar.j();
        } else {
            if (!(size instanceof b.a)) {
                throw alb0.c(-235424834, aVar);
            }
            aVar.K(-235415579);
            ((b.a) size).getClass();
            y = vua0.y(0, aVar);
            aVar.j();
        }
        float f6 = y;
        Integer offset = getOffset();
        if (offset == null) {
            aVar.K(1292104220);
            aVar.j();
            pcoVar = null;
        } else {
            aVar.K(-235413883);
            float y2 = vua0.y(offset.intValue(), aVar);
            aVar.j();
            pcoVar = new pco(y2);
        }
        if (pcoVar == null) {
            aVar.K(1292126603);
            b size2 = getSize();
            if (epx.f(size2, dVar)) {
                aVar.K(-235411432);
                float f7 = byv0.a;
                f = byv0.d(UserStackSize.Small, 6);
                aVar.j();
            } else if (epx.f(size2, b.c.a)) {
                aVar.K(-235408903);
                float f8 = byv0.a;
                f = byv0.d(UserStackSize.Medium, 6);
                aVar.j();
            } else if (epx.f(size2, b.C0886b.a)) {
                aVar.K(-235406376);
                float f9 = byv0.a;
                f = byv0.d(UserStackSize.Large, 6);
                aVar.j();
            } else {
                if (!(size2 instanceof b.a)) {
                    throw alb0.c(-235413161, aVar);
                }
                aVar.K(-235403751);
                float f10 = byv0.a;
                f = byv0.d(UserStackSize.Medium, 6);
                aVar.j();
            }
            aVar.j();
        } else {
            aVar.K(-235413781);
            aVar.j();
            f = pcoVar.b;
        }
        float f11 = f;
        Integer border = getBorder();
        if (border == null) {
            aVar.K(1292490108);
            aVar.j();
        } else {
            aVar.K(-235401435);
            float y3 = vua0.y(border.intValue(), aVar);
            aVar.j();
            pcoVar2 = new pco(y3);
        }
        if (pcoVar2 == null) {
            aVar.K(1292512491);
            b size3 = getSize();
            if (epx.f(size3, dVar)) {
                aVar.K(-235398984);
                float f12 = byv0.a;
                f2 = byv0.a(UserStackSize.Small, 6);
                aVar.j();
            } else if (epx.f(size3, b.c.a)) {
                aVar.K(-235396455);
                float f13 = byv0.a;
                f2 = byv0.a(UserStackSize.Medium, 6);
                aVar.j();
            } else if (epx.f(size3, b.C0886b.a)) {
                aVar.K(-235393928);
                float f14 = byv0.a;
                f2 = byv0.a(UserStackSize.Large, 6);
                aVar.j();
            } else {
                if (!(size3 instanceof b.a)) {
                    throw alb0.c(-235400713, aVar);
                }
                aVar.K(-235391303);
                float f15 = byv0.a;
                f2 = byv0.a(UserStackSize.Medium, 6);
                aVar.j();
            }
            aVar.j();
        } else {
            aVar.K(-235401333);
            aVar.j();
            f2 = pcoVar2.b;
        }
        float f16 = f2;
        a position = getPosition();
        if (epx.f(position, a.C0885a.a)) {
            aVar2 = xcc.a.b.a;
        } else if (epx.f(position, a.b.a)) {
            aVar2 = xcc.a.c.a;
        } else if (epx.f(position, a.c.a)) {
            aVar2 = xcc.a.e.a;
        } else if (epx.f(position, a.d.a)) {
            aVar2 = xcc.a.g.a;
        } else if (epx.f(position, a.e.a)) {
            aVar2 = xcc.a.h.a;
        } else {
            if (!epx.f(position, a.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = xcc.a.i.a;
        }
        xcc.a aVar3 = aVar2;
        boolean y4 = aVar.y(this);
        Object x = aVar.x();
        if (y4 || x == a.C0011a.a) {
            x = new whg0(this, 28);
            aVar.R(x);
        }
        hyv0.f(b2, aVar3, null, f16, f11, f6, (izs) x, aVar, 0, 4);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final List<rlw> getAvatars() {
        return (List) ((zak0) this.m).getValue();
    }

    public final Integer getBorder() {
        return (Integer) ((zak0) this.p).getValue();
    }

    public final Integer getCounter() {
        return (Integer) ((zak0) this.n).getValue();
    }

    public final Integer getOffset() {
        return (Integer) ((zak0) this.q).getValue();
    }

    public final a getPosition() {
        return (a) ((zak0) this.r).getValue();
    }

    /* renamed from: getSemanticsConfiguration-tn9DF0s, reason: not valid java name */
    public final SemanticsConfiguration m90getSemanticsConfigurationtn9DF0s() {
        yfi0 yfi0Var = (yfi0) ((zak0) this.s).getValue();
        if (yfi0Var != null) {
            return yfi0Var.a;
        }
        return null;
    }

    public final b getSize() {
        return (b) ((zak0) this.o).getValue();
    }

    public final void setAvatars(List<? extends rlw> list) {
        ((zak0) this.m).setValue(list);
    }

    public final void setBorder(Integer num) {
        ((zak0) this.p).setValue(num);
    }

    public final void setCounter(Integer num) {
        ((zak0) this.n).setValue(num);
    }

    public final void setOffset(Integer num) {
        ((zak0) this.q).setValue(num);
    }

    public final void setPosition(a aVar) {
        ((zak0) this.r).setValue(aVar);
    }

    /* renamed from: setSemanticsConfiguration-lkKuBUQ, reason: not valid java name */
    public final void m91setSemanticsConfigurationlkKuBUQ(SemanticsConfiguration semanticsConfiguration) {
        ((zak0) this.s).setValue(semanticsConfiguration != null ? new yfi0(semanticsConfiguration) : null);
    }

    public final void setSize(b bVar) {
        ((zak0) this.o).setValue(bVar);
    }
}
