package com.vk.newsfeed.posting.music_picker.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;

/* compiled from: MusicPickerArguments.kt */
/* loaded from: classes4.dex */
public final class MusicPickerArguments implements Parcelable {
    public static final Parcelable.Creator<MusicPickerArguments> CREATOR = new a();
    public final long b;
    public final int c;
    public final List<MusicDto> d;
    public final MusicDto e;
    public final boolean f;
    public final boolean g;
    public final String h;

    /* compiled from: MusicPickerArguments.kt */
    public static final class a implements Parcelable.Creator<MusicPickerArguments> {
        @Override // android.os.Parcelable.Creator
        public final MusicPickerArguments createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (true) {
                if (i == readInt2) {
                    break;
                }
                i = en.a(MusicDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MusicPickerArguments(readLong, readInt, arrayList, parcel.readInt() == 0 ? null : MusicDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicPickerArguments[] newArray(int i) {
            return new MusicPickerArguments[i];
        }
    }

    public MusicPickerArguments(long j, int i, List<MusicDto> list, MusicDto musicDto, boolean z, boolean z2, String str) {
        this.b = j;
        this.c = i;
        this.d = list;
        this.e = musicDto;
        this.f = z;
        this.g = z2;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicPickerArguments)) {
            return false;
        }
        MusicPickerArguments musicPickerArguments = (MusicPickerArguments) obj;
        return this.b == musicPickerArguments.b && this.c == musicPickerArguments.c && epx.f(this.d, musicPickerArguments.d) && epx.f(this.e, musicPickerArguments.e) && this.f == musicPickerArguments.f && this.g == musicPickerArguments.g && epx.f(this.h, musicPickerArguments.h);
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31, this.d);
        MusicDto musicDto = this.e;
        int b = qoy.b(qoy.b((a2 + (musicDto == null ? 0 : musicDto.hashCode())) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPickerArguments(startScreenElapsedTime=");
        sb.append(this.b);
        sb.append(", audioMaxCount=");
        sb.append(this.c);
        sb.append(", selectedTracks=");
        sb.append(this.d);
        sb.append(", selectedPlaylist=");
        sb.append(this.e);
        sb.append(", isMultiSelectEnabled=");
        sb.append(this.f);
        sb.append(", isSnippetPreferred=");
        sb.append(this.g);
        sb.append(", snippetOnboardingTitle=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            ((MusicDto) a2.next()).writeToParcel(parcel, i);
        }
        MusicDto musicDto = this.e;
        if (musicDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicDto.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
    }
}
