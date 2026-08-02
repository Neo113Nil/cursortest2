package com.vk.api.generated.narratives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NarrativesNarrativeDto.kt */
/* loaded from: classes15.dex */
public final class NarrativesNarrativeDto implements Parcelable {
    public static final Parcelable.Creator<NarrativesNarrativeDto> CREATOR = new a();

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_see")
    private final boolean canSee;

    @pmi0("cover")
    private final NarrativesCoverDto cover;

    @pmi0("id")
    private final int id;

    @pmi0("is_delete")
    private final boolean isDelete;

    @pmi0("is_favorite")
    private final boolean isFavorite;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("seen")
    private final boolean seen;

    @pmi0("stories")
    private final List<StoriesStoryDto> stories;

    @pmi0("story_ids")
    private final List<Integer> storyIds;

    @pmi0("title")
    private final String title;

    @pmi0("views")
    private final int views;

    /* compiled from: NarrativesNarrativeDto.kt */
    public static final class a implements Parcelable.Creator<NarrativesNarrativeDto> {
        @Override // android.os.Parcelable.Creator
        public final NarrativesNarrativeDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            UserId userId = (UserId) parcel.readParcelable(NarrativesNarrativeDto.class.getClassLoader());
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            NarrativesCoverDto createFromParcel = parcel.readInt() == 0 ? null : NarrativesCoverDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i2 = 0;
                while (i2 != readInt4) {
                    i2 = en.a(StoriesStoryDto.CREATOR, parcel, arrayList2, i2, 1);
                    readInt4 = readInt4;
                }
            }
            return new NarrativesNarrativeDto(z, z2, readInt, z3, z4, userId, readString, readInt2, valueOf, createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final NarrativesNarrativeDto[] newArray(int i) {
            return new NarrativesNarrativeDto[i];
        }
    }

    public NarrativesNarrativeDto(boolean z, boolean z2, int i, boolean z3, boolean z4, UserId userId, String str, int i2, Boolean bool, NarrativesCoverDto narrativesCoverDto, List<Integer> list, List<StoriesStoryDto> list2) {
        this.canSee = z;
        this.seen = z2;
        this.id = i;
        this.isDelete = z3;
        this.isFavorite = z4;
        this.ownerId = userId;
        this.title = str;
        this.views = i2;
        this.canDelete = bool;
        this.cover = narrativesCoverDto;
        this.storyIds = list;
        this.stories = list2;
    }

    public final Boolean d() {
        return this.canDelete;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.canSee;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NarrativesNarrativeDto)) {
            return false;
        }
        NarrativesNarrativeDto narrativesNarrativeDto = (NarrativesNarrativeDto) obj;
        return this.canSee == narrativesNarrativeDto.canSee && this.seen == narrativesNarrativeDto.seen && this.id == narrativesNarrativeDto.id && this.isDelete == narrativesNarrativeDto.isDelete && this.isFavorite == narrativesNarrativeDto.isFavorite && epx.f(this.ownerId, narrativesNarrativeDto.ownerId) && epx.f(this.title, narrativesNarrativeDto.title) && this.views == narrativesNarrativeDto.views && epx.f(this.canDelete, narrativesNarrativeDto.canDelete) && epx.f(this.cover, narrativesNarrativeDto.cover) && epx.f(this.storyIds, narrativesNarrativeDto.storyIds) && epx.f(this.stories, narrativesNarrativeDto.stories);
    }

    public final NarrativesCoverDto f() {
        return this.cover;
    }

    public final List<StoriesStoryDto> g() {
        return this.stories;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.views, urd0.a(bh10.a(qoy.b(qoy.b(shy.a(this.id, qoy.b(Boolean.hashCode(this.canSee) * 31, 31, this.seen), 31), 31, this.isDelete), 31, this.isFavorite), 31, this.ownerId.b), 31, this.title), 31);
        Boolean bool = this.canDelete;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        NarrativesCoverDto narrativesCoverDto = this.cover;
        int hashCode2 = (hashCode + (narrativesCoverDto == null ? 0 : narrativesCoverDto.hashCode())) * 31;
        List<Integer> list = this.storyIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<StoriesStoryDto> list2 = this.stories;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final List<Integer> i() {
        return this.storyIds;
    }

    public final boolean j() {
        return this.isDelete;
    }

    public final boolean k() {
        return this.isFavorite;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NarrativesNarrativeDto(canSee=");
        sb.append(this.canSee);
        sb.append(", seen=");
        sb.append(this.seen);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isDelete=");
        sb.append(this.isDelete);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", views=");
        sb.append(this.views);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", storyIds=");
        sb.append(this.storyIds);
        sb.append(", stories=");
        return ms9.a(')', sb, this.stories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canSee ? 1 : 0);
        parcel.writeInt(this.seen ? 1 : 0);
        parcel.writeInt(this.id);
        parcel.writeInt(this.isDelete ? 1 : 0);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeInt(this.views);
        Boolean bool = this.canDelete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        NarrativesCoverDto narrativesCoverDto = this.cover;
        if (narrativesCoverDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            narrativesCoverDto.writeToParcel(parcel, i);
        }
        List<Integer> list = this.storyIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        List<StoriesStoryDto> list2 = this.stories;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((StoriesStoryDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NarrativesNarrativeDto(boolean z, boolean z2, int i, boolean z3, boolean z4, UserId userId, String str, int i2, Boolean bool, NarrativesCoverDto narrativesCoverDto, List list, List list2, int i3, zcl zclVar) {
        this(z, z2, i, z3, z4, userId, str, i2, (i3 & 256) != 0 ? null : bool, (i3 & 512) != 0 ? null : narrativesCoverDto, (i3 & 1024) != 0 ? null : list, (i3 & 2048) != 0 ? null : list2);
    }
}
