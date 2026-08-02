package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioBooksItemPersonDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksItemPersonDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksItemPersonDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("flags_context")
    private final Integer flagsContext;

    @pmi0("id")
    private final int id;

    @pmi0("legal_notice")
    private final AudioBooksLegalNoticeDto legalNotice;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0(SignalingProtocol.KEY_ROLES)
    private final List<AudioBooksItemPersonRoleDto> roles;

    /* compiled from: AudioBooksItemPersonDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksItemPersonDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksItemPersonDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(AudioBooksItemPersonDto.class, parcel, arrayList2, i2, 1);
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(AudioBooksItemPersonRoleDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new AudioBooksItemPersonDto(readInt, readString, arrayList2, readString2, arrayList, parcel.readInt() == 0 ? null : AudioBooksLegalNoticeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksItemPersonDto[] newArray(int i) {
            return new AudioBooksItemPersonDto[i];
        }
    }

    public AudioBooksItemPersonDto(int i, String str, List<BaseImageDto> list, String str2, List<AudioBooksItemPersonRoleDto> list2, AudioBooksLegalNoticeDto audioBooksLegalNoticeDto, Integer num) {
        this.id = i;
        this.name = str;
        this.photo = list;
        this.description = str2;
        this.roles = list2;
        this.legalNotice = audioBooksLegalNoticeDto;
        this.flagsContext = num;
    }

    public final Integer d() {
        return this.flagsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBooksItemPersonDto)) {
            return false;
        }
        AudioBooksItemPersonDto audioBooksItemPersonDto = (AudioBooksItemPersonDto) obj;
        return this.id == audioBooksItemPersonDto.id && epx.f(this.name, audioBooksItemPersonDto.name) && epx.f(this.photo, audioBooksItemPersonDto.photo) && epx.f(this.description, audioBooksItemPersonDto.description) && epx.f(this.roles, audioBooksItemPersonDto.roles) && epx.f(this.legalNotice, audioBooksItemPersonDto.legalNotice) && epx.f(this.flagsContext, audioBooksItemPersonDto.flagsContext);
    }

    public final List<BaseImageDto> f() {
        return this.photo;
    }

    public final List<AudioBooksItemPersonRoleDto> g() {
        return this.roles;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.photo);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<AudioBooksItemPersonRoleDto> list = this.roles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        AudioBooksLegalNoticeDto audioBooksLegalNoticeDto = this.legalNotice;
        int hashCode3 = (hashCode2 + (audioBooksLegalNoticeDto == null ? 0 : audioBooksLegalNoticeDto.hashCode())) * 31;
        Integer num = this.flagsContext;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksItemPersonDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", roles=");
        sb.append(this.roles);
        sb.append(", legalNotice=");
        sb.append(this.legalNotice);
        sb.append(", flagsContext=");
        return uqi.b(sb, this.flagsContext, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.photo);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.description);
        List<AudioBooksItemPersonRoleDto> list = this.roles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AudioBooksItemPersonRoleDto) f.next()).writeToParcel(parcel, i);
            }
        }
        AudioBooksLegalNoticeDto audioBooksLegalNoticeDto = this.legalNotice;
        if (audioBooksLegalNoticeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioBooksLegalNoticeDto.writeToParcel(parcel, i);
        }
        Integer num = this.flagsContext;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AudioBooksItemPersonDto(int i, String str, List list, String str2, List list2, AudioBooksLegalNoticeDto audioBooksLegalNoticeDto, Integer num, int i2, zcl zclVar) {
        this(i, str, list, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : audioBooksLegalNoticeDto, (i2 & 64) != 0 ? null : num);
    }
}
