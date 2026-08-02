package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.i5s;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: Genre.kt */
/* loaded from: classes18.dex */
public final class Genre extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Genre> CREATOR = new b();
    public static final a d = new a();
    public final int b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<Genre> {
        @Override // xsna.aay
        public final Genre a(JSONObject jSONObject) {
            return new Genre(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Genre> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Genre a(Serializer serializer) {
            return new Genre(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Genre[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Genre() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "id");
        w9yVar.e(this.c, "name");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Genre.class.equals(obj.getClass()) && (obj instanceof Genre)) {
            Genre genre = (Genre) obj;
            if (this.b == genre.b && epx.f(this.c, genre.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Genre{ id=");
        sb.append(this.b);
        sb.append(", name=");
        return i5s.a(sb, this.c, " }");
    }

    public Genre(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public /* synthetic */ Genre(int i, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }

    public Genre(JSONObject jSONObject) {
        this(jSONObject.optInt("id"), jSONObject.optString("name"));
    }

    public Genre(Serializer serializer) {
        this(serializer.u(), serializer.H());
    }
}
