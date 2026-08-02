package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vul0;
import xsna.wp;
import xsna.zcl;

/* compiled from: VideoAdsDto.kt */
/* loaded from: classes15.dex */
public final class VideoAdsDto implements Parcelable {
    public static final Parcelable.Creator<VideoAdsDto> CREATOR = new a();

    @pmi0("autoplay_preroll")
    private final BaseBoolIntDto autoplayPreroll;

    @pmi0("can_play")
    private final BaseBoolIntDto canPlay;

    @pmi0("midroll_percents")
    private final List<Float> midrollPercents;

    @pmi0("params")
    private final Object params;

    @pmi0("sections")
    private final List<String> sections;

    @pmi0("slot_id")
    private final int slotId;

    @pmi0("timeout")
    private final float timeout;

    /* compiled from: VideoAdsDto.kt */
    public static final class a implements Parcelable.Creator<VideoAdsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAdsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            float readFloat = parcel.readFloat();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            Parcelable.Creator<BaseBoolIntDto> creator = BaseBoolIntDto.CREATOR;
            return new VideoAdsDto(readInt, createStringArrayList, readFloat, arrayList, creator.createFromParcel(parcel), parcel.readValue(VideoAdsDto.class.getClassLoader()), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAdsDto[] newArray(int i) {
            return new VideoAdsDto[i];
        }
    }

    public VideoAdsDto(int i, List<String> list, float f, List<Float> list2, BaseBoolIntDto baseBoolIntDto, Object obj, BaseBoolIntDto baseBoolIntDto2) {
        this.slotId = i;
        this.sections = list;
        this.timeout = f;
        this.midrollPercents = list2;
        this.canPlay = baseBoolIntDto;
        this.params = obj;
        this.autoplayPreroll = baseBoolIntDto2;
    }

    public final BaseBoolIntDto d() {
        return this.autoplayPreroll;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.canPlay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdsDto)) {
            return false;
        }
        VideoAdsDto videoAdsDto = (VideoAdsDto) obj;
        return this.slotId == videoAdsDto.slotId && epx.f(this.sections, videoAdsDto.sections) && Float.compare(this.timeout, videoAdsDto.timeout) == 0 && epx.f(this.midrollPercents, videoAdsDto.midrollPercents) && this.canPlay == videoAdsDto.canPlay && epx.f(this.params, videoAdsDto.params) && this.autoplayPreroll == videoAdsDto.autoplayPreroll;
    }

    public final List<Float> f() {
        return this.midrollPercents;
    }

    public final Object g() {
        return this.params;
    }

    public final int hashCode() {
        int a2 = vul0.a(wp.b(this.canPlay, fw3.a(b.a(this.timeout, fw3.a(Integer.hashCode(this.slotId) * 31, 31, this.sections), 31), 31, this.midrollPercents), 31), 31, this.params);
        BaseBoolIntDto baseBoolIntDto = this.autoplayPreroll;
        return a2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode());
    }

    public final List<String> i() {
        return this.sections;
    }

    public final int j() {
        return this.slotId;
    }

    public final float k() {
        return this.timeout;
    }

    public final String toString() {
        return "VideoAdsDto(slotId=" + this.slotId + ", sections=" + this.sections + ", timeout=" + this.timeout + ", midrollPercents=" + this.midrollPercents + ", canPlay=" + this.canPlay + ", params=" + this.params + ", autoplayPreroll=" + this.autoplayPreroll + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.slotId);
        parcel.writeStringList(this.sections);
        parcel.writeFloat(this.timeout);
        Iterator a2 = ao.a(parcel, this.midrollPercents);
        while (a2.hasNext()) {
            parcel.writeFloat(((Number) a2.next()).floatValue());
        }
        this.canPlay.writeToParcel(parcel, i);
        parcel.writeValue(this.params);
        BaseBoolIntDto baseBoolIntDto = this.autoplayPreroll;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoAdsDto(int i, List list, float f, List list2, BaseBoolIntDto baseBoolIntDto, Object obj, BaseBoolIntDto baseBoolIntDto2, int i2, zcl zclVar) {
        this(i, list, f, list2, baseBoolIntDto, obj, (i2 & 64) != 0 ? null : baseBoolIntDto2);
    }
}
