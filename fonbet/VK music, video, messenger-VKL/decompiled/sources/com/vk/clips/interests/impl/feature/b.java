package com.vk.clips.interests.impl.feature;

import defpackage.q0;
import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.fld;
import xsna.jge;
import xsna.ms9;
import xsna.ur;
import xsna.xl50;

/* compiled from: ClipsInterestsPatch.kt */
/* loaded from: classes16.dex */
public interface b extends xl50 {

    /* compiled from: ClipsInterestsPatch.kt */
    public static final class a implements b {
        public static final a b = new a();
    }

    /* compiled from: ClipsInterestsPatch.kt */
    /* renamed from: com.vk.clips.interests.impl.feature.b$b, reason: collision with other inner class name */
    public static final class C0620b implements b {
        public final boolean b;

        public C0620b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0620b) && this.b == ((C0620b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("MoveToFlowFinishedState(withResetUi="), this.b, ')');
        }
    }

    /* compiled from: ClipsInterestsPatch.kt */
    public static final class c implements b {
        public final List<jge.b> b;

        public c(List<jge.b> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("MoveToSubcategories(suggestedSubcategories="), this.b);
        }
    }

    /* compiled from: ClipsInterestsPatch.kt */
    public static final class d implements b {
        public static final d b = new d();
    }

    /* compiled from: ClipsInterestsPatch.kt */
    public static final class e implements b {
        public final List<jge.b> b;
        public final Set<fld> c;

        public e(Set set, List list) {
            this.b = list;
            this.c = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectedItemsChanged(suggestedSubcategories=");
            sb.append(this.b);
            sb.append(", selectedIds=");
            return ur.c(sb, this.c, ')');
        }
    }
}
