package com.vk.repository.data.api;

import android.location.Location;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import defpackage.q0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.b1;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.subjects.h;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.asp;
import xsna.dq;
import xsna.epx;
import xsna.izs;
import xsna.qoy;
import xsna.xic;
import xsna.zrp;

/* compiled from: ExtendedProfilesRepository.kt */
/* loaded from: classes5.dex */
public interface ExtendedProfilesRepository extends xic {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfilesRepository.kt */
    public static final class LoadStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadStrategy[] $VALUES;
        public static final LoadStrategy CACHE_FIRST;
        public static final LoadStrategy ONLY_CACHE;
        public static final LoadStrategy RELOAD;

        static {
            LoadStrategy loadStrategy = new LoadStrategy("ONLY_CACHE", 0);
            ONLY_CACHE = loadStrategy;
            LoadStrategy loadStrategy2 = new LoadStrategy("CACHE_FIRST", 1);
            CACHE_FIRST = loadStrategy2;
            LoadStrategy loadStrategy3 = new LoadStrategy("RELOAD", 2);
            RELOAD = loadStrategy3;
            LoadStrategy[] loadStrategyArr = {loadStrategy, loadStrategy2, loadStrategy3};
            $VALUES = loadStrategyArr;
            $ENTRIES = new asp(loadStrategyArr);
        }

        public LoadStrategy() {
            throw null;
        }

        public static LoadStrategy valueOf(String str) {
            return (LoadStrategy) Enum.valueOf(LoadStrategy.class, str);
        }

        public static LoadStrategy[] values() {
            return (LoadStrategy[]) $VALUES.clone();
        }
    }

    /* compiled from: ExtendedProfilesRepository.kt */
    public static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public b(String str, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabPinningInfo(tabName=");
            sb.append(this.a);
            sb.append(", pin=");
            sb.append(this.b);
            sb.append(", private=");
            sb.append(this.c);
            sb.append(", onlyMobile=");
            return q0.a(sb, this.d, ')');
        }
    }

    void D(b bVar);

    r L(UserId userId);

    ExtendedUserProfile L0(UserId userId);

    b1 P(int i, UserId userId);

    j1 S0(a aVar);

    b1 T(int i, UserId userId);

    io.reactivex.rxjava3.internal.operators.observable.a X(com.vk.repository.data.api.a aVar, ListBuilder listBuilder);

    q<List<ExtendedUserProfile.m>> b(UserId userId, boolean z);

    b1 b0(UserId userId);

    h e();

    b1 l(int i, UserId userId);

    void u0(b bVar);

    io.reactivex.rxjava3.internal.operators.observable.a w(com.vk.repository.data.api.a aVar);

    /* compiled from: ExtendedProfilesRepository.kt */
    public static final class a {
        public final UserId a;
        public final boolean b;
        public final izs<List<UserId>, List<UserProfile>> c;
        public final izs<MusicTrack, String> d;
        public final LoadStrategy e;
        public final String f;
        public final Location g;
        public final String h;
        public final boolean i;
        public final boolean j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(UserId userId, boolean z, izs<? super List<UserId>, ? extends List<? extends UserProfile>> izsVar, izs<? super MusicTrack, String> izsVar2, LoadStrategy loadStrategy, String str, Location location, String str2, boolean z2, boolean z3) {
            this.a = userId;
            this.b = z;
            this.c = izsVar;
            this.d = izsVar2;
            this.e = loadStrategy;
            this.f = str;
            this.g = location;
            this.h = str2;
            this.i = z2;
            this.j = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j;
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + dq.c(dq.c(qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
            String str = this.f;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Location location = this.g;
            int hashCode3 = (hashCode2 + (location == null ? 0 : location.hashCode())) * 31;
            String str2 = this.h;
            return Boolean.hashCode(this.j) + qoy.b((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadCommunityParams(id=");
            sb.append(this.a);
            sb.append(", needClips=");
            sb.append(this.b);
            sb.append(", friendsByIdProvider=");
            sb.append(this.c);
            sb.append(", audioActivityTextProvider=");
            sb.append(this.d);
            sb.append(", loadStrategy=");
            sb.append(this.e);
            sb.append(", parentRef=");
            sb.append(this.f);
            sb.append(", location=");
            sb.append(this.g);
            sb.append(", additionalFields=");
            sb.append(this.h);
            sb.append(", isDonutFriendsPreviewEnabled=");
            sb.append(this.i);
            sb.append(", isCreationOnboardingRequired=");
            return q0.a(sb, this.j, ')');
        }

        public /* synthetic */ a(UserId userId, izs izsVar, izs izsVar2, LoadStrategy loadStrategy, Location location, String str, int i) {
            this(userId, false, izsVar, izsVar2, (i & 16) != 0 ? LoadStrategy.RELOAD : loadStrategy, null, location, str, false, false);
        }
    }
}
