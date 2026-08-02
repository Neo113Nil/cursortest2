package com.vk.newsfeed.posting.impl.domain.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Attachment;

/* compiled from: WallParseAttachedLinksV2.kt */
/* loaded from: classes4.dex */
public final class ParsedAttachment implements Parcelable {
    public static final Parcelable.Creator<ParsedAttachment> CREATOR = new a();
    public final Attachment b;
    public final String c;

    /* compiled from: WallParseAttachedLinksV2.kt */
    public static final class a implements Parcelable.Creator<ParsedAttachment> {
        @Override // android.os.Parcelable.Creator
        public final ParsedAttachment createFromParcel(Parcel parcel) {
            return new ParsedAttachment((Attachment) parcel.readParcelable(ParsedAttachment.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ParsedAttachment[] newArray(int i) {
            return new ParsedAttachment[i];
        }
    }

    public ParsedAttachment(Attachment attachment, String str) {
        this.b = attachment;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
