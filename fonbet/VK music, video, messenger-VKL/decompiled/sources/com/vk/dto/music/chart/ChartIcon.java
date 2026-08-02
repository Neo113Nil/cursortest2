package com.vk.dto.music.chart;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.shy;
import xsna.vu5;
import xsna.w9y;

/* compiled from: ChartIcon.kt */
/* loaded from: classes18.dex */
public final class ChartIcon extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ChartIcon> CREATOR = new b();
    public static final a e = new a();
    public final String b;
    public final int c;
    public final int d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ChartIcon> {
        @Override // xsna.aay
        public final ChartIcon a(JSONObject jSONObject) {
            return new ChartIcon(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ChartIcon> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChartIcon a(Serializer serializer) {
            return new ChartIcon(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChartIcon[i];
        }
    }

    public ChartIcon(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "url");
        w9yVar.c(Integer.valueOf(this.c), "width");
        w9yVar.c(Integer.valueOf(this.d), "height");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartIcon)) {
            return false;
        }
        ChartIcon chartIcon = (ChartIcon) obj;
        return epx.f(this.b, chartIcon.b) && this.c == chartIcon.c && this.d == chartIcon.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChartIcon(url=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        return vu5.b(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChartIcon(Serializer serializer) {
        this(r0 == null ? "" : r0, serializer.u(), serializer.u());
        String H = serializer.H();
    }

    public ChartIcon(JSONObject jSONObject) {
        this(jSONObject.optString("url"), jSONObject.optInt("width"), jSONObject.optInt("height"));
    }
}
