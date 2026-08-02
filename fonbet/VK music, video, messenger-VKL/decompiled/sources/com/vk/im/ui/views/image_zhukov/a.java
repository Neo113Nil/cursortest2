package com.vk.im.ui.views.image_zhukov;

import android.graphics.Rect;
import java.util.ArrayList;
import xsna.e6y0;

/* compiled from: Strategy.java */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: Strategy.java */
    /* renamed from: com.vk.im.ui.views.image_zhukov.a$a, reason: collision with other inner class name */
    public static class C1181a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public final ArrayList g = new ArrayList(10);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1181a.class != obj.getClass()) {
                return false;
            }
            C1181a c1181a = (C1181a) obj;
            if (this.a == c1181a.a && this.b == c1181a.b && this.c == c1181a.c && this.d == c1181a.d && this.e == c1181a.e && this.f == c1181a.f) {
                return this.g.equals(c1181a.g);
            }
            return false;
        }

        public final int hashCode() {
            return this.g.hashCode() + (((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31);
        }
    }

    /* compiled from: Strategy.java */
    public static class b {
        public final e6y0 a = new e6y0();
        public final ArrayList b = new ArrayList(10);

        public final void a(b bVar) {
            e6y0 e6y0Var = bVar.a;
            int i = e6y0Var.a;
            e6y0 e6y0Var2 = this.a;
            e6y0Var2.a = i;
            e6y0Var2.b = e6y0Var.b;
            ArrayList arrayList = this.b;
            arrayList.clear();
            ArrayList arrayList2 = bVar.b;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                arrayList.add(new Rect((Rect) arrayList2.get(i2)));
            }
        }
    }

    void a(C1181a c1181a, b bVar);
}
