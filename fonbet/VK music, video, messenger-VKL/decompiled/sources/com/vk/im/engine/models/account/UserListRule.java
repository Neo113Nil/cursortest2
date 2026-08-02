package com.vk.im.engine.models.account;

import com.vk.core.serialize.Serializer;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.j5g;
import xsna.l4;
import xsna.rl3;
import xsna.zcl;

/* compiled from: PrivacySetting.kt */
/* loaded from: classes2.dex */
public final class UserListRule extends PrivacyRule {
    public static final Serializer.c<UserListRule> CREATOR = new a();
    public final UserListType b;
    public final Collection<Long> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UserListRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UserListRule a(Serializer serializer) {
            return new UserListRule(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserListRule[i];
        }
    }

    public UserListRule(UserListType userListType, Collection<Long> collection) {
        super(null);
        this.b = userListType;
        this.c = collection;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
        serializer.Z(j5g.P0(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserListRule)) {
            return false;
        }
        UserListRule userListRule = (UserListRule) obj;
        return this.b == userListRule.b && epx.f(this.c, userListRule.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserListRule(type=");
        sb.append(this.b);
        sb.append(", users=");
        return l4.h(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserListRule(Serializer serializer, zcl zclVar) {
        this(r3, r2 == null ? EmptyList.b : r2);
        UserListType userListType = UserListType.values()[serializer.u()];
        long[] e = serializer.e();
        List<Long> t0 = e != null ? rl3.t0(e) : null;
    }
}
