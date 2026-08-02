package com.vk.core.view.components.topbar;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.epx;
import xsna.snx;
import xsna.tq;
import xsna.yfi0;

/* compiled from: VkTopBar.kt */
/* loaded from: classes17.dex */
public final class b {
    public final snx a;
    public final SemanticsConfiguration b;

    public b() {
        throw null;
    }

    public b(snx snxVar, com.vk.core.compose.component.semantics.a aVar, int i) {
        aVar = (i & 4) != 0 ? null : aVar;
        this.a = snxVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (epx.f(this.a, bVar.a)) {
                    SemanticsConfiguration semanticsConfiguration = bVar.b;
                    SemanticsConfiguration semanticsConfiguration2 = this.b;
                    if (semanticsConfiguration2 == null) {
                        if (semanticsConfiguration == null) {
                            equals = true;
                            if (equals) {
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
        int hashCode = this.a.hashCode() * 961;
        SemanticsConfiguration semanticsConfiguration = this.b;
        return hashCode + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(avatar=");
        sb.append(this.a);
        sb.append(", onClick=null, semanticsConfiguration=");
        SemanticsConfiguration semanticsConfiguration = this.b;
        return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
    }
}
