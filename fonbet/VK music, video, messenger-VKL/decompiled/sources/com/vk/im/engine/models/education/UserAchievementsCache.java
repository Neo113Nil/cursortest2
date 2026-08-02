package com.vk.im.engine.models.education;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: Achievements.kt */
/* loaded from: classes2.dex */
public final class UserAchievementsCache extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<UserAchievementsCache> CREATOR = new a();
    public final List<EduAchievement> b;
    public final long c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UserAchievementsCache> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UserAchievementsCache a(Serializer serializer) {
            return new UserAchievementsCache(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserAchievementsCache[i];
        }
    }

    public UserAchievementsCache(List<EduAchievement> list, long j) {
        this.b = list;
        this.c = j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.c);
        serializer.f0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAchievementsCache)) {
            return false;
        }
        UserAchievementsCache userAchievementsCache = (UserAchievementsCache) obj;
        return epx.f(this.b, userAchievementsCache.b) && this.c == userAchievementsCache.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAchievementsCache(achievements=");
        sb.append(this.b);
        sb.append(", syncTime=");
        return vu5.a(')', this.c, sb);
    }

    public UserAchievementsCache(Serializer serializer, zcl zclVar) {
        this(serializer.B(EduAchievement.class.getClassLoader()), serializer.w());
    }
}
