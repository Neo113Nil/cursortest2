package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.donut.dto.DonutPostingSettingsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGetPostingSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetPostingSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetPostingSettingsResponseDto> CREATOR = new a();

    @pmi0("attachments")
    private final WallPostingSettingsAttachmentsDto attachments;

    @pmi0("current_user")
    private final WallPostingSettingsCurrentUserDto currentUser;

    @pmi0("donut")
    private final DonutPostingSettingsDto donut;

    @pmi0("post")
    private final WallPostingSettingsPostDto post;

    @pmi0("poster")
    private final WallPostingSettingsPosterDto poster;

    @pmi0("rules")
    private final List<WallPostingSettingsRuleDto> rules;

    @pmi0("voting")
    private final WallPostingSettingsVotingDto voting;

    @pmi0("wall")
    private final WallPostingSettingsWallDto wall;

    /* compiled from: WallGetPostingSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetPostingSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetPostingSettingsResponseDto createFromParcel(Parcel parcel) {
            WallPostingSettingsVotingDto createFromParcel = WallPostingSettingsVotingDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = null;
            WallPostingSettingsPosterDto createFromParcel2 = parcel.readInt() == 0 ? null : WallPostingSettingsPosterDto.CREATOR.createFromParcel(parcel);
            DonutPostingSettingsDto createFromParcel3 = parcel.readInt() == 0 ? null : DonutPostingSettingsDto.CREATOR.createFromParcel(parcel);
            WallPostingSettingsAttachmentsDto createFromParcel4 = parcel.readInt() == 0 ? null : WallPostingSettingsAttachmentsDto.CREATOR.createFromParcel(parcel);
            WallPostingSettingsPostDto createFromParcel5 = parcel.readInt() == 0 ? null : WallPostingSettingsPostDto.CREATOR.createFromParcel(parcel);
            WallPostingSettingsWallDto createFromParcel6 = parcel.readInt() == 0 ? null : WallPostingSettingsWallDto.CREATOR.createFromParcel(parcel);
            WallPostingSettingsCurrentUserDto createFromParcel7 = parcel.readInt() == 0 ? null : WallPostingSettingsCurrentUserDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(WallPostingSettingsRuleDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new WallGetPostingSettingsResponseDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetPostingSettingsResponseDto[] newArray(int i) {
            return new WallGetPostingSettingsResponseDto[i];
        }
    }

    public WallGetPostingSettingsResponseDto(WallPostingSettingsVotingDto wallPostingSettingsVotingDto, WallPostingSettingsPosterDto wallPostingSettingsPosterDto, DonutPostingSettingsDto donutPostingSettingsDto, WallPostingSettingsAttachmentsDto wallPostingSettingsAttachmentsDto, WallPostingSettingsPostDto wallPostingSettingsPostDto, WallPostingSettingsWallDto wallPostingSettingsWallDto, WallPostingSettingsCurrentUserDto wallPostingSettingsCurrentUserDto, List<WallPostingSettingsRuleDto> list) {
        this.voting = wallPostingSettingsVotingDto;
        this.poster = wallPostingSettingsPosterDto;
        this.donut = donutPostingSettingsDto;
        this.attachments = wallPostingSettingsAttachmentsDto;
        this.post = wallPostingSettingsPostDto;
        this.wall = wallPostingSettingsWallDto;
        this.currentUser = wallPostingSettingsCurrentUserDto;
        this.rules = list;
    }

    public final WallPostingSettingsAttachmentsDto d() {
        return this.attachments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WallPostingSettingsCurrentUserDto e() {
        return this.currentUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetPostingSettingsResponseDto)) {
            return false;
        }
        WallGetPostingSettingsResponseDto wallGetPostingSettingsResponseDto = (WallGetPostingSettingsResponseDto) obj;
        return epx.f(this.voting, wallGetPostingSettingsResponseDto.voting) && epx.f(this.poster, wallGetPostingSettingsResponseDto.poster) && epx.f(this.donut, wallGetPostingSettingsResponseDto.donut) && epx.f(this.attachments, wallGetPostingSettingsResponseDto.attachments) && epx.f(this.post, wallGetPostingSettingsResponseDto.post) && epx.f(this.wall, wallGetPostingSettingsResponseDto.wall) && epx.f(this.currentUser, wallGetPostingSettingsResponseDto.currentUser) && epx.f(this.rules, wallGetPostingSettingsResponseDto.rules);
    }

    public final DonutPostingSettingsDto f() {
        return this.donut;
    }

    public final WallPostingSettingsPostDto g() {
        return this.post;
    }

    public final int hashCode() {
        int hashCode = this.voting.hashCode() * 31;
        WallPostingSettingsPosterDto wallPostingSettingsPosterDto = this.poster;
        int hashCode2 = (hashCode + (wallPostingSettingsPosterDto == null ? 0 : wallPostingSettingsPosterDto.hashCode())) * 31;
        DonutPostingSettingsDto donutPostingSettingsDto = this.donut;
        int hashCode3 = (hashCode2 + (donutPostingSettingsDto == null ? 0 : donutPostingSettingsDto.hashCode())) * 31;
        WallPostingSettingsAttachmentsDto wallPostingSettingsAttachmentsDto = this.attachments;
        int hashCode4 = (hashCode3 + (wallPostingSettingsAttachmentsDto == null ? 0 : wallPostingSettingsAttachmentsDto.hashCode())) * 31;
        WallPostingSettingsPostDto wallPostingSettingsPostDto = this.post;
        int hashCode5 = (hashCode4 + (wallPostingSettingsPostDto == null ? 0 : wallPostingSettingsPostDto.hashCode())) * 31;
        WallPostingSettingsWallDto wallPostingSettingsWallDto = this.wall;
        int hashCode6 = (hashCode5 + (wallPostingSettingsWallDto == null ? 0 : wallPostingSettingsWallDto.hashCode())) * 31;
        WallPostingSettingsCurrentUserDto wallPostingSettingsCurrentUserDto = this.currentUser;
        int hashCode7 = (hashCode6 + (wallPostingSettingsCurrentUserDto == null ? 0 : wallPostingSettingsCurrentUserDto.hashCode())) * 31;
        List<WallPostingSettingsRuleDto> list = this.rules;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final List<WallPostingSettingsRuleDto> i() {
        return this.rules;
    }

    public final WallPostingSettingsVotingDto j() {
        return this.voting;
    }

    public final WallPostingSettingsWallDto k() {
        return this.wall;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGetPostingSettingsResponseDto(voting=");
        sb.append(this.voting);
        sb.append(", poster=");
        sb.append(this.poster);
        sb.append(", donut=");
        sb.append(this.donut);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", post=");
        sb.append(this.post);
        sb.append(", wall=");
        sb.append(this.wall);
        sb.append(", currentUser=");
        sb.append(this.currentUser);
        sb.append(", rules=");
        return ms9.a(')', sb, this.rules);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.voting.writeToParcel(parcel, i);
        WallPostingSettingsPosterDto wallPostingSettingsPosterDto = this.poster;
        if (wallPostingSettingsPosterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsPosterDto.writeToParcel(parcel, i);
        }
        DonutPostingSettingsDto donutPostingSettingsDto = this.donut;
        if (donutPostingSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutPostingSettingsDto.writeToParcel(parcel, i);
        }
        WallPostingSettingsAttachmentsDto wallPostingSettingsAttachmentsDto = this.attachments;
        if (wallPostingSettingsAttachmentsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsAttachmentsDto.writeToParcel(parcel, i);
        }
        WallPostingSettingsPostDto wallPostingSettingsPostDto = this.post;
        if (wallPostingSettingsPostDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsPostDto.writeToParcel(parcel, i);
        }
        WallPostingSettingsWallDto wallPostingSettingsWallDto = this.wall;
        if (wallPostingSettingsWallDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsWallDto.writeToParcel(parcel, i);
        }
        WallPostingSettingsCurrentUserDto wallPostingSettingsCurrentUserDto = this.currentUser;
        if (wallPostingSettingsCurrentUserDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsCurrentUserDto.writeToParcel(parcel, i);
        }
        List<WallPostingSettingsRuleDto> list = this.rules;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((WallPostingSettingsRuleDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallGetPostingSettingsResponseDto(WallPostingSettingsVotingDto wallPostingSettingsVotingDto, WallPostingSettingsPosterDto wallPostingSettingsPosterDto, DonutPostingSettingsDto donutPostingSettingsDto, WallPostingSettingsAttachmentsDto wallPostingSettingsAttachmentsDto, WallPostingSettingsPostDto wallPostingSettingsPostDto, WallPostingSettingsWallDto wallPostingSettingsWallDto, WallPostingSettingsCurrentUserDto wallPostingSettingsCurrentUserDto, List list, int i, zcl zclVar) {
        this(wallPostingSettingsVotingDto, (i & 2) != 0 ? null : wallPostingSettingsPosterDto, (i & 4) != 0 ? null : donutPostingSettingsDto, (i & 8) != 0 ? null : wallPostingSettingsAttachmentsDto, (i & 16) != 0 ? null : wallPostingSettingsPostDto, (i & 32) != 0 ? null : wallPostingSettingsWallDto, (i & 64) != 0 ? null : wallPostingSettingsCurrentUserDto, (i & 128) != 0 ? null : list);
    }
}
