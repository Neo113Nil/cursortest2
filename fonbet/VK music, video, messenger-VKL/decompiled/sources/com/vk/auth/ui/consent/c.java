package com.vk.auth.ui.consent;

import com.vk.auth.ui.consent.g;
import defpackage.q0;
import xsna.epx;

/* compiled from: VkConsentScreenContract.kt */
/* loaded from: classes15.dex */
public final class c {
    public final g.b a;
    public final boolean b;

    public c(g.b bVar, boolean z) {
        this.a = bVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentAppUI(consentApp=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return q0.a(sb, this.b, ')');
    }
}
