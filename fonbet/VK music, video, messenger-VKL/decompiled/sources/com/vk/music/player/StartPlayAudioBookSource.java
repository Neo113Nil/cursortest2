package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.audiobook.AudioBook;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.yba;
import xsna.zcl;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlayAudioBookSource extends StartPlaySource implements yba {
    public static final Serializer.c<StartPlayAudioBookSource> CREATOR = new a();
    public final AudioBook c;
    public final String d;
    public final String e;
    public Boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlayAudioBookSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlayAudioBookSource a(Serializer serializer) {
            return new StartPlayAudioBookSource(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlayAudioBookSource[i];
        }
    }

    public /* synthetic */ StartPlayAudioBookSource(AudioBook audioBook, String str, String str2, int i, zcl zclVar) {
        this(audioBook, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public final AudioBook Ab() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayAudioBookSource)) {
            return false;
        }
        StartPlayAudioBookSource startPlayAudioBookSource = (StartPlayAudioBookSource) obj;
        return epx.f(this.c, startPlayAudioBookSource.c) && epx.f(this.d, startPlayAudioBookSource.d) && epx.f(this.e, startPlayAudioBookSource.e);
    }

    public final int hashCode() {
        AudioBook audioBook = this.c;
        return this.e.hashCode() + urd0.a((audioBook == null ? 0 : audioBook.hashCode()) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPlayAudioBookSource(audioBook=");
        sb.append(this.c);
        sb.append(", blockId=");
        sb.append(this.d);
        sb.append(", sectionId=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // xsna.yba
    public final String v0() {
        return this.e;
    }

    @Override // xsna.yba
    public final String w() {
        return this.d;
    }

    public StartPlayAudioBookSource(AudioBook audioBook, String str, String str2) {
        super(null, 1, null);
        this.c = audioBook;
        this.d = str;
        this.e = str2;
        this.f = audioBook != null ? Boolean.valueOf(audioBook.r) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StartPlayAudioBookSource(Serializer serializer) {
        this(r0, r1, r4 != null ? r4 : "");
        AudioBook audioBook = (AudioBook) serializer.G(AudioBook.class.getClassLoader());
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
    }
}
