package com.vk.folders.impl.configure;

import java.util.Set;
import xsna.epx;
import xsna.fw3;
import xsna.vl50;

/* compiled from: FolderConfigurationNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class e implements vl50 {

    /* compiled from: FolderConfigurationNavigationEvent.kt */
    public static final class a extends e {
        public final Set<Long> a;
        public final Set<Long> b;
        public final com.vk.folders.impl.configure.a c;

        public a(Set<Long> set, Set<Long> set2, com.vk.folders.impl.configure.a aVar) {
            this.a = set;
            this.b = set2;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "AddPeersEvent(alreadySelected=" + this.a + ", alreadyUnselected=" + this.b + ", configurationMode=" + this.c + ')';
        }
    }

    /* compiled from: FolderConfigurationNavigationEvent.kt */
    public static final class b extends e {
        public static final b a = new b();
    }

    /* compiled from: FolderConfigurationNavigationEvent.kt */
    public static final class c extends e {
        public static final c a = new c();
    }
}
