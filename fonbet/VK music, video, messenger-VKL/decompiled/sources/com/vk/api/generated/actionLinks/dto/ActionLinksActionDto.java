package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ActionLinksActionDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksActionDto implements Parcelable {
    public static final Parcelable.Creator<ActionLinksActionDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("link_id")
    private final Integer linkId;

    @pmi0("snippet")
    private final ActionLinksActionSnippetDto snippet;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: ActionLinksActionDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksActionDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksActionDto createFromParcel(Parcel parcel) {
            return new ActionLinksActionDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ActionLinksActionSnippetDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksActionDto[] newArray(int i) {
            return new ActionLinksActionDto[i];
        }
    }

    public ActionLinksActionDto(String str, String str2, String str3, Integer num, ActionLinksActionSnippetDto actionLinksActionSnippetDto) {
        this.id = str;
        this.type = str2;
        this.url = str3;
        this.linkId = num;
        this.snippet = actionLinksActionSnippetDto;
    }

    public final Integer d() {
        return this.linkId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ActionLinksActionSnippetDto e() {
        return this.snippet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLinksActionDto)) {
            return false;
        }
        ActionLinksActionDto actionLinksActionDto = (ActionLinksActionDto) obj;
        return epx.f(this.id, actionLinksActionDto.id) && epx.f(this.type, actionLinksActionDto.type) && epx.f(this.url, actionLinksActionDto.url) && epx.f(this.linkId, actionLinksActionDto.linkId) && epx.f(this.snippet, actionLinksActionDto.snippet);
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.type), 31, this.url);
        Integer num = this.linkId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        ActionLinksActionSnippetDto actionLinksActionSnippetDto = this.snippet;
        return hashCode + (actionLinksActionSnippetDto != null ? actionLinksActionSnippetDto.hashCode() : 0);
    }

    public final String toString() {
        return "ActionLinksActionDto(id=" + this.id + ", type=" + this.type + ", url=" + this.url + ", linkId=" + this.linkId + ", snippet=" + this.snippet + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        parcel.writeString(this.url);
        Integer num = this.linkId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        ActionLinksActionSnippetDto actionLinksActionSnippetDto = this.snippet;
        if (actionLinksActionSnippetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionLinksActionSnippetDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ActionLinksActionDto(String str, String str2, String str3, Integer num, ActionLinksActionSnippetDto actionLinksActionSnippetDto, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : actionLinksActionSnippetDto);
    }
}
