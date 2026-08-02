package com.vk.core.compose.component.datetime;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.EmptyList;
import xsna.dli0;
import xsna.epx;
import xsna.hf7;
import xsna.hke0;
import xsna.ho8;
import xsna.j5g;
import xsna.k9x;
import xsna.kf7;
import xsna.ms9;
import xsna.swe0;

/* compiled from: BlockInput.kt */
/* loaded from: classes17.dex */
public final class b {
    public boolean a;
    public final com.vk.core.compose.component.datetime.a b;
    public final com.vk.core.compose.component.datetime.a c;
    public kf7 d;
    public k9x e = k9x.e;

    /* compiled from: BlockInput.kt */
    public static abstract class a {

        /* compiled from: BlockInput.kt */
        /* renamed from: com.vk.core.compose.component.datetime.b$a$a, reason: collision with other inner class name */
        public static final class C0737a extends a {
            public final int a;
            public final Predicate<Character> b;

            public C0737a(int i, Predicate<Character> predicate) {
                this.a = i;
                this.b = predicate;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0737a)) {
                    return false;
                }
                C0737a c0737a = (C0737a) obj;
                return this.a == c0737a.a && epx.f(this.b, c0737a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "Editable(size=" + this.a + ", allowedChars=" + this.b + ')';
            }
        }

        /* compiled from: BlockInput.kt */
        /* renamed from: com.vk.core.compose.component.datetime.b$a$b, reason: collision with other inner class name */
        public static final class C0738b extends a {
            public final String a;

            public C0738b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0738b) && epx.f(this.a, ((C0738b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Fixed(value="), this.a, ')');
            }
        }
    }

    /* compiled from: BlockInput.kt */
    /* renamed from: com.vk.core.compose.component.datetime.b$b, reason: collision with other inner class name */
    public static final class C0739b {
        public final List<a> a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0739b(List<? extends a> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0739b) && epx.f(this.a, ((C0739b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("BlockGroup(blocks="), this.a);
        }
    }

    public b(List<C0739b> list, char c) {
        if (list.isEmpty()) {
            com.vk.core.compose.component.datetime.a aVar = new com.vk.core.compose.component.datetime.a(null, c, new C0739b(EmptyList.b));
            this.b = aVar;
            this.c = aVar;
        } else {
            com.vk.core.compose.component.datetime.a aVar2 = new com.vk.core.compose.component.datetime.a(null, c, (C0739b) j5g.Y(list));
            this.b = aVar2;
            Iterator<C0739b> it = list.subList(1, list.size()).iterator();
            while (it.hasNext()) {
                aVar2 = new com.vk.core.compose.component.datetime.a(aVar2, c, it.next());
            }
            this.c = aVar2;
        }
    }

    public final void a() {
        k9x k9xVar = this.e;
        kf7 kf7Var = this.c.f;
        d(0, kf7Var.e() + kf7Var.a);
        f();
        d(k9xVar.b, k9xVar.c + 1);
    }

    public final void b(C0739b c0739b) {
        com.vk.core.compose.component.datetime.a c = c(c0739b);
        if (c == null) {
            return;
        }
        k9x k9xVar = this.e;
        int i = c.d;
        d(i, c.c + i);
        f();
        d(k9xVar.b, k9xVar.c + 1);
    }

    public final com.vk.core.compose.component.datetime.a c(C0739b c0739b) {
        Object obj;
        Iterator it = dli0.e(this.b, hf7.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.vk.core.compose.component.datetime.a) obj).b == c0739b) {
                break;
            }
        }
        return (com.vk.core.compose.component.datetime.a) obj;
    }

    public final void d(int i, int i2) {
        if (i != i2) {
            this.d = null;
            this.e = swe0.q(i, i2);
            return;
        }
        kf7 kf7Var = this.d;
        if (kf7Var == null) {
            kf7Var = this.b.e;
        }
        kf7 b = kf7Var.b(i);
        if (b != null) {
            i = b.i() ? b.a : b.g();
        }
        this.d = b;
        this.e = swe0.q(i, i);
    }

    public final void e(CharSequence charSequence) {
        if (!this.e.isEmpty()) {
            f();
        }
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            kf7 kf7Var = this.d;
            hke0 k = kf7Var != null ? kf7Var.k(charAt) : null;
            if (k == null || k.b) {
                break;
            }
            this.d = k.a;
        }
        kf7 kf7Var2 = this.d;
        if (kf7Var2 != null) {
            int g = kf7Var2.g();
            this.e = swe0.q(g, g);
        }
    }

    public final void f() {
        kf7 kf7Var = this.d;
        if (kf7Var == null) {
            kf7 kf7Var2 = this.b.e;
            k9x k9xVar = this.e;
            kf7Var2.a(k9xVar.b, k9xVar.c + 1);
            int i = this.e.b;
            d(i, i);
            return;
        }
        kf7 kf7Var3 = kf7Var.j().a;
        this.d = kf7Var3;
        if (kf7Var3 != null) {
            int g = kf7Var3.g();
            this.e = swe0.q(g, g);
        }
    }

    public final void g(C0739b c0739b, String str) {
        com.vk.core.compose.component.datetime.a c = c(c0739b);
        if (c == null) {
            return;
        }
        k9x k9xVar = this.e;
        int i = c.d;
        d(i, c.c + i);
        e(str);
        d(k9xVar.b, k9xVar.c + 1);
    }

    public final void h(String str) {
        k9x k9xVar = this.e;
        kf7 kf7Var = this.c.f;
        d(0, kf7Var.e() + kf7Var.a);
        e(str);
        d(k9xVar.b, k9xVar.c + 1);
    }
}
