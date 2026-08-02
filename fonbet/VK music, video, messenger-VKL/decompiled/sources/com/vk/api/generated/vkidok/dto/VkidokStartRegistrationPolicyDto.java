package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VkidokStartRegistrationPolicyDto.kt */
/* loaded from: classes15.dex */
public final class VkidokStartRegistrationPolicyDto implements Parcelable {
    public static final Parcelable.Creator<VkidokStartRegistrationPolicyDto> CREATOR = new a();

    @pmi0("links")
    private final List<VkidokStartRegistrationPolicyLinksDto> links;

    @pmi0("resources")
    private final List<VkidokStartRegistrationPolicyResourcesDto> resources;

    /* compiled from: VkidokStartRegistrationPolicyDto.kt */
    public static final class a implements Parcelable.Creator<VkidokStartRegistrationPolicyDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokStartRegistrationPolicyDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(VkidokStartRegistrationPolicyLinksDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(VkidokStartRegistrationPolicyResourcesDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new VkidokStartRegistrationPolicyDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokStartRegistrationPolicyDto[] newArray(int i) {
            return new VkidokStartRegistrationPolicyDto[i];
        }
    }

    public VkidokStartRegistrationPolicyDto(List<VkidokStartRegistrationPolicyLinksDto> list, List<VkidokStartRegistrationPolicyResourcesDto> list2) {
        this.links = list;
        this.resources = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokStartRegistrationPolicyDto)) {
            return false;
        }
        VkidokStartRegistrationPolicyDto vkidokStartRegistrationPolicyDto = (VkidokStartRegistrationPolicyDto) obj;
        return epx.f(this.links, vkidokStartRegistrationPolicyDto.links) && epx.f(this.resources, vkidokStartRegistrationPolicyDto.resources);
    }

    public final int hashCode() {
        return this.resources.hashCode() + (this.links.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokStartRegistrationPolicyDto(links=");
        sb.append(this.links);
        sb.append(", resources=");
        return ms9.a(')', sb, this.resources);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.links);
        while (a2.hasNext()) {
            ((VkidokStartRegistrationPolicyLinksDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.resources);
        while (a3.hasNext()) {
            ((VkidokStartRegistrationPolicyResourcesDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
