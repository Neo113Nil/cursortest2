package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ArticlesMediascopeResearchEventDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesMediascopeResearchEventDto implements Parcelable {
    public static final Parcelable.Creator<ArticlesMediascopeResearchEventDto> CREATOR = new a();

    @pmi0("item_id")
    private final String itemId;

    @pmi0("source_id")
    private final Integer sourceId;

    /* compiled from: ArticlesMediascopeResearchEventDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesMediascopeResearchEventDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesMediascopeResearchEventDto createFromParcel(Parcel parcel) {
            return new ArticlesMediascopeResearchEventDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesMediascopeResearchEventDto[] newArray(int i) {
            return new ArticlesMediascopeResearchEventDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArticlesMediascopeResearchEventDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticlesMediascopeResearchEventDto)) {
            return false;
        }
        ArticlesMediascopeResearchEventDto articlesMediascopeResearchEventDto = (ArticlesMediascopeResearchEventDto) obj;
        return epx.f(this.sourceId, articlesMediascopeResearchEventDto.sourceId) && epx.f(this.itemId, articlesMediascopeResearchEventDto.itemId);
    }

    public final int hashCode() {
        Integer num = this.sourceId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.itemId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticlesMediascopeResearchEventDto(sourceId=");
        sb.append(this.sourceId);
        sb.append(", itemId=");
        return ho8.a(sb, this.itemId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.sourceId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.itemId);
    }

    public ArticlesMediascopeResearchEventDto(Integer num, String str) {
        this.sourceId = num;
        this.itemId = str;
    }

    public /* synthetic */ ArticlesMediascopeResearchEventDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
