package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesConfigItemDownloadProfilerSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConfigItemDownloadProfilerSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConfigItemDownloadProfilerSettingsDto> CREATOR = new a();

    @pmi0("error_probability")
    private final Float errorProbability;

    @pmi0("pattern")
    private final String pattern;

    @pmi0("probability")
    private final float probability;

    @pmi0("type")
    private final String type;

    /* compiled from: MessagesConfigItemDownloadProfilerSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConfigItemDownloadProfilerSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConfigItemDownloadProfilerSettingsDto createFromParcel(Parcel parcel) {
            return new MessagesConfigItemDownloadProfilerSettingsDto(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConfigItemDownloadProfilerSettingsDto[] newArray(int i) {
            return new MessagesConfigItemDownloadProfilerSettingsDto[i];
        }
    }

    public MessagesConfigItemDownloadProfilerSettingsDto(String str, String str2, float f, Float f2) {
        this.type = str;
        this.pattern = str2;
        this.probability = f;
        this.errorProbability = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConfigItemDownloadProfilerSettingsDto)) {
            return false;
        }
        MessagesConfigItemDownloadProfilerSettingsDto messagesConfigItemDownloadProfilerSettingsDto = (MessagesConfigItemDownloadProfilerSettingsDto) obj;
        return epx.f(this.type, messagesConfigItemDownloadProfilerSettingsDto.type) && epx.f(this.pattern, messagesConfigItemDownloadProfilerSettingsDto.pattern) && Float.compare(this.probability, messagesConfigItemDownloadProfilerSettingsDto.probability) == 0 && epx.f(this.errorProbability, messagesConfigItemDownloadProfilerSettingsDto.errorProbability);
    }

    public final int hashCode() {
        int a2 = b.a(this.probability, urd0.a(this.type.hashCode() * 31, 31, this.pattern), 31);
        Float f = this.errorProbability;
        return a2 + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConfigItemDownloadProfilerSettingsDto(type=");
        sb.append(this.type);
        sb.append(", pattern=");
        sb.append(this.pattern);
        sb.append(", probability=");
        sb.append(this.probability);
        sb.append(", errorProbability=");
        return so.b(sb, this.errorProbability, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.pattern);
        parcel.writeFloat(this.probability);
        Float f = this.errorProbability;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }

    public /* synthetic */ MessagesConfigItemDownloadProfilerSettingsDto(String str, String str2, float f, Float f2, int i, zcl zclVar) {
        this(str, str2, f, (i & 8) != 0 ? null : f2);
    }
}
