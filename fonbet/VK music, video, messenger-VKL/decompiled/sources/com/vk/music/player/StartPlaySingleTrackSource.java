package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.yba;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlaySingleTrackSource extends StartPlaySource implements yba {
    public static final Serializer.c<StartPlaySingleTrackSource> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlaySingleTrackSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlaySingleTrackSource a(Serializer serializer) {
            return new StartPlaySingleTrackSource(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlaySingleTrackSource[i];
        }
    }

    public StartPlaySingleTrackSource(String str, String str2, String str3) {
        super(null, 1, null);
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlaySingleTrackSource)) {
            return false;
        }
        StartPlaySingleTrackSource startPlaySingleTrackSource = (StartPlaySingleTrackSource) obj;
        return epx.f(this.c, startPlaySingleTrackSource.c) && epx.f(this.d, startPlaySingleTrackSource.d) && epx.f(this.e, startPlaySingleTrackSource.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPlaySingleTrackSource(blockId=");
        sb.append(this.c);
        sb.append(", sectionId=");
        sb.append(this.d);
        sb.append(", audioId=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // xsna.yba
    public final String v0() {
        return this.d;
    }

    @Override // xsna.yba
    public final String w() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StartPlaySingleTrackSource(Serializer serializer) {
        this(r0, r2, r4 != null ? r4 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
    }
}
