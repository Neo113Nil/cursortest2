package com.google.crypto.tink.shaded.protobuf;

import com.facebook.soloader.MinElf;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.ka20;
import xsna.ycq;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public final class k {
    public static volatile k b;
    public static final k c = new k(0);
    public final Map<a, GeneratedMessageLite.e<?, ?>> a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes13.dex */
    public static final class a {
        public final Object a;
        public final int b;

        public a(int i, ka20 ka20Var) {
            this.a = ka20Var;
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

    public k() {
        this.a = new HashMap();
    }

    public static k a() {
        k kVar;
        k kVar2 = b;
        if (kVar2 != null) {
            return kVar2;
        }
        synchronized (k.class) {
            try {
                kVar = b;
                if (kVar == null) {
                    Class<?> cls = ycq.a;
                    k kVar3 = null;
                    if (cls != null) {
                        try {
                            kVar3 = (k) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    kVar = kVar3 != null ? kVar3 : c;
                    b = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public k(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
