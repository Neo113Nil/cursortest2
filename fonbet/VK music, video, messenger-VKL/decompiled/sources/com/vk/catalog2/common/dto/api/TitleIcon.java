package com.vk.catalog2.common.dto.api;

import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.Position;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: TitleIcon.kt */
/* loaded from: classes16.dex */
public final class TitleIcon extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<TitleIcon> CREATOR = new b();
    public final String b;
    public final Position c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<TitleIcon> {
        @Override // xsna.aay
        public final TitleIcon a(JSONObject jSONObject) {
            return new TitleIcon(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<TitleIcon> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TitleIcon a(Serializer serializer) {
            return new TitleIcon(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TitleIcon[i];
        }
    }

    static {
        new a();
    }

    public TitleIcon(String str, Position position) {
        this.b = str;
        this.c = position;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        Position position = this.c;
        serializer.j0(position != null ? position.h() : null);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "url");
        w9yVar.e(this.c, X3.i.L);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleIcon)) {
            return false;
        }
        TitleIcon titleIcon = (TitleIcon) obj;
        return epx.f(this.b, titleIcon.b) && this.c == titleIcon.c;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Position position = this.c;
        return hashCode + (position != null ? position.hashCode() : 0);
    }

    public final String toString() {
        return "TitleIcon(url=" + this.b + ", position=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TitleIcon(Serializer serializer) {
        this(r0, r4);
        Position position;
        String H = serializer.H();
        Position.a aVar = Position.Companion;
        String H2 = serializer.H();
        aVar.getClass();
        Position[] values = Position.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                position = null;
                break;
            }
            position = values[i];
            if (epx.f(position.h(), H2)) {
                break;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TitleIcon(JSONObject jSONObject) {
        this(r0, r4);
        Position position;
        String optString = jSONObject.optString("url");
        Position.a aVar = Position.Companion;
        String optString2 = jSONObject.optString(X3.i.L);
        aVar.getClass();
        Position[] values = Position.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                position = null;
                break;
            }
            position = values[i];
            if (epx.f(position.h(), optString2)) {
                break;
            } else {
                i++;
            }
        }
    }
}
