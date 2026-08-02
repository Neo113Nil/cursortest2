package com.vk.dto.music.playlist;

import com.vk.core.serialize.Serializer;
import xsna.bpn0;
import xsna.epx;
import xsna.ho8;
import xsna.odm;
import xsna.zcl;

/* compiled from: MarusiaTrackSource.kt */
/* loaded from: classes18.dex */
public final class MarusiaTrackSource extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MarusiaTrackSource> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MarusiaTrackSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarusiaTrackSource a(Serializer serializer) {
            return new MarusiaTrackSource(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarusiaTrackSource[i];
        }
    }

    public MarusiaTrackSource(String str, String str2, String str3, String str4, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        new bpn0(new odm(this, 24));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaTrackSource)) {
            return false;
        }
        MarusiaTrackSource marusiaTrackSource = (MarusiaTrackSource) obj;
        return epx.f(this.b, marusiaTrackSource.b) && epx.f(this.c, marusiaTrackSource.c) && epx.f(this.d, marusiaTrackSource.d) && epx.f(this.e, marusiaTrackSource.e) && epx.f(this.f, marusiaTrackSource.f) && epx.f(this.g, marusiaTrackSource.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaTrackSource(sourceJson=");
        sb.append(this.b);
        sb.append(", mediaType=");
        sb.append(this.c);
        sb.append(", skillName=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", uid=");
        sb.append(this.f);
        sb.append(", phraseId=");
        return ho8.a(sb, this.g, ')');
    }

    public MarusiaTrackSource(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
