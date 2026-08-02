package com.vk.photo.editor.ivm;

import java.util.HashMap;
import java.util.Map;
import xsna.asp;
import xsna.epx;
import xsna.f5p;
import xsna.g5p;
import xsna.i4p;
import xsna.n23;
import xsna.v11;
import xsna.zrp;

/* compiled from: EditorMessage.kt */
/* loaded from: classes4.dex */
public interface EditorMessage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EditorMessage.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source History;
        public static final Source Synthetic;
        public static final Source UserInput;

        static {
            Source source = new Source("UserInput", 0);
            UserInput = source;
            Source source2 = new Source("History", 1);
            History = source2;
            Source source3 = new Source("Synthetic", 2);
            Synthetic = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: EditorMessage.kt */
    public static final class a implements EditorMessage {
        public static final a a = new a();
    }

    /* compiled from: EditorMessage.kt */
    public static final class b implements EditorMessage {
        public static final b a = new b();
    }

    /* compiled from: EditorMessage.kt */
    public static final class c implements EditorMessage {
        public static final c a = new c();
    }

    /* compiled from: EditorMessage.kt */
    public static final class d implements EditorMessage {
        public static final d a = new d();
    }

    /* compiled from: EditorMessage.kt */
    public static final class e implements EditorMessage {
        public final f5p a;

        public e(f5p f5pVar) {
            this.a = f5pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SaveToolParams(contextToolId=" + this.a + ")";
        }
    }

    /* compiled from: EditorMessage.kt */
    public static final class f implements EditorMessage {
        public final i4p a;
        public final Map<f5p, g5p> b;
        public final boolean c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(i4p i4pVar, Map<f5p, ? extends g5p> map, boolean z) {
            this.a = i4pVar;
            this.b = map;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && this.c == fVar.c;
        }

        public final int hashCode() {
            i4p i4pVar = this.a;
            return Boolean.hashCode(this.c) + v11.a((i4pVar == null ? 0 : i4pVar.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetImage(imageState=");
            sb.append(this.a);
            sb.append(", toolParams=");
            sb.append(this.b);
            sb.append(", resetHistory=");
            return n23.b(sb, this.c, ")");
        }
    }

    /* compiled from: EditorMessage.kt */
    public static final class g implements EditorMessage {
        public static final g a = new g();
    }

    /* compiled from: EditorMessage.kt */
    public static final class h implements EditorMessage {
        public final i4p a;

        public h(i4p i4pVar) {
            this.a = i4pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
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

    /* compiled from: EditorMessage.kt */
    public static final class i implements EditorMessage {
        public final g5p a;
        public final Source b;
        public final boolean c;

        public i(g5p g5pVar, Source source, int i) {
            source = (i & 2) != 0 ? Source.Synthetic : source;
            boolean z = (i & 4) == 0;
            this.a = g5pVar;
            this.b = source;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateToolParams(params=");
            sb.append(this.a);
            sb.append(", source=");
            sb.append(this.b);
            sb.append(", saveToHistory=");
            return n23.b(sb, this.c, ")");
        }
    }

    /* compiled from: EditorMessage.kt */
    public static final class j implements EditorMessage {
        public final Map<f5p, g5p> a;
        public final Source b;

        public j() {
            throw null;
        }

        public j(HashMap hashMap) {
            Source source = Source.Synthetic;
            this.a = hashMap;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && this.b == jVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateToolParamsBatch(params=" + this.a + ", source=" + this.b + ")";
        }
    }
}
