package com.vk.clips.sdk.shared.clips;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: SdkNewsMonotheme.kt */
/* loaded from: classes17.dex */
public final class SdkNewsMonotheme extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SdkNewsMonotheme> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SdkNewsMonotheme> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SdkNewsMonotheme a(Serializer serializer) {
            return new SdkNewsMonotheme(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SdkNewsMonotheme[i];
        }
    }

    public SdkNewsMonotheme(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkNewsMonotheme)) {
            return false;
        }
        SdkNewsMonotheme sdkNewsMonotheme = (SdkNewsMonotheme) obj;
        return epx.f(this.b, sdkNewsMonotheme.b) && epx.f(this.c, sdkNewsMonotheme.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkNewsMonotheme(objectId=");
        sb.append(this.b);
        sb.append(", header=");
        return ho8.a(sb, this.c, ')');
    }

    public SdkNewsMonotheme(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H());
    }
}
