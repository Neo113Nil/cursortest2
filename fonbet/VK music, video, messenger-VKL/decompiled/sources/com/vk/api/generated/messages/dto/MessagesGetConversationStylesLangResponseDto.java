package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesGetConversationStylesLangResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetConversationStylesLangResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetConversationStylesLangResponseDto> CREATOR = new a();

    @pmi0("lang")
    private final String lang;

    @pmi0("not_changed")
    private final Boolean notChanged;

    @pmi0("styles")
    private final List<MessagesConversationStyleLangDto> styles;

    @pmi0("version_hash")
    private final String versionHash;

    /* compiled from: MessagesGetConversationStylesLangResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetConversationStylesLangResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationStylesLangResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesConversationStyleLangDto.CREATOR, parcel, arrayList, i, 1);
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesGetConversationStylesLangResponseDto(readString, arrayList, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationStylesLangResponseDto[] newArray(int i) {
            return new MessagesGetConversationStylesLangResponseDto[i];
        }
    }

    public MessagesGetConversationStylesLangResponseDto(String str, List<MessagesConversationStyleLangDto> list, String str2, Boolean bool) {
        this.lang = str;
        this.styles = list;
        this.versionHash = str2;
        this.notChanged = bool;
    }

    public final Boolean d() {
        return this.notChanged;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesConversationStyleLangDto> e() {
        return this.styles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetConversationStylesLangResponseDto)) {
            return false;
        }
        MessagesGetConversationStylesLangResponseDto messagesGetConversationStylesLangResponseDto = (MessagesGetConversationStylesLangResponseDto) obj;
        return epx.f(this.lang, messagesGetConversationStylesLangResponseDto.lang) && epx.f(this.styles, messagesGetConversationStylesLangResponseDto.styles) && epx.f(this.versionHash, messagesGetConversationStylesLangResponseDto.versionHash) && epx.f(this.notChanged, messagesGetConversationStylesLangResponseDto.notChanged);
    }

    public final String f() {
        return this.versionHash;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.lang.hashCode() * 31, 31, this.styles);
        String str = this.versionHash;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.notChanged;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetConversationStylesLangResponseDto(lang=");
        sb.append(this.lang);
        sb.append(", styles=");
        sb.append(this.styles);
        sb.append(", versionHash=");
        sb.append(this.versionHash);
        sb.append(", notChanged=");
        return tn.a(sb, this.notChanged, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.lang);
        Iterator a2 = ao.a(parcel, this.styles);
        while (a2.hasNext()) {
            ((MessagesConversationStyleLangDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.versionHash);
        Boolean bool = this.notChanged;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesGetConversationStylesLangResponseDto(String str, List list, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool);
    }
}
