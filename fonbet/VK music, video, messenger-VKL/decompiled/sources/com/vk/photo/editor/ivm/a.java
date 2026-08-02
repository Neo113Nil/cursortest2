package com.vk.photo.editor.ivm;

import com.vk.photo.editor.ivm.EditorMessage;
import java.util.Map;
import xsna.epx;
import xsna.f5p;
import xsna.g5p;
import xsna.i4p;
import xsna.mwx;
import xsna.n23;
import xsna.v11;

/* compiled from: EditorPatch.kt */
/* loaded from: classes4.dex */
public interface a extends mwx {

    /* compiled from: EditorPatch.kt */
    /* renamed from: com.vk.photo.editor.ivm.a$a, reason: collision with other inner class name */
    public static final class C1466a implements a {
        public static final C1466a a = new C1466a();
    }

    /* compiled from: EditorPatch.kt */
    public static final class b implements a {
        public static final b a = new b();
    }

    /* compiled from: EditorPatch.kt */
    public static final class c implements a {
        public static final c a = new c();
    }

    /* compiled from: EditorPatch.kt */
    public static final class d implements a {
        public static final d a = new d();
    }

    /* compiled from: EditorPatch.kt */
    public static final class e implements a {
        public static final e a = new e();
    }

    /* compiled from: EditorPatch.kt */
    public static final class f implements a {
        public final f5p a;

        public f(f5p f5pVar) {
            this.a = f5pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SaveToolParams(contextToolId=" + this.a + ")";
        }
    }

    /* compiled from: EditorPatch.kt */
    public static final class g implements a {
        public final i4p a;
        public final Map<f5p, g5p> b;
        public final boolean c;

        /* JADX WARN: Multi-variable type inference failed */
        public g(i4p i4pVar, Map<f5p, ? extends g5p> map, boolean z) {
            this.a = i4pVar;
            this.b = map;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && this.c == gVar.c;
        }

        public final int hashCode() {
            i4p i4pVar = this.a;
            return Boolean.hashCode(this.c) + v11.a((i4pVar == null ? 0 : i4pVar.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetImage(imageState=");
            sb.append(this.a);
            sb.append(", defaultParams=");
            sb.append(this.b);
            sb.append(", resetHistory=");
            return n23.b(sb, this.c, ")");
        }
    }

    /* compiled from: EditorPatch.kt */
    public static final class h implements a {
        public static final h a = new h();
    }

    /* compiled from: EditorPatch.kt */
    public static final class i implements a {
        public final i4p a;

        public i(i4p i4pVar) {
            this.a = i4pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            i4p i4pVar = this.a;
            if (i4pVar == null) {
                return 0;
            }
            return i4pVar.hashCode();
        }

        public final String toString() {
            return "UpdateImage(imageState=" + this.a + ")";
        }
    }

    /* compiled from: EditorPatch.kt */
    public static final class j implements a {
        public final g5p a;
        public final EditorMessage.Source b;
        public final boolean c;

        public j(g5p g5pVar, EditorMessage.Source source, boolean z) {
            this.a = g5pVar;
            this.b = source;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && this.b == jVar.b && this.c == jVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateToolParams(params=");
            sb.append(this.a);
            sb.append(", messageSource=");
            sb.append(this.b);
            sb.append(", saveToHistory=");
            return n23.b(sb, this.c, ")");
        }
    }

    /* compiled from: EditorPatch.kt */
    public static final class k implements a {
        public final Map<f5p, g5p> a;
        public final EditorMessage.Source b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(Map<f5p, ? extends g5p> map, EditorMessage.Source source) {
            this.a = map;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && this.b == kVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateToolParamsBatch(params=" + this.a + ", messageSource=" + this.b + ")";
        }
    }
}
