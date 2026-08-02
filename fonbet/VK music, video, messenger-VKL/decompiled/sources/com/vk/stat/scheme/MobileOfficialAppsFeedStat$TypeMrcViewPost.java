package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeMrcViewPost {
    public final transient String a;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("post_id")
    private final int postId;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeMrcViewPost>, a9y<MobileOfficialAppsFeedStat$TypeMrcViewPost> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeMrcViewPost(fai.q(x9yVar, "owner_id"), fai.p(x9yVar, "post_id"), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeMrcViewPost mobileOfficialAppsFeedStat$TypeMrcViewPost = (MobileOfficialAppsFeedStat$TypeMrcViewPost) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("owner_id", Long.valueOf(mobileOfficialAppsFeedStat$TypeMrcViewPost.a()));
            x9yVar.n("post_id", Integer.valueOf(mobileOfficialAppsFeedStat$TypeMrcViewPost.b()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeMrcViewPost.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeMrcViewPost(long j, int i, String str) {
        this.ownerId = j;
        this.postId = i;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final long a() {
        return this.ownerId;
    }

    public final int b() {
        return this.postId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeMrcViewPost)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeMrcViewPost mobileOfficialAppsFeedStat$TypeMrcViewPost = (MobileOfficialAppsFeedStat$TypeMrcViewPost) obj;
        return this.ownerId == mobileOfficialAppsFeedStat$TypeMrcViewPost.ownerId && this.postId == mobileOfficialAppsFeedStat$TypeMrcViewPost.postId && epx.f(this.a, mobileOfficialAppsFeedStat$TypeMrcViewPost.a);
    }

    public final int hashCode() {
        int a = shy.a(this.postId, Long.hashCode(this.ownerId) * 31, 31);
        String str = this.a;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMrcViewPost(ownerId=");
        sb.append(this.ownerId);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeMrcViewPost(long j, int i, String str, int i2, zcl zclVar) {
        this(j, i, (i2 & 4) != 0 ? null : str);
    }
}
