package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioReactionsConfigDto.kt */
/* loaded from: classes14.dex */
public final class AudioReactionsConfigDto implements Parcelable {
    public static final Parcelable.Creator<AudioReactionsConfigDto> CREATOR = new a();

    @pmi0("multi_select")
    private final Boolean multiSelect;

    @pmi0("reactions")
    private final List<AudioReactionConfigDto> reactions;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioReactionsConfigDto.kt */
    public static final class a implements Parcelable.Creator<AudioReactionsConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioReactionsConfigDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AudioReactionConfigDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioReactionsConfigDto(readString, readString2, arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioReactionsConfigDto[] newArray(int i) {
            return new AudioReactionsConfigDto[i];
        }
    }

    public AudioReactionsConfigDto(String str, String str2, List<AudioReactionConfigDto> list, Boolean bool) {
        this.title = str;
        this.subtitle = str2;
        this.reactions = list;
        this.multiSelect = bool;
    }

    public final List<AudioReactionConfigDto> d() {
        return this.reactions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioReactionsConfigDto)) {
            return false;
        }
        AudioReactionsConfigDto audioReactionsConfigDto = (AudioReactionsConfigDto) obj;
        return epx.f(this.title, audioReactionsConfigDto.title) && epx.f(this.subtitle, audioReactionsConfigDto.subtitle) && epx.f(this.reactions, audioReactionsConfigDto.reactions) && epx.f(this.multiSelect, audioReactionsConfigDto.multiSelect);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.reactions);
        Boolean bool = this.multiSelect;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioReactionsConfigDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", reactions=");
        sb.append(this.reactions);
        sb.append(", multiSelect=");
        return tn.a(sb, this.multiSelect, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Iterator a2 = ao.a(parcel, this.reactions);
        while (a2.hasNext()) {
            ((AudioReactionConfigDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.multiSelect;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AudioReactionsConfigDto(String str, String str2, List list, Boolean bool, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : bool);
    }
}
