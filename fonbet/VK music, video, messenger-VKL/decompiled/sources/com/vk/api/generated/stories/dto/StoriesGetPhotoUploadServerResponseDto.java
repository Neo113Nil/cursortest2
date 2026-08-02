package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ao;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesGetPhotoUploadServerResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetPhotoUploadServerResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetPhotoUploadServerResponseDto> CREATOR = new a();

    @pmi0("origin_upload_description")
    private final String originUploadDescription;

    @pmi0("origin_upload_url")
    private final String originUploadUrl;

    @pmi0("peer_ids")
    private final List<Integer> peerIds;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    @pmi0("user_ids")
    private final List<Integer> userIds;

    /* compiled from: StoriesGetPhotoUploadServerResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetPhotoUploadServerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = pm0.b(parcel, arrayList2, i2, 1);
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new StoriesGetPhotoUploadServerResponseDto(readString, arrayList2, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerResponseDto[] newArray(int i) {
            return new StoriesGetPhotoUploadServerResponseDto[i];
        }
    }

    public StoriesGetPhotoUploadServerResponseDto(String str, List<Integer> list, String str2, String str3, List<Integer> list2) {
        this.uploadUrl = str;
        this.userIds = list;
        this.originUploadUrl = str2;
        this.originUploadDescription = str3;
        this.peerIds = list2;
    }

    public final String d() {
        return this.originUploadDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.originUploadUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetPhotoUploadServerResponseDto)) {
            return false;
        }
        StoriesGetPhotoUploadServerResponseDto storiesGetPhotoUploadServerResponseDto = (StoriesGetPhotoUploadServerResponseDto) obj;
        return epx.f(this.uploadUrl, storiesGetPhotoUploadServerResponseDto.uploadUrl) && epx.f(this.userIds, storiesGetPhotoUploadServerResponseDto.userIds) && epx.f(this.originUploadUrl, storiesGetPhotoUploadServerResponseDto.originUploadUrl) && epx.f(this.originUploadDescription, storiesGetPhotoUploadServerResponseDto.originUploadDescription) && epx.f(this.peerIds, storiesGetPhotoUploadServerResponseDto.peerIds);
    }

    public final String f() {
        return this.uploadUrl;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.uploadUrl.hashCode() * 31, 31, this.userIds);
        String str = this.originUploadUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originUploadDescription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.peerIds;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetPhotoUploadServerResponseDto(uploadUrl=");
        sb.append(this.uploadUrl);
        sb.append(", userIds=");
        sb.append(this.userIds);
        sb.append(", originUploadUrl=");
        sb.append(this.originUploadUrl);
        sb.append(", originUploadDescription=");
        sb.append(this.originUploadDescription);
        sb.append(", peerIds=");
        return ms9.a(')', sb, this.peerIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
        Iterator a2 = ao.a(parcel, this.userIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.originUploadUrl);
        parcel.writeString(this.originUploadDescription);
        List<Integer> list = this.peerIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ StoriesGetPhotoUploadServerResponseDto(String str, List list, String str2, String str3, List list2, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list2);
    }
}
