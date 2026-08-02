package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ActionLinksActionSnippetStyleDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksActionSnippetStyleDto implements Parcelable {
    public static final Parcelable.Creator<ActionLinksActionSnippetStyleDto> CREATOR = new a();

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("text_color")
    private final String textColor;

    /* compiled from: ActionLinksActionSnippetStyleDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksActionSnippetStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksActionSnippetStyleDto createFromParcel(Parcel parcel) {
            return new ActionLinksActionSnippetStyleDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksActionSnippetStyleDto[] newArray(int i) {
            return new ActionLinksActionSnippetStyleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionLinksActionSnippetStyleDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.backgroundColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.textColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLinksActionSnippetStyleDto)) {
            return false;
        }
        ActionLinksActionSnippetStyleDto actionLinksActionSnippetStyleDto = (ActionLinksActionSnippetStyleDto) obj;
        return epx.f(this.backgroundColor, actionLinksActionSnippetStyleDto.backgroundColor) && epx.f(this.textColor, actionLinksActionSnippetStyleDto.textColor);
    }

    public final int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionLinksActionSnippetStyleDto(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", textColor=");
        return ho8.a(sb, this.textColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.textColor);
    }

    public ActionLinksActionSnippetStyleDto(String str, String str2) {
        this.backgroundColor = str;
        this.textColor = str2;
    }

    public /* synthetic */ ActionLinksActionSnippetStyleDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
