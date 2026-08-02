package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeSuperappCouponItem {

    @pmi0("id")
    private final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeSuperappCouponItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeSuperappCouponItem) && epx.f(this.id, ((SchemeStat$TypeSuperappCouponItem) obj).id);
    }

    public final int hashCode() {
        String str = this.id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeSuperappCouponItem(id="), this.id, ')');
    }

    public SchemeStat$TypeSuperappCouponItem(String str) {
        this.id = str;
    }

    public /* synthetic */ SchemeStat$TypeSuperappCouponItem(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
