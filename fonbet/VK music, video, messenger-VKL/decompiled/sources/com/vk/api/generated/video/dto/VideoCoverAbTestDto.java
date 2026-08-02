package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoCoverAbTestDto.kt */
/* loaded from: classes15.dex */
public final class VideoCoverAbTestDto implements Parcelable {
    public static final Parcelable.Creator<VideoCoverAbTestDto> CREATOR = new a();

    @pmi0("ended_at")
    private final Long endedAt;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<VideoCoverAbTestCoverDto> options;

    @pmi0("started_at")
    private final Long startedAt;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("test_id")
    private final long testId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCoverAbTestDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("draft")
        public static final StatusDto DRAFT;

        @pmi0(X3.i.g0)
        public static final StatusDto ENDED;
        private final String value;

        /* compiled from: VideoCoverAbTestDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("DRAFT", 0, "draft");
            DRAFT = statusDto;
            StatusDto statusDto2 = new StatusDto(SignalingProtocol.STATE_ACTIVE, 1, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = statusDto2;
            StatusDto statusDto3 = new StatusDto(SignalingProtocol.STATE_ENDED, 2, X3.i.g0);
            ENDED = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* compiled from: VideoCoverAbTestDto.kt */
    public static final class a implements Parcelable.Creator<VideoCoverAbTestDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoCoverAbTestDto createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            StatusDto createFromParcel = StatusDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoCoverAbTestCoverDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoCoverAbTestDto(readLong, createFromParcel, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCoverAbTestDto[] newArray(int i) {
            return new VideoCoverAbTestDto[i];
        }
    }

    public VideoCoverAbTestDto(long j, StatusDto statusDto, List<VideoCoverAbTestCoverDto> list, Long l, Long l2) {
        this.testId = j;
        this.status = statusDto;
        this.options = list;
        this.startedAt = l;
        this.endedAt = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCoverAbTestDto)) {
            return false;
        }
        VideoCoverAbTestDto videoCoverAbTestDto = (VideoCoverAbTestDto) obj;
        return this.testId == videoCoverAbTestDto.testId && this.status == videoCoverAbTestDto.status && epx.f(this.options, videoCoverAbTestDto.options) && epx.f(this.startedAt, videoCoverAbTestDto.startedAt) && epx.f(this.endedAt, videoCoverAbTestDto.endedAt);
    }

    public final int hashCode() {
        int a2 = fw3.a((this.status.hashCode() + (Long.hashCode(this.testId) * 31)) * 31, 31, this.options);
        Long l = this.startedAt;
        int hashCode = (a2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endedAt;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCoverAbTestDto(testId=");
        sb.append(this.testId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", startedAt=");
        sb.append(this.startedAt);
        sb.append(", endedAt=");
        return iq.b(sb, this.endedAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.testId);
        this.status.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.options);
        while (a2.hasNext()) {
            ((VideoCoverAbTestCoverDto) a2.next()).writeToParcel(parcel, i);
        }
        Long l = this.startedAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Long l2 = this.endedAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
    }

    public /* synthetic */ VideoCoverAbTestDto(long j, StatusDto statusDto, List list, Long l, Long l2, int i, zcl zclVar) {
        this(j, statusDto, list, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2);
    }
}
