package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import com.facebook.soloader.MinElf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.ja20;
import xsna.s8e0;
import xsna.xcq;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes12.dex */
public final class v {
    public static volatile v b;
    public static final v c = new v(0);
    public final Map<a, GeneratedMessageLite.e<?, ?>> a;

    /* compiled from: ExtensionRegistryLite.java */
    public static final class a {
        public final Object a;
        public final int b;

        public a(int i, ja20 ja20Var) {
            this.a = ja20Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * MinElf.PN_XNUM) + this.b;
        }
    }

    public v() {
        this.a = new HashMap();
    }

    public static v a() {
        v vVar;
        s8e0 s8e0Var = s8e0.c;
        v vVar2 = b;
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (v.class) {
            try {
                vVar = b;
                if (vVar == null) {
                    Class<?> cls = xcq.a;
                    v vVar3 = null;
                    if (cls != null) {
                        try {
                            vVar3 = (v) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    vVar = vVar3 != null ? vVar3 : c;
                    b = vVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public v(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
