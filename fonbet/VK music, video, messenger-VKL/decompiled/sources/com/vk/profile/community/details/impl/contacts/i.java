package com.vk.profile.community.details.impl.contacts;

import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import defpackage.q0;
import java.util.List;
import xsna.epx;

/* compiled from: CommunityAddContactsViewState.kt */
/* loaded from: classes5.dex */
public final class i {
    public final List<CommunityAddContactsState.ContactField> a;
    public final boolean b;

    public i(List<CommunityAddContactsState.ContactField> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return epx.f(this.a, iVar.a) && this.b == iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityContactsViewData(fields=");
        sb.append(this.a);
        sb.append(", isSavingEnabled=");
        return q0.a(sb, this.b, ')');
    }
}
