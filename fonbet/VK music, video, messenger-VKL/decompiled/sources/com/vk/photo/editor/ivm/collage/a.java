package com.vk.photo.editor.ivm.collage;

import com.vk.photo.editor.ivm.collage.CollageMessage;
import java.util.ArrayList;
import xsna.epx;
import xsna.f0g;
import xsna.gq;
import xsna.mwx;
import xsna.n2k0;
import xsna.qr;
import xsna.w0g;

/* compiled from: CollagePatch.kt */
/* loaded from: classes4.dex */
public interface a extends mwx {

    /* compiled from: CollagePatch.kt */
    /* renamed from: com.vk.photo.editor.ivm.collage.a$a, reason: collision with other inner class name */
    public static final class C1467a implements a {
        public static final C1467a a = new C1467a();
    }

    /* compiled from: CollagePatch.kt */
    public static final class b implements a {
        public final n2k0 a;

        public b(n2k0 n2k0Var) {
            this.a = n2k0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            n2k0 n2k0Var = this.a;
            if (n2k0Var == null) {
                return 0;
            }
            return n2k0Var.hashCode();
        }

        public final String toString() {
            return "SelectSlot(slotId=" + this.a + ")";
        }
    }

    /* compiled from: CollagePatch.kt */
    public static final class c implements a {
        public final ArrayList a;
        public final w0g b;
        public final ArrayList c;
        public final ArrayList d;
        public final float e;
        public final float f;
        public final f0g g;
        public final CollageMessage.Source h;

        public c(ArrayList arrayList, w0g w0gVar, ArrayList arrayList2, ArrayList arrayList3, float f, float f2, f0g f0gVar, CollageMessage.Source source) {
            this.a = arrayList;
            this.b = w0gVar;
            this.c = arrayList2;
            this.d = arrayList3;
            this.e = f;
            this.f = f2;
            this.g = f0gVar;
            this.h = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && epx.f(this.b, cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d) && Float.compare(this.e, cVar.e) == 0 && Float.compare(this.f, cVar.f) == 0 && epx.f(this.g, cVar.g) && this.h == cVar.h;
        }

        public final int hashCode() {
            return this.h.hashCode() + ((this.g.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, qr.a(this.d, qr.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateParams(grids=");
            sb.append(this.a);
            sb.append(", grid=");
            sb.append(this.b);
            sb.append(", formats=");
            sb.append(this.c);
            sb.append(", colors=");
            sb.append(this.d);
            sb.append(", borderWidth=");
            gq.h(sb, this.e, ", cornerRadius=", this.f, ", borderColor=");
            sb.append(this.g);
            sb.append(", source=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }
}
