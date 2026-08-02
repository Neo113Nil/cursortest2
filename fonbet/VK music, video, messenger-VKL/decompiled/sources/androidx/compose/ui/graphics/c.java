package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Path;
import xsna.aog0;
import xsna.epx;
import xsna.ne7;
import xsna.zhf0;

/* compiled from: Outline.kt */
/* loaded from: classes11.dex */
public abstract class c {

    /* compiled from: Outline.kt */
    public static final class a extends c {
        public final Path a;

        public a(Path path) {
            this.a = path;
        }

        @Override // androidx.compose.ui.graphics.c
        public final zhf0 a() {
            return this.a.getBounds();
        }
    }

    /* compiled from: Outline.kt */
    public static final class b extends c {
        public final zhf0 a;

        public b(zhf0 zhf0Var) {
            this.a = zhf0Var;
        }

        @Override // androidx.compose.ui.graphics.c
        public final zhf0 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    /* renamed from: androidx.compose.ui.graphics.c$c, reason: collision with other inner class name */
    public static final class C0013c extends c {
        public final aog0 a;
        public final androidx.compose.ui.graphics.a b;

        public C0013c(aog0 aog0Var) {
            androidx.compose.ui.graphics.a aVar;
            this.a = aog0Var;
            if (ne7.z(aog0Var)) {
                aVar = null;
            } else {
                aVar = androidx.compose.ui.graphics.b.a();
                aVar.q(aog0Var, Path.Direction.CounterClockwise);
            }
            this.b = aVar;
        }

        @Override // androidx.compose.ui.graphics.c
        public final zhf0 a() {
            aog0 aog0Var = this.a;
            return new zhf0(aog0Var.a, aog0Var.b, aog0Var.c, aog0Var.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0013c) {
                return epx.f(this.a, ((C0013c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public abstract zhf0 a();
}
