package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<String> attachments;

    @pmi0("error_message")
    private final String errorMessage;

    @pmi0("error_popup")
    private final WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto errorPopup;

    @pmi0(X3.a.t)
    private final ModeDto mode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.kt */
    public static final class ModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ModeDto[] $VALUES;

        @pmi0("carousel")
        public static final ModeDto CAROUSEL;
        public static final Parcelable.Creator<ModeDto> CREATOR;

        @pmi0("grid")
        public static final ModeDto GRID;
        private final String value;

        /* compiled from: WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.kt */
        public static final class a implements Parcelable.Creator<ModeDto> {
            @Override // android.os.Parcelable.Creator
            public final ModeDto createFromParcel(Parcel parcel) {
                return ModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModeDto[] newArray(int i) {
                return new ModeDto[i];
            }
        }

        static {
            ModeDto modeDto = new ModeDto(SignalingProtocol.KEY_GRID, 0, "grid");
            GRID = modeDto;
            ModeDto modeDto2 = new ModeDto("CAROUSEL", 1, "carousel");
            CAROUSEL = modeDto2;
            ModeDto[] modeDtoArr = {modeDto, modeDto2};
            $VALUES = modeDtoArr;
            $ENTRIES = new asp(modeDtoArr);
            CREATOR = new a();
        }

        private ModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ModeDto valueOf(String str) {
            return (ModeDto) Enum.valueOf(ModeDto.class, str);
        }

        public static ModeDto[] values() {
            return (ModeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto createFromParcel(Parcel parcel) {
            return new WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto(ModeDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto[] newArray(int i) {
            return new WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto[i];
        }
    }

    public WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto(ModeDto modeDto, List<String> list, WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto, String str) {
        this.mode = modeDto;
        this.attachments = list;
        this.errorPopup = wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto;
        this.errorMessage = str;
    }

    public final List<String> d() {
        return this.attachments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto)) {
            return false;
        }
        WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto = (WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto) obj;
        return this.mode == wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.mode && epx.f(this.attachments, wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.attachments) && epx.f(this.errorPopup, wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.errorPopup) && epx.f(this.errorMessage, wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.errorMessage);
    }

    public final WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto f() {
        return this.errorPopup;
    }

    public final ModeDto g() {
        return this.mode;
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + ((this.errorPopup.hashCode() + fw3.a(this.mode.hashCode() * 31, 31, this.attachments)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto(mode=");
        sb.append(this.mode);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", errorPopup=");
        sb.append(this.errorPopup);
        sb.append(", errorMessage=");
        return ho8.a(sb, this.errorMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.mode.writeToParcel(parcel, i);
        parcel.writeStringList(this.attachments);
        this.errorPopup.writeToParcel(parcel, i);
        parcel.writeString(this.errorMessage);
    }
}
