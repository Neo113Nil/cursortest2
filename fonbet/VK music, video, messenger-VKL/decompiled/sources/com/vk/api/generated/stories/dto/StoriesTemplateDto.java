package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StoriesTemplateDto.kt */
/* loaded from: classes15.dex */
public final class StoriesTemplateDto implements Parcelable {
    public static final Parcelable.Creator<StoriesTemplateDto> CREATOR = new a();

    @pmi0("authors_count")
    private final int authorsCount;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("preview")
    private final StoriesTemplatePreviewDto preview;

    @pmi0("stories_count")
    private final int storiesCount;

    @pmi0("story_box")
    private final String storyBox;

    @pmi0("storybox_url")
    private final String storyboxUrl;

    @pmi0("template_id")
    private final int templateId;

    @pmi0("title")
    private final String title;

    /* compiled from: StoriesTemplateDto.kt */
    public static final class a implements Parcelable.Creator<StoriesTemplateDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesTemplateDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            StoriesTemplatePreviewDto createFromParcel = StoriesTemplatePreviewDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesTemplateDto(readInt, createFromParcel, readString, readString2, readInt2, readInt3, readString3, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesTemplateDto[] newArray(int i) {
            return new StoriesTemplateDto[i];
        }
    }

    public StoriesTemplateDto(int i, StoriesTemplatePreviewDto storiesTemplatePreviewDto, String str, String str2, int i2, int i3, String str3, Boolean bool) {
        this.templateId = i;
        this.preview = storiesTemplatePreviewDto;
        this.storyboxUrl = str;
        this.storyBox = str2;
        this.authorsCount = i2;
        this.storiesCount = i3;
        this.title = str3;
        this.isNew = bool;
    }

    public final StoriesTemplatePreviewDto d() {
        return this.preview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.storiesCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesTemplateDto)) {
            return false;
        }
        StoriesTemplateDto storiesTemplateDto = (StoriesTemplateDto) obj;
        return this.templateId == storiesTemplateDto.templateId && epx.f(this.preview, storiesTemplateDto.preview) && epx.f(this.storyboxUrl, storiesTemplateDto.storyboxUrl) && epx.f(this.storyBox, storiesTemplateDto.storyBox) && this.authorsCount == storiesTemplateDto.authorsCount && this.storiesCount == storiesTemplateDto.storiesCount && epx.f(this.title, storiesTemplateDto.title) && epx.f(this.isNew, storiesTemplateDto.isNew);
    }

    public final String f() {
        return this.storyBox;
    }

    public final int g() {
        return this.templateId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.storiesCount, shy.a(this.authorsCount, urd0.a(urd0.a((this.preview.hashCode() + (Integer.hashCode(this.templateId) * 31)) * 31, 31, this.storyboxUrl), 31, this.storyBox), 31), 31);
        String str = this.title;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isNew;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isNew;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesTemplateDto(templateId=");
        sb.append(this.templateId);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", storyboxUrl=");
        sb.append(this.storyboxUrl);
        sb.append(", storyBox=");
        sb.append(this.storyBox);
        sb.append(", authorsCount=");
        sb.append(this.authorsCount);
        sb.append(", storiesCount=");
        sb.append(this.storiesCount);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isNew=");
        return tn.a(sb, this.isNew, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.templateId);
        this.preview.writeToParcel(parcel, i);
        parcel.writeString(this.storyboxUrl);
        parcel.writeString(this.storyBox);
        parcel.writeInt(this.authorsCount);
        parcel.writeInt(this.storiesCount);
        parcel.writeString(this.title);
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ StoriesTemplateDto(int i, StoriesTemplatePreviewDto storiesTemplatePreviewDto, String str, String str2, int i2, int i3, String str3, Boolean bool, int i4, zcl zclVar) {
        this(i, storiesTemplatePreviewDto, str, str2, i2, i3, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : bool);
    }
}
