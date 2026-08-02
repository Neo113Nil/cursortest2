package com.vk.im.engine.reporters.syncstate;

import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.fr;
import xsna.kr6;
import xsna.msy;
import xsna.ry3;

/* compiled from: StatPostponeEngine.kt */
/* loaded from: classes2.dex */
public final class c {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new kr6(22));
    public final HashMap b = new HashMap();

    /* compiled from: StatPostponeEngine.kt */
    public static final class a {
        public final ImSyncStateStatReporter.Target a;
        public final LinkedHashSet b;
        public final ry3 c;

        public a(ImSyncStateStatReporter.Target target, LinkedHashSet linkedHashSet, ry3 ry3Var) {
            this.a = target;
            this.b = linkedHashSet;
            this.c = ry3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Job(tag=" + this.a + ", timings=" + this.b + ", call=" + this.c + ')';
        }
    }

    public c(fr frVar) {
    }
}
