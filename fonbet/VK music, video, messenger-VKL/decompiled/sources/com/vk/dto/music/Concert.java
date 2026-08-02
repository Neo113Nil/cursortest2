package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.k9x;
import xsna.shy;
import xsna.swe0;
import xsna.urd0;
import xsna.z8x;

/* compiled from: Concert.kt */
/* loaded from: classes18.dex */
public final class Concert extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Concert> CREATOR = new b();
    public static final Concert l;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ConcertCity f;
    public final int g;
    public final String h;
    public final String i;
    public final List<String> j;
    public final Image k;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<Concert> {
        @Override // xsna.aay
        public final Concert a(JSONObject jSONObject) {
            return new Concert(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Concert> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Concert a(Serializer serializer) {
            return new Concert(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Concert[i];
        }
    }

    static {
        new a();
        l = new Concert("", "", "", "", ConcertCity.d, 0, "", "", EmptyList.b, Image.d);
    }

    public Concert(String str, String str2, String str3, String str4, ConcertCity concertCity, int i, String str5, String str6, List<String> list, Image image) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = concertCity;
        this.g = i;
        this.h = str5;
        this.i = str6;
        this.j = list;
        this.k = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
        serializer.S(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.l0(this.j);
        serializer.e0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Concert)) {
            return false;
        }
        Concert concert = (Concert) obj;
        return epx.f(this.b, concert.b) && epx.f(this.c, concert.c) && epx.f(this.d, concert.d) && epx.f(this.e, concert.e) && epx.f(this.f, concert.f) && this.g == concert.g && epx.f(this.h, concert.h) && epx.f(this.i, concert.i) && epx.f(this.j, concert.j) && epx.f(this.k, concert.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + fw3.a(urd0.a(urd0.a(shy.a(this.g, (this.f.hashCode() + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Concert(id=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Concert(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10, new Image(jSONObject.getJSONArray("image"), null, 2, null));
        List list;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("place_title");
        String optString4 = jSONObject.optString("age_category");
        ConcertCity concertCity = new ConcertCity(jSONObject.getJSONObject("city"));
        int optInt = jSONObject.optInt("min_price");
        String optString5 = jSONObject.optString("start_datetime");
        String optString6 = jSONObject.optString("page_url");
        JSONArray optJSONArray = jSONObject.optJSONArray("artists_ids");
        if (optJSONArray != null) {
            k9x q = swe0.q(0, optJSONArray.length());
            list = new ArrayList(c5g.u(q, 10));
            Iterator<Integer> it = q.iterator();
            while (it.hasNext()) {
                list.add(optJSONArray.getString(((z8x) it).nextInt()));
            }
        } else {
            list = EmptyList.b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Concert(Serializer serializer) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r14 == null ? Image.d : r14);
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str4 = H4 == null ? "" : H4;
        ConcertCity concertCity = (ConcertCity) serializer.G(ConcertCity.class.getClassLoader());
        if (concertCity == null) {
            Serializer.c<ConcertCity> cVar = ConcertCity.CREATOR;
            concertCity = ConcertCity.d;
        }
        ConcertCity concertCity2 = concertCity;
        int u = serializer.u();
        String H5 = serializer.H();
        String str5 = H5 == null ? "" : H5;
        String H6 = serializer.H();
        String str6 = H6 == null ? "" : H6;
        ArrayList D = serializer.D();
        Image image = (Image) serializer.G(Image.class.getClassLoader());
    }
}
