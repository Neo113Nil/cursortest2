package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedDzenTextDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenTextDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenTextDto> CREATOR = new a();

    @pmi0(TtmlNode.BOLD)
    private final Boolean bold;

    @pmi0("text")
    private final String text;

    @pmi0("text_size")
    private final TextSizeDto textSize;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedDzenTextDto.kt */
    public static final class TextSizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TextSizeDto[] $VALUES;
        public static final Parcelable.Creator<TextSizeDto> CREATOR;

        @pmi0("large")
        public static final TextSizeDto LARGE;
        private final String value;

        /* compiled from: NewsfeedDzenTextDto.kt */
        public static final class a implements Parcelable.Creator<TextSizeDto> {
            @Override // android.os.Parcelable.Creator
            public final TextSizeDto createFromParcel(Parcel parcel) {
                return TextSizeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TextSizeDto[] newArray(int i) {
                return new TextSizeDto[i];
            }
        }

        static {
            TextSizeDto textSizeDto = new TextSizeDto("LARGE", 0, "large");
            LARGE = textSizeDto;
            TextSizeDto[] textSizeDtoArr = {textSizeDto};
            $VALUES = textSizeDtoArr;
            $ENTRIES = new asp(textSizeDtoArr);
            CREATOR = new a();
        }

        private TextSizeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TextSizeDto valueOf(String str) {
            return (TextSizeDto) Enum.valueOf(TextSizeDto.class, str);
        }

        public static TextSizeDto[] values() {
            return (TextSizeDto[]) $VALUES.clone();
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

    /* compiled from: NewsfeedDzenTextDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenTextDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenTextDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Boolean bool = null;
            TextSizeDto createFromParcel = parcel.readInt() == 0 ? null : TextSizeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedDzenTextDto(readString, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenTextDto[] newArray(int i) {
            return new NewsfeedDzenTextDto[i];
        }
    }

    public NewsfeedDzenTextDto(String str, TextSizeDto textSizeDto, Boolean bool) {
        this.text = str;
        this.textSize = textSizeDto;
        this.bold = bool;
    }

    public final Boolean d() {
        return this.bold;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenTextDto)) {
            return false;
        }
        NewsfeedDzenTextDto newsfeedDzenTextDto = (NewsfeedDzenTextDto) obj;
        return epx.f(this.text, newsfeedDzenTextDto.text) && this.textSize == newsfeedDzenTextDto.textSize && epx.f(this.bold, newsfeedDzenTextDto.bold);
    }

    public final TextSizeDto f() {
        return this.textSize;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        TextSizeDto textSizeDto = this.textSize;
        int hashCode2 = (hashCode + (textSizeDto == null ? 0 : textSizeDto.hashCode())) * 31;
        Boolean bool = this.bold;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedDzenTextDto(text=");
        sb.append(this.text);
        sb.append(", textSize=");
        sb.append(this.textSize);
        sb.append(", bold=");
        return tn.a(sb, this.bold, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        TextSizeDto textSizeDto = this.textSize;
        if (textSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textSizeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.bold;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ NewsfeedDzenTextDto(String str, TextSizeDto textSizeDto, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : textSizeDto, (i & 4) != 0 ? null : bool);
    }
}
