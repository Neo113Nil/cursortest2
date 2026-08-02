package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.aay;
import xsna.dz5;
import xsna.epx;
import xsna.er;
import xsna.fw3;
import xsna.shy;
import xsna.urd0;

/* compiled from: GroupCollection.kt */
/* loaded from: classes18.dex */
public final class GroupCollection extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupCollection> CREATOR = new b();
    public static final a n = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Image g;
    public final Image h;
    public final List<Long> i;
    public final String j;
    public final int k;
    public final int l;
    public final Image m;

    /* compiled from: GroupCollection.kt */
    public static final class a extends aay<GroupCollection> {
        @Override // xsna.aay
        public final GroupCollection a(JSONObject jSONObject) {
            return new GroupCollection(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupCollection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupCollection a(Serializer serializer) {
            return new GroupCollection(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCollection[i];
        }
    }

    public GroupCollection(String str, String str2, String str3, String str4, String str5, Image image, Image image2, List<Long> list, String str6, int i, int i2, Image image3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = image;
        this.h = image2;
        this.i = list;
        this.j = str6;
        this.k = i;
        this.l = i2;
        this.m = image3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.a0(this.i);
        serializer.j0(this.j);
        serializer.S(this.k);
        serializer.S(this.l);
        serializer.i0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCollection)) {
            return false;
        }
        GroupCollection groupCollection = (GroupCollection) obj;
        return epx.f(this.b, groupCollection.b) && epx.f(this.c, groupCollection.c) && epx.f(this.d, groupCollection.d) && epx.f(this.e, groupCollection.e) && epx.f(this.f, groupCollection.f) && epx.f(this.g, groupCollection.g) && epx.f(this.h, groupCollection.h) && epx.f(this.i, groupCollection.i) && epx.f(this.j, groupCollection.j) && this.k == groupCollection.k && this.l == groupCollection.l && epx.f(this.m, groupCollection.m);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Image image = this.g;
        int hashCode = (a2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.h;
        int a3 = shy.a(this.l, shy.a(this.k, urd0.a(fw3.a((hashCode + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.i), 31, this.j), 31), 31);
        Image image3 = this.m;
        return a3 + (image3 != null ? image3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupCollection(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", shortDescription=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f);
        sb.append(", image=");
        sb.append(this.g);
        sb.append(", imageWide=");
        sb.append(this.h);
        sb.append(", groupIds=");
        sb.append(this.i);
        sb.append(", linkText=");
        sb.append(this.j);
        sb.append(", totalCollectionsCount=");
        sb.append(this.k);
        sb.append(", explorePosition=");
        sb.append(this.l);
        sb.append(", imageCard=");
        return er.d(sb, this.m, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCollection(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r7, r8, r9 == null ? EmptyList.b : r9, jSONObject.optString("link_text"), 0, jSONObject.optInt("explore_position", -1), new Image(jSONObject.optJSONArray("images_card"), null, 2, null));
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("name");
        String optString3 = jSONObject.optString("description");
        String optString4 = jSONObject.optString("short_description");
        String optString5 = jSONObject.optString("url");
        Image image = new Image(jSONObject.optJSONArray("images"), null, 2, null);
        Image image2 = new Image(jSONObject.optJSONArray("images_wide"), null, 2, null);
        List F = dz5.F(jSONObject.optJSONArray("group_ids"));
    }

    public GroupCollection(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), serializer.D(), serializer.H(), serializer.u(), serializer.u(), (Image) serializer.G(Image.class.getClassLoader()));
    }
}
