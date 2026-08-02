package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: WallPostingRuleAttachmentDependenciesDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingRuleAttachmentDependenciesDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingRuleAttachmentDependenciesDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final String attachment;

    @pmi0("dependencies_attachments")
    private final List<String> dependenciesAttachments;

    @pmi0("error_message")
    private final String errorMessage;

    /* compiled from: WallPostingRuleAttachmentDependenciesDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingRuleAttachmentDependenciesDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleAttachmentDependenciesDto createFromParcel(Parcel parcel) {
            return new WallPostingRuleAttachmentDependenciesDto(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleAttachmentDependenciesDto[] newArray(int i) {
            return new WallPostingRuleAttachmentDependenciesDto[i];
        }
    }

    public WallPostingRuleAttachmentDependenciesDto(String str, List<String> list, String str2) {
        this.attachment = str;
        this.dependenciesAttachments = list;
        this.errorMessage = str2;
    }

    public final String d() {
        return this.attachment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.dependenciesAttachments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingRuleAttachmentDependenciesDto)) {
            return false;
        }
        WallPostingRuleAttachmentDependenciesDto wallPostingRuleAttachmentDependenciesDto = (WallPostingRuleAttachmentDependenciesDto) obj;
        return epx.f(this.attachment, wallPostingRuleAttachmentDependenciesDto.attachment) && epx.f(this.dependenciesAttachments, wallPostingRuleAttachmentDependenciesDto.dependenciesAttachments) && epx.f(this.errorMessage, wallPostingRuleAttachmentDependenciesDto.errorMessage);
    }

    public final String f() {
        return this.errorMessage;
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + fw3.a(this.attachment.hashCode() * 31, 31, this.dependenciesAttachments);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingRuleAttachmentDependenciesDto(attachment=");
        sb.append(this.attachment);
        sb.append(", dependenciesAttachments=");
        sb.append(this.dependenciesAttachments);
        sb.append(", errorMessage=");
        return ho8.a(sb, this.errorMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.attachment);
        parcel.writeStringList(this.dependenciesAttachments);
        parcel.writeString(this.errorMessage);
    }
}
