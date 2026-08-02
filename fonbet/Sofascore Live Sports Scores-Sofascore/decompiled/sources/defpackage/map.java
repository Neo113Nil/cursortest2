package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class map {
    public final Object fromJson(Reader reader) throws IOException {
        return read(new e7n(reader));
    }

    public final Object fromJsonTree(m9p m9pVar) {
        try {
            dep depVar = new dep(dep.t);
            depVar.p = new Object[32];
            depVar.q = 0;
            depVar.r = new String[32];
            depVar.s = new int[32];
            depVar.c1(m9pVar);
            return read(depVar);
        } catch (IOException e) {
            throw new o9p(16, e);
        }
    }

    public final map nullSafe() {
        return !(this instanceof jap) ? new jap(this) : this;
    }

    public abstract Object read(e7n e7nVar);

    public final String toJson(Object obj) {
        StringBuilder sb = new StringBuilder();
        try {
            toJson(new ihi(2, sb), obj);
            return sb.toString();
        } catch (IOException e) {
            throw new o9p(16, e);
        }
    }

    public final m9p toJsonTree(Object obj) {
        try {
            hep hepVar = new hep();
            write(hepVar, obj);
            ArrayList arrayList = hepVar.o;
            if (arrayList.isEmpty()) {
                return hepVar.q;
            }
            throw new IllegalStateException("Expected one JSON element but was ".concat(arrayList.toString()));
        } catch (IOException e) {
            throw new o9p(16, e);
        }
    }

    public abstract void write(f7n f7nVar, Object obj);

    public final Object fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, Object obj) throws IOException {
        write(new f7n(writer), obj);
    }
}
