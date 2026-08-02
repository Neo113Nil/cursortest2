package com.vk.catalog2.common.dto.api.search;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.subscription.api.SubscribeStatus;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.cqm0;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CatalogSearchEntityVideoPlaylist.kt */
/* loaded from: classes16.dex */
public final class CatalogSearchEntityVideoPlaylist extends SearchEntity {
    public static final Serializer.c<CatalogSearchEntityVideoPlaylist> CREATOR = new b();
    public final long b;
    public final UserId c;
    public final long d;
    public final String e;
    public final Image f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSearchEntityVideoPlaylist> {
        @Override // xsna.aay
        public final CatalogSearchEntityVideoPlaylist a(JSONObject jSONObject) {
            return new CatalogSearchEntityVideoPlaylist(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSearchEntityVideoPlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSearchEntityVideoPlaylist a(Serializer serializer) {
            return new CatalogSearchEntityVideoPlaylist(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSearchEntityVideoPlaylist[i];
        }
    }

    static {
        new a();
    }

    public CatalogSearchEntityVideoPlaylist(long j, UserId userId, long j2, String str, Image image, boolean z, String str2, String str3, String str4, String str5) {
        super(null);
        this.b = j;
        this.c = userId;
        this.d = j2;
        this.e = str;
        this.f = image;
        this.g = z;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.e0(this.c);
        serializer.Y(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSearchEntityVideoPlaylist)) {
            return false;
        }
        CatalogSearchEntityVideoPlaylist catalogSearchEntityVideoPlaylist = (CatalogSearchEntityVideoPlaylist) obj;
        return this.b == catalogSearchEntityVideoPlaylist.b && epx.f(this.c, catalogSearchEntityVideoPlaylist.c) && this.d == catalogSearchEntityVideoPlaylist.d && epx.f(this.e, catalogSearchEntityVideoPlaylist.e) && epx.f(this.f, catalogSearchEntityVideoPlaylist.f) && this.g == catalogSearchEntityVideoPlaylist.g && epx.f(this.h, catalogSearchEntityVideoPlaylist.h) && epx.f(this.i, catalogSearchEntityVideoPlaylist.i) && epx.f(this.j, catalogSearchEntityVideoPlaylist.j) && epx.f(this.k, catalogSearchEntityVideoPlaylist.k);
    }

    @Override // com.vk.catalog2.common.dto.api.search.SearchEntity
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f;
        int a3 = urd0.a(qoy.b((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        int hashCode2 = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSearchEntityAnswer(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.h);
        sb.append(", subtitle=");
        return ho8.a(sb, this.i, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSearchEntityVideoPlaylist(JSONObject jSONObject) {
        this(r2, r4, r5, r7, r8, SubscribeStatus.a.c(SubscribeStatus.a.b(r1)), jSONObject.getString("title"), cqm0.a(jSONObject.optString("subtitle")), f370.D(jSONObject, "followers_total_count_text"), f370.D(jSONObject, "videos_total_count_text"));
        long j = jSONObject.getLong("id");
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        long j2 = jSONObject.getLong("playlist_id");
        String a2 = cqm0.a(jSONObject.optString("track_code"));
        Serializer.c<Image> cVar = Image.CREATOR;
        Image b2 = Image.b.b(jSONObject);
        SubscribeStatus.a aVar = SubscribeStatus.Companion;
        int optInt = jSONObject.optInt("follower_status");
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSearchEntityVideoPlaylist(Serializer serializer) {
        this(r1, r3, r4, r6, r7, r8, r0 == null ? "" : r0, serializer.H(), serializer.H(), serializer.H());
        long w = serializer.w();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        long w2 = serializer.w();
        String H = serializer.H();
        Image image = (Image) serializer.A(Image.class.getClassLoader());
        boolean m = serializer.m();
        String H2 = serializer.H();
    }
}
