package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumRepositoryObjectReferenceDto.kt */
/* loaded from: classes14.dex */
public final class AtumRepositoryObjectReferenceDto implements Parcelable {
    public static final Parcelable.Creator<AtumRepositoryObjectReferenceDto> CREATOR = new a();

    @pmi0("dsl")
    private final String dsl;

    @pmi0(RTCStatsConstants.KEY_KIND)
    private final KindDto kind;

    @pmi0("prop")
    private final String prop;

    @pmi0("record_id")
    private final AtumRecordIdDto recordId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumRepositoryObjectReferenceDto.kt */
    public static final class KindDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ KindDto[] $VALUES;
        public static final Parcelable.Creator<KindDto> CREATOR;

        @pmi0("objectRef")
        public static final KindDto OBJECTREF;
        private final String value;

        /* compiled from: AtumRepositoryObjectReferenceDto.kt */
        public static final class a implements Parcelable.Creator<KindDto> {
            @Override // android.os.Parcelable.Creator
            public final KindDto createFromParcel(Parcel parcel) {
                return KindDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final KindDto[] newArray(int i) {
                return new KindDto[i];
            }
        }

        static {
            KindDto kindDto = new KindDto("OBJECTREF", 0, "objectRef");
            OBJECTREF = kindDto;
            KindDto[] kindDtoArr = {kindDto};
            $VALUES = kindDtoArr;
            $ENTRIES = new asp(kindDtoArr);
            CREATOR = new a();
        }

        private KindDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static KindDto valueOf(String str) {
            return (KindDto) Enum.valueOf(KindDto.class, str);
        }

        public static KindDto[] values() {
            return (KindDto[]) $VALUES.clone();
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

    /* compiled from: AtumRepositoryObjectReferenceDto.kt */
    public static final class a implements Parcelable.Creator<AtumRepositoryObjectReferenceDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryObjectReferenceDto createFromParcel(Parcel parcel) {
            return new AtumRepositoryObjectReferenceDto(KindDto.CREATOR.createFromParcel(parcel), AtumRecordIdDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryObjectReferenceDto[] newArray(int i) {
            return new AtumRepositoryObjectReferenceDto[i];
        }
    }

    public AtumRepositoryObjectReferenceDto(KindDto kindDto, AtumRecordIdDto atumRecordIdDto, String str, String str2) {
        this.kind = kindDto;
        this.recordId = atumRecordIdDto;
        this.prop = str;
        this.dsl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumRepositoryObjectReferenceDto)) {
            return false;
        }
        AtumRepositoryObjectReferenceDto atumRepositoryObjectReferenceDto = (AtumRepositoryObjectReferenceDto) obj;
        return this.kind == atumRepositoryObjectReferenceDto.kind && epx.f(this.recordId, atumRepositoryObjectReferenceDto.recordId) && epx.f(this.prop, atumRepositoryObjectReferenceDto.prop) && epx.f(this.dsl, atumRepositoryObjectReferenceDto.dsl);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.recordId.hashCode() + (this.kind.hashCode() * 31)) * 31, 31, this.prop);
        String str = this.dsl;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumRepositoryObjectReferenceDto(kind=");
        sb.append(this.kind);
        sb.append(", recordId=");
        sb.append(this.recordId);
        sb.append(", prop=");
        sb.append(this.prop);
        sb.append(", dsl=");
        return ho8.a(sb, this.dsl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.kind.writeToParcel(parcel, i);
        this.recordId.writeToParcel(parcel, i);
        parcel.writeString(this.prop);
        parcel.writeString(this.dsl);
    }

    public /* synthetic */ AtumRepositoryObjectReferenceDto(KindDto kindDto, AtumRecordIdDto atumRecordIdDto, String str, String str2, int i, zcl zclVar) {
        this(kindDto, atumRecordIdDto, str, (i & 8) != 0 ? null : str2);
    }
}
