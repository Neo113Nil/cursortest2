package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsRequestItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsRequestItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsRequestItemDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("button")
    private final String button;

    @pmi0("date")
    private final Integer date;

    @pmi0("from")
    private final List<AppsRequestFromItemDto> from;

    @pmi0("from_id")
    private final Long fromId;

    @pmi0("id")
    private final Integer id;

    @pmi0("key")
    private final String key;

    @pmi0("name")
    private final String name;

    @pmi0("text")
    private final String text;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final String type;

    @pmi0("unread")
    private final UnreadDto unread;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsRequestItemDto.kt */
    public static final class UnreadDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnreadDto[] $VALUES;
        public static final Parcelable.Creator<UnreadDto> CREATOR;

        @pmi0("0")
        public static final UnreadDto READ;

        @pmi0("1")
        public static final UnreadDto UNREAD;
        private final int value;

        /* compiled from: AppsRequestItemDto.kt */
        public static final class a implements Parcelable.Creator<UnreadDto> {
            @Override // android.os.Parcelable.Creator
            public final UnreadDto createFromParcel(Parcel parcel) {
                return UnreadDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UnreadDto[] newArray(int i) {
                return new UnreadDto[i];
            }
        }

        static {
            UnreadDto unreadDto = new UnreadDto("READ", 0, 0);
            READ = unreadDto;
            UnreadDto unreadDto2 = new UnreadDto("UNREAD", 1, 1);
            UNREAD = unreadDto2;
            UnreadDto[] unreadDtoArr = {unreadDto, unreadDto2};
            $VALUES = unreadDtoArr;
            $ENTRIES = new asp(unreadDtoArr);
            CREATOR = new a();
        }

        private UnreadDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static UnreadDto valueOf(String str) {
            return (UnreadDto) Enum.valueOf(UnreadDto.class, str);
        }

        public static UnreadDto[] values() {
            return (UnreadDto[]) $VALUES.clone();
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

    /* compiled from: AppsRequestItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsRequestItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsRequestItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            UnreadDto createFromParcel = parcel.readInt() == 0 ? null : UnreadDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            Integer num = valueOf;
            Long l = valueOf2;
            Integer num2 = valueOf3;
            String readString4 = parcel.readString();
            ArrayList arrayList = null;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(AppsRequestFromItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsRequestItemDto(readString, readInt, readString2, createFromParcel, num, l, num2, readString3, readString4, readString5, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsRequestItemDto[] newArray(int i) {
            return new AppsRequestItemDto[i];
        }
    }

    public AppsRequestItemDto(String str, int i, String str2, UnreadDto unreadDto, Integer num, Long l, Integer num2, String str3, String str4, String str5, List<AppsRequestFromItemDto> list, String str6) {
        this.type = str;
        this.appId = i;
        this.text = str2;
        this.unread = unreadDto;
        this.id = num;
        this.fromId = l;
        this.date = num2;
        this.key = str3;
        this.button = str4;
        this.name = str5;
        this.from = list;
        this.trackCode = str6;
    }

    public final int d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsRequestItemDto)) {
            return false;
        }
        AppsRequestItemDto appsRequestItemDto = (AppsRequestItemDto) obj;
        return epx.f(this.type, appsRequestItemDto.type) && this.appId == appsRequestItemDto.appId && epx.f(this.text, appsRequestItemDto.text) && this.unread == appsRequestItemDto.unread && epx.f(this.id, appsRequestItemDto.id) && epx.f(this.fromId, appsRequestItemDto.fromId) && epx.f(this.date, appsRequestItemDto.date) && epx.f(this.key, appsRequestItemDto.key) && epx.f(this.button, appsRequestItemDto.button) && epx.f(this.name, appsRequestItemDto.name) && epx.f(this.from, appsRequestItemDto.from) && epx.f(this.trackCode, appsRequestItemDto.trackCode);
    }

    public final List<AppsRequestFromItemDto> f() {
        return this.from;
    }

    public final Long g() {
        return this.fromId;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = shy.a(this.appId, this.type.hashCode() * 31, 31);
        String str = this.text;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        UnreadDto unreadDto = this.unread;
        int hashCode2 = (hashCode + (unreadDto == null ? 0 : unreadDto.hashCode())) * 31;
        Integer num = this.id;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.fromId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.date;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.key;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.button;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<AppsRequestFromItemDto> list = this.from;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.trackCode;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Integer i() {
        return this.id;
    }

    public final String j() {
        return this.key;
    }

    public final String k() {
        return this.name;
    }

    public final String l() {
        return this.text;
    }

    public final UnreadDto n() {
        return this.unread;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsRequestItemDto(type=");
        sb.append(this.type);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", unread=");
        sb.append(this.unread);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeInt(this.appId);
        parcel.writeString(this.text);
        UnreadDto unreadDto = this.unread;
        if (unreadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            unreadDto.writeToParcel(parcel, i);
        }
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Long l = this.fromId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Integer num2 = this.date;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.key);
        parcel.writeString(this.button);
        parcel.writeString(this.name);
        List<AppsRequestFromItemDto> list = this.from;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsRequestFromItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ AppsRequestItemDto(String str, int i, String str2, UnreadDto unreadDto, Integer num, Long l, Integer num2, String str3, String str4, String str5, List list, String str6, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : unreadDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : l, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : list, (i2 & 2048) != 0 ? null : str6);
    }
}
