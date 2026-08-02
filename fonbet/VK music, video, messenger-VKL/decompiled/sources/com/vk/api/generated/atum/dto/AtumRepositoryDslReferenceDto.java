package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AtumRepositoryDslReferenceDto.kt */
/* loaded from: classes14.dex */
public final class AtumRepositoryDslReferenceDto implements Parcelable {
    public static final Parcelable.Creator<AtumRepositoryDslReferenceDto> CREATOR = new a();

    @pmi0("dsl")
    private final String dsl;

    @pmi0(RTCStatsConstants.KEY_KIND)
    private final KindDto kind;

    @pmi0("objects")
    private final List<AtumRepositoryDslReferenceObjectDto> objects;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumRepositoryDslReferenceDto.kt */
    public static final class KindDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ KindDto[] $VALUES;
        public static final Parcelable.Creator<KindDto> CREATOR;

        @pmi0("dsl")
        public static final KindDto DSL;
        private final String value;

        /* compiled from: AtumRepositoryDslReferenceDto.kt */
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
            KindDto kindDto = new KindDto("DSL", 0, "dsl");
            DSL = kindDto;
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

    /* compiled from: AtumRepositoryDslReferenceDto.kt */
    public static final class a implements Parcelable.Creator<AtumRepositoryDslReferenceDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryDslReferenceDto createFromParcel(Parcel parcel) {
            KindDto createFromParcel = KindDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AtumRepositoryDslReferenceObjectDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AtumRepositoryDslReferenceDto(createFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryDslReferenceDto[] newArray(int i) {
            return new AtumRepositoryDslReferenceDto[i];
        }
    }

    public AtumRepositoryDslReferenceDto(KindDto kindDto, List<AtumRepositoryDslReferenceObjectDto> list, String str) {
        this.kind = kindDto;
        this.objects = list;
        this.dsl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumRepositoryDslReferenceDto)) {
            return false;
        }
        AtumRepositoryDslReferenceDto atumRepositoryDslReferenceDto = (AtumRepositoryDslReferenceDto) obj;
        return this.kind == atumRepositoryDslReferenceDto.kind && epx.f(this.objects, atumRepositoryDslReferenceDto.objects) && epx.f(this.dsl, atumRepositoryDslReferenceDto.dsl);
    }

    public final int hashCode() {
        return this.dsl.hashCode() + fw3.a(this.kind.hashCode() * 31, 31, this.objects);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumRepositoryDslReferenceDto(kind=");
        sb.append(this.kind);
        sb.append(", objects=");
        sb.append(this.objects);
        sb.append(", dsl=");
        return ho8.a(sb, this.dsl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.kind.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.objects);
        while (a2.hasNext()) {
            ((AtumRepositoryDslReferenceObjectDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.dsl);
    }
}
