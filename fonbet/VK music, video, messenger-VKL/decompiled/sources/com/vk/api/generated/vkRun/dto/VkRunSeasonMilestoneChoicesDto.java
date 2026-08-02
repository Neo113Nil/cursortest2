package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VkRunSeasonMilestoneChoicesDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonMilestoneChoicesDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonMilestoneChoicesDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<VkRunSeasonMilestoneChoiceOptionDto> options;

    @pmi0("title")
    private final String title;

    /* compiled from: VkRunSeasonMilestoneChoicesDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonMilestoneChoicesDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonMilestoneChoicesDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VkRunSeasonMilestoneChoiceOptionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VkRunSeasonMilestoneChoicesDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonMilestoneChoicesDto[] newArray(int i) {
            return new VkRunSeasonMilestoneChoicesDto[i];
        }
    }

    public VkRunSeasonMilestoneChoicesDto(String str, List<VkRunSeasonMilestoneChoiceOptionDto> list) {
        this.title = str;
        this.options = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSeasonMilestoneChoicesDto)) {
            return false;
        }
        VkRunSeasonMilestoneChoicesDto vkRunSeasonMilestoneChoicesDto = (VkRunSeasonMilestoneChoicesDto) obj;
        return epx.f(this.title, vkRunSeasonMilestoneChoicesDto.title) && epx.f(this.options, vkRunSeasonMilestoneChoicesDto.options);
    }

    public final int hashCode() {
        return this.options.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSeasonMilestoneChoicesDto(title=");
        sb.append(this.title);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.options);
        while (a2.hasNext()) {
            ((VkRunSeasonMilestoneChoiceOptionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
