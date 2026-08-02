package com.vk.catalog2.common.ui.mvp.holder.header;

import android.view.View;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.topbar.VkTopBar;
import xsna.br;
import xsna.dko;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.ipi;
import xsna.qoy;
import xsna.s3q0;
import xsna.uf3;
import xsna.urd0;
import xsna.yfi0;

/* compiled from: VkTopBarSearchQueryVh.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: VkTopBarSearchQueryVh.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.holder.header.a$a, reason: collision with other inner class name */
    public static final class C0504a implements a {
        public final View a;

        public C0504a(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0504a) && epx.f(this.a, ((C0504a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return br.b(new StringBuilder("Custom(view="), this.a, ')');
        }
    }

    /* compiled from: VkTopBarSearchQueryVh.kt */
    public static final class b implements a {
        public final dko a;
        public final String b;
        public final boolean c;
        public final ipi d;
        public final VkTopBar.l e;
        public final SemanticsConfiguration f;
        public final gzs<s3q0> g;

        public b() {
            throw null;
        }

        public /* synthetic */ b(dko dkoVar, String str, VkTopBar.l lVar, com.vk.core.compose.component.semantics.a aVar, int i) {
            this(dkoVar, str, true, null, (i & 16) != 0 ? null : lVar, aVar, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v5, types: [xsna.dko] */
        public static b a(b bVar, gko gkoVar, String str, ipi ipiVar, gzs gzsVar, int i) {
            gko gkoVar2 = gkoVar;
            if ((i & 1) != 0) {
                gkoVar2 = bVar.a;
            }
            gko gkoVar3 = gkoVar2;
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            String str2 = str;
            boolean z = bVar.c;
            if ((i & 8) != 0) {
                ipiVar = bVar.d;
            }
            ipi ipiVar2 = ipiVar;
            VkTopBar.l lVar = bVar.e;
            SemanticsConfiguration semanticsConfiguration = bVar.f;
            if ((i & 64) != 0) {
                gzsVar = bVar.g;
            }
            bVar.getClass();
            return new b(gkoVar3, str2, z, ipiVar2, lVar, semanticsConfiguration, gzsVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            boolean equals;
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e)) {
                        SemanticsConfiguration semanticsConfiguration = bVar.f;
                        SemanticsConfiguration semanticsConfiguration2 = this.f;
                        if (semanticsConfiguration2 == null) {
                            if (semanticsConfiguration == null) {
                                equals = true;
                                if (equals && epx.f(this.g, bVar.g)) {
                                }
                            }
                            equals = false;
                            if (equals) {
                            }
                        } else {
                            if (semanticsConfiguration != null) {
                                equals = semanticsConfiguration2.equals(semanticsConfiguration);
                                if (equals) {
                                }
                            }
                            equals = false;
                            if (equals) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            ipi ipiVar = this.d;
            int hashCode = (b + (ipiVar == null ? 0 : ipiVar.hashCode())) * 31;
            VkTopBar.l lVar = this.e;
            int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
            SemanticsConfiguration semanticsConfiguration = this.f;
            int hashCode3 = (hashCode2 + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode())) * 31;
            gzs<s3q0> gzsVar = this.g;
            return hashCode3 + (gzsVar != null ? gzsVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Icon(drawable=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            sb.append(this.b);
            sb.append(", enabled=");
            sb.append(this.c);
            sb.append(", tintColor=");
            sb.append(this.d);
            sb.append(", topMarker=");
            sb.append(this.e);
            sb.append(", semanticsConfiguration=");
            SemanticsConfiguration semanticsConfiguration = this.f;
            sb.append((Object) (semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration)));
            sb.append(", onClick=");
            return uf3.d(sb, this.g, ')');
        }

        public b(dko dkoVar, String str, boolean z, ipi ipiVar, VkTopBar.l lVar, SemanticsConfiguration semanticsConfiguration, gzs gzsVar) {
            this.a = dkoVar;
            this.b = str;
            this.c = z;
            this.d = ipiVar;
            this.e = lVar;
            this.f = semanticsConfiguration;
            this.g = gzsVar;
        }
    }
}
