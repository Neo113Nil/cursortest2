package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesMessageFormatDataDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageFormatDataDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageFormatDataDto> CREATOR = new a();

    @pmi0("items")
    private final List<MessagesMessageFormatDataItemDto> items;

    @pmi0("version")
    private final VersionDto version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesMessageFormatDataDto.kt */
    public static final class VersionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VersionDto[] $VALUES;
        public static final Parcelable.Creator<VersionDto> CREATOR;

        @pmi0("1")
        public static final VersionDto TYPE_1;
        private final String value;

        /* compiled from: MessagesMessageFormatDataDto.kt */
        public static final class a implements Parcelable.Creator<VersionDto> {
            @Override // android.os.Parcelable.Creator
            public final VersionDto createFromParcel(Parcel parcel) {
                return VersionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VersionDto[] newArray(int i) {
                return new VersionDto[i];
            }
        }

        static {
            VersionDto versionDto = new VersionDto("TYPE_1", 0, "1");
            TYPE_1 = versionDto;
            VersionDto[] versionDtoArr = {versionDto};
            $VALUES = versionDtoArr;
            $ENTRIES = new asp(versionDtoArr);
            CREATOR = new a();
        }

        private VersionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static VersionDto valueOf(String str) {
            return (VersionDto) Enum.valueOf(VersionDto.class, str);
        }

        public static VersionDto[] values() {
            return (VersionDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MessagesMessageFormatDataDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageFormatDataDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageFormatDataDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            VersionDto createFromParcel = VersionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesMessageFormatDataItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesMessageFormatDataDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageFormatDataDto[] newArray(int i) {
            return new MessagesMessageFormatDataDto[i];
        }
    }

    public MessagesMessageFormatDataDto(VersionDto versionDto, List<MessagesMessageFormatDataItemDto> list) {
        this.version = versionDto;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageFormatDataDto)) {
            return false;
        }
        MessagesMessageFormatDataDto messagesMessageFormatDataDto = (MessagesMessageFormatDataDto) obj;
        return this.version == messagesMessageFormatDataDto.version && epx.f(this.items, messagesMessageFormatDataDto.items);
    }

    public final int hashCode() {
        int hashCode = this.version.hashCode() * 31;
        List<MessagesMessageFormatDataItemDto> list = this.items;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageFormatDataDto(version=");
        sb.append(this.version);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.version.writeToParcel(parcel, i);
        List<MessagesMessageFormatDataItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MessagesMessageFormatDataItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesMessageFormatDataDto(VersionDto versionDto, List list, int i, zcl zclVar) {
        this(versionDto, (i & 2) != 0 ? null : list);
    }
}
