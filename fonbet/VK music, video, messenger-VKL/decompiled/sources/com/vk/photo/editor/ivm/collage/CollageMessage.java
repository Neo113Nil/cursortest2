package com.vk.photo.editor.ivm.collage;

import xsna.asp;
import xsna.epx;
import xsna.f0g;
import xsna.gq;
import xsna.n2k0;
import xsna.w0g;
import xsna.zrp;

/* compiled from: CollageMessage.kt */
/* loaded from: classes4.dex */
public interface CollageMessage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CollageMessage.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source Synthetic;
        public static final Source UserInput;

        static {
            Source source = new Source("UserInput", 0);
            UserInput = source;
            Source source2 = new Source("Synthetic", 1);
            Synthetic = source2;
            Source[] sourceArr = {source, source2};
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

    /* compiled from: CollageMessage.kt */
    public static final class a implements CollageMessage {
        public static final a a = new a();
    }

    /* compiled from: CollageMessage.kt */
    public static final class b implements CollageMessage {
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

    /* compiled from: CollageMessage.kt */
    public static final class c implements CollageMessage {
        public final w0g a;
        public final Float b;
        public final float c;
        public final float d;
        public final f0g e;
        public final Source f;

        public c(w0g w0gVar, Float f, float f2, float f3, f0g f0gVar, Source source) {
            this.a = w0gVar;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f0gVar;
            this.f = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && epx.f(this.e, cVar.e) && this.f == cVar.f;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Float f = this.b;
            return this.f.hashCode() + ((this.e.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, (hashCode + (f == null ? 0 : f.hashCode())) * 31, 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateParams(grid=");
            sb.append(this.a);
            sb.append(", format=");
            sb.append(this.b);
            sb.append(", borderWidth=");
            gq.h(sb, this.c, ", cornerRadius=", this.d, ", borderColor=");
            sb.append(this.e);
            sb.append(", source=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }
}
