package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: WallPostingRuleAttachmentAnyDependencyDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingRuleAttachmentAnyDependencyDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingRuleAttachmentAnyDependencyDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final String attachment;

    @pmi0("dependencies")
    private final List<String> dependencies;

    @pmi0("error_message")
    private final String errorMessage;

    /* compiled from: WallPostingRuleAttachmentAnyDependencyDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingRuleAttachmentAnyDependencyDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleAttachmentAnyDependencyDto createFromParcel(Parcel parcel) {
            return new WallPostingRuleAttachmentAnyDependencyDto(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleAttachmentAnyDependencyDto[] newArray(int i) {
            return new WallPostingRuleAttachmentAnyDependencyDto[i];
        }
    }

    public WallPostingRuleAttachmentAnyDependencyDto(String str, List<String> list, String str2) {
        this.attachment = str;
        this.dependencies = list;
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
        return this.dependencies;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingRuleAttachmentAnyDependencyDto)) {
            return false;
        }
        WallPostingRuleAttachmentAnyDependencyDto wallPostingRuleAttachmentAnyDependencyDto = (WallPostingRuleAttachmentAnyDependencyDto) obj;
        return epx.f(this.attachment, wallPostingRuleAttachmentAnyDependencyDto.attachment) && epx.f(this.dependencies, wallPostingRuleAttachmentAnyDependencyDto.dependencies) && epx.f(this.errorMessage, wallPostingRuleAttachmentAnyDependencyDto.errorMessage);
    }

    public final String f() {
        return this.errorMessage;
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + fw3.a(this.attachment.hashCode() * 31, 31, this.dependencies);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingRuleAttachmentAnyDependencyDto(attachment=");
        sb.append(this.attachment);
        sb.append(", dependencies=");
        sb.append(this.dependencies);
        sb.append(", errorMessage=");
        return ho8.a(sb, this.errorMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.attachment);
        parcel.writeStringList(this.dependencies);
        parcel.writeString(this.errorMessage);
    }
}
