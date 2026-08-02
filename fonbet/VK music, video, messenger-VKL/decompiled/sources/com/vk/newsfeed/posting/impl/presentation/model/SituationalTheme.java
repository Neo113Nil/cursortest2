package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.id.UserId;
import xsna.epx;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class SituationalTheme implements Parcelable, PostingAttachment {
    public static final Parcelable.Creator<SituationalTheme> CREATOR = new a();
    public final int b;
    public final Attachment c;
    public final UserId d = UserId.d;
    public final AttachmentType e = AttachmentType.SITUATIONAL_THEME;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<SituationalTheme> {
        @Override // android.os.Parcelable.Creator
        public final SituationalTheme createFromParcel(Parcel parcel) {
            return new SituationalTheme(parcel.readInt(), (Attachment) parcel.readParcelable(SituationalTheme.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SituationalTheme[] newArray(int i) {
            return new SituationalTheme[i];
        }
    }

    public SituationalTheme(int i, Attachment attachment) {
        this.b = i;
        this.c = attachment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SituationalTheme)) {
            return false;
        }
        SituationalTheme situationalTheme = (SituationalTheme) obj;
        return this.b == situationalTheme.b && epx.f(this.c, situationalTheme.c);
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final int getId() {
        return this.b;
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final AttachmentType getType() {
        return this.e;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final Attachment nb() {
        return this.c;
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final UserId q() {
        return this.d;
    }

    public final String toString() {
        return "SituationalTheme(id=" + this.b + ", attachment=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
