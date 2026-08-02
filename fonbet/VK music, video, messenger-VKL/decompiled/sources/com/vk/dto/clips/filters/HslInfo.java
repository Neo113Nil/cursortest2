package com.vk.dto.clips.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.media.filters.model.Hsl;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.l2k;
import xsna.s3q0;
import xsna.w9y;
import xsna.xq;
import xsna.zcl;

/* compiled from: HslInfo.kt */
/* loaded from: classes18.dex */
public final class HslInfo implements Parcelable, bxx {
    public static final Parcelable.Creator<HslInfo> CREATOR = new b();
    public static final Params k = new Params(0.5f, 0.5f, 0.5f);
    public final Params b;
    public final Params c;
    public final Params d;
    public final Params e;
    public final Params f;
    public final Params g;
    public final Params h;
    public final Params i;
    public final boolean j;

    /* compiled from: HslInfo.kt */
    public static final class Params implements Serializer.StreamParcelable, bxx {
        public static final Serializer.c<Params> CREATOR = new a();
        public final float b;
        public final float c;
        public final float d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Params> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Params a(Serializer serializer) {
                return new Params(serializer.s(), serializer.s(), serializer.s());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Params[i];
            }
        }

        public Params(float f, float f2, float f3) {
            this.b = f;
            this.c = f2;
            this.d = f3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.P(this.b);
            serializer.P(this.c);
            serializer.P(this.d);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            w9y w9yVar = new w9y();
            w9yVar.f("hue", Double.valueOf(this.b));
            w9yVar.f("saturation", Double.valueOf(this.c));
            w9yVar.f("brightness", Double.valueOf(this.d));
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.b, params.b) == 0 && Float.compare(this.c, params.c) == 0 && Float.compare(this.d, params.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, Float.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(hue=");
            sb.append(this.b);
            sb.append(", saturation=");
            sb.append(this.c);
            sb.append(", brightness=");
            return xq.c(')', this.d, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: HslInfo.kt */
    public static final class a {
        public static Params a(String str, JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            return optJSONObject != null ? new Params((float) optJSONObject.optDouble("hue", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), (float) optJSONObject.optDouble("saturation", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), (float) optJSONObject.optDouble("brightness", ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) : HslInfo.k;
        }
    }

    /* compiled from: HslInfo.kt */
    public static final class b implements Parcelable.Creator<HslInfo> {
        @Override // android.os.Parcelable.Creator
        public final HslInfo createFromParcel(Parcel parcel) {
            Serializer.c<Params> cVar = Params.CREATOR;
            return new HslInfo(cVar.createFromParcel(parcel), cVar.createFromParcel(parcel), cVar.createFromParcel(parcel), cVar.createFromParcel(parcel), cVar.createFromParcel(parcel), cVar.createFromParcel(parcel), cVar.createFromParcel(parcel), cVar.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HslInfo[] newArray(int i) {
            return new HslInfo[i];
        }
    }

    public HslInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static HslInfo a(HslInfo hslInfo, Params params, Params params2, Params params3, Params params4, Params params5, Params params6, Params params7, Params params8, int i) {
        if ((i & 1) != 0) {
            params = hslInfo.b;
        }
        Params params9 = params;
        if ((i & 2) != 0) {
            params2 = hslInfo.c;
        }
        Params params10 = params2;
        if ((i & 4) != 0) {
            params3 = hslInfo.d;
        }
        Params params11 = params3;
        if ((i & 8) != 0) {
            params4 = hslInfo.e;
        }
        Params params12 = params4;
        if ((i & 16) != 0) {
            params5 = hslInfo.f;
        }
        Params params13 = params5;
        if ((i & 32) != 0) {
            params6 = hslInfo.g;
        }
        Params params14 = params6;
        Params params15 = (i & 64) != 0 ? hslInfo.h : params7;
        Params params16 = (i & 128) != 0 ? hslInfo.i : params8;
        hslInfo.getClass();
        return new HslInfo(params9, params10, params11, params12, params13, params14, params15, params16);
    }

    public static Hsl.Params b(Params params) {
        return new Hsl.Params(params.b, params.c, params.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new l2k(this, 17));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HslInfo)) {
            return false;
        }
        HslInfo hslInfo = (HslInfo) obj;
        return epx.f(this.b, hslInfo.b) && epx.f(this.c, hslInfo.c) && epx.f(this.d, hslInfo.d) && epx.f(this.e, hslInfo.e) && epx.f(this.f, hslInfo.f) && epx.f(this.g, hslInfo.g) && epx.f(this.h, hslInfo.h) && epx.f(this.i, hslInfo.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HslInfo(red=" + this.b + ", orange=" + this.c + ", yellow=" + this.d + ", green=" + this.e + ", cyan=" + this.f + ", blue=" + this.g + ", purple=" + this.h + ", magenta=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Params params = this.b;
        params.getClass();
        Serializer.StreamParcelable.a.a(params, parcel);
        Params params2 = this.c;
        params2.getClass();
        Serializer.StreamParcelable.a.a(params2, parcel);
        Params params3 = this.d;
        params3.getClass();
        Serializer.StreamParcelable.a.a(params3, parcel);
        Params params4 = this.e;
        params4.getClass();
        Serializer.StreamParcelable.a.a(params4, parcel);
        Params params5 = this.f;
        params5.getClass();
        Serializer.StreamParcelable.a.a(params5, parcel);
        Params params6 = this.g;
        params6.getClass();
        Serializer.StreamParcelable.a.a(params6, parcel);
        Params params7 = this.h;
        params7.getClass();
        Serializer.StreamParcelable.a.a(params7, parcel);
        Params params8 = this.i;
        params8.getClass();
        Serializer.StreamParcelable.a.a(params8, parcel);
    }

    public HslInfo(Params params, Params params2, Params params3, Params params4, Params params5, Params params6, Params params7, Params params8) {
        this.b = params;
        this.c = params2;
        this.d = params3;
        this.e = params4;
        this.f = params5;
        this.g = params6;
        this.h = params7;
        this.i = params8;
        Params params9 = k;
        this.j = (epx.f(params, params9) && epx.f(params2, params9) && epx.f(params3, params9) && epx.f(params4, params9) && epx.f(params5, params9) && epx.f(params7, params9) && epx.f(params8, params9)) ? false : true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HslInfo(Params params, Params params2, Params params3, Params params4, Params params5, Params params6, Params params7, Params params8, int i, zcl zclVar) {
        this(r11 != 0 ? r0 : params, (i & 2) != 0 ? r0 : params2, (i & 4) != 0 ? r0 : params3, (i & 8) != 0 ? r0 : params4, (i & 16) != 0 ? r0 : params5, (i & 32) != 0 ? r0 : params6, (i & 64) != 0 ? r0 : params7, (i & 128) != 0 ? r0 : params8);
        int i2 = i & 1;
        Params params9 = k;
    }
}
