package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: GroupsCategory.kt */
/* loaded from: classes18.dex */
public final class GroupsCategory extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupsCategory> CREATOR = new b();
    public static final a i = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Image g;
    public final String h;

    /* compiled from: GroupsCategory.kt */
    public static final class a extends aay<GroupsCategory> {
        @Override // xsna.aay
        public final GroupsCategory a(JSONObject jSONObject) {
            return new GroupsCategory(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupsCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupsCategory a(Serializer serializer) {
            return new GroupsCategory(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupsCategory[i];
        }
    }

    public GroupsCategory(String str, String str2, String str3, String str4, int i2, Image image, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = image;
        this.h = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCategory)) {
            return false;
        }
        GroupsCategory groupsCategory = (GroupsCategory) obj;
        return epx.f(this.b, groupsCategory.b) && epx.f(this.c, groupsCategory.c) && epx.f(this.d, groupsCategory.d) && epx.f(this.e, groupsCategory.e) && this.f == groupsCategory.f && epx.f(this.g, groupsCategory.g) && epx.f(this.h, groupsCategory.h);
    }

    public final int hashCode() {
        int a2 = shy.a(this.f, urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        Image image = this.g;
        return this.h.hashCode() + ((a2 + (image == null ? 0 : image.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCategory(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", subText=");
        sb.append(this.d);
        sb.append(", linkText=");
        sb.append(this.e);
        sb.append(", groupsCount=");
        sb.append(this.f);
        sb.append(", image=");
        sb.append(this.g);
        sb.append(", iconName=");
        return ho8.a(sb, this.h, ')');
    }

    public GroupsCategory(JSONObject jSONObject) {
        this(jSONObject.optString("id"), jSONObject.optString("name"), jSONObject.optString("subtext"), jSONObject.optString("link_text"), jSONObject.optInt("groups_count"), new Image(jSONObject.optJSONArray("images"), null, 2, null), jSONObject.optString("iconName"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupsCategory(Serializer serializer) {
        this(r3, r4, r5, r6, r7, r8, r11 == null ? "" : r11);
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str4 = H4 == null ? "" : H4;
        int u = serializer.u();
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        String H5 = serializer.H();
    }
}
