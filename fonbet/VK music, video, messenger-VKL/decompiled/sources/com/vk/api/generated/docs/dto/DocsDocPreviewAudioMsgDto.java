package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: DocsDocPreviewAudioMsgDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocPreviewAudioMsgDto implements Parcelable {
    public static final Parcelable.Creator<DocsDocPreviewAudioMsgDto> CREATOR = new a();

    @pmi0("duration")
    private final int duration;

    @pmi0("link_mp3")
    private final String linkMp3;

    @pmi0("link_ogg")
    private final String linkOgg;

    @pmi0("waveform")
    private final List<Integer> waveform;

    /* compiled from: DocsDocPreviewAudioMsgDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocPreviewAudioMsgDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewAudioMsgDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new DocsDocPreviewAudioMsgDto(readInt, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewAudioMsgDto[] newArray(int i) {
            return new DocsDocPreviewAudioMsgDto[i];
        }
    }

    public DocsDocPreviewAudioMsgDto(int i, String str, String str2, List<Integer> list) {
        this.duration = i;
        this.linkMp3 = str;
        this.linkOgg = str2;
        this.waveform = list;
    }

    public final String d() {
        return this.linkMp3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.linkOgg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewAudioMsgDto)) {
            return false;
        }
        DocsDocPreviewAudioMsgDto docsDocPreviewAudioMsgDto = (DocsDocPreviewAudioMsgDto) obj;
        return this.duration == docsDocPreviewAudioMsgDto.duration && epx.f(this.linkMp3, docsDocPreviewAudioMsgDto.linkMp3) && epx.f(this.linkOgg, docsDocPreviewAudioMsgDto.linkOgg) && epx.f(this.waveform, docsDocPreviewAudioMsgDto.waveform);
    }

    public final List<Integer> f() {
        return this.waveform;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int hashCode() {
        return this.waveform.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.duration) * 31, 31, this.linkMp3), 31, this.linkOgg);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocsDocPreviewAudioMsgDto(duration=");
        sb.append(this.duration);
        sb.append(", linkMp3=");
        sb.append(this.linkMp3);
        sb.append(", linkOgg=");
        sb.append(this.linkOgg);
        sb.append(", waveform=");
        return ms9.a(')', sb, this.waveform);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.duration);
        parcel.writeString(this.linkMp3);
        parcel.writeString(this.linkOgg);
        Iterator a2 = ao.a(parcel, this.waveform);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
