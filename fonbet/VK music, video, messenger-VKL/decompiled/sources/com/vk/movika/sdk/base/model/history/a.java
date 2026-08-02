package com.vk.movika.sdk.base.model.history;

import xsna.epx;

/* loaded from: classes3.dex */
public final class a {
    public final String a;
    public final boolean b;

    public a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryBranch(branchId=" + this.a + ", autoSelect=" + this.b + ")";
    }
}
