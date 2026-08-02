package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ClassifiedsProductChatSuggestDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsProductChatSuggestDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsProductChatSuggestDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("suggest_id")
    private final String suggestId;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: ClassifiedsProductChatSuggestDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsProductChatSuggestDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProductChatSuggestDto createFromParcel(Parcel parcel) {
            return new ClassifiedsProductChatSuggestDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProductChatSuggestDto[] newArray(int i) {
            return new ClassifiedsProductChatSuggestDto[i];
        }
    }

    public ClassifiedsProductChatSuggestDto(String str, String str2, String str3, String str4) {
        this.id = str;
        this.suggestId = str2;
        this.title = str3;
        this.text = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsProductChatSuggestDto)) {
            return false;
        }
        ClassifiedsProductChatSuggestDto classifiedsProductChatSuggestDto = (ClassifiedsProductChatSuggestDto) obj;
        return epx.f(this.id, classifiedsProductChatSuggestDto.id) && epx.f(this.suggestId, classifiedsProductChatSuggestDto.suggestId) && epx.f(this.title, classifiedsProductChatSuggestDto.title) && epx.f(this.text, classifiedsProductChatSuggestDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.suggestId), 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsProductChatSuggestDto(id=");
        sb.append(this.id);
        sb.append(", suggestId=");
        sb.append(this.suggestId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.suggestId);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
    }
}
