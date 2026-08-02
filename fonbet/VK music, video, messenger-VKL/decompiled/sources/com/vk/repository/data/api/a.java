package com.vk.repository.data.api;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import java.util.List;
import xsna.dq;
import xsna.epx;
import xsna.ho8;
import xsna.izs;
import xsna.qoy;

/* compiled from: LoadUserProfileParams.kt */
/* loaded from: classes5.dex */
public final class a {
    public final UserId a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final izs<List<UserId>, List<UserProfile>> h;
    public final izs<MusicTrack, String> i;
    public final ExtendedProfilesRepository.LoadStrategy j;
    public final String k;
    public final String l;
    public final String m;

    public a(UserId userId, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, izs izsVar, izs izsVar2, ExtendedProfilesRepository.LoadStrategy loadStrategy, String str2, String str3, String str4) {
        this.a = userId;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = z4;
        this.g = z5;
        this.h = izsVar;
        this.i = izsVar2;
        this.j = loadStrategy;
        this.k = str2;
        this.l = str3;
        this.m = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && this.j == aVar.j && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, false), 31, this.d);
        String str = this.e;
        int hashCode = (this.j.hashCode() + dq.c(dq.c(qoy.b(qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31;
        String str2 = this.k;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadUserProfileParams(id=");
        sb.append(this.a);
        sb.append(", needClips=");
        sb.append(this.b);
        sb.append(", needProfileFriendsBlock=");
        sb.append(this.c);
        sb.append(", needRecommendationsBlock=false, needProfileSubscriptionsBlock=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", trackEvents=");
        sb.append(this.f);
        sb.append(", isTablet=");
        sb.append(this.g);
        sb.append(", friendsByIdProvider=");
        sb.append(this.h);
        sb.append(", audioActivityTextProvider=");
        sb.append(this.i);
        sb.append(", loadStrategy=");
        sb.append(this.j);
        sb.append(", accessKey=");
        sb.append(this.k);
        sb.append(", parentRef=");
        sb.append(this.l);
        sb.append(", ref=");
        return ho8.a(sb, this.m, ')');
    }

    public /* synthetic */ a(UserId userId, izs izsVar, izs izsVar2) {
        this(userId, false, false, false, null, false, false, izsVar, izsVar2, ExtendedProfilesRepository.LoadStrategy.RELOAD, null, null, null);
    }
}
