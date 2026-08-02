package com.vk.api.generated.specials.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpecialsPopupDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsPopupDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsPopupDto> CREATOR = new a();

    @pmi0("animation")
    private final SpecialsAnimationDto animation;

    @pmi0(L2.g)
    private final SpecialsBackgroundDto background;

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("close_action")
    private final BaseLinkButtonActionDto closeAction;

    @pmi0(SignalingProtocol.KEY_PARTICIPANTS)
    private final SpecialsParticipantsDto participants;

    @pmi0("photo")
    private final SpecialsPhotoDto photo;

    @pmi0("terms")
    private final String terms;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: SpecialsPopupDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsPopupDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            SpecialsBackgroundDto createFromParcel = parcel.readInt() == 0 ? null : SpecialsBackgroundDto.CREATOR.createFromParcel(parcel);
            SpecialsAnimationDto createFromParcel2 = parcel.readInt() == 0 ? null : SpecialsAnimationDto.CREATOR.createFromParcel(parcel);
            SpecialsPhotoDto createFromParcel3 = parcel.readInt() == 0 ? null : SpecialsPhotoDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SpecialsPopupDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SpecialsPopupDto(readString, createFromParcel, createFromParcel2, createFromParcel3, readString2, readString3, arrayList, (BaseLinkButtonActionDto) parcel.readParcelable(SpecialsPopupDto.class.getClassLoader()), parcel.readInt() != 0 ? SpecialsParticipantsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsPopupDto[] newArray(int i) {
            return new SpecialsPopupDto[i];
        }
    }

    public SpecialsPopupDto(String str, SpecialsBackgroundDto specialsBackgroundDto, SpecialsAnimationDto specialsAnimationDto, SpecialsPhotoDto specialsPhotoDto, String str2, String str3, List<BaseLinkButtonDto> list, BaseLinkButtonActionDto baseLinkButtonActionDto, SpecialsParticipantsDto specialsParticipantsDto) {
        this.title = str;
        this.background = specialsBackgroundDto;
        this.animation = specialsAnimationDto;
        this.photo = specialsPhotoDto;
        this.text = str2;
        this.terms = str3;
        this.buttons = list;
        this.closeAction = baseLinkButtonActionDto;
        this.participants = specialsParticipantsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsPopupDto)) {
            return false;
        }
        SpecialsPopupDto specialsPopupDto = (SpecialsPopupDto) obj;
        return epx.f(this.title, specialsPopupDto.title) && epx.f(this.background, specialsPopupDto.background) && epx.f(this.animation, specialsPopupDto.animation) && epx.f(this.photo, specialsPopupDto.photo) && epx.f(this.text, specialsPopupDto.text) && epx.f(this.terms, specialsPopupDto.terms) && epx.f(this.buttons, specialsPopupDto.buttons) && epx.f(this.closeAction, specialsPopupDto.closeAction) && epx.f(this.participants, specialsPopupDto.participants);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        SpecialsBackgroundDto specialsBackgroundDto = this.background;
        int hashCode2 = (hashCode + (specialsBackgroundDto == null ? 0 : specialsBackgroundDto.hashCode())) * 31;
        SpecialsAnimationDto specialsAnimationDto = this.animation;
        int hashCode3 = (hashCode2 + (specialsAnimationDto == null ? 0 : specialsAnimationDto.hashCode())) * 31;
        SpecialsPhotoDto specialsPhotoDto = this.photo;
        int hashCode4 = (hashCode3 + (specialsPhotoDto == null ? 0 : specialsPhotoDto.hashCode())) * 31;
        String str = this.text;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.terms;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseLinkButtonDto> list = this.buttons;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.closeAction;
        int hashCode8 = (hashCode7 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        SpecialsParticipantsDto specialsParticipantsDto = this.participants;
        return hashCode8 + (specialsParticipantsDto != null ? specialsParticipantsDto.hashCode() : 0);
    }

    public final String toString() {
        return "SpecialsPopupDto(title=" + this.title + ", background=" + this.background + ", animation=" + this.animation + ", photo=" + this.photo + ", text=" + this.text + ", terms=" + this.terms + ", buttons=" + this.buttons + ", closeAction=" + this.closeAction + ", participants=" + this.participants + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        SpecialsBackgroundDto specialsBackgroundDto = this.background;
        if (specialsBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsBackgroundDto.writeToParcel(parcel, i);
        }
        SpecialsAnimationDto specialsAnimationDto = this.animation;
        if (specialsAnimationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsAnimationDto.writeToParcel(parcel, i);
        }
        SpecialsPhotoDto specialsPhotoDto = this.photo;
        if (specialsPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.text);
        parcel.writeString(this.terms);
        List<BaseLinkButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.closeAction, i);
        SpecialsParticipantsDto specialsParticipantsDto = this.participants;
        if (specialsParticipantsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsParticipantsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SpecialsPopupDto(String str, SpecialsBackgroundDto specialsBackgroundDto, SpecialsAnimationDto specialsAnimationDto, SpecialsPhotoDto specialsPhotoDto, String str2, String str3, List list, BaseLinkButtonActionDto baseLinkButtonActionDto, SpecialsParticipantsDto specialsParticipantsDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : specialsBackgroundDto, (i & 4) != 0 ? null : specialsAnimationDto, (i & 8) != 0 ? null : specialsPhotoDto, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : baseLinkButtonActionDto, (i & 256) != 0 ? null : specialsParticipantsDto);
    }
}
