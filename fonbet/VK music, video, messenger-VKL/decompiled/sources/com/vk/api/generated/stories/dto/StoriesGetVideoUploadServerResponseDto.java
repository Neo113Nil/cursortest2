package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesGetVideoUploadServerResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetVideoUploadServerResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetVideoUploadServerResponseDto> CREATOR = new a();

    @pmi0("upload_result")
    private final String uploadResult;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    @pmi0("user_ids")
    private final List<Integer> userIds;

    /* compiled from: StoriesGetVideoUploadServerResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetVideoUploadServerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new StoriesGetVideoUploadServerResponseDto(readString, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerResponseDto[] newArray(int i) {
            return new StoriesGetVideoUploadServerResponseDto[i];
        }
    }

    public StoriesGetVideoUploadServerResponseDto(String str, List<Integer> list, String str2) {
        this.uploadUrl = str;
        this.userIds = list;
        this.uploadResult = str2;
    }

    public final String d() {
        return this.uploadResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.uploadUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetVideoUploadServerResponseDto)) {
            return false;
        }
        StoriesGetVideoUploadServerResponseDto storiesGetVideoUploadServerResponseDto = (StoriesGetVideoUploadServerResponseDto) obj;
        return epx.f(this.uploadUrl, storiesGetVideoUploadServerResponseDto.uploadUrl) && epx.f(this.userIds, storiesGetVideoUploadServerResponseDto.userIds) && epx.f(this.uploadResult, storiesGetVideoUploadServerResponseDto.uploadResult);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.uploadUrl.hashCode() * 31, 31, this.userIds);
        String str = this.uploadResult;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetVideoUploadServerResponseDto(uploadUrl=");
        sb.append(this.uploadUrl);
        sb.append(", userIds=");
        sb.append(this.userIds);
        sb.append(", uploadResult=");
        return ho8.a(sb, this.uploadResult, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
        Iterator a2 = ao.a(parcel, this.userIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.uploadResult);
    }

    public /* synthetic */ StoriesGetVideoUploadServerResponseDto(String str, List list, String str2, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : str2);
    }
}
