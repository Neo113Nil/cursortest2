package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.facebook.soloader.MinElf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.adq;
import xsna.la20;
import xsna.v8e0;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public final class j {
    public static volatile j b;
    public static final j c = new j(0);
    public final Map<a, GeneratedMessageLite.e<?, ?>> a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes12.dex */
    public static final class a {
        public final Object a;
        public final int b;

        public a(int i, la20 la20Var) {
            this.a = la20Var;
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

    public j() {
        this.a = new HashMap();
    }

    public static j a() {
        j jVar;
        v8e0 v8e0Var = v8e0.c;
        j jVar2 = b;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (j.class) {
            try {
                jVar = b;
                if (jVar == null) {
                    Class<?> cls = adq.a;
                    j jVar3 = null;
                    if (cls != null) {
                        try {
                            jVar3 = (j) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    jVar = jVar3 != null ? jVar3 : c;
                    b = jVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public j(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
