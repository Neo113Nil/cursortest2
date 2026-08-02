package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.k73;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AtumAnyObjectDto.kt */
/* loaded from: classes14.dex */
public final class AtumAnyObjectDto implements Parcelable {
    public static final Parcelable.Creator<AtumAnyObjectDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_KIND)
    private final KindDto kind;

    @pmi0("value")
    private final Object value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumAnyObjectDto.kt */
    public static final class KindDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ KindDto[] $VALUES;

        @pmi0("anyObject")
        public static final KindDto ANYOBJECT;
        public static final Parcelable.Creator<KindDto> CREATOR;
        private final String value;

        /* compiled from: AtumAnyObjectDto.kt */
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
            KindDto kindDto = new KindDto("ANYOBJECT", 0, "anyObject");
            ANYOBJECT = kindDto;
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

    /* compiled from: AtumAnyObjectDto.kt */
    public static final class a implements Parcelable.Creator<AtumAnyObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumAnyObjectDto createFromParcel(Parcel parcel) {
            return new AtumAnyObjectDto(KindDto.CREATOR.createFromParcel(parcel), parcel.readValue(AtumAnyObjectDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumAnyObjectDto[] newArray(int i) {
            return new AtumAnyObjectDto[i];
        }
    }

    public AtumAnyObjectDto(KindDto kindDto, Object obj) {
        this.kind = kindDto;
        this.value = obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumAnyObjectDto)) {
            return false;
        }
        AtumAnyObjectDto atumAnyObjectDto = (AtumAnyObjectDto) obj;
        return this.kind == atumAnyObjectDto.kind && epx.f(this.value, atumAnyObjectDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.kind.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumAnyObjectDto(kind=");
        sb.append(this.kind);
        sb.append(", value=");
        return k73.c(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.kind.writeToParcel(parcel, i);
        parcel.writeValue(this.value);
    }
}
