package com.vk.catalog2.common.dto.api.search;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.subscription.api.SubscribeStatus;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.cqm0;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CatalogSearchEntityPerson.kt */
/* loaded from: classes16.dex */
public final class CatalogSearchEntityPerson extends SearchEntity {
    public static final Serializer.c<CatalogSearchEntityPerson> CREATOR = new b();
    public final long b;
    public final UserId c;
    public final String d;
    public final Image e;
    public final VerifyInfo f;
    public final boolean g;
    public final String h;
    public final String i;
    public final List<UserId> j;
    public final String k;
    public final String l;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSearchEntityPerson> {
        @Override // xsna.aay
        public final CatalogSearchEntityPerson a(JSONObject jSONObject) {
            return new CatalogSearchEntityPerson(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSearchEntityPerson> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSearchEntityPerson a(Serializer serializer) {
            return new CatalogSearchEntityPerson(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSearchEntityPerson[i];
        }
    }

    static {
        new a();
    }

    public CatalogSearchEntityPerson(long j, UserId userId, String str, Image image, VerifyInfo verifyInfo, boolean z, String str2, String str3, List<UserId> list, String str4, String str5) {
        super(null);
        this.b = j;
        this.c = userId;
        this.d = str;
        this.e = image;
        this.f = verifyInfo;
        this.g = z;
        this.h = str2;
        this.i = str3;
        this.j = list;
        this.k = str4;
        this.l = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.e0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.f0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSearchEntityPerson)) {
            return false;
        }
        CatalogSearchEntityPerson catalogSearchEntityPerson = (CatalogSearchEntityPerson) obj;
        return this.b == catalogSearchEntityPerson.b && epx.f(this.c, catalogSearchEntityPerson.c) && epx.f(this.d, catalogSearchEntityPerson.d) && epx.f(this.e, catalogSearchEntityPerson.e) && epx.f(this.f, catalogSearchEntityPerson.f) && this.g == catalogSearchEntityPerson.g && epx.f(this.h, catalogSearchEntityPerson.h) && epx.f(this.i, catalogSearchEntityPerson.i) && epx.f(this.j, catalogSearchEntityPerson.j) && epx.f(this.k, catalogSearchEntityPerson.k) && epx.f(this.l, catalogSearchEntityPerson.l);
    }

    @Override // com.vk.catalog2.common.dto.api.search.SearchEntity
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        int a2 = bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.e;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        VerifyInfo verifyInfo = this.f;
        int a3 = urd0.a(qoy.b((hashCode2 + (verifyInfo == null ? 0 : verifyInfo.hashCode())) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        int hashCode3 = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UserId> list = this.j;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.k;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
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
    public CatalogSearchEntityPerson(JSONObject jSONObject) {
        this(r3, r5, r6, r7, r8, r9, r10, r11, r2, f370.D(jSONObject, "followers_friends_count_text"), f370.D(jSONObject, "followers_total_count_text"));
        ArrayList arrayList;
        long j = jSONObject.getLong("id");
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        String a2 = cqm0.a(jSONObject.optString("track_code"));
        Serializer.c<Image> cVar = Image.CREATOR;
        Image b2 = Image.b.b(jSONObject);
        Serializer.c<VerifyInfo> cVar2 = VerifyInfo.CREATOR;
        VerifyInfo a3 = VerifyInfo.a.a(jSONObject);
        SubscribeStatus.a aVar = SubscribeStatus.Companion;
        int optInt = jSONObject.optInt("follower_status");
        aVar.getClass();
        boolean c = SubscribeStatus.a.c(SubscribeStatus.a.b(optInt));
        String string = jSONObject.getString("title");
        String a4 = cqm0.a(jSONObject.optString("subtitle"));
        JSONArray optJSONArray = jSONObject.optJSONArray("followers_friends_ids");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            int i = 0;
            while (i < length) {
                arrayList.add(new UserId(optJSONArray.getLong(i)));
                i++;
                optJSONArray = optJSONArray;
            }
        } else {
            arrayList = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSearchEntityPerson(Serializer serializer) {
        this(r1, r3, r4, r5, r6, r7, r8 == null ? "" : r8, serializer.H(), serializer.B(UserId.class.getClassLoader()), serializer.H(), serializer.H());
        long w = serializer.w();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        Image image = (Image) serializer.A(Image.class.getClassLoader());
        VerifyInfo verifyInfo = (VerifyInfo) serializer.A(VerifyInfo.class.getClassLoader());
        boolean m = serializer.m();
        String H2 = serializer.H();
    }
}
