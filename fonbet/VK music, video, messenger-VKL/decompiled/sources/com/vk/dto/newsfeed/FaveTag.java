package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: FaveTag.kt */
/* loaded from: classes18.dex */
public final class FaveTag extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<FaveTag> CREATOR = new b();
    public final int b;
    public final String c;

    /* compiled from: FaveTag.kt */
    public static final class a {
        public static FaveTag a(JSONObject jSONObject) {
            return new FaveTag(jSONObject.getInt("id"), jSONObject.getString("name"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<FaveTag> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FaveTag a(Serializer serializer) {
            return new FaveTag(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FaveTag[i];
        }
    }

    public FaveTag(int i, String str) {
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
        if (!FaveTag.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        FaveTag faveTag = (FaveTag) obj;
        return this.b == faveTag.b && epx.f(this.c, faveTag.c);
    }

    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FaveTag(Serializer serializer) {
        this(r0, r2 == null ? "" : r2);
        int u = serializer.u();
        String H = serializer.H();
    }
}
