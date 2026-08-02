package com.vk.newsfeed.api.data.discover;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.discover.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.xuo0;
import xsna.zcl;

/* compiled from: NewsEntriesContainer.kt */
/* loaded from: classes3.dex */
public final class NewsEntriesContainer extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NewsEntriesContainer> CREATOR = new a();
    public final Info b;
    public final List<NewsEntry> c;

    /* compiled from: NewsEntriesContainer.kt */
    public static final class Info extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Info> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final long f;
        public boolean g;
        public final long h;
        public final long i;
        public final long j;
        public final long k;
        public final String l;
        public final NewsPageCacheConfig m;
        public transient boolean n;
        public transient com.vk.newsfeed.api.data.discover.a o;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Info> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Info a(Serializer serializer) {
                return new Info(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.w(), serializer.m(), serializer.w(), serializer.w(), serializer.w(), serializer.w(), serializer.H(), (NewsPageCacheConfig) serializer.G(NewsPageCacheConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info() {
            this(null, null, null, null, 0L, false, 0L, 0L, 0L, 0L, null, null, 4095, null);
        }

        public static Info zb(Info info, long j, long j2) {
            String str = info.b;
            String str2 = info.c;
            String str3 = info.d;
            String str4 = info.e;
            long j3 = info.f;
            boolean z = info.g;
            long j4 = info.j;
            long j5 = info.k;
            String str5 = info.l;
            NewsPageCacheConfig newsPageCacheConfig = info.m;
            info.getClass();
            return new Info(str, str2, str3, str4, j3, z, j, j2, j4, j5, str5, newsPageCacheConfig);
        }

        public final long Ab() {
            return this.f;
        }

        public final long Bb() {
            return this.i;
        }

        public final boolean Cb() {
            return this.g;
        }

        public final long Db() {
            return this.h;
        }

        public final void Eb() {
            this.g = true;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.Y(this.f);
            serializer.L(this.g ? (byte) 1 : (byte) 0);
            serializer.Y(this.h);
            serializer.Y(this.i);
            serializer.Y(this.j);
            serializer.Y(this.k);
            serializer.j0(this.l);
            serializer.i0(this.m);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return epx.f(this.b, info.b) && epx.f(this.c, info.c) && epx.f(this.d, info.d) && epx.f(this.e, info.e) && this.f == info.f && this.g == info.g && this.h == info.h && this.i == info.i && this.j == info.j && this.k == info.k && epx.f(this.l, info.l) && epx.f(this.m, info.m);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int a2 = bh10.a(bh10.a(bh10.a(bh10.a(qoy.b(bh10.a((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
            String str5 = this.l;
            int hashCode4 = (a2 + (str5 == null ? 0 : str5.hashCode())) * 31;
            NewsPageCacheConfig newsPageCacheConfig = this.m;
            return hashCode4 + (newsPageCacheConfig != null ? newsPageCacheConfig.hashCode() : 0);
        }

        public final String toString() {
            return "Info(nextFrom=" + this.b + ", title=" + this.c + ", feedId=" + this.d + ", refer=" + this.e + ", loadTime=" + this.f + ", showed=" + this.g + ", ttl=" + this.h + ", seenTtl=" + this.i + ", requestedAt=" + this.j + ", createdAt=" + this.k + ", startFrom=" + this.l + ", cacheConfig=" + this.m + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Info(DiscoverId discoverId) {
            this(r1, discoverId.e, discoverId.b, null, 0L, false, discoverId.g, discoverId.h, 0L, 0L, null, null, 3897, null);
            String str = null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Info(String str, String str2, String str3, String str4, long j, boolean z, long j2, long j3, long j4, long j5, String str5, NewsPageCacheConfig newsPageCacheConfig, int i, zcl zclVar) {
            this(r1, r3, r4, r5, r6, r8, r12, r10, r14, r16, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : newsPageCacheConfig);
            long j6;
            String str6 = (i & 1) != 0 ? null : str;
            String str7 = (i & 2) != 0 ? null : str2;
            String str8 = (i & 4) != 0 ? null : str3;
            String str9 = (i & 8) != 0 ? null : str4;
            long currentTimeMillis = (i & 16) != 0 ? System.currentTimeMillis() : j;
            boolean z2 = (i & 32) != 0 ? false : z;
            long j7 = (i & 64) != 0 ? -1L : j2;
            long j8 = (i & 128) == 0 ? j3 : -1L;
            long j9 = (i & 256) != 0 ? 0L : j4;
            if ((i & 512) != 0) {
                xuo0.a.getClass();
                j6 = xuo0.a();
            } else {
                j6 = j5;
            }
        }

        public Info(String str, String str2, String str3, String str4, long j, boolean z, long j2, long j3, long j4, long j5, String str5, NewsPageCacheConfig newsPageCacheConfig) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = j;
            this.g = z;
            this.h = j2;
            this.i = j3;
            this.j = j4;
            this.k = j5;
            this.l = str5;
            this.m = newsPageCacheConfig;
            this.o = a.C1366a.a;
        }
    }

    /* compiled from: NewsEntriesContainer.kt */
    public static final class NewsPageCacheConfig implements Serializer.StreamParcelable {
        public final long b;
        public static final long c = TimeUnit.HOURS.toSeconds(3);
        public static final Serializer.c<NewsPageCacheConfig> CREATOR = new b();

        /* compiled from: NewsEntriesContainer.kt */
        public static final class a {
            public static NewsPageCacheConfig a(JSONObject jSONObject) {
                return new NewsPageCacheConfig(jSONObject.optLong("item_ttl", NewsPageCacheConfig.c));
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<NewsPageCacheConfig> {
            @Override // com.vk.core.serialize.Serializer.c
            public final NewsPageCacheConfig a(Serializer serializer) {
                return new NewsPageCacheConfig(serializer.w());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewsPageCacheConfig[i];
            }
        }

        public NewsPageCacheConfig(long j) {
            this.b = j;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.Y(this.b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NewsEntriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsEntriesContainer a(Serializer serializer) {
            return new NewsEntriesContainer((Info) serializer.G(Info.class.getClassLoader()), serializer.k(NewsEntry.class));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsEntriesContainer[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsEntriesContainer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.c);
        serializer.i0(this.b);
    }

    public final List<NewsEntry> getItems() {
        return this.c;
    }

    public final Info zb() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NewsEntriesContainer(DiscoverId discoverId) {
        this(new Info(r1, discoverId.e, discoverId.b, null, 0L, false, discoverId.g, discoverId.h, 0L, 0L, null, null, 3897, null), r1, 2, 0 == true ? 1 : 0);
        String str = null;
        Object[] objArr = 0 == true ? 1 : 0;
    }

    public /* synthetic */ NewsEntriesContainer(Info info, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? new Info(null, null, null, null, 0L, false, 0L, 0L, 0L, 0L, null, null, 4095, null) : info, (i & 2) != 0 ? new ArrayList() : list);
    }

    public NewsEntriesContainer(Info info, List<NewsEntry> list) {
        this.b = info;
        this.c = list;
    }
}
