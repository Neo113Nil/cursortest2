package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoEditForbiddenReasonsDto.kt */
/* loaded from: classes15.dex */
public final class VideoEditForbiddenReasonsDto implements Parcelable {
    public static final Parcelable.Creator<VideoEditForbiddenReasonsDto> CREATOR = new a();

    @pmi0("code")
    private final CodeDto code;

    @pmi0("description")
    private final String description;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoEditForbiddenReasonsDto.kt */
    public static final class CodeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CodeDto[] $VALUES;

        @pmi0("ad")
        public static final CodeDto AD;
        public static final Parcelable.Creator<CodeDto> CREATOR;

        @pmi0(LoginRequest.CLIENT_NAME)
        public static final CodeDto TEST;
        private final String value;

        /* compiled from: VideoEditForbiddenReasonsDto.kt */
        public static final class a implements Parcelable.Creator<CodeDto> {
            @Override // android.os.Parcelable.Creator
            public final CodeDto createFromParcel(Parcel parcel) {
                return CodeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CodeDto[] newArray(int i) {
                return new CodeDto[i];
            }
        }

        static {
            CodeDto codeDto = new CodeDto("TEST", 0, LoginRequest.CLIENT_NAME);
            TEST = codeDto;
            CodeDto codeDto2 = new CodeDto("AD", 1, "ad");
            AD = codeDto2;
            CodeDto[] codeDtoArr = {codeDto, codeDto2};
            $VALUES = codeDtoArr;
            $ENTRIES = new asp(codeDtoArr);
            CREATOR = new a();
        }

        private CodeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CodeDto valueOf(String str) {
            return (CodeDto) Enum.valueOf(CodeDto.class, str);
        }

        public static CodeDto[] values() {
            return (CodeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VideoEditForbiddenReasonsDto.kt */
    public static final class a implements Parcelable.Creator<VideoEditForbiddenReasonsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoEditForbiddenReasonsDto createFromParcel(Parcel parcel) {
            return new VideoEditForbiddenReasonsDto(parcel.readInt() == 0 ? null : CodeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEditForbiddenReasonsDto[] newArray(int i) {
            return new VideoEditForbiddenReasonsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoEditForbiddenReasonsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final CodeDto d() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEditForbiddenReasonsDto)) {
            return false;
        }
        VideoEditForbiddenReasonsDto videoEditForbiddenReasonsDto = (VideoEditForbiddenReasonsDto) obj;
        return this.code == videoEditForbiddenReasonsDto.code && epx.f(this.description, videoEditForbiddenReasonsDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        CodeDto codeDto = this.code;
        int hashCode = (codeDto == null ? 0 : codeDto.hashCode()) * 31;
        String str = this.description;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEditForbiddenReasonsDto(code=");
        sb.append(this.code);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CodeDto codeDto = this.code;
        if (codeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            codeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
    }

    public VideoEditForbiddenReasonsDto(CodeDto codeDto, String str) {
        this.code = codeDto;
        this.description = str;
    }

    public /* synthetic */ VideoEditForbiddenReasonsDto(CodeDto codeDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : codeDto, (i & 2) != 0 ? null : str);
    }
}
