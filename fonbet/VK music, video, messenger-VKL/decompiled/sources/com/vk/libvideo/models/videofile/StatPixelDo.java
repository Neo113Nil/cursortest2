package com.vk.libvideo.models.videofile;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.epx;
import xsna.urd0;
import xsna.v11;
import xsna.zcl;

/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class StatPixelDo implements Parcelable {
    public static final Parcelable.Creator<StatPixelDo> CREATOR = new a();
    public final String b;
    public final String c;
    public final Map<String, String> d;
    public final boolean e;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a implements Parcelable.Creator<StatPixelDo> {
        @Override // android.os.Parcelable.Creator
        public final StatPixelDo createFromParcel(Parcel parcel) {
            String str = PixelEventDo.CREATOR.createFromParcel(parcel).b;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new StatPixelDo(str, readString, linkedHashMap, parcel.readInt() != 0, null);
        }

        @Override // android.os.Parcelable.Creator
        public final StatPixelDo[] newArray(int i) {
            return new StatPixelDo[i];
        }
    }

    public StatPixelDo() {
        throw null;
    }

    public StatPixelDo(String str, String str2, Map map, boolean z, zcl zclVar) {
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = z;
    }

    public final String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatPixelDo)) {
            return false;
        }
        StatPixelDo statPixelDo = (StatPixelDo) obj;
        return epx.f(this.b, statPixelDo.b) && epx.f(this.c, statPixelDo.c) && epx.f(this.d, statPixelDo.d) && this.e == statPixelDo.e;
    }

    public final Map<String, String> f() {
        return this.d;
    }

    public final String getUrl() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + v11.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatPixelDo(event=");
        sb.append((Object) ("PixelEventDo(value=" + this.b + ')'));
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", params=");
        sb.append(this.d);
        sb.append(", intermediate=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Map<String, String> map = this.d;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
