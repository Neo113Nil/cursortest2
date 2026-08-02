package com.vk.dto.music;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import defpackage.q0;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.lrk;
import xsna.qoy;

/* compiled from: Episode.kt */
/* loaded from: classes18.dex */
public final class Episode extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Episode> CREATOR = new b();
    public final int b;
    public boolean c;
    public long d;
    public final String e;
    public final Image f;
    public final String g;
    public final String h;
    public final String i;
    public final LinkButton j;
    public final boolean k;

    /* compiled from: Episode.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static Episode a(JSONObject jSONObject) {
            JSONArray optJSONArray;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt("plays");
            boolean optBoolean = jSONObject.optBoolean("is_favorite");
            long optInt2 = 1000 * jSONObject.optInt(X3.i.L);
            String optString = jSONObject.optString("description");
            JSONObject optJSONObject = jSONObject.optJSONObject("cover");
            Image image = (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("sizes")) == null) ? null : new Image(optJSONArray, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            String optString2 = jSONObject.optString("post", null);
            String optString3 = jSONObject.optString("restriction_description");
            String optString4 = jSONObject.optString("restriction_text");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("restriction_button");
            return new Episode(optInt, optBoolean, optInt2, optString, image, optString2, optString3, optString4, optJSONObject2 != null ? new LinkButton(optJSONObject2) : null, jSONObject.optBoolean("is_donut"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Episode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Episode a(Serializer serializer) {
            return new Episode(serializer.u(), serializer.m(), serializer.w(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Episode[i];
        }
    }

    public Episode(int i, boolean z, long j, String str, Image image, String str2, String str3, String str4, LinkButton linkButton, boolean z2) {
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = str;
        this.f = image;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = linkButton;
        this.k = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.Y(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.i0(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new lrk(this, 9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        return this.b == episode.b && this.c == episode.c && this.d == episode.d && epx.f(this.e, episode.e) && epx.f(this.f, episode.f) && epx.f(this.g, episode.g) && epx.f(this.h, episode.h) && epx.f(this.i, episode.i) && epx.f(this.j, episode.j) && this.k == episode.k;
    }

    public final int hashCode() {
        int a2 = bh10.a(qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LinkButton linkButton = this.j;
        return Boolean.hashCode(this.k) + ((hashCode5 + (linkButton != null ? linkButton.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Episode(plays=");
        sb.append(this.b);
        sb.append(", isFavourite=");
        sb.append(this.c);
        sb.append(", positionMs=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", cover=");
        sb.append(this.f);
        sb.append(", postId=");
        sb.append(this.g);
        sb.append(", restrictionDescription=");
        sb.append(this.h);
        sb.append(", restrictionText=");
        sb.append(this.i);
        sb.append(", restrictionButton=");
        sb.append(this.j);
        sb.append(", isDonut=");
        return q0.a(sb, this.k, ')');
    }

    public final boolean zb() {
        return this.c;
    }
}
