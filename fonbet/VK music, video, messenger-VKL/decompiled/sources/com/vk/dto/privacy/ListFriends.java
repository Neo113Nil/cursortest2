package com.vk.dto.privacy;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: ListFriends.kt */
/* loaded from: classes18.dex */
public final class ListFriends extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ListFriends> CREATOR = new b();
    public final int b;
    public final String c;

    /* compiled from: ListFriends.kt */
    public static final class a {
        public static ListFriends a(JSONObject jSONObject) {
            return new ListFriends(jSONObject.getInt("id"), jSONObject.getString("name"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ListFriends> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ListFriends a(Serializer serializer) {
            return new ListFriends(serializer.u(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ListFriends[i];
        }
    }

    public ListFriends(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListFriends)) {
            return false;
        }
        ListFriends listFriends = (ListFriends) obj;
        return this.b == listFriends.b && epx.f(this.c, listFriends.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListFriends(id=");
        sb.append(this.b);
        sb.append(", name=");
        return ho8.a(sb, this.c, ')');
    }
}
