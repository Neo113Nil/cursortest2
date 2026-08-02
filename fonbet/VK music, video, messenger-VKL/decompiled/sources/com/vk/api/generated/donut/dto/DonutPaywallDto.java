package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutPaywallDto.kt */
/* loaded from: classes14.dex */
public final class DonutPaywallDto implements Parcelable {
    public static final Parcelable.Creator<DonutPaywallDto> CREATOR = new a();

    @pmi0("hint_text")
    private final String hintText;

    @pmi0("snippet")
    private final DonutPaywallSnippetDto snippet;

    @pmi0("text")
    private final String text;

    /* compiled from: DonutPaywallDto.kt */
    public static final class a implements Parcelable.Creator<DonutPaywallDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutPaywallDto createFromParcel(Parcel parcel) {
            return new DonutPaywallDto(parcel.readString(), DonutPaywallSnippetDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutPaywallDto[] newArray(int i) {
            return new DonutPaywallDto[i];
        }
    }

    public DonutPaywallDto(String str, DonutPaywallSnippetDto donutPaywallSnippetDto, String str2) {
        this.hintText = str;
        this.snippet = donutPaywallSnippetDto;
        this.text = str2;
    }

    public final String d() {
        return this.hintText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DonutPaywallSnippetDto e() {
        return this.snippet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutPaywallDto)) {
            return false;
        }
        DonutPaywallDto donutPaywallDto = (DonutPaywallDto) obj;
        return epx.f(this.hintText, donutPaywallDto.hintText) && epx.f(this.snippet, donutPaywallDto.snippet) && epx.f(this.text, donutPaywallDto.text);
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = (this.snippet.hashCode() + (this.hintText.hashCode() * 31)) * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutPaywallDto(hintText=");
        sb.append(this.hintText);
        sb.append(", snippet=");
        sb.append(this.snippet);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hintText);
        this.snippet.writeToParcel(parcel, i);
        parcel.writeString(this.text);
    }

    public /* synthetic */ DonutPaywallDto(String str, DonutPaywallSnippetDto donutPaywallSnippetDto, String str2, int i, zcl zclVar) {
        this(str, donutPaywallSnippetDto, (i & 4) != 0 ? null : str2);
    }
}
