package com.vk.newsfeed.posting.music_picker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.qoy;
import xsna.shy;

/* compiled from: MusicPickerState.kt */
/* loaded from: classes4.dex */
public final class MusicPickerState implements km50, Parcelable {
    public static final Parcelable.Creator<MusicPickerState> CREATOR = new a();
    public final PickerTechMetrics b;
    public final int c;
    public final List<MusicDto> d;
    public final MusicDto e;
    public final List<MusicDto> f;
    public final MusicDto g;
    public final boolean h;
    public final UserId i;
    public final List<MusicPickerList> j;
    public final MusicPickerListItem.MusicTrackItem.PlayingState k;
    public final MusicTrack l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final SnippetOnboardingState p;

    /* compiled from: MusicPickerState.kt */
    public static final class a implements Parcelable.Creator<MusicPickerState> {
        @Override // android.os.Parcelable.Creator
        public final MusicPickerState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            PickerTechMetrics createFromParcel = PickerTechMetrics.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MusicDto.CREATOR, parcel, arrayList2, i, 1);
            }
            MusicDto createFromParcel2 = parcel.readInt() == 0 ? null : MusicDto.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = en.a(MusicDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            MusicDto createFromParcel3 = parcel.readInt() != 0 ? MusicDto.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                arrayList = arrayList3;
                z = true;
            } else {
                arrayList = arrayList3;
                z = false;
            }
            UserId userId = (UserId) parcel.readParcelable(MusicPickerState.class.getClassLoader());
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            int i3 = 0;
            while (i3 != readInt4) {
                i3 = bo.b(MusicPickerState.class, parcel, arrayList4, i3, 1);
            }
            return new MusicPickerState(createFromParcel, readInt, arrayList2, createFromParcel2, arrayList, createFromParcel3, z, userId, arrayList4, MusicPickerListItem.MusicTrackItem.PlayingState.valueOf(parcel.readString()), (MusicTrack) parcel.readParcelable(MusicPickerState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), SnippetOnboardingState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MusicPickerState[] newArray(int i) {
            return new MusicPickerState[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicPickerState(PickerTechMetrics pickerTechMetrics, int i, List<MusicDto> list, MusicDto musicDto, List<MusicDto> list2, MusicDto musicDto2, boolean z, UserId userId, List<? extends MusicPickerList> list3, MusicPickerListItem.MusicTrackItem.PlayingState playingState, MusicTrack musicTrack, boolean z2, boolean z3, String str, SnippetOnboardingState snippetOnboardingState) {
        this.b = pickerTechMetrics;
        this.c = i;
        this.d = list;
        this.e = musicDto;
        this.f = list2;
        this.g = musicDto2;
        this.h = z;
        this.i = userId;
        this.j = list3;
        this.k = playingState;
        this.l = musicTrack;
        this.m = z2;
        this.n = z3;
        this.o = str;
        this.p = snippetOnboardingState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MusicPickerState a(MusicPickerState musicPickerState, PickerTechMetrics pickerTechMetrics, List list, MusicDto musicDto, ArrayList arrayList, MusicPickerListItem.MusicTrackItem.PlayingState playingState, MusicTrack musicTrack, boolean z, boolean z2, SnippetOnboardingState snippetOnboardingState, int i) {
        PickerTechMetrics pickerTechMetrics2 = (i & 1) != 0 ? musicPickerState.b : pickerTechMetrics;
        int i2 = musicPickerState.c;
        List<MusicDto> list2 = musicPickerState.d;
        MusicDto musicDto2 = musicPickerState.e;
        List list3 = (i & 16) != 0 ? musicPickerState.f : list;
        MusicDto musicDto3 = (i & 32) != 0 ? musicPickerState.g : musicDto;
        boolean z3 = musicPickerState.h;
        UserId userId = musicPickerState.i;
        List list4 = (i & 256) != 0 ? musicPickerState.j : arrayList;
        MusicPickerListItem.MusicTrackItem.PlayingState playingState2 = (i & 512) != 0 ? musicPickerState.k : playingState;
        MusicTrack musicTrack2 = (i & 1024) != 0 ? musicPickerState.l : musicTrack;
        boolean z4 = (i & 2048) != 0 ? musicPickerState.m : z;
        boolean z5 = (i & 4096) != 0 ? musicPickerState.n : z2;
        String str = musicPickerState.o;
        SnippetOnboardingState snippetOnboardingState2 = (i & 16384) != 0 ? musicPickerState.p : snippetOnboardingState;
        musicPickerState.getClass();
        return new MusicPickerState(pickerTechMetrics2, i2, list2, musicDto2, list3, musicDto3, z3, userId, list4, playingState2, musicTrack2, z4, z5, str, snippetOnboardingState2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicPickerState)) {
            return false;
        }
        MusicPickerState musicPickerState = (MusicPickerState) obj;
        return epx.f(this.b, musicPickerState.b) && this.c == musicPickerState.c && epx.f(this.d, musicPickerState.d) && epx.f(this.e, musicPickerState.e) && epx.f(this.f, musicPickerState.f) && epx.f(this.g, musicPickerState.g) && this.h == musicPickerState.h && epx.f(this.i, musicPickerState.i) && epx.f(this.j, musicPickerState.j) && this.k == musicPickerState.k && epx.f(this.l, musicPickerState.l) && this.m == musicPickerState.m && this.n == musicPickerState.n && epx.f(this.o, musicPickerState.o) && this.p == musicPickerState.p;
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        MusicDto musicDto = this.e;
        int a3 = fw3.a((a2 + (musicDto == null ? 0 : musicDto.hashCode())) * 31, 31, this.f);
        MusicDto musicDto2 = this.g;
        int hashCode = (this.k.hashCode() + fw3.a(bh10.a(qoy.b((a3 + (musicDto2 == null ? 0 : musicDto2.hashCode())) * 31, 31, this.h), 31, this.i.b), 31, this.j)) * 31;
        MusicTrack musicTrack = this.l;
        int b = qoy.b(qoy.b((hashCode + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31, 31, this.m), 31, this.n);
        String str = this.o;
        return this.p.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MusicPickerState(techMetrics=" + this.b + ", audioMaxCount=" + this.c + ", initialSelectedTracks=" + this.d + ", initialSelectedPlaylist=" + this.e + ", selectedTracks=" + this.f + ", selectedPlaylist=" + this.g + ", isMultiSelectEnabled=" + this.h + ", ownerId=" + this.i + ", backStack=" + this.j + ", playingState=" + this.k + ", currentPlayingTrack=" + this.l + ", isPrivatePlaylist=" + this.m + ", isSnippetPreferred=" + this.n + ", snippetOnboardingTitle=" + this.o + ", snippetOnboardingState=" + this.p + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
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
        Iterator a3 = ao.a(parcel, this.f);
        while (a3.hasNext()) {
            ((MusicDto) a3.next()).writeToParcel(parcel, i);
        }
        MusicDto musicDto2 = this.g;
        if (musicDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicDto2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeParcelable(this.i, i);
        Iterator a4 = ao.a(parcel, this.j);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        parcel.writeString(this.k.name());
        parcel.writeParcelable(this.l, i);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeString(this.o);
        parcel.writeString(this.p.name());
    }
}
