package com.vk.dto.newsfeed;

import android.os.Parcel;
import com.ironsource.D1;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.vu5;

/* compiled from: Links.kt */
/* loaded from: classes18.dex */
public final class Link implements Serializer.StreamParcelable {
    public static final Serializer.c<Link> CREATOR = new b();
    public final String b;
    public final int c;

    /* compiled from: Links.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static Link a(JSONObject jSONObject) {
            int i;
            String D = f370.D(jSONObject, "link_url");
            String optString = jSONObject.optString("link_url_target");
            if (optString != null) {
                switch (optString.hashCode()) {
                    case -1820761141:
                        optString.equals(D1.e);
                        break;
                    case -1544407700:
                        if (optString.equals("internal_hidden")) {
                            i = 1;
                            break;
                        }
                        break;
                    case 570410685:
                        if (optString.equals("internal")) {
                            i = 2;
                            break;
                        }
                        break;
                    case 1475610601:
                        if (optString.equals("authorize")) {
                            i = 3;
                            break;
                        }
                        break;
                }
                return new Link(D, i);
            }
            i = 0;
            return new Link(D, i);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Link> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Link a(Serializer serializer) {
            return new Link(serializer.H(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Link[i];
        }
    }

    public Link(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return epx.f(this.b, link.b) && this.c == link.c;
    }

    public final int hashCode() {
        String str = this.b;
        return Integer.hashCode(this.c) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(linkUrl=");
        sb.append(this.b);
        sb.append(", linkTarget=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
