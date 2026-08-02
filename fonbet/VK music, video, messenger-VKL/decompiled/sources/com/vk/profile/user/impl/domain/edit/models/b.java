package com.vk.profile.user.impl.domain.edit.models;

import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import defpackage.q0;

/* compiled from: ExternalEvent.kt */
/* loaded from: classes5.dex */
public final class b implements ExternalEvent.b {
    public final boolean a;
    public final boolean b;

    public b(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Onboarding(isFollowersModeEnabled=");
        sb.append(this.a);
        sb.append(", showActionButton=");
        return q0.a(sb, this.b, ')');
    }
}
