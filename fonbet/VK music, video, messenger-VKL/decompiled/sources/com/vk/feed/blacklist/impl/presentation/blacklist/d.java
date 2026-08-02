package com.vk.feed.blacklist.impl.presentation.blacklist;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.shy;
import xsna.v11;
import xsna.vu5;
import xsna.xl50;

/* compiled from: BlacklistPatch.kt */
/* loaded from: classes18.dex */
public abstract class d implements xl50 {

    /* compiled from: BlacklistPatch.kt */
    public static final class a extends d {
        public static final a b = new a();
    }

    /* compiled from: BlacklistPatch.kt */
    public static final class b extends d {
        public final List<UserId> b;
        public final Map<UserId, UserProfile> c;
        public final Map<UserId, Group> d;
        public final int e;
        public final int f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<UserId> list, Map<UserId, ? extends UserProfile> map, Map<UserId, ? extends Group> map2, int i, int i2) {
            this.b = list;
            this.c = map;
            this.d = map2;
            this.e = i;
            this.f = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + shy.a(this.e, v11.a(v11.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateItems(ownerIds=");
            sb.append(this.b);
            sb.append(", profiles=");
            sb.append(this.c);
            sb.append(", groups=");
            sb.append(this.d);
            sb.append(", total=");
            sb.append(this.e);
            sb.append(", offset=");
            return vu5.b(sb, this.f, ')');
        }
    }
}
