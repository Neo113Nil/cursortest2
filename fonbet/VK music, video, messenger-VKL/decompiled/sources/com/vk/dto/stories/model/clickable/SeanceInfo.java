package com.vk.dto.stories.model.clickable;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: ClickableVkTicket.kt */
/* loaded from: classes18.dex */
public final class SeanceInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SeanceInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SeanceInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SeanceInfo a(Serializer serializer) {
            return new SeanceInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SeanceInfo[i];
        }
    }

    public SeanceInfo(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.m0(this.b);
        serializer.m0(this.c);
        serializer.m0(this.d);
        serializer.m0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeanceInfo)) {
            return false;
        }
        SeanceInfo seanceInfo = (SeanceInfo) obj;
        return epx.f(this.b, seanceInfo.b) && epx.f(this.c, seanceInfo.c) && epx.f(this.d, seanceInfo.d) && epx.f(this.e, seanceInfo.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeanceInfo(id=");
        sb.append(this.b);
        sb.append(", cityAlias=");
        sb.append(this.c);
        sb.append(", city=");
        sb.append(this.d);
        sb.append(", date=");
        return ho8.a(sb, this.e, ')');
    }

    public SeanceInfo(Serializer serializer) {
        this(serializer.I(), serializer.I(), serializer.I(), serializer.I());
    }
}
